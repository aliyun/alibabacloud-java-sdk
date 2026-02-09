// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateHttpApiRouteRequest extends TeaModel {
    /**
     * <p>The backend service configurations for the route.</p>
     */
    @NameInMap("backendConfig")
    public UpdateHttpApiRouteRequestBackendConfig backendConfig;

    @NameInMap("deployConfigs")
    public java.util.List<HttpApiDeployConfig> deployConfigs;

    /**
     * <p>The route description.</p>
     * 
     * <strong>example:</strong>
     * <p>test route</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of domain IDs.</p>
     */
    @NameInMap("domainIds")
    public java.util.List<String> domainIds;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-cquqsollhtgid***</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The route match rule.</p>
     */
    @NameInMap("match")
    public HttpRouteMatch match;

    @NameInMap("mcpRouteConfig")
    public UpdateHttpApiRouteRequestMcpRouteConfig mcpRouteConfig;

    @NameInMap("name")
    public String name;

    @NameInMap("policyConfigs")
    public java.util.List<UpdateHttpApiRouteRequestPolicyConfigs> policyConfigs;

    public static UpdateHttpApiRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpApiRouteRequest self = new UpdateHttpApiRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHttpApiRouteRequest setBackendConfig(UpdateHttpApiRouteRequestBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public UpdateHttpApiRouteRequestBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public UpdateHttpApiRouteRequest setDeployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
        this.deployConfigs = deployConfigs;
        return this;
    }
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
    }

    public UpdateHttpApiRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateHttpApiRouteRequest setDomainIds(java.util.List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    public UpdateHttpApiRouteRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public UpdateHttpApiRouteRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public UpdateHttpApiRouteRequest setMcpRouteConfig(UpdateHttpApiRouteRequestMcpRouteConfig mcpRouteConfig) {
        this.mcpRouteConfig = mcpRouteConfig;
        return this;
    }
    public UpdateHttpApiRouteRequestMcpRouteConfig getMcpRouteConfig() {
        return this.mcpRouteConfig;
    }

    public UpdateHttpApiRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateHttpApiRouteRequest setPolicyConfigs(java.util.List<UpdateHttpApiRouteRequestPolicyConfigs> policyConfigs) {
        this.policyConfigs = policyConfigs;
        return this;
    }
    public java.util.List<UpdateHttpApiRouteRequestPolicyConfigs> getPolicyConfigs() {
        return this.policyConfigs;
    }

    public static class UpdateHttpApiRouteRequestBackendConfigServices extends TeaModel {
        /**
         * <p>The service port (omit for dynamic ports).</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The service protocol. Valid values:</p>
         * <ul>
         * <li>HTTP</li>
         * <li>HTTPS</li>
         * </ul>
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
         * <p>svc-cr6pk4tlhtgm58e***</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The traffic weight percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("weight")
        public Integer weight;

        public static UpdateHttpApiRouteRequestBackendConfigServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestBackendConfigServices self = new UpdateHttpApiRouteRequestBackendConfigServices();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateHttpApiRouteRequestBackendConfigServices setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class UpdateHttpApiRouteRequestBackendConfig extends TeaModel {
        /**
         * <p>The backend service scenario. Valid values:</p>
         * <ul>
         * <li>SingleService</li>
         * <li>MultiServiceByRatio</li>
         * <li>Redirect</li>
         * <li>Mock</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SingleService</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The list of backend services.</p>
         */
        @NameInMap("services")
        public java.util.List<UpdateHttpApiRouteRequestBackendConfigServices> services;

        public static UpdateHttpApiRouteRequestBackendConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestBackendConfig self = new UpdateHttpApiRouteRequestBackendConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestBackendConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public UpdateHttpApiRouteRequestBackendConfig setServices(java.util.List<UpdateHttpApiRouteRequestBackendConfigServices> services) {
            this.services = services;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestBackendConfigServices> getServices() {
            return this.services;
        }

    }

    public static class UpdateHttpApiRouteRequestMcpRouteConfig extends TeaModel {
        @NameInMap("exposedUriPath")
        public String exposedUriPath;

        @NameInMap("mcpStatisticsEnable")
        public Boolean mcpStatisticsEnable;

        @NameInMap("protocol")
        public String protocol;

        public static UpdateHttpApiRouteRequestMcpRouteConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestMcpRouteConfig self = new UpdateHttpApiRouteRequestMcpRouteConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestMcpRouteConfig setExposedUriPath(String exposedUriPath) {
            this.exposedUriPath = exposedUriPath;
            return this;
        }
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        public UpdateHttpApiRouteRequestMcpRouteConfig setMcpStatisticsEnable(Boolean mcpStatisticsEnable) {
            this.mcpStatisticsEnable = mcpStatisticsEnable;
            return this;
        }
        public Boolean getMcpStatisticsEnable() {
            return this.mcpStatisticsEnable;
        }

        public UpdateHttpApiRouteRequestMcpRouteConfig setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig extends TeaModel {
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeout")
        public Integer timeout;

        @NameInMap("type")
        public String type;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus self = new UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig extends TeaModel {
        @NameInMap("databaseNumber")
        public Integer databaseNumber;

        @NameInMap("host")
        public String host;

        @NameInMap("password")
        public String password;

        @NameInMap("port")
        public Integer port;

        @NameInMap("timeout")
        public Integer timeout;

        @NameInMap("username")
        public String username;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig setDatabaseNumber(Integer databaseNumber) {
            this.databaseNumber = databaseNumber;
            return this;
        }
        public Integer getDatabaseNumber() {
            return this.databaseNumber;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig extends TeaModel {
        /**
         * <p>apiKey</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        @NameInMap("collectionId")
        public String collectionId;

        @NameInMap("serviceHost")
        public String serviceHost;

        @NameInMap("threshold")
        public Float threshold;

        /**
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        @NameInMap("type")
        public String type;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig setCollectionId(String collectionId) {
            this.collectionId = collectionId;
            return this;
        }
        public String getCollectionId() {
            return this.collectionId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig extends TeaModel {
        @NameInMap("cacheKeyStrategy")
        public String cacheKeyStrategy;

        @NameInMap("cacheMode")
        public String cacheMode;

        @NameInMap("cacheTTL")
        public Integer cacheTTL;

        @NameInMap("embeddingConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig embeddingConfig;

        @NameInMap("pluginStatus")
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus pluginStatus;

        @NameInMap("redisConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig redisConfig;

        @NameInMap("vectorConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig vectorConfig;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig setCacheKeyStrategy(String cacheKeyStrategy) {
            this.cacheKeyStrategy = cacheKeyStrategy;
            return this;
        }
        public String getCacheKeyStrategy() {
            return this.cacheKeyStrategy;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig setCacheMode(String cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }
        public String getCacheMode() {
            return this.cacheMode;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig setCacheTTL(Integer cacheTTL) {
            this.cacheTTL = cacheTTL;
            return this;
        }
        public Integer getCacheTTL() {
            return this.cacheTTL;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig setEmbeddingConfig(UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigEmbeddingConfig getEmbeddingConfig() {
            return this.embeddingConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig setPluginStatus(UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig setRedisConfig(UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig redisConfig) {
            this.redisConfig = redisConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigRedisConfig getRedisConfig() {
            return this.redisConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig setVectorConfig(UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig vectorConfig) {
            this.vectorConfig = vectorConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfigVectorConfig getVectorConfig() {
            return this.vectorConfig;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("passThroughModelName")
        public Boolean passThroughModelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("targetModelName")
        public String targetModelName;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs self = new UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs setPassThroughModelName(Boolean passThroughModelName) {
            this.passThroughModelName = passThroughModelName;
            return this;
        }
        public Boolean getPassThroughModelName() {
            return this.passThroughModelName;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs setTargetModelName(String targetModelName) {
            this.targetModelName = targetModelName;
            return this;
        }
        public String getTargetModelName() {
            return this.targetModelName;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig extends TeaModel {
        @NameInMap("onlyRedirectUpstreamCode")
        public Boolean onlyRedirectUpstreamCode;

        @NameInMap("routeEmbedded")
        public Boolean routeEmbedded;

        @NameInMap("serviceConfigs")
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs> serviceConfigs;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig setOnlyRedirectUpstreamCode(Boolean onlyRedirectUpstreamCode) {
            this.onlyRedirectUpstreamCode = onlyRedirectUpstreamCode;
            return this;
        }
        public Boolean getOnlyRedirectUpstreamCode() {
            return this.onlyRedirectUpstreamCode;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig setRouteEmbedded(Boolean routeEmbedded) {
            this.routeEmbedded = routeEmbedded;
            return this;
        }
        public Boolean getRouteEmbedded() {
            return this.routeEmbedded;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig setServiceConfigs(java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfigServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus self = new UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig extends TeaModel {
        @NameInMap("apiKey")
        public String apiKey;

        @NameInMap("contentMode")
        public String contentMode;

        @NameInMap("count")
        public Integer count;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("industry")
        public String industry;

        @NameInMap("optionArgs")
        public java.util.Map<String, String> optionArgs;

        @NameInMap("start")
        public Integer start;

        @NameInMap("timeRange")
        public String timeRange;

        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        @NameInMap("type")
        public String type;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setContentMode(String contentMode) {
            this.contentMode = contentMode;
            return this;
        }
        public String getContentMode() {
            return this.contentMode;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setOptionArgs(java.util.Map<String, String> optionArgs) {
            this.optionArgs = optionArgs;
            return this;
        }
        public java.util.Map<String, String> getOptionArgs() {
            return this.optionArgs;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom extends TeaModel {
        @NameInMap("apiKey")
        public String apiKey;

        @NameInMap("contentMode")
        public String contentMode;

        @NameInMap("count")
        public Integer count;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("industry")
        public String industry;

        @NameInMap("optionArgs")
        public java.util.Map<String, String> optionArgs;

        @NameInMap("start")
        public Integer start;

        @NameInMap("timeRange")
        public String timeRange;

        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        @NameInMap("type")
        public String type;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom self = new UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setContentMode(String contentMode) {
            this.contentMode = contentMode;
            return this;
        }
        public String getContentMode() {
            return this.contentMode;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setOptionArgs(java.util.Map<String, String> optionArgs) {
            this.optionArgs = optionArgs;
            return this;
        }
        public java.util.Map<String, String> getOptionArgs() {
            return this.optionArgs;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("maxCount")
        public Integer maxCount;

        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite self = new UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig extends TeaModel {
        @NameInMap("defaultEnable")
        public Boolean defaultEnable;

        @NameInMap("defaultLang")
        public String defaultLang;

        @NameInMap("needReference")
        public Boolean needReference;

        @NameInMap("pluginStatus")
        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus pluginStatus;

        @NameInMap("referenceFormat")
        public String referenceFormat;

        @NameInMap("referenceLocation")
        public String referenceLocation;

        @NameInMap("searchEngineConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig searchEngineConfig;

        @NameInMap("searchFrom")
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom> searchFrom;

        @NameInMap("searchRewrite")
        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite searchRewrite;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig setDefaultEnable(Boolean defaultEnable) {
            this.defaultEnable = defaultEnable;
            return this;
        }
        public Boolean getDefaultEnable() {
            return this.defaultEnable;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig setDefaultLang(String defaultLang) {
            this.defaultLang = defaultLang;
            return this;
        }
        public String getDefaultLang() {
            return this.defaultLang;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig setNeedReference(Boolean needReference) {
            this.needReference = needReference;
            return this;
        }
        public Boolean getNeedReference() {
            return this.needReference;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig setPluginStatus(UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig setReferenceFormat(String referenceFormat) {
            this.referenceFormat = referenceFormat;
            return this;
        }
        public String getReferenceFormat() {
            return this.referenceFormat;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig setReferenceLocation(String referenceLocation) {
            this.referenceLocation = referenceLocation;
            return this;
        }
        public String getReferenceLocation() {
            return this.referenceLocation;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig setSearchEngineConfig(UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig searchEngineConfig) {
            this.searchEngineConfig = searchEngineConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchEngineConfig getSearchEngineConfig() {
            return this.searchEngineConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig setSearchFrom(java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom> searchFrom) {
            this.searchFrom = searchFrom;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchFrom> getSearchFrom() {
            return this.searchFrom;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig setSearchRewrite(UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite searchRewrite) {
            this.searchRewrite = searchRewrite;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfigSearchRewrite getSearchRewrite() {
            return this.searchRewrite;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService extends TeaModel {
        @NameInMap("matchType")
        public String matchType;

        @NameInMap("modalityType")
        public String modalityType;

        @NameInMap("name")
        public String name;

        @NameInMap("requestCheckService")
        public String requestCheckService;

        @NameInMap("requestImageCheckService")
        public String requestImageCheckService;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService self = new UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setModalityType(String modalityType) {
            this.modalityType = modalityType;
            return this;
        }
        public String getModalityType() {
            return this.modalityType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setRequestCheckService(String requestCheckService) {
            this.requestCheckService = requestCheckService;
            return this;
        }
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setRequestImageCheckService(String requestImageCheckService) {
            this.requestImageCheckService = requestImageCheckService;
            return this;
        }
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService extends TeaModel {
        @NameInMap("matchType")
        public String matchType;

        @NameInMap("modalityType")
        public String modalityType;

        @NameInMap("name")
        public String name;

        @NameInMap("responseCheckService")
        public String responseCheckService;

        @NameInMap("responseImageCheckService")
        public String responseImageCheckService;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService self = new UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setModalityType(String modalityType) {
            this.modalityType = modalityType;
            return this;
        }
        public String getModalityType() {
            return this.modalityType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setResponseCheckService(String responseCheckService) {
            this.responseCheckService = responseCheckService;
            return this;
        }
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setResponseImageCheckService(String responseImageCheckService) {
            this.responseImageCheckService = responseImageCheckService;
            return this;
        }
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel extends TeaModel {
        @NameInMap("level")
        public String level;

        @NameInMap("matchType")
        public String matchType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel self = new UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus self = new UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules extends TeaModel {
        @NameInMap("matchType")
        public String matchType;

        @NameInMap("pattern")
        public String pattern;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules self = new UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig extends TeaModel {
        @NameInMap("consumerRules")
        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules consumerRules;

        @NameInMap("level")
        public String level;

        @NameInMap("type")
        public String type;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig setConsumerRules(UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules consumerRules) {
            this.consumerRules = consumerRules;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules getConsumerRules() {
            return this.consumerRules;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig extends TeaModel {
        @NameInMap("bufferLimit")
        public Integer bufferLimit;

        @NameInMap("checkRequest")
        public Boolean checkRequest;

        @NameInMap("checkRequestImage")
        public Boolean checkRequestImage;

        @NameInMap("checkResponse")
        public Boolean checkResponse;

        @NameInMap("checkResponseImage")
        public Boolean checkResponseImage;

        @NameInMap("consumerRequestCheckService")
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService;

        @NameInMap("consumerResponseCheckService")
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService;

        @NameInMap("consumerRiskLevel")
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel;

        @NameInMap("pluginStatus")
        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus pluginStatus;

        @NameInMap("requestCheckService")
        public String requestCheckService;

        @NameInMap("requestImageCheckService")
        public String requestImageCheckService;

        @NameInMap("responseCheckService")
        public String responseCheckService;

        @NameInMap("responseImageCheckService")
        public String responseImageCheckService;

        @NameInMap("riskAlertLevel")
        public String riskAlertLevel;

        @NameInMap("riskConfig")
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig> riskConfig;

        @NameInMap("serviceAddress")
        public String serviceAddress;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setBufferLimit(Integer bufferLimit) {
            this.bufferLimit = bufferLimit;
            return this;
        }
        public Integer getBufferLimit() {
            return this.bufferLimit;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setCheckRequest(Boolean checkRequest) {
            this.checkRequest = checkRequest;
            return this;
        }
        public Boolean getCheckRequest() {
            return this.checkRequest;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setCheckRequestImage(Boolean checkRequestImage) {
            this.checkRequestImage = checkRequestImage;
            return this;
        }
        public Boolean getCheckRequestImage() {
            return this.checkRequestImage;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setCheckResponse(Boolean checkResponse) {
            this.checkResponse = checkResponse;
            return this;
        }
        public Boolean getCheckResponse() {
            return this.checkResponse;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setCheckResponseImage(Boolean checkResponseImage) {
            this.checkResponseImage = checkResponseImage;
            return this;
        }
        public Boolean getCheckResponseImage() {
            return this.checkResponseImage;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setConsumerRequestCheckService(java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService) {
            this.consumerRequestCheckService = consumerRequestCheckService;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> getConsumerRequestCheckService() {
            return this.consumerRequestCheckService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setConsumerResponseCheckService(java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService) {
            this.consumerResponseCheckService = consumerResponseCheckService;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> getConsumerResponseCheckService() {
            return this.consumerResponseCheckService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setConsumerRiskLevel(java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel) {
            this.consumerRiskLevel = consumerRiskLevel;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> getConsumerRiskLevel() {
            return this.consumerRiskLevel;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setPluginStatus(UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setRequestCheckService(String requestCheckService) {
            this.requestCheckService = requestCheckService;
            return this;
        }
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setRequestImageCheckService(String requestImageCheckService) {
            this.requestImageCheckService = requestImageCheckService;
            return this;
        }
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setResponseCheckService(String responseCheckService) {
            this.responseCheckService = responseCheckService;
            return this;
        }
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setResponseImageCheckService(String responseImageCheckService) {
            this.responseImageCheckService = responseImageCheckService;
            return this;
        }
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setRiskAlertLevel(String riskAlertLevel) {
            this.riskAlertLevel = riskAlertLevel;
            return this;
        }
        public String getRiskAlertLevel() {
            return this.riskAlertLevel;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setRiskConfig(java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig> riskConfig) {
            this.riskConfig = riskConfig;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfigRiskConfig> getRiskConfig() {
            return this.riskConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig setServiceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }
        public String getServiceAddress() {
            return this.serviceAddress;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiStatisticsConfig extends TeaModel {
        @NameInMap("logRequestContent")
        public Boolean logRequestContent;

        @NameInMap("logResponseContent")
        public Boolean logResponseContent;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiStatisticsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiStatisticsConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiStatisticsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiStatisticsConfig setLogRequestContent(Boolean logRequestContent) {
            this.logRequestContent = logRequestContent;
            return this;
        }
        public Boolean getLogRequestContent() {
            return this.logRequestContent;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiStatisticsConfig setLogResponseContent(Boolean logResponseContent) {
            this.logResponseContent = logResponseContent;
            return this;
        }
        public Boolean getLogResponseContent() {
            return this.logResponseContent;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules extends TeaModel {
        @NameInMap("limitMode")
        public String limitMode;

        @NameInMap("limitType")
        public String limitType;

        @NameInMap("limitValue")
        public Integer limitValue;

        @NameInMap("matchKey")
        public String matchKey;

        @NameInMap("matchType")
        public String matchType;

        @NameInMap("matchValue")
        public String matchValue;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules self = new UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules setLimitMode(String limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public String getLimitMode() {
            return this.limitMode;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules setLimitValue(Integer limitValue) {
            this.limitValue = limitValue;
            return this;
        }
        public Integer getLimitValue() {
            return this.limitValue;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules setMatchKey(String matchKey) {
            this.matchKey = matchKey;
            return this;
        }
        public String getMatchKey() {
            return this.matchKey;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules setMatchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }
        public String getMatchValue() {
            return this.matchValue;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus self = new UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig extends TeaModel {
        @NameInMap("databaseNumber")
        public Integer databaseNumber;

        @NameInMap("host")
        public String host;

        @NameInMap("password")
        public String password;

        @NameInMap("port")
        public Integer port;

        @NameInMap("timeout")
        public Integer timeout;

        @NameInMap("username")
        public String username;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig setDatabaseNumber(Integer databaseNumber) {
            this.databaseNumber = databaseNumber;
            return this;
        }
        public Integer getDatabaseNumber() {
            return this.databaseNumber;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules extends TeaModel {
        @NameInMap("limitMode")
        public String limitMode;

        @NameInMap("limitType")
        public String limitType;

        @NameInMap("limitValue")
        public Integer limitValue;

        @NameInMap("matchKey")
        public String matchKey;

        @NameInMap("matchType")
        public String matchType;

        @NameInMap("matchValue")
        public String matchValue;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules self = new UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules setLimitMode(String limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public String getLimitMode() {
            return this.limitMode;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules setLimitValue(Integer limitValue) {
            this.limitValue = limitValue;
            return this;
        }
        public Integer getLimitValue() {
            return this.limitValue;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules setMatchKey(String matchKey) {
            this.matchKey = matchKey;
            return this;
        }
        public String getMatchKey() {
            return this.matchKey;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules setMatchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }
        public String getMatchValue() {
            return this.matchValue;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig extends TeaModel {
        @NameInMap("enableGlobalRules")
        public Boolean enableGlobalRules;

        @NameInMap("globalRules")
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules> globalRules;

        @NameInMap("pluginStatus")
        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus pluginStatus;

        @NameInMap("redisConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig redisConfig;

        @NameInMap("rules")
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules> rules;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig setEnableGlobalRules(Boolean enableGlobalRules) {
            this.enableGlobalRules = enableGlobalRules;
            return this;
        }
        public Boolean getEnableGlobalRules() {
            return this.enableGlobalRules;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig setGlobalRules(java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules> globalRules) {
            this.globalRules = globalRules;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigGlobalRules> getGlobalRules() {
            return this.globalRules;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig setPluginStatus(UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig setRedisConfig(UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig redisConfig) {
            this.redisConfig = redisConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRedisConfig getRedisConfig() {
            return this.redisConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig setRules(java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfigRules> getRules() {
            return this.rules;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigEnableConditions extends TeaModel {
        @NameInMap("toolCountThreshold")
        public Integer toolCountThreshold;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigEnableConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigEnableConditions self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigEnableConditions();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigEnableConditions setToolCountThreshold(Integer toolCountThreshold) {
            this.toolCountThreshold = toolCountThreshold;
            return this;
        }
        public Integer getToolCountThreshold() {
            return this.toolCountThreshold;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public Integer value;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService extends TeaModel {
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig extends TeaModel {
        @NameInMap("customPrompt")
        public String customPrompt;

        @NameInMap("type")
        public String type;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig setCustomPrompt(String customPrompt) {
            this.customPrompt = customPrompt;
            return this;
        }
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions extends TeaModel {
        @NameInMap("messageCountThreshold")
        public Integer messageCountThreshold;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions setMessageCountThreshold(Integer messageCountThreshold) {
            this.messageCountThreshold = messageCountThreshold;
            return this;
        }
        public Integer getMessageCountThreshold() {
            return this.messageCountThreshold;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting extends TeaModel {
        @NameInMap("contextSelection")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection contextSelection;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        @NameInMap("maxOutputTokens")
        public Integer maxOutputTokens;

        @NameInMap("modelService")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService modelService;

        @NameInMap("promptConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig promptConfig;

        @NameInMap("triggerConditions")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions triggerConditions;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting setContextSelection(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection contextSelection) {
            this.contextSelection = contextSelection;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection getContextSelection() {
            return this.contextSelection;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting setFallbackStrategy(String fallbackStrategy) {
            this.fallbackStrategy = fallbackStrategy;
            return this;
        }
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting setMaxOutputTokens(Integer maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Integer getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting setModelService(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService modelService) {
            this.modelService = modelService;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingModelService getModelService() {
            return this.modelService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting setPromptConfig(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig promptConfig) {
            this.promptConfig = promptConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig getPromptConfig() {
            return this.promptConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting setTriggerConditions(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions triggerConditions) {
            this.triggerConditions = triggerConditions;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions getTriggerConditions() {
            return this.triggerConditions;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService extends TeaModel {
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking extends TeaModel {
        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        @NameInMap("filteringMethod")
        public String filteringMethod;

        @NameInMap("modelService")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService modelService;

        @NameInMap("scoreThreshold")
        public Float scoreThreshold;

        @NameInMap("topKPercent")
        public Integer topKPercent;

        @NameInMap("topNCount")
        public Integer topNCount;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking setFallbackStrategy(String fallbackStrategy) {
            this.fallbackStrategy = fallbackStrategy;
            return this;
        }
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking setFilteringMethod(String filteringMethod) {
            this.filteringMethod = filteringMethod;
            return this;
        }
        public String getFilteringMethod() {
            return this.filteringMethod;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking setModelService(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService modelService) {
            this.modelService = modelService;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolRerankingModelService getModelService() {
            return this.modelService;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking setScoreThreshold(Float scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Float getScoreThreshold() {
            return this.scoreThreshold;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking setTopKPercent(Integer topKPercent) {
            this.topKPercent = topKPercent;
            return this;
        }
        public Integer getTopKPercent() {
            return this.topKPercent;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking setTopNCount(Integer topNCount) {
            this.topNCount = topNCount;
            return this;
        }
        public Integer getTopNCount() {
            return this.topNCount;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig extends TeaModel {
        @NameInMap("enableConditions")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigEnableConditions enableConditions;

        @NameInMap("pluginStatus")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus pluginStatus;

        @NameInMap("queryRewriting")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting queryRewriting;

        @NameInMap("toolReranking")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking toolReranking;

        public static UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig self = new UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig setEnableConditions(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigEnableConditions enableConditions) {
            this.enableConditions = enableConditions;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigEnableConditions getEnableConditions() {
            return this.enableConditions;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig setPluginStatus(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig setQueryRewriting(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting queryRewriting) {
            this.queryRewriting = queryRewriting;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigQueryRewriting getQueryRewriting() {
            return this.queryRewriting;
        }

        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig setToolReranking(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking toolReranking) {
            this.toolReranking = toolReranking;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfigToolReranking getToolReranking() {
            return this.toolReranking;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigsSemanticRouterConfig extends TeaModel {
        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static UpdateHttpApiRouteRequestPolicyConfigsSemanticRouterConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigsSemanticRouterConfig self = new UpdateHttpApiRouteRequestPolicyConfigsSemanticRouterConfig();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigsSemanticRouterConfig setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

    public static class UpdateHttpApiRouteRequestPolicyConfigs extends TeaModel {
        @NameInMap("aiCacheConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig aiCacheConfig;

        @NameInMap("aiFallbackConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig aiFallbackConfig;

        @NameInMap("aiNetworkSearchConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig aiNetworkSearchConfig;

        @NameInMap("aiSecurityGuardConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig aiSecurityGuardConfig;

        @NameInMap("aiStatisticsConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiStatisticsConfig aiStatisticsConfig;

        @NameInMap("aiTokenRateLimitConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig aiTokenRateLimitConfig;

        @NameInMap("aiToolSelectionConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig aiToolSelectionConfig;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("semanticRouterConfig")
        public UpdateHttpApiRouteRequestPolicyConfigsSemanticRouterConfig semanticRouterConfig;

        @NameInMap("type")
        public String type;

        public static UpdateHttpApiRouteRequestPolicyConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateHttpApiRouteRequestPolicyConfigs self = new UpdateHttpApiRouteRequestPolicyConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setAiCacheConfig(UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig aiCacheConfig) {
            this.aiCacheConfig = aiCacheConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiCacheConfig getAiCacheConfig() {
            return this.aiCacheConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setAiFallbackConfig(UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig aiFallbackConfig) {
            this.aiFallbackConfig = aiFallbackConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiFallbackConfig getAiFallbackConfig() {
            return this.aiFallbackConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setAiNetworkSearchConfig(UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig aiNetworkSearchConfig) {
            this.aiNetworkSearchConfig = aiNetworkSearchConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiNetworkSearchConfig getAiNetworkSearchConfig() {
            return this.aiNetworkSearchConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setAiSecurityGuardConfig(UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig aiSecurityGuardConfig) {
            this.aiSecurityGuardConfig = aiSecurityGuardConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiSecurityGuardConfig getAiSecurityGuardConfig() {
            return this.aiSecurityGuardConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setAiStatisticsConfig(UpdateHttpApiRouteRequestPolicyConfigsAiStatisticsConfig aiStatisticsConfig) {
            this.aiStatisticsConfig = aiStatisticsConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiStatisticsConfig getAiStatisticsConfig() {
            return this.aiStatisticsConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setAiTokenRateLimitConfig(UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig aiTokenRateLimitConfig) {
            this.aiTokenRateLimitConfig = aiTokenRateLimitConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiTokenRateLimitConfig getAiTokenRateLimitConfig() {
            return this.aiTokenRateLimitConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setAiToolSelectionConfig(UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig aiToolSelectionConfig) {
            this.aiToolSelectionConfig = aiToolSelectionConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsAiToolSelectionConfig getAiToolSelectionConfig() {
            return this.aiToolSelectionConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setSemanticRouterConfig(UpdateHttpApiRouteRequestPolicyConfigsSemanticRouterConfig semanticRouterConfig) {
            this.semanticRouterConfig = semanticRouterConfig;
            return this;
        }
        public UpdateHttpApiRouteRequestPolicyConfigsSemanticRouterConfig getSemanticRouterConfig() {
            return this.semanticRouterConfig;
        }

        public UpdateHttpApiRouteRequestPolicyConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
