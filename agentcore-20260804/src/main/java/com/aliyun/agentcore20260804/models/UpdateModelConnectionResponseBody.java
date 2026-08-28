// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelConnectionResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The updated model connection information.</p>
     */
    @NameInMap("data")
    public UpdateModelConnectionResponseBodyData data;

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

    public static UpdateModelConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelConnectionResponseBody self = new UpdateModelConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelConnectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateModelConnectionResponseBody setData(UpdateModelConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateModelConnectionResponseBodyData getData() {
        return this.data;
    }

    public UpdateModelConnectionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateModelConnectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateModelConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateModelConnectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateModelConnectionResponseBodyData extends TeaModel {
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
         * <p>The time when the resource was created, in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-09T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Indicates whether access credentials have been configured for the model connection.</p>
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
         * <p>The absolute HTTP or HTTPS address of the upstream model service. The address can be up to 1024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The model connection name. The name must be 1 to 128 non-whitespace characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The model invocation protocol. Currently, only OpenAI/v1 is supported. If not specified in Settings when the model connection is created, this default value is used.</p>
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
         * <p>The failure summary returned when the model connection fails to be published or fails to be deleted but remains in the Deleting state. This value is empty for other states.</p>
         * 
         * <strong>example:</strong>
         * <p>GatewayOperationException</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

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

        public static UpdateModelConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelConnectionResponseBodyData self = new UpdateModelConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateModelConnectionResponseBodyData setApiKeyCount(Integer apiKeyCount) {
            this.apiKeyCount = apiKeyCount;
            return this;
        }
        public Integer getApiKeyCount() {
            return this.apiKeyCount;
        }

        public UpdateModelConnectionResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public UpdateModelConnectionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateModelConnectionResponseBodyData setCredentialConfigured(Boolean credentialConfigured) {
            this.credentialConfigured = credentialConfigured;
            return this;
        }
        public Boolean getCredentialConfigured() {
            return this.credentialConfigured;
        }

        public UpdateModelConnectionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateModelConnectionResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateModelConnectionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateModelConnectionResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateModelConnectionResponseBodyData setProviderType(String providerType) {
            this.providerType = providerType;
            return this;
        }
        public String getProviderType() {
            return this.providerType;
        }

        public UpdateModelConnectionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateModelConnectionResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public UpdateModelConnectionResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateModelConnectionResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
