// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageDataA")
    public byte[] imageDataA;

    @NameInMap("ImageDataB")
    public byte[] imageDataB;

    @NameInMap("ImageURLA")
    public java.io.InputStream imageURLAObject;

    @NameInMap("ImageURLB")
    public java.io.InputStream imageURLBObject;

    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    public static CompareFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceAdvanceRequest self = new CompareFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CompareFaceAdvanceRequest setImageDataA(byte[] imageDataA) {
        this.imageDataA = imageDataA;
        return this;
    }
    public byte[] getImageDataA() {
        return this.imageDataA;
    }

    public CompareFaceAdvanceRequest setImageDataB(byte[] imageDataB) {
        this.imageDataB = imageDataB;
        return this;
    }
    public byte[] getImageDataB() {
        return this.imageDataB;
    }

    public CompareFaceAdvanceRequest setImageURLAObject(java.io.InputStream imageURLAObject) {
        this.imageURLAObject = imageURLAObject;
        return this;
    }
    public java.io.InputStream getImageURLAObject() {
        return this.imageURLAObject;
    }

    public CompareFaceAdvanceRequest setImageURLBObject(java.io.InputStream imageURLBObject) {
        this.imageURLBObject = imageURLBObject;
        return this;
    }
    public java.io.InputStream getImageURLBObject() {
        return this.imageURLBObject;
    }

    public CompareFaceAdvanceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

}
