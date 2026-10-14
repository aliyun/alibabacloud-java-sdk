// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateVideoTaskRequest extends TeaModel {
    @NameInMap("Media")
    public java.util.List<CreateVideoTaskRequestMedia> media;

    /**
     * <p>Specifies whether to include an audio track. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Audio")
    public Boolean audio;

    /**
     * <p>The idempotency parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The video duration in seconds. Valid values: an integer from 2 to 30, -1 (intelligent duration), and 0 (server default of 5 seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The model name. Valid values: wan3.0-video (default) and wan3.0-video-prime (high-speed version).</p>
     * 
     * <strong>example:</strong>
     * <p>wan3.0-video</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The video description prompt. You must specify either this parameter or Media. For text-to-video generation, only Prompt is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A meeting room full of cats</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Specifies whether to enable intelligent rewriting (prompt_extend). Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PromptExtend")
    public Boolean promptExtend;

    /**
     * <p>The aspect ratio. Valid values: adaptive (default), 16:9, 4:3, 1:1, 3:4, and 9:16.</p>
     * 
     * <strong>example:</strong>
     * <p>adaptive</p>
     */
    @NameInMap("Ratio")
    public String ratio;

    /**
     * <p>The resolution. Valid values: 1080P (default), 720P, and 480P.</p>
     * 
     * <strong>example:</strong>
     * <p>1080P</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <p>The random seed. Valid values: -1 (random), an integer from 0 to 2147483647, and 0 (server default of random).</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("Seed")
    public Integer seed;

    /**
     * <p>Specifies whether to add a Model Studio watermark. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Watermark")
    public Boolean watermark;

    public static CreateVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoTaskRequest self = new CreateVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoTaskRequest setMedia(java.util.List<CreateVideoTaskRequestMedia> media) {
        this.media = media;
        return this;
    }
    public java.util.List<CreateVideoTaskRequestMedia> getMedia() {
        return this.media;
    }

    public CreateVideoTaskRequest setAudio(Boolean audio) {
        this.audio = audio;
        return this;
    }
    public Boolean getAudio() {
        return this.audio;
    }

    public CreateVideoTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVideoTaskRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateVideoTaskRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateVideoTaskRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CreateVideoTaskRequest setPromptExtend(Boolean promptExtend) {
        this.promptExtend = promptExtend;
        return this;
    }
    public Boolean getPromptExtend() {
        return this.promptExtend;
    }

    public CreateVideoTaskRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public CreateVideoTaskRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public CreateVideoTaskRequest setSeed(Integer seed) {
        this.seed = seed;
        return this;
    }
    public Integer getSeed() {
        return this.seed;
    }

    public CreateVideoTaskRequest setWatermark(Boolean watermark) {
        this.watermark = watermark;
        return this;
    }
    public Boolean getWatermark() {
        return this.watermark;
    }

    public static class CreateVideoTaskRequestMedia extends TeaModel {
        /**
         * <p>The media type for the first item. Valid values: first_frame, last_frame, reference_image, reference_video, reference_audio, file, and link.</p>
         * 
         * <strong>example:</strong>
         * <p>JPEG</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The media URL for the first item. You can specify a public HTTP or HTTPS URL, a temporary oss:// URL, or inline data in the format of data:{mime};base64,....</p>
         * 
         * <strong>example:</strong>
         * <p>Image URL</p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateVideoTaskRequestMedia build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoTaskRequestMedia self = new CreateVideoTaskRequestMedia();
            return TeaModel.build(map, self);
        }

        public CreateVideoTaskRequestMedia setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateVideoTaskRequestMedia setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
