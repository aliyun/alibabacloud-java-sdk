// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class FaceshifterTRequest extends TeaModel {
    @NameInMap("Age")
    public Integer age;

    @NameInMap("Gender")
    public Integer gender;

    @NameInMap("PicUrl")
    public String picUrl;

    @NameInMap("Race")
    public Integer race;

    public static FaceshifterTRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceshifterTRequest self = new FaceshifterTRequest();
        return TeaModel.build(map, self);
    }

    public FaceshifterTRequest setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Integer getAge() {
        return this.age;
    }

    public FaceshifterTRequest setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
    public Integer getGender() {
        return this.gender;
    }

    public FaceshifterTRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

    public FaceshifterTRequest setRace(Integer race) {
        this.race = race;
        return this;
    }
    public Integer getRace() {
        return this.race;
    }

}
