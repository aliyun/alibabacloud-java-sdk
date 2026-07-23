// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticAgentByInstallTokenResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAgenticAgentByInstallTokenResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgenticAgentByInstallTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticAgentByInstallTokenResponseBody self = new GetAgenticAgentByInstallTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgenticAgentByInstallTokenResponseBody setData(GetAgenticAgentByInstallTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgenticAgentByInstallTokenResponseBodyData getData() {
        return this.data;
    }

    public GetAgenticAgentByInstallTokenResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAgenticAgentByInstallTokenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAgenticAgentByInstallTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgenticAgentByInstallTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgenticAgentByInstallTokenResponseBodyData extends TeaModel {
        @NameInMap("ActiveApiKeyPrefixes")
        public java.util.List<String> activeApiKeyPrefixes;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("AgentType")
        public String agentType;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CreationType")
        public String creationType;

        @NameInMap("Description")
        public String description;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Status")
        public String status;

        public static GetAgenticAgentByInstallTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgenticAgentByInstallTokenResponseBodyData self = new GetAgenticAgentByInstallTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgenticAgentByInstallTokenResponseBodyData setActiveApiKeyPrefixes(java.util.List<String> activeApiKeyPrefixes) {
            this.activeApiKeyPrefixes = activeApiKeyPrefixes;
            return this;
        }
        public java.util.List<String> getActiveApiKeyPrefixes() {
            return this.activeApiKeyPrefixes;
        }

        public GetAgenticAgentByInstallTokenResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetAgenticAgentByInstallTokenResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public GetAgenticAgentByInstallTokenResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public GetAgenticAgentByInstallTokenResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetAgenticAgentByInstallTokenResponseBodyData setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public GetAgenticAgentByInstallTokenResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgenticAgentByInstallTokenResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetAgenticAgentByInstallTokenResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
