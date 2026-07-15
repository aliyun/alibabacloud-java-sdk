// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketProductRefConfig extends TeaModel {
    /**
     * <p>The APIG resource reference configuration.</p>
     */
    @NameInMap("apigRefConfig")
    public HiMarketProductRefConfigApigRefConfig apigRefConfig;

    /**
     * <p>The ID of the associated gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-xxx</p>
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
         * <p>The associated Agent API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("agentApiId")
        public String agentApiId;

        /**
         * <p>The Agent API name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-api</p>
         */
        @NameInMap("agentApiName")
        public String agentApiName;

        /**
         * <p>The associated MCP route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>route-xxx</p>
         */
        @NameInMap("mcpRouteId")
        public String mcpRouteId;

        /**
         * <p>The associated MCP Server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-xxx</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The MCP Server name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

        /**
         * <p>The associated Model API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-yyy</p>
         */
        @NameInMap("modelApiId")
        public String modelApiId;

        /**
         * <p>The Model API name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-model-api</p>
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
