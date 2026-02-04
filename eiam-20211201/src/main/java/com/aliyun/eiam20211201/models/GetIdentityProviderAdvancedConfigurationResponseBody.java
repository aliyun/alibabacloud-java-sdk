// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderAdvancedConfigurationResponseBody extends TeaModel {
    @NameInMap("AdvancedConfiguration")
    public GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration advancedConfiguration;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIdentityProviderAdvancedConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderAdvancedConfigurationResponseBody self = new GetIdentityProviderAdvancedConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderAdvancedConfigurationResponseBody setAdvancedConfiguration(GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration advancedConfiguration) {
        this.advancedConfiguration = advancedConfiguration;
        return this;
    }
    public GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration getAdvancedConfiguration() {
        return this.advancedConfiguration;
    }

    public GetIdentityProviderAdvancedConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfigurationDingtalkAdvancedConfig extends TeaModel {
        /**
         * <p>IDaaS EIAM 钉钉一方应用的AppKey</p>
         * 
         * <strong>example:</strong>
         * <p>ding5xo9rg0csw3f6xxx</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>IDaaS EIAM 钉钉一方应用的AppSecret</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        public static GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfigurationDingtalkAdvancedConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfigurationDingtalkAdvancedConfig self = new GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfigurationDingtalkAdvancedConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfigurationDingtalkAdvancedConfig setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfigurationDingtalkAdvancedConfig setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

    }

    public static class GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration extends TeaModel {
        /**
         * <p>钉钉高阶配置</p>
         */
        @NameInMap("DingtalkAdvancedConfig")
        public GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfigurationDingtalkAdvancedConfig dingtalkAdvancedConfig;

        /**
         * <p>IDaaS EIAM 身份提供方ID</p>
         * 
         * <strong>example:</strong>
         * <p>idp_na2rzpyc67zr7ixdfy35zgrxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_kpvmhktvun6u66dgpjh3l4wxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration self = new GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration setDingtalkAdvancedConfig(GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfigurationDingtalkAdvancedConfig dingtalkAdvancedConfig) {
            this.dingtalkAdvancedConfig = dingtalkAdvancedConfig;
            return this;
        }
        public GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfigurationDingtalkAdvancedConfig getDingtalkAdvancedConfig() {
            return this.dingtalkAdvancedConfig;
        }

        public GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        public GetIdentityProviderAdvancedConfigurationResponseBodyAdvancedConfiguration setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
