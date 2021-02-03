// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("AddrPools")
    @Validation(required = true)
    public DescribeDnsGtmInstanceAddressPoolsResponseAddrPools addrPools;

    public static DescribeDnsGtmInstanceAddressPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceAddressPoolsResponse self = new DescribeDnsGtmInstanceAddressPoolsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse setAddrPools(DescribeDnsGtmInstanceAddressPoolsResponseAddrPools addrPools) {
        this.addrPools = addrPools;
        return this;
    }
    public DescribeDnsGtmInstanceAddressPoolsResponseAddrPools getAddrPools() {
        return this.addrPools;
    }

    public static class DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool extends TeaModel {
        @NameInMap("AddrPoolId")
        @Validation(required = true)
        public String addrPoolId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("UpdateTimestamp")
        @Validation(required = true)
        public Long updateTimestamp;

        @NameInMap("AddrCount")
        @Validation(required = true)
        public Integer addrCount;

        @NameInMap("MonitorConfigId")
        @Validation(required = true)
        public String monitorConfigId;

        @NameInMap("MonitorStatus")
        @Validation(required = true)
        public String monitorStatus;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("LbaStrategy")
        @Validation(required = true)
        public String lbaStrategy;

        public static DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool self = new DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setMonitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }
        public String getMonitorConfigId() {
            return this.monitorConfigId;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setMonitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setLbaStrategy(String lbaStrategy) {
            this.lbaStrategy = lbaStrategy;
            return this;
        }
        public String getLbaStrategy() {
            return this.lbaStrategy;
        }

    }

    public static class DescribeDnsGtmInstanceAddressPoolsResponseAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool> addrPool;

        public static DescribeDnsGtmInstanceAddressPoolsResponseAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolsResponseAddrPools self = new DescribeDnsGtmInstanceAddressPoolsResponseAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseAddrPools setAddrPool(java.util.List<DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool> addrPool) {
            this.addrPool = addrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmInstanceAddressPoolsResponseAddrPoolsAddrPool> getAddrPool() {
            return this.addrPool;
        }

    }

}
