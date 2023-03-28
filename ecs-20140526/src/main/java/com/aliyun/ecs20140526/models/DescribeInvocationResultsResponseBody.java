// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsResponseBody extends TeaModel {
    @NameInMap("Invocation")
    public DescribeInvocationResultsResponseBodyInvocation invocation;

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
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("CommandId")
        public String commandId;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("ContainerName")
        public String containerName;

        @NameInMap("Dropped")
        public Integer dropped;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("ExitCode")
        public Long exitCode;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("InvokeId")
        public String invokeId;

        @NameInMap("InvokeRecordStatus")
        public String invokeRecordStatus;

        @NameInMap("Output")
        public String output;

        @NameInMap("Repeats")
        public Integer repeats;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StopTime")
        public String stopTime;

        @NameInMap("Tags")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResultsInvocationResultTags tags;

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
        @NameInMap("InvocationResults")
        public DescribeInvocationResultsResponseBodyInvocationInvocationResults invocationResults;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

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
