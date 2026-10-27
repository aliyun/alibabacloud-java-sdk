// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CuaChatCompletionStreamRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<CuaChatCompletionStreamRequestMessages> messages;

    @NameInMap("metadata")
    public CuaChatCompletionStreamRequestMetadata metadata;

    /**
     * <strong>example:</strong>
     * <p>&quot; &quot;</p>
     */
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

    @NameInMap("streamOptions")
    public CuaChatCompletionStreamRequestStreamOptions streamOptions;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/desktop.png">https://example.com/desktop.png</a></p>
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
         * <strong>example:</strong>
         * <p>data:image/png;base64,<IMAGE_BASE64></p>
         */
        @NameInMap("imageData")
        public String imageData;

        @NameInMap("imageUrl")
        public CuaChatCompletionStreamRequestMessagesContentImageUrl imageUrl;

        /**
         * <strong>example:</strong>
         * <p>打开浏览器并访问指定页面。</p>
         */
        @NameInMap("text")
        public String text;

        /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("content")
        public java.util.List<CuaChatCompletionStreamRequestMessagesContent> content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>call_cua_1</p>
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
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("screenHeight")
        public Integer screenHeight;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("screenWidth")
        public Integer screenWidth;

        public static CuaChatCompletionStreamRequestMetadata build(java.util.Map<String, ?> map) throws Exception {
            CuaChatCompletionStreamRequestMetadata self = new CuaChatCompletionStreamRequestMetadata();
            return TeaModel.build(map, self);
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
