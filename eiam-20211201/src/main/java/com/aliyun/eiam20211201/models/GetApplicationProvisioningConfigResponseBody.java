// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningConfigResponseBody extends TeaModel {
    /**
     * <p>The account synchronization configuration of the application.</p>
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
         * <p>The destination address for the application to receive IDaaS event callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/event/callback">https://example.com/event/callback</a></p>
         */
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        /**
         * <p>The symmetric encryption and decryption key for IDaaS event callbacks. The key uses the AES256 algorithm and is encoded in Hex format.</p>
         * 
         * <strong>example:</strong>
         * <p>1adfdfdfd******111</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>Specifies whether IDaaS event callback messages are encrypted. Valid values:</p>
         * <ul>
         * <li>true: Encrypted.</li>
         * <li>false: Not encrypted. Messages are transmitted in plaintext.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EncryptRequired")
        public Boolean encryptRequired;

        /**
         * <p>The list of message types listened to by IDaaS event callbacks.</p>
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
         * <p>The access token. This field is required when the bearer_token mode is used.</p>
         * 
         * <strong>example:</strong>
         * <p>k52x2ru63rlkflina5utgkxxxx</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <p>The authentication pattern for the System for Cross-domain Identity Management protocol. Valid values:</p>
         * <ul>
         * <li>client_secret_basic: Pass the secret in the request header.</li>
         * <li>client_secret_post: Pass the secret in the request body.</li>
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
         * <p>The authorization pattern for System for Cross-domain Identity Management protocol APIs. Valid values:</p>
         * <ul>
         * <li>oauth2: OAuth2 pattern.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oauth2</p>
         */
        @NameInMap("AuthnMode")
        public String authnMode;

        /**
         * <p>The authorization configuration parameters. Usage:</p>
         * <ul>
         * <li>If GrantType is set to client_credentials, you must specify ClientId, ClientSecret, and AuthnMethod.</li>
         * <li>If GrantType is set to bearer_token, you must specify AccessToken.</li>
         * </ul>
         */
        @NameInMap("AuthnParam")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam authnParam;

        /**
         * <p>The authorization pattern for the System for Cross-domain Identity Management protocol. Valid values:</p>
         * <ul>
         * <li>client_credentials: Client credentials pattern.</li>
         * <li>bearer_token: Bearer token pattern.</li>
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
         * <p>The configuration parameters related to System for Cross-domain Identity Management protocol synchronization.</p>
         */
        @NameInMap("AuthnConfiguration")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration authnConfiguration;

        /**
         * <p>The full push scope for the System for Cross-domain Identity Management protocol. Valid values:</p>
         * <ul>
         * <li>urn:alibaba:idaas:app:scim:User:PUSH: Full user synchronization.</li>
         * </ul>
         */
        @NameInMap("FullPushScopes")
        public java.util.List<String> fullPushScopes;

        /**
         * <p>The operations on target resources for the System for Cross-domain Identity Management protocol. Valid values:</p>
         * <ul>
         * <li>urn:alibaba:idaas:app:scim:User:CREATE: Create an account.</li>
         * <li>urn:alibaba:idaas:app:scim:User:UPDATE: Update an account.</li>
         * <li>urn:alibaba:idaas:app:scim:User:DELETE: Delete an account.</li>
         * </ul>
         */
        @NameInMap("ProvisioningActions")
        public java.util.List<String> provisioningActions;

        /**
         * <p>The base URL for the application to receive IDaaS System for Cross-domain Identity Management protocol synchronization.</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The configuration parameters for the IDaaS custom event callback protocol.</p>
         */
        @NameInMap("CallbackProvisioningConfig")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig callbackProvisioningConfig;

        /**
         * <p>The rendering mode of the account synchronization page. Valid values:</p>
         * <ul>
         * <li>standard: Standard mode.</li>
         * <li>template: Template mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("ConfigOperateMode")
        public String configOperateMode;

        /**
         * <p>The instance ID.</p>
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
         * <p>The public key endpoint for verifying the signature of application synchronization callback information.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk267xxxxx/app_mkv7rgt4d7i4u7zqtzev2mxxxx/provisioning/jwks">https://eiam-api-cn-hangzhou.aliyuncs.com/v2/idaas_ue2jvisn35ea5lmthk267xxxxx/app_mkv7rgt4d7i4u7zqtzev2mxxxx/provisioning/jwks</a></p>
         */
        @NameInMap("ProvisionJwksEndpoint")
        public String provisionJwksEndpoint;

        /**
         * <p>Specifies whether to synchronize passwords in IDaaS user event callbacks. Valid values:</p>
         * <ul>
         * <li>true: Synchronize passwords.</li>
         * <li>false: Do not synchronize passwords.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProvisionPassword")
        public Boolean provisionPassword;

        /**
         * <p>The application synchronization protocol type. Valid values:</p>
         * <ul>
         * <li>idaas_callback: IDaaS custom event callback protocol.</li>
         * <li>scim2: System for Cross-domain Identity Management protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>idaas_callback</p>
         */
        @NameInMap("ProvisionProtocolType")
        public String provisionProtocolType;

        /**
         * <p>The configuration parameters for IDaaS System for Cross-domain Identity Management protocol synchronization.</p>
         */
        @NameInMap("ScimProvisioningConfig")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig scimProvisioningConfig;

        /**
         * <p>The enabling status of the IDaaS account synchronization feature. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
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
