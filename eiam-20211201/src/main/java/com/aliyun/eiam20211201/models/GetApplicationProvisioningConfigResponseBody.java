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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
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
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/event/callback">https://example.com/event/callback</a></p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <p>The symmetric key for IDaaS event callbacks. The key is an AES-256 encryption key in the HEX format.</p>
         * 
         * <strong>example:</strong>
         * <p>1adfdfdfd******111</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>Indicates whether IDaaS event callback messages are encrypted. Valid values:</p>
         * <ul>
         * <li>true: The messages are encrypted.</li>
         * <li>false: The messages are transmitted in plaintext.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>k52x2ru63rlkflina5utgkxxxx</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <p>The authentication mode of the SCIM protocol. Valid values:</p>
         * <ul>
         * <li>client_secret_basic: The client secret is passed in the request header.</li>
         * <li>client_secret_post: The client secret is passed in the request body.</li>
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
         * <ul>
         * <li>oauth2: OAuth2.0 mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oauth2</p>
         */
        @NameInMap("AuthnMode")
        public String authnMode;

        /**
         * <p>The configuration parameters related to authorization.</p>
         * <ul>
         * <li>If the GrantType parameter is set to client_credentials, the configuration parameters ClientId, ClientSecret, and AuthnMethod are returned.</li>
         * <li>If the GrantType parameter is set to bearer_token, the configuration parameter AccessToken is returned.</li>
         * </ul>
         */
        @NameInMap("AuthnParam")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam authnParam;

        /**
         * <p>The grant type of the SCIM protocol. Valid values:</p>
         * <ul>
         * <li>client_credentials: client mode.</li>
         * <li>bearer_token: key mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bearer_token</p>
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
         * <ul>
         * <li>urn:alibaba:idaas:app:scim:User:PUSH: full account data synchronization.</li>
         * </ul>
         */
        @NameInMap("FullPushScopes")
        public java.util.List<String> fullPushScopes;

        /**
         * <p>The resource operations of the SCIM protocol. Valid values:</p>
         * <ul>
         * <li>urn:alibaba:idaas:app:scim:User:CREATE: account creation.</li>
         * <li>urn:alibaba:idaas:app:scim:User:UPDATE: account update.</li>
         * <li>urn:alibaba:idaas:app:scim:User:DELETE: account deletion.</li>
         * </ul>
         */
        @NameInMap("ProvisioningActions")
        public java.util.List<String> provisioningActions;

        /**
         * <p>The base URL that the application uses to receive the SCIM protocol for IDaaS synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/scim">https://example.com/scim</a></p>
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
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The configuration of the custom event callback protocol of IDaaS.</p>
         */
        @NameInMap("CallbackProvisioningConfig")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig callbackProvisioningConfig;

        /**
         * <p>The rendering mode of the account synchronization page. Valid values:</p>
         * <ul>
         * <li>standard: standard mode</li>
         * <li>template: template mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("ConfigOperateMode")
        public String configOperateMode;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NetworkAccessEndpointId")
        public String networkAccessEndpointId;

        /**
         * <p>The public key endpoint for signature verification of the synchronization callback information.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk267xxxxx/app_mkv7rgt4d7i4u7zqtzev2mxxxx/provisioning/jwks">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk267xxxxx/app_mkv7rgt4d7i4u7zqtzev2mxxxx/provisioning/jwks</a></p>
         */
        @NameInMap("ProvisionJwksEndpoint")
        public String provisionJwksEndpoint;

        /**
         * <p>Indicates whether the password is synchronized in IDaaS user event callbacks. Valid values:</p>
         * <ul>
         * <li>true: The password is synchronized.</li>
         * <li>false: The password is not synchronized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProvisionPassword")
        public Boolean provisionPassword;

        /**
         * <p>The synchronization protocol type of the application. Valid values:</p>
         * <ul>
         * <li>idaas_callback: custom event callback protocol of IDaaS.</li>
         * <li>scim2: System for Cross-domain Identity Management (SCIM) protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>idaas_callback</p>
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
         * <ul>
         * <li>enabled: The feature is enabled.</li>
         * <li>disabled: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
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

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setNetworkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }
        public String getNetworkAccessEndpointId() {
            return this.networkAccessEndpointId;
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
