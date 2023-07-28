// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeLoadTasksRecordsResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried asynchronous import and export tasks.</p>
     */
    @NameInMap("LoadTasksRecords")
    public java.util.List<DescribeLoadTasksRecordsResponseBodyLoadTasksRecords> loadTasksRecords;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeLoadTasksRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadTasksRecordsResponseBody self = new DescribeLoadTasksRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadTasksRecordsResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeLoadTasksRecordsResponseBody setLoadTasksRecords(java.util.List<DescribeLoadTasksRecordsResponseBodyLoadTasksRecords> loadTasksRecords) {
        this.loadTasksRecords = loadTasksRecords;
        return this;
    }
    public java.util.List<DescribeLoadTasksRecordsResponseBodyLoadTasksRecords> getLoadTasksRecords() {
        return this.loadTasksRecords;
    }

    public DescribeLoadTasksRecordsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadTasksRecordsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadTasksRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadTasksRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoadTasksRecordsResponseBodyLoadTasksRecords extends TeaModel {
        /**
         * <p>The start time of the task. The time is accurate to milliseconds. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ss.SSSZ* format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the database that is involved in the import or export task.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The process ID.</p>
         */
        @NameInMap("ProcessID")
        public String processID;

        /**
         * <p>The number of rows that are processed in the asynchronous import or export task.</p>
         */
        @NameInMap("ProcessRows")
        public Long processRows;

        /**
         * <p>The SQL statement that is used in the asynchronous import or export task.</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <p>The state of the task.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the task state was updated. The time is accurate to milliseconds. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ss.SSSZ* format. The time is displayed in UTC.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeLoadTasksRecordsResponseBodyLoadTasksRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadTasksRecordsResponseBodyLoadTasksRecords self = new DescribeLoadTasksRecordsResponseBodyLoadTasksRecords();
            return TeaModel.build(map, self);
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setProcessID(String processID) {
            this.processID = processID;
            return this;
        }
        public String getProcessID() {
            return this.processID;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setProcessRows(Long processRows) {
            this.processRows = processRows;
            return this;
        }
        public Long getProcessRows() {
            return this.processRows;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeLoadTasksRecordsResponseBodyLoadTasksRecords setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
