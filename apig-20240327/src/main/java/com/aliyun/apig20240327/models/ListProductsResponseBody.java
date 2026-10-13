// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
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
    public ListProductsResponseBodyData data;

    /**
     * <p>The maximum number of entries returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The cursor token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductsResponseBody setData(ListProductsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductsResponseBodyData getData() {
        return this.data;
    }

    public ListProductsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProductsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProductsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The agent-related configurations of the API product. The agentAPIConfig member includes agentProtocols (the list of protocols supported by the agent) and routes (the list of routes).</p>
         */
        @NameInMap("agentConfig")
        public HiMarketAgentConfig agentConfig;

        /**
         * <p>Specifies whether subscription requests for the API product are automatically approved. This is the AutoApprove property of the API product resource.</p>
         */
        @NameInMap("autoApprove")
        public Boolean autoApprove;

        /**
         * <p>The list of product categories to which the API product belongs. The list element is named category.</p>
         */
        @NameInMap("categories")
        public java.util.List<HiMarketProductCategory> categories;

        /**
         * <p>The description of the API product, which is the Description property of the API product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>An API product that provides weather query capabilities</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The documentation of the API product, which is the Document property of the API product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>The invocation methods, parameters, and billing instructions for this product</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>The capability configurations of the API product. Currently, it includes only the modelFeature (model capabilities) member, which contains model, maxTokens, temperature, streaming, webSearch, enableThinking, and enableMultiModal.</p>
         */
        @NameInMap("feature")
        public HiMarketProductFeature feature;

        /**
         * <p>The icon of the API product, which is the Icon property of the API product resource. It consists of two fields: type (the icon type) and value (the icon information).</p>
         */
        @NameInMap("icon")
        public HiMarketIcon icon;

        /**
         * <p>The MCP-related configurations of the API product. The members include mcpServerName (the MCP server name), tools, mcpServerConfig (path and domains), and meta (protocol).</p>
         */
        @NameInMap("mcpConfig")
        public HiMarketMcpConfig mcpConfig;

        /**
         * <p>The model API-related configurations of the API product. The modelAPIConfig member includes modelCategory (the AI model category), aiProtocols (the list of AI API protocols), and routes (the list of routes).</p>
         */
        @NameInMap("modelConfig")
        public HiMarketModelConfig modelConfig;

        /**
         * <p>The name of the API product, which is the Name property of the API product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>weather-query-api</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the API product, which is the primary ID of the API product resource. You can use it to locate the product in operations such as GetProduct, UpdateProduct, DeleteProduct, PublishProduct, SetProductCategories, and ListProductPublications.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        @NameInMap("productId")
        public String productId;

        /**
         * <p>The status of the API product, which is the Status property of the API product resource. Valid values: Pending, Ready, and Published.</p>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the API product, which is the Type property of the API product resource. The valid values are not declared in the API definition. Refer to the types displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("type")
        public String type;

        public static ListProductsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyDataContent self = new ListProductsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyDataContent setAgentConfig(HiMarketAgentConfig agentConfig) {
            this.agentConfig = agentConfig;
            return this;
        }
        public HiMarketAgentConfig getAgentConfig() {
            return this.agentConfig;
        }

        public ListProductsResponseBodyDataContent setAutoApprove(Boolean autoApprove) {
            this.autoApprove = autoApprove;
            return this;
        }
        public Boolean getAutoApprove() {
            return this.autoApprove;
        }

        public ListProductsResponseBodyDataContent setCategories(java.util.List<HiMarketProductCategory> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<HiMarketProductCategory> getCategories() {
            return this.categories;
        }

        public ListProductsResponseBodyDataContent setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyDataContent setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public ListProductsResponseBodyDataContent setFeature(HiMarketProductFeature feature) {
            this.feature = feature;
            return this;
        }
        public HiMarketProductFeature getFeature() {
            return this.feature;
        }

        public ListProductsResponseBodyDataContent setIcon(HiMarketIcon icon) {
            this.icon = icon;
            return this;
        }
        public HiMarketIcon getIcon() {
            return this.icon;
        }

        public ListProductsResponseBodyDataContent setMcpConfig(HiMarketMcpConfig mcpConfig) {
            this.mcpConfig = mcpConfig;
            return this;
        }
        public HiMarketMcpConfig getMcpConfig() {
            return this.mcpConfig;
        }

        public ListProductsResponseBodyDataContent setModelConfig(HiMarketModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public HiMarketModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public ListProductsResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyDataContent setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProductsResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProductsResponseBodyDataContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProductsResponseBodyData extends TeaModel {
        /**
         * <p>The list of API products. The list element is named productInfo, and each element contains the information of an API product.</p>
         */
        @NameInMap("content")
        public java.util.List<ListProductsResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListProductsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyData self = new ListProductsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyData setContent(java.util.List<ListProductsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListProductsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListProductsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProductsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
