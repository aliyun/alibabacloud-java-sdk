// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetProductResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetProductResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductResponseBody self = new GetProductResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductResponseBody setData(GetProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductResponseBodyData getData() {
        return this.data;
    }

    public GetProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductResponseBodyData extends TeaModel {
        /**
         * <p>The Agent-related configurations of the API product. The agentAPIConfig member includes agentProtocols, which is a list of protocols supported by the agent, and routes, which is a list of routes.</p>
         */
        @NameInMap("agentConfig")
        public HiMarketAgentConfig agentConfig;

        /**
         * <p>Indicates whether subscription requests for the product are automatically approved.</p>
         */
        @NameInMap("autoApprove")
        public Boolean autoApprove;

        /**
         * <p>The description of the API product.</p>
         * 
         * <strong>example:</strong>
         * <p>An API product that provides weather query capabilities</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The documentation content of the API product.</p>
         * 
         * <strong>example:</strong>
         * <p>The invocation methods, parameters, and billing instructions for this product</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>The capability configurations of the API product. Currently, this includes only the modelFeature member for model capabilities, which contains model, maxTokens, temperature, streaming, webSearch, enableThinking, and enableMultiModal.</p>
         */
        @NameInMap("feature")
        public HiMarketProductFeature feature;

        /**
         * <p>The icon configurations of the API product, which consist of two fields: type for the icon type and value for the icon information.</p>
         */
        @NameInMap("icon")
        public HiMarketIcon icon;

        /**
         * <p>The MCP-related configurations of the API product. The members include mcpServerName for the MCP server name, tools, mcpServerConfig for the path and domains, and meta for the protocol.</p>
         */
        @NameInMap("mcpConfig")
        public HiMarketMcpConfig mcpConfig;

        /**
         * <p>The model API-related configurations of the API product. The modelAPIConfig member includes modelCategory for the AI model category, aiProtocols for the list of AI API protocols, and routes for the list of routes.</p>
         */
        @NameInMap("modelConfig")
        public HiMarketModelConfig modelConfig;

        /**
         * <p>The name of the API product.</p>
         * 
         * <strong>example:</strong>
         * <p>weather-query-api</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the API product, which is the primary ID of the API product resource. You can use this ID to locate the product in operations such as GetProduct, UpdateProduct, DeleteProduct, PublishProduct, SetProductCategories, and GetProductRef.</p>
         * 
         * <strong>example:</strong>
         * <p>p-xxxxxxxx</p>
         */
        @NameInMap("productId")
        public String productId;

        /**
         * <p>The ID of the region to which the API product belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The status of the API product. Valid values: Pending, Ready, and Published.</p>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the API product. The set of valid values is not declared in the API definition. Refer to the types displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("type")
        public String type;

        public static GetProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductResponseBodyData self = new GetProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductResponseBodyData setAgentConfig(HiMarketAgentConfig agentConfig) {
            this.agentConfig = agentConfig;
            return this;
        }
        public HiMarketAgentConfig getAgentConfig() {
            return this.agentConfig;
        }

        public GetProductResponseBodyData setAutoApprove(Boolean autoApprove) {
            this.autoApprove = autoApprove;
            return this;
        }
        public Boolean getAutoApprove() {
            return this.autoApprove;
        }

        public GetProductResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductResponseBodyData setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public GetProductResponseBodyData setFeature(HiMarketProductFeature feature) {
            this.feature = feature;
            return this;
        }
        public HiMarketProductFeature getFeature() {
            return this.feature;
        }

        public GetProductResponseBodyData setIcon(HiMarketIcon icon) {
            this.icon = icon;
            return this;
        }
        public HiMarketIcon getIcon() {
            return this.icon;
        }

        public GetProductResponseBodyData setMcpConfig(HiMarketMcpConfig mcpConfig) {
            this.mcpConfig = mcpConfig;
            return this;
        }
        public HiMarketMcpConfig getMcpConfig() {
            return this.mcpConfig;
        }

        public GetProductResponseBodyData setModelConfig(HiMarketModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public HiMarketModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public GetProductResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProductResponseBodyData setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetProductResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetProductResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProductResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
