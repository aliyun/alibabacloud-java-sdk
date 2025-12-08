// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeFaceRequest extends TeaModel {
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
    public String imageURL;

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

    public static RecognizeFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceRequest self = new RecognizeFaceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceRequest setAge(Boolean age) {
        this.age = age;
        return this;
    }
    public Boolean getAge() {
        return this.age;
    }

    public RecognizeFaceRequest setBeauty(Boolean beauty) {
        this.beauty = beauty;
        return this;
    }
    public Boolean getBeauty() {
        return this.beauty;
    }

    public RecognizeFaceRequest setExpression(Boolean expression) {
        this.expression = expression;
        return this;
    }
    public Boolean getExpression() {
        return this.expression;
    }

    public RecognizeFaceRequest setGender(Boolean gender) {
        this.gender = gender;
        return this;
    }
    public Boolean getGender() {
        return this.gender;
    }

    public RecognizeFaceRequest setGlass(Boolean glass) {
        this.glass = glass;
        return this;
    }
    public Boolean getGlass() {
        return this.glass;
    }

    public RecognizeFaceRequest setHat(Boolean hat) {
        this.hat = hat;
        return this;
    }
    public Boolean getHat() {
        return this.hat;
    }

    public RecognizeFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RecognizeFaceRequest setMask(Boolean mask) {
        this.mask = mask;
        return this;
    }
    public Boolean getMask() {
        return this.mask;
    }

    public RecognizeFaceRequest setMaxFaceNumber(Long maxFaceNumber) {
        this.maxFaceNumber = maxFaceNumber;
        return this;
    }
    public Long getMaxFaceNumber() {
        return this.maxFaceNumber;
    }

    public RecognizeFaceRequest setQuality(Boolean quality) {
        this.quality = quality;
        return this;
    }
    public Boolean getQuality() {
        return this.quality;
    }

}
