// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsResponseBody extends TeaModel {
    @NameInMap("Invocations")
    public DescribeInvocationsResponseBodyInvocations invocations;

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
     * <li><p>Success: If the execution state on at least one instance is Success and the execution state on the other instances is Stopped or Success, the overall execution state is Success.</p>
     * <ul>
     * <li>One-time task: The execution is complete, and the exit code is 0.</li>
     * <li>Scheduled task: The last execution is complete, the exit code is 0, and the specified period ends.</li>
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
     * <li><p>Pending: The command is being verified or sent. If the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
     * </li>
     * <li><p>Scheduled: The command that is set to run on a schedule is sent and waiting to be run. If the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The command type. Valid values:</p>
     * <ul>
     * <li>RunBatScript: batch command, applicable to Windows instances.</li>
     * <li>RunPowerShellScript: PowerShell command, applicable to Windows instances.</li>
     * <li>RunShellScript: shell command, applicable to Linux instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> operation to query all available command IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The command name. If you specify both this parameter and <code>InstanceId</code>, this parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the command is to be automatically run. Valid values:</p>
     * <ul>
     * <li><p>true: The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Period</code>, <code>NextRebootOnly</code>, or <code>EveryReboot</code>.</p>
     * </li>
     * <li><p>false: The command meets one of the following requirements:</p>
     * <ul>
     * <li>The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Once</code>.</li>
     * <li>The command task is canceled, stopped, or completed.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Dropped")
        public Integer dropped;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("ExitCode")
        public Long exitCode;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceInvokeStatus")
        public String instanceInvokeStatus;

        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("OssOutputErrorCode")
        public String ossOutputErrorCode;

        @NameInMap("OssOutputErrorInfo")
        public String ossOutputErrorInfo;

        @NameInMap("OssOutputStatus")
        public String ossOutputStatus;

        @NameInMap("OssOutputUri")
        public String ossOutputUri;

        @NameInMap("Output")
        public String output;

        @NameInMap("Repeats")
        public Integer repeats;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("Timed")
        public Boolean timed;

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

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setOssOutputErrorCode(String ossOutputErrorCode) {
            this.ossOutputErrorCode = ossOutputErrorCode;
            return this;
        }
        public String getOssOutputErrorCode() {
            return this.ossOutputErrorCode;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setOssOutputErrorInfo(String ossOutputErrorInfo) {
            this.ossOutputErrorInfo = ossOutputErrorInfo;
            return this;
        }
        public String getOssOutputErrorInfo() {
            return this.ossOutputErrorInfo;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setOssOutputStatus(String ossOutputStatus) {
            this.ossOutputStatus = ossOutputStatus;
            return this;
        }
        public String getOssOutputStatus() {
            return this.ossOutputStatus;
        }

        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setOssOutputUri(String ossOutputUri) {
            this.ossOutputUri = ossOutputUri;
            return this;
        }
        public String getOssOutputUri() {
            return this.ossOutputUri;
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
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("CommandContent")
        public String commandContent;

        @NameInMap("CommandDescription")
        public String commandDescription;

        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("CommandName")
        public String commandName;

        @NameInMap("CommandType")
        public String commandType;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Frequency")
        public String frequency;

        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("InvokeId")
        public String invokeId;

        @NameInMap("InvokeInstances")
        public DescribeInvocationsResponseBodyInvocationsInvocationInvokeInstances invokeInstances;

        @NameInMap("InvokeStatus")
        public String invokeStatus;

        @NameInMap("Launcher")
        public String launcher;

        @NameInMap("OssOutputDelivery")
        public String ossOutputDelivery;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("RepeatMode")
        public String repeatMode;

        @NameInMap("Tags")
        public DescribeInvocationsResponseBodyInvocationsInvocationTags tags;

        @NameInMap("TerminationMode")
        public String terminationMode;

        @NameInMap("Timed")
        public Boolean timed;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("Username")
        public String username;

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

        public DescribeInvocationsResponseBodyInvocationsInvocation setOssOutputDelivery(String ossOutputDelivery) {
            this.ossOutputDelivery = ossOutputDelivery;
            return this;
        }
        public String getOssOutputDelivery() {
            return this.ossOutputDelivery;
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
