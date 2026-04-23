// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListExecutorLogsResponseBody extends TeaModel {
    @NameInMap("logs")
    public java.util.List<ListExecutorLogsResponseBodyLogs> logs;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListExecutorLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorLogsResponseBody self = new ListExecutorLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutorLogsResponseBody setLogs(java.util.List<ListExecutorLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListExecutorLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListExecutorLogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutorLogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutorLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutorLogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListExecutorLogsResponseBodyLogs extends TeaModel {
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>6383327</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p>log4j.log</p>
         */
        @NameInMap("logName")
        public String logName;

        /**
         * <strong>example:</strong>
         * <p>log4j</p>
         */
        @NameInMap("logType")
        public String logType;

        /**
         * <strong>example:</strong>
         * <p>1745390462</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static ListExecutorLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorLogsResponseBodyLogs self = new ListExecutorLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListExecutorLogsResponseBodyLogs setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListExecutorLogsResponseBodyLogs setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListExecutorLogsResponseBodyLogs setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public ListExecutorLogsResponseBodyLogs setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ListExecutorLogsResponseBodyLogs setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
