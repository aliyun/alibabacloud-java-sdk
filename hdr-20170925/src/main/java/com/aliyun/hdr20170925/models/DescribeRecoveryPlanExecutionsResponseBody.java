// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlanExecutionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecoveryPlanExecutions")
    public DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutions recoveryPlanExecutions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRecoveryPlanExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlanExecutionsResponseBody self = new DescribeRecoveryPlanExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlanExecutionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRecoveryPlanExecutionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRecoveryPlanExecutionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecoveryPlanExecutionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRecoveryPlanExecutionsResponseBody setRecoveryPlanExecutions(DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutions recoveryPlanExecutions) {
        this.recoveryPlanExecutions = recoveryPlanExecutions;
        return this;
    }
    public DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutions getRecoveryPlanExecutions() {
        return this.recoveryPlanExecutions;
    }

    public DescribeRecoveryPlanExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecoveryPlanExecutionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRecoveryPlanExecutionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution extends TeaModel {
        @NameInMap("ExecutionId")
        public String executionId;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution self = new DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution();
            return TeaModel.build(map, self);
        }

        public DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutions extends TeaModel {
        @NameInMap("recoveryPlanExecution")
        public java.util.List<DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution> recoveryPlanExecution;

        public static DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutions self = new DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutions();
            return TeaModel.build(map, self);
        }

        public DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutions setRecoveryPlanExecution(java.util.List<DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution> recoveryPlanExecution) {
            this.recoveryPlanExecution = recoveryPlanExecution;
            return this;
        }
        public java.util.List<DescribeRecoveryPlanExecutionsResponseBodyRecoveryPlanExecutionsRecoveryPlanExecution> getRecoveryPlanExecution() {
            return this.recoveryPlanExecution;
        }

    }

}
