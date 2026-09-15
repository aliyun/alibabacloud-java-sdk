// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAgentResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateAgentResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("AgentType")
        public String agentType;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsRevoked")
        public Boolean isRevoked;

        @NameInMap("KeyPrefix")
        public String keyPrefix;

        @NameInMap("LastUsedTime")
        public String lastUsedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Secret")
        public String secret;

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
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("AgentType")
        public String agentType;

        @NameInMap("ApiKey")
        public CreateAgentResponseBodyDataApiKey apiKey;

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
