// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiPolicyConfigs extends TeaModel {
    /**
     * <p>AiCacheConfig</p>
     */
    @NameInMap("aiCacheConfig")
    public HttpApiPolicyConfigsAiCacheConfig aiCacheConfig;

    /**
     * <p>AiFallbackConfig</p>
     */
    @NameInMap("aiFallbackConfig")
    public HttpApiPolicyConfigsAiFallbackConfig aiFallbackConfig;

    /**
     * <p>AiNetworkSearchConfig</p>
     */
    @NameInMap("aiNetworkSearchConfig")
    public HttpApiPolicyConfigsAiNetworkSearchConfig aiNetworkSearchConfig;

    /**
     * <p>AiSecurityGuardConfig</p>
     */
    @NameInMap("aiSecurityGuardConfig")
    public HttpApiPolicyConfigsAiSecurityGuardConfig aiSecurityGuardConfig;

    /**
     * <p>AiStatisticsConfig</p>
     */
    @NameInMap("aiStatisticsConfig")
    public HttpApiPolicyConfigsAiStatisticsConfig aiStatisticsConfig;

    /**
     * <p>AiTokenRateLimitConfig</p>
     */
    @NameInMap("aiTokenRateLimitConfig")
    public HttpApiPolicyConfigsAiTokenRateLimitConfig aiTokenRateLimitConfig;

    /**
     * <p>AiToolSelectionConfig</p>
     */
    @NameInMap("aiToolSelectionConfig")
    public HttpApiPolicyConfigsAiToolSelectionConfig aiToolSelectionConfig;

    /**
     * <p>Policy Enable</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>SemanticRouterConfig</p>
     */
    @NameInMap("semanticRouterConfig")
    public HttpApiPolicyConfigsSemanticRouterConfig semanticRouterConfig;

    /**
     * <p>Policy Type</p>
     * 
     * <strong>example:</strong>
     * <p>AiCache</p>
     */
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
        /**
         * <p>Embedding model name</p>
         * 
         * <strong>example:</strong>
         * <p>model-1</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>Embedding service ID</p>
         * 
         * <strong>example:</strong>
         * <p>svc-1</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Embedding service request timeout in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>Embedding service provider type</p>
         * 
         * <strong>example:</strong>
         * <p>dashscope</p>
         */
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
        /**
         * <p>errorLogs</p>
         */
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        /**
         * <p>pluginId</p>
         * 
         * <strong>example:</strong>
         * <p>pl-123456</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        /**
         * <p>serviceHealthy</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Redis database number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("databaseNumber")
        public Integer databaseNumber;

        /**
         * <p>Redis host</p>
         * 
         * <strong>example:</strong>
         * <p>redis.example.com</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>Redis password</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>Redis port</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>Redis timeout</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>Redis username</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
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
        /**
         * <p>Vector database API key for authentication</p>
         * 
         * <strong>example:</strong>
         * <p>vec-api-key-123</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>Vector database collection ID for storing vector embeddings</p>
         * 
         * <strong>example:</strong>
         * <p>col-1</p>
         */
        @NameInMap("collectionId")
        public String collectionId;

        /**
         * <p>Vector database service host address</p>
         * 
         * <strong>example:</strong>
         * <p>vec.example.com</p>
         */
        @NameInMap("serviceHost")
        public String serviceHost;

        /**
         * <p>Similarity threshold for semantic matching</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("threshold")
        public Float threshold;

        /**
         * <p>Vector database request timeout in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>Vector database service type</p>
         * 
         * <strong>example:</strong>
         * <p>dashvector</p>
         */
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
        /**
         * <p>Strategy for generating cache keys</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("cacheKeyStrategy")
        public String cacheKeyStrategy;

        /**
         * <p>Cache mode type</p>
         * 
         * <strong>example:</strong>
         * <p>exact</p>
         */
        @NameInMap("cacheMode")
        public String cacheMode;

        /**
         * <p>Cache time-to-live in seconds</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("cacheTTL")
        public Integer cacheTTL;

        /**
         * <p>Embedding Config</p>
         */
        @NameInMap("embeddingConfig")
        public HttpApiPolicyConfigsAiCacheConfigEmbeddingConfig embeddingConfig;

        /**
         * <p>pluginStatus</p>
         */
        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiCacheConfigPluginStatus pluginStatus;

        /**
         * <p>Redis configuration for cache storage</p>
         */
        @NameInMap("redisConfig")
        public HttpApiPolicyConfigsAiCacheConfigRedisConfig redisConfig;

        /**
         * <p>vectorConfig</p>
         */
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
        /**
         * <p>Service name for frontend display</p>
         * 
         * <strong>example:</strong>
         * <p>azure.ai</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Whether to pass through the original model name</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("passThroughModelName")
        public Boolean passThroughModelName;

        /**
         * <p>Fallback service ID</p>
         * 
         * <strong>example:</strong>
         * <p>svc-123456</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Target model name for fallback</p>
         * 
         * <strong>example:</strong>
         * <p>kimi-fallback-test</p>
         */
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
        /**
         * <p>Only trigger fallback when backend returns 4xx/5xx status codes</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("onlyRedirectUpstreamCode")
        public Boolean onlyRedirectUpstreamCode;

        /**
         * <p>Whether the policy is generated from route embedded configuration</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("routeEmbedded")
        public Boolean routeEmbedded;

        /**
         * <p>List of fallback service configurations</p>
         */
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
        /**
         * <p>errorLogs</p>
         */
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        /**
         * <p>pluginId</p>
         * 
         * <strong>example:</strong>
         * <p>pl-123456</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        /**
         * <p>serviceHealthy</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Search engine API key</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>Content mode</p>
         * 
         * <strong>example:</strong>
         * <p>summary</p>
         */
        @NameInMap("contentMode")
        public String contentMode;

        /**
         * <p>Result count</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>Search engine endpoint</p>
         * 
         * <strong>example:</strong>
         * <p>******-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>Industry</p>
         * 
         * <strong>example:</strong>
         * <p>tech</p>
         */
        @NameInMap("industry")
        public String industry;

        /**
         * <p>Additional parameters</p>
         */
        @NameInMap("optionArgs")
        public java.util.Map<String, String> optionArgs;

        /**
         * <p>Result offset</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("start")
        public Integer start;

        /**
         * <p>Time range</p>
         * 
         * <strong>example:</strong>
         * <p>7d</p>
         */
        @NameInMap("timeRange")
        public String timeRange;

        /**
         * <p>API call timeout in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        /**
         * <p>Search engine type: Bing/aliyunQuark</p>
         * 
         * <strong>example:</strong>
         * <p>Bing</p>
         */
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
        /**
         * <p>Search engine API key</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>Content mode</p>
         * 
         * <strong>example:</strong>
         * <p>summary</p>
         */
        @NameInMap("contentMode")
        public String contentMode;

        /**
         * <p>Result count</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>Search engine endpoint</p>
         * 
         * <strong>example:</strong>
         * <p>******-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>Industry</p>
         * 
         * <strong>example:</strong>
         * <p>tech</p>
         */
        @NameInMap("industry")
        public String industry;

        /**
         * <p>Additional parameters</p>
         */
        @NameInMap("optionArgs")
        public java.util.Map<String, String> optionArgs;

        /**
         * <p>Result offset</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("start")
        public Integer start;

        /**
         * <p>Time range</p>
         * 
         * <strong>example:</strong>
         * <p>7d</p>
         */
        @NameInMap("timeRange")
        public String timeRange;

        /**
         * <p>API call timeout in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("timeoutMillisecond")
        public Integer timeoutMillisecond;

        /**
         * <p>Search engine type</p>
         * 
         * <strong>example:</strong>
         * <p>Bing</p>
         */
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
        /**
         * <p>Enable search rewrite</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Max rewrite count (1-5)</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxCount")
        public Integer maxCount;

        /**
         * <p>Model name</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-turbo</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>Service ID</p>
         * 
         * <strong>example:</strong>
         * <p>svc-123456</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Timeout in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
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
        /**
         * <p>Default enable</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("defaultEnable")
        public Boolean defaultEnable;

        /**
         * <p>Default search language code</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("defaultLang")
        public String defaultLang;

        /**
         * <p>Add reference sources in answer</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("needReference")
        public Boolean needReference;

        /**
         * <p>pluginStatus</p>
         */
        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiNetworkSearchConfigPluginStatus pluginStatus;

        /**
         * <p>Reference format</p>
         * 
         * <strong>example:</strong>
         * <p>Reference: %s</p>
         */
        @NameInMap("referenceFormat")
        public String referenceFormat;

        /**
         * <p>Reference location</p>
         * 
         * <strong>example:</strong>
         * <p>head</p>
         */
        @NameInMap("referenceLocation")
        public String referenceLocation;

        /**
         * <p>Search engine configuration</p>
         */
        @NameInMap("searchEngineConfig")
        public HttpApiPolicyConfigsAiNetworkSearchConfigSearchEngineConfig searchEngineConfig;

        /**
         * <p>Search engine list</p>
         */
        @NameInMap("searchFrom")
        public java.util.List<HttpApiPolicyConfigsAiNetworkSearchConfigSearchFrom> searchFrom;

        /**
         * <p>Search rewrite configuration</p>
         */
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
        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Modality type</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("modalityType")
        public String modalityType;

        /**
         * <p>Consumer name</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>requestCheckService</p>
         * 
         * <strong>example:</strong>
         * <p>query_security_check</p>
         */
        @NameInMap("requestCheckService")
        public String requestCheckService;

        /**
         * <p>requestImageCheckService</p>
         * 
         * <strong>example:</strong>
         * <p>nsfw-image-detector</p>
         */
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
        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Modality type</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        @NameInMap("modalityType")
        public String modalityType;

        /**
         * <p>Consumer name</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>responseCheckService</p>
         * 
         * <strong>example:</strong>
         * <p>response_security_check</p>
         */
        @NameInMap("responseCheckService")
        public String responseCheckService;

        /**
         * <p>responseImageCheckService</p>
         * 
         * <strong>example:</strong>
         * <p>watermark-detector</p>
         */
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
        /**
         * <p>Risk level</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Consumer name</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Risk type</p>
         * 
         * <strong>example:</strong>
         * <p>ContentModeration</p>
         */
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
        /**
         * <p>errorLogs</p>
         */
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        /**
         * <p>pluginId</p>
         * 
         * <strong>example:</strong>
         * <p>pl-123456</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        /**
         * <p>serviceHealthy</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>matchType</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>pattern</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/*</p>
         */
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
        /**
         * <p>consumerRules</p>
         */
        @NameInMap("consumerRules")
        public HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfigConsumerRules consumerRules;

        /**
         * <p>Risk level</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>Risk type</p>
         * 
         * <strong>example:</strong>
         * <p>ContentModeration</p>
         */
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
        /**
         * <p>Buffer limit for content checking</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("bufferLimit")
        public Integer bufferLimit;

        /**
         * <p>Enable request content checking</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("checkRequest")
        public Boolean checkRequest;

        /**
         * <p>Enable request image checking</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("checkRequestImage")
        public Boolean checkRequestImage;

        /**
         * <p>Enable response content checking</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("checkResponse")
        public Boolean checkResponse;

        /**
         * <p>Enable response image checking</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("checkResponseImage")
        public Boolean checkResponseImage;

        /**
         * <p>consumerRequestCheckService</p>
         */
        @NameInMap("consumerRequestCheckService")
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRequestCheckService> consumerRequestCheckService;

        /**
         * <p>consumerResponseCheckService</p>
         */
        @NameInMap("consumerResponseCheckService")
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerResponseCheckService> consumerResponseCheckService;

        /**
         * <p>consumerRiskLevel</p>
         */
        @NameInMap("consumerRiskLevel")
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigConsumerRiskLevel> consumerRiskLevel;

        /**
         * <p>pluginStatus</p>
         */
        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiSecurityGuardConfigPluginStatus pluginStatus;

        /**
         * <p>Request text check service type</p>
         * 
         * <strong>example:</strong>
         * <p>content-moderation-service</p>
         */
        @NameInMap("requestCheckService")
        public String requestCheckService;

        /**
         * <p>Request image check service type</p>
         * 
         * <strong>example:</strong>
         * <p>image-moderation-service</p>
         */
        @NameInMap("requestImageCheckService")
        public String requestImageCheckService;

        /**
         * <p>Response text check service type</p>
         * 
         * <strong>example:</strong>
         * <p>output-moderation-service</p>
         */
        @NameInMap("responseCheckService")
        public String responseCheckService;

        /**
         * <p>Response image check service type</p>
         * 
         * <strong>example:</strong>
         * <p>generated-image-scanner</p>
         */
        @NameInMap("responseImageCheckService")
        public String responseImageCheckService;

        /**
         * <p>Global risk alert level</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("riskAlertLevel")
        public String riskAlertLevel;

        /**
         * <p>RiskConfig</p>
         */
        @NameInMap("riskConfig")
        public java.util.List<HttpApiPolicyConfigsAiSecurityGuardConfigRiskConfig> riskConfig;

        /**
         * <p>Security guard service endpoint URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.example.com/v1">https://api.example.com/v1</a></p>
         */
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
        /**
         * <p>Log request content</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("logRequestContent")
        public Boolean logRequestContent;

        /**
         * <p>Log response content</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Limit mode</p>
         * 
         * <strong>example:</strong>
         * <p>TokenPerSecond</p>
         */
        @NameInMap("limitMode")
        public String limitMode;

        /**
         * <p>Limit type</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>Limit value</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("limitValue")
        public String limitValue;

        /**
         * <p>Match key</p>
         * 
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("matchKey")
        public String matchKey;

        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Match value</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
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
        /**
         * <p>Array of plugin execution error logs</p>
         */
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        /**
         * <p>Plugin instance unique identifier</p>
         * 
         * <strong>example:</strong>
         * <p>pl-123456</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        /**
         * <p>Health status of the cache service</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Redis database number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("databaseNumber")
        public Integer databaseNumber;

        /**
         * <p>Redis host</p>
         * 
         * <strong>example:</strong>
         * <p>redis.example.com</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>Redis password</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>Redis port</p>
         * 
         * <strong>example:</strong>
         * <p>6379</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>Redis timeout</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>Redis username</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
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
        /**
         * <p>Limit mode</p>
         * 
         * <strong>example:</strong>
         * <p>TokenPerSecond</p>
         */
        @NameInMap("limitMode")
        public String limitMode;

        /**
         * <p>Limit type</p>
         * 
         * <strong>example:</strong>
         * <p>Header</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>Limit value</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("limitValue")
        public String limitValue;

        /**
         * <p>Match key</p>
         * 
         * <strong>example:</strong>
         * <p>x-api-key</p>
         */
        @NameInMap("matchKey")
        public String matchKey;

        /**
         * <p>Match type</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("matchType")
        public String matchType;

        /**
         * <p>Match value</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
         */
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
        /**
         * <p>Enable global rate limit rules</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableGlobalRules")
        public Boolean enableGlobalRules;

        /**
         * <p>List of global rate limit rules</p>
         */
        @NameInMap("globalRules")
        public java.util.List<HttpApiPolicyConfigsAiTokenRateLimitConfigGlobalRules> globalRules;

        /**
         * <p>pluginStatus</p>
         */
        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiTokenRateLimitConfigPluginStatus pluginStatus;

        /**
         * <p>Redis Config</p>
         */
        @NameInMap("redisConfig")
        public HttpApiPolicyConfigsAiTokenRateLimitConfigRedisConfig redisConfig;

        /**
         * <p>List of rate limit rules</p>
         */
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
        /**
         * <p>Tool count threshold</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>errorLogs</p>
         */
        @NameInMap("errorLogs")
        public java.util.Map<String, String> errorLogs;

        /**
         * <p>pluginId</p>
         * 
         * <strong>example:</strong>
         * <p>pl-123456</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        /**
         * <p>serviceHealthy</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Context type</p>
         * 
         * <strong>example:</strong>
         * <p>recentMessages</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Value</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <p>Model name</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-turbo</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>Service ID</p>
         * 
         * <strong>example:</strong>
         * <p>svc-123456</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Timeout in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
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
        /**
         * <p>Custom prompt (required when type=custom)</p>
         * 
         * <strong>example:</strong>
         * <p>Custom prompt</p>
         */
        @NameInMap("customPrompt")
        public String customPrompt;

        /**
         * <p>Prompt type: builtIn/custom</p>
         * 
         * <strong>example:</strong>
         * <p>builtIn</p>
         */
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
        /**
         * <p>Message count threshold (≥0)</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Context selection</p>
         */
        @NameInMap("contextSelection")
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingContextSelection contextSelection;

        /**
         * <p>Enable query rewriting</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>Fallback strategy</p>
         * 
         * <strong>example:</strong>
         * <p>skip</p>
         */
        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        /**
         * <p>Max output tokens</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxOutputTokens")
        public Integer maxOutputTokens;

        /**
         * <p>Model service configuration</p>
         */
        @NameInMap("modelService")
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingModelService modelService;

        /**
         * <p>Prompt configuration</p>
         */
        @NameInMap("promptConfig")
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewritingPromptConfig promptConfig;

        /**
         * <p>Trigger conditions</p>
         */
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
        /**
         * <p>Model name</p>
         * 
         * <strong>example:</strong>
         * <p>gte-rerank-v2</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>Service ID</p>
         * 
         * <strong>example:</strong>
         * <p>svc-123456</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>Timeout in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
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
        /**
         * <p>Fallback strategy: skip/error</p>
         * 
         * <strong>example:</strong>
         * <p>skip</p>
         */
        @NameInMap("fallbackStrategy")
        public String fallbackStrategy;

        /**
         * <p>Filtering method: topK/topN/combined</p>
         * 
         * <strong>example:</strong>
         * <p>topK</p>
         */
        @NameInMap("filteringMethod")
        public String filteringMethod;

        /**
         * <p>Model service configuration</p>
         */
        @NameInMap("modelService")
        public HttpApiPolicyConfigsAiToolSelectionConfigToolRerankingModelService modelService;

        /**
         * <p>Score threshold (0.0-1.0, 0 means disabled)</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("scoreThreshold")
        public Float scoreThreshold;

        /**
         * <p>TopK percentage (1-100)</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("topKPercent")
        public Integer topKPercent;

        /**
         * <p>TopN count</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <p>Enable conditions configuration</p>
         */
        @NameInMap("enableConditions")
        public HttpApiPolicyConfigsAiToolSelectionConfigEnableConditions enableConditions;

        /**
         * <p>Plugin status</p>
         */
        @NameInMap("pluginStatus")
        public HttpApiPolicyConfigsAiToolSelectionConfigPluginStatus pluginStatus;

        /**
         * <p>Query rewriting configuration</p>
         */
        @NameInMap("queryRewriting")
        public HttpApiPolicyConfigsAiToolSelectionConfigQueryRewriting queryRewriting;

        /**
         * <p>Tool reranking configuration</p>
         */
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
        /**
         * <p>Timeout in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
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
