// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlansResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RecoveryPlans")
    @Validation(required = true)
    public DescribeGtmRecoveryPlansResponseRecoveryPlans recoveryPlans;

    public static DescribeGtmRecoveryPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlansResponse self = new DescribeGtmRecoveryPlansResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan extends TeaModel {
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

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan self = new DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmRecoveryPlansResponseRecoveryPlans extends TeaModel {
        @NameInMap("RecoveryPlan")
        @Validation(required = true)
        public java.util.List<DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan> recoveryPlan;

        public static DescribeGtmRecoveryPlansResponseRecoveryPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlansResponseRecoveryPlans self = new DescribeGtmRecoveryPlansResponseRecoveryPlans();
            return TeaModel.build(map, self);
        }

    }

}
