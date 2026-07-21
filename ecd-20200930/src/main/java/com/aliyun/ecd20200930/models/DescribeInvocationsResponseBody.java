// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>The array of script execution records.</p>
     */
    @NameInMap("Invocations")
    public java.util.List<DescribeInvocationsResponseBodyInvocations> invocations;

    /**
     * <p>The pagination token returned in this call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
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
         * <p>The creation time of the script process.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T06:15:54Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The cloud desktop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-7w78ozhjcwa3u****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud desktop name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo1234</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The length of the truncated and discarded text after the text length in the Output field exceeds 24 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The error code for the command delivery failure or execution failure. Valid values:</p>
         * <ul>
         * <li>Empty: The command ran normally.</li>
         * <li>InstanceNotExists: The specified cloud desktop does not exist or has been released.</li>
         * <li>InstanceReleased: The cloud desktop was released during task execution.</li>
         * <li>InstanceNotRunning: The cloud desktop was not running when the task was created.</li>
         * <li>CommandNotApplicable: The command is not applicable to the specified cloud desktop.</li>
         * <li>ClientNotRunning: The Cloud Assistant client is not running.</li>
         * <li>ClientNotResponse: The Cloud Assistant client is not responding.</li>
         * <li>ClientIsUpgrading: The Cloud Assistant client is being upgraded.</li>
         * <li>ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.</li>
         * <li>DeliveryTimeout: Command delivery timed out.</li>
         * <li>ExecutionTimeout: Command execution timed out.</li>
         * <li>ExecutionException: An exception occurred during command execution.</li>
         * <li>ExecutionInterrupted: Command execution was interrupted.</li>
         * <li>ExitCodeNonzero: Command execution completed with a non-zero exit code.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The detailed information about the command delivery failure or execution failure. Valid values:</p>
         * <ul>
         * <li>Empty: The command ran normally.</li>
         * <li>the specified instance does not exists: The specified cloud desktop does not exist or has been released.</li>
         * <li>the instance has released when create task: The cloud desktop was released during task execution.</li>
         * <li>the instance is not running when create task: The cloud desktop was not running when the task was created.</li>
         * <li>the command is not applicable: The command is not applicable to the specified cloud desktop.</li>
         * <li>the aliyun service is not running on the instance: The Cloud Assistant client is not running.</li>
         * <li>the aliyun service in the instance does not response: The Cloud Assistant client is not responding.</li>
         * <li>the aliyun service in the instance is upgrading now: The Cloud Assistant client is being upgraded.</li>
         * <li>the aliyun service in the instance need upgrade: The Cloud Assistant client needs to be upgraded.</li>
         * <li>the command delivery has been timeout: Command delivery timed out.</li>
         * <li>the command execution has been timeout: Command execution timed out.</li>
         * <li>the command execution got an exception: An exception occurred during command execution.</li>
         * <li>the command execution has been interrupted: Command execution was interrupted.</li>
         * <li>the command execution exit code is not zero: Command execution completed with a non-zero exit code.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The specified instance does not exist.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the script process.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The end time of the script process.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T06:15:56Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The script execution status on a single cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("JvsAgentId")
        public String jvsAgentId;

        /**
         * <p>The output of the script process.</p>
         * <ul>
         * <li>If the request parameter <code>IncludeOutput</code> is set to false, Output is not returned.</li>
         * <li>If the request parameter <code>ContentEncoding</code> is set to Base64, Output is the Base64-encoded output.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OutPutTestmsg</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times the command was run on the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>The time when the script process started running on the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T06:15:55Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when execution was stopped, if StopInvocation was called.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-25T09:15:47Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The update time of the task status.</p>
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

        public DescribeInvocationsResponseBodyInvocationsInvokeDesktops setJvsAgentId(String jvsAgentId) {
            this.jvsAgentId = jvsAgentId;
            return this;
        }
        public String getJvsAgentId() {
            return this.jvsAgentId;
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
         * <p>The script content, transmitted in Base64 encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>cnBtIC1xYSB8IGdyZXAgdnNm****</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The script type.</p>
         * 
         * <strong>example:</strong>
         * <p>RunPowerShellScript</p>
         */
        @NameInMap("CommandType")
        public String commandType;

        /**
         * <p>The creation time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-19T09:15:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DesktopScenario")
        public String desktopScenario;

        /**
         * <p>The end user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>User1</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The overall execution status of the script. The overall execution status depends on the combined execution status of all cloud desktops in this call. Valid values:</p>
         * <ul>
         * <li>Pending: The system is validating or sending the command. If the script execution status on at least one cloud desktop is Pending, the overall execution status is Pending.</li>
         * <li>Running: The command is running on the cloud desktop. If the script execution status on at least one cloud desktop is Running, the overall execution status is Running.</li>
         * <li>Success: The script execution status on each cloud desktop is Stopped or Success, and the script execution status on at least one cloud desktop is Success. The overall execution status is Success.</li>
         * <li>Failed: The script execution status on each cloud desktop is Stopped or Failed. The overall execution status is Failed. The return value is Failed when one or more of the following statuses occur on a cloud desktop:<ul>
         * <li>Command validation failed (Invalid).</li>
         * <li>Command delivery failed (Aborted).</li>
         * <li>Command execution completed but the exit code is non-zero (Failed).</li>
         * <li>Command execution timed out (Timeout).</li>
         * <li>Command execution encountered an exception (Error).</li>
         * </ul>
         * </li>
         * <li>Stopping: The task is being stopped. If the script execution status on at least one instance is Stopping, the overall execution status is Stopping.</li>
         * <li>Stopped: The task has been stopped. If the script execution status on all instances is Stopped, the overall execution status is Stopped. The return value is Stopped when the script execution status on an instance is one of the following:<ul>
         * <li>Task cancelled (Cancelled).</li>
         * <li>Task terminated (Terminated).</li>
         * </ul>
         * </li>
         * <li>PartialFailed: Some instances succeeded and some instances failed. If the script execution status on each instance is Success, Failed, or Stopped, the overall execution status is PartialFailed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The total number of cloud desktops on which the script was run.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InvokeDesktopCount")
        public Integer invokeDesktopCount;

        /**
         * <p>The total number of cloud desktops on which the script was run successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InvokeDesktopSucceedCount")
        public Integer invokeDesktopSucceedCount;

        /**
         * <p>The list of target cloud desktops for execution.</p>
         */
        @NameInMap("InvokeDesktops")
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvokeDesktops> invokeDesktops;

        /**
         * <p>The execution ID.</p>
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

        public DescribeInvocationsResponseBodyInvocations setDesktopScenario(String desktopScenario) {
            this.desktopScenario = desktopScenario;
            return this;
        }
        public String getDesktopScenario() {
            return this.desktopScenario;
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
