// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationProvisioningConfigRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The configuration of event callback synchronization. This parameter is required when the ProvisionProtocolType parameter is set to idaas_callback.</p>
     */
    @NameInMap("CallbackProvisioningConfig")
    public SetApplicationProvisioningConfigRequestCallbackProvisioningConfig callbackProvisioningConfig;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to synchronize the password in IDaaS user event callbacks. Valid values:</p>
     * <br>
     * <p>*   true: synchronize the password.</p>
     * <p>*   false: do not synchronize the password.</p>
     */
    @NameInMap("ProvisionPassword")
    public Boolean provisionPassword;

    /**
     * <p>The synchronization protocol type of the application. Valid values:</p>
     * <br>
     * <p>*   idaas_callback: custom event callback protocol of IDaaS.</p>
     * <p>*   scim2: System for Cross-domain Identity Management (SCIM) protocol.</p>
     */
    @NameInMap("ProvisionProtocolType")
    public String provisionProtocolType;

    /**
     * <p>The configuration of SCIM-based IDaaS synchronization. This parameter is required when the ProvisionProtocolType parameter is set to scim2.</p>
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
         * <p>The URL that the application uses to receive IDaaS event callbacks.</p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <p>The symmetric key for IDaaS event callbacks. The key is an AES-256 encryption key in the HEX format.</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>Specifies whether to encrypt IDaaS event callback messages. Valid values:</p>
         * <br>
         * <p>*   true: encrypt the messages.</p>
         * <p>*   false: transmit the messages in plaintext.</p>
         */
        @NameInMap("EncryptRequired")
        public Boolean encryptRequired;

        /**
         * <p>The list of types of IDaaS event callback messages that are supported by the listener.</p>
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
         * <p>The access token. If the GrantType parameter is set to bearer_token, you can set this parameter.</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <p>The authentication mode of the SCIM protocol. Valid values:</p>
         * <br>
         * <p>*   client_secret_basic: The client secret is passed in the request header.</p>
         * <p>*   client_secret_post: The client secret is passed in the request body.</p>
         */
        @NameInMap("AuthnMethod")
        public String authnMethod;

        /**
         * <p>The client ID of the application.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client secret of the application.</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The token endpoint.</p>
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
         * <p>The authentication mode of the SCIM protocol. Valid value:</p>
         * <br>
         * <p>*   oauth2: OAuth2.0 mode.</p>
         */
        @NameInMap("AuthnMode")
        public String authnMode;

        /**
         * <p>The configuration parameters related to authorization.</p>
         * <br>
         * <p>*   If the GrantType parameter is set to client_credentials, you can set the configuration parameters ClientId, ClientSecret, and AuthnMethod.</p>
         * <p>*   If the GrantType parameter is set to bearer_token, you can set the configuration parameter AccessToken.</p>
         */
        @NameInMap("AuthnParam")
        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam authnParam;

        /**
         * <p>The grant type of the SCIM protocol. Valid values:</p>
         * <br>
         * <p>*   client_credentials: client mode.</p>
         * <p>*   bearer_token: key mode.</p>
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
         * <p>The configuration parameters related to SCIM-based synchronization.</p>
         */
        @NameInMap("AuthnConfiguration")
        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration authnConfiguration;

        /**
         * <p>The full synchronization scope of the SCIM protocol. Valid value:</p>
         * <br>
         * <p>*   urn:alibaba:idaas:app:scim:User:PUSH: full account data synchronization.</p>
         */
        @NameInMap("FullPushScopes")
        public java.util.List<String> fullPushScopes;

        /**
         * <p>The resource operations of the SCIM protocol. Valid values:</p>
         * <br>
         * <p>*   urn:alibaba:idaas:app:scim:User:CREATE: account creation.</p>
         * <p>*   urn:alibaba:idaas:app:scim:User:UPDATE: account update.</p>
         * <p>*   urn:alibaba:idaas:app:scim:User:DELETE: account deletion.</p>
         */
        @NameInMap("ProvisioningActions")
        public java.util.List<String> provisioningActions;

        /**
         * <p>The base URL that the application uses to receive the SCIM protocol for IDaaS synchronization.</p>
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
