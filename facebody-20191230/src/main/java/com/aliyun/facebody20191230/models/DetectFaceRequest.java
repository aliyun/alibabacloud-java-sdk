// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectFaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectFace/DetectFace1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectFace/DetectFace1.png</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Landmark")
    public Boolean landmark;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxFaceNumber")
    public Long maxFaceNumber;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Pose")
    public Boolean pose;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
