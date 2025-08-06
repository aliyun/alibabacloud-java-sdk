// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolListResponseBody extends TeaModel {
    /**
     * <p>Current page</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Whether there is a next page</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>List of IP pools</p>
     */
    @NameInMap("IpPools")
    public java.util.List<DedicatedIpPoolListResponseBodyIpPools> ipPools;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of data under the current request conditions</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    public static DedicatedIpPoolListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolListResponseBody self = new DedicatedIpPoolListResponseBody();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolListResponseBody setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DedicatedIpPoolListResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public DedicatedIpPoolListResponseBody setIpPools(java.util.List<DedicatedIpPoolListResponseBodyIpPools> ipPools) {
        this.ipPools = ipPools;
        return this;
    }
    public java.util.List<DedicatedIpPoolListResponseBodyIpPools> getIpPools() {
        return this.ipPools;
    }

    public DedicatedIpPoolListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DedicatedIpPoolListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DedicatedIpPoolListResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class DedicatedIpPoolListResponseBodyIpPoolsIps extends TeaModel {
        /**
         * <p>Instance purchase ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>IP address</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Ip")
        public String ip;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DedicatedIpPoolListResponseBodyIpPoolsIps build(java.util.Map<String, ?> map) throws Exception {
            DedicatedIpPoolListResponseBodyIpPoolsIps self = new DedicatedIpPoolListResponseBodyIpPoolsIps();
            return TeaModel.build(map, self);
        }

        public DedicatedIpPoolListResponseBodyIpPoolsIps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DedicatedIpPoolListResponseBodyIpPoolsIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DedicatedIpPoolListResponseBodyIpPoolsIps setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DedicatedIpPoolListResponseBodyIpPools extends TeaModel {
        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-23T07:41:43Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>IP pool ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Number of source IP addresses</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IpCount")
        public Integer ipCount;

        /**
         * <p>List of IPs</p>
         */
        @NameInMap("Ips")
        public java.util.List<DedicatedIpPoolListResponseBodyIpPoolsIps> ips;

        /**
         * <p>IP pool name</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        public static DedicatedIpPoolListResponseBodyIpPools build(java.util.Map<String, ?> map) throws Exception {
            DedicatedIpPoolListResponseBodyIpPools self = new DedicatedIpPoolListResponseBodyIpPools();
            return TeaModel.build(map, self);
        }

        public DedicatedIpPoolListResponseBodyIpPools setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DedicatedIpPoolListResponseBodyIpPools setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DedicatedIpPoolListResponseBodyIpPools setIpCount(Integer ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public Integer getIpCount() {
            return this.ipCount;
        }

        public DedicatedIpPoolListResponseBodyIpPools setIps(java.util.List<DedicatedIpPoolListResponseBodyIpPoolsIps> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<DedicatedIpPoolListResponseBodyIpPoolsIps> getIps() {
            return this.ips;
        }

        public DedicatedIpPoolListResponseBodyIpPools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
