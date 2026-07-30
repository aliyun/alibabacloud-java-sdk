// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoTranslationShrinkRequest extends TeaModel {
    /**
     * <p>The array of translation capabilities. Valid values: [&quot;visual&quot;].</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Capabilities")
    public String capabilitiesShrink;

    /**
     * <p>The source language. This parameter is optional. Default value: auto (automatic detection).</p>
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
     * <p>The video URL (MP4/MOV, ≤ 200 MB).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/video.mp4">https://example.com/video.mp4</a></p>
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
