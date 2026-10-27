// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class AigcChatCompletionStreamRequest extends TeaModel {
    /**
     * <p>The conversation message array. Creative Agent uses the last user message as the current objective and executes it in combination with the session history.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;Generate an ink wash landscape painting&quot;}]</p>
     */
    @NameInMap("messages")
    public java.util.List<AigcChatCompletionStreamRequestMessages> messages;

    /**
     * <p>The extended input for this image creation request. Use the parameters object to set generation parameters. Do not use this field to pass model addresses or keys.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;parameters&quot;:{&quot;size&quot;:&quot;1024*1024&quot;,&quot;n&quot;:1}}</p>
     */
    @NameInMap("metadata")
    public AigcChatCompletionStreamRequestMetadata metadata;

    /**
     * <p>A compatibility placeholder field. Can be omitted or set to an empty string. You cannot use this field to switch the model used by the instance. The model field in the response is an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot; &quot;</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Specifies whether to use SSE streaming responses. This parameter must be set to true for this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>The HTTP JSON key is stream_options. Set include_usage to retrieve the token usage for this call.</p>
     * 
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
         * <p>The publicly accessible HTTPS URL of the reference image, or a complete Base64 image Data URL (such as data:image/png;base64,...). Signed URLs must remain valid during request execution. Re-upload or update the link for expired or unauthorized images.</p>
         * 
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
         * <p>The video URL.</p>
         * 
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
        /**
         * <p>The reference image when type is set to image_url. Supports HTTPS URLs or Base64 Data URLs.</p>
         */
        @NameInMap("imageUrl")
        public AigcChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <p>The generation or editing objective when type is set to text.</p>
         * 
         * <strong>example:</strong>
         * <p>Change the background of the reference image to a seaside sunset</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>The content part type: text, image_url, or video_url.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The video input when type is set to video_url. Only accepted by the Creative Agent Dedicated edition Planner. The Creative Agent Lite edition rejects this type.</p>
         */
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
         * <p>The message content. Can be text. A multimodal array can contain text, image_url, or video_url. The Creative Agent Lite edition performs image-to-image when a reference image is provided and text-to-image when no reference image is provided. It does not accept video.</p>
         * 
         * <strong>example:</strong>
         * <p>Generate a futuristic city nightscape after rain</p>
         */
        @NameInMap("content")
        public java.util.List<AigcChatCompletionStreamRequestMessagesContent> content;

        /**
         * <p>The message role. Place the current generation objective in a user message. History can include user, assistant, and tool.</p>
         * 
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
         * <p>The guidance scale. Must be a finite number between 0 and 20.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("guidanceScale")
        public Double guidanceScale;

        /**
         * <p>The number of images to generate for this request. Must be an integer in the range of 1 to 6.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("n")
        public Long n;

        /**
         * <p>The negative prompt that describes content you do not want to appear in the result.</p>
         * 
         * <strong>example:</strong>
         * <p>low quality, blurry, text, watermark</p>
         */
        @NameInMap("negativePrompt")
        public String negativePrompt;

        /**
         * <p>The number of model inference iterations. Must be an integer in the range of 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("numInferenceSteps")
        public Long numInferenceSteps;

        /**
         * <p>The random seed. Must be an integer in the range of 0 to 2147483647.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("seed")
        public Long seed;

        /**
         * <p>The output pixel dimensions, such as <code>1024*1024</code> or <code>1280*720</code>. The format <code>1024x1024</code> is also accepted. When specified, this value overrides the default canvas dimensions for this request. Use width and height values supported by the model.</p>
         * 
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
         * <p>The image parameters for this request. Only size, n, seed, negative_prompt, num_inference_steps, and guidance_scale are supported. Omitted fields use the default configurations. response_format is not supported.</p>
         * 
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
         * <p>The HTTP JSON key is include_usage. When set to true, an independent usage chunk is returned before the end marker. The choices field in this chunk is an empty array. Token usage does not represent the number of images or the final bill.</p>
         * 
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
