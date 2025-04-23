// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListClusterLogsResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The queried operations logs.</p>
     */
    @NameInMap("Logs")
    public ListClusterLogsResponseBodyLogs logs;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BBC2F93D-003A-49C4-850C-B826EECF6667</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The time when the log was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-18T13:24:13.000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The level of the log entry. Valid values:</p>
         * <ul>
         * <li>warn</li>
         * <li>error</li>
         * <li>info</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The content of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>Begin to create cluster</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The type of the operation. Valid values:</p>
         * <ul>
         * <li>CreateCluster</li>
         * <li>StartCluster</li>
         * <li>StopCluster</li>
         * <li>DeleteCluster</li>
         * <li>AddNodes</li>
         * <li>StartNodes</li>
         * <li>ResetNodes</li>
         * <li>StopNodes</li>
         * <li>DeleteNodes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateCluster</p>
         */
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
