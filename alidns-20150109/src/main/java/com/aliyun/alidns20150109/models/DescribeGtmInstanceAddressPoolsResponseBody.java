// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolsResponseBody extends TeaModel {
    /**
     * <p>The returned list of address pools of the GTM instance.</p>
     */
    @NameInMap("AddrPools")
    public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools addrPools;

    /**
     * <p>The number of the page returned.</p>
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
     * <p>20</p>
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
     * <p>2</p>
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

    public static DescribeGtmInstanceAddressPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolsResponseBody self = new DescribeGtmInstanceAddressPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolsResponseBody setAddrPools(DescribeGtmInstanceAddressPoolsResponseBodyAddrPools addrPools) {
        this.addrPools = addrPools;
        return this;
    }
    public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools getAddrPools() {
        return this.addrPools;
    }

    public DescribeGtmInstanceAddressPoolsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeGtmInstanceAddressPoolsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmInstanceAddressPoolsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool extends TeaModel {
        /**
         * <p>The number of addresses in the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AddrCount")
        public Integer addrCount;

        /**
         * <p>The ID of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abc</p>
         */
        @NameInMap("AddrPoolId")
        public String addrPoolId;

        /**
         * <p>The time when this address pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The minimum number of available addresses in the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinAvailableAddrNum")
        public Integer minAvailableAddrNum;

        /**
         * <p>The health check ID of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>100abc</p>
         */
        @NameInMap("MonitorConfigId")
        public String monitorConfigId;

        /**
         * <p>Indicates whether health check was enabled for the address pool. Valid values:</p>
         * <ul>
         * <li><strong>OPEN</strong>: Enabled</li>
         * <li><strong>CLOSE</strong>: Disabled</li>
         * <li><strong>UNCONFIGURED</strong>: Not configured</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPEN</p>
         */
        @NameInMap("MonitorStatus")
        public String monitorStatus;

        /**
         * <p>The name of the address pool.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The availability status of the address pool. Valid values:</p>
         * <ul>
         * <li><strong>AVAILABLE</strong>: Available</li>
         * <li><strong>NOT_AVAILABLE</strong>: Unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the address pool. Valid values:</p>
         * <ul>
         * <li><strong>IP</strong>: IP address</li>
         * <li><strong>DOMAIN</strong>: Domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The last time when the address pool was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>A timestamp that indicates the last time the address pool was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool self = new DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setMinAvailableAddrNum(Integer minAvailableAddrNum) {
            this.minAvailableAddrNum = minAvailableAddrNum;
            return this;
        }
        public Integer getMinAvailableAddrNum() {
            return this.minAvailableAddrNum;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setMonitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }
        public String getMonitorConfigId() {
            return this.monitorConfigId;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setMonitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class DescribeGtmInstanceAddressPoolsResponseBodyAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        public java.util.List<DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool> addrPool;

        public static DescribeGtmInstanceAddressPoolsResponseBodyAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolsResponseBodyAddrPools self = new DescribeGtmInstanceAddressPoolsResponseBodyAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolsResponseBodyAddrPools setAddrPool(java.util.List<DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool> addrPool) {
            this.addrPool = addrPool;
            return this;
        }
        public java.util.List<DescribeGtmInstanceAddressPoolsResponseBodyAddrPoolsAddrPool> getAddrPool() {
            return this.addrPool;
        }

    }

}
