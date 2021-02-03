// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolResponse extends TeaModel {
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

    @NameInMap("Addrs")
    @Validation(required = true)
    public DescribeGtmInstanceAddressPoolResponseAddrs addrs;

    public static DescribeGtmInstanceAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolResponse self = new DescribeGtmInstanceAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceAddressPoolResponse setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public DescribeGtmInstanceAddressPoolResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmInstanceAddressPoolResponse setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeGtmInstanceAddressPoolResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeGtmInstanceAddressPoolResponse setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeGtmInstanceAddressPoolResponse setAddrCount(Integer addrCount) {
        this.addrCount = addrCount;
        return this;
    }
    public Integer getAddrCount() {
        return this.addrCount;
    }

    public DescribeGtmInstanceAddressPoolResponse setMinAvailableAddrNum(Integer minAvailableAddrNum) {
        this.minAvailableAddrNum = minAvailableAddrNum;
        return this;
    }
    public Integer getMinAvailableAddrNum() {
        return this.minAvailableAddrNum;
    }

    public DescribeGtmInstanceAddressPoolResponse setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeGtmInstanceAddressPoolResponse setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    public DescribeGtmInstanceAddressPoolResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGtmInstanceAddressPoolResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGtmInstanceAddressPoolResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeGtmInstanceAddressPoolResponse setAddrs(DescribeGtmInstanceAddressPoolResponseAddrs addrs) {
        this.addrs = addrs;
        return this;
    }
    public DescribeGtmInstanceAddressPoolResponseAddrs getAddrs() {
        return this.addrs;
    }

    public static class DescribeGtmInstanceAddressPoolResponseAddrsAddr extends TeaModel {
        @NameInMap("AddrId")
        @Validation(required = true)
        public Long addrId;

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

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("LbaWeight")
        @Validation(required = true)
        public Integer lbaWeight;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("AlertStatus")
        @Validation(required = true)
        public String alertStatus;

        public static DescribeGtmInstanceAddressPoolResponseAddrsAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolResponseAddrsAddr self = new DescribeGtmInstanceAddressPoolResponseAddrsAddr();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolResponseAddrsAddr setAddrId(Long addrId) {
            this.addrId = addrId;
            return this;
        }
        public Long getAddrId() {
            return this.addrId;
        }

        public DescribeGtmInstanceAddressPoolResponseAddrsAddr setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmInstanceAddressPoolResponseAddrsAddr setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmInstanceAddressPoolResponseAddrsAddr setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGtmInstanceAddressPoolResponseAddrsAddr setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeGtmInstanceAddressPoolResponseAddrsAddr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeGtmInstanceAddressPoolResponseAddrsAddr setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeGtmInstanceAddressPoolResponseAddrsAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeGtmInstanceAddressPoolResponseAddrsAddr setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
        }

    }

    public static class DescribeGtmInstanceAddressPoolResponseAddrs extends TeaModel {
        @NameInMap("Addr")
        @Validation(required = true)
        public java.util.List<DescribeGtmInstanceAddressPoolResponseAddrsAddr> addr;

        public static DescribeGtmInstanceAddressPoolResponseAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstanceAddressPoolResponseAddrs self = new DescribeGtmInstanceAddressPoolResponseAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstanceAddressPoolResponseAddrs setAddr(java.util.List<DescribeGtmInstanceAddressPoolResponseAddrsAddr> addr) {
            this.addr = addr;
            return this;
        }
        public java.util.List<DescribeGtmInstanceAddressPoolResponseAddrsAddr> getAddr() {
            return this.addr;
        }

    }

}
