// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMcpToolsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * <p>The list data.</p>
     */
    @NameInMap("items")
    public java.util.List<ListMcpToolsResponseBodyItems> items;

    /**
     * <p>The maximum number of results per page.</p>
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
     * <p>Request processed successfully</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-page-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListMcpToolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcpToolsResponseBody self = new ListMcpToolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcpToolsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMcpToolsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMcpToolsResponseBody setItems(java.util.List<ListMcpToolsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListMcpToolsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListMcpToolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpToolsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMcpToolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMcpToolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcpToolsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMcpToolsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMcpToolsResponseBodyItems extends TeaModel {
        /**
         * <p>The input parameter schema of the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("inputSchema")
        public String inputSchema;

        /**
         * <p>The output parameter schema of the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("outputSchema")
        public String outputSchema;

        /**
         * <p>The MCP tool description.</p>
         * 
         * <strong>example:</strong>
         * <p>Get the current time</p>
         */
        @NameInMap("toolDescription")
        public String toolDescription;

        /**
         * <p>The MCP tool name.</p>
         * 
         * <strong>example:</strong>
         * <p>get-current-time</p>
         */
        @NameInMap("toolName")
        public String toolName;

        public static ListMcpToolsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMcpToolsResponseBodyItems self = new ListMcpToolsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMcpToolsResponseBodyItems setInputSchema(String inputSchema) {
            this.inputSchema = inputSchema;
            return this;
        }
        public String getInputSchema() {
            return this.inputSchema;
        }

        public ListMcpToolsResponseBodyItems setOutputSchema(String outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }
        public String getOutputSchema() {
            return this.outputSchema;
        }

        public ListMcpToolsResponseBodyItems setToolDescription(String toolDescription) {
            this.toolDescription = toolDescription;
            return this;
        }
        public String getToolDescription() {
            return this.toolDescription;
        }

        public ListMcpToolsResponseBodyItems setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

    }

}
