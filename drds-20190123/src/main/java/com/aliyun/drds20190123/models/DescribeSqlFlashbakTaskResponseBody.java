// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeSqlFlashbakTaskResponseBody extends TeaModel {
    /**
     * <p>Indicates the ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates the information about flashback tasks.</p>
     */
    @NameInMap("SqlFlashbackTasks")
    public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasks sqlFlashbackTasks;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSqlFlashbakTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlFlashbakTaskResponseBody self = new DescribeSqlFlashbakTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlFlashbakTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlFlashbakTaskResponseBody setSqlFlashbackTasks(DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasks sqlFlashbackTasks) {
        this.sqlFlashbackTasks = sqlFlashbackTasks;
        return this;
    }
    public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasks getSqlFlashbackTasks() {
        return this.sqlFlashbackTasks;
    }

    public DescribeSqlFlashbakTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask extends TeaModel {
        /**
         * <p>Indicates the name of the database on which a flashback task is performed.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>Indicates the download URL.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>Indicates the time when the download URL expires.</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>Indicates the point in time when the instance was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>Indicates the point in time when the flashback task is performed.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>Indicates the ID of the primary key that corresponds to a table used in the flashback task.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates the ID of the instance.</p>
         */
        @NameInMap("InstId")
        public String instId;

        /**
         * <p>Indicates the progress of the reverse call.</p>
         */
        @NameInMap("RecallProgress")
        public Integer recallProgress;

        /**
         * <p>Indicates the type of the flashback task. Valid values:</p>
         * <br>
         * <p>*   **1**: image restoration</p>
         * <p>*   **2**: reverse restoration</p>
         */
        @NameInMap("RecallRestoreType")
        public Integer recallRestoreType;

        /**
         * <p>Indicates the status of the data recall task.</p>
         */
        @NameInMap("RecallStatus")
        public Integer recallStatus;

        /**
         * <p>Indicates the type of the reverse call. Valid values:</p>
         * <br>
         * <p>*   **0**: exact search</p>
         * <p>*   **1**: fuzzy search</p>
         */
        @NameInMap("RecallType")
        public Integer recallType;

        /**
         * <p>Indicates the start time of the reverse call.</p>
         */
        @NameInMap("SearchEndTime")
        public Long searchEndTime;

        /**
         * <p>Indicates the end time of the reverse call.</p>
         */
        @NameInMap("SearchStartTime")
        public Long searchStartTime;

        /**
         * <p>Indicates the number of data rows that are flashed back.</p>
         */
        @NameInMap("SqlCounter")
        public Long sqlCounter;

        /**
         * <p>Indicates the primary key specified in the SQL statements.</p>
         */
        @NameInMap("SqlPk")
        public String sqlPk;

        /**
         * <p>Indicates the types of the SQL statements.</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>Indicates the name of the table that contains the data that are flashed back.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>Indicates the ID of the trace of the SQL query.</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask self = new DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask();
            return TeaModel.build(map, self);
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setRecallProgress(Integer recallProgress) {
            this.recallProgress = recallProgress;
            return this;
        }
        public Integer getRecallProgress() {
            return this.recallProgress;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setRecallRestoreType(Integer recallRestoreType) {
            this.recallRestoreType = recallRestoreType;
            return this;
        }
        public Integer getRecallRestoreType() {
            return this.recallRestoreType;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setRecallStatus(Integer recallStatus) {
            this.recallStatus = recallStatus;
            return this;
        }
        public Integer getRecallStatus() {
            return this.recallStatus;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setRecallType(Integer recallType) {
            this.recallType = recallType;
            return this;
        }
        public Integer getRecallType() {
            return this.recallType;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setSearchEndTime(Long searchEndTime) {
            this.searchEndTime = searchEndTime;
            return this;
        }
        public Long getSearchEndTime() {
            return this.searchEndTime;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setSearchStartTime(Long searchStartTime) {
            this.searchStartTime = searchStartTime;
            return this;
        }
        public Long getSearchStartTime() {
            return this.searchStartTime;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setSqlCounter(Long sqlCounter) {
            this.sqlCounter = sqlCounter;
            return this;
        }
        public Long getSqlCounter() {
            return this.sqlCounter;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setSqlPk(String sqlPk) {
            this.sqlPk = sqlPk;
            return this;
        }
        public String getSqlPk() {
            return this.sqlPk;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasks extends TeaModel {
        @NameInMap("SqlFlashbackTask")
        public java.util.List<DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask> sqlFlashbackTask;

        public static DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasks self = new DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasks();
            return TeaModel.build(map, self);
        }

        public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasks setSqlFlashbackTask(java.util.List<DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask> sqlFlashbackTask) {
            this.sqlFlashbackTask = sqlFlashbackTask;
            return this;
        }
        public java.util.List<DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasksSqlFlashbackTask> getSqlFlashbackTask() {
            return this.sqlFlashbackTask;
        }

    }

}
