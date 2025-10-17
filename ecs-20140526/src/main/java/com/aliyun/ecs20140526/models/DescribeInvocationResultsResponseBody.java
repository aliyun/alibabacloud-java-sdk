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
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
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
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the command task.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
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
         * 
         * <strong>example:</strong>
         * <p>c-hz0jdfwcsr****</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>The container ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-container</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The size of the Output text that was truncated and discarded because the <code>Output</code> value exceeded 24 KB in size.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The error code returned when the command failed to be sent or run. Valid values:</p>
         * <ul>
         * <li>If this parameter is empty, the command was run as expected.</li>
         * <li>InstanceNotExists: The specified instance did not exist or was released.</li>
         * <li>InstanceReleased: The instance was released while the command was being run.</li>
         * <li>InstanceNotRunning: The instance was not running while the command was being run.</li>
         * <li>CommandNotApplicable: The command was inapplicable to the specified instance.</li>
         * <li>AccountNotExists: The username specified to run the command did not exist.</li>
         * <li>DirectoryNotExists: The specified directory did not exist.</li>
         * <li>BadCronExpression: The specified cron expression for the execution schedule was invalid.</li>
         * <li>ClientNotRunning: Cloud Assistant Agent was not running.</li>
         * <li>ClientNotResponse: Cloud Assistant Agent did not respond.</li>
         * <li>ClientIsUpgrading: Cloud Assistant Agent was being upgraded.</li>
         * <li>ClientNeedUpgrade: Cloud Assistant Agent needed to be upgraded.</li>
         * <li>DeliveryTimeout: The request to send the command timed out.</li>
         * <li>ExecutionTimeout: The execution timed out.</li>
         * <li>ExecutionException: An exception occurred while the command was being run.</li>
         * <li>ExecutionInterrupted: The execution was interrupted.</li>
         * <li>ExitCodeNonzero: The execution was complete, but the exit code was not 0.</li>
         * <li>SecurityGroupRuleDenied: Access to Cloud Assistant was denied by security group rules.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the command failed to be sent or run. Valid values:</p>
         * <ul>
         * <li>If this parameter is empty, the command was run as expected.</li>
         * <li>The security group rules denied access to the aliyun service.</li>
         * <li>The specified instance does not exist.</li>
         * <li>The specified instance was released during task execution.</li>
         * <li>The specified instance was not running during task execution.</li>
         * <li>The OS type of the instance does not support the specified command type.</li>
         * <li>The specified account does not exist.</li>
         * <li>The specified directory does not exist.</li>
         * <li>The cron expression is invalid.</li>
         * <li>The aliyun service is not running on the instance.</li>
         * <li>The aliyun service in the instance does not response.</li>
         * <li>The aliyun service in the instance is upgrading during task execution.</li>
         * <li>The aliyun service in the instance need to be upgraded to at least version to support the feature. indicates the earliest version that supports the feature. indicates the name of the feature.</li>
         * <li>The command delivery has been timeout.</li>
         * <li>The command execution has been timeout.</li>
         * <li>The command execution got an exception.</li>
         * <li>The command execution exit code is not zero.</li>
         * <li>The specified instance was released during task execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>the specified instance does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The exit code of the command task.</p>
         * <ul>
         * <li>For Linux instances, the value is the exit code of the shell command.</li>
         * <li>For Windows instances, the value is the exit code of the batch or PowerShell command.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The time when the command task was completed. If the command task times out, the end time is equal to the start time of the command task specified by <code>StartTime</code> plus the timeout period specified by <code>Timeout</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:56Z</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1i7gg30r52z2em****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The execution status on a single instance. Valid values:</p>
         * <ul>
         * <li><p>Pending: The command is being verified or sent.</p>
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
         * <li>Scheduled task: The last execution was complete, the exit code was 0, and the specified period ended.</li>
         * </ul>
         * </li>
         * <li><p>Failed:</p>
         * <ul>
         * <li>One-time task: The execution was complete, but the exit code was not 0.</li>
         * <li>Scheduled task: The last execution was complete, but the exit code was not 0. The specified period was about to end.</li>
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
         * <li>Scheduled task: The command is waiting to be run.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The command task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-hz0jdfwd9f****</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The execution status of the command. Valid values:</p>
         * <ul>
         * <li><p>Running:</p>
         * <ul>
         * <li>Scheduled task: Before you stop the scheduled execution of the command, the execution state is always Running.</li>
         * <li>One-time task: If the command is being run on instances, the execution state is Running.</li>
         * </ul>
         * </li>
         * <li><p>Finished:</p>
         * <ul>
         * <li>Scheduled task: The execution state can never be Finished.</li>
         * <li>One-time task: The execution was complete on all instances, or the execution was stopped on some instances and was complete on the other instances.</li>
         * </ul>
         * </li>
         * <li><p>Failed:</p>
         * <ul>
         * <li>Scheduled task: The execution state can never be Failed.</li>
         * <li>One-time task: The execution failed on all instances.</li>
         * </ul>
         * </li>
         * <li><p>PartialFailed:</p>
         * <ul>
         * <li>Scheduled task: The execution state can never be PartialFailed.</li>
         * <li>One-time task: The execution failed on some instances.</li>
         * </ul>
         * </li>
         * <li><p>Stopped: The task was stopped.</p>
         * </li>
         * <li><p>Stopping: The task is being stopped.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <p>The launcher for script execution. The value cannot exceed 1 KB in length.</p>
         * 
         * <strong>example:</strong>
         * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
         */
        @NameInMap("Launcher")
        public String launcher;

        /**
         * <p>Command to execute the Output OSS delivery configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://testBucket/testPrefix</p>
         */
        @NameInMap("OssOutputDelivery")
        public String ossOutputDelivery;

        /**
         * <p>The output delivery status of the command execution. Valid values:</p>
         * <ul>
         * <li>InProgress: The delivery is in progress.</li>
         * <li>Finished: The delivery is complete.</li>
         * <li>Failed: The delivery failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("OssOutputStatus")
        public String ossOutputStatus;

        /**
         * <p>The command execution Output delivers the object URI to OSS. This field is an empty string when the delivery fails or is in progress.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://testBucket/testPrefix/output.txt</p>
         */
        @NameInMap("OssOutputUri")
        public String ossOutputUri;

        /**
         * <p>The command output.</p>
         * <ul>
         * <li>If ContentEncoding is set to PlainText in the request, the original command output is returned.</li>
         * <li>If ContentEncoding is set to Base64 in the request, the Base64-encoded command output is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MTU6MzA6MDEK</p>
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
         * <p>The time when the command started to be run on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:55Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when the command task was stopped. If you call the <code>StopInvocation</code> operation to stop the command task, the value of this parameter is the time when the operation is called.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-19T09:15:47Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The tags of the command task.</p>
         */
        @NameInMap("Tags")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags tags;

        /**
         * <p>Indicates how the command task is stopped when a command execution is manually stopped or times out. Valid values:</p>
         * <ul>
         * <li>Process: The process of the command is stopped.</li>
         * <li>ProcessTree: The process tree of the command is stopped. In this case, the process of the command and all subprocesses are stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ProcessTree</p>
         */
        @NameInMap("TerminationMode")
        public String terminationMode;

        /**
         * <p>The username used to run the command on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
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

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setLauncher(String launcher) {
            this.launcher = launcher;
            return this;
        }
        public String getLauncher() {
            return this.launcher;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setOssOutputDelivery(String ossOutputDelivery) {
            this.ossOutputDelivery = ossOutputDelivery;
            return this;
        }
        public String getOssOutputDelivery() {
            return this.ossOutputDelivery;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setOssOutputStatus(String ossOutputStatus) {
            this.ossOutputStatus = ossOutputStatus;
            return this;
        }
        public String getOssOutputStatus() {
            return this.ossOutputStatus;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setOssOutputUri(String ossOutputUri) {
            this.ossOutputUri = ossOutputUri;
            return this;
        }
        public String getOssOutputUri() {
            return this.ossOutputUri;
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
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of the commands.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
