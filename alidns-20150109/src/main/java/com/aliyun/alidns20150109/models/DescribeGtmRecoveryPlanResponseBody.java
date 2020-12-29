// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("LastRollbackTime")
    public String lastRollbackTime;

    @NameInMap("FaultAddrPoolNum")
    public Integer faultAddrPoolNum;

    @NameInMap("FaultAddrPools")
    public java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPools> faultAddrPools;

    @NameInMap("LastExecuteTime")
    public String lastExecuteTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("LastExecuteTimestamp")
    public Long lastExecuteTimestamp;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Name")
    public String name;

    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    @NameInMap("LastRollbackTimestamp")
    public Long lastRollbackTimestamp;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    public static DescribeGtmRecoveryPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanResponseBody self = new DescribeGtmRecoveryPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGtmRecoveryPlanResponseBody setLastRollbackTime(String lastRollbackTime) {
        this.lastRollbackTime = lastRollbackTime;
        return this;
    }
    public String getLastRollbackTime() {
        return this.lastRollbackTime;
    }

    public DescribeGtmRecoveryPlanResponseBody setFaultAddrPoolNum(Integer faultAddrPoolNum) {
        this.faultAddrPoolNum = faultAddrPoolNum;
        return this;
    }
    public Integer getFaultAddrPoolNum() {
        return this.faultAddrPoolNum;
    }

    public DescribeGtmRecoveryPlanResponseBody setFaultAddrPools(java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPools> faultAddrPools) {
        this.faultAddrPools = faultAddrPools;
        return this;
    }
    public java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPools> getFaultAddrPools() {
        return this.faultAddrPools;
    }

    public DescribeGtmRecoveryPlanResponseBody setLastExecuteTime(String lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
        return this;
    }
    public String getLastExecuteTime() {
        return this.lastExecuteTime;
    }

    public DescribeGtmRecoveryPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmRecoveryPlanResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmRecoveryPlanResponseBody setLastExecuteTimestamp(Long lastExecuteTimestamp) {
        this.lastExecuteTimestamp = lastExecuteTimestamp;
        return this;
    }
    public Long getLastExecuteTimestamp() {
        return this.lastExecuteTimestamp;
    }

    public DescribeGtmRecoveryPlanResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeGtmRecoveryPlanResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGtmRecoveryPlanResponseBody setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public DescribeGtmRecoveryPlanResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeGtmRecoveryPlanResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeGtmRecoveryPlanResponseBody setLastRollbackTimestamp(Long lastRollbackTimestamp) {
        this.lastRollbackTimestamp = lastRollbackTimestamp;
        return this;
    }
    public Long getLastRollbackTimestamp() {
        return this.lastRollbackTimestamp;
    }

    public DescribeGtmRecoveryPlanResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public static class DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Id")
        public Long id;

        public static DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs self = new DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DescribeGtmRecoveryPlanResponseBodyFaultAddrPools extends TeaModel {
        @NameInMap("Addrs")
        public java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs> addrs;

        @NameInMap("AddrPoolId")
        public String addrPoolId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("AddrPoolName")
        public String addrPoolName;

        public static DescribeGtmRecoveryPlanResponseBodyFaultAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseBodyFaultAddrPools self = new DescribeGtmRecoveryPlanResponseBodyFaultAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPools setAddrs(java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs> addrs) {
            this.addrs = addrs;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsAddrs> getAddrs() {
            return this.addrs;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPools setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPools setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPools setAddrPoolName(String addrPoolName) {
            this.addrPoolName = addrPoolName;
            return this;
        }
        public String getAddrPoolName() {
            return this.addrPoolName;
        }

    }

}
