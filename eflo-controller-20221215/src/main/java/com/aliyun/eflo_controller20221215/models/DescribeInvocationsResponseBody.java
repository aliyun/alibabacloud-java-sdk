// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>The command execution record.</p>
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
         * <p>The start time of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The size of the Output text that was truncated and discarded because the Output value exceeded 24 KB in size.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The error code returned when the file failed to be sent to the instance. Valid values:</p>
         * <ul>
         * <li>Null: The file is sent to the instance.</li>
         * <li>NodeNotExists: The specified instance does not exist or has been released.</li>
         * <li>NodeReleased: The instance was released while the file was being sent.</li>
         * <li>NodeNotRunning: The instance was not running while the file sending task was being created.</li>
         * <li>AccountNotExists: The specified account does not exist.</li>
         * <li>ClientNotRunning: Cloud Assistant Agent is not running.</li>
         * <li>ClientNotResponse: Cloud Assistant Agent does not respond.</li>
         * <li>ClientIsUpgrading: Cloud Assistant Agent is being upgraded.</li>
         * <li>ClientNeedUpgrade: Cloud Assistant Agent needs to be upgraded.</li>
         * <li>DeliveryTimeout: The file sending task timed out.</li>
         * <li>FileCreateFail: The file failed to be created.</li>
         * <li>FileAlreadyExists: A file with the same name exists in the specified directory.</li>
         * <li>FileContentInvalid: The file content is invalid.</li>
         * <li>FileNameInvalid: The file name is invalid.</li>
         * <li>FilePathInvalid: The specified directory is invalid.</li>
         * <li>FileAuthorityInvalid: The specified permissions on the file are invalid.</li>
         * <li>UserGroupNotExists: The specified user group does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NodeNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the command cannot be sent or run.</p>
         * <ul>
         * <li>If this parameter is empty, the command was run as expected.</li>
         * <li>the specified node does not exists: The specified instance does not exist or is released.</li>
         * <li>the node has node when create task: The instance is released when the command is being run.</li>
         * <li>the node is not running when create task: The instance is not in the Running state while the command is being run.</li>
         * <li>the command is not applicable: The command is not applicable to the specified instance.</li>
         * <li>the specified account does not exists: The specified account does not exist.</li>
         * <li>the specified directory does not exists: The specified directory does not exist.</li>
         * <li>the cron job expression is invalid: The cron expression that specifies the execution time is invalid.</li>
         * <li>the aliyun service is not running on the instance: Cloud Assistant Agent is not running.</li>
         * <li>the aliyun service in the instance does not response: Cloud Assistant Agent does not respond.</li>
         * <li>the aliyun service in the node is upgrading now: Cloud Assistant Agent is being upgraded.</li>
         * <li>the aliyun service in the node need upgrade: Cloud Assistant Agent needs to be upgraded.</li>
         * <li>the command delivery has been timeout: The request to send the command timed out.</li>
         * <li>the command execution has been timeout: The command execution timed out.</li>
         * <li>the command execution got an exception: An exception occurred when the command is being run.</li>
         * <li>the command execution has been interrupted: The command execution is interrupted.</li>
         * <li>the command execution exit code is not zero: The command execution completes, but the exit code is not 0.</li>
         * <li>the specified node has been released: The instance is released while the file is being sent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>the specified node does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the execution. Valid values:</p>
         * <ul>
         * <li>For Linux instances, the value is the exit code of the shell process.</li>
         * <li>For Windows instances, the value is the exit code of the batch or PowerShell process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Integer exitCode;

        /**
         * <p>The end time of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The execution status of the command on a single instance. Valid values:</p>
         * <ul>
         * <li><p>Pending: The command was being verified or sent.</p>
         * </li>
         * <li><p>Invalid: The specified command type or parameter is invalid.</p>
         * </li>
         * <li><p>Aborted: The command failed to be sent to the instance. To send a command to an instance, make sure that the instance is in the Running state and the command can be sent to the instance within 1 minute.</p>
         * </li>
         * <li><p>Running: The command is being run on the instance.</p>
         * </li>
         * <li><p>Success:</p>
         * <ul>
         * <li>One-time task: The execution was complete, and the exit code was 0.</li>
         * <li>Recurring execution: The previous occurrence of the execution is complete, and the exit code is 0. The specified recurring period during which the command is run ends.</li>
         * </ul>
         * </li>
         * <li><p>Failed:</p>
         * <ul>
         * <li>One-time task: The execution was complete, but the exit code was not 0.</li>
         * <li>Recurring execution: The previous occurrence of the execution is complete, but the exit code is not 0. The specified recurring period during which the command is run is about to end.</li>
         * </ul>
         * </li>
         * <li><p>Error: The execution cannot proceed due to an exception.</p>
         * </li>
         * <li><p>Timeout: The execution timed out.</p>
         * </li>
         * <li><p>Cancelled: The execution was canceled before it started.</p>
         * </li>
         * <li><p>Stopping: The command task is being stopped.</p>
         * </li>
         * <li><p>Terminated: The execution was terminated before completion.</p>
         * </li>
         * <li><p>Scheduled:</p>
         * <ul>
         * <li>One-time task: The execution state can never be Scheduled.</li>
         * <li>Recurring execution: The command is waiting to be run.</li>
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
         * <p>The execution status of the command on a single instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("NodeInvokeStatus")
        public String nodeInvokeStatus;

        /**
         * <p>The command output.</p>
         * <ul>
         * <li>If ContentEncoding is set to PlainText in the request, the original command output is returned.</li>
         * <li>If ContentEncoding is set to Base64 in the request, the Base64-encoded command output is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OutPutTestmsg</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times that the command was run on the instance.</p>
         * <ul>
         * <li>If the command is set to run only once, the value is 0 or 1.</li>
         * <li>If the command is set to run on a schedule, the value is the number of times that the command has been run on the instance.</li>
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
         * <p>The time when the command task was stopped. If you call the StopInvocation operation to stop the command task, the value of this parameter is the time when the operation is called.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:55Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>Indicates whether the command is to be automatically run. Valid values:</p>
         * <ul>
         * <li><p>true: The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Period</code>, <code>NextRebootOnly</code>, or <code>EveryReboot</code>.</p>
         * </li>
         * <li><p>false (default): The command meets the following requirements.</p>
         * <ul>
         * <li>The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Once</code>.</li>
         * <li>The command task is canceled, stopped, or completed.</li>
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
         * <p>The update time of the execution.</p>
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
         * <p>The command execution records of the node.</p>
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
         * <p>The executed command.</p>
         * <ul>
         * <li>If ContentEncoding is set to PlainText in the request, the original command content is returned.</li>
         * <li>If ContentEncoding is set to Base64 in the request, the Base64-encoded command content is returned.</li>
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
         * <p>The time when the command task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-19T09:15:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The schedule on which the command was run.</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <p>The overall execution state of the command task. The value of this parameter depends on the execution states of the command task on all the involved instances. Valid values:</p>
         * <ul>
         * <li><p>Pending: The command was being verified or sent. If the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
         * </li>
         * <li><p>Scheduled: The command that is set to run on a schedule is sent and waiting to be run. If the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</p>
         * </li>
         * <li><p>Running: The command is being run on the instance. When the execution state on at least one instance is Running, the overall execution state is Running.</p>
         * </li>
         * <li><p>Success: When the execution state on at least one instance is Success and the execution state on the other instances is Stopped or Success, the overall execution state is Success.</p>
         * <ul>
         * <li>One-time task: The execution is complete, and the exit code is 0.</li>
         * <li>Scheduled task: The last execution was complete, the exit code was 0, and the specified period ended.</li>
         * </ul>
         * </li>
         * <li><p>Failed: When the execution state on all instances is Stopped or Failed, the overall execution state is Failed. When the execution state on an instance is one of the following values, Failed is returned as the overall execution state:</p>
         * <ul>
         * <li>Invalid: The command is invalid.</li>
         * <li>Aborted: The command failed to be sent.</li>
         * <li>Failed: The execution was complete, but the exit code was not 0.</li>
         * <li>Timeout: The execution timed out.</li>
         * <li>Error: An error occurred while the command was being run.</li>
         * </ul>
         * </li>
         * <li><p>Stopping: The command task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.</p>
         * </li>
         * <li><p>Stopped: The task was stopped. When the execution state on all instances is Stopped, the overall execution state is Stopped. When the execution state on an instance is one of the following values, Stopped is returned as the overall execution state:</p>
         * <ul>
         * <li>Cancelled: The task was canceled.</li>
         * <li>Terminated: The task was terminated.</li>
         * </ul>
         * </li>
         * <li><p>PartialFailed: The execution was complete on some instances and failed on other instances. When the execution state is Success on some instances and is Failed or Stopped on the other instances, the overall execution state is PartialFailed.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> The value of the <code>InvokeStatus</code> response parameter is similar to the value of InvocationStatus. We recommend that you ignore InvokeStatus and check the value of InvocationStatus.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The execution ID.</p>
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
         * <p>The overall execution status of the command task. The value of this parameter depends on the execution states of the command task on all involved instances. Valid values:</p>
         * <ul>
         * <li><p>Running:</p>
         * <ul>
         * <li>Scheduled task: Before you stop the scheduled execution of the command, the overall execution state is always Running.</li>
         * <li>One-time task: If the command is being run on instances, the overall execution state is Running.</li>
         * </ul>
         * </li>
         * <li><p>Finished:</p>
         * <ul>
         * <li>Scheduled task: The overall execution state can never be Finished.</li>
         * <li>One-time task: The execution is complete on all instances, or the execution is stopped on some instances and is complete on the other instances.</li>
         * </ul>
         * </li>
         * <li><p>Failed:</p>
         * <ul>
         * <li>Scheduled task: The overall execution state can never be Failed.</li>
         * <li>One-time task: The execution failed on all instances.</li>
         * </ul>
         * </li>
         * <li><p>Stopped: The task is stopped.</p>
         * </li>
         * <li><p>Stopping: The task is being stopped.</p>
         * </li>
         * <li><p>PartialFailed: The task fails on some instances. If you specify both this parameter and <code>InstanceId</code>, this parameter does not take effect.</p>
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
         * <li>Once: The command is run immediately.</li>
         * <li>Period: The command is run on a schedule.</li>
         * <li>NextRebootOnly: The command is run the next time the instances start.</li>
         * <li>EveryReboot: runs the command every time the instances start.</li>
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
         * <p>The username that is used to run the command.</p>
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
         * <p>The file sending records.</p>
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
