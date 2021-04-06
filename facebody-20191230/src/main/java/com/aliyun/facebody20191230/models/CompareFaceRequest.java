// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceRequest extends TeaModel {
    // 质量分阈值，取值范围 [0.0, 100.0],   0.0或空  表示不做质量分判断逻辑。
    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    @NameInMap("ImageURLA")
    public String imageURLA;

    @NameInMap("ImageURLB")
    public String imageURLB;

    @NameInMap("ImageDataA")
    public byte[] imageDataA;

    @NameInMap("ImageDataB")
    public byte[] imageDataB;

    public static CompareFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceRequest self = new CompareFaceRequest();
        return TeaModel.build(map, self);
    }

    public CompareFaceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

    public CompareFaceRequest setImageURLA(String imageURLA) {
        this.imageURLA = imageURLA;
        return this;
    }
    public String getImageURLA() {
        return this.imageURLA;
    }

    public CompareFaceRequest setImageURLB(String imageURLB) {
        this.imageURLB = imageURLB;
        return this;
    }
    public String getImageURLB() {
        return this.imageURLB;
    }

    public CompareFaceRequest setImageDataA(byte[] imageDataA) {
        this.imageDataA = imageDataA;
        return this;
    }
    public byte[] getImageDataA() {
        return this.imageDataA;
    }

    public CompareFaceRequest setImageDataB(byte[] imageDataB) {
        this.imageDataB = imageDataB;
        return this;
    }
    public byte[] getImageDataB() {
        return this.imageDataB;
    }

}
