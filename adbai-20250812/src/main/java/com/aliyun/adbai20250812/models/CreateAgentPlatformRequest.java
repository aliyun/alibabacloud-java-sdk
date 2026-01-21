// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateAgentPlatformRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AiPlatformConfig")
    public CreateAgentPlatformRequestAiPlatformConfig aiPlatformConfig;

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
     * <p>testplatform</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateAgentPlatformRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentPlatformRequest self = new CreateAgentPlatformRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentPlatformRequest setAiPlatformConfig(CreateAgentPlatformRequestAiPlatformConfig aiPlatformConfig) {
        this.aiPlatformConfig = aiPlatformConfig;
        return this;
    }
    public CreateAgentPlatformRequestAiPlatformConfig getAiPlatformConfig() {
        return this.aiPlatformConfig;
    }

    public CreateAgentPlatformRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAgentPlatformRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgentPlatformRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateAgentPlatformRequestAiPlatformConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3760d3**************************</p>
         */
        @NameInMap("ServeApiKey")
        public String serveApiKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://111.xx.xx.xx:8100/inferenceservice/emb">http://111.xx.xx.xx:8100/inferenceservice/emb</a></p>
         */
        @NameInMap("ServeEmbeddingEndpoint")
        public String serveEmbeddingEndpoint;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-Embedding-8B</p>
         */
        @NameInMap("ServeEmbeddingModelName")
        public String serveEmbeddingModelName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://111.xx.xx.xx:8100/inferenceservice/base">http://111.xx.xx.xx:8100/inferenceservice/base</a></p>
         */
        @NameInMap("ServeEndpoint")
        public String serveEndpoint;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-235B-A22B-Instruct-2507</p>
         */
        @NameInMap("ServeModelName")
        public String serveModelName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>large</p>
         */
        @NameInMap("SpecName")
        public String specName;

        public static CreateAgentPlatformRequestAiPlatformConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentPlatformRequestAiPlatformConfig self = new CreateAgentPlatformRequestAiPlatformConfig();
            return TeaModel.build(map, self);
        }

        public CreateAgentPlatformRequestAiPlatformConfig setServeApiKey(String serveApiKey) {
            this.serveApiKey = serveApiKey;
            return this;
        }
        public String getServeApiKey() {
            return this.serveApiKey;
        }

        public CreateAgentPlatformRequestAiPlatformConfig setServeEmbeddingEndpoint(String serveEmbeddingEndpoint) {
            this.serveEmbeddingEndpoint = serveEmbeddingEndpoint;
            return this;
        }
        public String getServeEmbeddingEndpoint() {
            return this.serveEmbeddingEndpoint;
        }

        public CreateAgentPlatformRequestAiPlatformConfig setServeEmbeddingModelName(String serveEmbeddingModelName) {
            this.serveEmbeddingModelName = serveEmbeddingModelName;
            return this;
        }
        public String getServeEmbeddingModelName() {
            return this.serveEmbeddingModelName;
        }

        public CreateAgentPlatformRequestAiPlatformConfig setServeEndpoint(String serveEndpoint) {
            this.serveEndpoint = serveEndpoint;
            return this;
        }
        public String getServeEndpoint() {
            return this.serveEndpoint;
        }

        public CreateAgentPlatformRequestAiPlatformConfig setServeModelName(String serveModelName) {
            this.serveModelName = serveModelName;
            return this;
        }
        public String getServeModelName() {
            return this.serveModelName;
        }

        public CreateAgentPlatformRequestAiPlatformConfig setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

}
