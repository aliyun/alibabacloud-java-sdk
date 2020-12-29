// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlansResponseBody extends TeaModel {
    @NameInMap("RecoveryPlans")
    public java.util.List<DescribeGtmRecoveryPlansResponseBodyRecoveryPlans> recoveryPlans;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static DescribeGtmRecoveryPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlansResponseBody self = new DescribeGtmRecoveryPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlansResponseBody setRecoveryPlans(java.util.List<DescribeGtmRecoveryPlansResponseBodyRecoveryPlans> recoveryPlans) {
        this.recoveryPlans = recoveryPlans;
        return this;
    }
    public java.util.List<DescribeGtmRecoveryPlansResponseBodyRecoveryPlans> getRecoveryPlans() {
        return this.recoveryPlans;
    }

    public DescribeGtmRecoveryPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmRecoveryPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmRecoveryPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmRecoveryPlansResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmRecoveryPlansResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class DescribeGtmRecoveryPlansResponseBodyRecoveryPlans extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("LastRollbackTimestamp")
        public Long lastRollbackTimestamp;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RecoveryPlanId")
        public Long recoveryPlanId;

        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        @NameInMap("LastExecuteTimestamp")
        public Long lastExecuteTimestamp;

        @NameInMap("LastExecuteTime")
        public String lastExecuteTime;

        @NameInMap("LastRollbackTime")
        public String lastRollbackTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("FaultAddrPoolNum")
        public Integer faultAddrPoolNum;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeGtmRecoveryPlansResponseBodyRecoveryPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlansResponseBodyRecoveryPlans self = new DescribeGtmRecoveryPlansResponseBodyRecoveryPlans();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setLastRollbackTimestamp(Long lastRollbackTimestamp) {
            this.lastRollbackTimestamp = lastRollbackTimestamp;
            return this;
        }
        public Long getLastRollbackTimestamp() {
            return this.lastRollbackTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setRecoveryPlanId(Long recoveryPlanId) {
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }
        public Long getRecoveryPlanId() {
            return this.recoveryPlanId;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setLastExecuteTimestamp(Long lastExecuteTimestamp) {
            this.lastExecuteTimestamp = lastExecuteTimestamp;
            return this;
        }
        public Long getLastExecuteTimestamp() {
            return this.lastExecuteTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setLastExecuteTime(String lastExecuteTime) {
            this.lastExecuteTime = lastExecuteTime;
            return this;
        }
        public String getLastExecuteTime() {
            return this.lastExecuteTime;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setLastRollbackTime(String lastRollbackTime) {
            this.lastRollbackTime = lastRollbackTime;
            return this;
        }
        public String getLastRollbackTime() {
            return this.lastRollbackTime;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setFaultAddrPoolNum(Integer faultAddrPoolNum) {
            this.faultAddrPoolNum = faultAddrPoolNum;
            return this;
        }
        public Integer getFaultAddrPoolNum() {
            return this.faultAddrPoolNum;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
