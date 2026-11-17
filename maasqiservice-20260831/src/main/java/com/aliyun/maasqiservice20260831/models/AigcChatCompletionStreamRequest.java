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
     * <p>The extended input for the current image creation. Use the parameters object to set generation parameters. Do not use it to pass model addresses or keys.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;parameters&quot;:{&quot;size&quot;:&quot;1024*1024&quot;,&quot;n&quot;:1}}</p>
     */
    @NameInMap("metadata")
    public AigcChatCompletionStreamRequestMetadata metadata;

    /**
     * <p>A compatibility placeholder field. You can omit it or pass an empty string. You cannot use this field to switch the model used by the instance. The model field in the response is an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot; &quot;</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Specifies whether to use SSE streaming responses. You must set this parameter to true for this operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>The HTTP JSON key is stream_options. Set include_usage to obtain the token usage for the current call.</p>
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
         * <p>The publicly accessible HTTPS URL of the reference image, or a complete Base64 image data URL (such as data:image/png;base64,...). Signed URLs must be valid during request execution. For expired or unauthorized images, you must re-upload them or update the links.</p>
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
         * <p>The reference image when type is image_url. HTTPS URLs or Base64 data URLs are supported.</p>
         */
        @NameInMap("imageUrl")
        public AigcChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <p>The generation or editing objective when type is text.</p>
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
         * <p>The video input when type is video_url. Only the Planner of the dedicated edition of Creative Agent accepts it. The lite edition of Creative Agent rejects it.</p>
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
         * <p>The message content. You can pass text. A multimodal array can contain text, image_url, or video_url. The lite edition of Creative Agent performs image-to-image generation when a reference image is provided and text-to-image generation when no reference image is provided. It does not accept videos.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Generate a night view of a futuristic city after rain&quot;}]</p>
         */
        @NameInMap("content")
        public java.util.List<AigcChatCompletionStreamRequestMessagesContent> content;

        /**
         * <p>The message role. Place the current generation objective in a user message. The history can include user, assistant, and tool messages.</p>
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
         * <p>The guidance scale, which must be a finite number from 0 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("guidanceScale")
        public Double guidanceScale;

        /**
         * <p>The number of images to generate for the current request, which must be an integer from 1 to 6.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("n")
        public Long n;

        /**
         * <p>The negative prompt, which is used to describe content that you do not want to appear in the results.</p>
         * 
         * <strong>example:</strong>
         * <p>Low quality, blurry, text, watermark</p>
         */
        @NameInMap("negativePrompt")
        public String negativePrompt;

        /**
         * <p>The number of model inference iterations, which must be an integer from 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("numInferenceSteps")
        public Long numInferenceSteps;

        /**
         * <p>The random seed, which must be an integer from 0 to 2147483647.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("seed")
        public Long seed;

        /**
         * <p>The output pixel size, such as 1024<em>1024 or 1280</em>720. 1024x1024 is also accepted. Specifying this parameter overrides the default aspect ratio size for the current request. Use the width and height supported by the model.</p>
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
         * <p>The image parameters for the current request. Only size, n, seed, negative_prompt, num_inference_steps, and guidance_scale are supported. Omitted fields use the default configurations. response_format is not supported.</p>
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
         * <p>The HTTP JSON key is include_usage. When set to true, an independent usage block is returned before the end marker, and its choices field is an empty array. Token usage does not represent the number of images or the final bill.</p>
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
