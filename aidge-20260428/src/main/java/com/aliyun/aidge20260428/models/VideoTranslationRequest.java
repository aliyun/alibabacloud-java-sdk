// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoTranslationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Capabilities")
    public java.util.List<String> capabilities;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ru</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/video.mp4">https://example.com/video.mp4</a></p>
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

    public VideoTranslationRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
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
