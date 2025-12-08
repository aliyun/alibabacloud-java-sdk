// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeFaceAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Age")
    public Boolean age;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Beauty")
    public Boolean beauty;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expression")
    public Boolean expression;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Gender")
    public Boolean gender;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Glass")
    public Boolean glass;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Hat")
    public Boolean hat;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/RecognizeFace/RecognizeFace1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/RecognizeFace/RecognizeFace1.png</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Mask")
    public Boolean mask;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxFaceNumber")
    public Long maxFaceNumber;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Quality")
    public Boolean quality;

    public static RecognizeFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceAdvanceRequest self = new RecognizeFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceAdvanceRequest setAge(Boolean age) {
        this.age = age;
        return this;
    }
    public Boolean getAge() {
        return this.age;
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

    public RecognizeFaceAdvanceRequest setGender(Boolean gender) {
        this.gender = gender;
        return this;
    }
    public Boolean getGender() {
        return this.gender;
    }

    public RecognizeFaceAdvanceRequest setGlass(Boolean glass) {
        this.glass = glass;
        return this;
    }
    public Boolean getGlass() {
        return this.glass;
    }

    public RecognizeFaceAdvanceRequest setHat(Boolean hat) {
        this.hat = hat;
        return this;
    }
    public Boolean getHat() {
        return this.hat;
    }

    public RecognizeFaceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RecognizeFaceAdvanceRequest setMask(Boolean mask) {
        this.mask = mask;
        return this;
    }
    public Boolean getMask() {
        return this.mask;
    }

    public RecognizeFaceAdvanceRequest setMaxFaceNumber(Long maxFaceNumber) {
        this.maxFaceNumber = maxFaceNumber;
        return this;
    }
    public Long getMaxFaceNumber() {
        return this.maxFaceNumber;
    }

    public RecognizeFaceAdvanceRequest setQuality(Boolean quality) {
        this.quality = quality;
        return this;
    }
    public Boolean getQuality() {
        return this.quality;
    }

}
