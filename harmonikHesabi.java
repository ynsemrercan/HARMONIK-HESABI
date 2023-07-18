import java.util.Scanner;

public class harmonikHesabi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int  num;
        double result=0.0;

        System.out.println("Bir Sayı Giriniz: ");
        num= input.nextInt();

        for(double i=1;i<=num;i++){

            result += (1/i);
        }


        System.out.println(result);


    }
}