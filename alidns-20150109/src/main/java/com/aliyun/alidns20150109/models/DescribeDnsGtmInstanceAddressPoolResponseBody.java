// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolResponseBody extends TeaModel {
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
     * <p>testpool1</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The addresses in the address pool.</p>
     */
    @NameInMap("Addrs")
    public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs addrs;

    /**
     * <p>The time when the address pool was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-28T13:08Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The timestamp that indicates the time when the address pool was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The load balancing policy for the address pool. Valid values:</p>
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
     * <p>The ID of the health check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>Indicates the status of the health check. Valid values:</p>
     * <ul>
     * <li>OPEN: The health check is enabled.</li>
     * <li>CLOSE: The health check is disabled.</li>
     * <li>UNCONFIGURED: The health check is not configured.</li>
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
     * <p>test</p>
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
     * <p>The time when the address pool was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-28T13:08Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The timestamp that indicates the time when the address pool was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeDnsGtmInstanceAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceAddressPoolResponseBody self = new DescribeDnsGtmInstanceAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setAddrCount(Integer addrCount) {
        this.addrCount = addrCount;
        return this;
    }
    public Integer getAddrCount() {
        return this.addrCount;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setAddrs(DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs addrs) {
        this.addrs = addrs;
        return this;
    }
    public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs getAddrs() {
        return this.addrs;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr extends TeaModel {
        /**
         * <p>The address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The status of the last health check on the address. Valid values:</p>
         * <ul>
         * <li>OK: No active alerts are triggered.</li>
         * <li>ALERT: Alerts are triggered based on the alert rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("AlertStatus")
        public String alertStatus;

        /**
         * <p>The source region of the address.</p>
         * <ul>
         * <li>lineCode: the line code of the source region of the address. This parameter is deprecated, and lineCodes prevails.</li>
         * <li>lineName: the line name of the source region of the address. This parameter is deprecated.</li>
         * <li>lineCodes: the line codes of the source regions of the address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;lineCode&quot;:&quot;aliyun_r_cn-zhangjiakou&quot;, &quot;lineName&quot;: &quot;Alibaba Cloud_China (Zhangjiakou)&quot;, &quot;lineCodes&quot;: [&quot;aliyun_r_cn-zhangjiakou&quot;]</p>
         */
        @NameInMap("AttributeInfo")
        public String attributeInfo;

        /**
         * <p>The time when the address was added into the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp that indicates the time when the address was added into the address pool.</p>
         * 
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
         * <li>SMART: smart return</li>
         * <li>ONLINE: always online</li>
         * <li>OFFLINE: always offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The description of the address.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The time when the address was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The timestamp that indicates the time when the address was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr self = new DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs extends TeaModel {
        @NameInMap("Addr")
        public java.util.List<DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr> addr;

        public static DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs self = new DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs setAddr(java.util.List<DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr> addr) {
            this.addr = addr;
            return this;
        }
        public java.util.List<DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr> getAddr() {
            return this.addr;
        }

    }

}
