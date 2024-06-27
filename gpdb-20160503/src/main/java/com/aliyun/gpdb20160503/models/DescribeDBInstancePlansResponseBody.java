// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePlansResponseBody extends TeaModel {
    /**
     * <p>The error message.</p>
     * <p>This parameter is returned only if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstancePlansResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34b32a0a-08ef-4a87-b6be-cdd988888888</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <p>If the request was successful, <strong>success</strong> is returned. If the request failed, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBInstancePlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePlansResponseBody self = new DescribeDBInstancePlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePlansResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeDBInstancePlansResponseBody setItems(DescribeDBInstancePlansResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeDBInstancePlansResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeDBInstancePlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstancePlansResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBInstancePlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancePlansResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDBInstancePlansResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBInstancePlansResponseBodyItemsPlanList extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The execution information of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pause&quot;:{&quot;planCronTime&quot;:&quot;0 22 * * 5&quot;},&quot;resume&quot;:{&quot;planCronTime&quot;:&quot;0 23 * * 5&quot;}}</p>
         */
        @NameInMap("PlanConfig")
        public String planConfig;

        /**
         * <p>The description of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test plan</p>
         */
        @NameInMap("PlanDesc")
        public String planDesc;

        /**
         * <p>The end time of the plan. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> This parameter is returned only for periodically executed plans.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-04-17T23:00Z</p>
         */
        @NameInMap("PlanEndDate")
        public String planEndDate;

        /**
         * <p>The ID of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The name of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>test-plan</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The execution mode of the plan. Valid values:</p>
         * <ul>
         * <li><strong>Postpone</strong>: The plan is executed later.</li>
         * <li><strong>Regular</strong>: The plan is executed periodically.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Regular</p>
         */
        @NameInMap("PlanScheduleType")
        public String planScheduleType;

        /**
         * <p>The start time of the plan. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p> This parameter is returned only for periodically executed plans.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-04-17T23:00Z</p>
         */
        @NameInMap("PlanStartDate")
        public String planStartDate;

        /**
         * <p>The state of the plan. Valid values:</p>
         * <ul>
         * <li><strong>active</strong>: The plan is running.</li>
         * <li><strong>cancel</strong>: The plan is canceled.</li>
         * <li><strong>deleted</strong>: The plan is deleted.</li>
         * <li><strong>finished</strong>: The plan execution is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("PlanStatus")
        public String planStatus;

        /**
         * <p>The type of the plan. Valid values:</p>
         * <ul>
         * <li><strong>PauseResume</strong>: pauses and resumes an instance.</li>
         * <li><strong>Resize</strong>: scales an instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PauseResume</p>
         */
        @NameInMap("PlanType")
        public String planType;

        public static DescribeDBInstancePlansResponseBodyItemsPlanList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePlansResponseBodyItemsPlanList self = new DescribeDBInstancePlansResponseBodyItemsPlanList();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setPlanConfig(String planConfig) {
            this.planConfig = planConfig;
            return this;
        }
        public String getPlanConfig() {
            return this.planConfig;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setPlanDesc(String planDesc) {
            this.planDesc = planDesc;
            return this;
        }
        public String getPlanDesc() {
            return this.planDesc;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setPlanEndDate(String planEndDate) {
            this.planEndDate = planEndDate;
            return this;
        }
        public String getPlanEndDate() {
            return this.planEndDate;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setPlanScheduleType(String planScheduleType) {
            this.planScheduleType = planScheduleType;
            return this;
        }
        public String getPlanScheduleType() {
            return this.planScheduleType;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setPlanStartDate(String planStartDate) {
            this.planStartDate = planStartDate;
            return this;
        }
        public String getPlanStartDate() {
            return this.planStartDate;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setPlanStatus(String planStatus) {
            this.planStatus = planStatus;
            return this;
        }
        public String getPlanStatus() {
            return this.planStatus;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlanList setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

    }

    public static class DescribeDBInstancePlansResponseBodyItems extends TeaModel {
        @NameInMap("PlanList")
        public java.util.List<DescribeDBInstancePlansResponseBodyItemsPlanList> planList;

        public static DescribeDBInstancePlansResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePlansResponseBodyItems self = new DescribeDBInstancePlansResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePlansResponseBodyItems setPlanList(java.util.List<DescribeDBInstancePlansResponseBodyItemsPlanList> planList) {
            this.planList = planList;
            return this;
        }
        public java.util.List<DescribeDBInstancePlansResponseBodyItemsPlanList> getPlanList() {
            return this.planList;
        }

    }

}
