// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoTranslationShrinkRequest extends TeaModel {
    /**
     * <p>The list of translation features. Valid values: <code>speech</code> and <code>visual</code>. You can select both. At least one feature must be specified. Duplicate values are not accepted.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Capabilities")
    public String capabilitiesShrink;

    /**
     * <p>Specifies whether to enable the quality check for on-screen text processing. This parameter takes effect only when <code>visual</code> is included and explicitly set to <code>true</code>. If only <code>speech</code> is selected, this parameter is ignored, no quality check is performed, no quality check fields are returned, and no error is reported due to this parameter. Enabling the quality check may increase the processing time. Do not enable it unless necessary. Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableQualityCheck")
    public Boolean enableQualityCheck;

    /**
     * <p>Specifies whether to only erase on-screen text without translation. This parameter is valid only when <code>visual</code> is included. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Erases the on-screen text without translation.</li>
     * <li><code>false</code>: Translates the on-screen text.
     * Default value: <code>false</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EraseOnly")
    public Boolean eraseOnly;

    /**
     * <p>Specifies whether to erase brand logos. This parameter is valid only when <code>visual</code> is included. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Erases brand logos.</li>
     * <li><code>false</code>: Retains brand logos.
     * Default value: <code>false</code>. This parameter is independent of <code>EraseOnly</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RemoveLogo")
    public Boolean removeLogo;

    /**
     * <p>The original language of the video (source language). For supported languages, see Language support.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The subtitle processing mode. This parameter is valid only when <code>speech</code> is included. Valid values:</p>
     * <ul>
     * <li><code>erase</code>: Erases only the original subtitles.</li>
     * <li><code>replace</code>: Replaces the original subtitles with translated subtitles. This erases the original subtitles and adds subtitles synchronized with the translated speech.</li>
     * <li>If this parameter is not specified, the original subtitles are not processed. This means the original subtitles are not erased and no new subtitles are added.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>replace</p>
     */
    @NameInMap("SubtitleMode")
    public String subtitleMode;

    /**
     * <p>The target language. This parameter is required when <code>speech</code> is included. If only <code>visual</code> is included and <code>EraseOnly</code> is set to true, this parameter is optional and will be ignored if provided. In other cases, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
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
