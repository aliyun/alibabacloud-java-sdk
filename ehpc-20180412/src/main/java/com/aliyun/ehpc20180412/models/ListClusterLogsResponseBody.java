// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClusterLogsResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Logs")
    public ListClusterLogsResponseBodyLogs logs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListClusterLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterLogsResponseBody self = new ListClusterLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterLogsResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterLogsResponseBody setLogs(ListClusterLogsResponseBodyLogs logs) {
        this.logs = logs;
        return this;
    }
    public ListClusterLogsResponseBodyLogs getLogs() {
        return this.logs;
    }

    public ListClusterLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListClusterLogsResponseBodyLogsLogInfo extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Operation")
        public String operation;

        public static ListClusterLogsResponseBodyLogsLogInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClusterLogsResponseBodyLogsLogInfo self = new ListClusterLogsResponseBodyLogsLogInfo();
            return TeaModel.build(map, self);
        }

        public ListClusterLogsResponseBodyLogsLogInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClusterLogsResponseBodyLogsLogInfo setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListClusterLogsResponseBodyLogsLogInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListClusterLogsResponseBodyLogsLogInfo setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

    public static class ListClusterLogsResponseBodyLogs extends TeaModel {
        @NameInMap("LogInfo")
        public java.util.List<ListClusterLogsResponseBodyLogsLogInfo> logInfo;

        public static ListClusterLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListClusterLogsResponseBodyLogs self = new ListClusterLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListClusterLogsResponseBodyLogs setLogInfo(java.util.List<ListClusterLogsResponseBodyLogsLogInfo> logInfo) {
            this.logInfo = logInfo;
            return this;
        }
        public java.util.List<ListClusterLogsResponseBodyLogsLogInfo> getLogInfo() {
            return this.logInfo;
        }

    }

}
