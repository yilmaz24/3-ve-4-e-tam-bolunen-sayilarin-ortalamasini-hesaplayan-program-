package proje1;
import java.util.Scanner;

public class proje1_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number =input.nextInt();
        
        int sayilarToplami = 0;
        int sayiAdedi = 0;
        int ortalama;
        int i;
        
       
        for (i = 1; i < number; i++) {
            if((i % 3 == 0) && (i % 4 == 0)){
                sayilarToplami += i;
                sayiAdedi++;
                
                
            }
        }
        ortalama = sayilarToplami / sayiAdedi;
        System.out.print("Ortalama : " + ortalama + "\nToplam: " +sayilarToplami + "\nSayıadedi: " + sayiAdedi);
    }
}