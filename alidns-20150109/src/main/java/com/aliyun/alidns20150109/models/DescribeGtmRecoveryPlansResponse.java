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

    public DescribeGtmRecoveryPlansResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmRecoveryPlansResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmRecoveryPlansResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmRecoveryPlansResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmRecoveryPlansResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmRecoveryPlansResponse setRecoveryPlans(DescribeGtmRecoveryPlansResponseRecoveryPlans recoveryPlans) {
        this.recoveryPlans = recoveryPlans;
        return this;
    }
    public DescribeGtmRecoveryPlansResponseRecoveryPlans getRecoveryPlans() {
        return this.recoveryPlans;
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

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setRecoveryPlanId(Long recoveryPlanId) {
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }
        public Long getRecoveryPlanId() {
            return this.recoveryPlanId;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setFaultAddrPoolNum(Integer faultAddrPoolNum) {
            this.faultAddrPoolNum = faultAddrPoolNum;
            return this;
        }
        public Integer getFaultAddrPoolNum() {
            return this.faultAddrPoolNum;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setLastExecuteTime(String lastExecuteTime) {
            this.lastExecuteTime = lastExecuteTime;
            return this;
        }
        public String getLastExecuteTime() {
            return this.lastExecuteTime;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setLastExecuteTimestamp(Long lastExecuteTimestamp) {
            this.lastExecuteTimestamp = lastExecuteTimestamp;
            return this;
        }
        public Long getLastExecuteTimestamp() {
            return this.lastExecuteTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setLastRollbackTime(String lastRollbackTime) {
            this.lastRollbackTime = lastRollbackTime;
            return this;
        }
        public String getLastRollbackTime() {
            return this.lastRollbackTime;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setLastRollbackTimestamp(Long lastRollbackTimestamp) {
            this.lastRollbackTimestamp = lastRollbackTimestamp;
            return this;
        }
        public Long getLastRollbackTimestamp() {
            return this.lastRollbackTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public DescribeGtmRecoveryPlansResponseRecoveryPlans setRecoveryPlan(java.util.List<DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan> recoveryPlan) {
            this.recoveryPlan = recoveryPlan;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlansResponseRecoveryPlansRecoveryPlan> getRecoveryPlan() {
            return this.recoveryPlan;
        }

    }

}
