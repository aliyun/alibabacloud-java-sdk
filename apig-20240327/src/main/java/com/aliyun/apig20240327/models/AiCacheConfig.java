// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiCacheConfig extends TeaModel {
    /**
     * <p>The cache key generation strategy.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("cacheKeyStrategy")
    public String cacheKeyStrategy;

    /**
     * <p>The cache mode.</p>
     * 
     * <strong>example:</strong>
     * <p>exact</p>
     */
    @NameInMap("cacheMode")
    public String cacheMode;

    /**
     * <p>The cache expiration time, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("cacheTTL")
    public Integer cacheTTL;

    /**
     * <p>The embedding service configuration.</p>
     */
    @NameInMap("embeddingConfig")
    public AiCacheConfigEmbeddingConfig embeddingConfig;

    /**
     * <p>The plugin running status.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <p>The Redis configuration for exact cache count storage.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("redisConfig")
    public AiPolicyRedisConfig redisConfig;

    /**
     * <p>The vector database configuration.</p>
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
         * <p>The embedding model name.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v2</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The embedding service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>svc-xxx</p>
         */
        @NameInMap("serviceId")
        public String serviceId;

        /**
         * <p>The request timeout period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>The embedding service type.</p>
         * 
         * <strong>example:</strong>
         * <p>dashscope</p>
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
         * <p>The API key of the vector database.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxx</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The vector collection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>col-xxx</p>
         */
        @NameInMap("collectionId")
        public String collectionId;

        /**
         * <p>The service address of the vector database.</p>
         * 
         * <strong>example:</strong>
         * <p>vdb-xxx.dashvector.aliyuncs.com</p>
         */
        @NameInMap("serviceHost")
        public String serviceHost;

        /**
         * <p>The similarity threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0.95</p>
         */
        @NameInMap("threshold")
        public Float threshold;

        /**
         * <p>The request timeout period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>The vector database type.</p>
         * 
         * <strong>example:</strong>
         * <p>dashvector</p>
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
