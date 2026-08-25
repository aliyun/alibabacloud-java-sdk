// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateModelResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The model information after creation.</p>
     */
    @NameInMap("data")
    public CreateModelResponseBodyData data;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request processing result message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelResponseBody self = new CreateModelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateModelResponseBody setData(CreateModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateModelResponseBodyData getData() {
        return this.data;
    }

    public CreateModelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateModelResponseBodyDataCapabilities extends TeaModel {
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

        public static CreateModelResponseBodyDataCapabilities build(java.util.Map<String, ?> map) throws Exception {
            CreateModelResponseBodyDataCapabilities self = new CreateModelResponseBodyDataCapabilities();
            return TeaModel.build(map, self);
        }

        public CreateModelResponseBodyDataCapabilities setAudio(Boolean audio) {
            this.audio = audio;
            return this;
        }
        public Boolean getAudio() {
            return this.audio;
        }

        public CreateModelResponseBodyDataCapabilities setDocument(Boolean document) {
            this.document = document;
            return this;
        }
        public Boolean getDocument() {
            return this.document;
        }

        public CreateModelResponseBodyDataCapabilities setMultiToolCall(Boolean multiToolCall) {
            this.multiToolCall = multiToolCall;
            return this;
        }
        public Boolean getMultiToolCall() {
            return this.multiToolCall;
        }

        public CreateModelResponseBodyDataCapabilities setReasoning(Boolean reasoning) {
            this.reasoning = reasoning;
            return this;
        }
        public Boolean getReasoning() {
            return this.reasoning;
        }

        public CreateModelResponseBodyDataCapabilities setStreamToolCall(Boolean streamToolCall) {
            this.streamToolCall = streamToolCall;
            return this;
        }
        public Boolean getStreamToolCall() {
            return this.streamToolCall;
        }

        public CreateModelResponseBodyDataCapabilities setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public CreateModelResponseBodyDataCapabilities setVideo(Boolean video) {
            this.video = video;
            return this;
        }
        public Boolean getVideo() {
            return this.video;
        }

        public CreateModelResponseBodyDataCapabilities setVision(Boolean vision) {
            this.vision = vision;
            return this;
        }
        public Boolean getVision() {
            return this.vision;
        }

    }

    public static class CreateModelResponseBodyData extends TeaModel {
        /**
         * <p>The model capability configuration.</p>
         */
        @NameInMap("capabilities")
        public CreateModelResponseBodyDataCapabilities capabilities;

        /**
         * <p>The model connection ID.</p>
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
         * <p>The resource creation time in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-09T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

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
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>model-1</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <p>The upstream model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The resource last update time in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-09T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateModelResponseBodyData self = new CreateModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateModelResponseBodyData setCapabilities(CreateModelResponseBodyDataCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public CreateModelResponseBodyDataCapabilities getCapabilities() {
            return this.capabilities;
        }

        public CreateModelResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public CreateModelResponseBodyData setContextSize(Long contextSize) {
            this.contextSize = contextSize;
            return this;
        }
        public Long getContextSize() {
            return this.contextSize;
        }

        public CreateModelResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateModelResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateModelResponseBodyData setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public CreateModelResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public CreateModelResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public CreateModelResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateModelResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
