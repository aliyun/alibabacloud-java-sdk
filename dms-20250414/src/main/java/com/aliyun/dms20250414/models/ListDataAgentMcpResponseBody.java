// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentMcpResponseBody extends TeaModel {
    /**
     * <p>The paging query results of MCP Servers.</p>
     */
    @NameInMap("Data")
    public ListDataAgentMcpResponseBodyData data;

    /**
     * <p>The return code. The value is success if the request was successful, or an error code if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when a system-level request failure occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>Failed to list MCP servers</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The maximum number of records returned in this response.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. This value is empty when no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>page-2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID, which is used to locate this call.</p>
     * 
     * <strong>example:</strong>
     * <p>550e***544</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataAgentMcpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentMcpResponseBody self = new ListDataAgentMcpResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataAgentMcpResponseBody setData(ListDataAgentMcpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataAgentMcpResponseBodyData getData() {
        return this.data;
    }

    public ListDataAgentMcpResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataAgentMcpResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataAgentMcpResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataAgentMcpResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataAgentMcpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataAgentMcpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataAgentMcpResponseBodyData extends TeaModel {
        /**
         * <p>The list of MCP Servers on the current page. Each item contains information such as the service identifier, name, workspace, network, connection method, status, and enabled state.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;uuid&quot;:&quot;44lg<em><strong>z65&quot;,&quot;name&quot;:&quot;analytics&quot;,&quot;workspaceUuid&quot;:&quot;	atvx</strong></em>xmz&quot;,&quot;netType&quot;:&quot;public&quot;,&quot;transportType&quot;:&quot;sse&quot;,&quot;state&quot;:&quot;ready&quot;,&quot;enable&quot;:true}]</p>
         */
        @NameInMap("Content")
        public Object content;

        /**
         * <p>The current page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Float pageNumber;

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Float pageSize;

        /**
         * <p>The total number of records that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalElements")
        public Float totalElements;

        /**
         * <p>The total number of pages that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Float totalPages;

        public static ListDataAgentMcpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataAgentMcpResponseBodyData self = new ListDataAgentMcpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataAgentMcpResponseBodyData setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public ListDataAgentMcpResponseBodyData setPageNumber(Float pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Float getPageNumber() {
            return this.pageNumber;
        }

        public ListDataAgentMcpResponseBodyData setPageSize(Float pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Float getPageSize() {
            return this.pageSize;
        }

        public ListDataAgentMcpResponseBodyData setTotalElements(Float totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Float getTotalElements() {
            return this.totalElements;
        }

        public ListDataAgentMcpResponseBodyData setTotalPages(Float totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Float getTotalPages() {
            return this.totalPages;
        }

    }

}
