// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListInvocationLogsResponseBody extends TeaModel {
    // 总页数
    @NameInMap("TotalPage")
    public Long totalPage;

    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    // 日志列表
    @NameInMap("Logs")
    public java.util.List<ListInvocationLogsResponseBodyLogs> logs;

    // 总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInvocationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInvocationLogsResponseBody self = new ListInvocationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInvocationLogsResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListInvocationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInvocationLogsResponseBody setLogs(java.util.List<ListInvocationLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListInvocationLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListInvocationLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInvocationLogsResponseBodyLogsInvocationError extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Message")
        public String message;

        public static ListInvocationLogsResponseBodyLogsInvocationError build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationLogsResponseBodyLogsInvocationError self = new ListInvocationLogsResponseBodyLogsInvocationError();
            return TeaModel.build(map, self);
        }

        public ListInvocationLogsResponseBodyLogsInvocationError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListInvocationLogsResponseBodyLogsInvocationError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListInvocationLogsResponseBodyLogsWorkflow extends TeaModel {
        // 工作流定义
        @NameInMap("Definition")
        public String definition;

        // 工作流版本
        @NameInMap("Version")
        public String version;

        // 工作流 ID
        @NameInMap("FlowId")
        public String flowId;

        public static ListInvocationLogsResponseBodyLogsWorkflow build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationLogsResponseBodyLogsWorkflow self = new ListInvocationLogsResponseBodyLogsWorkflow();
            return TeaModel.build(map, self);
        }

        public ListInvocationLogsResponseBodyLogsWorkflow setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListInvocationLogsResponseBodyLogsWorkflow setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListInvocationLogsResponseBodyLogsWorkflow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

    public static class ListInvocationLogsResponseBodyLogsTags extends TeaModel {
        // 标签名
        @NameInMap("Key")
        public String key;

        // 标签值
        @NameInMap("Value")
        public String value;

        public static ListInvocationLogsResponseBodyLogsTags build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationLogsResponseBodyLogsTags self = new ListInvocationLogsResponseBodyLogsTags();
            return TeaModel.build(map, self);
        }

        public ListInvocationLogsResponseBodyLogsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInvocationLogsResponseBodyLogsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInvocationLogsResponseBodyLogs extends TeaModel {
        // 执行状态
        @NameInMap("Status")
        public String status;

        // 执行完成时间
        @NameInMap("EndTime")
        public String endTime;

        // 开始执行时间
        @NameInMap("StartTime")
        public String startTime;

        // 执行唯一标识符
        @NameInMap("InvocationId")
        public String invocationId;

        // 返回码
        @NameInMap("ReturnCode")
        public String returnCode;

        // 错误信息
        @NameInMap("InvocationError")
        public ListInvocationLogsResponseBodyLogsInvocationError invocationError;

        // 工作流详情
        @NameInMap("Workflow")
        public ListInvocationLogsResponseBodyLogsWorkflow workflow;

        // 本次执行的标签
        @NameInMap("Tags")
        public java.util.List<ListInvocationLogsResponseBodyLogsTags> tags;

        public static ListInvocationLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListInvocationLogsResponseBodyLogs self = new ListInvocationLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListInvocationLogsResponseBodyLogs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInvocationLogsResponseBodyLogs setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListInvocationLogsResponseBodyLogs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListInvocationLogsResponseBodyLogs setInvocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }
        public String getInvocationId() {
            return this.invocationId;
        }

        public ListInvocationLogsResponseBodyLogs setReturnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }
        public String getReturnCode() {
            return this.returnCode;
        }

        public ListInvocationLogsResponseBodyLogs setInvocationError(ListInvocationLogsResponseBodyLogsInvocationError invocationError) {
            this.invocationError = invocationError;
            return this;
        }
        public ListInvocationLogsResponseBodyLogsInvocationError getInvocationError() {
            return this.invocationError;
        }

        public ListInvocationLogsResponseBodyLogs setWorkflow(ListInvocationLogsResponseBodyLogsWorkflow workflow) {
            this.workflow = workflow;
            return this;
        }
        public ListInvocationLogsResponseBodyLogsWorkflow getWorkflow() {
            return this.workflow;
        }

        public ListInvocationLogsResponseBodyLogs setTags(java.util.List<ListInvocationLogsResponseBodyLogsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInvocationLogsResponseBodyLogsTags> getTags() {
            return this.tags;
        }

    }

}
