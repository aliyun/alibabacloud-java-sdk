// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiPolicyConfigs extends TeaModel {
    @NameInMap("aiCacheConfig")
    public HttpApiPolicyConfigsAiCacheConfig aiCacheConfig;

    @NameInMap("aiFallbackConfig")
    public HttpApiPolicyConfigsAiFallbackConfig aiFallbackConfig;

    @NameInMap("aiNetworkSearchConfig")
    public HttpApiPolicyConfigsAiNetworkSearchConfig aiNetworkSearchConfig;

    @NameInMap("aiSecurityGuardConfig")
    public HttpApiPolicyConfigsAiSecurityGuardConfig aiSecurityGuardConfig;

    @NameInMap("aiStatisticsConfig")
    public HttpApiPolicyConfigsAiStatisticsConfig aiStatisticsConfig;

    @NameInMap("aiTokenRateLimitConfig")
    public HttpApiPolicyConfigsAiTokenRateLimitConfig aiTokenRateLimitConfig;

    @NameInMap("aiToolSelectionConfig")
    public HttpApiPolicyConfigsAiToolSelectionConfig aiToolSelectionConfig;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("semanticRouterConfig")
    public HttpApiPolicyConfigsSemanticRouterConfig semanticRouterConfig;

    @NameInMap("type")
    public String type;

    public static HttpApiPolicyConfigs build(java.util.Map<String, ?> map) throws Exception {
        HttpApiPolicyConfigs self = new HttpApiPolicyConfigs();
        return TeaModel.build(map, self);
    }

    public HttpApiPolicyConfigs setAiCacheConfig(HttpApiPolicyConfigsAiCacheConfig aiCacheConfig) {
        this.aiCacheConfig = aiCacheConfig;
        return this;
    }
    public HttpApiPolicyConfigsAiCacheConfig getAiCacheConfig() {
        return this.aiCacheConfig;
    }

    public HttpApiPolicyConfigs setAiFallbackConfig(HttpApiPolicyConfigsAiFallbackConfig aiFallbackConfig) {
        this.aiFallbackConfig = aiFallbackConfig;
        return this;
    }
    public HttpApiPolicyConfigsAiFallbackConfig getAiFallbackConfig() {
        return this.aiFallbackConfig;
    }

    public HttpApiPolicyConfigs setAiNetworkSearchConfig(HttpApiPolicyConfigsAiNetworkSearchConfig aiNetworkSearchConfig) {
        this.aiNetworkSearchConfig = aiNetworkSearchConfig;
        return this;
    }
    public HttpApiPolicyConfigsAiNetworkSearchConfig getAiNetworkSearchConfig() {
        return this.aiNetworkSearchConfig;
    }

    public HttpApiPolicyConfigs setAiSecurityGuardConfig(HttpApiPolicyConfigsAiSecurityGuardConfig aiSecurityGuardConfig) {
        this.aiSecurityGuardConfig = aiSecurityGuardConfig;
        return this;
    }
    public HttpApiPolicyConfigsAiSecurityGuardConfig getAiSecurityGuardConfig() {
        return this.aiSecurityGuardConfig;
    }

    public HttpApiPolicyConfigs setAiStatisticsConfig(HttpApiPolicyConfigsAiStatisticsConfig aiStatisticsConfig) {
        this.aiStatisticsConfig = aiStatisticsConfig;
        return this;
    }
    public HttpApiPolicyConfigsAiStatisticsConfig getAiStatisticsConfig() {
        return this.aiStatisticsConfig;
    }

    public HttpApiPolicyConfigs setAiTokenRateLimitConfig(HttpApiPolicyConfigsAiTokenRateLimitConfig aiTokenRateLimitConfig) {
        this.aiTokenRateLimitConfig = aiTokenRateLimitConfig;
        return this;
    }
    public HttpApiPolicyConfigsAiTokenRateLimitConfig getAiTokenRateLimitConfig() {
        return this.aiTokenRateLimitConfig;
    }

    public HttpApiPolicyConfigs setAiToolSelectionConfig(HttpApiPolicyConfigsAiToolSelectionConfig aiToolSelectionConfig) {
        this.aiToolSelectionConfig = aiToolSelectionConfig;
        return this;
    }
    public HttpApiPolicyConfigsAiToolSelectionConfig getAiToolSelectionConfig() {
        return this.aiToolSelectionConfig;
    }

    public HttpApiPolicyConfigs setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public HttpApiPolicyConfigs setSemanticRouterConfig(HttpApiPolicyConfigsSemanticRouterConfig semanticRouterConfig) {
        this.semanticRouterConfig = semanticRouterConfig;
        return this;
    }
    public HttpApiPolicyConfigsSemanticRouterConfig getSemanticRouterConfig() {
        return this.semanticRouterConfig;
    }

    public HttpApiPolicyConfigs setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig extends TeaModel {
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeout")
        public Integer timeout;

        @NameInMap("type")
        public String type;

        public static HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig self = new HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiPolicyConfigsAiCacheConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static HttpApiPolicyConfigsAiCacheConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiCacheConfigPluginStatus self = new HttpApiPolicyConfigsAiCacheConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiCacheConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public HttpApiPolicyConfigsAiCacheConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public HttpApiPolicyConfigsAiCacheConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class HttpApiPolicyConfigsAiCacheConfigRedisConfig extends TeaModel {
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

        public static HttpApiPolicyConfigsAiCacheConfigRedisConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiCacheConfigRedisConfig self = new HttpApiPolicyConfigsAiCacheConfigRedisConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiCacheConfigRedisConfig setDatabaseNumber(Integer databaseNumber) {
            this.databaseNumber = databaseNumber;
            return this;
        }
        public Integer getDatabaseNumber() {
            return this.databaseNumber;
        }

        public HttpApiPolicyConfigsAiCacheConfigRedisConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public HttpApiPolicyConfigsAiCacheConfigRedisConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public HttpApiPolicyConfigsAiCacheConfigRedisConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public HttpApiPolicyConfigsAiCacheConfigRedisConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public HttpApiPolicyConfigsAiCacheConfigRedisConfig setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class HttpApiPolicyConfigsAiCacheConfigVectorConfig extends TeaModel {
        @NameInMap("apiKey")
        public String apiKey;

        @NameInMap("collectionId")
        public String collectionId;

        @NameInMap("serviceHost")
        public String serviceHost;

        @NameInMap("threshold")
        public Float threshold;

        @NameInMap("timeout")
        public Integer timeout;

        @NameInMap("type")
        public String type;

        public static HttpApiPolicyConfigsAiCacheConfigVectorConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiCacheConfigVectorConfig self = new HttpApiPolicyConfigsAiCacheConfigVectorConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiCacheConfigVectorConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public HttpApiPolicyConfigsAiCacheConfigVectorConfig setCollectionId(String collectionId) {
            this.collectionId = collectionId;
            return this;
        }
        public String getCollectionId() {
            return this.collectionId;
        }

        public HttpApiPolicyConfigsAiCacheConfigVectorConfig setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public HttpApiPolicyConfigsAiCacheConfigVectorConfig setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public HttpApiPolicyConfigsAiCacheConfigVectorConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public HttpApiPolicyConfigsAiCacheConfigVectorConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiPolicyConfigsAiCacheConfig extends TeaModel {
        @NameInMap("cacheKeyStrategy")
        public String cacheKeyStrategy;

        @NameInMap("cacheMode")
        public String cacheMode;

        @NameInMap("cacheTTL")
        public Integer cacheTTL;

        @NameInMap("embeddingConfig")
        public HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig embeddingConfig;

        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiCacheConfigPluginStatus pluginStatus;

        @NameInMap("redisConfig")
        public HttpApiPolicyConfigsAiCacheConfigRedisConfig redisConfig;

        @NameInMap("vectorConfig")
        public HttpApiPolicyConfigsAiCacheConfigVectorConfig vectorConfig;

        public static HttpApiPolicyConfigsAiCacheConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiCacheConfig self = new HttpApiPolicyConfigsAiCacheConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiCacheConfig setCacheKeyStrategy(String cacheKeyStrategy) {
            this.cacheKeyStrategy = cacheKeyStrategy;
            return this;
        }
        public String getCacheKeyStrategy() {
            return this.cacheKeyStrategy;
        }

        public HttpApiPolicyConfigsAiCacheConfig setCacheMode(String cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }
        public String getCacheMode() {
            return this.cacheMode;
        }

        public HttpApiPolicyConfigsAiCacheConfig setCacheTTL(Integer cacheTTL) {
            this.cacheTTL = cacheTTL;
            return this;
        }
        public Integer getCacheTTL() {
            return this.cacheTTL;
        }

        public HttpApiPolicyConfigsAiCacheConfig setEmbeddingConfig(HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            return this;
        }
        public HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig getEmbeddingConfig() {
            return this.embeddingConfig;
        }

        public HttpApiPolicyConfigsAiCacheConfig setPluginStatus(HttpApiPolicyConfigsAiCacheConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public HttpApiPolicyConfigsAiCacheConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public HttpApiPolicyConfigsAiCacheConfig setRedisConfig(HttpApiPolicyConfigsAiCacheConfigRedisConfig redisConfig) {
            this.redisConfig = redisConfig;
            return this;
        }
        public HttpApiPolicyConfigsAiCacheConfigRedisConfig getRedisConfig() {
            return this.redisConfig;
        }

        public HttpApiPolicyConfigsAiCacheConfig setVectorConfig(HttpApiPolicyConfigsAiCacheConfigVectorConfig vectorConfig) {
            this.vectorConfig = vectorConfig;
            return this;
        }
        public HttpApiPolicyConfigsAiCacheConfigVectorConfig getVectorConfig() {
            return this.vectorConfig;
        }

    }

    public static class HttpApiPolicyConfigsAiFallbackConfigServiceConfigs extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("passThroughModelName")
        public Boolean passThroughModelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("targetModelName")
        public String targetModelName;

        public static HttpApiPolicyConfigsAiFallbackConfigServiceConfigs build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiFallbackConfigServiceConfigs self = new HttpApiPolicyConfigsAiFallbackConfigServiceConfigs();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiFallbackConfigServiceConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiPolicyConfigsAiFallbackConfigServiceConfigs setPassThroughModelName(Boolean passThroughModelName) {
            this.passThroughModelName = passThroughModelName;
            return this;
        }
        public Boolean getPassThroughModelName() {
            return this.passThroughModelName;
        }

        public HttpApiPolicyConfigsAiFallbackConfigServiceConfigs setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiPolicyConfigsAiFallbackConfigServiceConfigs setTargetModelName(String targetModelName) {
            this.targetModelName = targetModelName;
            return this;
        }
        public String getTargetModelName() {
            return this.targetModelName;
        }

    }

    public static class HttpApiPolicyConfigsAiFallbackConfig extends TeaModel {
        @NameInMap("onlyRedirectUpstreamCode")
        public Boolean onlyRedirectUpstreamCode;

        @NameInMap("routeEmbedded")
        public Boolean routeEmbedded;

        @NameInMap("serviceConfigs")
        public java.util.List<HttpApiPolicyConfigsAiFallbackConfigServiceConfigs> serviceConfigs;

        public static HttpApiPolicyConfigsAiFallbackConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiFallbackConfig self = new HttpApiPolicyConfigsAiFallbackConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiFallbackConfig setOnlyRedirectUpstreamCode(Boolean onlyRedirectUpstreamCode) {
            this.onlyRedirectUpstreamCode = onlyRedirectUpstreamCode;
            return this;
        }
        public Boolean getOnlyRedirectUpstreamCode() {
            return this.onlyRedirectUpstreamCode;
        }

        public HttpApiPolicyConfigsAiFallbackConfig setRouteEmbedded(Boolean routeEmbedded) {
            this.routeEmbedded = routeEmbedded;
            return this;
        }
        public Boolean getRouteEmbedded() {
            return this.routeEmbedded;
        }

        public HttpApiPolicyConfigsAiFallbackConfig setServiceConfigs(java.util.List<HttpApiPolicyConfigsAiFallbackConfigServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }
        public java.util.List<HttpApiPolicyConfigsAiFallbackConfigServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

    }

    public static class HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus self = new HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig extends TeaModel {
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

        public static HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig self = new HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setContentMode(String contentMode) {
            this.contentMode = contentMode;
            return this;
        }
        public String getContentMode() {
            return this.contentMode;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setOptionArgs(java.util.Map<String, String> optionArgs) {
            this.optionArgs = optionArgs;
            return this;
        }
        public java.util.Map<String, String> getOptionArgs() {
            return this.optionArgs;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom extends TeaModel {
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

        public static HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom self = new HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setContentMode(String contentMode) {
            this.contentMode = contentMode;
            return this;
        }
        public String getContentMode() {
            return this.contentMode;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setOptionArgs(java.util.Map<String, String> optionArgs) {
            this.optionArgs = optionArgs;
            return this;
        }
        public java.util.Map<String, String> getOptionArgs() {
            return this.optionArgs;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite extends TeaModel {
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

        public static HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite self = new HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

    public static class HttpApiPolicyConfigsAiNetworkSearchConfig extends TeaModel {
        @NameInMap("defaultEnable")
        public Boolean defaultEnable;

        @NameInMap("defaultLang")
        public String defaultLang;

        @NameInMap("needReference")
        public Boolean needReference;

        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus pluginStatus;

        @NameInMap("referenceFormat")
        public String referenceFormat;

        @NameInMap("referenceLocation")
        public String referenceLocation;

        @NameInMap("searchEngineConfig")
        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig searchEngineConfig;

        @NameInMap("searchFrom")
        public java.util.List<HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom> searchFrom;

        @NameInMap("searchRewrite")
        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite searchRewrite;

        public static HttpApiPolicyConfigsAiNetworkSearchConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiNetworkSearchConfig self = new HttpApiPolicyConfigsAiNetworkSearchConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfig setDefaultEnable(Boolean defaultEnable) {
            this.defaultEnable = defaultEnable;
            return this;
        }
        public Boolean getDefaultEnable() {
            return this.defaultEnable;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfig setDefaultLang(String defaultLang) {
            this.defaultLang = defaultLang;
            return this;
        }
        public String getDefaultLang() {
            return this.defaultLang;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfig setNeedReference(Boolean needReference) {
            this.needReference = needReference;
            return this;
        }
        public Boolean getNeedReference() {
            return this.needReference;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfig setPluginStatus(HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfig setReferenceFormat(String referenceFormat) {
            this.referenceFormat = referenceFormat;
            return this;
        }
        public String getReferenceFormat() {
            return this.referenceFormat;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfig setReferenceLocation(String referenceLocation) {
            this.referenceLocation = referenceLocation;
            return this;
        }
        public String getReferenceLocation() {
            return this.referenceLocation;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfig setSearchEngineConfig(HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig searchEngineConfig) {
            this.searchEngineConfig = searchEngineConfig;
            return this;
        }
        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig getSearchEngineConfig() {
            return this.searchEngineConfig;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfig setSearchFrom(java.util.List<HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom> searchFrom) {
            this.searchFrom = searchFrom;
            return this;
        }
        public java.util.List<HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom> getSearchFrom() {
            return this.searchFrom;
        }

        public HttpApiPolicyConfigsAiNetworkSearchConfig setSearchRewrite(HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite searchRewrite) {
            this.searchRewrite = searchRewrite;
            return this;
        }
        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchRewrite getSearchRewrite() {
            return this.searchRewrite;
        }

    }

    public static class HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService extends TeaModel {
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

        public static HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService self = new HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setModalityType(String modalityType) {
            this.modalityType = modalityType;
            return this;
        }
        public String getModalityType() {
            return this.modalityType;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setRequestCheckService(String requestCheckService) {
            this.requestCheckService = requestCheckService;
            return this;
        }
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService setRequestImageCheckService(String requestImageCheckService) {
            this.requestImageCheckService = requestImageCheckService;
            return this;
        }
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

    }

    public static class HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService extends TeaModel {
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

        public static HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService self = new HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setModalityType(String modalityType) {
            this.modalityType = modalityType;
            return this;
        }
        public String getModalityType() {
            return this.modalityType;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setResponseCheckService(String responseCheckService) {
            this.responseCheckService = responseCheckService;
            return this;
        }
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService setResponseImageCheckService(String responseImageCheckService) {
            this.responseImageCheckService = responseImageCheckService;
            return this;
        }
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

    }

    public static class HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel extends TeaModel {
        @NameInMap("level")
        public String level;

        @NameInMap("matchType")
        public String matchType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel self = new HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus self = new HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules extends TeaModel {
        @NameInMap("matchType")
        public String matchType;

        @NameInMap("pattern")
        public String pattern;

        public static HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules self = new HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

    public static class HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig extends TeaModel {
        @NameInMap("consumerRules")
        public HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules consumerRules;

        @NameInMap("level")
        public String level;

        @NameInMap("type")
        public String type;

        public static HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig self = new HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig setConsumerRules(HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules consumerRules) {
            this.consumerRules = consumerRules;
            return this;
        }
        public HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules getConsumerRules() {
            return this.consumerRules;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiPolicyConfigsAiSecurityGuardConfig extends TeaModel {
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
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService;

        @NameInMap("consumerResponseCheckService")
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService;

        @NameInMap("consumerRiskLevel")
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel;

        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus pluginStatus;

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
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig> riskConfig;

        @NameInMap("serviceAddress")
        public String serviceAddress;

        public static HttpApiPolicyConfigsAiSecurityGuardConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiSecurityGuardConfig self = new HttpApiPolicyConfigsAiSecurityGuardConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setBufferLimit(Integer bufferLimit) {
            this.bufferLimit = bufferLimit;
            return this;
        }
        public Integer getBufferLimit() {
            return this.bufferLimit;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setCheckRequest(Boolean checkRequest) {
            this.checkRequest = checkRequest;
            return this;
        }
        public Boolean getCheckRequest() {
            return this.checkRequest;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setCheckRequestImage(Boolean checkRequestImage) {
            this.checkRequestImage = checkRequestImage;
            return this;
        }
        public Boolean getCheckRequestImage() {
            return this.checkRequestImage;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setCheckResponse(Boolean checkResponse) {
            this.checkResponse = checkResponse;
            return this;
        }
        public Boolean getCheckResponse() {
            return this.checkResponse;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setCheckResponseImage(Boolean checkResponseImage) {
            this.checkResponseImage = checkResponseImage;
            return this;
        }
        public Boolean getCheckResponseImage() {
            return this.checkResponseImage;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setConsumerRequestCheckService(java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService) {
            this.consumerRequestCheckService = consumerRequestCheckService;
            return this;
        }
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> getConsumerRequestCheckService() {
            return this.consumerRequestCheckService;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setConsumerResponseCheckService(java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService) {
            this.consumerResponseCheckService = consumerResponseCheckService;
            return this;
        }
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> getConsumerResponseCheckService() {
            return this.consumerResponseCheckService;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setConsumerRiskLevel(java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel) {
            this.consumerRiskLevel = consumerRiskLevel;
            return this;
        }
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> getConsumerRiskLevel() {
            return this.consumerRiskLevel;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setPluginStatus(HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setRequestCheckService(String requestCheckService) {
            this.requestCheckService = requestCheckService;
            return this;
        }
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setRequestImageCheckService(String requestImageCheckService) {
            this.requestImageCheckService = requestImageCheckService;
            return this;
        }
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setResponseCheckService(String responseCheckService) {
            this.responseCheckService = responseCheckService;
            return this;
        }
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setResponseImageCheckService(String responseImageCheckService) {
            this.responseImageCheckService = responseImageCheckService;
            return this;
        }
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setRiskAlertLevel(String riskAlertLevel) {
            this.riskAlertLevel = riskAlertLevel;
            return this;
        }
        public String getRiskAlertLevel() {
            return this.riskAlertLevel;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setRiskConfig(java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig> riskConfig) {
            this.riskConfig = riskConfig;
            return this;
        }
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig> getRiskConfig() {
            return this.riskConfig;
        }

        public HttpApiPolicyConfigsAiSecurityGuardConfig setServiceAddress(String serviceAddress) {
            this.serviceAddress = serviceAddress;
            return this;
        }
        public String getServiceAddress() {
            return this.serviceAddress;
        }

    }

    public static class HttpApiPolicyConfigsAiStatisticsConfig extends TeaModel {
        @NameInMap("logRequestContent")
        public Boolean logRequestContent;

        @NameInMap("logResponseContent")
        public Boolean logResponseContent;

        public static HttpApiPolicyConfigsAiStatisticsConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiStatisticsConfig self = new HttpApiPolicyConfigsAiStatisticsConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiStatisticsConfig setLogRequestContent(Boolean logRequestContent) {
            this.logRequestContent = logRequestContent;
            return this;
        }
        public Boolean getLogRequestContent() {
            return this.logRequestContent;
        }

        public HttpApiPolicyConfigsAiStatisticsConfig setLogResponseContent(Boolean logResponseContent) {
            this.logResponseContent = logResponseContent;
            return this;
        }
        public Boolean getLogResponseContent() {
            return this.logResponseContent;
        }

    }

    public static class HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules extends TeaModel {
        @NameInMap("limitMode")
        public String limitMode;

        @NameInMap("limitType")
        public String limitType;

        @NameInMap("limitValue")
        public String limitValue;

        @NameInMap("matchKey")
        public String matchKey;

        @NameInMap("matchType")
        public String matchType;

        @NameInMap("matchValue")
        public String matchValue;

        public static HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules self = new HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules setLimitMode(String limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public String getLimitMode() {
            return this.limitMode;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules setLimitValue(String limitValue) {
            this.limitValue = limitValue;
            return this;
        }
        public String getLimitValue() {
            return this.limitValue;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules setMatchKey(String matchKey) {
            this.matchKey = matchKey;
            return this;
        }
        public String getMatchKey() {
            return this.matchKey;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules setMatchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }
        public String getMatchValue() {
            return this.matchValue;
        }

    }

    public static class HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus self = new HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig extends TeaModel {
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

        public static HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig self = new HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig setDatabaseNumber(Integer databaseNumber) {
            this.databaseNumber = databaseNumber;
            return this;
        }
        public Integer getDatabaseNumber() {
            return this.databaseNumber;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class HttpApiPolicyConfigsAiTokenRateLimitConfigRules extends TeaModel {
        @NameInMap("limitMode")
        public String limitMode;

        @NameInMap("limitType")
        public String limitType;

        @NameInMap("limitValue")
        public String limitValue;

        @NameInMap("matchKey")
        public String matchKey;

        @NameInMap("matchType")
        public String matchType;

        @NameInMap("matchValue")
        public String matchValue;

        public static HttpApiPolicyConfigsAiTokenRateLimitConfigRules build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiTokenRateLimitConfigRules self = new HttpApiPolicyConfigsAiTokenRateLimitConfigRules();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRules setLimitMode(String limitMode) {
            this.limitMode = limitMode;
            return this;
        }
        public String getLimitMode() {
            return this.limitMode;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRules setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRules setLimitValue(String limitValue) {
            this.limitValue = limitValue;
            return this;
        }
        public String getLimitValue() {
            return this.limitValue;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRules setMatchKey(String matchKey) {
            this.matchKey = matchKey;
            return this;
        }
        public String getMatchKey() {
            return this.matchKey;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRules setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfigRules setMatchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }
        public String getMatchValue() {
            return this.matchValue;
        }

    }

    public static class HttpApiPolicyConfigsAiTokenRateLimitConfig extends TeaModel {
        @NameInMap("enableGlobalRules")
        public Boolean enableGlobalRules;

        @NameInMap("globalRules")
        public java.util.List<HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules> globalRules;

        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus pluginStatus;

        @NameInMap("redisConfig")
        public HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig redisConfig;

        @NameInMap("rules")
        public java.util.List<HttpApiPolicyConfigsAiTokenRateLimitConfigRules> rules;

        public static HttpApiPolicyConfigsAiTokenRateLimitConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiTokenRateLimitConfig self = new HttpApiPolicyConfigsAiTokenRateLimitConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfig setEnableGlobalRules(Boolean enableGlobalRules) {
            this.enableGlobalRules = enableGlobalRules;
            return this;
        }
        public Boolean getEnableGlobalRules() {
            return this.enableGlobalRules;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfig setGlobalRules(java.util.List<HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules> globalRules) {
            this.globalRules = globalRules;
            return this;
        }
        public java.util.List<HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules> getGlobalRules() {
            return this.globalRules;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfig setPluginStatus(HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfig setRedisConfig(HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig redisConfig) {
            this.redisConfig = redisConfig;
            return this;
        }
        public HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig getRedisConfig() {
            return this.redisConfig;
        }

        public HttpApiPolicyConfigsAiTokenRateLimitConfig setRules(java.util.List<HttpApiPolicyConfigsAiTokenRateLimitConfigRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<HttpApiPolicyConfigsAiTokenRateLimitConfigRules> getRules() {
            return this.rules;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfigEnableConditions extends TeaModel {
        @NameInMap("toolCountThreshold")
        public Integer toolCountThreshold;

        public static HttpApiPolicyConfigsAiToolSelectionConfigEnableConditions build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfigEnableConditions self = new HttpApiPolicyConfigsAiToolSelectionConfigEnableConditions();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigEnableConditions setToolCountThreshold(Integer toolCountThreshold) {
            this.toolCountThreshold = toolCountThreshold;
            return this;
        }
        public Integer getToolCountThreshold() {
            return this.toolCountThreshold;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus extends TeaModel {
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("serviceHealthy")
        public Boolean serviceHealthy;

        public static HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus self = new HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus setErrorLogs(java.util.Map<String, String> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus setServiceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public Integer value;

        public static HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection self = new HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService extends TeaModel {
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService self = new HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig extends TeaModel {
        @NameInMap("customPrompt")
        public String customPrompt;

        @NameInMap("type")
        public String type;

        public static HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig self = new HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig setCustomPrompt(String customPrompt) {
            this.customPrompt = customPrompt;
            return this;
        }
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions extends TeaModel {
        @NameInMap("messageCountThreshold")
        public Integer messageCountThreshold;

        public static HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions self = new HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions setMessageCountThreshold(Integer messageCountThreshold) {
            this.messageCountThreshold = messageCountThreshold;
            return this;
        }
        public Integer getMessageCountThreshold() {
            return this.messageCountThreshold;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting extends TeaModel {
        @NameInMap("contextSelection")
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection contextSelection;

        @NameInMap("enabled")
        public Boolean enabled;

        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        @NameInMap("maxOutputTokens")
        public Integer maxOutputTokens;

        @NameInMap("modelService")
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService modelService;

        @NameInMap("promptConfig")
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig promptConfig;

        @NameInMap("triggerConditions")
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions triggerConditions;

        public static HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting self = new HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting setContextSelection(HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection contextSelection) {
            this.contextSelection = contextSelection;
            return this;
        }
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection getContextSelection() {
            return this.contextSelection;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting setFallbackStrategy(String fallbackStrategy) {
            this.fallbackStrategy = fallbackStrategy;
            return this;
        }
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting setMaxOutputTokens(Integer maxOutputTokens) {
            this.maxOutputTokens = maxOutputTokens;
            return this;
        }
        public Integer getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting setModelService(HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService modelService) {
            this.modelService = modelService;
            return this;
        }
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService getModelService() {
            return this.modelService;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting setPromptConfig(HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig promptConfig) {
            this.promptConfig = promptConfig;
            return this;
        }
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig getPromptConfig() {
            return this.promptConfig;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting setTriggerConditions(HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions triggerConditions) {
            this.triggerConditions = triggerConditions;
            return this;
        }
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingTriggerConditions getTriggerConditions() {
            return this.triggerConditions;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService extends TeaModel {
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService self = new HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfigToolReranking extends TeaModel {
        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        @NameInMap("filteringMethod")
        public String filteringMethod;

        @NameInMap("modelService")
        public HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService modelService;

        @NameInMap("scoreThreshold")
        public Float scoreThreshold;

        @NameInMap("topKPercent")
        public Integer topKPercent;

        @NameInMap("topNCount")
        public Integer topNCount;

        public static HttpApiPolicyConfigsAiToolSelectionConfigToolReranking build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfigToolReranking self = new HttpApiPolicyConfigsAiToolSelectionConfigToolReranking();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigToolReranking setFallbackStrategy(String fallbackStrategy) {
            this.fallbackStrategy = fallbackStrategy;
            return this;
        }
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigToolReranking setFilteringMethod(String filteringMethod) {
            this.filteringMethod = filteringMethod;
            return this;
        }
        public String getFilteringMethod() {
            return this.filteringMethod;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigToolReranking setModelService(HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService modelService) {
            this.modelService = modelService;
            return this;
        }
        public HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService getModelService() {
            return this.modelService;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigToolReranking setScoreThreshold(Float scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Float getScoreThreshold() {
            return this.scoreThreshold;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigToolReranking setTopKPercent(Integer topKPercent) {
            this.topKPercent = topKPercent;
            return this;
        }
        public Integer getTopKPercent() {
            return this.topKPercent;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfigToolReranking setTopNCount(Integer topNCount) {
            this.topNCount = topNCount;
            return this;
        }
        public Integer getTopNCount() {
            return this.topNCount;
        }

    }

    public static class HttpApiPolicyConfigsAiToolSelectionConfig extends TeaModel {
        @NameInMap("enableConditions")
        public HttpApiPolicyConfigsAiToolSelectionConfigEnableConditions enableConditions;

        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus pluginStatus;

        @NameInMap("queryRewriting")
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting queryRewriting;

        @NameInMap("toolReranking")
        public HttpApiPolicyConfigsAiToolSelectionConfigToolReranking toolReranking;

        public static HttpApiPolicyConfigsAiToolSelectionConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsAiToolSelectionConfig self = new HttpApiPolicyConfigsAiToolSelectionConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsAiToolSelectionConfig setEnableConditions(HttpApiPolicyConfigsAiToolSelectionConfigEnableConditions enableConditions) {
            this.enableConditions = enableConditions;
            return this;
        }
        public HttpApiPolicyConfigsAiToolSelectionConfigEnableConditions getEnableConditions() {
            return this.enableConditions;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfig setPluginStatus(HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfig setQueryRewriting(HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting queryRewriting) {
            this.queryRewriting = queryRewriting;
            return this;
        }
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting getQueryRewriting() {
            return this.queryRewriting;
        }

        public HttpApiPolicyConfigsAiToolSelectionConfig setToolReranking(HttpApiPolicyConfigsAiToolSelectionConfigToolReranking toolReranking) {
            this.toolReranking = toolReranking;
            return this;
        }
        public HttpApiPolicyConfigsAiToolSelectionConfigToolReranking getToolReranking() {
            return this.toolReranking;
        }

    }

    public static class HttpApiPolicyConfigsSemanticRouterConfig extends TeaModel {
        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        public static HttpApiPolicyConfigsSemanticRouterConfig build(java.util.Map<String, ?> map) throws Exception {
            HttpApiPolicyConfigsSemanticRouterConfig self = new HttpApiPolicyConfigsSemanticRouterConfig();
            return TeaModel.build(map, self);
        }

        public HttpApiPolicyConfigsSemanticRouterConfig setTimeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

    }

}
