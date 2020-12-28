// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClusterLogsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Logs")
    public java.util.List<ListClusterLogsResponseBodyLogs> logs;

    public static ListClusterLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterLogsResponseBody self = new ListClusterLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public ListClusterLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterLogsResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterLogsResponseBody setLogs(java.util.List<ListClusterLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListClusterLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public static class ListClusterLogsResponseBodyLogs extends TeaModel {
        @NameInMap("Operation")
        public String operation;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Level")
        public String level;

        public static ListClusterLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListClusterLogsResponseBodyLogs self = new ListClusterLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListClusterLogsResponseBodyLogs setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListClusterLogsResponseBodyLogs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClusterLogsResponseBodyLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListClusterLogsResponseBodyLogs setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
