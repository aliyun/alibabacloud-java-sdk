// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiDeployConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoDeploy")
    public Boolean autoDeploy;

    /**
     * <p>The publishing scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>SingleService</p>
     */
    @NameInMap("backendScene")
    public String backendScene;

    @NameInMap("builtinRouteNames")
    public java.util.List<String> builtinRouteNames;

    /**
     * <p>The IDs of the custom domain names.</p>
     */
    @NameInMap("customDomainIds")
    public java.util.List<String> customDomainIds;

    /**
     * <p>The information about the custom domain names.</p>
     */
    @NameInMap("customDomainInfos")
    public java.util.List<HttpApiDeployConfigCustomDomainInfos> customDomainInfos;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>The instance information.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("gatewayInfo")
    public GatewayInfo gatewayInfo;

    /**
     * <p>网关类型</p>
     * 
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The Mock settings.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("mock")
    public HttpApiMockContract mock;

    /**
     * <p>The policy configurations.</p>
     */
    @NameInMap("policyConfigs")
    public java.util.List<HttpApiPolicyConfigs> policyConfigs;

    /**
     * <p>routeBackend</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("routeBackend")
    public Backend routeBackend;

    /**
     * <p>The service configurations.</p>
     */
    @NameInMap("serviceConfigs")
    public java.util.List<HttpApiDeployConfigServiceConfigs> serviceConfigs;

    /**
     * <p>The information about the sub-domain names.</p>
     */
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

    public HttpApiDeployConfig setBuiltinRouteNames(java.util.List<String> builtinRouteNames) {
        this.builtinRouteNames = builtinRouteNames;
        return this;
    }
    public java.util.List<String> getBuiltinRouteNames() {
        return this.builtinRouteNames;
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

    public HttpApiDeployConfig setPolicyConfigs(java.util.List<HttpApiPolicyConfigs> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<HttpApiPolicyConfigs> getPolicyConfigs() {
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
        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cshee6dlhtgkf4muio3g</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>hello-server.com</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
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

    public static class HttpApiDeployConfigServiceConfigsObservabilityRouteConfig extends TeaModel {
        /**
         * <p>Routing mode</p>
         * 
         * <strong>example:</strong>
         * <p>LeastBusy</p>
         */
        @NameInMap("mode")
        public String mode;

        /**
         * <p>Queue size</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("queueSize")
        public Integer queueSize;

        /**
         * <p>Max traffic ratio per single service</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("rateLimit")
        public Float rateLimit;

        public static HttpApiDeployConfigServiceConfigsObservabilityRouteConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigServiceConfigsObservabilityRouteConfig self = new HttpApiDeployConfigServiceConfigsObservabilityRouteConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig setQueueSize(Integer queueSize) {
            this.queueSize = queueSize;
            return this;
        }
        public Integer getQueueSize() {
            return this.queueSize;
        }

        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig setRateLimit(Float rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public Float getRateLimit() {
            return this.rateLimit;
        }

    }

    public static class HttpApiDeployConfigServiceConfigs extends TeaModel {
        /**
         * <p>Legacy gateway service ID for backward compatibility</p>
         * 
         * <strong>example:</strong>
         * <p>gw-svc-abc123</p>
         */
        @NameInMap("gatewayServiceId")
        public String gatewayServiceId;

        /**
         * <p>Intent classification code</p>
         * 
         * <strong>example:</strong>
         * <p>INQUIRY</p>
         */
        @NameInMap("intentCode")
        public String intentCode;

        /**
         * <p>Match conditions</p>
         */
        @NameInMap("match")
        public HttpApiBackendMatchConditions match;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model name matching rule.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-*</p>
         */
        @NameInMap("modelNamePattern")
        public String modelNamePattern;

        /**
         * <p>Multi-service routing strategy type</p>
         * 
         * <strong>example:</strong>
         * <p>ByWeight</p>
         */
        @NameInMap("multiServiceRouteStrategy")
        public String multiServiceRouteStrategy;

        /**
         * <p>Service display name</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen-Max-Service</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Observability metrics-based routing config</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("observabilityRouteConfig")
        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig observabilityRouteConfig;

        /**
         * <p>Service port number</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>Service protocol</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-xxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Service version tag for tag-based routing scenarios</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The service weight.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("weight")
        public Long weight;

        public static HttpApiDeployConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiDeployConfigServiceConfigs self = new HttpApiDeployConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiDeployConfigServiceConfigs setGatewayServiceId(String gatewayServiceId) {
            this.gatewayServiceId = gatewayServiceId;
            return this;
        }
        public String getGatewayServiceId() {
            return this.gatewayServiceId;
        }

        public HttpApiDeployConfigServiceConfigs setIntentCode(String intentCode) {
            this.intentCode = intentCode;
            return this;
        }
        public String getIntentCode() {
            return this.intentCode;
        }

        public HttpApiDeployConfigServiceConfigs setMatch(HttpApiBackendMatchConditions match) {
            this.match = match;
            return this;
        }
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
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

        public HttpApiDeployConfigServiceConfigs setMultiServiceRouteStrategy(String multiServiceRouteStrategy) {
            this.multiServiceRouteStrategy = multiServiceRouteStrategy;
            return this;
        }
        public String getMultiServiceRouteStrategy() {
            return this.multiServiceRouteStrategy;
        }

        public HttpApiDeployConfigServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiDeployConfigServiceConfigs setObservabilityRouteConfig(HttpApiDeployConfigServiceConfigsObservabilityRouteConfig observabilityRouteConfig) {
            this.observabilityRouteConfig = observabilityRouteConfig;
            return this;
        }
        public HttpApiDeployConfigServiceConfigsObservabilityRouteConfig getObservabilityRouteConfig() {
            return this.observabilityRouteConfig;
        }

        public HttpApiDeployConfigServiceConfigs setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public HttpApiDeployConfigServiceConfigs setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public HttpApiDeployConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiDeployConfigServiceConfigs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
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
        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-csmn42um1hksudfk9eng</p>
         */
        @NameInMap("domainId")
        public String domainId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        @NameInMap("networkType")
        public String networkType;

        /**
         * <p>The protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
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
