// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoTranslationShrinkRequest extends TeaModel {
    /**
     * <p>The list of translation features. Valid values: <code>speech</code> and <code>visual</code>. You can select both. At least one feature is required. Duplicate values are not accepted.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Capabilities")
    public String capabilitiesShrink;

    /**
     * <p>Default value: false. If <code>visual</code> is included and this parameter is explicitly set to true, the quality check for on-screen text processing is enabled. If only <code>speech</code> is selected, this parameter is ignored. No quality check is performed, no quality check fields are returned, and no errors are reported due to this parameter. Enabling the quality check may increase the waiting time. Do not enable it unless necessary.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableQualityCheck")
    public Boolean enableQualityCheck;

    /**
     * <p>The source language. For supported languages, see &quot;Supported languages&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The target language. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ru</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The video URL. Supported formats: MP4 and MOV. Maximum size: 200 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cdn.example.com/product-demo.mp4">https://cdn.example.com/product-demo.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static VideoTranslationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoTranslationShrinkRequest self = new VideoTranslationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public VideoTranslationShrinkRequest setCapabilitiesShrink(String capabilitiesShrink) {
        this.capabilitiesShrink = capabilitiesShrink;
        return this;
    }
    public String getCapabilitiesShrink() {
        return this.capabilitiesShrink;
    }

    public VideoTranslationShrinkRequest setEnableQualityCheck(Boolean enableQualityCheck) {
        this.enableQualityCheck = enableQualityCheck;
        return this;
    }
    public Boolean getEnableQualityCheck() {
        return this.enableQualityCheck;
    }

    public VideoTranslationShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public VideoTranslationShrinkRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public VideoTranslationShrinkRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
