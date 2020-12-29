// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolsResponseBody extends TeaModel {
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
    public java.util.List<DescribeGtmInstanceAddressPoolsResponseBodyAddrPools> addrPools;

    public static DescribeGtmInstanceAddressPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolsResponseBody self = new DescribeGtmInstanceAddressPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmInstanceAddressPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceAddressPoolsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmInstanceAddressPoolsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmInstanceAddressPoolsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmInstanceAddressPoolsResponseBody setAddrPools(java.util.List<DescribeGtmInstanceAddressPoolsResponseBodyAddrPools> addrPools) {
        this.addrPools = addrPools;
        return this;
    }
    public java.util.List<DescribeGtmInstanceAddressPoolsResponseBodyAddrPools> getAddrPools() {
        return this.addrPools;
    }

    public static class DescribeGtmInstanceAddressPoolsResponseBodyAddrPools extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MonitorConfigId")
        public String monitorConfigId;

        @NameInMap("MinAvailableAddrNum")
        public Integer minAvailableAddrNum;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("MonitorStatus")
        public String monitorStatus;

        @NameInMap("AddrPoolId")
        public String addrPoolId;

        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeGtmInstanceAddressPoolsResponseBodyAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolsResponseBodyAddrPools self = new DescribeGtmInstanceAddressPoolsResponseBodyAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setMonitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }
        public String getMonitorConfigId() {
            return this.monitorConfigId;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setMinAvailableAddrNum(Integer minAvailableAddrNum) {
            this.minAvailableAddrNum = minAvailableAddrNum;
            return this;
        }
        public Integer getMinAvailableAddrNum() {
            return this.minAvailableAddrNum;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setMonitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
