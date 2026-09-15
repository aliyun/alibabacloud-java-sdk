// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAgentResponseBody extends TeaModel {
    /**
     * <p>The agent information and the automatically issued API key returned after the agent is created.</p>
     */
    @NameInMap("Data")
    public CreateAgentResponseBodyData data;

    /**
     * <p>The status code of the request result. A value of success indicates success. A specific error code is returned upon failure.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the request fails. This parameter is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>agentName must not be blank</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The unique ID of the request. You can use this ID for troubleshooting and tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentResponseBody self = new CreateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentResponseBody setData(CreateAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgentResponseBodyData getData() {
        return this.data;
    }

    public CreateAgentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateAgentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgentResponseBodyDataApiKey extends TeaModel {
        /**
         * <p>The ID of the agent to which the API key belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>agt-1a2b3c4d5e6f</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The name of the agent to which the API key belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>order-analysis-agent</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The permission inheritance type of the agent to which the API key belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>HUMAN_BOUND</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The time when the API key was created. The value is a time string in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The user ID of the user who created the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>usr-1a2b3c4d</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The name of the user who created the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The description of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>Access Token automatically issued when the Agent is created</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The expiration time of the API key. The value is a time string in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-11T14:04:32Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The primary key ID of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the API key has been revoked.</p>
         */
        @NameInMap("IsRevoked")
        public Boolean isRevoked;

        /**
         * <p>The non-sensitive visible prefix of the API key plaintext, used to identify the credential. The plaintext secret is not returned again.</p>
         * 
         * <strong>example:</strong>
         * <p>dms_sk_1a2b</p>
         */
        @NameInMap("KeyPrefix")
        public String keyPrefix;

        /**
         * <p>The time when the API key was last used. The value is a time string in RFC 3339 format. This parameter is empty if the API key has never been used.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-12T09:30:00Z</p>
         */
        @NameInMap("LastUsedTime")
        public String lastUsedTime;

        /**
         * <p>The name of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>order-analysis-agent-default</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The plaintext secret of the API key. This value is returned only once in this creation response. Store it securely. Subsequent API calls do not return the plaintext secret again.</p>
         * 
         * <strong>example:</strong>
         * <p>dms_sk_1a2b3c4d****</p>
         */
        @NameInMap("Secret")
        public String secret;

        /**
         * <p>The credential source. Valid values: console (issued from the console), oauth (issued through the OAuth flow), install_token (issued through the install-and-authenticate flow). The API key automatically issued by this operation is always console.</p>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        @NameInMap("Source")
        public String source;

        public static CreateAgentResponseBodyDataApiKey build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentResponseBodyDataApiKey self = new CreateAgentResponseBodyDataApiKey();
            return TeaModel.build(map, self);
        }

        public CreateAgentResponseBodyDataApiKey setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateAgentResponseBodyDataApiKey setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CreateAgentResponseBodyDataApiKey setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public CreateAgentResponseBodyDataApiKey setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateAgentResponseBodyDataApiKey setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public CreateAgentResponseBodyDataApiKey setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public CreateAgentResponseBodyDataApiKey setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAgentResponseBodyDataApiKey setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateAgentResponseBodyDataApiKey setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateAgentResponseBodyDataApiKey setIsRevoked(Boolean isRevoked) {
            this.isRevoked = isRevoked;
            return this;
        }
        public Boolean getIsRevoked() {
            return this.isRevoked;
        }

        public CreateAgentResponseBodyDataApiKey setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public CreateAgentResponseBodyDataApiKey setLastUsedTime(String lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public String getLastUsedTime() {
            return this.lastUsedTime;
        }

        public CreateAgentResponseBodyDataApiKey setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAgentResponseBodyDataApiKey setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public CreateAgentResponseBodyDataApiKey setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class CreateAgentResponseBodyData extends TeaModel {
        /**
         * <p>The globally unique ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agt-1a2b3c4d5e6f</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>order-analysis-agent</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The permission inheritance type of the agent. Valid values: HUMAN_BOUND (inherits user permissions), PERMISSION_NARROW (narrows permissions), STANDALONE (operates as an independent identity principal without inheriting permissions from other principals).</p>
         * 
         * <strong>example:</strong>
         * <p>HUMAN_BOUND</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The automatically issued API key for the new agent. The plaintext secret is returned only once in this response.</p>
         */
        @NameInMap("ApiKey")
        public CreateAgentResponseBodyDataApiKey apiKey;

        /**
         * <p>The time when the agent was created. The value is a time string in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T14:04:32Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The creation method of the agent. Valid values: manual (manually created in the console), auto (automatic creation by the system). Agents created by this operation are always manual.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("CreationType")
        public String creationType;

        /**
         * <p>The description of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>An agent for querying and analyzing order data</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user ID of the agent owner, which is the current user who initiated the creation request.</p>
         * 
         * <strong>example:</strong>
         * <p>usr-1a2b3c4d</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The status of the agent. Valid values: active (enabled), disabled (disabled), deleted (deleted). A newly created agent is always active.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentResponseBodyData self = new CreateAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateAgentResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CreateAgentResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public CreateAgentResponseBodyData setApiKey(CreateAgentResponseBodyDataApiKey apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public CreateAgentResponseBodyDataApiKey getApiKey() {
            return this.apiKey;
        }

        public CreateAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateAgentResponseBodyData setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public CreateAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAgentResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public CreateAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
