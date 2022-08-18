// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("FaultAddrPoolNum")
    public Integer faultAddrPoolNum;

    @NameInMap("FaultAddrPools")
    public DescribeGtmRecoveryPlanResponseBodyFaultAddrPools faultAddrPools;

    @NameInMap("LastExecuteTime")
    public String lastExecuteTime;

    @NameInMap("LastExecuteTimestamp")
    public Long lastExecuteTimestamp;

    @NameInMap("LastRollbackTime")
    public String lastRollbackTime;

    @NameInMap("LastRollbackTimestamp")
    public Long lastRollbackTimestamp;

    @NameInMap("Name")
    public String name;

    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeGtmRecoveryPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanResponseBody self = new DescribeGtmRecoveryPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlanResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmRecoveryPlanResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeGtmRecoveryPlanResponseBody setFaultAddrPoolNum(Integer faultAddrPoolNum) {
        this.faultAddrPoolNum = faultAddrPoolNum;
        return this;
    }
    public Integer getFaultAddrPoolNum() {
        return this.faultAddrPoolNum;
    }

    public DescribeGtmRecoveryPlanResponseBody setFaultAddrPools(DescribeGtmRecoveryPlanResponseBodyFaultAddrPools faultAddrPools) {
        this.faultAddrPools = faultAddrPools;
        return this;
    }
    public DescribeGtmRecoveryPlanResponseBodyFaultAddrPools getFaultAddrPools() {
        return this.faultAddrPools;
    }

    public DescribeGtmRecoveryPlanResponseBody setLastExecuteTime(String lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
        return this;
    }
    public String getLastExecuteTime() {
        return this.lastExecuteTime;
    }

    public DescribeGtmRecoveryPlanResponseBody setLastExecuteTimestamp(Long lastExecuteTimestamp) {
        this.lastExecuteTimestamp = lastExecuteTimestamp;
        return this;
    }
    public Long getLastExecuteTimestamp() {
        return this.lastExecuteTimestamp;
    }

    public DescribeGtmRecoveryPlanResponseBody setLastRollbackTime(String lastRollbackTime) {
        this.lastRollbackTime = lastRollbackTime;
        return this;
    }
    public String getLastRollbackTime() {
        return this.lastRollbackTime;
    }

    public DescribeGtmRecoveryPlanResponseBody setLastRollbackTimestamp(Long lastRollbackTimestamp) {
        this.lastRollbackTimestamp = lastRollbackTimestamp;
        return this;
    }
    public Long getLastRollbackTimestamp() {
        return this.lastRollbackTimestamp;
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

    public DescribeGtmRecoveryPlanResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeGtmRecoveryPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmRecoveryPlanResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
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

    public static class DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Value")
        public String value;

        public static DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr self = new DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrs extends TeaModel {
        @NameInMap("Addr")
        public java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr> addr;

        public static DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrs self = new DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrs setAddr(java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr> addr) {
            this.addr = addr;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrsAddr> getAddr() {
            return this.addr;
        }

    }

    public static class DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool extends TeaModel {
        @NameInMap("AddrPoolId")
        public String addrPoolId;

        @NameInMap("AddrPoolName")
        public String addrPoolName;

        @NameInMap("Addrs")
        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrs addrs;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool self = new DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool setAddrPoolName(String addrPoolName) {
            this.addrPoolName = addrPoolName;
            return this;
        }
        public String getAddrPoolName() {
            return this.addrPoolName;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool setAddrs(DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrs addrs) {
            this.addrs = addrs;
            return this;
        }
        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPoolAddrs getAddrs() {
            return this.addrs;
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeGtmRecoveryPlanResponseBodyFaultAddrPools extends TeaModel {
        @NameInMap("FaultAddrPool")
        public java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool> faultAddrPool;

        public static DescribeGtmRecoveryPlanResponseBodyFaultAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseBodyFaultAddrPools self = new DescribeGtmRecoveryPlanResponseBodyFaultAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseBodyFaultAddrPools setFaultAddrPool(java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool> faultAddrPool) {
            this.faultAddrPool = faultAddrPool;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanResponseBodyFaultAddrPoolsFaultAddrPool> getFaultAddrPool() {
            return this.faultAddrPool;
        }

    }

}
