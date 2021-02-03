// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Addrs")
    public DescribeGtmInstanceAddressPoolResponseBodyAddrs addrs;

    @NameInMap("RequestId")
    public String requestId;

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

    @NameInMap("MinAvailableAddrNum")
    public Integer minAvailableAddrNum;

    @NameInMap("MonitorStatus")
    public String monitorStatus;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    public static DescribeGtmInstanceAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolResponseBody self = new DescribeGtmInstanceAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setAddrs(DescribeGtmInstanceAddressPoolResponseBodyAddrs addrs) {
        this.addrs = addrs;
        return this;
    }
    public DescribeGtmInstanceAddressPoolResponseBodyAddrs getAddrs() {
        return this.addrs;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setAddrCount(Integer addrCount) {
        this.addrCount = addrCount;
        return this;
    }
    public Integer getAddrCount() {
        return this.addrCount;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public DescribeGtmInstanceAddressPoolResponseBody setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setMinAvailableAddrNum(Integer minAvailableAddrNum) {
        this.minAvailableAddrNum = minAvailableAddrNum;
        return this;
    }
    public Integer getMinAvailableAddrNum() {
        return this.minAvailableAddrNum;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    public DescribeGtmInstanceAddressPoolResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public static class DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("AlertStatus")
        public String alertStatus;

        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AddrId")
        public Long addrId;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr self = new DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setAddrId(Long addrId) {
            this.addrId = addrId;
            return this;
        }
        public Long getAddrId() {
            return this.addrId;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeGtmInstanceAddressPoolResponseBodyAddrsAddr setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
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
