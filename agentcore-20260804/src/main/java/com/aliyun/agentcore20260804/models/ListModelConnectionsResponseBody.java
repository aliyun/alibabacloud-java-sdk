// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListModelConnectionsResponseBody extends TeaModel {
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
     * <p>The list of model connections.</p>
     */
    @NameInMap("items")
    public java.util.List<ListModelConnectionsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 0 to 100. Default value: 10. If this parameter is not specified or is set to 0, the default value is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The message about the request processing result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token. Pass the token returned in the previous query for the current request. An empty response indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>bW9kZWwtbWFuYWdlbWVudC1vZmZzZXQ6bW9kZWwtY29ubmVjdGlvbjoxMA</p>
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
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of resources that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListModelConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelConnectionsResponseBody self = new ListModelConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelConnectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelConnectionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListModelConnectionsResponseBody setItems(java.util.List<ListModelConnectionsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListModelConnectionsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListModelConnectionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelConnectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListModelConnectionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListModelConnectionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelConnectionsResponseBodyItemsModels extends TeaModel {
        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>model-1</p>
         */
        @NameInMap("modelId")
        public String modelId;

        /**
         * <p>The name of the upstream model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        public static ListModelConnectionsResponseBodyItemsModels build(java.util.Map<String, ?> map) throws Exception {
            ListModelConnectionsResponseBodyItemsModels self = new ListModelConnectionsResponseBodyItemsModels();
            return TeaModel.build(map, self);
        }

        public ListModelConnectionsResponseBodyItemsModels setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public ListModelConnectionsResponseBodyItemsModels setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class ListModelConnectionsResponseBodyItems extends TeaModel {
        /**
         * <p>The number of API keys configured in the model connection.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("apiKeyCount")
        public Integer apiKeyCount;

        /**
         * <p>The model connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("connectionId")
        public String connectionId;

        /**
         * <p>The time when the resource was created. The time is displayed in the RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-09T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Indicates whether access credentials are configured for the model connection.</p>
         */
        @NameInMap("credentialConfigured")
        public Boolean credentialConfigured;

        /**
         * <p>The description of the model connection. The description can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The absolute HTTP or HTTPS URL of the upstream model service. The URL can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The list of summaries of models associated with the model connection.</p>
         */
        @NameInMap("models")
        public java.util.List<ListModelConnectionsResponseBodyItemsModels> models;

        /**
         * <p>The name of the model connection. The name must be 1 to 128 characters in length and cannot contain whitespace characters.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The model invocation protocol. Currently, only OpenAI/v1 is supported. If this parameter is not specified during model connection creation, this default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAI/v1</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The model provider type.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        @NameInMap("providerType")
        public String providerType;

        /**
         * <p>The resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The failure summary returned when the model connection fails to be published, or when deletion fails but the connection remains in the deleting state. This field is empty in other states.</p>
         * 
         * <strong>example:</strong>
         * <p>GatewayOperationException</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The time when the resource was last updated. The time is displayed in the RFC 3339 UTC format.</p>
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

        public static ListModelConnectionsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListModelConnectionsResponseBodyItems self = new ListModelConnectionsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListModelConnectionsResponseBodyItems setApiKeyCount(Integer apiKeyCount) {
            this.apiKeyCount = apiKeyCount;
            return this;
        }
        public Integer getApiKeyCount() {
            return this.apiKeyCount;
        }

        public ListModelConnectionsResponseBodyItems setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public ListModelConnectionsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListModelConnectionsResponseBodyItems setCredentialConfigured(Boolean credentialConfigured) {
            this.credentialConfigured = credentialConfigured;
            return this;
        }
        public Boolean getCredentialConfigured() {
            return this.credentialConfigured;
        }

        public ListModelConnectionsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModelConnectionsResponseBodyItems setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListModelConnectionsResponseBodyItems setModels(java.util.List<ListModelConnectionsResponseBodyItemsModels> models) {
            this.models = models;
            return this;
        }
        public java.util.List<ListModelConnectionsResponseBodyItemsModels> getModels() {
            return this.models;
        }

        public ListModelConnectionsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelConnectionsResponseBodyItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListModelConnectionsResponseBodyItems setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public ListModelConnectionsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListModelConnectionsResponseBodyItems setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListModelConnectionsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListModelConnectionsResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
