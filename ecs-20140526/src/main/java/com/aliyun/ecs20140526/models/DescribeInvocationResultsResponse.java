// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Invocation")
    @Validation(required = true)
    public DescribeInvocationResultsResponseInvocation invocation;

    public static DescribeInvocationResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultsResponse self = new DescribeInvocationResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvocationResultsResponse setInvocation(DescribeInvocationResultsResponseInvocation invocation) {
        this.invocation = invocation;
        return this;
    }
    public DescribeInvocationResultsResponseInvocation getInvocation() {
        return this.invocation;
    }

    public static class DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult extends TeaModel {
        @NameInMap("CommandId")
        @Validation(required = true)
        public String commandId;

        @NameInMap("InvokeId")
        @Validation(required = true)
        public String invokeId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("StopTime")
        @Validation(required = true)
        public String stopTime;

        @NameInMap("FinishedTime")
        @Validation(required = true)
        public String finishedTime;

        @NameInMap("Repeats")
        @Validation(required = true)
        public Integer repeats;

        @NameInMap("Output")
        @Validation(required = true)
        public String output;

        @NameInMap("Dropped")
        @Validation(required = true)
        public Integer dropped;

        @NameInMap("InvokeRecordStatus")
        @Validation(required = true)
        public String invokeRecordStatus;

        @NameInMap("InvocationStatus")
        @Validation(required = true)
        public String invocationStatus;

        @NameInMap("ExitCode")
        @Validation(required = true)
        public Long exitCode;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorInfo")
        @Validation(required = true)
        public String errorInfo;

        public static DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult self = new DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setRepeats(Integer repeats) {
            this.repeats = repeats;
            return this;
        }
        public Integer getRepeats() {
            return this.repeats;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setDropped(Integer dropped) {
            this.dropped = dropped;
            return this;
        }
        public Integer getDropped() {
            return this.dropped;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setInvokeRecordStatus(String invokeRecordStatus) {
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

    }

    public static class DescribeInvocationResultsResponseInvocationInvocationResults extends TeaModel {
        @NameInMap("InvocationResult")
        @Validation(required = true)
        public java.util.List<DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult> invocationResult;

        public static DescribeInvocationResultsResponseInvocationInvocationResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseInvocationInvocationResults self = new DescribeInvocationResultsResponseInvocationInvocationResults();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseInvocationInvocationResults setInvocationResult(java.util.List<DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult> invocationResult) {
            this.invocationResult = invocationResult;
            return this;
        }
        public java.util.List<DescribeInvocationResultsResponseInvocationInvocationResultsInvocationResult> getInvocationResult() {
            return this.invocationResult;
        }

    }

    public static class DescribeInvocationResultsResponseInvocation extends TeaModel {
        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Long pageNumber;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("InvocationResults")
        @Validation(required = true)
        public DescribeInvocationResultsResponseInvocationInvocationResults invocationResults;

        public static DescribeInvocationResultsResponseInvocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseInvocation self = new DescribeInvocationResultsResponseInvocation();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseInvocation setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeInvocationResultsResponseInvocation setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeInvocationResultsResponseInvocation setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeInvocationResultsResponseInvocation setInvocationResults(DescribeInvocationResultsResponseInvocationInvocationResults invocationResults) {
            this.invocationResults = invocationResults;
            return this;
        }
        public DescribeInvocationResultsResponseInvocationInvocationResults getInvocationResults() {
            return this.invocationResults;
        }

    }

}
