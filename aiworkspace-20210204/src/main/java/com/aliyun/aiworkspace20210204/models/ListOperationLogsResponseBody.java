// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListOperationLogsResponseBody extends TeaModel {
    // 输出日志列表
    @NameInMap("Logs")
    public java.util.List<ListOperationLogsResponseBodyLogs> logs;

    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 符合过滤条件的日志数量
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOperationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationLogsResponseBody self = new ListOperationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationLogsResponseBody setLogs(java.util.List<ListOperationLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListOperationLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListOperationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationLogsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOperationLogsResponseBodyLogs extends TeaModel {
        // 实体 id
        @NameInMap("EntityId")
        public String entityId;

        // 实体类型，目前支持Resource
        @NameInMap("EntityType")
        public String entityType;

        // 2021-01-30T12:51:33.028Z
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // 日志
        @NameInMap("Message")
        public String message;

        // 操作，目前支持Create, Update, SetDefault
        @NameInMap("Operation")
        public String operation;

        // 操作状态，支持 Processing、Succeeded、Failed
        @NameInMap("OperationStatus")
        public String operationStatus;

        // 操作人
        @NameInMap("Operator")
        public String operator;

        public static ListOperationLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListOperationLogsResponseBodyLogs self = new ListOperationLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListOperationLogsResponseBodyLogs setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListOperationLogsResponseBodyLogs setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListOperationLogsResponseBodyLogs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListOperationLogsResponseBodyLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListOperationLogsResponseBodyLogs setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListOperationLogsResponseBodyLogs setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public ListOperationLogsResponseBodyLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

}
