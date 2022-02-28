// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlanExecutionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StateGraph")
    public String stateGraph;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("UpdatedTime")
    public Long updatedTime;

    public static DescribeRecoveryPlanExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlanExecutionResponseBody self = new DescribeRecoveryPlanExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlanExecutionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRecoveryPlanExecutionResponseBody setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public DescribeRecoveryPlanExecutionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRecoveryPlanExecutionResponseBody setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public DescribeRecoveryPlanExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecoveryPlanExecutionResponseBody setStateGraph(String stateGraph) {
        this.stateGraph = stateGraph;
        return this;
    }
    public String getStateGraph() {
        return this.stateGraph;
    }

    public DescribeRecoveryPlanExecutionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRecoveryPlanExecutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRecoveryPlanExecutionResponseBody setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public Long getUpdatedTime() {
        return this.updatedTime;
    }

}
