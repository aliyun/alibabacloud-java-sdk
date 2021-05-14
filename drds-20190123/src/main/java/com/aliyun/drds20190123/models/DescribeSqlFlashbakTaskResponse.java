// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeSqlFlashbakTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("SqlFlashbackTasks")
    @Validation(required = true)
    public DescribeSqlFlashbakTaskResponseSqlFlashbackTasks sqlFlashbackTasks;

    public static DescribeSqlFlashbakTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlFlashbakTaskResponse self = new DescribeSqlFlashbakTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlFlashbakTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlFlashbakTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSqlFlashbakTaskResponse setSqlFlashbackTasks(DescribeSqlFlashbakTaskResponseSqlFlashbackTasks sqlFlashbackTasks) {
        this.sqlFlashbackTasks = sqlFlashbackTasks;
        return this;
    }
    public DescribeSqlFlashbakTaskResponseSqlFlashbackTasks getSqlFlashbackTasks() {
        return this.sqlFlashbackTasks;
    }

    public static class DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("InstId")
        @Validation(required = true)
        public String instId;

        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("SearchStartTime")
        @Validation(required = true)
        public Long searchStartTime;

        @NameInMap("SearchEndTime")
        @Validation(required = true)
        public Long searchEndTime;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TraceId")
        @Validation(required = true)
        public String traceId;

        @NameInMap("SqlType")
        @Validation(required = true)
        public String sqlType;

        @NameInMap("SqlPk")
        @Validation(required = true)
        public String sqlPk;

        @NameInMap("RecallType")
        @Validation(required = true)
        public Integer recallType;

        @NameInMap("RecallStatus")
        @Validation(required = true)
        public Integer recallStatus;

        @NameInMap("RecallProgress")
        @Validation(required = true)
        public Integer recallProgress;

        @NameInMap("RecallRestoreType")
        @Validation(required = true)
        public Integer recallRestoreType;

        @NameInMap("DownloadUrl")
        @Validation(required = true)
        public String downloadUrl;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public Long expireTime;

        @NameInMap("SqlCounter")
        @Validation(required = true)
        public Long sqlCounter;

        public static DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask self = new DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask();
            return TeaModel.build(map, self);
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setInstId(String instId) {
            this.instId = instId;
            return this;
        }
        public String getInstId() {
            return this.instId;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setSearchStartTime(Long searchStartTime) {
            this.searchStartTime = searchStartTime;
            return this;
        }
        public Long getSearchStartTime() {
            return this.searchStartTime;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setSearchEndTime(Long searchEndTime) {
            this.searchEndTime = searchEndTime;
            return this;
        }
        public Long getSearchEndTime() {
            return this.searchEndTime;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setSqlPk(String sqlPk) {
            this.sqlPk = sqlPk;
            return this;
        }
        public String getSqlPk() {
            return this.sqlPk;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setRecallType(Integer recallType) {
            this.recallType = recallType;
            return this;
        }
        public Integer getRecallType() {
            return this.recallType;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setRecallStatus(Integer recallStatus) {
            this.recallStatus = recallStatus;
            return this;
        }
        public Integer getRecallStatus() {
            return this.recallStatus;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setRecallProgress(Integer recallProgress) {
            this.recallProgress = recallProgress;
            return this;
        }
        public Integer getRecallProgress() {
            return this.recallProgress;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setRecallRestoreType(Integer recallRestoreType) {
            this.recallRestoreType = recallRestoreType;
            return this;
        }
        public Integer getRecallRestoreType() {
            return this.recallRestoreType;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask setSqlCounter(Long sqlCounter) {
            this.sqlCounter = sqlCounter;
            return this;
        }
        public Long getSqlCounter() {
            return this.sqlCounter;
        }

    }

    public static class DescribeSqlFlashbakTaskResponseSqlFlashbackTasks extends TeaModel {
        @NameInMap("SqlFlashbackTask")
        @Validation(required = true)
        public java.util.List<DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask> sqlFlashbackTask;

        public static DescribeSqlFlashbakTaskResponseSqlFlashbackTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlFlashbakTaskResponseSqlFlashbackTasks self = new DescribeSqlFlashbakTaskResponseSqlFlashbackTasks();
            return TeaModel.build(map, self);
        }

        public DescribeSqlFlashbakTaskResponseSqlFlashbackTasks setSqlFlashbackTask(java.util.List<DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask> sqlFlashbackTask) {
            this.sqlFlashbackTask = sqlFlashbackTask;
            return this;
        }
        public java.util.List<DescribeSqlFlashbakTaskResponseSqlFlashbackTasksSqlFlashbackTask> getSqlFlashbackTask() {
            return this.sqlFlashbackTask;
        }

    }

}
