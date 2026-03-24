// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class ModifyAgentPlatformRequest extends TeaModel {
    @NameInMap("AiPlatformConfig")
    public ModifyAgentPlatformRequestAiPlatformConfig aiPlatformConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_platform</p>
     */
    @NameInMap("Name")
    public String name;

    /**
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
         * <strong>example:</strong>
         * <p>3760d3**************************</p>
         */
        @NameInMap("ServeApiKey")
        public String serveApiKey;

        /**
         * <strong>example:</strong>
         * <p><a href="http://111.xx.xx.xx:8100/inferenceservice/emb">http://111.xx.xx.xx:8100/inferenceservice/emb</a></p>
         */
        @NameInMap("ServeEmbeddingEndpoint")
        public String serveEmbeddingEndpoint;

        /**
         * <strong>example:</strong>
         * <p>Qwen3-Embedding-8B</p>
         */
        @NameInMap("ServeEmbeddingModelName")
        public String serveEmbeddingModelName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://111.xx.xx.xx:8100/inferenceservice/base">http://111.xx.xx.xx:8100/inferenceservice/base</a></p>
         */
        @NameInMap("ServeEndpoint")
        public String serveEndpoint;

        /**
         * <strong>example:</strong>
         * <p>Qwen3-235B-A22B-Instruct-2507</p>
         */
        @NameInMap("ServeModelName")
        public String serveModelName;

        /**
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
