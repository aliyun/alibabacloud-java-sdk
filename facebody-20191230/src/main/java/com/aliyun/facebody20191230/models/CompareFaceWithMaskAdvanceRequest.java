// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceWithMaskAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLA")
    public java.io.InputStream imageURLAObject;

    @NameInMap("ImageURLB")
    public java.io.InputStream imageURLBObject;

    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    public static CompareFaceWithMaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceWithMaskAdvanceRequest self = new CompareFaceWithMaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CompareFaceWithMaskAdvanceRequest setImageURLAObject(java.io.InputStream imageURLAObject) {
        this.imageURLAObject = imageURLAObject;
        return this;
    }
    public java.io.InputStream getImageURLAObject() {
        return this.imageURLAObject;
    }

    public CompareFaceWithMaskAdvanceRequest setImageURLBObject(java.io.InputStream imageURLBObject) {
        this.imageURLBObject = imageURLBObject;
        return this;
    }
    public java.io.InputStream getImageURLBObject() {
        return this.imageURLBObject;
    }

    public CompareFaceWithMaskAdvanceRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

}
