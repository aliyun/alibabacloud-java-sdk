// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetCredentialResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetCredentialResponseBodyData data;

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
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialResponseBody self = new GetCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCredentialResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCredentialResponseBody setData(GetCredentialResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCredentialResponseBodyData getData() {
        return this.data;
    }

    public GetCredentialResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCredentialResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCredentialResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCredentialResponseBodyDataBoundAgents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>agent-123456</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>agent-01</p>
         */
        @NameInMap("agentName")
        public String agentName;

        public static GetCredentialResponseBodyDataBoundAgents build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyDataBoundAgents self = new GetCredentialResponseBodyDataBoundAgents();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyDataBoundAgents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetCredentialResponseBodyDataBoundAgents setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

    }

    public static class GetCredentialResponseBodyData extends TeaModel {
        @NameInMap("boundAgents")
        public java.util.List<GetCredentialResponseBodyDataBoundAgents> boundAgents;

        /**
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>cred-123456</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;apiKey&quot;:&quot;****************&quot;}</p>
         */
        @NameInMap("credentialMetadata")
        public String credentialMetadata;

        /**
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        @NameInMap("credentialType")
        public String credentialType;

        /**
         * <strong>example:</strong>
         * <p>线上环境调用模型服务使用的 API Key</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>model-api-key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetCredentialResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialResponseBodyData self = new GetCredentialResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCredentialResponseBodyData setBoundAgents(java.util.List<GetCredentialResponseBodyDataBoundAgents> boundAgents) {
            this.boundAgents = boundAgents;
            return this;
        }
        public java.util.List<GetCredentialResponseBodyDataBoundAgents> getBoundAgents() {
            return this.boundAgents;
        }

        public GetCredentialResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCredentialResponseBodyData setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public GetCredentialResponseBodyData setCredentialMetadata(String credentialMetadata) {
            this.credentialMetadata = credentialMetadata;
            return this;
        }
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        public GetCredentialResponseBodyData setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public GetCredentialResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCredentialResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCredentialResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCredentialResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetCredentialResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
