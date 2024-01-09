// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlansResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecoveryPlans")
    public DescribeRecoveryPlansResponseBodyRecoveryPlans recoveryPlans;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRecoveryPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlansResponseBody self = new DescribeRecoveryPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlansResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRecoveryPlansResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRecoveryPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecoveryPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRecoveryPlansResponseBody setRecoveryPlans(DescribeRecoveryPlansResponseBodyRecoveryPlans recoveryPlans) {
        this.recoveryPlans = recoveryPlans;
        return this;
    }
    public DescribeRecoveryPlansResponseBodyRecoveryPlans getRecoveryPlans() {
        return this.recoveryPlans;
    }

    public DescribeRecoveryPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecoveryPlansResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRecoveryPlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan extends TeaModel {
        @NameInMap("Direction")
        public String direction;

        @NameInMap("Name")
        public String name;

        @NameInMap("RecoveryPlanId")
        public String recoveryPlanId;

        @NameInMap("Status")
        public String status;

        public static DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan self = new DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan();
            return TeaModel.build(map, self);
        }

        public DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setRecoveryPlanId(String recoveryPlanId) {
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }
        public String getRecoveryPlanId() {
            return this.recoveryPlanId;
        }

        public DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeRecoveryPlansResponseBodyRecoveryPlans extends TeaModel {
        @NameInMap("recoveryPlan")
        public java.util.List<DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan> recoveryPlan;

        public static DescribeRecoveryPlansResponseBodyRecoveryPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecoveryPlansResponseBodyRecoveryPlans self = new DescribeRecoveryPlansResponseBodyRecoveryPlans();
            return TeaModel.build(map, self);
        }

        public DescribeRecoveryPlansResponseBodyRecoveryPlans setRecoveryPlan(java.util.List<DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan> recoveryPlan) {
            this.recoveryPlan = recoveryPlan;
            return this;
        }
        public java.util.List<DescribeRecoveryPlansResponseBodyRecoveryPlansRecoveryPlan> getRecoveryPlan() {
            return this.recoveryPlan;
        }

    }

}
