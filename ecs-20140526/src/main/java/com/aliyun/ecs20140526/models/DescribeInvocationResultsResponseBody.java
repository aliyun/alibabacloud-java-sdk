// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsResponseBody extends TeaModel {
    /**
     * <p>The execution status of the command task. Valid values:</p>
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
     * <li>One-time task: The execution is complete on all instances, or the execution is stopped on some instances and is complete on the other instances.</li>
     * </ul>
     * </li>
     * <li><p>Success:</p>
     * <ul>
     * <li>One-time task: The execution is complete, and the exit code is 0.</li>
     * <li>Scheduled task: The last execution is complete, the exit code is 0, and the specified period ends.</li>
     * </ul>
     * </li>
     * <li><p>Failed:</p>
     * <ul>
     * <li>Scheduled task: The execution state can never be Failed.</li>
     * <li>One-time task: The execution fails on all instances.</li>
     * </ul>
     * </li>
     * <li><p>PartialFailed:</p>
     * <ul>
     * <li>Scheduled task: The execution state can never be PartialFailed.</li>
     * <li>One-time task: The execution fails on some instances.</li>
     * </ul>
     * </li>
     * <li><p>Stopped: The task is stopped.</p>
     * </li>
     * <li><p>Stopping: The task is being stopped.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Invocation")
    public DescribeInvocationResultsResponseBodyInvocation invocation;

    /**
     * <p>The ID of the command.</p>
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
         * <p>The output delivery status of the command execution. Valid values:</p>
         * <ul>
         * <li>InProgress: The delivery is in progress.</li>
         * <li>Finished: The delivery is complete.</li>
         * <li>Failed: The delivery failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The username used to run the command on the instance.</p>
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
         * <p>c-hz0jdfwcsr****</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>Command to execute the Output OSS delivery configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ab141ddfbacfe02d9dbc25966ed971536124527097398d419a6746873fea****</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

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
         * <p>test-container</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dropped")
        public Integer dropped;

        /**
         * <p>The time when the command started to be run on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>the specified instance does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The key of tag N of the command task. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExitCode")
        public Long exitCode;

        /**
         * <p>The total number of the commands.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:56Z</p>
         */
        @NameInMap("FinishedTime")
        public String finishedTime;

        /**
         * <p>The value of tag N of the command task. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1i7gg30r52z2em****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The tag of the command task.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The number of times that the command was run on the instance.</p>
         * <ul>
         * <li>If the command is set to run only once, the value is 0 or 1.</li>
         * <li>If the command is set to run on a schedule, the value is the number of times that the command has been run on the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>t-hz0jdfwd9f****</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        /**
         * <p>The exit code of the command task.</p>
         * <ul>
         * <li>For Linux instances, the value is the exit code of the shell command.</li>
         * <li>For Windows instances, the value is the exit code of the batch or PowerShell command.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
         */
        @NameInMap("Launcher")
        public String launcher;

        /**
         * <p>The tags of the command task.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://testBucket/testPrefix</p>
         */
        @NameInMap("OssOutputDelivery")
        public String ossOutputDelivery;

        @NameInMap("OssOutputErrorCode")
        public String ossOutputErrorCode;

        @NameInMap("OssOutputErrorInfo")
        public String ossOutputErrorInfo;

        /**
         * <p>The execution results.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("OssOutputStatus")
        public String ossOutputStatus;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://testBucket/testPrefix/output.txt</p>
         */
        @NameInMap("OssOutputUri")
        public String ossOutputUri;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>MTU6MzA6MDEK</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Repeats")
        public Integer repeats;

        /**
         * <p>Details about the execution results.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:55Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>root</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-19T09:15:47Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The time when the command task was completed. If the command task times out, the end time is equal to the start time of the command task specified by <code>StartTime</code> plus the timeout period specified by <code>Timeout</code>.</p>
         */
        @NameInMap("Tags")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags tags;

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
         * <p>ProcessTree</p>
         */
        @NameInMap("TerminationMode")
        public String terminationMode;

        /**
         * <p>The size of the Output text that was truncated and discarded because the <code>Output</code> value exceeded 24 KB in size.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setOssOutputErrorCode(String ossOutputErrorCode) {
            this.ossOutputErrorCode = ossOutputErrorCode;
            return this;
        }
        public String getOssOutputErrorCode() {
            return this.ossOutputErrorCode;
        }

        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResult setOssOutputErrorInfo(String ossOutputErrorInfo) {
            this.ossOutputErrorInfo = ossOutputErrorInfo;
            return this;
        }
        public String getOssOutputErrorInfo() {
            return this.ossOutputErrorInfo;
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
         * <p>The maximum number of entries per page.</p>
         * <p>Valid values: 1 to 50.</p>
         * <p>Default value: 10.</p>
         */
        @NameInMap("InvocationResults")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResults invocationResults;

        /**
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The encoding mode of the <code>CommandContent</code> and <code>Output</code> values in the response. Valid values:</p>
         * <ul>
         * <li>PlainText: returns the original command content and command output.</li>
         * <li>Base64: returns the Base64-encoded command content and command output.</li>
         * </ul>
         * <p>Default value: Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>Specifies whether to return the results of historical scheduled executions. Valid values:</p>
         * <ul>
         * <li>true: returns the results of historical scheduled executions. If you set this parameter to true, you must set InvokeId to the ID of a task that is run on a schedule (RepeatMode set to Period) or on each system startup (RepeatMode set to EveryReboot).</li>
         * <li>false: does not return the results of historical scheduled executions.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <blockquote>
         * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
         * </blockquote>
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
