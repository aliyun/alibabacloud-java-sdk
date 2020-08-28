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

    }

    public static class DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs extends TeaModel {
        @NameInMap("Addr")
        @Validation(required = true)
        public java.util.List<DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrsAddr> addr;

        public static DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs self = new DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPoolAddrs();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeGtmRecoveryPlanResponseFaultAddrPools extends TeaModel {
        @NameInMap("FaultAddrPool")
        @Validation(required = true)
        public java.util.List<DescribeGtmRecoveryPlanResponseFaultAddrPoolsFaultAddrPool> faultAddrPool;

        public static DescribeGtmRecoveryPlanResponseFaultAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanResponseFaultAddrPools self = new DescribeGtmRecoveryPlanResponseFaultAddrPools();
            return TeaModel.build(map, self);
        }

    }

}
