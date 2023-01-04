// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationProvisioningConfigRequest extends TeaModel {
    // IDaaS的应用资源ID。
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS 事件回调同步配置，当provisionProtocolType为idaas_callback时填写该配置
    @NameInMap("CallbackProvisioningConfig")
    public SetApplicationProvisioningConfigRequestCallbackProvisioningConfig callbackProvisioningConfig;

    // IDaaS EIAM的实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 同步信息是否包含密码
    @NameInMap("ProvisionPassword")
    public Boolean provisionPassword;

    // 同步协议类型
    @NameInMap("ProvisionProtocolType")
    public String provisionProtocolType;

    // IDaaS SCIM同步配置，当provisionProtocolType为scim2时填写该配置
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
        // IDaaS回调SP地址，当provisionProtocolType为idaas_callback时必填
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        // IDaaS回调对称加密秘钥
        @NameInMap("EncryptKey")
        public String encryptKey;

        // IDaaS回调是否加密
        @NameInMap("EncryptRequired")
        public Boolean encryptRequired;

        // IDaaS回调事件监听范围
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
        // 认证类型
        @NameInMap("AuthnMode")
        public String authnMode;

        // 授权相关配置
        @NameInMap("AuthnParam")
        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfigurationAuthnParam authnParam;

        // 授权模式
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
        // scim同步相关配置
        @NameInMap("AuthnConfiguration")
        public SetApplicationProvisioningConfigRequestScimProvisioningConfigAuthnConfiguration authnConfiguration;

        // 全量推送范围
        @NameInMap("FullPushScopes")
        public java.util.List<String> fullPushScopes;

        // 目标资源操作行为
        @NameInMap("ProvisioningActions")
        public java.util.List<String> provisioningActions;

        // scim同步端点
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
