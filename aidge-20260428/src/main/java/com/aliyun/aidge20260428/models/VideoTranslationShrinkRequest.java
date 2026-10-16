// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoTranslationShrinkRequest extends TeaModel {
    /**
     * <p>The list of translation features. Valid values: speech and visual. You can select both. At least one feature is required. Duplicate values are not accepted.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Capabilities")
    public String capabilitiesShrink;

    /**
     * <p>Specifies whether to enable the quality check for on-screen text processing. Default value: false. The quality check is enabled when visual is included and this parameter is explicitly set to true. If only speech is selected, this parameter is ignored, no quality check is performed, no quality check fields are returned, and no errors are reported due to this parameter. Enabling the quality check may increase the waiting time. Do not enable it unless necessary.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableQualityCheck")
    public Boolean enableQualityCheck;

    /**
     * <p>Specifies whether to only erase the source language text in the video frames without translating it. This parameter is valid only when visual is included. Valid values: true (erases only) and false (translates the on-screen text). Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EraseOnly")
    public Boolean eraseOnly;

    /**
     * <p>Specifies whether to erase brand logos. This parameter is valid only when visual is included. Valid values: true (erases brand logos) and false (retains logos). Default value: false. This parameter is independent of eraseOnly.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RemoveLogo")
    public Boolean removeLogo;

    /**
     * <p>The source language. For supported languages, see Language support.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The subtitle processing mode. This parameter is valid only when speech is included. Valid values: erase (erases only the original subtitles) and replace (erases the original subtitles and adds new subtitles). If this parameter is omitted, the original subtitles are not processed and no new subtitles are added.</p>
     * 
     * <strong>example:</strong>
     * <p>erase</p>
     */
    @NameInMap("SubtitleMode")
    public String subtitleMode;

    /**
     * <p>The target language. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ru</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The URL of the video. Supported formats: MP4 and MOV. Maximum size: 200 MB.</p>
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

    public VideoTranslationShrinkRequest setEraseOnly(Boolean eraseOnly) {
        this.eraseOnly = eraseOnly;
        return this;
    }
    public Boolean getEraseOnly() {
        return this.eraseOnly;
    }

    public VideoTranslationShrinkRequest setRemoveLogo(Boolean removeLogo) {
        this.removeLogo = removeLogo;
        return this;
    }
    public Boolean getRemoveLogo() {
        return this.removeLogo;
    }

    public VideoTranslationShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public VideoTranslationShrinkRequest setSubtitleMode(String subtitleMode) {
        this.subtitleMode = subtitleMode;
        return this;
    }
    public String getSubtitleMode() {
        return this.subtitleMode;
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
