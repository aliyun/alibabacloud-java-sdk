// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateProductRefRequest extends TeaModel {
    /**
     * <p>The API configuration associated with the API product.</p>
     */
    @NameInMap("apigRefConfig")
    public CreateProductRefRequestApigRefConfig apigRefConfig;

    /**
     * <p>The ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-123456</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    public static CreateProductRefRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRefRequest self = new CreateProductRefRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRefRequest setApigRefConfig(CreateProductRefRequestApigRefConfig apigRefConfig) {
        this.apigRefConfig = apigRefConfig;
        return this;
    }
    public CreateProductRefRequestApigRefConfig getApigRefConfig() {
        return this.apigRefConfig;
    }

    public CreateProductRefRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static class CreateProductRefRequestApigRefConfig extends TeaModel {
        /**
         * <p>The ID of the associated agent API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxxxxxx</p>
         */
        @NameInMap("agentApiId")
        public String agentApiId;

        /**
         * <p>The name of the associated agent API.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore</p>
         */
        @NameInMap("agentApiName")
        public String agentApiName;

        /**
         * <p>The ID of the associated API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("apiId")
        public String apiId;

        /**
         * <p>The name of the associated API.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <p>The ID of the associated MCP route.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-xxxxxxxx</p>
         */
        @NameInMap("mcpRouteId")
        public String mcpRouteId;

        /**
         * <p>The ID of the associated MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-adfefz24afg</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The name of the associated MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>test-mcp</p>
         */
        @NameInMap("mcpServerName")
        public String mcpServerName;

        /**
         * <p>The ID of the associated model API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxxxxxx</p>
         */
        @NameInMap("modelApiId")
        public String modelApiId;

        /**
         * <p>The name of the associated model API.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore</p>
         */
        @NameInMap("modelApiName")
        public String modelApiName;

        public static CreateProductRefRequestApigRefConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProductRefRequestApigRefConfig self = new CreateProductRefRequestApigRefConfig();
            return TeaModel.build(map, self);
        }

        public CreateProductRefRequestApigRefConfig setAgentApiId(String agentApiId) {
            this.agentApiId = agentApiId;
            return this;
        }
        public String getAgentApiId() {
            return this.agentApiId;
        }

        public CreateProductRefRequestApigRefConfig setAgentApiName(String agentApiName) {
            this.agentApiName = agentApiName;
            return this;
        }
        public String getAgentApiName() {
            return this.agentApiName;
        }

        public CreateProductRefRequestApigRefConfig setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public CreateProductRefRequestApigRefConfig setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public CreateProductRefRequestApigRefConfig setMcpRouteId(String mcpRouteId) {
            this.mcpRouteId = mcpRouteId;
            return this;
        }
        public String getMcpRouteId() {
            return this.mcpRouteId;
        }

        public CreateProductRefRequestApigRefConfig setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public CreateProductRefRequestApigRefConfig setMcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        public CreateProductRefRequestApigRefConfig setModelApiId(String modelApiId) {
            this.modelApiId = modelApiId;
            return this;
        }
        public String getModelApiId() {
            return this.modelApiId;
        }

        public CreateProductRefRequestApigRefConfig setModelApiName(String modelApiName) {
            this.modelApiName = modelApiName;
            return this;
        }
        public String getModelApiName() {
            return this.modelApiName;
        }

    }

}
