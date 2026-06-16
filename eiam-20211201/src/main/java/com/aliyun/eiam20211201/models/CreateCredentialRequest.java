// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCredentialRequest extends TeaModel {
    /**
     * <p>A client-generated token that ensures the idempotence of the request. This token must be a unique value that contains only ASCII characters and is no more than 64 characters long. For more information, see <a href="https://www.alibabacloud.com/help/zh/ecs/developer-reference/how-to-ensure-idempotence">How to ensure idempotence</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The credential content.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CredentialContent")
    public CreateCredentialRequestCredentialContent credentialContent;

    @NameInMap("CredentialExternalId")
    public String credentialExternalId;

    /**
     * <p>The credential identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_identifier_test</p>
     */
    @NameInMap("CredentialIdentifier")
    public String credentialIdentifier;

    /**
     * <p>The credential name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_name</p>
     */
    @NameInMap("CredentialName")
    public String credentialName;

    /**
     * <p>The use case label of the credential. Valid values:</p>
     * <ul>
     * <li><p><code>llm</code>: large language model.</p>
     * </li>
     * <li><p><code>saas</code>: third-party SaaS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("CredentialScenarioLabel")
    public String credentialScenarioLabel;

    @NameInMap("CredentialSharingScope")
    public String credentialSharingScope;

    /**
     * <p>The ID of the credential\&quot;s subject.</p>
     * 
     * <strong>example:</strong>
     * <p>apt_werthgfdsasffxxxxx</p>
     */
    @NameInMap("CredentialSubjectId")
    public String credentialSubjectId;

    /**
     * <p>The subject type of the credential. Valid value:</p>
     * <ul>
     * <li><code>authentication_token_provider</code>: an authentication token provider.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>authentication_token_provider</p>
     */
    @NameInMap("CredentialSubjectType")
    public String credentialSubjectType;

    /**
     * <p>The credential type. Valid values:</p>
     * <ul>
     * <li><p><code>api_key</code>: an API key.</p>
     * </li>
     * <li><p><code>oauth_client</code>: an OAuth client.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api_key</p>
     */
    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>The credential description.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_description</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("ExclusiveUserId")
    public String exclusiveUserId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialRequest self = new CreateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateCredentialRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCredentialRequest setCredentialContent(CreateCredentialRequestCredentialContent credentialContent) {
        this.credentialContent = credentialContent;
        return this;
    }
    public CreateCredentialRequestCredentialContent getCredentialContent() {
        return this.credentialContent;
    }

    public CreateCredentialRequest setCredentialExternalId(String credentialExternalId) {
        this.credentialExternalId = credentialExternalId;
        return this;
    }
    public String getCredentialExternalId() {
        return this.credentialExternalId;
    }

    public CreateCredentialRequest setCredentialIdentifier(String credentialIdentifier) {
        this.credentialIdentifier = credentialIdentifier;
        return this;
    }
    public String getCredentialIdentifier() {
        return this.credentialIdentifier;
    }

    public CreateCredentialRequest setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

    public CreateCredentialRequest setCredentialScenarioLabel(String credentialScenarioLabel) {
        this.credentialScenarioLabel = credentialScenarioLabel;
        return this;
    }
    public String getCredentialScenarioLabel() {
        return this.credentialScenarioLabel;
    }

    public CreateCredentialRequest setCredentialSharingScope(String credentialSharingScope) {
        this.credentialSharingScope = credentialSharingScope;
        return this;
    }
    public String getCredentialSharingScope() {
        return this.credentialSharingScope;
    }

    public CreateCredentialRequest setCredentialSubjectId(String credentialSubjectId) {
        this.credentialSubjectId = credentialSubjectId;
        return this;
    }
    public String getCredentialSubjectId() {
        return this.credentialSubjectId;
    }

    public CreateCredentialRequest setCredentialSubjectType(String credentialSubjectType) {
        this.credentialSubjectType = credentialSubjectType;
        return this;
    }
    public String getCredentialSubjectType() {
        return this.credentialSubjectType;
    }

    public CreateCredentialRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public CreateCredentialRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCredentialRequest setExclusiveUserId(String exclusiveUserId) {
        this.exclusiveUserId = exclusiveUserId;
        return this;
    }
    public String getExclusiveUserId() {
        return this.exclusiveUserId;
    }

    public CreateCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class CreateCredentialRequestCredentialContentApiKeyContent extends TeaModel {
        /**
         * <p>The API key.</p>
         * 
         * <strong>example:</strong>
         * <p>nsklnertyt5ddwizncxxxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        public static CreateCredentialRequestCredentialContentApiKeyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialRequestCredentialContentApiKeyContent self = new CreateCredentialRequestCredentialContentApiKeyContent();
            return TeaModel.build(map, self);
        }

        public CreateCredentialRequestCredentialContentApiKeyContent setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

    }

    public static class CreateCredentialRequestCredentialContentOAuthClientContent extends TeaModel {
        /**
         * <p>The <code>client_id</code> of the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>dmvncmxersdxxxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The <code>client_secret</code> of the OAuth protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>nsklncmwizncxxxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        public static CreateCredentialRequestCredentialContentOAuthClientContent build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialRequestCredentialContentOAuthClientContent self = new CreateCredentialRequestCredentialContentOAuthClientContent();
            return TeaModel.build(map, self);
        }

        public CreateCredentialRequestCredentialContentOAuthClientContent setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public CreateCredentialRequestCredentialContentOAuthClientContent setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class CreateCredentialRequestCredentialContent extends TeaModel {
        /**
         * <p>The credential content of the API key type.</p>
         */
        @NameInMap("ApiKeyContent")
        public CreateCredentialRequestCredentialContentApiKeyContent apiKeyContent;

        /**
         * <p>The credential content of the OAuth client type.</p>
         */
        @NameInMap("OAuthClientContent")
        public CreateCredentialRequestCredentialContentOAuthClientContent OAuthClientContent;

        public static CreateCredentialRequestCredentialContent build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialRequestCredentialContent self = new CreateCredentialRequestCredentialContent();
            return TeaModel.build(map, self);
        }

        public CreateCredentialRequestCredentialContent setApiKeyContent(CreateCredentialRequestCredentialContentApiKeyContent apiKeyContent) {
            this.apiKeyContent = apiKeyContent;
            return this;
        }
        public CreateCredentialRequestCredentialContentApiKeyContent getApiKeyContent() {
            return this.apiKeyContent;
        }

        public CreateCredentialRequestCredentialContent setOAuthClientContent(CreateCredentialRequestCredentialContentOAuthClientContent OAuthClientContent) {
            this.OAuthClientContent = OAuthClientContent;
            return this;
        }
        public CreateCredentialRequestCredentialContentOAuthClientContent getOAuthClientContent() {
            return this.OAuthClientContent;
        }

    }

}
