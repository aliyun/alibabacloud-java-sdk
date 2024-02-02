// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsResponseBody extends TeaModel {
    /**
     * <p>The information about the execution results.</p>
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
         * <p>The ID of the command.</p>
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
         * <p>The size of the text that is truncated and discarded when the `Output` value exceeds 24 KB in size.</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The error code returned when the command failed to be sent or run. Valid values:</p>
         * <br>
         * <p>*   If this parameter is left empty, the command is run normally.</p>
         * <p>*   InstanceNotExists: The instance does not exist or is released.</p>
         * <p>*   InstanceReleased: The instance is released while the command is being run.</p>
         * <p>*   InstanceNotRunning: The instance is not running while the command is being run.</p>
         * <p>*   CommandNotApplicable: The command is not applicable to the specified instance.</p>
         * <p>*   AccountNotExists: The specified account does not exist.</p>
         * <p>*   DirectoryNotExists: The specified directory does not exist.</p>
         * <p>*   BadCronExpression: The specified cron expression for the execution schedule is invalid.</p>
         * <p>*   ClientNotRunning: Cloud Assistant Agent is not running.</p>
         * <p>*   ClientNotResponse: Cloud Assistant Agent does not respond.</p>
         * <p>*   ClientIsUpgrading: Cloud Assistant Agent was being upgraded.</p>
         * <p>*   ClientNeedUpgrade: Cloud Assistant Agent must be upgraded.</p>
         * <p>*   DeliveryTimeout: The request to send the command timed out.</p>
         * <p>*   ExecutionTimeout: The request to send the command timed out.</p>
         * <p>*   ExecutionException: An exception occurred while the command is being run.</p>
         * <p>*   ExecutionInterrupted: The execution is interrupted.</p>
         * <p>*   ExitCodeNonzero: The execution is complete, but the exit code is not 0.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the command failed to be sent or run. Valid values:</p>
         * <br>
         * <p>*   If this parameter is left empty, the command is run normally.</p>
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
         * <p>*   the aliyun service in the instance is upgrading now</p>
         * <p>*   the command delivery has been timeout</p>
         * <p>*   the command execution has been timeout</p>
         * <p>*   the command execution got an exception</p>
         * <p>*   the command execution has been interrupted</p>
         * <p>*   the command execution exit code is not zero</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the command task.</p>
         * <br>
         * <p>*   For Linux instances, the exit code is the exit code of the shell command.</p>
         * <p>*   For Windows instances, the exit code is the exit code of the batch or PowerShell command.</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the command task was complete. If the command task times out, the end time is equal to the start time of the command task specified by StartTime plus the timeout period specified by Timeout in the [CreateCommand](~~64844~~) operation.</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The ID of the instance</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The execution state on a single instance. Valid values:</p>
         * <br>
         * <p>*   Pending: The command is being verified or sent.</p>
         * <br>
         * <p>*   Invalid: The specified command type or parameter is invalid.</p>
         * <br>
         * <p>*   Aborted: The command failed to be sent. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.</p>
         * <br>
         * <p>*   Running: The command is being run on the instance.</p>
         * <br>
         * <p>*   Success:</p>
         * <br>
         * <p>    *   Command that is set to run only once: The execution is complete, and the exit code is 0.</p>
         * <p>    *   Command that is set to run on a schedule: The previous execution is complete, and the exit code is 0. The specified execution period ends.</p>
         * <br>
         * <p>*   Failed:</p>
         * <br>
         * <p>    *   Command that is set to run only once: The execution is complete, but the exit code is not 0.</p>
         * <p>    *   Command that is set to run on a schedule: The previous execution is complete, but the exit code is not 0. The specified execution period is about to end.</p>
         * <br>
         * <p>*   Error: The execution cannot proceed due to an exception.</p>
         * <br>
         * <p>*   Timeout: The execution timed out.</p>
         * <br>
         * <p>*   Cancelled: The execution is canceled, and the command is not run.</p>
         * <br>
         * <p>*   Stopping: The command task is being stopped.</p>
         * <br>
         * <p>*   Terminated: The command task is terminated while it is being run.</p>
         * <br>
         * <p>*   Scheduled:</p>
         * <br>
         * <p>    *   Command that is set to run only once: The execution state cannot be Scheduled.</p>
         * <p>    *   Command that is set to run on a schedule: The command is waiting to be run.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The ID of the command task.</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The execution state of the command task.</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <p>The command output.</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of times that the command was run on the instance.</p>
         * <br>
         * <p>*   If the command is set to run only once, the value is 0 or 1.</p>
         * <p>*   If the command is set to run on a schedule, the value is the number of times that the command was run.</p>
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
         * <p>The username that was used to run the command on the instance.</p>
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
         * <p>The query token returned in this call.</p>
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
