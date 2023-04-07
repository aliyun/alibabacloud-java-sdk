// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>The command execution records.</p>
     */
    @NameInMap("Invocations")
    public java.util.List<DescribeInvocationsResponseBodyInvocations> invocations;

    /**
     * <p>The query token that is returned in this call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInvocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsResponseBody self = new DescribeInvocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationsResponseBody setInvocations(java.util.List<DescribeInvocationsResponseBodyInvocations> invocations) {
        this.invocations = invocations;
        return this;
    }
    public java.util.List<DescribeInvocationsResponseBodyInvocations> getInvocations() {
        return this.invocations;
    }

    public DescribeInvocationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInvocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInvocationsResponseBodyInvocationsInvokeDesktops extends TeaModel {
        /**
         * <p>The time when the command execution was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the cloud desktop.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The size of the text that is truncated and discarded when the value of the Output parameter exceeds 24 KB in size.</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The error code that is returned if the command failed to be sent or run.</p>
         * <br>
         * <p>*   If null is returned, the command is run normally.</p>
         * <p>*   If InstanceNotExists is returned, the specified cloud desktop does not exist or is released.</p>
         * <p>*   If InstanceReleased is returned, the specified cloud desktop is released during the command execution.</p>
         * <p>*   If InstanceNotRunning is returned, the specified cloud desktop is not in the Running state when the execution is created.</p>
         * <p>*   If CommandNotApplicable is returned, the command cannot be run on the specified cloud desktop.</p>
         * <p>*   If ClientNotRunning is returned, Cloud Assistant is not running.</p>
         * <p>*   If ClientNotResponse is returned, Cloud Assistant does not respond to your request.</p>
         * <p>*   If ClientIsUpgrading is returned, Cloud Assistant is being upgraded.</p>
         * <p>*   If ClientNeedUpgrade is returned, you must upgrade Cloud Assistant.</p>
         * <p>*   If DeliveryTimeout is returned, the operation to send the command times out.</p>
         * <p>*   If ExecutionTimeout is returned, the command execution times out.</p>
         * <p>*   If ExecutionException is returned, an execution occurs during the command execution.</p>
         * <p>*   If ExecutionInterrupted is returned, the command execution is interrupted.</p>
         * <p>*   If ExitCodeNonzero is returned, the command execution is complete, but the exit code is not 0.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message that is returned if the command failed to be sent or run.</p>
         * <br>
         * <p>*   If null is returned, the command is run normally.</p>
         * <p>*   If "the specified instance does not exist" is returned, the specified cloud desktop does not exist or is released.</p>
         * <p>*   If "the instance has released when create task" is returned, the specified cloud desktop is released during the command execution.</p>
         * <p>*   If "the instance is not running when create task" is returned, the specified cloud desktop is not in the Running state when the execution is created.</p>
         * <p>*   If "the command is not applicable" is returned, the command cannot be run on the specified cloud desktop.</p>
         * <p>*   If "the aliyun service is not running on the instance" is returned, Cloud Assistant is not running.</p>
         * <p>*   If "the aliyun service in the instance does not response" is returned, Cloud Assistant does not respond to your request.</p>
         * <p>*   If "the aliyun service in the instance is upgrading now" is returned, Cloud Assistant is being upgraded.</p>
         * <p>*   If "the aliyun service in the instance need upgrade" is returned, you must upgrade Cloud Assistant.</p>
         * <p>*   If "the command delivery has been timeout" is returned, the operation to send the command times out.</p>
         * <p>*   If "the command execution has been timeout" is returned, the command execution times out.</p>
         * <p>*   If "the command execution got an exception" is returned, an exception occurs during the command execution.</p>
         * <p>*   If "the command execution has been interrupted" is returned, the command execution is interrupted.</p>
         * <p>*   If "the command execution exit code is not zero" is returned, the command execution is complete, but the exit code is not 0.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the execution.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The end time of the command execution.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The execution status on a cloud desktop.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The command output.</p>
         * <br>
         * <p>*   If the IncludeOutput parameter is set to false, no value of the Output parameter is returned.</p>
         * <p>*   If the ContentEncoding parameter is set to Base64, the value of the Output parameter is encoded in Base64.</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times that the command is run on the cloud desktop.</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>The start time of the command execution on the cloud desktop.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>If you called the [stopInvocation](~~196957~~) operation, the value of this parameter indicates the time when you made the call.</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The time when the execution status was last updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeInvocationsResponseBodyInvocationsInvokeDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocationsInvokeDesktops self = new DescribeInvocationsResponseBodyInvocationsInvokeDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setDropped(Integer dropped) {
            this.dropped = dropped;
            return this;
        }
        public Integer getDropped() {
            return this.dropped;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setRepeats(Integer repeats) {
            this.repeats = repeats;
            return this;
        }
        public Integer getRepeats() {
            return this.repeats;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeInvocationsResponseBodyInvocations extends TeaModel {
        /**
         * <p>The command content that is encoded in Base64.</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The type of the command.</p>
         */
        @NameInMap("CommandType")
        public String commandType;

        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the end user.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The overall execution status of the command. The overall execution status is determined by the execution status of the command on all related cloud desktops. Valid values:</p>
         * <br>
         * <p>*   Pending: The system is verifying or sending the command. If the execution status on at least one cloud desktop is Pending, the overall execution status is Pending.</p>
         * <br>
         * <p>*   Running: The execution is in progress on cloud desktops. If the execution status on at least one cloud desktop is Running, the overall execution status is Running.</p>
         * <br>
         * <p>*   Success: If the execution status on at least one cloud desktop is Success, and the execution status on other cloud desktops is Success or Stopped, the overall execution status is Success.</p>
         * <br>
         * <p>*   Failed: If the execution status on all cloud desktops is Stopped or Failed, the overall execution status is Failed. If one or more execution status on a cloud desktop is one of the following values, Failed is returned:</p>
         * <br>
         * <p>    *   Invalid: The command is invalid.</p>
         * <p>    *   Aborted: The command failed to be sent.</p>
         * <p>    *   Failed: The execution is complete, but the exit code is not 0.</p>
         * <p>    *   Timeout: The execution times out.</p>
         * <p>    *   Error: An error occurs when the execution is in progress.</p>
         * <br>
         * <p>*   Stopping: The execution is being stopped. If the execution status on at least one cloud desktop is Stopping, the overall execution status is Stopping.</p>
         * <br>
         * <p>*   Stopped: The execution is stopped. If the execution status on all cloud desktops is Stopped, the overall execution status is Stopped. If the execution status on a cloud desktop is one of the following values, Stopped is returned:</p>
         * <br>
         * <p>    *   Cancelled: The execution is canceled.</p>
         * <p>    *   Terminated: The execution is terminated.</p>
         * <br>
         * <p>*   PartialFailed: The execution is successful on specific cloud desktops and failed on other cloud desktops. If the execution status on different cloud desktops includes Success, Failed, and Stopped, the overall execution status is PartialFailed.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The cloud desktops on which the command is run.</p>
         */
        @NameInMap("InvokeDesktops")
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvokeDesktops> invokeDesktops;

        /**
         * <p>The ID of the execution.</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        public static DescribeInvocationsResponseBodyInvocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocations self = new DescribeInvocationsResponseBodyInvocations();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocations setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeInvocationsResponseBodyInvocations setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public DescribeInvocationsResponseBodyInvocations setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInvocationsResponseBodyInvocations setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeInvocationsResponseBodyInvocations setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationsResponseBodyInvocations setInvokeDesktops(java.util.List<DescribeInvocationsResponseBodyInvocationsInvokeDesktops> invokeDesktops) {
            this.invokeDesktops = invokeDesktops;
            return this;
        }
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvokeDesktops> getInvokeDesktops() {
            return this.invokeDesktops;
        }

        public DescribeInvocationsResponseBodyInvocations setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

    }

}
