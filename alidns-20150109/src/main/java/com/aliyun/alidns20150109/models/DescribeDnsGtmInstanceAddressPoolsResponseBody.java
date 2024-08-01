// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolsResponseBody extends TeaModel {
    /**
     * <p>The returned address pools.</p>
     */
    @NameInMap("AddrPools")
    public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools addrPools;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned on all pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeDnsGtmInstanceAddressPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceAddressPoolsResponseBody self = new DescribeDnsGtmInstanceAddressPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setAddrPools(DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools addrPools) {
        this.addrPools = addrPools;
        return this;
    }
    public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools getAddrPools() {
        return this.addrPools;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool extends TeaModel {
        /**
         * <p>The number of addresses in the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AddrCount")
        public Integer addrCount;

        /**
         * <p>The ID of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-1</p>
         */
        @NameInMap("AddrPoolId")
        public String addrPoolId;

        /**
         * <p>The time when the address pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp that indicates when the address pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The load balancing policy of the address pool. Valid values:</p>
         * <ul>
         * <li>ALL_RR: returns all addresses.</li>
         * <li>RATIO: returns addresses by weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all_rr</p>
         */
        @NameInMap("LbaStrategy")
        public String lbaStrategy;

        /**
         * <p>The ID of the health check task.</p>
         * 
         * <strong>example:</strong>
         * <p>abc123</p>
         */
        @NameInMap("MonitorConfigId")
        public String monitorConfigId;

        /**
         * <p>Indicates whether health checks are configured. Valid values:</p>
         * <ul>
         * <li>OPEN: enabled</li>
         * <li>CLOSE: disabled</li>
         * <li>UNCONFIGURED: not configured</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("MonitorStatus")
        public String monitorStatus;

        /**
         * <p>The name of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>testpool</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the address pool. Valid values:</p>
         * <ul>
         * <li>IPV4: IPv4 address</li>
         * <li>IPV6: IPv6 address</li>
         * <li>DOMAIN: domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the address pool was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The timestamp that indicates when the address pool was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool self = new DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setLbaStrategy(String lbaStrategy) {
            this.lbaStrategy = lbaStrategy;
            return this;
        }
        public String getLbaStrategy() {
            return this.lbaStrategy;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setMonitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }
        public String getMonitorConfigId() {
            return this.monitorConfigId;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setMonitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        public java.util.List<DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool> addrPool;

        public static DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools self = new DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools setAddrPool(java.util.List<DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool> addrPool) {
            this.addrPool = addrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool> getAddrPool() {
            return this.addrPool;
        }

    }

}
