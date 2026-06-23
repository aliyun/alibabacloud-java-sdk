// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMcpServersResponseBody extends TeaModel {
    /**
     * <p>The paging information.</p>
     */
    @NameInMap("PagingInfo")
    public ListMcpServersResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMcpServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcpServersResponseBody self = new ListMcpServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcpServersResponseBody setPagingInfo(ListMcpServersResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListMcpServersResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListMcpServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMcpServersResponseBodyPagingInfoMcpServersConfig extends TeaModel {
        /**
         * <p>The custom headers.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("CustomHeaders")
        public java.util.Map<String, ?> customHeaders;

        /**
         * <p>The transport protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("Transport")
        public String transport;

        /**
         * <p>The service address of the MCP Server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp/sse">https://example.com/mcp/sse</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ListMcpServersResponseBodyPagingInfoMcpServersConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServersResponseBodyPagingInfoMcpServersConfig self = new ListMcpServersResponseBodyPagingInfoMcpServersConfig();
            return TeaModel.build(map, self);
        }

        public ListMcpServersResponseBodyPagingInfoMcpServersConfig setCustomHeaders(java.util.Map<String, ?> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public java.util.Map<String, ?> getCustomHeaders() {
            return this.customHeaders;
        }

        public ListMcpServersResponseBodyPagingInfoMcpServersConfig setTransport(String transport) {
            this.transport = transport;
            return this;
        }
        public String getTransport() {
            return this.transport;
        }

        public ListMcpServersResponseBodyPagingInfoMcpServersConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListMcpServersResponseBodyPagingInfoMcpServers extends TeaModel {
        /**
         * <p>The connection configuration of the MCP Server.</p>
         */
        @NameInMap("Config")
        public ListMcpServersResponseBodyPagingInfoMcpServersConfig config;

        /**
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>805298765622151</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The creation time, as a millisecond timestamp.****</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The last modified time, as a millisecond timestamp.****</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The ID of the user who last modified the server.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <p>The name of the MCP Server.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The visibility level.****</p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static ListMcpServersResponseBodyPagingInfoMcpServers build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServersResponseBodyPagingInfoMcpServers self = new ListMcpServersResponseBodyPagingInfoMcpServers();
            return TeaModel.build(map, self);
        }

        public ListMcpServersResponseBodyPagingInfoMcpServers setConfig(ListMcpServersResponseBodyPagingInfoMcpServersConfig config) {
            this.config = config;
            return this;
        }
        public ListMcpServersResponseBodyPagingInfoMcpServersConfig getConfig() {
            return this.config;
        }

        public ListMcpServersResponseBodyPagingInfoMcpServers setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListMcpServersResponseBodyPagingInfoMcpServers setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListMcpServersResponseBodyPagingInfoMcpServers setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListMcpServersResponseBodyPagingInfoMcpServers setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListMcpServersResponseBodyPagingInfoMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpServersResponseBodyPagingInfoMcpServers setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListMcpServersResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The maximum number of results returned on the current page.****</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>A list of MCP Server objects.</p>
         */
        @NameInMap("McpServers")
        public java.util.List<ListMcpServersResponseBodyPagingInfoMcpServers> mcpServers;

        /**
         * <p>The token for the next page of results. A null value indicates that all results have been returned.****</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total count of entries that match the filter criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMcpServersResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMcpServersResponseBodyPagingInfo self = new ListMcpServersResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListMcpServersResponseBodyPagingInfo setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListMcpServersResponseBodyPagingInfo setMcpServers(java.util.List<ListMcpServersResponseBodyPagingInfoMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<ListMcpServersResponseBodyPagingInfoMcpServers> getMcpServers() {
            return this.mcpServers;
        }

        public ListMcpServersResponseBodyPagingInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListMcpServersResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
