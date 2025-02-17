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
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the commands.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:54Z</p>
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
         * <p>The error code for the failure to send or run the command. Valid values:</p>
         * <ul>
         * <li>If this parameter is empty, the command was run as expected.</li>
         * <li>InstanceNotExists: The specified instance did not exist or was released.</li>
         * <li>InstanceReleased: The instance was released while the command was being run.</li>
         * <li>InstanceNotRunning: The instance was not running when the command started to be run.</li>
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
         * <li>ExecutionException: An exception occurred while the command was being executed.</li>
         * <li>ExecutionInterrupted: The command task was interrupted.</li>
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
        public Long exitCode;

        /**
         * <p>The time when the command process ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:56Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1i7gg30r52z2em****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The execution status of the command on a single instance.</p>
         * <blockquote>
         * <p> We recommend that you ignore this parameter and check the value of <code>InvocationStatus</code> in the response to obtain the execution status.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("InstanceInvokeStatus")
        public String instanceInvokeStatus;

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
         * <li>Scheduled task: The last execution was complete, but the exit code was not 0. The specified period is about to end.</li>
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
         * <p>Indicates whether the command is to be automatically run.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Timed")
        public Boolean timed;

        /**
         * <p>The time when the execution status was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-19T09:15:47Z</p>
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
         * <p>The command ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-hz0jdfwcsr****</p>
         */
        @NameInMap("CommandId")
        public String commandId;

        /**
         * <p>The command name.</p>
         * 
         * <strong>example:</strong>
         * <p>CommandTestName</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        /**
         * <p>The command type.</p>
         * 
         * <strong>example:</strong>
         * <p>RunShellScript</p>
         */
        @NameInMap("CommandType")
        public String commandType;

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
         * <p>The time when the command task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-19T09:15:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The schedule on which the command is run.</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <p>The overall execution status of the command task. The value of this parameter depends on the execution status of the command task on all the involved instances. Valid values:</p>
         * <ul>
         * <li><p>Pending: The command is being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
         * </li>
         * <li><p>Scheduled: The command that is set to run on a schedule was sent and waiting to be run. When the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</p>
         * </li>
         * <li><p>Running: The command is being run on the instances. When the execution state on at least one instance is Running, the overall execution state is Running.</p>
         * </li>
         * <li><p>Success: When the execution state on at least one instance is Success and the execution state on the other instances is Stopped or Success, the overall execution state is Success.</p>
         * <ul>
         * <li>One-time task: The execution was complete, and the exit code was 0.</li>
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
         * <p> <code>InvokeStatus</code> in the response functions similarly to this parameter. We recommend that you check the value of this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
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
         * <p>The instances on which the command was run.</p>
         */
        @NameInMap("InvokeInstances")
        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances invokeInstances;

        /**
         * <p>The overall execution status of the command task.</p>
         * <blockquote>
         * <p> We recommend that you ignore this parameter and check the value of <code>InvocationStatus</code> in the response to obtain the execution status.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("InvokeStatus")
        public String invokeStatus;

        /**
         * <p>The launcher for script execution. The value cannot exceed 1 KB in length.</p>
         * 
         * <strong>example:</strong>
         * <p>python3 -u {{ACS::ScriptFileName|Ext(&quot;.py&quot;)}}</p>
         */
        @NameInMap("Launcher")
        public String launcher;

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
         * <li>Once: The command is immediately run.</li>
         * <li>Period: The command is run on a schedule.</li>
         * <li>NextRebootOnly: The command is run the next time the instances start.</li>
         * <li>EveryReboot: The command is run every time the instances start.</li>
         * <li>DryRun: The system performs only a dry run, without running the actual command. The system checks the request parameters, the execution environments on the instances, and the status of Cloud Assistant Agent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Once</p>
         */
        @NameInMap("RepeatMode")
        public String repeatMode;

        /**
         * <p>The tags of the command task.</p>
         */
        @NameInMap("Tags")
        public DescribeInvocationsResponseBodyInvocationsInvocationTags tags;

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
         * <p>Indicates whether the command is to be automatically run.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Timed")
        public Boolean timed;

        /**
         * <p>The maximum timeout period for the command execution. Unit: seconds.</p>
         * <p>When a command cannot be run, the command execution times out. When a command execution times out, Cloud Assistant Agent forcefully terminates the command process by canceling the process ID (PID) of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>The username used to run the command on the instances.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The execution path of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/</p>
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

        public DescribeInvocationsResponseBodyInvocationsInvocation setLauncher(String launcher) {
            this.launcher = launcher;
            return this;
        }
        public String getLauncher() {
            return this.launcher;
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
