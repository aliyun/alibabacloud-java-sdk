// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCredentialResponseBody extends TeaModel {
    /**
     * <p>The creation time of the credential, formatted as a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1649830225000</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The detailed content of the credential. The structure of this object depends on the value of <code>credentialType</code>.</p>
     */
    @NameInMap("credentialContent")
    public ObtainCredentialResponseBodyCredentialContent credentialContent;

    /**
     * <p>Indicates how the credential was created. Valid values:</p>
     * <ul>
     * <li><p><code>system_init</code>: System-initiated.</p>
     * </li>
     * <li><p><code>user_custom</code>: User-created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user_custom</p>
     */
    @NameInMap("credentialCreationType")
    public String credentialCreationType;

    @NameInMap("credentialExternalId")
    public String credentialExternalId;

    /**
     * <p>The credential ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <p>The credential identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_identifier_test</p>
     */
    @NameInMap("credentialIdentifier")
    public String credentialIdentifier;

    /**
     * <p>The credential name.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_name</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    /**
     * <p>The usage scenario for the credential. Valid values:</p>
     * <ul>
     * <li><p><code>llm</code>: For use with a large language model.</p>
     * </li>
     * <li><p><code>saas</code>: For use with a third-party SaaS application.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("credentialScenarioLabel")
    public String credentialScenarioLabel;

    /**
     * <p>The sharing scope of the credential, such as whether it is exclusive to a specific account.</p>
     * 
     * <strong>example:</strong>
     * <p>user_exclusive</p>
     */
    @NameInMap("credentialSharingScope")
    public String credentialSharingScope;

    /**
     * <p>The ID of the credential\&quot;s subject.</p>
     * 
     * <strong>example:</strong>
     * <p>apt_werthgfdsasffxxxxx</p>
     */
    @NameInMap("credentialSubjectId")
    public String credentialSubjectId;

    /**
     * <p>The credential\&quot;s subject type. Valid values:</p>
     * <ul>
     * <li><code>authentication_token_provider</code>: An authentication token provider.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>authentication_token_provider</p>
     */
    @NameInMap("credentialSubjectType")
    public String credentialSubjectType;

    /**
     * <p>The credential type. Valid values:</p>
     * <ul>
     * <li><p><code>api_key</code>: The credential is an API key.</p>
     * </li>
     * <li><p><code>oauth_client</code>: The credential represents an OAuth client.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>api_key</p>
     */
    @NameInMap("credentialType")
    public String credentialType;

    /**
     * <p>The credential description.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The ID of the account that exclusively owns the credential. This field is present only when <code>credentialSharingScope</code> is <code>user_exclusive</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>user_xxx</p>
     */
    @NameInMap("exclusiveUserId")
    public String exclusiveUserId;

    /**
     * <p>The EIAM instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The status of the credential. Valid values:</p>
     * <ul>
     * <li><p><code>enabled</code>: The credential can be used.</p>
     * </li>
     * <li><p><code>disabled</code>: The credential cannot be used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The last update time of the credential, formatted as a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1649830227000</p>
     */
    @NameInMap("updateTime")
    public Long updateTime;

    public static ObtainCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ObtainCredentialResponseBody self = new ObtainCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public ObtainCredentialResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ObtainCredentialResponseBody setCredentialContent(ObtainCredentialResponseBodyCredentialContent credentialContent) {
        this.credentialContent = credentialContent;
        return this;
    }
    public ObtainCredentialResponseBodyCredentialContent getCredentialContent() {
        return this.credentialContent;
    }

    public ObtainCredentialResponseBody setCredentialCreationType(String credentialCreationType) {
        this.credentialCreationType = credentialCreationType;
        return this;
    }
    public String getCredentialCreationType() {
        return this.credentialCreationType;
    }

    public ObtainCredentialResponseBody setCredentialExternalId(String credentialExternalId) {
        this.credentialExternalId = credentialExternalId;
        return this;
    }
    public String getCredentialExternalId() {
        return this.credentialExternalId;
    }

    public ObtainCredentialResponseBody setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public ObtainCredentialResponseBody setCredentialIdentifier(String credentialIdentifier) {
        this.credentialIdentifier = credentialIdentifier;
        return this;
    }
    public String getCredentialIdentifier() {
        return this.credentialIdentifier;
    }

    public ObtainCredentialResponseBody setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public ObtainCredentialResponseBody setCredentialScenarioLabel(String credentialScenarioLabel) {
        this.credentialScenarioLabel = credentialScenarioLabel;
        return this;
    }
    public String getCredentialScenarioLabel() {
        return this.credentialScenarioLabel;
    }

    public ObtainCredentialResponseBody setCredentialSharingScope(String credentialSharingScope) {
        this.credentialSharingScope = credentialSharingScope;
        return this;
    }
    public String getCredentialSharingScope() {
        return this.credentialSharingScope;
    }

    public ObtainCredentialResponseBody setCredentialSubjectId(String credentialSubjectId) {
        this.credentialSubjectId = credentialSubjectId;
        return this;
    }
    public String getCredentialSubjectId() {
        return this.credentialSubjectId;
    }

    public ObtainCredentialResponseBody setCredentialSubjectType(String credentialSubjectType) {
        this.credentialSubjectType = credentialSubjectType;
        return this;
    }
    public String getCredentialSubjectType() {
        return this.credentialSubjectType;
    }

    public ObtainCredentialResponseBody setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public ObtainCredentialResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ObtainCredentialResponseBody setExclusiveUserId(String exclusiveUserId) {
        this.exclusiveUserId = exclusiveUserId;
        return this;
    }
    public String getExclusiveUserId() {
        return this.exclusiveUserId;
    }

    public ObtainCredentialResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ObtainCredentialResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ObtainCredentialResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static class ObtainCredentialResponseBodyCredentialContentApiKeyContent extends TeaModel {
        /**
         * <p>The API key value.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-nsklncmwizncxxxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        public static ObtainCredentialResponseBodyCredentialContentApiKeyContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredentialContentApiKeyContent self = new ObtainCredentialResponseBodyCredentialContentApiKeyContent();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredentialContentApiKeyContent setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

    }

    public static class ObtainCredentialResponseBodyCredentialContentOauthClientContent extends TeaModel {
        /**
         * <p>The <code>client_id</code> for OAuth 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>dmvncmxersdxxxxxx</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>The <code>client_secret</code> for OAuth 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>nsklnertyt5ddwizncxxxx</p>
         */
        @NameInMap("clientSecret")
        public String clientSecret;

        public static ObtainCredentialResponseBodyCredentialContentOauthClientContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredentialContentOauthClientContent self = new ObtainCredentialResponseBodyCredentialContentOauthClientContent();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredentialContentOauthClientContent setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ObtainCredentialResponseBodyCredentialContentOauthClientContent setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class ObtainCredentialResponseBodyCredentialContent extends TeaModel {
        /**
         * <p>Contains details for an API key credential. Returned only when <code>credentialType</code> is <code>api_key</code>.</p>
         */
        @NameInMap("apiKeyContent")
        public ObtainCredentialResponseBodyCredentialContentApiKeyContent apiKeyContent;

        /**
         * <p>Contains details for an OAuth client credential. Returned only when <code>credentialType</code> is <code>oauth_client</code>.</p>
         */
        @NameInMap("oauthClientContent")
        public ObtainCredentialResponseBodyCredentialContentOauthClientContent oauthClientContent;

        public static ObtainCredentialResponseBodyCredentialContent build(java.util.Map<String, ?> map) throws Exception {
            ObtainCredentialResponseBodyCredentialContent self = new ObtainCredentialResponseBodyCredentialContent();
            return TeaModel.build(map, self);
        }

        public ObtainCredentialResponseBodyCredentialContent setApiKeyContent(ObtainCredentialResponseBodyCredentialContentApiKeyContent apiKeyContent) {
            this.apiKeyContent = apiKeyContent;
            return this;
        }
        public ObtainCredentialResponseBodyCredentialContentApiKeyContent getApiKeyContent() {
            return this.apiKeyContent;
        }

        public ObtainCredentialResponseBodyCredentialContent setOauthClientContent(ObtainCredentialResponseBodyCredentialContentOauthClientContent oauthClientContent) {
            this.oauthClientContent = oauthClientContent;
            return this;
        }
        public ObtainCredentialResponseBodyCredentialContentOauthClientContent getOauthClientContent() {
            return this.oauthClientContent;
        }

    }

}
