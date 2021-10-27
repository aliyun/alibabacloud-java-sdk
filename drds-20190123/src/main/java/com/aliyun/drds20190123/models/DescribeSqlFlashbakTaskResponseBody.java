// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeSqlFlashbakTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SqlFlashbackTasks")
    public DescribeSqlFlashbakTaskResponseBodySqlFlashbackTasks sqlFlashbackTasks;

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
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstId")
        public String instId;

        @NameInMap("RecallProgress")
        public Integer recallProgress;

        @NameInMap("RecallRestoreType")
        public Integer recallRestoreType;

        @NameInMap("RecallStatus")
        public Integer recallStatus;

        @NameInMap("RecallType")
        public Integer recallType;

        @NameInMap("SearchEndTime")
        public Long searchEndTime;

        @NameInMap("SearchStartTime")
        public Long searchStartTime;

        @NameInMap("SqlCounter")
        public Long sqlCounter;

        @NameInMap("SqlPk")
        public String sqlPk;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("TableName")
        public String tableName;

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
