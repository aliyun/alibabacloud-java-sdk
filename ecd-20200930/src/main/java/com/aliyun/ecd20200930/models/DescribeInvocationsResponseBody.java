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
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T06:15:54Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7w78ozhjcwa3u****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>demo1234</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The size of the text that is truncated and discarded when the Output value exceeds 24 KB in size.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The code that indicates the reason why a command failed to be sent or executed. The valid values include:</p>
         * <ul>
         * <li>If this parameter is empty, the execution is normal.</li>
         * <li>InstanceNotExists: The specified cloud desktop does not exist or is released.</li>
         * <li>InstanceReleased: The cloud desktop is released during the execution.</li>
         * <li>InstanceNotRunning: The cloud desktop is not running during the execution.</li>
         * <li>CommandNotApplicable: The command cannot be used on the cloud desktop.</li>
         * <li>ClientNotRunning: The Cloud Assistant client is not running.</li>
         * <li>ClientNotResponse: The Cloud Assistant client does not respond.</li>
         * <li>ClientIsUpgrading: The Cloud Assistant client is being upgraded.</li>
         * <li>ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</li>
         * <li>DeliveryTimeout: The time to send the command in the request times out.</li>
         * <li>ExecutionTimeout: The execution times out.</li>
         * <li>ExecutionException: An exception occurs during the execution.</li>
         * <li>ExecutionInterrupted: The execution is interrupted.</li>
         * <li>ExitCodeNonzero: The execution finishes, but the exit code is not 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Details about the reason why the command failed to be sent or executed. The valid values include:</p>
         * <ul>
         * <li>If this parameter is empty, the execution is normal.</li>
         * <li>the specified instance does not exists: The cloud desktop does not exist or is released.</li>
         * <li>the instance has released when create task: The cloud desktop is released during execution.</li>
         * <li>the instance is not running when create task: The cloud desktop is not running when the execution is being performed.</li>
         * <li>the command is not applicable: The command cannot be used on the specified cloud desktop.</li>
         * <li>the aliyun service is not running on the instance: The Cloud Assistance client is not running.</li>
         * <li>the aliyun service in the instance does not response: The Cloud Assistant client is not responding.</li>
         * <li>the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</li>
         * <li>the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</li>
         * <li>the command delivery has been timeout: The command that is sent in the request times out.</li>
         * <li>the command execution has been timeout: The execution times out.</li>
         * <li>the command execution got an exception: An exception occurs when the command is running.</li>
         * <li>the command execution has been interrupted: The execution is interrupted.</li>
         * <li>the command execution exit code is not zero: The execution finishes, but the exit code is not 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The specified instance does not exist.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the command execution ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T06:15:56Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The execution status on the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The command output.</p>
         * <ul>
         * <li>If the IncludeOutput parameter is set to false, Output is not returned.</li>
         * <li>If the ContentEncoding parameter is set to Base64, the value of Output is the output information that is encoded in Base64.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OutPutTestmsg</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times that the command is executed on the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>The start time of the execution on the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T06:15:55Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when you called the <a href="~~196957#doc-api-ecd-StopInvocation~~" title="You can call this operation to stop a Cloud Assistant command that is running on one or cloud desktops.">StopInvocation</a> operation to manually stop the command.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-25T09:15:47Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The time when the execution status was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-25T06:15:56Z</p>
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
         * 
         * <strong>example:</strong>
         * <p>cnBtIC1xYSB8IGdyZXAgdnNm****</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The type of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>RunPowerShellScript</p>
         */
        @NameInMap("CommandType")
        public String commandType;

        /**
         * <p>The time when the execution task is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-19T09:15:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>User1</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The overall execution status of the command. The overall execution status is determined by the execution status on all involved cloud desktops. The valid values include:</p>
         * <ul>
         * <li><p>Pending: The system is verifying or sending the command. If the execution status on at least one cloud desktop is Pending, the overall execution status is Pending.</p>
         * </li>
         * <li><p>Running: The execution is in progress on cloud desktops. If the execution status on at least one cloud desktop is Running, the overall execution status is Running.</p>
         * </li>
         * <li><p>Success: If the execution status on all cloud desktops is Success or Stopped, or the execution status on at least one cloud desktop is Success, the overall execution status is Success.</p>
         * </li>
         * <li><p>Failed: If the execution status on all cloud desktops is Stopped or Failed, the overall execution status is Failed. If one or more execution status of a cloud desktop is one of the following values, Failed is returned:</p>
         * <ul>
         * <li>Invalid: The command is invalid.</li>
         * <li>Aborted: The command fails to be sent.</li>
         * <li>Failed: The command is executed, but the exit code is not 0.</li>
         * <li>Timeout: The command times out.</li>
         * <li>Error: An error occurs in the command.</li>
         * </ul>
         * </li>
         * <li><p>Stopping: The execution is being stopped. If the execution status on at least one cloud desktop is Stopping, the overall execution state is Stopping.</p>
         * </li>
         * <li><p>Stopped: The execution is stopped. If the execution status on all cloud desktops is Stopped, the overall execution state is Stopped. If the execution status on a cloud desktop is one of the following values, Stopped is returned:</p>
         * <ul>
         * <li>Cancelled: The execution is canceled.</li>
         * <li>Terminated: The execution is terminated.</li>
         * </ul>
         * </li>
         * <li><p>PartialFailed: The execution succeeded on some cloud desktops and failed on others. If the execution status on different cloud desktops is Success, Failed, or Stopped, the overall execution state is PartialFailed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The total number of cloud computers on which the command is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InvokeDesktopCount")
        public Integer invokeDesktopCount;

        /**
         * <p>The total number of cloud computers on which the command is executed successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InvokeDesktopSucceedCount")
        public Integer invokeDesktopSucceedCount;

        /**
         * <p>The cloud desktops on which the command is executed.</p>
         */
        @NameInMap("InvokeDesktops")
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvokeDesktops> invokeDesktops;

        /**
         * <p>The ID of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>t-hz0jdfwd9f****</p>
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

        public DescribeInvocationsResponseBodyInvocations setInvokeDesktopCount(Integer invokeDesktopCount) {
            this.invokeDesktopCount = invokeDesktopCount;
            return this;
        }
        public Integer getInvokeDesktopCount() {
            return this.invokeDesktopCount;
        }

        public DescribeInvocationsResponseBodyInvocations setInvokeDesktopSucceedCount(Integer invokeDesktopSucceedCount) {
            this.invokeDesktopSucceedCount = invokeDesktopSucceedCount;
            return this;
        }
        public Integer getInvokeDesktopSucceedCount() {
            return this.invokeDesktopSucceedCount;
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
