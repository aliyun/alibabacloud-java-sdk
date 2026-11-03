// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoTranslationShrinkRequest extends TeaModel {
    /**
     * <p>The list of translation features. Valid values: speech and visual. You can select both. At least one feature must be specified. Duplicate values are not allowed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Capabilities")
    public String capabilitiesShrink;

    /**
     * <p>Specifies whether to enable the quality check for on-screen text processing. This parameter takes effect only when visual is included and explicitly set to true. If only speech is selected, this parameter is ignored. No quality check is performed, no quality check fields are returned, and no error is reported for this parameter. Enabling the quality check may increase the waiting time. Do not enable it unless necessary. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableQualityCheck")
    public Boolean enableQualityCheck;

    /**
     * <p>Valid only when visual is included. Specifies whether to only erase the on-screen text without translation. Valid values:</p>
     * <ul>
     * <li>true: Erases the on-screen text without translation.</li>
     * <li>false: Translates the on-screen text.
     * Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EraseOnly")
    public Boolean eraseOnly;

    /**
     * <p>Valid only when visual is included. Specifies whether to erase brand logos. Valid values:</p>
     * <ul>
     * <li>true: Erases brand logos.</li>
     * <li>false: Retains brand logos.
     * Default value: false. This parameter is independent of EraseOnly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RemoveLogo")
    public Boolean removeLogo;

    /**
     * <p>The original language of the video. For supported languages, see Language support.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>Valid only when speech is included. Valid values:</p>
     * <ul>
     * <li>erase: Erases only the original subtitles.</li>
     * <li>replace: Replaces the original subtitles with translated subtitles. This erases the original subtitles and adds subtitles synchronized with the translated speech.</li>
     * <li>If not specified, the original subtitles are not processed. This means the original subtitles are neither erased nor replaced with new subtitles.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>replace</p>
     */
    @NameInMap("SubtitleMode")
    public String subtitleMode;

    /**
     * <p>Required when speech is included. Optional when only visual is selected and EraseOnly is set to true. If provided in this case, it is ignored. Required in all other cases.</p>
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
