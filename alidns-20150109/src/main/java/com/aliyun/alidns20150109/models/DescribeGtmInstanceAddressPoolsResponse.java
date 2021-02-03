// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolsResponse extends TeaModel {
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
    public DescribeGtmInstanceAddressPoolsResponseAddrPools addrPools;

    public static DescribeGtmInstanceAddressPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolsResponse self = new DescribeGtmInstanceAddressPoolsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceAddressPoolsResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmInstanceAddressPoolsResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmInstanceAddressPoolsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmInstanceAddressPoolsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmInstanceAddressPoolsResponse setAddrPools(DescribeGtmInstanceAddressPoolsResponseAddrPools addrPools) {
        this.addrPools = addrPools;
        return this;
    }
    public DescribeGtmInstanceAddressPoolsResponseAddrPools getAddrPools() {
        return this.addrPools;
    }

    public static class DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool extends TeaModel {
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

        @NameInMap("MinAvailableAddrNum")
        @Validation(required = true)
        public Integer minAvailableAddrNum;

        @NameInMap("MonitorConfigId")
        @Validation(required = true)
        public String monitorConfigId;

        @NameInMap("MonitorStatus")
        @Validation(required = true)
        public String monitorStatus;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool self = new DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setMinAvailableAddrNum(Integer minAvailableAddrNum) {
            this.minAvailableAddrNum = minAvailableAddrNum;
            return this;
        }
        public Integer getMinAvailableAddrNum() {
            return this.minAvailableAddrNum;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setMonitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }
        public String getMonitorConfigId() {
            return this.monitorConfigId;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setMonitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeGtmInstanceAddressPoolsResponseAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        @Validation(required = true)
        public java.util.List<DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool> addrPool;

        public static DescribeGtmInstanceAddressPoolsResponseAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolsResponseAddrPools self = new DescribeGtmInstanceAddressPoolsResponseAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolsResponseAddrPools setAddrPool(java.util.List<DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool> addrPool) {
            this.addrPool = addrPool;
            return this;
        }
        public java.util.List<DescribeGtmInstanceAddressPoolsResponseAddrPoolsAddrPool> getAddrPool() {
            return this.addrPool;
        }

    }

}
