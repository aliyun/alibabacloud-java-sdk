// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("Landmark")
    public Boolean landmark;

    @NameInMap("Quality")
    public Boolean quality;

    @NameInMap("Pose")
    public Boolean pose;

    @NameInMap("MaxFaceNumber")
    public Long maxFaceNumber;

    public static DetectFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAdvanceRequest self = new DetectFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectFaceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public DetectFaceAdvanceRequest setLandmark(Boolean landmark) {
        this.landmark = landmark;
        return this;
    }
    public Boolean getLandmark() {
        return this.landmark;
    }

    public DetectFaceAdvanceRequest setQuality(Boolean quality) {
        this.quality = quality;
        return this;
    }
    public Boolean getQuality() {
        return this.quality;
    }

    public DetectFaceAdvanceRequest setPose(Boolean pose) {
        this.pose = pose;
        return this;
    }
    public Boolean getPose() {
        return this.pose;
    }

    public DetectFaceAdvanceRequest setMaxFaceNumber(Long maxFaceNumber) {
        this.maxFaceNumber = maxFaceNumber;
        return this;
    }
    public Long getMaxFaceNumber() {
        return this.maxFaceNumber;
    }

}
