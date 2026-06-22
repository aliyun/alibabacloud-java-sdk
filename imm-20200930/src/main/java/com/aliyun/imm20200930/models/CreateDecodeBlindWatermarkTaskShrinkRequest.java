// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateDecodeBlindWatermarkTaskShrinkRequest extends TeaModel {
    /**
     * <p>A parameter from the earlier DecodeBlindWatermark API. It specifies the quality of the output image. The default value is 90. The value must be in the range of 70 to 100.</p>
     * <p>A higher quality results in a larger image size and better watermark parsing quality.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("ImageQuality")
    public Integer imageQuality;

    /**
     * <p>A parameter from the earlier DecodeBlindWatermark API. It specifies the watermark algorithm model. Valid values include FFT, FFT_FULL, DWT, and DWT_IBG. The default value is FFT.</p>
     * <p>If this parameter is left empty, the new version of the blind watermarking feature is used. Otherwise, the earlier version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>FFT</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The notification configuration. For more information, click Notification. For the format of asynchronous notification messages, see <a href="https://help.aliyun.com/document_detail/2743997.html">Asynchronous notification message format</a>.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>A parameter from the earlier DecodeBlindWatermark API. It specifies the OSS URI of the image before the blind watermark was added.</p>
     * <p>This parameter is not required when Model is set to DWT or DWT_IBG.</p>
     * <p>The OSS URI must be in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format. <code>&lt;bucket&gt;</code> is the name of the OSS bucket that is in the same region as the current project. <code>&lt;object&gt;</code> is the full path of the file, including the file name extension.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-test/testcases/watermarktestbefore.jpg</p>
     */
    @NameInMap("OriginalImageURI")
    public String originalImageURI;

    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <blockquote>
     * <p>Notice: The project name must be the same as the one used to add the blind watermark with the <a href="https://help.aliyun.com/document_detail/2743655.html">EncodeBlindWatermark</a> operation. Otherwise, the watermark cannot be extracted.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The Object Storage Service (OSS) URI of the image.</p>
     * <p>The OSS URI must be in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format. <code>&lt;bucket&gt;</code> is the name of the OSS bucket that is in the same region as the current project. <code>&lt;object&gt;</code> is the full path of the file, including the file name extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://target/sampleobject.jpg</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The watermark extraction level, which controls the extraction precision. A higher level indicates a longer processing time and a better extraction effect. Valid values:</p>
     * <ul>
     * <li><p>low</p>
     * </li>
     * <li><p>medium</p>
     * </li>
     * <li><p>high</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>low</p>
     */
    @NameInMap("StrengthLevel")
    public String strengthLevel;

    /**
     * <p>A parameter from the earlier DecodeBlindWatermark API. It specifies the OSS URI where the image is saved after the blind watermark is parsed.</p>
     * <p>The OSS URI must be in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format. <code>&lt;bucket&gt;</code> is the name of the OSS bucket that is in the same region as the current project. <code>&lt;object&gt;</code> is the full path of the file, including the file name extension.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://target/targetobject.jpg</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>The type of the embedded watermark. Valid value: text</p>
     * <p>(Image watermarks are not supported. Therefore, this parameter can only be set to text.)</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("WatermarkType")
    public String watermarkType;

    public static CreateDecodeBlindWatermarkTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDecodeBlindWatermarkTaskShrinkRequest self = new CreateDecodeBlindWatermarkTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDecodeBlindWatermarkTaskShrinkRequest setImageQuality(Integer imageQuality) {
        this.imageQuality = imageQuality;
        return this;
    }
    public Integer getImageQuality() {
        return this.imageQuality;
    }

    public CreateDecodeBlindWatermarkTaskShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateDecodeBlindWatermarkTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateDecodeBlindWatermarkTaskShrinkRequest setOriginalImageURI(String originalImageURI) {
        this.originalImageURI = originalImageURI;
        return this;
    }
    public String getOriginalImageURI() {
        return this.originalImageURI;
    }

    public CreateDecodeBlindWatermarkTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateDecodeBlindWatermarkTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateDecodeBlindWatermarkTaskShrinkRequest setStrengthLevel(String strengthLevel) {
        this.strengthLevel = strengthLevel;
        return this;
    }
    public String getStrengthLevel() {
        return this.strengthLevel;
    }

    public CreateDecodeBlindWatermarkTaskShrinkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateDecodeBlindWatermarkTaskShrinkRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

}
