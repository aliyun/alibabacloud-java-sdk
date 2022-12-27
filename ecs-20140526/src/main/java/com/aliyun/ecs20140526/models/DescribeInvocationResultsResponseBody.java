// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsResponseBody extends TeaModel {
    // Details of the execution result.
    @NameInMap("Invocation")
    public DescribeInvocationResultsResponseBodyInvocation invocation;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInvocationResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultsResponseBody self = new DescribeInvocationResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultsResponseBody setInvocation(DescribeInvocationResultsResponseBodyInvocation invocation) {
        this.invocation = invocation;
        return this;
    }
    public DescribeInvocationResultsResponseBodyInvocation getInvocation() {
        return this.invocation;
    }

    public DescribeInvocationResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag extends TeaModel {
        // The tag key of the command.
        @NameInMap("TagKey")
        public String tagKey;

        // The tag value of the command.
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag self = new DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag> tag;

        public static DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags self = new DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags setTag(java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult extends TeaModel {
        // The ID of the command.
        @NameInMap("CommandId")
        public String commandId;

        // The ID of the container.
        @NameInMap("ContainerId")
        public String containerId;

        // The name of the container.
        @NameInMap("ContainerName")
        public String containerName;

        // The size of truncated and discarded text when the size of text in the `Output` response parameter is larger than 24 KB.
        @NameInMap("Dropped")
        public Integer dropped;

        // The error code returned when the command cannot be sent or run. Valid values:
        // 
        // *   If this parameter is empty, the command is run normally.
        // *   InstanceNotExists: The instance does not exist or has been released.
        // *   InstanceReleased: The instance is released while the command is being run.
        // *   InstanceNotRunning: The instance is not running while the command is being run.
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
        // *   ExecutionException: An exception has occurred while the command is being run.
        // *   ExecutionInterrupted: The execution is interrupted.
        // *   ExitCodeNonzero: The execution is complete, but the exit code is not 0.
        @NameInMap("ErrorCode")
        public String errorCode;

        // The error message returned when the command cannot be sent or run. Valid values:
        // 
        // *   If this parameter is empty, the command is run normally.
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

        // The exit code of the command execution.
        // 
        // *   For Linux instances, the value is the exit code of the shell command.
        // *   For Windows instances, the value is the exit code of the batch or PowerShell command.
        @NameInMap("ExitCode")
        public Long exitCode;

        // The completion time of the execution. If an execution times out, the completion time of the execution is subject to the value of the TimedOut parameter specified in the [CreateCommand](~~64844~~) operation.
        @NameInMap("FinishedTime")
        public String finishedTime;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The execution state on a single instance. Valid values:
        // 
        // *   Pending: The command is being verified or sent.
        // 
        // *   Invalid: The specified command type or parameter is invalid.
        // 
        // *   Aborted: The command failed to be sent. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.
        // 
        // *   Running: The command is being run on the instance.
        // 
        // *   Success:
        // 
        //     *   Command that is set to run only once: The execution is complete, and the exit code is 0.
        //     *   Command that is set to run on a schedule: The last execution succeeds, the exit code is 0, and the specified cycle ends.
        // 
        // *   Failed:
        // 
        //     *   Command that is set to run only once: The execution is complete, but the exit code is not 0.
        //     *   Command that is set to run on a schedule: The last execution is complete, the exit code is not 0, and the specified execution time is about to end.
        // 
        // *   Error: The execution cannot proceed due to an exception.
        // 
        // *   Timeout: The execution times out.
        // 
        // *   Cancelled: The execution is canceled, and the command is not run.
        // 
        // *   Stopping: The command that is running is being stopped.
        // 
        // *   Terminated: The command is terminated while it is being run.
        // 
        // *   Scheduled:
        // 
        //     *   Command that is set to run only once: The command is not applicable.
        //     *   Command that is set to run on a schedule: The command is waiting to be run.
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        // The ID of the command task.
        @NameInMap("InvokeId")
        public String invokeId;

        // The state of the execution.
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        // The command output.
        @NameInMap("Output")
        public String output;

        // The number of times that the command is run on the instance.
        // 
        // *   If the command is set to run only once on the instance, the value is 0 or 1.
        // *   If the command is set to run on a schedule on the instance, the value is the number of times that the command is run.
        @NameInMap("Repeats")
        public Integer repeats;

        // The time when the command started to be run on the instance.
        @NameInMap("StartTime")
        public String startTime;

        // The time when the command stopped being run on the instance. If you call the `StopInvocation` operation to manually stop the execution, the value is the time when you call the operation.
        @NameInMap("StopTime")
        public String stopTime;

        // The tags of the command.
        @NameInMap("Tags")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags tags;

        // The username that was used to run the command on the ECS instance.
        @NameInMap("Username")
        public String username;

        public static DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult self = new DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setCommandId(String commandId) {
            this.commandId = commandId;
            return this;
        }
        public String getCommandId() {
            return this.commandId;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setDropped(Integer dropped) {
            this.dropped = dropped;
            return this;
        }
        public Integer getDropped() {
            return this.dropped;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setInvokeRecordStatus(String invokeRecordStatus) {
            this.invokeRecordStatus = invokeRecordStatus;
            return this;
        }
        public String getInvokeRecordStatus() {
            return this.invokeRecordStatus;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setRepeats(Integer repeats) {
            this.repeats = repeats;
            return this;
        }
        public Integer getRepeats() {
            return this.repeats;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setTags(DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags getTags() {
            return this.tags;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeInvocationResultsResponseBodyInvocationInvocationResults extends TeaModel {
        @NameInMap("InvocationResult")
        public java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult> invocationResult;

        public static DescribeInvocationResultsResponseBodyInvocationInvocationResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocationInvocationResults self = new DescribeInvocationResultsResponseBodyInvocationInvocationResults();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResults setInvocationResult(java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult> invocationResult) {
            this.invocationResult = invocationResult;
            return this;
        }
        public java.util.List<DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult> getInvocationResult() {
            return this.invocationResult;
        }

    }

    public static class DescribeInvocationResultsResponseBodyInvocation extends TeaModel {
        // The execution results.
        @NameInMap("InvocationResults")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResults invocationResults;

        // The page number of the returned page.
        @NameInMap("PageNumber")
        public Long pageNumber;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Long pageSize;

        // The total number of the commands.
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeInvocationResultsResponseBodyInvocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsResponseBodyInvocation self = new DescribeInvocationResultsResponseBodyInvocation();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsResponseBodyInvocation setInvocationResults(DescribeInvocationResultsResponseBodyInvocationInvocationResults invocationResults) {
            this.invocationResults = invocationResults;
            return this;
        }
        public DescribeInvocationResultsResponseBodyInvocationInvocationResults getInvocationResults() {
            return this.invocationResults;
        }

        public DescribeInvocationResultsResponseBodyInvocation setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeInvocationResultsResponseBodyInvocation setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeInvocationResultsResponseBodyInvocation setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
