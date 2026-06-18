// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>The object that contains the script execution records.</p>
     */
    @NameInMap("Invocations")
    public DescribeInvocationsResponseBodyInvocations invocations;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The number of characters that are truncated and discarded because the \<code>Output\\</code> value exceeds 24 KB in size.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The error code for a file sending failure. Valid values:</p>
         * <ul>
         * <li><p>Empty: The file was sent as expected.</p>
         * </li>
         * <li><p>NodeNotExists: The specified instance does not exist or has been released.</p>
         * </li>
         * <li><p>NodeReleased: The instance was released while the file was being sent.</p>
         * </li>
         * <li><p>NodeNotRunning: The instance was not in the Running state when the file sending task was created.</p>
         * </li>
         * <li><p>AccountNotExists: The specified account does not exist.</p>
         * </li>
         * <li><p>ClientNotRunning: Cloud Assistant Agent is not running.</p>
         * </li>
         * <li><p>ClientNotResponse: Cloud Assistant Agent is not responding.</p>
         * </li>
         * <li><p>ClientIsUpgrading: Cloud Assistant Agent is being upgraded.</p>
         * </li>
         * <li><p>ClientNeedUpgrade: Cloud Assistant Agent needs to be upgraded.</p>
         * </li>
         * <li><p>DeliveryTimeout: The file failed to be sent due to a timeout.</p>
         * </li>
         * <li><p>FileCreateFail: The file failed to be created.</p>
         * </li>
         * <li><p>FileAlreadyExists: A file with the same name exists in the same path.</p>
         * </li>
         * <li><p>FileContentInvalid: The file content is invalid.</p>
         * </li>
         * <li><p>FileNameInvalid: The file name is invalid.</p>
         * </li>
         * <li><p>FilePathInvalid: The file path is invalid.</p>
         * </li>
         * <li><p>FileAuthorityInvalid: The file permissions are invalid.</p>
         * </li>
         * <li><p>UserGroupNotExists: The user group specified for sending the file does not exist.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NodeNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The details about the cause of a command sending or execution failure. Valid values:</p>
         * <ul>
         * <li><p>Empty: The command was executed as expected.</p>
         * </li>
         * <li><p>the specified node does not exist: The specified instance does not exist or has been released.</p>
         * </li>
         * <li><p>the instance was released during the command execution: The instance was released during the command execution.</p>
         * </li>
         * <li><p>the instance is not running when create task: The instance was not in the Running state during the command execution.</p>
         * </li>
         * <li><p>the command is not applicable: The command is not applicable to the specified instance.</p>
         * </li>
         * <li><p>the specified account does not exist: The specified account does not exist.</p>
         * </li>
         * <li><p>the specified directory does not exist: The specified directory does not exist.</p>
         * </li>
         * <li><p>the cron job expression is invalid: The specified cron expression is invalid.</p>
         * </li>
         * <li><p>Cloud Assistant Agent is not running: Cloud Assistant Agent is not running.</p>
         * </li>
         * <li><p>Cloud Assistant Agent is not responding: Cloud Assistant Agent is not responding.</p>
         * </li>
         * <li><p>Cloud Assistant Agent is being upgraded: Cloud Assistant Agent is being upgraded.</p>
         * </li>
         * <li><p>Cloud Assistant Agent needs to be upgraded: Cloud Assistant Agent needs to be upgraded.</p>
         * </li>
         * <li><p>The command failed to be sent due to a timeout: The command failed to be sent due to a timeout.</p>
         * </li>
         * <li><p>The command execution timed out: The command execution timed out.</p>
         * </li>
         * <li><p>An exception occurred during the command execution: An exception occurred during the command execution.</p>
         * </li>
         * <li><p>The command execution was interrupted: The command execution was interrupted.</p>
         * </li>
         * <li><p>The command execution is complete, but the exit code is not 0: The command execution is complete, but the exit code is not 0.</p>
         * </li>
         * <li><p>The instance was released while the file was being sent: The instance was released while the file was being sent.</p>
         * </li>
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
         * <li><p>On a Linux instance, this is the exit code of the Shell process.</p>
         * </li>
         * <li><p>On a Windows instance, this is the exit code of the Batch or PowerShell process.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The time when the execution was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The execution status of the command on a single instance. Valid values:</p>
         * <ul>
         * <li><p>Pending: The system is verifying or sending the command.</p>
         * </li>
         * <li><p>Invalid: The specified command type or parameter is incorrect.</p>
         * </li>
         * <li><p>Aborted: Failed to send the command to the instance. The instance must be in the Running state and the command must be sent within 1 minute.</p>
         * </li>
         * <li><p>Running: The command is running on the instance.</p>
         * </li>
         * <li><p>Success:</p>
         * <ul>
         * <li><p>For a one-time command: The execution is complete and the exit code is 0.</p>
         * </li>
         * <li><p>For a scheduled command: The last execution was successful with an exit code of 0, and the specified period is over.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Failed:</p>
         * <ul>
         * <li><p>For a one-time command: The execution is complete, but the exit code is not 0.</p>
         * </li>
         * <li><p>For a scheduled command: The last execution was successful, but the exit code was not 0. The scheduled execution will be aborted.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Error: An exception occurred during the command execution and the execution cannot continue.</p>
         * </li>
         * <li><p>Timeout: The command execution timed out.</p>
         * </li>
         * <li><p>Cancelled: The command execution was canceled. The command was not started.</p>
         * </li>
         * <li><p>Stopping: The task is being stopped.</p>
         * </li>
         * <li><p>Terminated: The command was terminated during execution.</p>
         * </li>
         * <li><p>Scheduled:</p>
         * <ul>
         * <li><p>For a one-time command: This status is not applicable and will not occur.</p>
         * </li>
         * <li><p>For a scheduled command: The command is waiting to run.</p>
         * </li>
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
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-lbj36wkp70b</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The execution status of the command on a single instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("NodeInvokeStatus")
        public String nodeInvokeStatus;

        /**
         * <p>The output of the command.</p>
         * <ul>
         * <li><p>If \<code>ContentEncoding\\</code> is set to \<code>PlainText\\</code>, the original output is returned.</p>
         * </li>
         * <li><p>If \<code>ContentEncoding\\</code> is set to \<code>Base64\\</code>, the Base64-encoded output is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OutPutTestmsg</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times the command has been executed on the instance.</p>
         * <ul>
         * <li><p>If the command is a one-time execution, the value is 0 or 1.</p>
         * </li>
         * <li><p>If the command is a scheduled execution, the value is the number of times the command has been executed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:55Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when \<code>StopInvocation\\</code> was called to stop the command execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:55Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>Indicates whether the command will be automatically run in the future. Valid values:</p>
         * <ul>
         * <li><p>true: The command is a scheduled command. The <code>RepeatMode</code> parameter was set to <code>Period</code>, <code>NextRebootOnly</code>, or <code>EveryReboot</code> when <code>RunCommand</code> or <code>InvokeCommand</code> was called.</p>
         * </li>
         * <li><p>false (default): The command is a one-time command or has finished.</p>
         * <ul>
         * <li><p>The <code>RepeatMode</code> parameter was set to <code>Once</code> when <code>RunCommand</code> or <code>InvokeCommand</code> was called.</p>
         * </li>
         * <li><p>The command was canceled, stopped, or has finished running.</p>
         * </li>
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
         * <p>The time when the record was updated.</p>
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
         * <p>The command execution records on the nodes.</p>
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
         * <p>The content of the command.</p>
         * <ul>
         * <li><p>If \<code>ContentEncoding\\</code> is set to \<code>PlainText\\</code>, the original script content is returned.</p>
         * </li>
         * <li><p>If \<code>ContentEncoding\\</code> is set to \<code>Base64\\</code>, the Base64-encoded script content is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cnBtIC1xYSB8IGdyZXAgdnNm****</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The description of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
         * <p>The name of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>CommandTestName</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-19T09:15:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The cron expression for the scheduled command.</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <p>The overall execution status of the command. This status is determined by the execution status on all involved instances. Valid values:</p>
         * <ul>
         * <li><p>Pending: The system is verifying or sending the command. If the command is in the Pending state on at least one instance, the overall status is Pending.</p>
         * </li>
         * <li><p>Scheduled: The scheduled command is sent and is waiting to run. If the command is in the Scheduled state on at least one instance, the overall status is Scheduled.</p>
         * </li>
         * <li><p>Running: The command is running on the instances. If the command is in the Running state on at least one instance, the overall status is Running.</p>
         * </li>
         * <li><p>Success: The command was successfully executed. The command status on each instance is Stopped or Success, and the status on at least one instance is Success.</p>
         * <ul>
         * <li><p>For one-time tasks: The command execution is complete and the exit code is 0.</p>
         * </li>
         * <li><p>For scheduled tasks: The last execution was successful with an exit code of 0, and all scheduled executions are complete.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Failed: The command execution failed. The command status on each instance is Stopped or Failed. The overall status is Failed if the command status on one or more instances is one of the following:</p>
         * <ul>
         * <li><p>The command failed to be verified (Invalid).</p>
         * </li>
         * <li><p>The command failed to be sent (Aborted).</p>
         * </li>
         * <li><p>The command execution is complete, but the exit code is not 0 (Failed).</p>
         * </li>
         * <li><p>The command timed out (Timeout).</p>
         * </li>
         * <li><p>An error occurred during the command execution (Error).</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Stopping: The task is being stopped. If the command is in the Stopping state on at least one instance, the overall status is Stopping.</p>
         * </li>
         * <li><p>Stopped: The task was stopped. The overall status is Stopped if the command is in the Stopped state on all instances. The overall status is Stopped if the command status on the instances is one of the following:</p>
         * <ul>
         * <li><p>The task was canceled (Cancelled).</p>
         * </li>
         * <li><p>The task was terminated (Terminated).</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>PartialFailed: The command was successfully executed on some instances but failed on others. The overall status is PartialFailed if the command status on the instances is Success, Failed, or Stopped.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The <code>InvokeStatus</code> parameter has a similar meaning. However, check the value of this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The ID of the command execution.</p>
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
         * <p>The overall execution status of the command. This status is determined by the execution status on one or more instances. Valid values:</p>
         * <ul>
         * <li><p>Running:</p>
         * <ul>
         * <li><p>Scheduled execution: The status is always Running before you manually stop the scheduled command.</p>
         * </li>
         * <li><p>One-time execution: The overall status is Running if a command process is in progress.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Finished:</p>
         * <ul>
         * <li><p>Scheduled execution: A command process cannot be in the Finished state.</p>
         * </li>
         * <li><p>One-time execution: The execution is complete on all instances. Alternatively, the command process is manually stopped on some instances and the execution is complete on the other instances.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Failed:</p>
         * <ul>
         * <li><p>Scheduled execution: A command process cannot be in the Failed state.</p>
         * </li>
         * <li><p>One-time execution: The execution failed on all instances.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Stopped: The command is stopped.</p>
         * </li>
         * <li><p>Stopping: The command is being stopped.</p>
         * </li>
         * <li><p>PartialFailed: The execution failed on some instances. This value is not returned if you specify the <code>NodeId</code> parameter.</p>
         * </li>
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
         * <li><p>Once: The command is immediately executed.</p>
         * </li>
         * <li><p>Period: The command is executed on a schedule.</p>
         * </li>
         * <li><p>NextRebootOnly: The command is automatically executed the next time the instance starts.</p>
         * </li>
         * <li><p>EveryReboot: The command is automatically executed every time the instance starts.</p>
         * </li>
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
         * <p>The name of the user who runs the command.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The directory where the command is run on the instance.</p>
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
         * <p>The command execution records.</p>
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
