// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePlansResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Items")
    public DescribeDBInstancePlansResponseBodyItems items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

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

    public static class DescribeDBInstancePlansResponseBodyItemsPlan extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("PlanConfig")
        public String planConfig;

        @NameInMap("PlanDesc")
        public String planDesc;

        @NameInMap("PlanEndTime")
        public String planEndTime;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("PlanName")
        public String planName;

        @NameInMap("PlanStartTime")
        public String planStartTime;

        @NameInMap("PlanType")
        public String planType;

        @NameInMap("PlanscheduleType")
        public String planscheduleType;

        public static DescribeDBInstancePlansResponseBodyItemsPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePlansResponseBodyItemsPlan self = new DescribeDBInstancePlansResponseBodyItemsPlan();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePlansResponseBodyItemsPlan setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlan setPlanConfig(String planConfig) {
            this.planConfig = planConfig;
            return this;
        }
        public String getPlanConfig() {
            return this.planConfig;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlan setPlanDesc(String planDesc) {
            this.planDesc = planDesc;
            return this;
        }
        public String getPlanDesc() {
            return this.planDesc;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlan setPlanEndTime(String planEndTime) {
            this.planEndTime = planEndTime;
            return this;
        }
        public String getPlanEndTime() {
            return this.planEndTime;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlan setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlan setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlan setPlanStartTime(String planStartTime) {
            this.planStartTime = planStartTime;
            return this;
        }
        public String getPlanStartTime() {
            return this.planStartTime;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlan setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public DescribeDBInstancePlansResponseBodyItemsPlan setPlanscheduleType(String planscheduleType) {
            this.planscheduleType = planscheduleType;
            return this;
        }
        public String getPlanscheduleType() {
            return this.planscheduleType;
        }

    }

    public static class DescribeDBInstancePlansResponseBodyItems extends TeaModel {
        @NameInMap("Plan")
        public java.util.List<DescribeDBInstancePlansResponseBodyItemsPlan> plan;

        public static DescribeDBInstancePlansResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePlansResponseBodyItems self = new DescribeDBInstancePlansResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePlansResponseBodyItems setPlan(java.util.List<DescribeDBInstancePlansResponseBodyItemsPlan> plan) {
            this.plan = plan;
            return this;
        }
        public java.util.List<DescribeDBInstancePlansResponseBodyItemsPlan> getPlan() {
            return this.plan;
        }

    }

}
