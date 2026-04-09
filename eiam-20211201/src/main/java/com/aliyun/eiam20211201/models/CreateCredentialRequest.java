// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCredentialRequest extends TeaModel {
    /**
     * <p>保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>凭据的内容。</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CredentialContent")
    public CreateCredentialRequestCredentialContent credentialContent;

    /**
     * <p>凭据标识。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_identifier_test</p>
     */
    @NameInMap("CredentialIdentifier")
    public String credentialIdentifier;

    /**
     * <p>凭据名称。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_name</p>
     */
    @NameInMap("CredentialName")
    public String credentialName;

    /**
     * <p>凭据的使用场景标签。</p>
     * 
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("CredentialScenarioLabel")
    public String credentialScenarioLabel;

    @NameInMap("CredentialSharingScope")
    public String credentialSharingScope;

    /**
     * <p>凭据所属的主体ID。</p>
     * 
     * <strong>example:</strong>
     * <p>apt_werthgfdsasffxxxxx</p>
     */
    @NameInMap("CredentialSubjectId")
    public String credentialSubjectId;

    /**
     * <p>凭据所属的主体类型。</p>
     * 
     * <strong>example:</strong>
     * <p>authentication_token_provider</p>
     */
    @NameInMap("CredentialSubjectType")
    public String credentialSubjectType;

    /**
     * <p>凭据类型。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api_key</p>
     */
    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>credential_description</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("ExclusiveUserId")
    public String exclusiveUserId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
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
         * <p>API Key 凭证类型的凭据内容。</p>
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
         * <p>OAuth协议的client_id。</p>
         * 
         * <strong>example:</strong>
         * <p>dmvncmxersdxxxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>OAuth协议的client_secret。</p>
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
         * <p>Api Key的内容。</p>
         */
        @NameInMap("ApiKeyContent")
        public CreateCredentialRequestCredentialContentApiKeyContent apiKeyContent;

        /**
         * <p>OAuth客户端认证凭证类型的凭据内容。</p>
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
