// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceAddressPoolResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("Addrs")
    @Validation(required = true)
    public DescribeDnsGtmInstanceAddressPoolResponseAddrs addrs;

    public static DescribeDnsGtmInstanceAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceAddressPoolResponse self = new DescribeDnsGtmInstanceAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setAddrCount(Integer addrCount) {
        this.addrCount = addrCount;
        return this;
    }
    public Integer getAddrCount() {
        return this.addrCount;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public DescribeDnsGtmInstanceAddressPoolResponse setAddrs(DescribeDnsGtmInstanceAddressPoolResponseAddrs addrs) {
        this.addrs = addrs;
        return this;
    }
    public DescribeDnsGtmInstanceAddressPoolResponseAddrs getAddrs() {
        return this.addrs;
    }

    public static class DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr extends TeaModel {
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

        @NameInMap("Addr")
        @Validation(required = true)
        public String addr;

        @NameInMap("LbaWeight")
        @Validation(required = true)
        public Integer lbaWeight;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("AlertStatus")
        @Validation(required = true)
        public String alertStatus;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("AttributeInfo")
        @Validation(required = true)
        public String attributeInfo;

        public static DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr self = new DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr setAttributeInfo(String attributeInfo) {
            this.attributeInfo = attributeInfo;
            return this;
        }
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

    }

    public static class DescribeDnsGtmInstanceAddressPoolResponseAddrs extends TeaModel {
        @NameInMap("Addr")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr> addr;

        public static DescribeDnsGtmInstanceAddressPoolResponseAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmInstanceAddressPoolResponseAddrs self = new DescribeDnsGtmInstanceAddressPoolResponseAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmInstanceAddressPoolResponseAddrs setAddr(java.util.List<DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr> addr) {
            this.addr = addr;
            return this;
        }
        public java.util.List<DescribeDnsGtmInstanceAddressPoolResponseAddrsAddr> getAddr() {
            return this.addr;
        }

    }

}
