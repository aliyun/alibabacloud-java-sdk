// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCredentialResponseBody extends TeaModel {
    /**
     * <p>The creation time, in UNIX timestamp format. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1649830225000</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The credential content.</p>
     */
    @NameInMap("credentialContent")
    public ObtainCredentialResponseBodyCredentialContent credentialContent;

    /**
     * <p>The creation type of the credential. Valid values:</p>
     * <ul>
     * <li>system_init: Created by the system.</li>
     * <li>user_custom: Created by the user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user_custom</p>
     */
    @NameInMap("credentialCreationType")
    public String credentialCreationType;

    /**
     * <p>The external unique identifier of the credential.</p>
     * 
     * <strong>example:</strong>
     * <p>23528e9957304f57b98112c72788b5xxxxx</p>
     */
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
     * <p>The Scenarios label of the credential. Valid values:</p>
     * <ul>
     * <li>llm: Large language model.</li>
     * <li>saas: Third-party SaaS service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("credentialScenarioLabel")
    public String credentialScenarioLabel;

    /**
     * <p>The credential sharing scope.</p>
     * 
     * <strong>example:</strong>
     * <p>user_exclusive</p>
     */
    @NameInMap("credentialSharingScope")
    public String credentialSharingScope;

    /**
     * <p>The subject ID that the credential belongs to.</p>
     * 
     * <strong>example:</strong>
     * <p>apt_werthgfdsasffxxxxx</p>
     */
    @NameInMap("credentialSubjectId")
    public String credentialSubjectId;

    /**
     * <p>The subject type that the credential belongs to. Valid values:</p>
     * <ul>
     * <li>authentication_token_provider: Authentication token provider.</li>
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
     * <li>api_key: API Key authentication credential.</li>
     * <li>oauth_client: OAuth client authentication credential.</li>
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
     * <p>The exclusive account ID of the credential.</p>
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
     * <p>The credential status. Valid values:</p>
     * <ul>
     * <li>enabled: Enabled.</li>
     * <li>disabled: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The update time, in UNIX timestamp format. Unit: milliseconds.</p>
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
         * <p>The value of the API Key.</p>
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
         * <p>The client_id of the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>dmvncmxersdxxxxxx</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>The client_secret of the OAuth protocol.</p>
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
         * <p>The credential content of the API Key credential type.</p>
         */
        @NameInMap("apiKeyContent")
        public ObtainCredentialResponseBodyCredentialContentApiKeyContent apiKeyContent;

        /**
         * <p>The credential content of the OAuth client authentication credential type.</p>
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
