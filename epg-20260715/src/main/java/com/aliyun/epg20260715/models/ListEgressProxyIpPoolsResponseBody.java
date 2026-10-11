// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyIpPoolsResponseBody extends TeaModel {
    @NameInMap("EgressProxyIpPools")
    public java.util.List<ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools> egressProxyIpPools;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFydY8mmse+9oiDWdR7XiKw/GLUmEZbYNsGL0evBky1i+FT5KS4q2RSGRQDNmuSWlq6KV1PiloZen3lB3ZXwB0vA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>C79118A9-CA6D-5359-B53E-111BE8A03DCF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEgressProxyIpPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyIpPoolsResponseBody self = new ListEgressProxyIpPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyIpPoolsResponseBody setEgressProxyIpPools(java.util.List<ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools> egressProxyIpPools) {
        this.egressProxyIpPools = egressProxyIpPools;
        return this;
    }
    public java.util.List<ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools> getEgressProxyIpPools() {
        return this.egressProxyIpPools;
    }

    public ListEgressProxyIpPoolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEgressProxyIpPoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEgressProxyIpPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEgressProxyIpPoolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEgressProxyIpPoolsResponseBodyEgressProxyIpPoolsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Physical_QPS,Thread_Detail,Logic_RT,Physical_RT,Slow_RequestCount</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>1770104466</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEgressProxyIpPoolsResponseBodyEgressProxyIpPoolsTags build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyIpPoolsResponseBodyEgressProxyIpPoolsTags self = new ListEgressProxyIpPoolsResponseBodyEgressProxyIpPoolsTags();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPoolsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPoolsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <strong>example:</strong>
         * <p>2026-03-11T11:18:35</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Type\&quot;: \&quot;text\&quot;, \&quot;Value\&quot;: \&quot;Ensures that assets are protected by Cloud Firewall. Requirement: Enable the Internet Firewall feature.\&quot;}</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>epg-gw80bb6a94f835db****</p>
         */
        @NameInMap("EgressProxyGatewayId")
        public String egressProxyGatewayId;

        /**
         * <strong>example:</strong>
         * <p>eppool-gw80d96a96ca0b00****</p>
         */
        @NameInMap("EgressProxyIpPoolId")
        public String egressProxyIpPoolId;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyIpPoolName")
        public String egressProxyIpPoolName;

        /**
         * <strong>example:</strong>
         * <p>SourceIP</p>
         */
        @NameInMap("HashFactor")
        public String hashFactor;

        /**
         * <strong>example:</strong>
         * <p>X-Forwarded-For</p>
         */
        @NameInMap("HashHeaderName")
        public String hashHeaderName;

        /**
         * <strong>example:</strong>
         * <p>Random</p>
         */
        @NameInMap("Scheduler")
        public String scheduler;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListEgressProxyIpPoolsResponseBodyEgressProxyIpPoolsTags> tags;

        public static ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools self = new ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setEgressProxyGatewayId(String egressProxyGatewayId) {
            this.egressProxyGatewayId = egressProxyGatewayId;
            return this;
        }
        public String getEgressProxyGatewayId() {
            return this.egressProxyGatewayId;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setEgressProxyIpPoolId(String egressProxyIpPoolId) {
            this.egressProxyIpPoolId = egressProxyIpPoolId;
            return this;
        }
        public String getEgressProxyIpPoolId() {
            return this.egressProxyIpPoolId;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setEgressProxyIpPoolName(String egressProxyIpPoolName) {
            this.egressProxyIpPoolName = egressProxyIpPoolName;
            return this;
        }
        public String getEgressProxyIpPoolName() {
            return this.egressProxyIpPoolName;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setHashFactor(String hashFactor) {
            this.hashFactor = hashFactor;
            return this;
        }
        public String getHashFactor() {
            return this.hashFactor;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setHashHeaderName(String hashHeaderName) {
            this.hashHeaderName = hashHeaderName;
            return this;
        }
        public String getHashHeaderName() {
            return this.hashHeaderName;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEgressProxyIpPoolsResponseBodyEgressProxyIpPools setTags(java.util.List<ListEgressProxyIpPoolsResponseBodyEgressProxyIpPoolsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListEgressProxyIpPoolsResponseBodyEgressProxyIpPoolsTags> getTags() {
            return this.tags;
        }

    }

}
