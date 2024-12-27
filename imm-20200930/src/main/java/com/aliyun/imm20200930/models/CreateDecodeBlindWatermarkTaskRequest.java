// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDecodeBlindWatermarkTaskRequest extends TeaModel {
    /**
     * <p>The quality of the output image.
     * The higher the quality, the larger the image size and the higher the watermark resolution quality.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("ImageQuality")
    public Integer imageQuality;

    /**
     * <p>The watermark algorithm model.Valid values: FFT, FFT_FULL, DWT, and DWT_IBG. Default value: FFT.</p>
     * <p>If this parameter is left empty, the DecodeBlindWatermark operation is called. Otherwise, the CreateDecodeBlindWatermarkTask operation is called.</p>
     * 
     * <strong>example:</strong>
     * <p>FFT</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The notification settings. For information about the asynchronous notification format, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous message examples</a>.</p>
     */
    @NameInMap("Notification")
    public Notification notification;

    /**
     * <p>The OSS URI of the image before the blind watermark is added. </p>
     * <p>Do not specify this parameter when you set the Model parameter to DWT or DWT_IBG.</p>
     * <p>Specify the OSS URI in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format, where <code>&lt;bucket&gt;</code> is the name of the bucket in the same region as the current project and <code>&lt;object&gt;</code> is the path of the object with the extension included.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/testcases/watermarktestbefore.jpg</p>
     */
    @NameInMap("OriginalImageURI")
    public String originalImageURI;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The OSS URI of the image.</p>
     * <p>Specify the OSS URI in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format, where <code>&lt;bucket&gt;</code> is the name of the bucket in the same region as the current project and <code>&lt;object&gt;</code> is the path of the object with the extension included.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://target/sampleobject.jpg</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The watermark strength level. The higher the strength level, the more resistant the watermarked image is to attacks, but the more the image is distorted. Valid values: low, medium, and high. Default value: low.</p>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("StrengthLevel")
    public String strengthLevel;

    /**
     * <p>The OSS URI of the output image.
     * Specify the OSS URI in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format, where <code>&lt;bucket&gt;</code> is the name of the bucket in the same region as the current project and <code>&lt;object&gt;</code> is the path of the object with the extension included.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://target/targetobject.jpg</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>The type of the watermark. Valid value: text.</p>
     * <p>No image watermarks are supported.</p>
     * 
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
