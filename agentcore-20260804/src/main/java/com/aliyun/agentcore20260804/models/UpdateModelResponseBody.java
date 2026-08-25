// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateModelResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static UpdateModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelResponseBody self = new UpdateModelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateModelResponseBody setData(UpdateModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateModelResponseBodyData getData() {
        return this.data;
    }

    public UpdateModelResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateModelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateModelResponseBodyDataCapabilities extends TeaModel {
        @NameInMap("audio")
        public Boolean audio;

        @NameInMap("document")
        public Boolean document;

        @NameInMap("multiToolCall")
        public Boolean multiToolCall;

        @NameInMap("reasoning")
        public Boolean reasoning;

        @NameInMap("streamToolCall")
        public Boolean streamToolCall;

        @NameInMap("toolCall")
        public Boolean toolCall;

        @NameInMap("video")
        public Boolean video;

        @NameInMap("vision")
        public Boolean vision;

        public static UpdateModelResponseBodyDataCapabilities build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelResponseBodyDataCapabilities self = new UpdateModelResponseBodyDataCapabilities();
            return TeaModel.build(map, self);
        }

        public UpdateModelResponseBodyDataCapabilities setAudio(Boolean audio) {
            this.audio = audio;
            return this;
        }
        public Boolean getAudio() {
            return this.audio;
        }

        public UpdateModelResponseBodyDataCapabilities setDocument(Boolean document) {
            this.document = document;
            return this;
        }
        public Boolean getDocument() {
            return this.document;
        }

        public UpdateModelResponseBodyDataCapabilities setMultiToolCall(Boolean multiToolCall) {
            this.multiToolCall = multiToolCall;
            return this;
        }
        public Boolean getMultiToolCall() {
            return this.multiToolCall;
        }

        public UpdateModelResponseBodyDataCapabilities setReasoning(Boolean reasoning) {
            this.reasoning = reasoning;
            return this;
        }
        public Boolean getReasoning() {
            return this.reasoning;
        }

        public UpdateModelResponseBodyDataCapabilities setStreamToolCall(Boolean streamToolCall) {
            this.streamToolCall = streamToolCall;
            return this;
        }
        public Boolean getStreamToolCall() {
            return this.streamToolCall;
        }

        public UpdateModelResponseBodyDataCapabilities setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public UpdateModelResponseBodyDataCapabilities setVideo(Boolean video) {
            this.video = video;
            return this;
        }
        public Boolean getVideo() {
            return this.video;
        }

        public UpdateModelResponseBodyDataCapabilities setVision(Boolean vision) {
            this.vision = vision;
            return this;
        }
        public Boolean getVision() {
            return this.vision;
        }

    }

    public static class UpdateModelResponseBodyData extends TeaModel {
        @NameInMap("capabilities")
        public UpdateModelResponseBodyDataCapabilities capabilities;

        /**
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("connectionId")
        public String connectionId;

        /**
         * <strong>example:</strong>
         * <p>128000</p>
         */
        @NameInMap("contextSize")
        public Long contextSize;

        /**
         * <strong>example:</strong>
         * <p>2026-08-09T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>131072</p>
         */
        @NameInMap("maxTokens")
        public Long maxTokens;

        /**
         * <strong>example:</strong>
         * <p>model-1</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>2026-08-09T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelResponseBodyData self = new UpdateModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateModelResponseBodyData setCapabilities(UpdateModelResponseBodyDataCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public UpdateModelResponseBodyDataCapabilities getCapabilities() {
            return this.capabilities;
        }

        public UpdateModelResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public UpdateModelResponseBodyData setContextSize(Long contextSize) {
            this.contextSize = contextSize;
            return this;
        }
        public Long getContextSize() {
            return this.contextSize;
        }

        public UpdateModelResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateModelResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateModelResponseBodyData setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public UpdateModelResponseBodyData setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public UpdateModelResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateModelResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateModelResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
