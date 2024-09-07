// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListCommonLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<ListCommonLogsResponseBodyLogs> logs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>464E9919-D04F-4D1D-B375-15989492****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>137***</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static ListCommonLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommonLogsResponseBody self = new ListCommonLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommonLogsResponseBody setLogs(java.util.List<ListCommonLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListCommonLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListCommonLogsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCommonLogsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCommonLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommonLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCommonLogsResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class ListCommonLogsResponseBodyLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CreaterCluster</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>ehpc-hz-9T3xPNezoS</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>Operation</p>
         */
        @NameInMap("LogType")
        public String logType;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>137***</p>
         */
        @NameInMap("OperatorUid")
        public String operatorUid;

        /**
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>i-abc***</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <strong>example:</strong>
         * <p>2024-08-22 14:21:54</p>
         */
        @NameInMap("Time")
        public String time;

        public static ListCommonLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListCommonLogsResponseBodyLogs self = new ListCommonLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListCommonLogsResponseBodyLogs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListCommonLogsResponseBodyLogs setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListCommonLogsResponseBodyLogs setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ListCommonLogsResponseBodyLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListCommonLogsResponseBodyLogs setOperatorUid(String operatorUid) {
            this.operatorUid = operatorUid;
            return this;
        }
        public String getOperatorUid() {
            return this.operatorUid;
        }

        public ListCommonLogsResponseBodyLogs setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListCommonLogsResponseBodyLogs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCommonLogsResponseBodyLogs setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListCommonLogsResponseBodyLogs setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
