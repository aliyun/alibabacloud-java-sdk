// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolResponseBody extends TeaModel {
    @NameInMap("Addrs")
    public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs addrs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("AddrCount")
    public Integer addrCount;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("AddrPoolId")
    public String addrPoolId;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    @NameInMap("MonitorStatus")
    public String monitorStatus;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    public static DescribeDnsGtmInstanceAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceAddressPoolResponseBody self = new DescribeDnsGtmInstanceAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setAddrs(DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs addrs) {
        this.addrs = addrs;
        return this;
    }
    public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrs getAddrs() {
        return this.addrs;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setAddrCount(Integer addrCount) {
        this.addrCount = addrCount;
        return this;
    }
    public Integer getAddrCount() {
        return this.addrCount;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public DescribeDnsGtmInstanceAddressPoolResponseBody setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DescribeDnsGtmInstanceAddressPoolResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
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

    public DescribeDnsGtmInstanceAddressPoolResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public static class DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr extends TeaModel {
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("AttributeInfo")
        public String attributeInfo;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("AlertStatus")
        public String alertStatus;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Addr")
        public String addr;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr self = new DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBodyAddrsAddr setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
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
