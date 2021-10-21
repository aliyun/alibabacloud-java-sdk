// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("Age")
    public Boolean age;

    @NameInMap("Gender")
    public Boolean gender;

    @NameInMap("Hat")
    public Boolean hat;

    @NameInMap("Glass")
    public Boolean glass;

    @NameInMap("Beauty")
    public Boolean beauty;

    @NameInMap("Expression")
    public Boolean expression;

    @NameInMap("Mask")
    public Boolean mask;

    @NameInMap("Quality")
    public Boolean quality;

    @NameInMap("MaxFaceNumber")
    public Long maxFaceNumber;

    public static RecognizeFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceAdvanceRequest self = new RecognizeFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RecognizeFaceAdvanceRequest setAge(Boolean age) {
        this.age = age;
        return this;
    }
    public Boolean getAge() {
        return this.age;
    }

    public RecognizeFaceAdvanceRequest setGender(Boolean gender) {
        this.gender = gender;
        return this;
    }
    public Boolean getGender() {
        return this.gender;
    }

    public RecognizeFaceAdvanceRequest setHat(Boolean hat) {
        this.hat = hat;
        return this;
    }
    public Boolean getHat() {
        return this.hat;
    }

    public RecognizeFaceAdvanceRequest setGlass(Boolean glass) {
        this.glass = glass;
        return this;
    }
    public Boolean getGlass() {
        return this.glass;
    }

    public RecognizeFaceAdvanceRequest setBeauty(Boolean beauty) {
        this.beauty = beauty;
        return this;
    }
    public Boolean getBeauty() {
        return this.beauty;
    }

    public RecognizeFaceAdvanceRequest setExpression(Boolean expression) {
        this.expression = expression;
        return this;
    }
    public Boolean getExpression() {
        return this.expression;
    }

    public RecognizeFaceAdvanceRequest setMask(Boolean mask) {
        this.mask = mask;
        return this;
    }
    public Boolean getMask() {
        return this.mask;
    }

    public RecognizeFaceAdvanceRequest setQuality(Boolean quality) {
        this.quality = quality;
        return this;
    }
    public Boolean getQuality() {
        return this.quality;
    }

    public RecognizeFaceAdvanceRequest setMaxFaceNumber(Long maxFaceNumber) {
        this.maxFaceNumber = maxFaceNumber;
        return this;
    }
    public Long getMaxFaceNumber() {
        return this.maxFaceNumber;
    }

}
