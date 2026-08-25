// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListModelsResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of models.</p>
     */
    @NameInMap("items")
    public java.util.List<ListModelsResponseBodyItems> items;

    /**
     * <p>The number of results per page. Valid values: 0 to 100. If this parameter is not set or set to 0, the default value 10 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The message of the request processing result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token. Pass the token returned from the previous query. An empty response indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>bW9kZWwtbWFuYWdlbWVudC1vZmZzZXQ6bW9kZWw6MTA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

    /**
     * <p>The total number of resources that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelsResponseBody self = new ListModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListModelsResponseBody setItems(java.util.List<ListModelsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListModelsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListModelsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListModelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListModelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelsResponseBodyItemsCapabilities extends TeaModel {
        /**
         * <p>Indicates whether the model supports audio input or output.</p>
         */
        @NameInMap("audio")
        public Boolean audio;

        /**
         * <p>Indicates whether the model supports document input.</p>
         */
        @NameInMap("document")
        public Boolean document;

        /**
         * <p>Indicates whether the model supports invoking multiple tools in a single response.</p>
         */
        @NameInMap("multiToolCall")
        public Boolean multiToolCall;

        /**
         * <p>Indicates whether the model supports reasoning capabilities.</p>
         */
        @NameInMap("reasoning")
        public Boolean reasoning;

        /**
         * <p>Indicates whether the model supports streaming tool calling.</p>
         */
        @NameInMap("streamToolCall")
        public Boolean streamToolCall;

        /**
         * <p>Indicates whether the model supports tool calling.</p>
         */
        @NameInMap("toolCall")
        public Boolean toolCall;

        /**
         * <p>Indicates whether the model supports video input.</p>
         */
        @NameInMap("video")
        public Boolean video;

        /**
         * <p>Indicates whether the model supports image input.</p>
         */
        @NameInMap("vision")
        public Boolean vision;

        public static ListModelsResponseBodyItemsCapabilities build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyItemsCapabilities self = new ListModelsResponseBodyItemsCapabilities();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyItemsCapabilities setAudio(Boolean audio) {
            this.audio = audio;
            return this;
        }
        public Boolean getAudio() {
            return this.audio;
        }

        public ListModelsResponseBodyItemsCapabilities setDocument(Boolean document) {
            this.document = document;
            return this;
        }
        public Boolean getDocument() {
            return this.document;
        }

        public ListModelsResponseBodyItemsCapabilities setMultiToolCall(Boolean multiToolCall) {
            this.multiToolCall = multiToolCall;
            return this;
        }
        public Boolean getMultiToolCall() {
            return this.multiToolCall;
        }

        public ListModelsResponseBodyItemsCapabilities setReasoning(Boolean reasoning) {
            this.reasoning = reasoning;
            return this;
        }
        public Boolean getReasoning() {
            return this.reasoning;
        }

        public ListModelsResponseBodyItemsCapabilities setStreamToolCall(Boolean streamToolCall) {
            this.streamToolCall = streamToolCall;
            return this;
        }
        public Boolean getStreamToolCall() {
            return this.streamToolCall;
        }

        public ListModelsResponseBodyItemsCapabilities setToolCall(Boolean toolCall) {
            this.toolCall = toolCall;
            return this;
        }
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public ListModelsResponseBodyItemsCapabilities setVideo(Boolean video) {
            this.video = video;
            return this;
        }
        public Boolean getVideo() {
            return this.video;
        }

        public ListModelsResponseBodyItemsCapabilities setVision(Boolean vision) {
            this.vision = vision;
            return this;
        }
        public Boolean getVision() {
            return this.vision;
        }

    }

    public static class ListModelsResponseBodyItems extends TeaModel {
        /**
         * <p>The model capability configuration.</p>
         */
        @NameInMap("capabilities")
        public ListModelsResponseBodyItemsCapabilities capabilities;

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
         * <p>The time when the resource was created, in RFC 3339 UTC format.</p>
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
         * <p>The maximum number of output tokens supported by the model in a single generation.</p>
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
         * <p>The time when the resource was last updated, in RFC 3339 UTC format.</p>
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

        public static ListModelsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListModelsResponseBodyItems self = new ListModelsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListModelsResponseBodyItems setCapabilities(ListModelsResponseBodyItemsCapabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public ListModelsResponseBodyItemsCapabilities getCapabilities() {
            return this.capabilities;
        }

        public ListModelsResponseBodyItems setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public ListModelsResponseBodyItems setContextSize(Long contextSize) {
            this.contextSize = contextSize;
            return this;
        }
        public Long getContextSize() {
            return this.contextSize;
        }

        public ListModelsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListModelsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelsResponseBodyItems setMaxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        public ListModelsResponseBodyItems setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListModelsResponseBodyItems setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListModelsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListModelsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
