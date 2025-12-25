// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiDeployConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoDeploy")
    public Boolean autoDeploy;

    /**
     * <strong>example:</strong>
     * <p>SingleService</p>
     */
    @NameInMap("backendScene")
    public String backendScene;

    @NameInMap("customDomainIds")
    public java.util.List<String> customDomainIds;

    @NameInMap("customDomainInfos")
    public java.util.List<HttpApiDeployConfigCustomDomainInfos> customDomainInfos;

    /**
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <strong>example:</strong>
     * <p>gw-xx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    @NameInMap("gatewayInfo")
    public GatewayInfo gatewayInfo;

    /**
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    @NameInMap("mock")
    public HttpApiMockContract mock;

    @NameInMap("policyConfigs")
    public java.util.List<HttpApiDeployConfigPolicyConfigs> policyConfigs;

    @NameInMap("routeBackend")
    public Backend routeBackend;

    @NameInMap("serviceConfigs")
    public java.util.List<HttpApiDeployConfigServiceConfigs> serviceConfigs;

    @NameInMap("subDomains")
    public java.util.List<HttpApiDeployConfigSubDomains> subDomains;

    public static HttpApiDeployConfig build(java.util.Map<String, ?> map) throws Exception {
        HttpApiDeployConfig self = new HttpApiDeployConfig();
        return TeaModel.build(map, self);
    }

    public HttpApiDeployConfig setAutoDeploy(Boolean autoDeploy) {
        this.autoDeploy = autoDeploy;
        return this;
    }
    public Boolean getAutoDeploy() {
        return this.autoDeploy;
    }

    public HttpApiDeployConfig setBackendScene(String backendScene) {
        this.backendScene = backendScene;
        return this;
    }
    public String getBackendScene() {
        return this.backendScene;
    }

    public HttpApiDeployConfig setCustomDomainIds(java.util.List<String> customDomainIds) {
        this.customDomainIds = customDomainIds;
        return this;
    }
    public java.util.List<String> getCustomDomainIds() {
        return this.customDomainIds;
    }

    public HttpApiDeployConfig setCustomDomainInfos(java.util.List<HttpApiDeployConfigCustomDomainInfos> customDomainInfos) {
        this.customDomainInfos = customDomainInfos;
        return this;
    }
    public java.util.List<HttpApiDeployConfigCustomDomainInfos> getCustomDomainInfos() {
        return this.customDomainInfos;
    }

    public HttpApiDeployConfig setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public HttpApiDeployConfig setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public HttpApiDeployConfig setGatewayInfo(GatewayInfo gatewayInfo) {
        this.gatewayInfo = gatewayInfo;
        return this;
    }
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    public HttpApiDeployConfig setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public HttpApiDeployConfig setMock(HttpApiMockContract mock) {
        this.mock = mock;
        return this;
    }
    public HttpApiMockContract getMock() {
        return this.mock;
    }

    public HttpApiDeployConfig setPolicyConfigs(java.util.List<HttpApiDeployConfigPolicyConfigs> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfigPolicyConfigs> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public HttpApiDeployConfig setRouteBackend(Backend routeBackend) {
        this.routeBackend = routeBackend;
        return this;
    }
    public Backend getRouteBackend() {
        return this.routeBackend;
    }

    public HttpApiDeployConfig setServiceConfigs(java.util.List<HttpApiDeployConfigServiceConfigs> serviceConfigs) {
        this.serviceConfigs = serviceConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfigServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public HttpApiDeployConfig setSubDomains(java.util.List<HttpApiDeployConfigSubDomains> subDomains) {
        this.subDomains = subDomains;
        return this;
    }
    public java.util.List<HttpApiDeployConfigSubDomains> getSubDomains() {
        return this.subDomains;
    }

    public static class HttpApiDeployConfigCustomDomainInfos extends TeaModel {
        @NameInMap("domainId")
        public String domainId;

        @NameInMap("name")
        public String name;

        @NameInMap("protocol")
        public String protocol;

        public static HttpApiDeployConfigCustomDomainInfos build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigCustomDomainInfos self = new HttpApiDeployConfigCustomDomainInfos();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigCustomDomainInfos setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpApiDeployConfigCustomDomainInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiDeployConfigCustomDomainInfos setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs extends TeaModel {
        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("targetModelName")
        public String targetModelName;

        public static HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs self = new HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs setTargetModelName(String targetModelName) {
            this.targetModelName = targetModelName;
            return this;
        }
        public String getTargetModelName() {
            return this.targetModelName;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigsAiFallbackConfig extends TeaModel {
        @NameInMap("serviceConfigs")
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs> serviceConfigs;

        public static HttpApiDeployConfigPolicyConfigsAiFallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigsAiFallbackConfig self = new HttpApiDeployConfigPolicyConfigsAiFallbackConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigsAiFallbackConfig setServiceConfigs(java.util.List<HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<HttpApiDeployConfigPolicyConfigsAiFallbackConfigServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

    }

    public static class HttpApiDeployConfigPolicyConfigs extends TeaModel {
        @NameInMap("aiFallbackConfig")
        public HttpApiDeployConfigPolicyConfigsAiFallbackConfig aiFallbackConfig;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>AiFallback</p>
         */
        @NameInMap("type")
        public String type;

        public static HttpApiDeployConfigPolicyConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigPolicyConfigs self = new HttpApiDeployConfigPolicyConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigPolicyConfigs setAiFallbackConfig(HttpApiDeployConfigPolicyConfigsAiFallbackConfig aiFallbackConfig) {
            this.aiFallbackConfig = aiFallbackConfig;
            return this;
        }
        public HttpApiDeployConfigPolicyConfigsAiFallbackConfig getAiFallbackConfig() {
            return this.aiFallbackConfig;
        }

        public HttpApiDeployConfigPolicyConfigs setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public HttpApiDeployConfigPolicyConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiDeployConfigServiceConfigs extends TeaModel {
        @NameInMap("intentCode")
        public String intentCode;

        /**
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>qwen-*</p>
         */
        @NameInMap("modelNamePattern")
        public String modelNamePattern;

        /**
         * <strong>example:</strong>
         * <p>svc-xxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Long weight;

        public static HttpApiDeployConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigServiceConfigs self = new HttpApiDeployConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigServiceConfigs setIntentCode(String intentCode) {
            this.intentCode = intentCode;
            return this;
        }
        public String getIntentCode() {
            return this.intentCode;
        }

        public HttpApiDeployConfigServiceConfigs setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public HttpApiDeployConfigServiceConfigs setModelNamePattern(String modelNamePattern) {
            this.modelNamePattern = modelNamePattern;
            return this;
        }
        public String getModelNamePattern() {
            return this.modelNamePattern;
        }

        public HttpApiDeployConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiDeployConfigServiceConfigs setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

    }

    public static class HttpApiDeployConfigSubDomains extends TeaModel {
        @NameInMap("domainId")
        public String domainId;

        @NameInMap("name")
        public String name;

        @NameInMap("networkType")
        public String networkType;

        @NameInMap("protocol")
        public String protocol;

        public static HttpApiDeployConfigSubDomains build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigSubDomains self = new HttpApiDeployConfigSubDomains();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigSubDomains setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public HttpApiDeployConfigSubDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiDeployConfigSubDomains setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public HttpApiDeployConfigSubDomains setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
