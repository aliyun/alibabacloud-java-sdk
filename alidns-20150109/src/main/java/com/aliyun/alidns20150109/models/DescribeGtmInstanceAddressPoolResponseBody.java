// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolResponseBody extends TeaModel {
    /**
     * <p>The number of addresses in the address pool queried.</p>
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
     * <p>The addresses in the address pool.</p>
     */
    @NameInMap("Addrs")
    public DescribeGtmInstanceAddressPoolResponseBodyAddrs addrs;

    /**
     * <p>The time when the address pool was created.</p>
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static DescribeGtmInstanceAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolResponseBody self = new DescribeGtmInstanceAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolResponseBody setAddrCount(Integer addrCount) {
        this.addrCount = addrCount;
        return this;
    }
    public Integer getAddrCount() {
        return this.addrCount;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setAddrs(DescribeGtmInstanceAddressPoolResponseBodyAddrs addrs) {
        this.addrs = addrs;
        return this;
    }
    public DescribeGtmInstanceAddressPoolResponseBodyAddrs getAddrs() {
        return this.addrs;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setMinAvailableAddrNum(Integer minAvailableAddrNum) {
        this.minAvailableAddrNum = minAvailableAddrNum;
        return this;
    }
    public Integer getMinAvailableAddrNum() {
        return this.minAvailableAddrNum;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr extends TeaModel {
        /**
         * <p>The ID of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AddrId")
        public Long addrId;

        /**
         * <p>Indicates whether health check was enabled for the address. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong>: Normal</li>
         * <li><strong>ALERT</strong>: Alert</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("AlertStatus")
        public String alertStatus;

        /**
         * <p>The time when the address pool was created.</p>
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
         * <p>The weight of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The mode of the address. Valid values:</p>
         * <ul>
         * <li><strong>SMART</strong>: Intelligent return</li>
         * <li><strong>ONLINE</strong>: Always online</li>
         * <li><strong>OFFLINE</strong>: Always offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SMART</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The last time when the address was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>A timestamp that indicates the last time when the address was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        /**
         * <p>The address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr self = new DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setAddrId(Long addrId) {
            this.addrId = addrId;
            return this;
        }
        public Long getAddrId() {
            return this.addrId;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeGtmInstanceAddressPoolResponseBodyAddrs extends TeaModel {
        @NameInMap("Addr")
        public java.util.List<DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr> addr;

        public static DescribeGtmInstanceAddressPoolResponseBodyAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolResponseBodyAddrs self = new DescribeGtmInstanceAddressPoolResponseBodyAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrs setAddr(java.util.List<DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr> addr) {
            this.addr = addr;
            return this;
        }
        public java.util.List<DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr> getAddr() {
            return this.addr;
        }

    }

}
