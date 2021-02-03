// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("AddrPools")
    public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools addrPools;

    public static DescribeDnsGtmInstanceAddressPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceAddressPoolsResponseBody self = new DescribeDnsGtmInstanceAddressPoolsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponseBody setAddrPools(DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools addrPools) {
        this.addrPools = addrPools;
        return this;
    }
    public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPools getAddrPools() {
        return this.addrPools;
    }

    public static class DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("MonitorStatus")
        public String monitorStatus;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AddrPoolId")
        public String addrPoolId;

        @NameInMap("LbaStrategy")
        public String lbaStrategy;

        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("MonitorConfigId")
        public String monitorConfigId;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool self = new DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setMonitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setLbaStrategy(String lbaStrategy) {
            this.lbaStrategy = lbaStrategy;
            return this;
        }
        public String getLbaStrategy() {
            return this.lbaStrategy;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setMonitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }
        public String getMonitorConfigId() {
            return this.monitorConfigId;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
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
