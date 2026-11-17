// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CuaChatCompletionStreamRequest extends TeaModel {
    /**
     * <p>The messages. In the first round, only one user message is allowed. In subsequent rounds, only one tool message followed by one user message is allowed. Exactly one screenshot is required for each step.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<CuaChatCompletionStreamRequestMessages> messages;

    /**
     * <p>The auxiliary information of the current screenshot and the running modes supported by the service instructions.</p>
     */
    @NameInMap("metadata")
    public CuaChatCompletionStreamRequestMetadata metadata;

    /**
     * <p>The model. This is a compatibility field. You can omit it or pass an empty string. The actual model is determined by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>Specifies whether to enable streaming. Set this parameter to true for this SSE API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>The SSE settings.</p>
     */
    @NameInMap("streamOptions")
    public CuaChatCompletionStreamRequestStreamOptions streamOptions;

    /**
     * <p>The tools. You can only omit this parameter or pass an empty array. CUA uses the fixed computer_use tool, and custom tools are not allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("tools")
    public java.util.List<java.util.Map<String, ?>> tools;

    public static CuaChatCompletionStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        CuaChatCompletionStreamRequest self = new CuaChatCompletionStreamRequest();
        return TeaModel.build(map, self);
    }

    public CuaChatCompletionStreamRequest setMessages(java.util.List<CuaChatCompletionStreamRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<CuaChatCompletionStreamRequestMessages> getMessages() {
        return this.messages;
    }

    public CuaChatCompletionStreamRequest setMetadata(CuaChatCompletionStreamRequestMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    public CuaChatCompletionStreamRequestMetadata getMetadata() {
        return this.metadata;
    }

    public CuaChatCompletionStreamRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CuaChatCompletionStreamRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public CuaChatCompletionStreamRequest setStreamOptions(CuaChatCompletionStreamRequestStreamOptions streamOptions) {
        this.streamOptions = streamOptions;
        return this;
    }
    public CuaChatCompletionStreamRequestStreamOptions getStreamOptions() {
        return this.streamOptions;
    }

    public CuaChatCompletionStreamRequest setTools(java.util.List<java.util.Map<String, ?>> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getTools() {
        return this.tools;
    }

    public static class CuaChatCompletionStreamRequestMessagesContentImageUrl extends TeaModel {
        /**
         * <p>The accessible HTTP(S) URL or complete image data URL. HTTPS is recommended.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>data:image/jpeg;base64,<BASE64_OF_CURRENT_SCREENSHOT></p>
         */
        @NameInMap("url")
        public String url;

        public static CuaChatCompletionStreamRequestMessagesContentImageUrl build(java.util.Map<String, ?> map) throws Exception {
            CuaChatCompletionStreamRequestMessagesContentImageUrl self = new CuaChatCompletionStreamRequestMessagesContentImageUrl();
            return TeaModel.build(map, self);
        }

        public CuaChatCompletionStreamRequestMessagesContentImageUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CuaChatCompletionStreamRequestMessagesContent extends TeaModel {
        /**
         * <p>The compatibility field for input_image. It uses a complete Base64 image data URL. Raw Base64 without a prefix is not accepted.</p>
         * 
         * <strong>example:</strong>
         * <p>data:image/png;base64,<IMAGE_BASE64></p>
         */
        @NameInMap("imageData")
        public String imageData;

        /**
         * <p>The screenshot reference. The URL object format is recommended. The backend is also compatible with the image_url string.</p>
         */
        @NameInMap("imageUrl")
        public CuaChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <p>The text content. In the first round, the user must provide a non-empty task objective. For the tool role, enter the actual execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>Observe the desktop, open the browser, and find the settings page</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>The content type. For text, use text or input_text. For screenshots, use image_url or input_image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image_url</p>
         */
        @NameInMap("type")
        public String type;

        public static CuaChatCompletionStreamRequestMessagesContent build(java.util.Map<String, ?> map) throws Exception {
            CuaChatCompletionStreamRequestMessagesContent self = new CuaChatCompletionStreamRequestMessagesContent();
            return TeaModel.build(map, self);
        }

        public CuaChatCompletionStreamRequestMessagesContent setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

        public CuaChatCompletionStreamRequestMessagesContent setImageUrl(CuaChatCompletionStreamRequestMessagesContentImageUrl imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public CuaChatCompletionStreamRequestMessagesContentImageUrl getImageUrl() {
            return this.imageUrl;
        }

        public CuaChatCompletionStreamRequestMessagesContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CuaChatCompletionStreamRequestMessagesContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CuaChatCompletionStreamRequestMessages extends TeaModel {
        /**
         * <p>The message content. The user role uses a multimodal array. The tool role supports an array of text items, a non-empty string, or an object to return execution results.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("content")
        public java.util.List<CuaChatCompletionStreamRequestMessagesContent> content;

        /**
         * <p>The role of the message. Only user and tool are supported. Do not pass system, assistant, or complete history.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The tool call ID. This parameter is required when role is set to tool. It must be equal to the computer_use call ID returned in the previous step of the same session.</p>
         * 
         * <strong>example:</strong>
         * <p>call_ID_RETURNED_IN_THE_PREVIOUS_ROUND</p>
         */
        @NameInMap("toolCallId")
        public String toolCallId;

        public static CuaChatCompletionStreamRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            CuaChatCompletionStreamRequestMessages self = new CuaChatCompletionStreamRequestMessages();
            return TeaModel.build(map, self);
        }

        public CuaChatCompletionStreamRequestMessages setContent(java.util.List<CuaChatCompletionStreamRequestMessagesContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<CuaChatCompletionStreamRequestMessagesContent> getContent() {
            return this.content;
        }

        public CuaChatCompletionStreamRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CuaChatCompletionStreamRequestMessages setToolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }
        public String getToolCallId() {
            return this.toolCallId;
        }

    }

    public static class CuaChatCompletionStreamRequestMetadata extends TeaModel {
        /**
         * <p>The action mode. Valid values: gui-only and gui+cli. This parameter is case-sensitive and fixed within a session, and is supplemented by subsequent service instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>gui-only / gui+cli</p>
         */
        @NameInMap("actionMode")
        public String actionMode;

        /**
         * <p>The pixel height of the uploaded screenshot. If provided, it must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("screenHeight")
        public Integer screenHeight;

        /**
         * <p>The pixel width of the uploaded screenshot. If provided, it must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("screenWidth")
        public Integer screenWidth;

        public static CuaChatCompletionStreamRequestMetadata build(java.util.Map<String, ?> map) throws Exception {
            CuaChatCompletionStreamRequestMetadata self = new CuaChatCompletionStreamRequestMetadata();
            return TeaModel.build(map, self);
        }

        public CuaChatCompletionStreamRequestMetadata setActionMode(String actionMode) {
            this.actionMode = actionMode;
            return this;
        }
        public String getActionMode() {
            return this.actionMode;
        }

        public CuaChatCompletionStreamRequestMetadata setScreenHeight(Integer screenHeight) {
            this.screenHeight = screenHeight;
            return this;
        }
        public Integer getScreenHeight() {
            return this.screenHeight;
        }

        public CuaChatCompletionStreamRequestMetadata setScreenWidth(Integer screenWidth) {
            this.screenWidth = screenWidth;
            return this;
        }
        public Integer getScreenWidth() {
            return this.screenWidth;
        }

    }

    public static class CuaChatCompletionStreamRequestStreamOptions extends TeaModel {
        /**
         * <p>Specifies whether to return an independent usage event before the end marker. If set to true, an independent usage event is returned, and choices is an empty array.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("includeUsage")
        public Boolean includeUsage;

        public static CuaChatCompletionStreamRequestStreamOptions build(java.util.Map<String, ?> map) throws Exception {
            CuaChatCompletionStreamRequestStreamOptions self = new CuaChatCompletionStreamRequestStreamOptions();
            return TeaModel.build(map, self);
        }

        public CuaChatCompletionStreamRequestStreamOptions setIncludeUsage(Boolean includeUsage) {
            this.includeUsage = includeUsage;
            return this;
        }
        public Boolean getIncludeUsage() {
            return this.includeUsage;
        }

    }

}
