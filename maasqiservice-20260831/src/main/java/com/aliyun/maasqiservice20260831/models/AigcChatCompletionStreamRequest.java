// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class AigcChatCompletionStreamRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;生成一张水墨山水画&quot;}]</p>
     */
    @NameInMap("messages")
    public java.util.List<AigcChatCompletionStreamRequestMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>{&quot;parameters&quot;:{&quot;size&quot;:&quot;1024*1024&quot;,&quot;n&quot;:1}}</p>
     */
    @NameInMap("metadata")
    public AigcChatCompletionStreamRequestMetadata metadata;

    @NameInMap("model")
    public String model;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <strong>example:</strong>
     * <p>{&quot;include_usage&quot;:true}</p>
     */
    @NameInMap("streamOptions")
    public AigcChatCompletionStreamRequestStreamOptions streamOptions;

    public static AigcChatCompletionStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        AigcChatCompletionStreamRequest self = new AigcChatCompletionStreamRequest();
        return TeaModel.build(map, self);
    }

    public AigcChatCompletionStreamRequest setMessages(java.util.List<AigcChatCompletionStreamRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<AigcChatCompletionStreamRequestMessages> getMessages() {
        return this.messages;
    }

    public AigcChatCompletionStreamRequest setMetadata(AigcChatCompletionStreamRequestMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public AigcChatCompletionStreamRequestMetadata getMetadata() {
        return this.metadata;
    }

    public AigcChatCompletionStreamRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public AigcChatCompletionStreamRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public AigcChatCompletionStreamRequest setStreamOptions(AigcChatCompletionStreamRequestStreamOptions streamOptions) {
        this.streamOptions = streamOptions;
        return this;
    }
    public AigcChatCompletionStreamRequestStreamOptions getStreamOptions() {
        return this.streamOptions;
    }

    public static class AigcChatCompletionStreamRequestMessagesContentImageUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/input.png">https://example.com/input.png</a></p>
         */
        @NameInMap("url")
        public String url;

        public static AigcChatCompletionStreamRequestMessagesContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            AigcChatCompletionStreamRequestMessagesContentImageUrl self = new AigcChatCompletionStreamRequestMessagesContentImageUrl();
            return TeaModel.build(map, self);
        }

        public AigcChatCompletionStreamRequestMessagesContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class AigcChatCompletionStreamRequestMessagesContentVideoUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/input.mp4">https://example.com/input.mp4</a></p>
         */
        @NameInMap("url")
        public String url;

        public static AigcChatCompletionStreamRequestMessagesContentVideoUrl build(java.util.Map<String, ?> map) throws Exception {
            AigcChatCompletionStreamRequestMessagesContentVideoUrl self = new AigcChatCompletionStreamRequestMessagesContentVideoUrl();
            return TeaModel.build(map, self);
        }

        public AigcChatCompletionStreamRequestMessagesContentVideoUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class AigcChatCompletionStreamRequestMessagesContent extends TeaModel {
        @NameInMap("imageUrl")
        public AigcChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <strong>example:</strong>
         * <p>把参考图背景改成海边日落</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        @NameInMap("videoUrl")
        public AigcChatCompletionStreamRequestMessagesContentVideoUrl videoUrl;

        public static AigcChatCompletionStreamRequestMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            AigcChatCompletionStreamRequestMessagesContent self = new AigcChatCompletionStreamRequestMessagesContent();
            return TeaModel.build(map, self);
        }

        public AigcChatCompletionStreamRequestMessagesContent setImageUrl(AigcChatCompletionStreamRequestMessagesContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public AigcChatCompletionStreamRequestMessagesContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public AigcChatCompletionStreamRequestMessagesContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public AigcChatCompletionStreamRequestMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AigcChatCompletionStreamRequestMessagesContent setVideoUrl(AigcChatCompletionStreamRequestMessagesContentVideoUrl videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public AigcChatCompletionStreamRequestMessagesContentVideoUrl getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class AigcChatCompletionStreamRequestMessages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>生成一张雨后未来城市夜景</p>
         */
        @NameInMap("content")
        public java.util.List<AigcChatCompletionStreamRequestMessagesContent> content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static AigcChatCompletionStreamRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            AigcChatCompletionStreamRequestMessages self = new AigcChatCompletionStreamRequestMessages();
            return TeaModel.build(map, self);
        }

        public AigcChatCompletionStreamRequestMessages setContent(java.util.List<AigcChatCompletionStreamRequestMessagesContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<AigcChatCompletionStreamRequestMessagesContent> getContent() {
            return this.content;
        }

        public AigcChatCompletionStreamRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class AigcChatCompletionStreamRequestMetadataParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("guidanceScale")
        public Double guidanceScale;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("n")
        public Long n;

        /**
         * <strong>example:</strong>
         * <p>低质量、模糊、文字、水印</p>
         */
        @NameInMap("negativePrompt")
        public String negativePrompt;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("numInferenceSteps")
        public Long numInferenceSteps;

        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("seed")
        public Long seed;

        /**
         * <strong>example:</strong>
         * <p>1024*1024</p>
         */
        @NameInMap("size")
        public String size;

        public static AigcChatCompletionStreamRequestMetadataParameters build(java.util.Map<String, ?> map) throws Exception {
            AigcChatCompletionStreamRequestMetadataParameters self = new AigcChatCompletionStreamRequestMetadataParameters();
            return TeaModel.build(map, self);
        }

        public AigcChatCompletionStreamRequestMetadataParameters setGuidanceScale(Double guidanceScale) {
            this.guidanceScale = guidanceScale;
            return this;
        }
        public Double getGuidanceScale() {
            return this.guidanceScale;
        }

        public AigcChatCompletionStreamRequestMetadataParameters setN(Long n) {
            this.n = n;
            return this;
        }
        public Long getN() {
            return this.n;
        }

        public AigcChatCompletionStreamRequestMetadataParameters setNegativePrompt(String negativePrompt) {
            this.negativePrompt = negativePrompt;
            return this;
        }
        public String getNegativePrompt() {
            return this.negativePrompt;
        }

        public AigcChatCompletionStreamRequestMetadataParameters setNumInferenceSteps(Long numInferenceSteps) {
            this.numInferenceSteps = numInferenceSteps;
            return this;
        }
        public Long getNumInferenceSteps() {
            return this.numInferenceSteps;
        }

        public AigcChatCompletionStreamRequestMetadataParameters setSeed(Long seed) {
            this.seed = seed;
            return this;
        }
        public Long getSeed() {
            return this.seed;
        }

        public AigcChatCompletionStreamRequestMetadataParameters setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class AigcChatCompletionStreamRequestMetadata extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;size&quot;:&quot;1024*1024&quot;,&quot;n&quot;:1,&quot;num_inference_steps&quot;:8}</p>
         */
        @NameInMap("parameters")
        public AigcChatCompletionStreamRequestMetadataParameters parameters;

        public static AigcChatCompletionStreamRequestMetadata build(java.util.Map<String, ?> map) throws Exception {
            AigcChatCompletionStreamRequestMetadata self = new AigcChatCompletionStreamRequestMetadata();
            return TeaModel.build(map, self);
        }

        public AigcChatCompletionStreamRequestMetadata setParameters(AigcChatCompletionStreamRequestMetadataParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public AigcChatCompletionStreamRequestMetadataParameters getParameters() {
            return this.parameters;
        }

    }

    public static class AigcChatCompletionStreamRequestStreamOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("includeUsage")
        public Boolean includeUsage;

        public static AigcChatCompletionStreamRequestStreamOptions build(java.util.Map<String, ?> map) throws Exception {
            AigcChatCompletionStreamRequestStreamOptions self = new AigcChatCompletionStreamRequestStreamOptions();
            return TeaModel.build(map, self);
        }

        public AigcChatCompletionStreamRequestStreamOptions setIncludeUsage(Boolean includeUsage) {
            this.includeUsage = includeUsage;
            return this;
        }
        public Boolean getIncludeUsage() {
            return this.includeUsage;
        }

    }

}
