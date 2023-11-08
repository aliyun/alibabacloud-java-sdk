// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class ListVirtualHostsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListVirtualHostsResponseBodyData data;

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
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>Vhost。</p>
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
