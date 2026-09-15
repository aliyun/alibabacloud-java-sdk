// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMcpMarketItemsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of query results.</p>
     */
    @NameInMap("items")
    public java.util.List<ListMcpMarketItemsResponseBodyItems> items;

    /**
     * <p>The maximum number of records to return in this query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * <p>The pagination token used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records that match the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListMcpMarketItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcpMarketItemsResponseBody self = new ListMcpMarketItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcpMarketItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMcpMarketItemsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMcpMarketItemsResponseBody setItems(java.util.List<ListMcpMarketItemsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListMcpMarketItemsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListMcpMarketItemsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpMarketItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMcpMarketItemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMcpMarketItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcpMarketItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMcpMarketItemsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMcpMarketItemsResponseBodyItems extends TeaModel {
        /**
         * <p>The MCP marketplace template category.</p>
         * 
         * <strong>example:</strong>
         * <p>knowledge</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The MCP service description.</p>
         * 
         * <strong>example:</strong>
         * <p>An MCP service for querying knowledge bases</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display metadata of the template.</p>
         */
        @NameInMap("displayMetadata")
        public java.util.Map<String, ?> displayMetadata;

        /**
         * <p>The icon URL of the MCP marketplace template.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp-icon.png">https://example.com/mcp-icon.png</a></p>
         */
        @NameInMap("iconUrl")
        public String iconUrl;

        /**
         * <p>The number of times the template has been installed.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("installCount")
        public Long installCount;

        /**
         * <p>The MCP marketplace template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>market-1</p>
         */
        @NameInMap("marketItemId")
        public String marketItemId;

        /**
         * <p>The MCP type.</p>
         * 
         * <strong>example:</strong>
         * <p>CODE_PACKAGE</p>
         */
        @NameInMap("mcpType")
        public String mcpType;

        /**
         * <p>The MCP marketplace template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Knowledge</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The official usage tag.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOWLEDGE_BASE</p>
         */
        @NameInMap("officialTag")
        public String officialTag;

        /**
         * <p>The MCP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamableHTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The usage instructions for the MCP marketplace template.</p>
         * 
         * <strong>example:</strong>
         * <h1>Knowledge\nKnowledge base query service</h1>
         */
        @NameInMap("readme")
        public String readme;

        /**
         * <p>The template schema version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("schemaVersion")
        public String schemaVersion;

        /**
         * <p>The template input schema, represented as a JSON Schema string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;addresses&quot;:{&quot;type&quot;:&quot;array&quot;,&quot;items&quot;:{&quot;type&quot;:&quot;string&quot;}}}}</p>
         */
        @NameInMap("templateInputSchema")
        public String templateInputSchema;

        /**
         * <p>The MCP marketplace template version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("templateVersion")
        public String templateVersion;

        public static ListMcpMarketItemsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMcpMarketItemsResponseBodyItems self = new ListMcpMarketItemsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMcpMarketItemsResponseBodyItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMcpMarketItemsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMcpMarketItemsResponseBodyItems setDisplayMetadata(java.util.Map<String, ?> displayMetadata) {
            this.displayMetadata = displayMetadata;
            return this;
        }
        public java.util.Map<String, ?> getDisplayMetadata() {
            return this.displayMetadata;
        }

        public ListMcpMarketItemsResponseBodyItems setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListMcpMarketItemsResponseBodyItems setInstallCount(Long installCount) {
            this.installCount = installCount;
            return this;
        }
        public Long getInstallCount() {
            return this.installCount;
        }

        public ListMcpMarketItemsResponseBodyItems setMarketItemId(String marketItemId) {
            this.marketItemId = marketItemId;
            return this;
        }
        public String getMarketItemId() {
            return this.marketItemId;
        }

        public ListMcpMarketItemsResponseBodyItems setMcpType(String mcpType) {
            this.mcpType = mcpType;
            return this;
        }
        public String getMcpType() {
            return this.mcpType;
        }

        public ListMcpMarketItemsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpMarketItemsResponseBodyItems setOfficialTag(String officialTag) {
            this.officialTag = officialTag;
            return this;
        }
        public String getOfficialTag() {
            return this.officialTag;
        }

        public ListMcpMarketItemsResponseBodyItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListMcpMarketItemsResponseBodyItems setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public ListMcpMarketItemsResponseBodyItems setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public ListMcpMarketItemsResponseBodyItems setTemplateInputSchema(String templateInputSchema) {
            this.templateInputSchema = templateInputSchema;
            return this;
        }
        public String getTemplateInputSchema() {
            return this.templateInputSchema;
        }

        public ListMcpMarketItemsResponseBodyItems setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

    }

}
