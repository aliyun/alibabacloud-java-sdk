// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningConfigResponseBody extends TeaModel {
    @NameInMap("ApplicationProvisioningConfig")
    public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig applicationProvisioningConfig;

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
        // IDaaS回调SP地址，当provisionProtocolType为idaas_callback时必填
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        // IDaaS回调对称加密秘钥, AES 256格式
        @NameInMap("EncryptKey")
        public String encryptKey;

        // IDaaS回调是否加密
        @NameInMap("EncryptRequired")
        public Boolean encryptRequired;

        // IDaaS回调事件监听范围
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
        // accessToken
        @NameInMap("AccessToken")
        public String accessToken;

        // oauth2 authentication method
        @NameInMap("AuthnMethod")
        public String authnMethod;

        // oauth2 client id
        @NameInMap("ClientId")
        public String clientId;

        // oauth2 client secret
        @NameInMap("ClientSecret")
        public String clientSecret;

        // oauth2 token端点
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
        // 认证类型
        @NameInMap("AuthnMode")
        public String authnMode;

        // 授权相关配置
        @NameInMap("AuthnParam")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfigurationAuthnParam authnParam;

        // 授权模式
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
        // scim同步相关配置
        @NameInMap("AuthnConfiguration")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfigAuthnConfiguration authnConfiguration;

        // 全量推送范围
        @NameInMap("FullPushScopes")
        public java.util.List<String> fullPushScopes;

        // 目标资源操作行为
        @NameInMap("ProvisioningActions")
        public java.util.List<String> provisioningActions;

        // scim同步端点
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
        // IDaaS EIAM 应用Id
        @NameInMap("ApplicationId")
        public String applicationId;

        // IDaaS回调同步配置，当provisionProtocolType为idaas_callback时必填
        @NameInMap("CallbackProvisioningConfig")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig callbackProvisioningConfig;

        // IDaaS EIAM 实例Id
        @NameInMap("InstanceId")
        public String instanceId;

        // 应用同步验签公钥端点
        @NameInMap("ProvisionJwksEndpoint")
        public String provisionJwksEndpoint;

        // 同步信息是否包含密码
        @NameInMap("ProvisionPassword")
        public Boolean provisionPassword;

        // IDaaS EIAM 应用同步协议，scim2 or custom or idaas_callback
        @NameInMap("ProvisionProtocolType")
        public String provisionProtocolType;

        // IDaaS SCIM同步配置，当provisionProtocolType为scim2时填写该配置
        @NameInMap("ScimProvisioningConfig")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigScimProvisioningConfig scimProvisioningConfig;

        // IDaaS 应用同步启用状态
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
