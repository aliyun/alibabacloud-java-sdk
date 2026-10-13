// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>The script execution records.</p>
     */
    @NameInMap("Invocations")
    public DescribeInvocationsResponseBodyInvocations invocations;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInvocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsResponseBody self = new DescribeInvocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationsResponseBody setInvocations(DescribeInvocationsResponseBodyInvocations invocations) {
        this.invocations = invocations;
        return this;
    }
    public DescribeInvocationsResponseBodyInvocations getInvocations() {
        return this.invocations;
    }

    public DescribeInvocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode extends TeaModel {
        /**
         * <p>The start time of the command execution. The time is displayed in ISO 8601 format. Z in the example indicates UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The length of the truncated and discarded text after the text length in the Output field exceeds 24 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The error code for the file delivery failure. Valid values:</p>
         * <ul>
         * <li>Empty: The file was delivered normally.</li>
         * <li>NodeNotExists: The specified instance does not exist or has been released.</li>
         * <li>NodeReleased: The instance was released during file delivery.</li>
         * <li>NodeNotRunning: The instance was not running when the file delivery task was created.</li>
         * <li>AccountNotExists: The specified account does not exist.</li>
         * <li>ClientNotRunning: The Cloud Assistant Agent is not running.</li>
         * <li>ClientNotResponse: The Cloud Assistant Agent is not responding.</li>
         * <li>ClientIsUpgrading: The Cloud Assistant Agent is being upgraded.</li>
         * <li>ClientNeedUpgrade: The Cloud Assistant Agent needs to be upgraded.</li>
         * <li>DeliveryTimeout: The file delivery timed out.</li>
         * <li>FileCreateFail: The file creation failed.</li>
         * <li>FileAlreadyExists: A file with the same name already exists in the same path.</li>
         * <li>FileContentInvalid: The file content is invalid.</li>
         * <li>FileNameInvalid: The file name is invalid.</li>
         * <li>FilePathInvalid: The file path is invalid.</li>
         * <li>FileAuthorityInvalid: The file permissions are invalid.</li>
         * <li>UserGroupNotExists: The user group specified during file delivery does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NodeNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The details of the command delivery failure or execution failure. Valid values:</p>
         * <ul>
         * <li>Empty: The command executed normally.</li>
         * <li>the specified node does not exists: The specified instance does not exist or has been released.</li>
         * <li>the node has node when create task: The instance was released during command execution.</li>
         * <li>the node is not running when create task: The instance was not running when the command was executed.</li>
         * <li>the command is not applicable: The command is not applicable to the specified instance.</li>
         * <li>the specified account does not exists: The specified account does not exist.</li>
         * <li>the specified directory does not exists: The specified directory does not exist.</li>
         * <li>the cron job expression is invalid: The specified execution schedule expression is invalid.</li>
         * <li>the aliyun service is not running on the instance: The Cloud Assistant Agent is not running.</li>
         * <li>the aliyun service in the instance does not response: The Cloud Assistant Agent is not responding.</li>
         * <li>the aliyun service in the node is upgrading now: The Cloud Assistant Agent is being upgraded.</li>
         * <li>the aliyun service in the node need upgrade: The Cloud Assistant Agent needs to be upgraded.</li>
         * <li>the command delivery has been timeout: The command delivery timed out.</li>
         * <li>the command execution has been timeout: The command execution timed out.</li>
         * <li>the command execution got an exception: An exception occurred during command execution.</li>
         * <li>the command execution has been interrupted: The command execution was interrupted.</li>
         * <li>the command execution exit code is not zero: The command execution completed with a non-zero exit code.</li>
         * <li>the specified node has been released: The instance was released during file delivery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>the specified node does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the command process. Valid values:</p>
         * <ul>
         * <li>For Linux instances, the value is the exit code of the Shell process.</li>
         * <li>For Windows instances, the value is the exit code of the Bat or PowerShell process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The completion time. The time is displayed in ISO 8601 format. Z in the example indicates UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The command execution status on a single instance. Valid values:</p>
         * <ul>
         * <li>Pending: The system is validating or sending the command.</li>
         * <li>Invalid: The specified command type or parameters are invalid.</li>
         * <li>Aborted: Failed to send the command to the instance. The instance must be running, and the command must be deliverable within one minute.</li>
         * <li>Running: The command is running on the instance.</li>
         * <li>Success:<ul>
         * <li>One-time command: The command execution is complete and the exit code is 0.</li>
         * <li>Scheduled command: The last execution was successful with an exit code of 0, and the specified schedule has ended.</li>
         * </ul>
         * </li>
         * <li>Failed:<ul>
         * <li>One-time command: The command execution is complete and the exit code is non-zero.</li>
         * <li>Scheduled command: The last execution was successful with a non-zero exit code, and the specified schedule will be aborted.</li>
         * </ul>
         * </li>
         * <li>Error: An exception occurred during command execution and the command cannot continue.</li>
         * <li>Timeout: The command execution timed out.</li>
         * <li>Cancelled: The command execution action was canceled and the command was never started.</li>
         * <li>Stopping: The task is being stopped.</li>
         * <li>Terminated: The command was terminated during execution.</li>
         * <li>Scheduled:<ul>
         * <li>One-time command: Not applicable. This status does not occur.</li>
         * <li>Scheduled command: Waiting to run.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-lbj36wkp70b</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The command execution status on a single instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("NodeInvokeStatus")
        public String nodeInvokeStatus;

        /**
         * <p>The command output.</p>
         * <ul>
         * <li>If ContentEncoding is set to PlainText, the original output is returned.</li>
         * <li>If ContentEncoding is set to Base64, the Base64-encoded output is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OutPutTestmsg</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times the command was executed on the instance.</p>
         * <ul>
         * <li>If the execution mode is one-time execution, the value is 0 or 1.</li>
         * <li>If the execution mode is scheduled execution, the value is the number of times the command has been executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>The start time. The time is displayed in ISO 8601 format. Z in the example indicates UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:55Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when StopInvocation was called to stop the command execution. The time is displayed in ISO 8601 format. Z in the example indicates UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:55Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>Indicates whether the queried command will be automatically executed in the future. Valid values:</p>
         * <ul>
         * <li>true: The command was executed by calling RunCommand or InvokeCommand with the RepeatMode parameter set to Period, NextRebootOnly, or EveryReboot.</li>
         * <li>false (default): The queried command is in one of the following states:<ul>
         * <li>The command was executed by calling RunCommand or InvokeCommand with the RepeatMode parameter set to Once.</li>
         * <li>The command has been canceled, stopped, or has completed execution.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Timed")
        public String timed;

        /**
         * <p>The update time. The time is displayed in ISO 8601 format. Z in the example indicates UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode self = new DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setDropped(Integer dropped) {
            this.dropped = dropped;
            return this;
        }
        public Integer getDropped() {
            return this.dropped;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setExitCode(Integer exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Integer getExitCode() {
            return this.exitCode;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setNodeInvokeStatus(String nodeInvokeStatus) {
            this.nodeInvokeStatus = nodeInvokeStatus;
            return this;
        }
        public String getNodeInvokeStatus() {
            return this.nodeInvokeStatus;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setRepeats(Integer repeats) {
            this.repeats = repeats;
            return this;
        }
        public Integer getRepeats() {
            return this.repeats;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setTimed(String timed) {
            this.timed = timed;
            return this;
        }
        public String getTimed() {
            return this.timed;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodes extends TeaModel {
        /**
         * <p>The command execution record on a node.</p>
         */
        @NameInMap("InvokeNode")
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode> invokeNode;

        public static DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodes self = new DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodes();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodes setInvokeNode(java.util.List<DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode> invokeNode) {
            this.invokeNode = invokeNode;
            return this;
        }
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodesInvokeNode> getInvokeNode() {
            return this.invokeNode;
        }

    }

    public static class DescribeInvocationsResponseBodyInvocationsInvocation extends TeaModel {
        /**
         * <p>The command content.</p>
         * <ul>
         * <li>If ContentEncoding is set to PlainText, the original script content is returned.</li>
         * <li>If ContentEncoding is set to Base64, the Base64-encoded script content is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cnBtIC1xYSB8IGdyZXAgdnNm****</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The command description.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
         * <p>The command name.</p>
         * 
         * <strong>example:</strong>
         * <p>CommandTestName</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        /**
         * <p>The time when the task was created. The time is displayed in ISO 8601 format. Z in the example indicates UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-19T09:15:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The execution time of the scheduled command.</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <p>The overall execution status of the command. The overall execution status depends on the common execution status across all instances in this invocation. Valid values:</p>
         * <ul>
         * <li>Pending: The system is validating or sending the command. When the command execution status on at least one instance is Pending, the overall execution status is Pending.</li>
         * <li>Scheduled: The scheduled command has been sent and is waiting to run. When the command execution status on at least one instance is Scheduled, the overall execution status is Scheduled.</li>
         * <li>Running: The command is running on the instance. When the command execution status on at least one instance is Running, the overall execution status is Running.</li>
         * <li>Success: The command execution status on each instance is Stopped or Success, and the command execution status on at least one instance is Success. The overall execution status is Success.<ul>
         * <li>One-time task: The command execution is complete and the exit code is 0.</li>
         * <li>Scheduled task: The last execution was successful with an exit code of 0, and all specified schedules have been completed.</li>
         * </ul>
         * </li>
         * <li>Failed: The command execution status on each instance is Stopped or Failed. The overall execution status is Failed. The return value is Failed when the command execution status on an instance is one or more of the following:<ul>
         * <li>Command validation failed (Invalid).</li>
         * <li>Command delivery failed (Aborted).</li>
         * <li>Command execution completed with a non-zero exit code (Failed).</li>
         * <li>Command execution timed out (Timeout).</li>
         * <li>Command execution encountered an exception (Error).</li>
         * </ul>
         * </li>
         * <li>Stopping: The task is being stopped. When the command execution status on at least one instance is Stopping, the overall execution status is Stopping.</li>
         * <li>Stopped: The task has been stopped. When the command execution status on all instances is Stopped, the overall execution status is Stopped. The return value is Stopped when the command execution status on an instance is one of the following:<ul>
         * <li>The task was canceled (Cancelled).</li>
         * <li>The task was terminated (Terminated).</li>
         * </ul>
         * </li>
         * <li>PartialFailed: Some instances executed successfully while others failed. When the command execution status on each instance is Success, Failed, or Stopped, the overall execution status is PartialFailed.</li>
         * </ul>
         * <blockquote>
         * <p>The InvokeStatus parameter in the response has a similar meaning, but we recommend that you check this parameter instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The command execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-ind3k9ytvvduoe8</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The command execution records.</p>
         */
        @NameInMap("InvokeNodes")
        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodes invokeNodes;

        /**
         * <p>The overall execution status of the command. The overall execution status depends on the common execution status of one or more instances in the invocation. Valid values: </p>
         * <ul>
         * <li>Running:<ul>
         * <li>Scheduled execution: The execution status remains Running until you manually stop the scheduled command.</li>
         * <li>One-time execution: The overall execution status is Running if the command process is running on any instance.</li>
         * </ul>
         * </li>
         * <li>Finished:<ul>
         * <li>Scheduled execution: The command process cannot have a status of Finished.</li>
         * <li>One-time execution: All instances have completed execution, or the command process was manually stopped on some instances while the remaining instances completed execution.</li>
         * </ul>
         * </li>
         * <li>Failed:<ul>
         * <li>Scheduled execution: The command process cannot have a status of Failed.</li>
         * <li>One-time execution: All instances failed to execute the command.</li>
         * </ul>
         * </li>
         * <li>Stopped: The command was stopped.</li>
         * <li>Stopping: The command is being stopped.</li>
         * <li>PartialFailed: Partial failure. This value does not take effect if the InstanceId parameter is also specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InvokeStatus")
        public String invokeStatus;

        /**
         * <p>The custom parameters in the command.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The execution mode of the command. Valid values:</p>
         * <ul>
         * <li>Once: Immediately executes the command.</li>
         * <li>Period: Executes the command on a schedule.</li>
         * <li>NextRebootOnly: Automatically executes the command the next time the instance starts.</li>
         * <li>EveryReboot: Automatically executes the command every time the instance starts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Once</p>
         */
        @NameInMap("RepeatMode")
        public String repeatMode;

        /**
         * <p>The timeout period for the command execution. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The username used to execute the command.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The working directory of the command on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>/home</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static DescribeInvocationsResponseBodyInvocationsInvocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocationsInvocation self = new DescribeInvocationsResponseBodyInvocationsInvocation();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setCommandContent(String commandContent) {
            this.commandContent = commandContent;
            return this;
        }
        public String getCommandContent() {
            return this.commandContent;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setCommandDescription(String commandDescription) {
            this.commandDescription = commandDescription;
            return this;
        }
        public String getCommandDescription() {
            return this.commandDescription;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setCommandName(String commandName) {
            this.commandName = commandName;
            return this;
        }
        public String getCommandName() {
            return this.commandName;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }
        public String getFrequency() {
            return this.frequency;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setInvokeNodes(DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodes invokeNodes) {
            this.invokeNodes = invokeNodes;
            return this;
        }
        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodes getInvokeNodes() {
            return this.invokeNodes;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setInvokeStatus(String invokeStatus) {
            this.invokeStatus = invokeStatus;
            return this;
        }
        public String getInvokeStatus() {
            return this.invokeStatus;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setRepeatMode(String repeatMode) {
            this.repeatMode = repeatMode;
            return this;
        }
        public String getRepeatMode() {
            return this.repeatMode;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class DescribeInvocationsResponseBodyInvocations extends TeaModel {
        /**
         * <p>The file delivery record.</p>
         */
        @NameInMap("Invocation")
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvocation> invocation;

        public static DescribeInvocationsResponseBodyInvocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocations self = new DescribeInvocationsResponseBodyInvocations();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocations setInvocation(java.util.List<DescribeInvocationsResponseBodyInvocationsInvocation> invocation) {
            this.invocation = invocation;
            return this;
        }
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvocation> getInvocation() {
            return this.invocation;
        }

    }

}
