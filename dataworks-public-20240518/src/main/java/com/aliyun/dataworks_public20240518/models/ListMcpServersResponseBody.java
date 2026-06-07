// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMcpServersResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListMcpServersResponseBodyPagingInfo pagingInfo;

    /**
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
        @NameInMap("CustomHeaders")
        public java.util.Map<String, ?> customHeaders;

        /**
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("Transport")
        public String transport;

        /**
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
        @NameInMap("Config")
        public ListMcpServersResponseBodyPagingInfoMcpServersConfig config;

        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>1780555634000</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("McpServers")
        public java.util.List<ListMcpServersResponseBodyPagingInfoMcpServers> mcpServers;

        @NameInMap("NextToken")
        public String nextToken;

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
