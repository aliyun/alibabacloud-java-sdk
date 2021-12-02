// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectFaceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Landmark")
    public Boolean landmark;

    @NameInMap("MaxFaceNumber")
    public Long maxFaceNumber;

    @NameInMap("Pose")
    public Boolean pose;

    @NameInMap("Quality")
    public Boolean quality;

    public static DetectFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceRequest self = new DetectFaceRequest();
        return TeaModel.build(map, self);
    }

    public DetectFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectFaceRequest setLandmark(Boolean landmark) {
        this.landmark = landmark;
        return this;
    }
    public Boolean getLandmark() {
        return this.landmark;
    }

    public DetectFaceRequest setMaxFaceNumber(Long maxFaceNumber) {
        this.maxFaceNumber = maxFaceNumber;
        return this;
    }
    public Long getMaxFaceNumber() {
        return this.maxFaceNumber;
    }

    public DetectFaceRequest setPose(Boolean pose) {
        this.pose = pose;
        return this;
    }
    public Boolean getPose() {
        return this.pose;
    }

    public DetectFaceRequest setQuality(Boolean quality) {
        this.quality = quality;
        return this;
    }
    public Boolean getQuality() {
        return this.quality;
    }

}
