// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationProvisioningConfigRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application event callback synchronization configuration. This parameter is required when ProvisionProtocolType is set to idaas_callback.</p>
     */
    @NameInMap("CallbackProvisioningConfig")
    public SetApplicationProvisioningConfigRequestCallbackProvisioningConfig callbackProvisioningConfig;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The network endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>nae_examplexxxx</p>
     */
    @NameInMap("NetworkAccessEndpointId")
    public String networkAccessEndpointId;

    /**
     * <p>Indicates whether to synchronize passwords for IDaaS user event callbacks. Valid values:</p>
     * <ul>
     * <li><p>true: Synchronize passwords.</p>
     * </li>
     * <li><p>false: Do not synchronize passwords.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ProvisionPassword")
    public Boolean provisionPassword;

    /**
     * <p>The account synchronization protocol. Valid values:</p>
     * <ul>
     * <li><p>idaas_callback: IDaaS custom event callback for account synchronization.</p>
     * </li>
     * <li><p>scim2: System for Cross-domain Identity Management (SCIM) protocol for synchronization.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_callback</p>
     */
    @NameInMap("ProvisionProtocolType")
    public String provisionProtocolType;

    /**
     * <p>The IDaaS SCIM protocol synchronization configuration parameters. This parameter is required when ProvisionProtocolType is set to scim2.</p>
     */
    @NameInMap("ScimProvisioningConfig")
    public SetApplicationProvisioningConfigRequestScimProvisioningConfig scimProvisioningConfig;

    public static SetApplicationProvisioningConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationProvisioningConfigRequest self = new SetApplicationProvisioningConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetApplicationProvisioningConfigRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SetApplicationProvisioningConfigRequest setCallbackProvisioningConfig(SetApplicationProvisioningConfigRequestCallbackProvisioningConfig callbackProvisioningConfig) {
        this.callbackProvisioningConfig = callbackProvisioningConfig;
        return this;
    }
    public SetApplicationProvisioningConfigRequestCallbackProvisioningConfig getCallbackProvisioningConfig() {
        return this.callbackProvisioningConfig;
    }

    public SetApplicationProvisioningConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetApplicationProvisioningConfigRequest setNetworkAccessEndpointId(String networkAccessEndpointId) {
        this.networkAccessEndpointId = networkAccessEndpointId;
        return this;
    }
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    public SetApplicationProvisioningConfigRequest setProvisionPassword(Boolean provisionPassword) {
        this.provisionPassword = provisionPassword;
        return this;
    }
    public Boolean getProvisionPassword() {
        return this.provisionPassword;
    }

    public SetApplicationProvisioningConfigRequest setProvisionProtocolType(String provisionProtocolType) {
        this.provisionProtocolType = provisionProtocolType;
        return this;
    }
    public String getProvisionProtocolType() {
        return this.provisionProtocolType;
    }

    public SetApplicationProvisioningConfigRequest setScimProvisioningConfig(SetApplicationProvisioningConfigRequestScimProvisioningConfig scimProvisioningConfig) {
        this.scimProvisioningConfig = scimProvisioningConfig;
        return this;
    }
    public SetApplicationProvisioningConfigRequestScimProvisioningConfig getScimProvisioningConfig() {
        return this.scimProvisioningConfig;
    }

    public static class SetApplicationProvisioningConfigRequestCallbackProvisioningConfig extends TeaModel {
        /**
         * <p>The destination address where the application accepts IDaaS event callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/event/callback">https://example.com/event/callback</a></p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <p>The symmetric key for encrypting and decrypting IDaaS event callbacks. The key uses the AES-256 algorithm and is in hexadecimal format.</p>
         * 
         * <strong>example:</strong>
         * <p>ad3b248**************************b3561a73d7</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>Indicates whether to encrypt IDaaS event callback messages. Valid values:</p>
         * <ul>
         * <li><p>true: Encrypt the messages.</p>
         * </li>
         * <li><p>false: Do not encrypt the messages. The messages are transmitted in plaintext.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EncryptRequired")
        public Boolean encryptRequired;

        /**
         * <p>The list of message types for the IDaaS event callback listener.</p>
         */
        @NameInMap("ListenEventScopes")
        public java.util.List<String> listenEventScopes;

        public static SetApplicationProvisioningConfigRequestCallbackProvisioningConfig build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationProvisioningConfigRequestCallbackProvisioningConfig self = new SetApplicationProvisioningConfigRequestCallbackProvisioningConfig();
            return TeaModel.build(map, self);
        }

        public SetApplicationProvisioningConfigRequestCallbackProvisioningConfig setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public SetApplicationProvisioningConfigRequestCallbackProvisioningConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public SetApplicationProvisioningConfigRequestCallbackProvisioningConfig setEncryptRequired(Boolean encryptRequired) {
            this.encryptRequired = encryptRequired;
            return this;
        }
        public Boolean getEncryptRequired() {
            return this.encryptRequired;
        }

        public SetApplicationProvisioningConfigRequestCallbackProvisioningConfig setListenEventScopes(java.util.List<String> listenEventScopes) {
            this.listenEventScopes = listenEventScopes;
            return this;
        }
        public java.util.List<String> getListenEventScopes() {
            return this.listenEventScopes;
        }

    }

    public static class SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam extends TeaModel {
        /**
         * <p>The access token. You can update this field when the grant type is bearer_token.</p>
         * 
         * <strong>example:</strong>
         * <p>k52x2ru63rlkflina5utgkxxxx</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <p>The authentication method for the SCIM protocol. Valid values:</p>
         * <ul>
         * <li><p>client_secret_basic: The key is passed in the request header.</p>
         * </li>
         * <li><p>client_secret_post: The key is passed in the request body.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>client_secret_basic</p>
         */
        @NameInMap("AuthnMethod")
        public String authnMethod;

        /**
         * <p>The client ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client secret of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>CSEHDcHcrUKHw1CuxkJEHPveWRXBGqVqRsxxxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The token endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/oauth/token">https://www.example.com/oauth/token</a></p>
         */
        @NameInMap("TokenEndpoint")
        public String tokenEndpoint;

        public static SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam self = new SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam();
            return TeaModel.build(map, self);
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam setAuthnMethod(String authnMethod) {
            this.authnMethod = authnMethod;
            return this;
        }
        public String getAuthnMethod() {
            return this.authnMethod;
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

    }

    public static class SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration extends TeaModel {
        /**
         * <p>The authorization mode for the SCIM protocol interface. Valid values:</p>
         * <ul>
         * <li>oauth2: OAuth2 mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oauth2</p>
         */
        @NameInMap("AuthnMode")
        public String authnMode;

        /**
         * <p>The authorization configuration parameters. The usage is as follows:</p>
         * <ul>
         * <li><p>If GrantType is set to client_credentials, you can update ClientId, ClientSecret, and AuthnMethod.</p>
         * </li>
         * <li><p>If GrantType is set to bearer_token, you can update AccessToken.</p>
         * </li>
         * </ul>
         */
        @NameInMap("AuthnParam")
        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam authnParam;

        /**
         * <p>The authorization grant type for the SCIM protocol. Valid values:</p>
         * <ul>
         * <li><p>client_credentials: Client credentials mode.</p>
         * </li>
         * <li><p>bearer_token: Bearer token mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bearer_token</p>
         */
        @NameInMap("GrantType")
        public String grantType;

        public static SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration self = new SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration();
            return TeaModel.build(map, self);
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration setAuthnMode(String authnMode) {
            this.authnMode = authnMode;
            return this;
        }
        public String getAuthnMode() {
            return this.authnMode;
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration setAuthnParam(SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam authnParam) {
            this.authnParam = authnParam;
            return this;
        }
        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam getAuthnParam() {
            return this.authnParam;
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration setGrantType(String grantType) {
            this.grantType = grantType;
            return this;
        }
        public String getGrantType() {
            return this.grantType;
        }

    }

    public static class SetApplicationProvisioningConfigRequestScimProvisioningConfig extends TeaModel {
        /**
         * <p>The configuration parameters for SCIM protocol synchronization.</p>
         */
        @NameInMap("AuthnConfiguration")
        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration authnConfiguration;

        /**
         * <p>The scope of a full push for the SCIM protocol. Valid values:</p>
         * <ul>
         * <li>urn:alibaba:idaas:app:scim:User:PUSH: Full synchronization of users.</li>
         * </ul>
         */
        @NameInMap("FullPushScopes")
        public java.util.List<String> fullPushScopes;

        /**
         * <p>The operations on the target resource for the SCIM protocol. Valid values:</p>
         * <ul>
         * <li><p>urn:alibaba:idaas:app:scim:User:CREATE: Create an account.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:app:scim:User:UPDATE: Update an account.</p>
         * </li>
         * <li><p>urn:alibaba:idaas:app:scim:User:DELETE: Delete an account.</p>
         * </li>
         * </ul>
         */
        @NameInMap("ProvisioningActions")
        public java.util.List<String> provisioningActions;

        /**
         * <p>The base URL where the application accepts IDaaS SCIM protocol synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/scim">https://example.com/scim</a></p>
         */
        @NameInMap("ScimBaseUrl")
        public String scimBaseUrl;

        public static SetApplicationProvisioningConfigRequestScimProvisioningConfig build(java.util.Map<String, ?> map) throws Exception {
            SetApplicationProvisioningConfigRequestScimProvisioningConfig self = new SetApplicationProvisioningConfigRequestScimProvisioningConfig();
            return TeaModel.build(map, self);
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfig setAuthnConfiguration(SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration authnConfiguration) {
            this.authnConfiguration = authnConfiguration;
            return this;
        }
        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration getAuthnConfiguration() {
            return this.authnConfiguration;
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfig setFullPushScopes(java.util.List<String> fullPushScopes) {
            this.fullPushScopes = fullPushScopes;
            return this;
        }
        public java.util.List<String> getFullPushScopes() {
            return this.fullPushScopes;
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfig setProvisioningActions(java.util.List<String> provisioningActions) {
            this.provisioningActions = provisioningActions;
            return this;
        }
        public java.util.List<String> getProvisioningActions() {
            return this.provisioningActions;
        }

        public SetApplicationProvisioningConfigRequestScimProvisioningConfig setScimBaseUrl(String scimBaseUrl) {
            this.scimBaseUrl = scimBaseUrl;
            return this;
        }
        public String getScimBaseUrl() {
            return this.scimBaseUrl;
        }

    }

}
