// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateModelRequestBody body;

    /**
     * <p>The client token for idempotence. Not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setBody(CreateModelRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateModelRequestBody getBody() {
        return this.body;
    }

    public CreateModelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateModelRequestBodyCapabilities extends TeaModel {
        /**
         * <p>Specifies whether the model supports audio input or output.</p>
         */
        @NameInMap("audio")
        public Boolean audio;

        /**
         * <p>Specifies whether the model supports document input.</p>
         */
        @NameInMap("document")
        public Boolean document;

        /**
         * <p>Specifies whether the model is able to invoke multiple tools in a single response.</p>
         */
        @NameInMap("multiToolCall")
        public Boolean multiToolCall;

        /**
         * <p>Specifies whether the model supports reasoning capabilities.</p>
         */
        @NameInMap("reasoning")
        public Boolean reasoning;

        /**
         * <p>Specifies whether the model supports streaming tool calling.</p>
         */
        @NameInMap("streamToolCall")
        public Boolean streamToolCall;

        /**
         * <p>Specifies whether the model supports tool calling.</p>
         */
        @NameInMap("toolCall")
        public Boolean toolCall;

        /**
         * <p>Specifies whether the model supports video input.</p>
         */
        @NameInMap("video")
        public Boolean video;

        /**
         * <p>Specifies whether the model supports image input.</p>
         */
        @NameInMap("vision")
        public Boolean vision;

        public static CreateModelRequestBodyCapabilities build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestBodyCapabilities self = new CreateModelRequestBodyCapabilities();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestBodyCapabilities setAudio(Boolean audio) {
            this.audio = audio;
            return this;
        }
        public Boolean getAudio() {
            return this.audio;
        }

        public CreateModelRequestBodyCapabilities setDocument(Boolean document) {
            this.document = document;
            return this;
        }
        public Boolean getDocument() {
            return this.document;
        }

        public CreateModelRequestBodyCapabilities setMultiToolCall(Boolean multiToolCall) {
            this.multiToolCall = multiToolCall;
            return this;
        }
        public Boolean getMultiToolCall() {
            return this.multiToolCall;
        }

        public CreateModelRequestBodyCapabilities setReasoning(Boolean reasoning) {
            this.reasoning = reasoning;
            return this;
        }
        public Boolean getReasoning() {
            return this.reasoning;
        }

        public CreateModelRequestBodyCapabilities setStreamToolCall(Boolean streamToolCall) {
            this.streamToolCall = streamToolCall;
            return this;
        }
        public Boolean getStreamToolCall() {
            return this.streamToolCall;
        }

        public CreateModelRequestBodyCapabilities setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public CreateModelRequestBodyCapabilities setVideo(Boolean video) {
            this.video = video;
            return this;
        }
        public Boolean getVideo() {
            return this.video;
        }

        public CreateModelRequestBodyCapabilities setVision(Boolean vision) {
            this.vision = vision;
            return this;
        }
        public Boolean getVision() {
            return this.vision;
        }

    }

    public static class CreateModelRequestBody extends TeaModel {
        /**
         * <p>The model capability configuration.</p>
         */
        @NameInMap("capabilities")
        public CreateModelRequestBodyCapabilities capabilities;

        /**
         * <p>The model connection ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("connectionId")
        public String connectionId;

        /**
         * <p>The model context window size, in tokens. The value must be a positive integer.</p>
         * 
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("contextSize")
        public Long contextSize;

        /**
         * <p>The model description. Maximum length: 255 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The maximum number of output tokens supported per model generation.</p>
         * 
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        /**
         * <p>The upstream model name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        public static CreateModelRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateModelRequestBody self = new CreateModelRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateModelRequestBody setCapabilities(CreateModelRequestBodyCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public CreateModelRequestBodyCapabilities getCapabilities() {
            return this.capabilities;
        }

        public CreateModelRequestBody setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public CreateModelRequestBody setContextSize(Long contextSize) {
            this.contextSize = contextSize;
            return this;
        }
        public Long getContextSize() {
            return this.contextSize;
        }

        public CreateModelRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateModelRequestBody setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public CreateModelRequestBody setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

}
