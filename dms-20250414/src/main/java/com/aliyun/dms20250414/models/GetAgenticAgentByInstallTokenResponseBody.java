// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticAgentByInstallTokenResponseBody extends TeaModel {
    /**
     * <p>The agent information associated with the install token after redemption. This parameter is empty if the token has not been redeemed, or if the associated credential or agent does not exist.</p>
     */
    @NameInMap("Data")
    public GetAgenticAgentByInstallTokenResponseBodyData data;

    /**
     * <p>The error code returned when the request fails. Programs use this code to determine the failure type. This parameter is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTALL_TOKEN_INVALID</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the request fails. This message helps with manual troubleshooting. This parameter is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>install_token not found</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and log correlation.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6C-2C4DD51BD5E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates that the query succeeded. A value of false indicates that the query failed. In this case, you can use ErrorCode and ErrorMessage to identify the cause.</p>
     */
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
        /**
         * <p>The prefix list of visible access tokens that are neither revoked nor expired under the agent. This parameter is empty if no access tokens are returned or no access tokens meet the conditional criteria. The prefix is used only to identify the credential and does not contain the complete secret.</p>
         */
        @NameInMap("ActiveApiKeyPrefixes")
        public java.util.List<String> activeApiKeyPrefixes;

        /**
         * <p>The unique identifier of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-7f3c9a2b</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-data-agent</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The permission type of the agent. Valid values: HUMAN_BOUND (inherits user permissions), PERMISSION_NARROW (narrowed down from user permissions), and STANDALONE (independent permissions). The agent generated through the install token redemption process is of the HUMAN_BOUND type.</p>
         * 
         * <strong>example:</strong>
         * <p>HUMAN_BOUND</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The creation time of the agent, in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-13 10:30:00</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The creation method of the agent. A value of auto indicates automatic creation by the system, and a value of manual indicates manual creation by a user. The agent generated through the install token redemption process is auto.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("CreationType")
        public String creationType;

        /**
         * <p>The description of the agent. This parameter is empty if it is not set.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent for data analytics</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the user to whom the agent belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>27400000000000001</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The status of the agent. A value of active indicates that the agent is enabled, and a value of disabled indicates that the agent is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
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
