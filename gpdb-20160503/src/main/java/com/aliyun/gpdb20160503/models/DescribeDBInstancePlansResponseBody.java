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
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("PlanConfig")
        public String planConfig;

        @NameInMap("PlanDesc")
        public String planDesc;

        @NameInMap("PlanEndDate")
        public String planEndDate;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("PlanName")
        public String planName;

        @NameInMap("PlanScheduleType")
        public String planScheduleType;

        @NameInMap("PlanStartDate")
        public String planStartDate;

        @NameInMap("PlanStatus")
        public String planStatus;

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
