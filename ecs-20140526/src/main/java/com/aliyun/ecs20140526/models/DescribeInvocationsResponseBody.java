// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    // Details about the command executions.
    @NameInMap("Invocations")
    public DescribeInvocationsResponseBodyInvocations invocations;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of the commands.
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
        // The start time of the execution.
        @NameInMap("CreationTime")
        public String creationTime;

        // The size of the Output text that is truncated and discarded when the Output value exceeds 24 KB in size.
        @NameInMap("Dropped")
        public Integer dropped;

        // The code that indicates why the command failed to be sent or run. Valid values:
        // 
        // *   If this parameter is empty, the execution is normal.
        // *   InstanceNotExists: The instance does not exist or is released.
        // *   InstanceReleased: The instance was released while the command was being run on the instance.
        // *   InstanceNotRunning: The instance was not in the Running state while the command started to be run.
        // *   CommandNotApplicable: The command is not applicable to the specified instance.
        // *   AccountNotExists: The specified account does not exist.
        // *   DirectoryNotExists: The specified directory does not exist.
        // *   BadCronExpression: The specified cron expression for the execution schedule is invalid.
        // *   ClientNotRunning: The Cloud Assistant client is not running.
        // *   ClientNotResponse: The Cloud Assistant client does not respond.
        // *   ClientIsUpgrading: The Cloud Assistant client is being upgraded.
        // *   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.
        // *   DeliveryTimeout: The request to send the command has timed out.
        // *   ExecutionTimeout: The execution has timed out.
        // *   ExecutionException: An exception occurred while the command was being run.
        // *   ExecutionInterrupted: The execution was interrupted.
        // *   ExitCodeNonzero: The execution is complete, but the exit code is not 0.
        @NameInMap("ErrorCode")
        public String errorCode;

        // Details about the reason why the command failed to be sent or run. Valid values:
        // 
        // *   If this parameter is empty, the execution is normal.
        // *   the specified instance does not exists
        // *   the instance has released when create task
        // *   the instance is not running when create task
        // *   the command is not applicable
        // *   the specified account does not exists
        // *   the specified directory does not exists
        // *   the cron job expression is invalid
        // *   the aliyun service is not running on the instance
        // *   the aliyun service in the instance does not response
        // *   the aliyun service in the instance is upgrading now
        // *   the aliyun service in the instance need upgrade
        // *   the command delivery has been timeout
        // *   the command execution has been timeout
        // *   the command execution got an exception
        // *   the command execution has been interrupted
        // *   the command execution exit code is not zero
        @NameInMap("ErrorInfo")
        public String errorInfo;

        // The exit code of the execution. Valid values:
        // 
        // *   For Linux instances, the exit code is the exit code of the shell process.
        // *   For Windows instances, the exit code is the exit code of the batch or PowerShell process.
        @NameInMap("ExitCode")
        public Long exitCode;

        // The end time of the execution.
        @NameInMap("FinishTime")
        public String finishTime;

        // The ID of instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The execution state on a single instance.
        // 
        // >  We recommend that you ignore this parameter and check the value of the `InvocationStatus` response parameter for the overall execution state.
        @NameInMap("InstanceInvokeStatus")
        public String instanceInvokeStatus;

        // The execution state on a single instance. Valid values:
        // 
        // *   Pending: The command is being verified or sent.
        // 
        // *   Invalid: The specified command type or parameter is invalid.
        // 
        // *   Aborted: The command fails to be sent. To send a command to an instance, make sure that the instance is in the Running state and the command is sent within 1 minute.
        // 
        // *   Running: The command is being run on the instances.
        // 
        // *   Success:
        // 
        //     *   Command that is set to run only once: The execution is complete, and the exit code is 0.
        //     *   Command that is set to run on a schedule: The previous execution is complete, and the exit code is 0. The specified period during which the command is run ends.
        // 
        // *   Failed:
        // 
        //     *   Command that is set to run only once: The execution is complete, but the exit code is not 0.
        //     *   Command that is set to run on a schedule: The previous execution is complete, but the exit code is not 0. The specified period during which the command is run is about to end.
        // 
        // *   Error: The execution cannot proceed due to an exception.
        // 
        // *   Timeout: The execution times out.
        // 
        // *   Cancelled: The execution is canceled, and the command is not started.
        // 
        // *   Stopping: The task is being stopped.
        // 
        // *   Terminated: The command is terminated while it is being run.
        // 
        // *   Scheduled:
        // 
        //     *   Command that is set to run only once: The overall execution state can never be Scheduled.
        //     *   Command that is set to run on a schedule: The command is waiting to run.
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        // The output of the command.
        @NameInMap("Output")
        public String output;

        // The number of times that the command is run on the instance.
        // 
        // *   If the execution is a one-time execution, the value is 0 or 1.
        // *   If the command is set to run on a schedule on the instance, the value is the number of times that the command is run.
        @NameInMap("Repeats")
        public Integer repeats;

        // The time when the command started to be run on the instance.
        @NameInMap("StartTime")
        public String startTime;

        // The time when the command stopped being run on the instance. If you call the `StopInvocation` operation to manually stop the execution, the value is the time when you call the operation.
        @NameInMap("StopTime")
        public String stopTime;

        // Indicates whether the command is to be automatically run.
        @NameInMap("Timed")
        public Boolean timed;

        // The time when the execution state was updated.
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
        // The tag key of the command.
        @NameInMap("TagKey")
        public String tagKey;

        // The tag value of the command.
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
        // The Base64-encoded command content.
        @NameInMap("CommandContent")
        public String commandContent;

        // The description of the command.
        @NameInMap("CommandDescription")
        public String commandDescription;

        // The ID of the command.
        @NameInMap("CommandId")
        public String commandId;

        // The name of the command.
        @NameInMap("CommandName")
        public String commandName;

        // The type of the command.
        @NameInMap("CommandType")
        public String commandType;

        // The ID of the container.
        @NameInMap("ContainerId")
        public String containerId;

        // The name of the container.
        @NameInMap("ContainerName")
        public String containerName;

        // The time when the task was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The schedule on which to run the command. For information about the value specifications, see [Cron expression](~~64769~~).
        @NameInMap("Frequency")
        public String frequency;

        // The overall execution status of the command. The value of this parameter depends on the execution status of all the involved instances. Valid values:
        // 
        // *   Pending: The command is being verified or sent. When the execution state is Pending for at least one instance, the overall execution state is Pending.
        // 
        // *   Scheduled: The scheduled command is sent and waiting to be run. When the execution state is Scheduled for at least one instance, the overall execution state is Scheduled.
        // 
        // *   Running: The command is being run on the instances. When the execution state is Running for at least one instance, the overall execution state is Running.
        // 
        // *   Success: When the execution state on at least one instance is Success and the execution state on other instances is Stopped or Success, the overall execution state is Success.
        // 
        //     *   Command that is set to run only once: The execution is complete, and the exit code is 0.
        //     *   Command that is set to run on a schedule: The last execution succeeds, and the exit code is 0. The specified period during which the command is run ends.
        // 
        // *   Failed: When the execution state of all instances is Stopped or Failed, the overall execution state is Failed. When the execution state of an instance is one of the following values, Failed is returned as the overall execution state:
        // 
        //     *   Invalid: The command is invalid.
        //     *   Aborted: The command failed to be sent.
        //     *   Failed: The command execution is complete, but the exit code is not 0.
        //     *   Timeout: The execution times out.
        //     *   Error: An error occurs when the command is being run.
        // 
        // *   Stopping: The task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.
        // 
        // *   Stopped: The task is stopped. When the execution state on all instances is Stopped, the overall execution state is Stopped. When the execution state on an instance is one of the following values, Stopped is returned as the overall execution state:
        // 
        //     *   Cancelled: The task is canceled.
        //     *   Terminated: The task is terminated.
        // 
        // *   PartialFailed: The execution succeeds on some instances and fails on other instances. When the execution state is Success on some instances and is Failed or Stopped on other instances, the overall execution state is PartialFailed.
        // 
        // >  The value of the `InvokeStatus` response parameter is similar to that of this parameter, but we recommend that you check this parameter value.
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        // The ID of the command task.
        @NameInMap("InvokeId")
        public String invokeId;

        // Details about the instances on which the command is run.
        @NameInMap("InvokeInstances")
        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances invokeInstances;

        // The overall execution state of the command.
        // 
        // >  We recommend that you ignore this parameter and check the value of the `InvocationStatus` response parameter for the overall execution state.
        @NameInMap("InvokeStatus")
        public String invokeStatus;

        // The custom parameters in the command.
        @NameInMap("Parameters")
        public String parameters;

        // The execution mode of the command. Valid values:
        // 
        // *   Once: The command is immediately run.
        // *   Period: The command is run on a schedule.
        // *   NextRebootOnly: The command is automatically run the next time the instance starts.
        // *   EveryReboot: The command is automatically run every time the instance starts.
        @NameInMap("RepeatMode")
        public String repeatMode;

        // The tags of the command.
        @NameInMap("Tags")
        public DescribeInvocationsResponseBodyInvocationsInvocationTags tags;

        // Indicates whether the command is to be automatically run.
        @NameInMap("Timed")
        public Boolean timed;

        // The maximum timeout period for the command execution on the instance. Unit: seconds.
        // 
        // When a command cannot be run, the command execution times out. When a command execution times out, the Cloud Assistant client forcefully terminates the command process by canceling the PID of the command.
        @NameInMap("Timeout")
        public Long timeout;

        // The username that was used to run the command on the instance.
        @NameInMap("Username")
        public String username;

        // The execution path of the command.
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
