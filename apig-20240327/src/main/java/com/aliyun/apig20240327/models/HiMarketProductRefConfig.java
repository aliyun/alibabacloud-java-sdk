// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketProductRefConfig extends TeaModel {
    /**
     * <p>Reference settings for the API gateway.</p>
     */
    @NameInMap("apigRefConfig")
    public HiMarketProductRefConfigApigRefConfig apigRefConfig;

    /**
     * <p>Unique identifier for the gateway.</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    public static HiMarketProductRefConfig build(java.util.Map<String, ?> map) throws Exception {
        HiMarketProductRefConfig self = new HiMarketProductRefConfig();
        return TeaModel.build(map, self);
    }

    public HiMarketProductRefConfig setApigRefConfig(HiMarketProductRefConfigApigRefConfig apigRefConfig) {
        this.apigRefConfig = apigRefConfig;
        return this;
    }
    public HiMarketProductRefConfigApigRefConfig getApigRefConfig() {
        return this.apigRefConfig;
    }

    public HiMarketProductRefConfig setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static class HiMarketProductRefConfigApigRefConfig extends TeaModel {
        /**
         * <p>Unique identifier for the agent API.</p>
         */
        @NameInMap("agentApiId")
        public String agentApiId;

        /**
         * <p>The name of the agent API.</p>
         */
        @NameInMap("agentApiName")
        public String agentApiName;

        /**
         * <p>Unique identifier for the MCP route.</p>
         */
        @NameInMap("mcpRouteId")
        public String mcpRouteId;

        /**
         * <p>Unique identifier for the MCP server.</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The name of the MCP server.</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

        /**
         * <p>Unique identifier for the model API.</p>
         */
        @NameInMap("modelApiId")
        public String modelApiId;

        /**
         * <p>The name of the model API.</p>
         */
        @NameInMap("modelApiName")
        public String modelApiName;

        public static HiMarketProductRefConfigApigRefConfig build(java.util.Map<String, ?> map) throws Exception {
            HiMarketProductRefConfigApigRefConfig self = new HiMarketProductRefConfigApigRefConfig();
            return TeaModel.build(map, self);
        }

        public HiMarketProductRefConfigApigRefConfig setAgentApiId(String agentApiId) {
            this.agentApiId = agentApiId;
            return this;
        }
        public String getAgentApiId() {
            return this.agentApiId;
        }

        public HiMarketProductRefConfigApigRefConfig setAgentApiName(String agentApiName) {
            this.agentApiName = agentApiName;
            return this;
        }
        public String getAgentApiName() {
            return this.agentApiName;
        }

        public HiMarketProductRefConfigApigRefConfig setMcpRouteId(String mcpRouteId) {
            this.mcpRouteId = mcpRouteId;
            return this;
        }
        public String getMcpRouteId() {
            return this.mcpRouteId;
        }

        public HiMarketProductRefConfigApigRefConfig setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public HiMarketProductRefConfigApigRefConfig setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public HiMarketProductRefConfigApigRefConfig setModelApiId(String modelApiId) {
            this.modelApiId = modelApiId;
            return this;
        }
        public String getModelApiId() {
            return this.modelApiId;
        }

        public HiMarketProductRefConfigApigRefConfig setModelApiName(String modelApiName) {
            this.modelApiName = modelApiName;
            return this;
        }
        public String getModelApiName() {
            return this.modelApiName;
        }

    }

}
