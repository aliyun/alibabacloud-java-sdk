// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoTranslationRequest extends TeaModel {
    /**
     * <p>The list of translation features. Valid values: speech and visual. You can select both. At least one feature is required. Duplicate values are not accepted.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Capabilities")
    public java.util.List<String> capabilities;

    /**
     * <p>Specifies whether to enable quality inspection for on-screen text processing. Effective only when visual is included and this parameter is explicitly set to true. If only speech is selected, this parameter is ignored, no quality inspection is performed, no quality inspection fields are returned, and no error is reported due to this parameter. Enabling quality inspection may increase the processing time. Do not enable it unless necessary. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableQualityCheck")
    public Boolean enableQualityCheck;

    /**
     * <p>Applicable only when visual is included. Specifies whether to erase on-screen text without translation. Valid values: true: erases on-screen text without translation. false: translates on-screen text. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EraseOnly")
    public Boolean eraseOnly;

    /**
     * <p>Applicable only when visual is included. Specifies whether to erase brand logos. Valid values: true: erases brand logos. false: retains brand logos. Default value: false. This parameter is independent of EraseOnly.</p>
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
     * <p>Applicable only when speech is included. Valid values: erase: erases the original subtitles only. replace: replaces the original subtitles with translated subtitles, which means erasing the original subtitles and adding subtitles synchronized with the translated speech. If not specified, the original subtitles are not processed, which means neither erasing the original subtitles nor adding new subtitles.</p>
     * 
     * <strong>example:</strong>
     * <p>replace</p>
     */
    @NameInMap("SubtitleMode")
    public String subtitleMode;

    /**
     * <p>Required when speech is included. Optional when only visual is included and EraseOnly is set to true. If specified in this case, it is ignored. Required in other cases.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
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

    public static VideoTranslationRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoTranslationRequest self = new VideoTranslationRequest();
        return TeaModel.build(map, self);
    }

    public VideoTranslationRequest setCapabilities(java.util.List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    public VideoTranslationRequest setEnableQualityCheck(Boolean enableQualityCheck) {
        this.enableQualityCheck = enableQualityCheck;
        return this;
    }
    public Boolean getEnableQualityCheck() {
        return this.enableQualityCheck;
    }

    public VideoTranslationRequest setEraseOnly(Boolean eraseOnly) {
        this.eraseOnly = eraseOnly;
        return this;
    }
    public Boolean getEraseOnly() {
        return this.eraseOnly;
    }

    public VideoTranslationRequest setRemoveLogo(Boolean removeLogo) {
        this.removeLogo = removeLogo;
        return this;
    }
    public Boolean getRemoveLogo() {
        return this.removeLogo;
    }

    public VideoTranslationRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public VideoTranslationRequest setSubtitleMode(String subtitleMode) {
        this.subtitleMode = subtitleMode;
        return this;
    }
    public String getSubtitleMode() {
        return this.subtitleMode;
    }

    public VideoTranslationRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public VideoTranslationRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
