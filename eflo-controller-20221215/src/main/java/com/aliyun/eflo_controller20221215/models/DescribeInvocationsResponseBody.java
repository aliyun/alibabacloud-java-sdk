// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>Script execution record object.</p>
     */
    @NameInMap("Invocations")
    public DescribeInvocationsResponseBodyInvocations invocations;

    /**
     * <p>Request ID</p>
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
         * <p>The start time of the command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The length of the text that is truncated and discarded when the length of the <code>Output</code> field exceeds 24 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>Reason code for file delivery failure. Possible values:</p>
         * <ul>
         * <li>Empty: File delivery is normal. </li>
         * <li>NodeNotExists: The specified instance does not exist or has been released. </li>
         * <li>NodeReleased: The instance was released during the file delivery process. </li>
         * <li>NodeNotRunning: The instance was not running when the file delivery task was created. </li>
         * <li>AccountNotExists: The specified account does not exist. </li>
         * <li>ClientNotRunning: The Cloud Assistant Agent is not running. </li>
         * <li>ClientNotResponse: The Cloud Assistant Agent is not responding. </li>
         * <li>ClientIsUpgrading: The Cloud Assistant Agent is currently upgrading. </li>
         * <li>ClientNeedUpgrade: The Cloud Assistant Agent needs to be upgraded. </li>
         * <li>DeliveryTimeout: File sending timed out. </li>
         * <li>FileCreateFail: File creation failed. </li>
         * <li>FileAlreadyExists: A file with the same name already exists at the specified path. </li>
         * <li>FileContentInvalid: The file content is invalid. - FileNameInvalid: The file name is invalid. </li>
         * <li>FilePathInvalid: The file path is invalid. </li>
         * <li>FileAuthorityInvalid: The file permissions are invalid. </li>
         * <li>UserGroupNotExists: The user group specified for file sending does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NodeNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Details of the reason for command delivery failure or execution failure, possible values: </p>
         * <ul>
         * <li>Empty: The command executed normally. </li>
         * <li>the specified node does not exist: The specified instance does not exist or has been released. </li>
         * <li>the node was released when creating the task: The instance was released during command execution. </li>
         * <li>the node is not running when creating the task: The instance was not in a running state when the command was executed. </li>
         * <li>the command is not applicable: The command is not applicable to the specified instance. </li>
         * <li>the specified account does not exist: The specified account does not exist. </li>
         * <li>the specified directory does not exist: The specified directory does not exist. </li>
         * <li>the cron job expression is invalid: The specified execution time expression is invalid. </li>
         * <li>the aliyun service is not running on the instance: The Cloud Assistant Agent is not running. </li>
         * <li>the aliyun service in the instance does not respond: The Cloud Assistant Agent is not responding. </li>
         * <li>the aliyun service in the node is upgrading now: The Cloud Assistant Agent is currently being upgraded. </li>
         * <li>the aliyun service in the node needs upgrade: The Cloud Assistant Agent needs an upgrade. </li>
         * <li>the command delivery has timed out: Command delivery has timed out. </li>
         * <li>the command execution has timed out: Command execution has timed out. </li>
         * <li>the command execution got an exception: An exception occurred during command execution. </li>
         * <li>the command execution was interrupted: Command execution was interrupted. </li>
         * <li>the command execution exit code is not zero: Command execution completed with a non-zero exit code. </li>
         * <li>the specified node has been released: The instance was released during file delivery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>the specified node does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the command process. Possible values:</p>
         * <ul>
         * <li>For Linux instances, it is the exit code of the Shell process. - For Windows instances, it is the exit code of the Bat or PowerShell process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>Completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The command progress status for a single instance. Possible values:</p>
         * <ul>
         * <li>Pending: The system is validating or sending the command.</li>
         * <li>Invalid: The specified command type or parameters are incorrect.</li>
         * <li>Aborted: Failed to send the command to the instance. The instance must be running, and the command should be sent within 1 minute.</li>
         * <li>Running: The command is running on the instance.</li>
         * <li>Success:<ul>
         * <li>For a one-time execution command: The command has completed with an exit code of 0.</li>
         * <li>For a periodic execution command: The last run was successful with an exit code of 0, and the specified period has ended.</li>
         * </ul>
         * </li>
         * <li>Failed:<ul>
         * <li>For a one-time execution command: The command has completed with a non-zero exit code.</li>
         * <li>For a periodic execution command: The last run was successful with a non-zero exit code, and the specified period will be terminated.</li>
         * </ul>
         * </li>
         * <li>Error: An exception occurred during command execution, and it cannot continue.</li>
         * <li>Timeout: The command execution timed out.</li>
         * <li>Cancelled: The command execution action has been canceled, and the command was never started.</li>
         * <li>Stopping: The task is being stopped.</li>
         * <li>Terminated: The command was terminated while running.</li>
         * <li>Scheduled:<ul>
         * <li>For a one-time execution command: Not applicable, will not appear.</li>
         * <li>For a periodic execution command: Waiting to run.</li>
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
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-lbj36wkp70b</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The command progress status of a single instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("NodeInvokeStatus")
        public String nodeInvokeStatus;

        /**
         * <p>The output information of the command.</p>
         * <ul>
         * <li>If <code>ContentEncoding</code> is set to <code>PlainText</code>, the original output information is returned.</li>
         * <li>If <code>ContentEncoding</code> is set to <code>Base64</code>, the Base64-encoded output information is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OutPutTestmsg</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times the command has been executed on this instance.</p>
         * <ul>
         * <li>If the execution mode is one-time, the value is 0 or 1.</li>
         * <li>If the execution mode is periodic, the value is the number of times it has been executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>Start Time</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:55Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when <code>StopInvocation</code> was called to stop the command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:55Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>Whether the queried command will be automatically executed in the future. The value range is as follows:</p>
         * <ul>
         * <li>true: The command, when executed by calling <code>RunCommand</code> or <code>InvokeCommand</code>, has the <code>RepeatMode</code> parameter set to <code>Period</code>, <code>NextRebootOnly</code>, or <code>EveryReboot</code>. </li>
         * <li>false: Queries commands in the following two states. </li>
         * <li>When executing a command via <code>RunCommand</code> or <code>InvokeCommand</code>, the <code>RepeatMode</code> parameter is set to <code>Once</code>. </li>
         * <li>Commands that have been canceled, stopped, or completed.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Timed")
        public String timed;

        /**
         * <p>Update Time</p>
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
         * <p>Command execution records for nodes.</p>
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
         * <p>Command content.</p>
         * <ul>
         * <li>If <code>ContentEncoding</code> is set to <code>PlainText</code>, the original script content is returned.</li>
         * <li>If <code>ContentEncoding</code> is set to <code>Base64</code>, the Base64-encoded script content is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cnBtIC1xYSB8IGdyZXAgdnNm****</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>Command description.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
         * <p>Command name.</p>
         * 
         * <strong>example:</strong>
         * <p>CommandTestName</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        /**
         * <p>The creation time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-19T09:15:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The execution time for scheduled commands.</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <p>The overall execution status of the command, which depends on the common execution status of all instances involved in the call. Possible values:</p>
         * <ul>
         * <li>Pending: The system is validating or sending the command. If at least one instance has a command execution status of Pending, the overall status is Pending.</li>
         * <li>Scheduled: The scheduled command has been sent and is waiting to run. If at least one instance has a command execution status of Scheduled, the overall status is Scheduled.</li>
         * <li>Running: The command is running on the instance. If at least one instance has a command execution status of Running, the overall status is Running.</li>
         * <li>Success: The command execution status of all instances is Stopped or Success, and at least one instance\&quot;s command execution status is Success. The overall status is Success.<ul>
         * <li>For immediately executed tasks: The command has completed with an exit code of 0.</li>
         * <li>For periodically executed tasks: The most recent execution was successful with an exit code of 0, and the specified times have all been completed.</li>
         * </ul>
         * </li>
         * <li>Failed: The command execution status of all instances is Stopped or Failed. The overall status is Failed if any of the following conditions apply to the instance\&quot;s command execution status:<ul>
         * <li>Command validation failed (Invalid).</li>
         * <li>Command sending failed (Aborted).</li>
         * <li>Command completed but the exit code is not 0 (Failed).</li>
         * <li>Command execution timed out (Timeout).</li>
         * <li>Command execution encountered an error (Error).</li>
         * </ul>
         * </li>
         * <li>Stopping: The task is being stopped. If at least one instance has a command execution status of Stopping, the overall status is Stopping.</li>
         * <li>Stopped: The task has been stopped. If all instances\&quot; command execution statuses are Stopped, the overall status is Stopped. The overall status is Stopped if the instance\&quot;s command execution status is any of the following:<ul>
         * <li>The task was canceled (Cancelled).</li>
         * <li>The task was terminated (Terminated).</li>
         * </ul>
         * </li>
         * <li>PartialFailed: Some instances succeeded and some failed. If the command execution statuses of all instances are Success, Failed, or Stopped, the overall status is PartialFailed.</li>
         * </ul>
         * <blockquote>
         * <p>The <code>InvokeStatus</code> in the response parameters is similar in meaning to this parameter, but it is recommended that you check this return value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>Command execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-ind3k9ytvvduoe8</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>Command execution records.</p>
         */
        @NameInMap("InvokeNodes")
        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeNodes invokeNodes;

        /**
         * <p>The overall execution status of the command. The overall execution status depends on the common execution status of one or more instances in the execution. Possible values: </p>
         * <ul>
         * <li>Running:<ul>
         * <li>For scheduled execution: The execution status remains ongoing until the scheduled command is manually stopped.</li>
         * <li>For single execution: If there is any command process running, the overall execution status is ongoing.</li>
         * </ul>
         * </li>
         * <li>Finished:<ul>
         * <li>For scheduled execution: The command process cannot be completed.</li>
         * <li>For single execution: All instances have completed execution, or some instances\&quot; command processes are manually stopped and the rest have completed.</li>
         * </ul>
         * </li>
         * <li>Failed:<ul>
         * <li>For scheduled execution: The command process cannot fail.</li>
         * <li>For single execution: All instances have failed to execute.</li>
         * </ul>
         * </li>
         * <li>Stopped: The command has been stopped.</li>
         * <li>Stopping: The command is being stopped.</li>
         * <li>PartialFailed: Partial failure; if the <code>InstanceId</code> parameter is set, this does not apply.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InvokeStatus")
        public String invokeStatus;

        /**
         * <p>Custom parameters in the command.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>命令执行的方式。可能值：</p>
         * <p>Once：立即执行命令。
         * Period：定时执行命令。
         * NextRebootOnly：当实例下一次启动时，自动执行命令。
         * EveryReboot：实例每一次启动都将自动执行命令。</p>
         * 
         * <strong>example:</strong>
         * <p>Once</p>
         */
        @NameInMap("RepeatMode")
        public String repeatMode;

        /**
         * <p>Timeout for executing the command, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>Username for executing the command.</p>
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
         * <p>File delivery record.</p>
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
