// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiCacheConfig extends TeaModel {
    @NameInMap("cacheKeyStrategy")
    public String cacheKeyStrategy;

    @NameInMap("cacheMode")
    public String cacheMode;

    @NameInMap("cacheTTL")
    public Integer cacheTTL;

    @NameInMap("embeddingConfig")
    public AiCacheConfigEmbeddingConfig embeddingConfig;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("pluginStatus")
    public AiPluginStatus pluginStatus;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("redisConfig")
    public AiPolicyRedisConfig redisConfig;

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
        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceId")
        public String serviceId;

        @NameInMap("timeout")
        public Integer timeout;

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
