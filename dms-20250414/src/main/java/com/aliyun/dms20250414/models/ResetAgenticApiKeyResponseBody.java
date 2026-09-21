// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ResetAgenticApiKeyResponseBody extends TeaModel {
    /**
     * <p>The Access Token information returned after a successful reset. The Secret field contains the new plaintext Secret, which is returned only once in this response.</p>
     */
    @NameInMap("Data")
    public ResetAgenticApiKeyResponseBodyData data;

    /**
     * <p>The error code returned when the request fails. You can use this code to programmatically determine the failure type. This value is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>ACCESS_TOKEN_NOT_FOUND</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the request fails. This message helps you locate the issue. This value is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>access token not found: 1024</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The unique request ID, which is used for troubleshooting and log correlation.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6C-2C4DD51BD5E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of true indicates that the reset was successful. A value of false indicates a failure. In this case, check ErrorCode and ErrorMessage to identify the cause.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ResetAgenticApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAgenticApiKeyResponseBody self = new ResetAgenticApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAgenticApiKeyResponseBody setData(ResetAgenticApiKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetAgenticApiKeyResponseBodyData getData() {
        return this.data;
    }

    public ResetAgenticApiKeyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ResetAgenticApiKeyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ResetAgenticApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetAgenticApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ResetAgenticApiKeyResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Agent to which the Access Token belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-7f3c9a2b</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The name of the Agent to which the Access Token belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my-data-agent</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The type of the Agent to which the Access Token belongs. Valid values:</p>
         * <ul>
         * <li>HUMAN_BOUND: fully inherits the permissions of the associated user.</li>
         * <li>PERMISSION_NARROW: narrows the permissions based on the associated user\&quot;s permission baseline.</li>
         * <li>AGENT_BOUND: inherits the permissions of the parent Agent.</li>
         * <li>STANDALONE: holds permissions as an independent identity principal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDALONE</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The time when the Access Token was created, in the yyyy-MM-dd HH:mm:ss format (UTC+8). This value remains unchanged after the reset.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-13 08:00:00</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The user ID of the Access Token creator.</p>
         * 
         * <strong>example:</strong>
         * <p>27400000000000001</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The display name of the Access Token creator.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The description of the Access Token. This value remains unchanged after the reset.</p>
         * 
         * <strong>example:</strong>
         * <p>Access token used by the data analysis agent</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The expiration time of the Access Token, in the yyyy-MM-dd HH:mm:ss format (UTC+8). If ExpireAfterSeconds is specified, the expiration time is recalculated from the time of the reset. If ExpireAfterSeconds is not specified, the original expiration time is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>2027-05-13 10:20:30</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the reset Access Token. This value remains unchanged after the reset.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the Access Token has been revoked. An Access Token returned after a successful reset is always in the non-revoked state (false).</p>
         */
        @NameInMap("IsRevoked")
        public Boolean isRevoked;

        /**
         * <p>The visible prefix of the Access Token, which is used to identify the Access Token without exposing the full Secret. This value remains unchanged after the reset.</p>
         * 
         * <strong>example:</strong>
         * <p>dms_sk_3f9a</p>
         */
        @NameInMap("KeyPrefix")
        public String keyPrefix;

        /**
         * <p>The time when the Access Token was last used, in the yyyy-MM-dd HH:mm:ss format (UTC+8). This value is empty if the Access Token has never been used.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-13 09:15:00</p>
         */
        @NameInMap("LastUsedTime")
        public String lastUsedTime;

        /**
         * <p>The name of the Access Token. This value remains unchanged after the reset.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-readonly-key</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The new plaintext Secret generated by this reset. This value is returned only once in this response and will not be returned by any subsequent operation. Store it securely right away. The old Secret becomes invalid immediately after the reset.</p>
         * 
         * <strong>example:</strong>
         * <p>dms_sk_3f9a1c8e5b7d4062a1f6c9e2b8d05a3f</p>
         */
        @NameInMap("Secret")
        public String secret;

        /**
         * <p>The credential source of the Access Token. The reset operation supports only Access Tokens issued by the console. Therefore, the value is always console.</p>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The reminder information related to this reset, such as a notice that the new Secret is returned only once and must be stored immediately. This value is empty if no reminder exists.</p>
         * 
         * <strong>example:</strong>
         * <p>The new secret is shown only once. Please store it securely now.</p>
         */
        @NameInMap("Warning")
        public String warning;

        public static ResetAgenticApiKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetAgenticApiKeyResponseBodyData self = new ResetAgenticApiKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetAgenticApiKeyResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ResetAgenticApiKeyResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ResetAgenticApiKeyResponseBodyData setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public ResetAgenticApiKeyResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ResetAgenticApiKeyResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ResetAgenticApiKeyResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ResetAgenticApiKeyResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ResetAgenticApiKeyResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ResetAgenticApiKeyResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ResetAgenticApiKeyResponseBodyData setIsRevoked(Boolean isRevoked) {
            this.isRevoked = isRevoked;
            return this;
        }
        public Boolean getIsRevoked() {
            return this.isRevoked;
        }

        public ResetAgenticApiKeyResponseBodyData setKeyPrefix(String keyPrefix) {
            this.keyPrefix = keyPrefix;
            return this;
        }
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        public ResetAgenticApiKeyResponseBodyData setLastUsedTime(String lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public String getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ResetAgenticApiKeyResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ResetAgenticApiKeyResponseBodyData setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public ResetAgenticApiKeyResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ResetAgenticApiKeyResponseBodyData setWarning(String warning) {
            this.warning = warning;
            return this;
        }
        public String getWarning() {
            return this.warning;
        }

    }

}
