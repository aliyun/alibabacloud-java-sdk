// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDecodeBlindWatermarkTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("ImageQuality")
    public Integer imageQuality;

    /**
     * <strong>example:</strong>
     * <p>FFT</p>
     */
    @NameInMap("Model")
    public String model;

    @NameInMap("Notification")
    public Notification notification;

    /**
     * <strong>example:</strong>
     * <p>oss://imm-test/testcases/watermarktestbefore.jpg</p>
     */
    @NameInMap("OriginalImageURI")
    public String originalImageURI;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://target/sampleobject.jpg</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("StrengthLevel")
    public String strengthLevel;

    /**
     * <strong>example:</strong>
     * <p>oss://target/targetobject.jpg</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("WatermarkType")
    public String watermarkType;

    public static CreateDecodeBlindWatermarkTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDecodeBlindWatermarkTaskRequest self = new CreateDecodeBlindWatermarkTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDecodeBlindWatermarkTaskRequest setImageQuality(Integer imageQuality) {
        this.imageQuality = imageQuality;
        return this;
    }
    public Integer getImageQuality() {
        return this.imageQuality;
    }

    public CreateDecodeBlindWatermarkTaskRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateDecodeBlindWatermarkTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateDecodeBlindWatermarkTaskRequest setOriginalImageURI(String originalImageURI) {
        this.originalImageURI = originalImageURI;
        return this;
    }
    public String getOriginalImageURI() {
        return this.originalImageURI;
    }

    public CreateDecodeBlindWatermarkTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateDecodeBlindWatermarkTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateDecodeBlindWatermarkTaskRequest setStrengthLevel(String strengthLevel) {
        this.strengthLevel = strengthLevel;
        return this;
    }
    public String getStrengthLevel() {
        return this.strengthLevel;
    }

    public CreateDecodeBlindWatermarkTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateDecodeBlindWatermarkTaskRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

}
