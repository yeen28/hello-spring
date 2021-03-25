package hello.hellospring.domain;

public class Member {

    // long : 64bit 정수값을 표현하는 데이터 타입으로 8byte의 메모리 공간을 사용
    // Long : long처럼 64bit 정수 값을 표현하지만 이것은 클래스
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
