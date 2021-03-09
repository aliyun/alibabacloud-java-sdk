// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Invocations")
    @Validation(required = true)
    public java.util.List<DescribeInvocationsResponseInvocations> invocations;

    public static DescribeInvocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsResponse self = new DescribeInvocationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvocationsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInvocationsResponse setInvocations(java.util.List<DescribeInvocationsResponseInvocations> invocations) {
        this.invocations = invocations;
        return this;
    }
    public java.util.List<DescribeInvocationsResponseInvocations> getInvocations() {
        return this.invocations;
    }

    public static class DescribeInvocationsResponseInvocationsInvokeDesktops extends TeaModel {
        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("Repeats")
        @Validation(required = true)
        public Integer repeats;

        @NameInMap("InvocationStatus")
        @Validation(required = true)
        public String invocationStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("StopTime")
        @Validation(required = true)
        public String stopTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("Output")
        @Validation(required = true)
        public String output;

        @NameInMap("ExitCode")
        @Validation(required = true)
        public Long exitCode;

        @NameInMap("Dropped")
        @Validation(required = true)
        public Integer dropped;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorInfo")
        @Validation(required = true)
        public String errorInfo;

        public static DescribeInvocationsResponseInvocationsInvokeDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseInvocationsInvokeDesktops self = new DescribeInvocationsResponseInvocationsInvokeDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setRepeats(Integer repeats) {
            this.repeats = repeats;
            return this;
        }
        public Integer getRepeats() {
            return this.repeats;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setDropped(Integer dropped) {
            this.dropped = dropped;
            return this;
        }
        public Integer getDropped() {
            return this.dropped;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationsResponseInvocationsInvokeDesktops setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

    }

    public static class DescribeInvocationsResponseInvocations extends TeaModel {
        @NameInMap("InvokeId")
        @Validation(required = true)
        public String invokeId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CommandType")
        @Validation(required = true)
        public String commandType;

        @NameInMap("CommandContent")
        @Validation(required = true)
        public String commandContent;

        @NameInMap("InvocationStatus")
        @Validation(required = true)
        public String invocationStatus;

        @NameInMap("InvokeDesktops")
        @Validation(required = true)
        public java.util.List<DescribeInvocationsResponseInvocationsInvokeDesktops> invokeDesktops;

        public static DescribeInvocationsResponseInvocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseInvocations self = new DescribeInvocationsResponseInvocations();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseInvocations setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeInvocationsResponseInvocations setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInvocationsResponseInvocations setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public DescribeInvocationsResponseInvocations setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeInvocationsResponseInvocations setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationsResponseInvocations setInvokeDesktops(java.util.List<DescribeInvocationsResponseInvocationsInvokeDesktops> invokeDesktops) {
            this.invokeDesktops = invokeDesktops;
            return this;
        }
        public java.util.List<DescribeInvocationsResponseInvocationsInvokeDesktops> getInvokeDesktops() {
            return this.invokeDesktops;
        }

    }

}
