// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class ModifyAgentPlatformRequest extends TeaModel {
    /**
     * <p>The parameters required for upgrading or downgrading the metric platform.</p>
     */
    @NameInMap("AiPlatformConfig")
    public ModifyAgentPlatformRequestAiPlatformConfig aiPlatformConfig;

    /**
     * <p>The instance cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the metric platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_platform</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the DescribeRegions operation to query the region ID of a specified Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyAgentPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentPlatformRequest self = new ModifyAgentPlatformRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAgentPlatformRequest setAiPlatformConfig(ModifyAgentPlatformRequestAiPlatformConfig aiPlatformConfig) {
        this.aiPlatformConfig = aiPlatformConfig;
        return this;
    }
    public ModifyAgentPlatformRequestAiPlatformConfig getAiPlatformConfig() {
        return this.aiPlatformConfig;
    }

    public ModifyAgentPlatformRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyAgentPlatformRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAgentPlatformRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyAgentPlatformRequestAiPlatformConfig extends TeaModel {
        /**
         * <p>The API key of the model for the inference service that the metric analysis platform depends on.</p>
         * 
         * <strong>example:</strong>
         * <p>3760d3**************************</p>
         */
        @NameInMap("ServeApiKey")
        public String serveApiKey;

        /**
         * <p>The endpoint of the embedding model for the inference service that the metric analysis platform depends on.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://111.xx.xx.xx:8100/inferenceservice/emb">http://111.xx.xx.xx:8100/inferenceservice/emb</a></p>
         */
        @NameInMap("ServeEmbeddingEndpoint")
        public String serveEmbeddingEndpoint;

        /**
         * <p>The name of the embedding model for the inference service that the metric analysis platform depends on.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-Embedding-8B</p>
         */
        @NameInMap("ServeEmbeddingModelName")
        public String serveEmbeddingModelName;

        /**
         * <p>The endpoint of the base model for the inference service that the metric analysis platform depends on.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://111.xx.xx.xx:8100/inferenceservice/base">http://111.xx.xx.xx:8100/inferenceservice/base</a></p>
         */
        @NameInMap("ServeEndpoint")
        public String serveEndpoint;

        /**
         * <p>The name of the base model for the inference service that the metric analysis platform depends on.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-235B-A22B-Instruct-2507</p>
         */
        @NameInMap("ServeModelName")
        public String serveModelName;

        /**
         * <p>The specification of the metric analysis platform.</p>
         * 
         * <strong>example:</strong>
         * <p>large</p>
         */
        @NameInMap("SpecName")
        public String specName;

        public static ModifyAgentPlatformRequestAiPlatformConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyAgentPlatformRequestAiPlatformConfig self = new ModifyAgentPlatformRequestAiPlatformConfig();
            return TeaModel.build(map, self);
        }

        public ModifyAgentPlatformRequestAiPlatformConfig setServeApiKey(String serveApiKey) {
            this.serveApiKey = serveApiKey;
            return this;
        }
        public String getServeApiKey() {
            return this.serveApiKey;
        }

        public ModifyAgentPlatformRequestAiPlatformConfig setServeEmbeddingEndpoint(String serveEmbeddingEndpoint) {
            this.serveEmbeddingEndpoint = serveEmbeddingEndpoint;
            return this;
        }
        public String getServeEmbeddingEndpoint() {
            return this.serveEmbeddingEndpoint;
        }

        public ModifyAgentPlatformRequestAiPlatformConfig setServeEmbeddingModelName(String serveEmbeddingModelName) {
            this.serveEmbeddingModelName = serveEmbeddingModelName;
            return this;
        }
        public String getServeEmbeddingModelName() {
            return this.serveEmbeddingModelName;
        }

        public ModifyAgentPlatformRequestAiPlatformConfig setServeEndpoint(String serveEndpoint) {
            this.serveEndpoint = serveEndpoint;
            return this;
        }
        public String getServeEndpoint() {
            return this.serveEndpoint;
        }

        public ModifyAgentPlatformRequestAiPlatformConfig setServeModelName(String serveModelName) {
            this.serveModelName = serveModelName;
            return this;
        }
        public String getServeModelName() {
            return this.serveModelName;
        }

        public ModifyAgentPlatformRequestAiPlatformConfig setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

}
