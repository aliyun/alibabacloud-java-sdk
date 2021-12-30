// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class FaceshifterTAdvanceRequest extends TeaModel {
    @NameInMap("PicUrlObject")
    @Validation(required = true)
    public java.io.InputStream picUrlObject;

    @NameInMap("Age")
    public Integer age;

    @NameInMap("Gender")
    public Integer gender;

    @NameInMap("Race")
    public Integer race;

    public static FaceshifterTAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceshifterTAdvanceRequest self = new FaceshifterTAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public FaceshifterTAdvanceRequest setPicUrlObject(java.io.InputStream picUrlObject) {
        this.picUrlObject = picUrlObject;
        return this;
    }
    public java.io.InputStream getPicUrlObject() {
        return this.picUrlObject;
    }

    public FaceshifterTAdvanceRequest setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Integer getAge() {
        return this.age;
    }

    public FaceshifterTAdvanceRequest setGender(Integer gender) {
        this.gender = gender;
        return this;
    }
    public Integer getGender() {
        return this.gender;
    }

    public FaceshifterTAdvanceRequest setRace(Integer race) {
        this.race = race;
        return this;
    }
    public Integer getRace() {
        return this.race;
    }

}
