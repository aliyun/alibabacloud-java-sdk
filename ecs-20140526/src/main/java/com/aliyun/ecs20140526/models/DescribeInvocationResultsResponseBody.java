// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsResponseBody extends TeaModel {
    /**
     * <p>Details about the execution results.</p>
     */
    @NameInMap("Invocation")
    public DescribeInvocationResultsResponseBodyInvocation invocation;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The command ID.</p>
         */
        @NameInMap("CommandId")
        public String commandId;

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
         * <p>The size of the Output text that was truncated and discarded because the `Output` value exceeded 24 KB in size.</p>
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
         * <p>*   ExecutionInterrupted: The execution was interrupted.</p>
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
         * <p>The exit code of the command task.</p>
         * <br>
         * <p>*   For Linux instances, the value is the exit code of the shell command.</p>
         * <p>*   For Windows instances, the value is the exit code of the batch or PowerShell command.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the command task was complete. If the command task times out, the end time is equal to the start time of the command task specified by `StartTime` plus the timeout period specified by `Timeout`.</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

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
         * <p>    *   Scheduled task: The last execution was complete, but the exit code was not 0. The specified period was about to end.</p>
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
         * <p>The ID of the command task.</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The execution state of the command. Valid values:</p>
         * <br>
         * <p>*   Running:</p>
         * <br>
         * <p>    *   Scheduled task: Before you stop the scheduled execution of the command, the execution state is always Running.</p>
         * <p>    *   One-time task: If the command is being run on instances, the execution state is Running.</p>
         * <br>
         * <p>*   Finished:</p>
         * <br>
         * <p>    *   Scheduled task: The execution state can never be Finished.</p>
         * <p>    *   One-time task: The execution was complete on all instances, or the execution was stopped on some instances and was complete on the other instances.</p>
         * <br>
         * <p>*   Failed:</p>
         * <br>
         * <p>    *   Scheduled task: The execution state can never be Failed.</p>
         * <p>    *   One-time task: The execution failed on all instances.</p>
         * <br>
         * <p>*   PartialFailed:</p>
         * <br>
         * <p>    *   Scheduled task: The execution state can never be PartialFailed.</p>
         * <p>    *   One-time task: The execution failed on some instances.</p>
         * <br>
         * <p>*   Stopped: The task was stopped.</p>
         * <br>
         * <p>*   Stopping: The task was being stopped.</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

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
         * <p>The tags of the command task.</p>
         */
        @NameInMap("Tags")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags tags;

        /**
         * <p>Indicates how the task was stopped. Valid values:</p>
         * <br>
         * <p>*   Process: The process of the command was stopped.</p>
         * <p>*   ProcessTree: The process tree was stopped. In this case, the process of the command and all subprocesses of the process were stopped.</p>
         */
        @NameInMap("TerminationMode")
        public String terminationMode;

        /**
         * <p>The username used to run the command on the instance.</p>
         */
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

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setTerminationMode(String terminationMode) {
            this.terminationMode = terminationMode;
            return this;
        }
        public String getTerminationMode() {
            return this.terminationMode;
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
        /**
         * <p>The execution results.</p>
         */
        @NameInMap("InvocationResults")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResults invocationResults;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of the commands.</p>
         */
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

        public DescribeInvocationResultsResponseBodyInvocation setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
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
