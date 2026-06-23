// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListVirtualHostsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListVirtualHostsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EF4DB019-DA4A-4CE3-B220-223BBC93F***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVirtualHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualHostsResponseBody self = new ListVirtualHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualHostsResponseBody setData(ListVirtualHostsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVirtualHostsResponseBodyData getData() {
        return this.data;
    }

    public ListVirtualHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVirtualHostsResponseBodyDataVirtualHosts extends TeaModel {
        /**
         * <p>The name of the vhost.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListVirtualHostsResponseBodyDataVirtualHosts build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualHostsResponseBodyDataVirtualHosts self = new ListVirtualHostsResponseBodyDataVirtualHosts();
            return TeaModel.build(map, self);
        }

        public ListVirtualHostsResponseBodyDataVirtualHosts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListVirtualHostsResponseBodyData extends TeaModel {
        /**
         * <p>The maximum number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that is used to retrieve the next page of results. If this parameter is not returned, all data has been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caebacccb2be03f84eb48b699f0a****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The list of vhosts.</p>
         */
        @NameInMap("VirtualHosts")
        public java.util.List<ListVirtualHostsResponseBodyDataVirtualHosts> virtualHosts;

        public static ListVirtualHostsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualHostsResponseBodyData self = new ListVirtualHostsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVirtualHostsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListVirtualHostsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListVirtualHostsResponseBodyData setVirtualHosts(java.util.List<ListVirtualHostsResponseBodyDataVirtualHosts> virtualHosts) {
            this.virtualHosts = virtualHosts;
            return this;
        }
        public java.util.List<ListVirtualHostsResponseBodyDataVirtualHosts> getVirtualHosts() {
            return this.virtualHosts;
        }

    }

}
