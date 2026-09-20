// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMcpMarketItemResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetMcpMarketItemResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

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

    public static GetMcpMarketItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcpMarketItemResponseBody self = new GetMcpMarketItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcpMarketItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMcpMarketItemResponseBody setData(GetMcpMarketItemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMcpMarketItemResponseBodyData getData() {
        return this.data;
    }

    public GetMcpMarketItemResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMcpMarketItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMcpMarketItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcpMarketItemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMcpMarketItemResponseBodyData extends TeaModel {
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
         * <p>The template display metadata.</p>
         */
        @NameInMap("displayMetadata")
        public java.util.Map<String, ?> displayMetadata;

        /**
         * <p>The multilingual display content, organized by BCP-47 language tags. Falls back to default fields when the specified language is not matched.</p>
         */
        @NameInMap("i18n")
        public java.util.Map<String, DataI18nValue> i18n;

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

        public static GetMcpMarketItemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMcpMarketItemResponseBodyData self = new GetMcpMarketItemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMcpMarketItemResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetMcpMarketItemResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMcpMarketItemResponseBodyData setDisplayMetadata(java.util.Map<String, ?> displayMetadata) {
            this.displayMetadata = displayMetadata;
            return this;
        }
        public java.util.Map<String, ?> getDisplayMetadata() {
            return this.displayMetadata;
        }

        public GetMcpMarketItemResponseBodyData setI18n(java.util.Map<String, DataI18nValue> i18n) {
            this.i18n = i18n;
            return this;
        }
        public java.util.Map<String, DataI18nValue> getI18n() {
            return this.i18n;
        }

        public GetMcpMarketItemResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public GetMcpMarketItemResponseBodyData setInstallCount(Long installCount) {
            this.installCount = installCount;
            return this;
        }
        public Long getInstallCount() {
            return this.installCount;
        }

        public GetMcpMarketItemResponseBodyData setMarketItemId(String marketItemId) {
            this.marketItemId = marketItemId;
            return this;
        }
        public String getMarketItemId() {
            return this.marketItemId;
        }

        public GetMcpMarketItemResponseBodyData setMcpType(String mcpType) {
            this.mcpType = mcpType;
            return this;
        }
        public String getMcpType() {
            return this.mcpType;
        }

        public GetMcpMarketItemResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpMarketItemResponseBodyData setOfficialTag(String officialTag) {
            this.officialTag = officialTag;
            return this;
        }
        public String getOfficialTag() {
            return this.officialTag;
        }

        public GetMcpMarketItemResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetMcpMarketItemResponseBodyData setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public GetMcpMarketItemResponseBodyData setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public GetMcpMarketItemResponseBodyData setTemplateInputSchema(String templateInputSchema) {
            this.templateInputSchema = templateInputSchema;
            return this;
        }
        public String getTemplateInputSchema() {
            return this.templateInputSchema;
        }

        public GetMcpMarketItemResponseBodyData setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

    }

}
