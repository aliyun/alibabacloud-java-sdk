// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentServiceConfig extends TeaModel {
    /**
     * <p>The address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com/api/v1">https://dashscope.aliyuncs.com/api/v1</a></p>
     */
    @NameInMap("address")
    public String address;

    /**
     * <p>User-defined configuration</p>
     */
    @NameInMap("customConfig")
    public AgentServiceConfigCustomConfig customConfig;

    /**
     * <p>The Model Studio service configuration.</p>
     */
    @NameInMap("dashScopeConfig")
    public AgentServiceConfigDashScopeConfig dashScopeConfig;

    /**
     * <p>The Dify service configuration.</p>
     */
    @NameInMap("difyConfig")
    public AgentServiceConfigDifyConfig difyConfig;

    /**
     * <p>Specifies whether to enable health check.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableHealthCheck")
    public Boolean enableHealthCheck;

    /**
     * <p>Whether to enable outlier detection</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableOutlierDetection")
    public Boolean enableOutlierDetection;

    /**
     * <p>The protocol.</p>
     */
    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <p>The service provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("provider")
    public String provider;

    public static AgentServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        AgentServiceConfig self = new AgentServiceConfig();
        return TeaModel.build(map, self);
    }

    public AgentServiceConfig setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AgentServiceConfig setCustomConfig(AgentServiceConfigCustomConfig customConfig) {
        this.customConfig = customConfig;
        return this;
    }
    public AgentServiceConfigCustomConfig getCustomConfig() {
        return this.customConfig;
    }

    public AgentServiceConfig setDashScopeConfig(AgentServiceConfigDashScopeConfig dashScopeConfig) {
        this.dashScopeConfig = dashScopeConfig;
        return this;
    }
    public AgentServiceConfigDashScopeConfig getDashScopeConfig() {
        return this.dashScopeConfig;
    }

    public AgentServiceConfig setDifyConfig(AgentServiceConfigDifyConfig difyConfig) {
        this.difyConfig = difyConfig;
        return this;
    }
    public AgentServiceConfigDifyConfig getDifyConfig() {
        return this.difyConfig;
    }

    public AgentServiceConfig setEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }
    public Boolean getEnableHealthCheck() {
        return this.enableHealthCheck;
    }

    public AgentServiceConfig setEnableOutlierDetection(Boolean enableOutlierDetection) {
        this.enableOutlierDetection = enableOutlierDetection;
        return this;
    }
    public Boolean getEnableOutlierDetection() {
        return this.enableOutlierDetection;
    }

    public AgentServiceConfig setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public AgentServiceConfig setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public static class AgentServiceConfigCustomConfig extends TeaModel {
        /**
         * <p>apiKey</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>API key generation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Reference</p>
         */
        @NameInMap("apiKeyGenerateMode")
        public String apiKeyGenerateMode;

        public static AgentServiceConfigCustomConfig build(java.util.Map<String, ?> map) throws Exception {
            AgentServiceConfigCustomConfig self = new AgentServiceConfigCustomConfig();
            return TeaModel.build(map, self);
        }

        public AgentServiceConfigCustomConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public AgentServiceConfigCustomConfig setApiKeyGenerateMode(String apiKeyGenerateMode) {
            this.apiKeyGenerateMode = apiKeyGenerateMode;
            return this;
        }
        public String getApiKeyGenerateMode() {
            return this.apiKeyGenerateMode;
        }

    }

    public static class AgentServiceConfigDashScopeConfigAppCredentials extends TeaModel {
        /**
         * <p>apiKey</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-xxx</p>
         */
        @NameInMap("appId")
        public String appId;

        public static AgentServiceConfigDashScopeConfigAppCredentials build(java.util.Map<String, ?> map) throws Exception {
            AgentServiceConfigDashScopeConfigAppCredentials self = new AgentServiceConfigDashScopeConfigAppCredentials();
            return TeaModel.build(map, self);
        }

        public AgentServiceConfigDashScopeConfigAppCredentials setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public AgentServiceConfigDashScopeConfigAppCredentials setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

    public static class AgentServiceConfigDashScopeConfig extends TeaModel {
        /**
         * <p>The application configuration.</p>
         */
        @NameInMap("appCredentials")
        public java.util.List<AgentServiceConfigDashScopeConfigAppCredentials> appCredentials;

        public static AgentServiceConfigDashScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            AgentServiceConfigDashScopeConfig self = new AgentServiceConfigDashScopeConfig();
            return TeaModel.build(map, self);
        }

        public AgentServiceConfigDashScopeConfig setAppCredentials(java.util.List<AgentServiceConfigDashScopeConfigAppCredentials> appCredentials) {
            this.appCredentials = appCredentials;
            return this;
        }
        public java.util.List<AgentServiceConfigDashScopeConfigAppCredentials> getAppCredentials() {
            return this.appCredentials;
        }

    }

    public static class AgentServiceConfigDifyConfig extends TeaModel {
        /**
         * <p>API Key</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The interaction type.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot</p>
         */
        @NameInMap("botType")
        public String botType;

        public static AgentServiceConfigDifyConfig build(java.util.Map<String, ?> map) throws Exception {
            AgentServiceConfigDifyConfig self = new AgentServiceConfigDifyConfig();
            return TeaModel.build(map, self);
        }

        public AgentServiceConfigDifyConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public AgentServiceConfigDifyConfig setBotType(String botType) {
            this.botType = botType;
            return this;
        }
        public String getBotType() {
            return this.botType;
        }

    }

}
