// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlansResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The details about the queried disaster recovery plans.</p>
     */
    @NameInMap("RecoveryPlans")
    public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans recoveryPlans;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2BA072CF-CA21-4A34-B6C2-227BE2C58079</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeGtmRecoveryPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlansResponseBody self = new DescribeGtmRecoveryPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmRecoveryPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmRecoveryPlansResponseBody setRecoveryPlans(DescribeGtmRecoveryPlansResponseBodyRecoveryPlans recoveryPlans) {
        this.recoveryPlans = recoveryPlans;
        return this;
    }
    public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans getRecoveryPlans() {
        return this.recoveryPlans;
    }

    public DescribeGtmRecoveryPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmRecoveryPlansResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmRecoveryPlansResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan extends TeaModel {
        /**
         * <p>The time when the disaster recovery plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-11T06:45Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The UNIX timestamp that indicates when the disaster recovery plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1565499867000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The number of faulty address pools.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FaultAddrPoolNum")
        public Integer faultAddrPoolNum;

        /**
         * <p>The last time when the disaster recovery plan was executed.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-11T06:44Z</p>
         */
        @NameInMap("LastExecuteTime")
        public String lastExecuteTime;

        /**
         * <p>The UNIX timestamp that indicates the last time when the disaster recovery plan was executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1565505898000</p>
         */
        @NameInMap("LastExecuteTimestamp")
        public Long lastExecuteTimestamp;

        /**
         * <p>The last time when the disaster recovery plan was rolled back.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-11T06:45Z</p>
         */
        @NameInMap("LastRollbackTime")
        public String lastRollbackTime;

        /**
         * <p>The UNIX timestamp that indicates the last time when the disaster recovery plan was rolled back.</p>
         * 
         * <strong>example:</strong>
         * <p>1565505919000</p>
         */
        @NameInMap("LastRollbackTimestamp")
        public Long lastRollbackTimestamp;

        /**
         * <p>The name of the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>name-example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("RecoveryPlanId")
        public Long recoveryPlanId;

        /**
         * <p>The remarks about the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>remark-example</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the disaster recovery plan. Valid values:</p>
         * <ul>
         * <li><strong>UNEXECUTED</strong>: The plan is not executed.</li>
         * <li><strong>EXECUTED</strong>: The plan is executed.</li>
         * <li><strong>ROLLED_BACK</strong>: The plan is rolled back.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNEXECUTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The last time when the disaster recovery plan was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-11T06:45Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The UNIX timestamp that indicates the last time when the disaster recovery plan was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1565505919000</p>
         */
        @NameInMap("UpdateTimestamp")
        public Long updateTimestamp;

        public static DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan self = new DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setFaultAddrPoolNum(Integer faultAddrPoolNum) {
            this.faultAddrPoolNum = faultAddrPoolNum;
            return this;
        }
        public Integer getFaultAddrPoolNum() {
            return this.faultAddrPoolNum;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setLastExecuteTime(String lastExecuteTime) {
            this.lastExecuteTime = lastExecuteTime;
            return this;
        }
        public String getLastExecuteTime() {
            return this.lastExecuteTime;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setLastExecuteTimestamp(Long lastExecuteTimestamp) {
            this.lastExecuteTimestamp = lastExecuteTimestamp;
            return this;
        }
        public Long getLastExecuteTimestamp() {
            return this.lastExecuteTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setLastRollbackTime(String lastRollbackTime) {
            this.lastRollbackTime = lastRollbackTime;
            return this;
        }
        public String getLastRollbackTime() {
            return this.lastRollbackTime;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setLastRollbackTimestamp(Long lastRollbackTimestamp) {
            this.lastRollbackTimestamp = lastRollbackTimestamp;
            return this;
        }
        public Long getLastRollbackTimestamp() {
            return this.lastRollbackTimestamp;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setRecoveryPlanId(Long recoveryPlanId) {
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }
        public Long getRecoveryPlanId() {
            return this.recoveryPlanId;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class DescribeGtmRecoveryPlansResponseBodyRecoveryPlans extends TeaModel {
        @NameInMap("RecoveryPlan")
        public java.util.List<DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan> recoveryPlan;

        public static DescribeGtmRecoveryPlansResponseBodyRecoveryPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlansResponseBodyRecoveryPlans self = new DescribeGtmRecoveryPlansResponseBodyRecoveryPlans();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlansResponseBodyRecoveryPlans setRecoveryPlan(java.util.List<DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan> recoveryPlan) {
            this.recoveryPlan = recoveryPlan;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan> getRecoveryPlan() {
            return this.recoveryPlan;
        }

    }

}
