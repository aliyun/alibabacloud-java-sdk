// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration of the account synchronization feature for the application.</p>
     */
    @NameInMap("ApplicationProvisioningConfig")
    public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig applicationProvisioningConfig;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationProvisioningConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningConfigResponseBody self = new GetApplicationProvisioningConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningConfigResponseBody setApplicationProvisioningConfig(GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig applicationProvisioningConfig) {
        this.applicationProvisioningConfig = applicationProvisioningConfig;
        return this;
    }
    public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig getApplicationProvisioningConfig() {
        return this.applicationProvisioningConfig;
    }

    public GetApplicationProvisioningConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig extends TeaModel {
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
         * <p>Indicates whether IDaaS event callback messages are encrypted. Valid values:</p>
         * <br>
         * <p>*   true: The messages are encrypted.</p>
         * <p>*   false: The messages are transmitted in plaintext.</p>
         */
        @NameInMap("EncryptRequired")
        public Boolean encryptRequired;

        /**
         * <p>The list of types of IDaaS event callback messages that are supported by the listener.</p>
         */
        @NameInMap("ListenEventScopes")
        public java.util.List<String> listenEventScopes;

        public static GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig self = new GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig setEncryptRequired(Boolean encryptRequired) {
            this.encryptRequired = encryptRequired;
            return this;
        }
        public Boolean getEncryptRequired() {
            return this.encryptRequired;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig setListenEventScopes(java.util.List<String> listenEventScopes) {
            this.listenEventScopes = listenEventScopes;
            return this;
        }
        public java.util.List<String> getListenEventScopes() {
            return this.listenEventScopes;
        }

    }

    public static class GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam extends TeaModel {
        /**
         * <p>The access token. This parameter is returned when the GrantType parameter is set to bearer_token.</p>
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

        public static GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam self = new GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam setAuthnMethod(String authnMethod) {
            this.authnMethod = authnMethod;
            return this;
        }
        public String getAuthnMethod() {
            return this.authnMethod;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = tokenEndpoint;
            return this;
        }
        public String getTokenEndpoint() {
            return this.tokenEndpoint;
        }

    }

    public static class GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration extends TeaModel {
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
         * <p>*   If the GrantType parameter is set to client_credentials, the configuration parameters ClientId, ClientSecret, and AuthnMethod are returned.</p>
         * <p>*   If the GrantType parameter is set to bearer_token, the configuration parameter AccessToken is returned.</p>
         */
        @NameInMap("AuthnParam")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam authnParam;

        /**
         * <p>The grant type of the SCIM protocol. Valid values:</p>
         * <br>
         * <p>*   client_credentials: client mode.</p>
         * <p>*   bearer_token: key mode.</p>
         */
        @NameInMap("GrantType")
        public String grantType;

        public static GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration self = new GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration setAuthnMode(String authnMode) {
            this.authnMode = authnMode;
            return this;
        }
        public String getAuthnMode() {
            return this.authnMode;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration setAuthnParam(GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam authnParam) {
            this.authnParam = authnParam;
            return this;
        }
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam getAuthnParam() {
            return this.authnParam;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration setGrantType(String grantType) {
            this.grantType = grantType;
            return this;
        }
        public String getGrantType() {
            return this.grantType;
        }

    }

    public static class GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig extends TeaModel {
        /**
         * <p>The configuration parameters related to SCIM-based synchronization.</p>
         */
        @NameInMap("AuthnConfiguration")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration authnConfiguration;

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

        public static GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig self = new GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig setAuthnConfiguration(GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration authnConfiguration) {
            this.authnConfiguration = authnConfiguration;
            return this;
        }
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration getAuthnConfiguration() {
            return this.authnConfiguration;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig setFullPushScopes(java.util.List<String> fullPushScopes) {
            this.fullPushScopes = fullPushScopes;
            return this;
        }
        public java.util.List<String> getFullPushScopes() {
            return this.fullPushScopes;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig setProvisioningActions(java.util.List<String> provisioningActions) {
            this.provisioningActions = provisioningActions;
            return this;
        }
        public java.util.List<String> getProvisioningActions() {
            return this.provisioningActions;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig setScimBaseUrl(String scimBaseUrl) {
            this.scimBaseUrl = scimBaseUrl;
            return this;
        }
        public String getScimBaseUrl() {
            return this.scimBaseUrl;
        }

    }

    public static class GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The configuration of the custom event callback protocol of IDaaS.</p>
         */
        @NameInMap("CallbackProvisioningConfig")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig callbackProvisioningConfig;

        /**
         * <p>账户同步页面渲染方式</p>
         */
        @NameInMap("ConfigOperateMode")
        public String configOperateMode;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The public key endpoint for signature verification of the synchronization callback information.</p>
         */
        @NameInMap("ProvisionJwksEndpoint")
        public String provisionJwksEndpoint;

        /**
         * <p>Indicates whether the password is synchronized in IDaaS user event callbacks. Valid values:</p>
         * <br>
         * <p>*   true: The password is synchronized.</p>
         * <p>*   false: The password is not synchronized.</p>
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
         * <p>The configuration of SCIM-based IDaaS synchronization.</p>
         */
        @NameInMap("ScimProvisioningConfig")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig scimProvisioningConfig;

        /**
         * <p>The status of the IDaaS account synchronization feature. Valid values:</p>
         * <br>
         * <p>*   enabled: The feature is enabled.</p>
         * <p>*   disabled: The feature is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig self = new GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setCallbackProvisioningConfig(GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig callbackProvisioningConfig) {
            this.callbackProvisioningConfig = callbackProvisioningConfig;
            return this;
        }
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig getCallbackProvisioningConfig() {
            return this.callbackProvisioningConfig;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setConfigOperateMode(String configOperateMode) {
            this.configOperateMode = configOperateMode;
            return this;
        }
        public String getConfigOperateMode() {
            return this.configOperateMode;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setProvisionJwksEndpoint(String provisionJwksEndpoint) {
            this.provisionJwksEndpoint = provisionJwksEndpoint;
            return this;
        }
        public String getProvisionJwksEndpoint() {
            return this.provisionJwksEndpoint;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setProvisionPassword(Boolean provisionPassword) {
            this.provisionPassword = provisionPassword;
            return this;
        }
        public Boolean getProvisionPassword() {
            return this.provisionPassword;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setProvisionProtocolType(String provisionProtocolType) {
            this.provisionProtocolType = provisionProtocolType;
            return this;
        }
        public String getProvisionProtocolType() {
            return this.provisionProtocolType;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setScimProvisioningConfig(GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig scimProvisioningConfig) {
            this.scimProvisioningConfig = scimProvisioningConfig;
            return this;
        }
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig getScimProvisioningConfig() {
            return this.scimProvisioningConfig;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
