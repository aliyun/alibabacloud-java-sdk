// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelRequest extends TeaModel {
    /**
     * <p>The model update request body. At least one non-null parameter must be provided among description, contextSize, maxTokens, and capabilities.</p>
     */
    @NameInMap("body")
    public UpdateModelRequestBody body;

    /**
     * <p>The client token for idempotency. Not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelRequest self = new UpdateModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelRequest setBody(UpdateModelRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelRequestBody getBody() {
        return this.body;
    }

    public UpdateModelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateModelRequestBodyCapabilities extends TeaModel {
        /**
         * <p>Specifies whether the model supports audio input or output. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
         */
        @NameInMap("audio")
        public Boolean audio;

        /**
         * <p>Specifies whether the model supports document input. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
         */
        @NameInMap("document")
        public Boolean document;

        /**
         * <p>Specifies whether the model supports invoking multiple tools in a single response. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
         */
        @NameInMap("multiToolCall")
        public Boolean multiToolCall;

        /**
         * <p>Specifies whether the model supports reasoning. A value of true indicates that it is supported. A value of false indicates that it is not supported. This field is a capability marker and is not used to set reasoning intensity or reasoning token budget.</p>
         */
        @NameInMap("reasoning")
        public Boolean reasoning;

        /**
         * <p>Specifies whether the model supports streaming tool invocation. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
         */
        @NameInMap("streamToolCall")
        public Boolean streamToolCall;

        /**
         * <p>Specifies whether the model supports tool invocation. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
         */
        @NameInMap("toolCall")
        public Boolean toolCall;

        /**
         * <p>Specifies whether the model supports video input. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
         */
        @NameInMap("video")
        public Boolean video;

        /**
         * <p>Specifies whether the model supports image input. A value of true indicates that it is supported. A value of false indicates that it is not supported.</p>
         */
        @NameInMap("vision")
        public Boolean vision;

        public static UpdateModelRequestBodyCapabilities build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelRequestBodyCapabilities self = new UpdateModelRequestBodyCapabilities();
            return TeaModel.build(map, self);
        }

        public UpdateModelRequestBodyCapabilities setAudio(Boolean audio) {
            this.audio = audio;
            return this;
        }
        public Boolean getAudio() {
            return this.audio;
        }

        public UpdateModelRequestBodyCapabilities setDocument(Boolean document) {
            this.document = document;
            return this;
        }
        public Boolean getDocument() {
            return this.document;
        }

        public UpdateModelRequestBodyCapabilities setMultiToolCall(Boolean multiToolCall) {
            this.multiToolCall = multiToolCall;
            return this;
        }
        public Boolean getMultiToolCall() {
            return this.multiToolCall;
        }

        public UpdateModelRequestBodyCapabilities setReasoning(Boolean reasoning) {
            this.reasoning = reasoning;
            return this;
        }
        public Boolean getReasoning() {
            return this.reasoning;
        }

        public UpdateModelRequestBodyCapabilities setStreamToolCall(Boolean streamToolCall) {
            this.streamToolCall = streamToolCall;
            return this;
        }
        public Boolean getStreamToolCall() {
            return this.streamToolCall;
        }

        public UpdateModelRequestBodyCapabilities setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public UpdateModelRequestBodyCapabilities setVideo(Boolean video) {
            this.video = video;
            return this;
        }
        public Boolean getVideo() {
            return this.video;
        }

        public UpdateModelRequestBodyCapabilities setVision(Boolean vision) {
            this.vision = vision;
            return this;
        }
        public Boolean getVision() {
            return this.vision;
        }

    }

    public static class UpdateModelRequestBody extends TeaModel {
        /**
         * <p>The model capability configuration. When an object is provided, it replaces the existing capability configuration as a whole. Capability fields not included in the object are treated as false. Providing an empty object {} sets all capabilities to false. If this parameter is not provided or set to null, the original configuration is retained.</p>
         */
        @NameInMap("capabilities")
        public UpdateModelRequestBodyCapabilities capabilities;

        /**
         * <p>The context token limit of the model. The minimum value is 1000. The updated value must not be less than maxTokens. If maxTokens is not provided in this request, the existing value is used for validation. If this parameter is not provided or set to null, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("contextSize")
        public Long contextSize;

        /**
         * <p>The model description. The maximum length is 255 characters after leading and trailing whitespace is removed. Providing an empty string clears the description. If this parameter is not provided or set to null, the original value is retained. Modifying only the description does not refresh the model configuration of associated Agents.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The maximum number of output tokens per generation. The value must be a positive integer. If contextSize is configured, the updated maxTokens must not exceed contextSize. If contextSize is not provided in this request, the existing value is used for validation. If this parameter is not provided or set to null, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        public static UpdateModelRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelRequestBody self = new UpdateModelRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateModelRequestBody setCapabilities(UpdateModelRequestBodyCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public UpdateModelRequestBodyCapabilities getCapabilities() {
            return this.capabilities;
        }

        public UpdateModelRequestBody setContextSize(Long contextSize) {
            this.contextSize = contextSize;
            return this;
        }
        public Long getContextSize() {
            return this.contextSize;
        }

        public UpdateModelRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateModelRequestBody setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

    }

}
