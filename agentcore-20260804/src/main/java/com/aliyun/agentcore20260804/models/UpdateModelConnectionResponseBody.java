// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelConnectionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateModelConnectionResponseBodyData data;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("apiKeyCount")
        public Integer apiKeyCount;

        @NameInMap("connectionId")
        public String connectionId;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("credentialConfigured")
        public Boolean credentialConfigured;

        @NameInMap("description")
        public String description;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("name")
        public String name;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("providerType")
        public String providerType;

        @NameInMap("status")
        public String status;

        @NameInMap("statusReason")
        public String statusReason;

        @NameInMap("updatedAt")
        public String updatedAt;

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
