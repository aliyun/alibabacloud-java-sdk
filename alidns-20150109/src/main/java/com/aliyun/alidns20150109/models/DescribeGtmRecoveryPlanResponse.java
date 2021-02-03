// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecoveryPlanId")
    @Validation(required = true)
    public Long recoveryPlanId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Remark")
    @Validation(required = true)
    public String remark;

    @NameInMap("FaultAddrPoolNum")
    @Validation(required = true)
    public Integer faultAddrPoolNum;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("LastExecuteTime")
    @Validation(required = true)
    public String lastExecuteTime;

    @NameInMap("LastExecuteTimestamp")
    @Validation(required = true)
    public Long lastExecuteTimestamp;

    @NameInMap("LastRollbackTime")
    @Validation(required = true)
    public String lastRollbackTime;

    @NameInMap("LastRollbackTimestamp")
    @Validation(required = true)
    public Long lastRollbackTimestamp;

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

    @NameInMap("FaultAddrPools")
    @Validation(required = true)
    public DescribeGtmRecoveryPlanResponseFaultAddrPools faultAddrPools;

    public static DescribeGtmRecoveryPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanResponse self = new DescribeGtmRecoveryPlanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlanResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmRecoveryPlanResponse setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public DescribeGtmRecoveryPlanResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeGtmRecoveryPlanResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeGtmRecoveryPlanResponse setFaultAddrPoolNum(Integer faultAddrPoolNum) {
        this.faultAddrPoolNum = faultAddrPoolNum;
        return this;
    }
    public Integer getFaultAddrPoolNum() {
        return this.faultAddrPoolNum;
    }

    public DescribeGtmRecoveryPlanResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGtmRecoveryPlanResponse setLastExecuteTime(String lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
        return this;
    }
    public String getLastExecuteTime() {
        return this.lastExecuteTime;
    }

    public DescribeGtmRecoveryPlanResponse setLastExecuteTimestamp(Long lastExecuteTimestamp) {
        this.lastExecuteTimestamp = lastExecuteTimestamp;
        return this;
    }
    public Long getLastExecuteTimestamp() {
        return this.lastExecuteTimestamp;
    }

    public DescribeGtmRecoveryPlanResponse setLastRollbackTime(String lastRollbackTime) {
        this.lastRollbackTime = lastRollbackTime;
        return this;
    }
    public String getLastRollbackTime() {
        return this.lastRollbackTime;
    }

    public DescribeGtmRecoveryPlanResponse setLastRollbackTimestamp(Long lastRollbackTimestamp) {
        this.lastRollbackTimestamp = lastRollbackTimestamp;
        return this;
    }
    public Long getLastRollbackTimestamp() {
        return this.lastRollbackTimestamp;
    }

    public DescribeGtmRecoveryPlanResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmRecoveryPlanResponse setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeGtmRecoveryPlanResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeGtmRecoveryPlanResponse setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeGtmRecoveryPlanResponse setFaultAddrPools(DescribeGtmRecoveryPlanResponseFaultAddrPools faultAddrPools) {
        this.faultAddrPools = faultAddrPools;
        return this;
    }
    public DescribeGtmRecoveryPlanResponseFaultAddrPools getFaultAddrPools() {
        return this.faultAddrPools;
    }

    public static class DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr self = new DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs extends TeaModel {
        @NameInMap("Addr")
        @Validation(required = true)
        public java.util.List<DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr> addr;

        public static DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs self = new DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs setAddr(java.util.List<DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr> addr) {
            this.addr = addr;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr> getAddr() {
            return this.addr;
        }

    }

    public static class DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool extends TeaModel {
        @NameInMap("AddrPoolId")
        @Validation(required = true)
        public String addrPoolId;

        @NameInMap("AddrPoolName")
        @Validation(required = true)
        public String addrPoolName;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Addrs")
        @Validation(required = true)
        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs addrs;

        public static DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool self = new DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool setAddrPoolName(String addrPoolName) {
            this.addrPoolName = addrPoolName;
            return this;
        }
        public String getAddrPoolName() {
            return this.addrPoolName;
        }

        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool setAddrs(DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs addrs) {
            this.addrs = addrs;
            return this;
        }
        public DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs getAddrs() {
            return this.addrs;
        }

    }

    public static class DescribeGtmRecoveryPlanResponseFaultAddrPools extends TeaModel {
        @NameInMap("FaultAddrPool")
        @Validation(required = true)
        public java.util.List<DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool> faultAddrPool;

        public static DescribeGtmRecoveryPlanResponseFaultAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseFaultAddrPools self = new DescribeGtmRecoveryPlanResponseFaultAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanResponseFaultAddrPools setFaultAddrPool(java.util.List<DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool> faultAddrPool) {
            this.faultAddrPool = faultAddrPool;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool> getFaultAddrPool() {
            return this.faultAddrPool;
        }

    }

}
