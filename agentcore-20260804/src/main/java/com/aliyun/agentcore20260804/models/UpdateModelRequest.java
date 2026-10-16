// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelRequest extends TeaModel {
    /**
     * <p>The model update request body. You must specify at least one non-null parameter among description, contextSize, maxTokens, and capabilities.</p>
     */
    @NameInMap("body")
    public UpdateModelRequestBody body;

    /**
     * <p>The client token used for idempotence. This parameter is not supported.</p>
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
         * <p>Specifies whether the model supports audio input or output. Valid values:</p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
         * </ul>
         */
        @NameInMap("audio")
        public Boolean audio;

        /**
         * <p>Specifies whether the model supports document input. Valid values:</p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
         * </ul>
         */
        @NameInMap("document")
        public Boolean document;

        /**
         * <p>Specifies whether the model is able to invoke tool calling multiple times in a single response. Valid values:</p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
         * </ul>
         */
        @NameInMap("multiToolCall")
        public Boolean multiToolCall;

        /**
         * <p>Specifies whether the model supports reasoning capabilities. Valid values:</p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.
         * This field is a capability flag and is not used to set the reasoning intensity or reasoning token budget.</li>
         * </ul>
         */
        @NameInMap("reasoning")
        public Boolean reasoning;

        /**
         * <p>Specifies whether the model is able to invoke streaming tool calling. Valid values:</p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
         * </ul>
         */
        @NameInMap("streamToolCall")
        public Boolean streamToolCall;

        /**
         * <p>Specifies whether the model is able to invoke tool calling. Valid values:</p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
         * </ul>
         */
        @NameInMap("toolCall")
        public Boolean toolCall;

        /**
         * <p>Specifies whether the model supports video input. Valid values:</p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
         * </ul>
         */
        @NameInMap("video")
        public Boolean video;

        /**
         * <p>Specifies whether the model supports image input. Valid values:</p>
         * <ul>
         * <li>true: Supported.</li>
         * <li>false: Not supported.</li>
         * </ul>
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
         * <p>The model capability configuration. When an object is passed, the original capability configuration is replaced as a whole. Capability fields that are not specified in the object are treated as false. Passing an empty object {} sets all capabilities to false. If this parameter is not passed or is set to null, the original configuration is retained.</p>
         */
        @NameInMap("capabilities")
        public UpdateModelRequestBodyCapabilities capabilities;

        /**
         * <p>The context token limit of the model. The minimum value is 1000. The updated value must not be less than maxTokens. If maxTokens is not specified in the current request, the existing value is used for validation. If this parameter is not passed or is set to null, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("contextSize")
        public Long contextSize;

        /**
         * <p>The model description. The maximum length is 255 characters after leading and trailing whitespace is removed. Passing an empty string clears the description. If this parameter is not passed or is set to null, the original value is retained. Modifying only the description does not refresh the model configurations of associated agents.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The maximum number of output tokens for a single generation of the model. The value must be a positive integer. If contextSize is configured, the updated maxTokens must not be greater than contextSize. If contextSize is not specified in the current request, the existing value is used for validation. If this parameter is not passed or is set to null, the original value is retained.</p>
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
