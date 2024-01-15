// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>Details about execution records of the command.</p>
     */
    @NameInMap("Invocations")
    public java.util.List<DescribeInvocationsResponseBodyInvocations> invocations;

    /**
     * <p>The query token that is returned from this call.</p>
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
         * <p>The time when the command execution was performed.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the cloud desktop.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud desktop.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The size of the text that is truncated and discarded when the Output value exceeds 24 KB in size.</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The code that indicates the reason why a command failed to be sent or executed. The valid values include:</p>
         * <br>
         * <p>*   If this parameter is empty, the execution is normal.</p>
         * <p>*   InstanceNotExists: The specified cloud desktop does not exist or is released.</p>
         * <p>*   InstanceReleased: The cloud desktop is released during the execution.</p>
         * <p>*   InstanceNotRunning: The cloud desktop is not running during the execution.</p>
         * <p>*   CommandNotApplicable: The command cannot be used on the cloud desktop.</p>
         * <p>*   ClientNotRunning: The Cloud Assistant client is not running.</p>
         * <p>*   ClientNotResponse: The Cloud Assistant client does not respond.</p>
         * <p>*   ClientIsUpgrading: The Cloud Assistant client is being upgraded.</p>
         * <p>*   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</p>
         * <p>*   DeliveryTimeout: The time to send the command in the request times out.</p>
         * <p>*   ExecutionTimeout: The execution times out.</p>
         * <p>*   ExecutionException: An exception occurs during the execution.</p>
         * <p>*   ExecutionInterrupted: The execution is interrupted.</p>
         * <p>*   ExitCodeNonzero: The execution finishes, but the exit code is not 0.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Details about the reason why the command failed to be sent or executed. The valid values include:</p>
         * <br>
         * <p>*   If this parameter is empty, the execution is normal.</p>
         * <p>*   the specified instance does not exists: The cloud desktop does not exist or is released.</p>
         * <p>*   the instance has released when create task: The cloud desktop is released during execution.</p>
         * <p>*   the instance is not running when create task: The cloud desktop is not running when the execution is being performed.</p>
         * <p>*   the command is not applicable: The command cannot be used on the specified cloud desktop.</p>
         * <p>*   the aliyun service is not running on the instance: The Cloud Assistance client is not running.</p>
         * <p>*   the aliyun service in the instance does not response: The Cloud Assistant client is not responding.</p>
         * <p>*   the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</p>
         * <p>*   the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</p>
         * <p>*   the command delivery has been timeout: The command that is sent in the request times out.</p>
         * <p>*   the command execution has been timeout: The execution times out.</p>
         * <p>*   the command execution got an exception: An exception occurs when the command is running.</p>
         * <p>*   the command execution has been interrupted: The execution is interrupted.</p>
         * <p>*   the command execution exit code is not zero: The execution finishes, but the exit code is not 0.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the execution.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the command execution ended.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The execution status on the cloud desktop.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The command output.</p>
         * <br>
         * <p>*   If the IncludeOutput parameter is set to false, Output is not returned.</p>
         * <p>*   If the ContentEncoding parameter is set to Base64, the value of Output is the output information that is encoded in Base64.</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times that the command is executed on the cloud desktop.</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>The start time of the execution on the cloud desktop.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when you called the [StopInvocation](~~196957#doc-api-ecd-StopInvocation~~ "You can call this operation to stop a Cloud Assistant command that is running on one or cloud desktops.") operation to manually stop the command.</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The time when the execution status was updated.</p>
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

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
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
         * <p>The Base64-encoded command content.</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The type of the command.</p>
         */
        @NameInMap("CommandType")
        public String commandType;

        /**
         * <p>The time when the execution task is created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The overall execution status of the command. The overall execution status is determined by the execution status on all involved cloud desktops. The valid values include:</p>
         * <br>
         * <p>*   Pending: The system is verifying or sending the command. If the execution status on at least one cloud desktop is Pending, the overall execution status is Pending.</p>
         * <br>
         * <p>*   Running: The execution is in progress on cloud desktops. If the execution status on at least one cloud desktop is Running, the overall execution status is Running.</p>
         * <br>
         * <p>*   Success: If the execution status on all cloud desktops is Success or Stopped, or the execution status on at least one cloud desktop is Success, the overall execution status is Success.</p>
         * <br>
         * <p>*   Failed: If the execution status on all cloud desktops is Stopped or Failed, the overall execution status is Failed. If one or more execution status of a cloud desktop is one of the following values, Failed is returned:</p>
         * <br>
         * <p>    *   Invalid: The command is invalid.</p>
         * <p>    *   Aborted: The command fails to be sent.</p>
         * <p>    *   Failed: The command is executed, but the exit code is not 0.</p>
         * <p>    *   Timeout: The command times out.</p>
         * <p>    *   Error: An error occurs in the command.</p>
         * <br>
         * <p>*   Stopping: The execution is being stopped. If the execution status on at least one cloud desktop is Stopping, the overall execution state is Stopping.</p>
         * <br>
         * <p>*   Stopped: The execution is stopped. If the execution status on all cloud desktops is Stopped, the overall execution state is Stopped. If the execution status on a cloud desktop is one of the following values, Stopped is returned:</p>
         * <br>
         * <p>    *   Cancelled: The execution is canceled.</p>
         * <p>    *   Terminated: The execution is terminated.</p>
         * <br>
         * <p>*   PartialFailed: The execution succeeded on some cloud desktops and failed on others. If the execution status on different cloud desktops is Success, Failed, or Stopped, the overall execution state is PartialFailed.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The cloud desktops on which the command is executed.</p>
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
