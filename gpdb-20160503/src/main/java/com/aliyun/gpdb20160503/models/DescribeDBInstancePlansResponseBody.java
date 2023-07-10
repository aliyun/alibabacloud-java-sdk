// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePlansResponseBody extends TeaModel {
    /**
     * <p>The error message returned.</p>
     * <br>
     * <p>This parameter is returned only when the operation fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Details of the plans.</p>
     */
    @NameInMap("Items")
    public DescribeDBInstancePlansResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the operation.</p>
     * <br>
     * <p>If the operation is successful, **success** is returned. If the operation fails, this parameter is not returned.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of entries.</p>
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
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The execution information of the plan.</p>
         */
        @NameInMap("PlanConfig")
        public String planConfig;

        /**
         * <p>The description of the plan.</p>
         */
        @NameInMap("PlanDesc")
        public String planDesc;

        /**
         * <p>The end time of the plan. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>>  This parameter is returned only for periodically executed plans.</p>
         */
        @NameInMap("PlanEndDate")
        public String planEndDate;

        /**
         * <p>The ID of the plan.</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The name of the plan.</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The execution mode of the plan. Valid values:</p>
         * <br>
         * <p>*   **Postpone**: The plan is executed later.</p>
         * <p>*   **Regular**: The plan is executed periodically.</p>
         */
        @NameInMap("PlanScheduleType")
        public String planScheduleType;

        /**
         * <p>The start time of the plan. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm*Z format. The time is displayed in UTC.</p>
         * <br>
         * <p>>  This parameter is returned only for periodically executed plans.</p>
         */
        @NameInMap("PlanStartDate")
        public String planStartDate;

        /**
         * <p>The state of the plan. Valid values:</p>
         * <br>
         * <p>*   **active**: The plan is running.</p>
         * <p>*   **cancel**: The plan is canceled.</p>
         * <p>*   **deleted**: The plan is deleted.</p>
         * <p>*   **finished**: The plan execution is complete.</p>
         */
        @NameInMap("PlanStatus")
        public String planStatus;

        /**
         * <p>The type of the plan. Valid values:</p>
         * <br>
         * <p>*   **PauseResume**: pauses and resumes an instance.</p>
         * <p>*   **Resize**: scales an instance.</p>
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
