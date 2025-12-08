// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectFaceAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectFace/DetectFace1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectFace/DetectFace1.png</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

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

    public DetectFaceAdvanceRequest setMaxFaceNumber(Long maxFaceNumber) {
        this.maxFaceNumber = maxFaceNumber;
        return this;
    }
    public Long getMaxFaceNumber() {
        return this.maxFaceNumber;
    }

    public DetectFaceAdvanceRequest setPose(Boolean pose) {
        this.pose = pose;
        return this;
    }
    public Boolean getPose() {
        return this.pose;
    }

    public DetectFaceAdvanceRequest setQuality(Boolean quality) {
        this.quality = quality;
        return this;
    }
    public Boolean getQuality() {
        return this.quality;
    }

}
