// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiCacheConfig extends TeaModel {
    /**
     * <p>The cache key strategy, which determines how the system generates a unique key for each cacheable request. Valid values: <code>DEFAULT</code> and <code>CUSTOM</code>.</p>
     */
    @NameInMap("cacheKeyStrategy")
    public String cacheKeyStrategy;

    /**
     * <p>The cache mode, which defines the caching behavior. Valid values are <code>NORMAL</code> for standard key-value caching and <code>SEMANTIC</code> for vector-based similarity caching.</p>
     */
    @NameInMap("cacheMode")
    public String cacheMode;

    /**
     * <p>The cache Time-to-Live (TTL) in seconds. This specifies the duration that a cached response remains valid. After the TTL expires, the cache removes the response.</p>
     */
    @NameInMap("cacheTTL")
    public Integer cacheTTL;

    /**
     * <p>The embedding configuration. Specifies the service that converts text queries into vector embeddings for semantic search.</p>
     */
    @NameInMap("embeddingConfig")
    public AiCacheConfigEmbeddingConfig embeddingConfig;

    /**
     * <p>The plugin status. Set to <code>enable</code> to activate the plugin or <code>disable</code> to deactivate it.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <p>The Redis configuration, required if you use a Redis instance as the cache backend.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("redisConfig")
    public AiPolicyRedisConfig redisConfig;

    /**
     * <p>The vector configuration for semantic caching. This enables the cache to retrieve results based on semantic similarity instead of exact matches.</p>
     */
    @NameInMap("vectorConfig")
    public AiCacheConfigVectorConfig vectorConfig;

    public static AiCacheConfig build(java.util.Map<String, ?> map) throws Exception {
        AiCacheConfig self = new AiCacheConfig();
        return TeaModel.build(map, self);
    }

    public AiCacheConfig setCacheKeyStrategy(String cacheKeyStrategy) {
        this.cacheKeyStrategy = cacheKeyStrategy;
        return this;
    }
    public String getCacheKeyStrategy() {
        return this.cacheKeyStrategy;
    }

    public AiCacheConfig setCacheMode(String cacheMode) {
        this.cacheMode = cacheMode;
        return this;
    }
    public String getCacheMode() {
        return this.cacheMode;
    }

    public AiCacheConfig setCacheTTL(Integer cacheTTL) {
        this.cacheTTL = cacheTTL;
        return this;
    }
    public Integer getCacheTTL() {
        return this.cacheTTL;
    }

    public AiCacheConfig setEmbeddingConfig(AiCacheConfigEmbeddingConfig embeddingConfig) {
        this.embeddingConfig = embeddingConfig;
        return this;
    }
    public AiCacheConfigEmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    public AiCacheConfig setPluginStatus(AiPluginStatus pluginStatus) {
        this.pluginStatus = pluginStatus;
        return this;
    }
    public AiPluginStatus getPluginStatus() {
        return this.pluginStatus;
    }

    public AiCacheConfig setRedisConfig(AiPolicyRedisConfig redisConfig) {
        this.redisConfig = redisConfig;
        return this;
    }
    public AiPolicyRedisConfig getRedisConfig() {
        return this.redisConfig;
    }

    public AiCacheConfig setVectorConfig(AiCacheConfigVectorConfig vectorConfig) {
        this.vectorConfig = vectorConfig;
        return this;
    }
    public AiCacheConfigVectorConfig getVectorConfig() {
        return this.vectorConfig;
    }

    public static class AiCacheConfigEmbeddingConfig extends TeaModel {
        /**
         * <p>The model name to use for generating embeddings, such as <code>text-embedding-v1</code>.</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The service ID of the deployed embedding model.</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The request timeout in milliseconds. A request to the embedding service fails if it exceeds this duration. Default: <code>10000</code>.</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>The type of embedding service. For example, specify <code>Tongyi</code> for Alibaba Cloud\&quot;s Tongyi Qwen model series.</p>
         */
        @NameInMap("type")
        public String type;

        public static AiCacheConfigEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            AiCacheConfigEmbeddingConfig self = new AiCacheConfigEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public AiCacheConfigEmbeddingConfig setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public AiCacheConfigEmbeddingConfig setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public AiCacheConfigEmbeddingConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public AiCacheConfigEmbeddingConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AiCacheConfigVectorConfig extends TeaModel {
        /**
         * <p>The API key to authenticate with the vector database service.</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The unique ID of the collection or index within the vector database for search and storage.</p>
         */
        @NameInMap("collectionId")
        public String collectionId;

        /**
         * <p>The endpoint URL of the vector database service.</p>
         */
        @NameInMap("serviceHost")
        public String serviceHost;

        /**
         * <p>The similarity threshold for a vector search to qualify as a cache hit. The value must be between 0.0 and 1.0. A higher value means a stricter similarity requirement.</p>
         */
        @NameInMap("threshold")
        public Float threshold;

        /**
         * <p>The request timeout in milliseconds. A request to the vector service fails if it exceeds this duration. Default: <code>10000</code>.</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>The type of vector database service. For example, specify <code>DashVector</code> for Alibaba Cloud\&quot;s vector search service.</p>
         */
        @NameInMap("type")
        public String type;

        public static AiCacheConfigVectorConfig build(java.util.Map<String, ?> map) throws Exception {
            AiCacheConfigVectorConfig self = new AiCacheConfigVectorConfig();
            return TeaModel.build(map, self);
        }

        public AiCacheConfigVectorConfig setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public AiCacheConfigVectorConfig setCollectionId(String collectionId) {
            this.collectionId = collectionId;
            return this;
        }
        public String getCollectionId() {
            return this.collectionId;
        }

        public AiCacheConfigVectorConfig setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public AiCacheConfigVectorConfig setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public AiCacheConfigVectorConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public AiCacheConfigVectorConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
