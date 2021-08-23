// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DecodeBlindWatermarkRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("OriginalImageUri")
    public String originalImageUri;

    @NameInMap("TargetUri")
    public String targetUri;

    @NameInMap("ImageQuality")
    public Integer imageQuality;

    @NameInMap("Model")
    public String model;

    public static DecodeBlindWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        DecodeBlindWatermarkRequest self = new DecodeBlindWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public DecodeBlindWatermarkRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DecodeBlindWatermarkRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public DecodeBlindWatermarkRequest setOriginalImageUri(String originalImageUri) {
        this.originalImageUri = originalImageUri;
        return this;
    }
    public String getOriginalImageUri() {
        return this.originalImageUri;
    }

    public DecodeBlindWatermarkRequest setTargetUri(String targetUri) {
        this.targetUri = targetUri;
        return this;
    }
    public String getTargetUri() {
        return this.targetUri;
    }

    public DecodeBlindWatermarkRequest setImageQuality(Integer imageQuality) {
        this.imageQuality = imageQuality;
        return this;
    }
    public Integer getImageQuality() {
        return this.imageQuality;
    }

    public DecodeBlindWatermarkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

}
