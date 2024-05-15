// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    /**
     * <p>Details about the command executions.</p>
     */
    @NameInMap("Invocations")
    public DescribeInvocationsResponseBodyInvocations invocations;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the commands.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

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

    public DescribeInvocationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInvocationsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInvocationsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeInvocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvocationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance extends TeaModel {
        /**
         * <p>The time when the command task was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The size of the Output text that was truncated and discarded because the Output value exceeded 24 KB in size.</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The error code for the failure to send or run the command. Valid values:</p>
         * <br>
         * <p>*   If this parameter is empty, the command was run as expected.</p>
         * <p>*   InstanceNotExists: The specified instance did not exist or was released.</p>
         * <p>*   InstanceReleased: The instance was released while the command was being run.</p>
         * <p>*   InstanceNotRunning: The instance was not running when the command started to be run.</p>
         * <p>*   CommandNotApplicable: The command was not applicable to the specified instance.</p>
         * <p>*   AccountNotExists: The specified account did not exist.</p>
         * <p>*   DirectoryNotExists: The specified directory did not exist.</p>
         * <p>*   BadCronExpression: The specified cron expression for the execution schedule was invalid.</p>
         * <p>*   ClientNotRunning: Cloud Assistant Agent was not running.</p>
         * <p>*   ClientNotResponse: Cloud Assistant Agent did not respond.</p>
         * <p>*   ClientIsUpgrading: Cloud Assistant Agent was being upgraded.</p>
         * <p>*   ClientNeedUpgrade: Cloud Assistant Agent needed to be upgraded.</p>
         * <p>*   DeliveryTimeout: The request to send the command timed out.</p>
         * <p>*   ExecutionTimeout: The execution timed out.</p>
         * <p>*   ExecutionException: An exception occurred while the command was being run.</p>
         * <p>*   ExecutionInterrupted: The command task was interrupted.</p>
         * <p>*   ExitCodeNonzero: The execution was complete, but the exit code was not 0.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the command failed to be sent or run. Valid values:</p>
         * <br>
         * <p>*   If this parameter is empty, the command was run as expected.</p>
         * <p>*   the specified instance does not exists</p>
         * <p>*   the instance has released when create task</p>
         * <p>*   the instance is not running when create task</p>
         * <p>*   the command is not applicable</p>
         * <p>*   the specified account does not exists</p>
         * <p>*   the specified directory does not exists</p>
         * <p>*   the cron job expression is invalid</p>
         * <p>*   the aliyun service is not running on the instance</p>
         * <p>*   the aliyun service in the instance does not response</p>
         * <p>*   the aliyun service in the instance is upgrading now</p>
         * <p>*   the aliyun service in the instance need upgrade</p>
         * <p>*   the command delivery has been timeout</p>
         * <p>*   the command execution has been timeout</p>
         * <p>*   the command execution got an exception</p>
         * <p>*   the command execution has been interrupted</p>
         * <p>*   the command execution exit code is not zero</p>
         * <p>*   the specified instance has been released</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the execution. Valid values:</p>
         * <br>
         * <p>*   For Linux instances, the value is the exit code of the shell process.</p>
         * <p>*   For Windows instances, the value is the exit code of the batch or PowerShell process.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the execution ended.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The execution state on a single instance.</p>
         * <br>
         * <p>>  We recommend that you ignore this parameter and check the value of `InvocationStatus` in the response to obtain the execution state.</p>
         */
        @NameInMap("InstanceInvokeStatus")
        public String instanceInvokeStatus;

        /**
         * <p>The execution state on a single instance. Valid values:</p>
         * <br>
         * <p>*   Pending: The command was being verified or sent.</p>
         * <br>
         * <p>*   Invalid: The specified command type or parameter was invalid.</p>
         * <br>
         * <p>*   Aborted: The command failed to be sent to the instance. To send a command to an instance, make sure that the instance is in the Running state and the command can be sent to the instance within 1 minute.</p>
         * <br>
         * <p>*   Running: The command was being run on the instance.</p>
         * <br>
         * <p>*   Success:</p>
         * <br>
         * <p>    *   One-time task: The execution was complete, and the exit code was 0.</p>
         * <p>    *   Scheduled task: The last execution was complete, the exit code was 0, and the specified period ended.</p>
         * <br>
         * <p>*   Failed:</p>
         * <br>
         * <p>    *   One-time task: The execution was complete, but the exit code was not 0.</p>
         * <p>    *   Scheduled task: The last execution was complete, but the exit code was not 0. The specified period is about to end.</p>
         * <br>
         * <p>*   Error: The execution cannot proceed due to an exception.</p>
         * <br>
         * <p>*   Timeout: The execution timed out.</p>
         * <br>
         * <p>*   Cancelled: The execution was canceled, and the command was not run.</p>
         * <br>
         * <p>*   Stopping: The command task was being stopped.</p>
         * <br>
         * <p>*   Terminated: The execution was terminated before completion.</p>
         * <br>
         * <p>*   Scheduled:</p>
         * <br>
         * <p>    *   One-time task: The execution state can never be Scheduled.</p>
         * <p>    *   Scheduled task: The command was waiting to be run.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The command output.</p>
         * <br>
         * <p>*   If ContentEncoding is set to PlainText in the request, the original command output is returned.</p>
         * <p>*   If ContentEncoding is set to Base64 in the request, the Base64-encoded command output is returned.</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times that the command was run on the instance.</p>
         * <br>
         * <p>*   If the command is set to run only once, the value is 0 or 1.</p>
         * <p>*   If the command is set to run on a schedule, the value is the number of times that the command has been run on the instance.</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>The time when the command started to be run on the instance.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when the command task was stopped. If you call the `StopInvocation` operation to stop the command task, the value of this parameter is the time when the operation is called.</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>Indicates whether the command is to be automatically run.</p>
         */
        @NameInMap("Timed")
        public Boolean timed;

        /**
         * <p>The time when the execution status was updated.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance self = new DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setDropped(Integer dropped) {
            this.dropped = dropped;
            return this;
        }
        public Integer getDropped() {
            return this.dropped;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setInstanceInvokeStatus(String instanceInvokeStatus) {
            this.instanceInvokeStatus = instanceInvokeStatus;
            return this;
        }
        public String getInstanceInvokeStatus() {
            return this.instanceInvokeStatus;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setRepeats(Integer repeats) {
            this.repeats = repeats;
            return this;
        }
        public Integer getRepeats() {
            return this.repeats;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setTimed(Boolean timed) {
            this.timed = timed;
            return this;
        }
        public Boolean getTimed() {
            return this.timed;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances extends TeaModel {
        @NameInMap("InvokeInstance")
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance> invokeInstance;

        public static DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances self = new DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances setInvokeInstance(java.util.List<DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance> invokeInstance) {
            this.invokeInstance = invokeInstance;
            return this;
        }
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

    }

    public static class DescribeInvocationsResponseBodyInvocationsInvocationTagsTag extends TeaModel {
        /**
         * <p>The tag key of the command task.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the command task.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeInvocationsResponseBodyInvocationsInvocationTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocationsInvocationTagsTag self = new DescribeInvocationsResponseBodyInvocationsInvocationTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeInvocationsResponseBodyInvocationsInvocationTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvocationTagsTag> tag;

        public static DescribeInvocationsResponseBodyInvocationsInvocationTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsResponseBodyInvocationsInvocationTags self = new DescribeInvocationsResponseBodyInvocationsInvocationTags();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationTags setTag(java.util.List<DescribeInvocationsResponseBodyInvocationsInvocationTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInvocationsResponseBodyInvocationsInvocationTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInvocationsResponseBodyInvocationsInvocation extends TeaModel {
        /**
         * <p>The command content.</p>
         * <br>
         * <p>*   If ContentEncoding is set to PlainText in the request, the original command content is returned.</p>
         * <p>*   If ContentEncoding is set to Base64 in the request, the Base64-encoded command content is returned.</p>
         */
        @NameInMap("CommandContent")
        public String commandContent;

        /**
         * <p>The command description.</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
         * <p>The command ID.</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>The command name.</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        /**
         * <p>The command type.</p>
         */
        @NameInMap("CommandType")
        public String commandType;

        /**
         * <p>The container ID.</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The container name.</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The time when the command task was created.</p>
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
         * <br>
         * <p>*   Pending: The command was being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
         * <br>
         * <p>*   Scheduled: The command that is set to run on a schedule was sent and waiting to be run. When the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</p>
         * <br>
         * <p>*   Running: The command was being run on the instances. When the execution state on at least one instance is Running, the overall execution state is Running.</p>
         * <br>
         * <p>*   Success: When the execution state on at least one instance is Success and the execution state on the other instances is Stopped or Success, the overall execution state is Success.</p>
         * <br>
         * <p>    *   One-time task: The execution was complete, and the exit code was 0.</p>
         * <p>    *   Scheduled task: The last execution was complete, the exit code was 0, and the specified period ended.</p>
         * <br>
         * <p>*   Failed: When the execution state on all instances is Stopped or Failed, the overall execution state is Failed. When the execution state on an instance is one of the following values, Failed is returned as the overall execution state:</p>
         * <br>
         * <p>    *   Invalid: The command was invalid.</p>
         * <p>    *   Aborted: The command failed to be sent.</p>
         * <p>    *   Failed: The execution was complete, but the exit code was not 0.</p>
         * <p>    *   Timeout: The execution timed out.</p>
         * <p>    *   Error: An error occurred while the command was being run.</p>
         * <br>
         * <p>*   Stopping: The command task was being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.</p>
         * <br>
         * <p>*   Stopped: The task was stopped. When the execution state on all instances is Stopped, the overall execution state is Stopped. When the execution state on an instance is one of the following values, Stopped is returned as the overall execution state:</p>
         * <br>
         * <p>    *   Cancelled: The task was canceled.</p>
         * <p>    *   Terminated: The task was terminated.</p>
         * <br>
         * <p>*   PartialFailed: The execution was complete on some instances and failed on other instances. When the execution state is Success on some instances and is Failed or Stopped on the other instances, the overall execution state is PartialFailed.</p>
         * <br>
         * <p>>  `InvokeStatus` in the response functions similarly to this parameter. We recommend that you check the value of this parameter.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The ID of the command task.</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The instances on which the command was run.</p>
         */
        @NameInMap("InvokeInstances")
        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances invokeInstances;

        /**
         * <p>The overall execution state of the command task.</p>
         * <br>
         * <p>>  We recommend that you ignore this parameter and check the value of `InvocationStatus` in the response to obtain the overall execution state.</p>
         */
        @NameInMap("InvokeStatus")
        public String invokeStatus;

        /**
         * <p>The custom parameters in the command.</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The execution mode of the command. Valid values:</p>
         * <br>
         * <p>*   Once: The command is immediately run.</p>
         * <p>*   Period: The command is run on a schedule.</p>
         * <p>*   NextRebootOnly: The command is run the next time the instances start.</p>
         * <p>*   EveryReboot: The command is run every time the instances start.</p>
         */
        @NameInMap("RepeatMode")
        public String repeatMode;

        /**
         * <p>The tags of the command task.</p>
         */
        @NameInMap("Tags")
        public DescribeInvocationsResponseBodyInvocationsInvocationTags tags;

        /**
         * <p>Indicates how the task was stopped. Valid values:</p>
         * <br>
         * <p>*   Process: The process of the command was stopped.</p>
         * <p>*   ProcessTree: The process tree was stopped. In this case, the process of the command and all subprocesses of the process were stopped.</p>
         */
        @NameInMap("TerminationMode")
        public String terminationMode;

        /**
         * <p>Indicates whether the command is to be automatically run.</p>
         */
        @NameInMap("Timed")
        public Boolean timed;

        /**
         * <p>The maximum timeout period for the command execution. Unit: seconds.</p>
         * <br>
         * <p>When a command cannot be run, the command execution times out. When a command execution times out, Cloud Assistant Agent forcefully terminates the command process by canceling the process ID (PID) of the command.</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>The username used to run the command on the instances.</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The execution path of the command.</p>
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

        public DescribeInvocationsResponseBodyInvocationsInvocation setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setCommandName(String commandName) {
            this.commandName = commandName;
            return this;
        }
        public String getCommandName() {
            return this.commandName;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
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

        public DescribeInvocationsResponseBodyInvocationsInvocation setInvokeInstances(DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances invokeInstances) {
            this.invokeInstances = invokeInstances;
            return this;
        }
        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances getInvokeInstances() {
            return this.invokeInstances;
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

        public DescribeInvocationsResponseBodyInvocationsInvocation setTags(DescribeInvocationsResponseBodyInvocationsInvocationTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInvocationsResponseBodyInvocationsInvocationTags getTags() {
            return this.tags;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setTerminationMode(String terminationMode) {
            this.terminationMode = terminationMode;
            return this;
        }
        public String getTerminationMode() {
            return this.terminationMode;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setTimed(Boolean timed) {
            this.timed = timed;
            return this;
        }
        public Boolean getTimed() {
            return this.timed;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocation setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
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
