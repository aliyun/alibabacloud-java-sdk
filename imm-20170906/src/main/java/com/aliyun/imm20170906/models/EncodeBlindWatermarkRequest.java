// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class EncodeBlindWatermarkRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("ImageQuality")
    public String imageQuality;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("Model")
    public String model;

    @NameInMap("Project")
    public String project;

    @NameInMap("TargetImageType")
    public String targetImageType;

    @NameInMap("TargetUri")
    public String targetUri;

    @NameInMap("WatermarkUri")
    public String watermarkUri;

    public static EncodeBlindWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        EncodeBlindWatermarkRequest self = new EncodeBlindWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public EncodeBlindWatermarkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public EncodeBlindWatermarkRequest setImageQuality(String imageQuality) {
        this.imageQuality = imageQuality;
        return this;
    }
    public String getImageQuality() {
        return this.imageQuality;
    }

    public EncodeBlindWatermarkRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public EncodeBlindWatermarkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public EncodeBlindWatermarkRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public EncodeBlindWatermarkRequest setTargetImageType(String targetImageType) {
        this.targetImageType = targetImageType;
        return this;
    }
    public String getTargetImageType() {
        return this.targetImageType;
    }

    public EncodeBlindWatermarkRequest setTargetUri(String targetUri) {
        this.targetUri = targetUri;
        return this;
    }
    public String getTargetUri() {
        return this.targetUri;
    }

    public EncodeBlindWatermarkRequest setWatermarkUri(String watermarkUri) {
        this.watermarkUri = watermarkUri;
        return this;
    }
    public String getWatermarkUri() {
        return this.watermarkUri;
    }

}
