// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSqlFlashbackTaskRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("SqlType")
    public String sqlType;

    @NameInMap("SqlPk")
    public String sqlPk;

    @NameInMap("RecallType")
    public Integer recallType;

    @NameInMap("RecallRestoreType")
    @Validation(required = true)
    public Integer recallRestoreType;

    public static SubmitSqlFlashbackTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSqlFlashbackTaskRequest self = new SubmitSqlFlashbackTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSqlFlashbackTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitSqlFlashbackTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitSqlFlashbackTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitSqlFlashbackTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SubmitSqlFlashbackTaskRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public SubmitSqlFlashbackTaskRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public SubmitSqlFlashbackTaskRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public SubmitSqlFlashbackTaskRequest setSqlPk(String sqlPk) {
        this.sqlPk = sqlPk;
        return this;
    }
    public String getSqlPk() {
        return this.sqlPk;
    }

    public SubmitSqlFlashbackTaskRequest setRecallType(Integer recallType) {
        this.recallType = recallType;
        return this;
    }
    public Integer getRecallType() {
        return this.recallType;
    }

    public SubmitSqlFlashbackTaskRequest setRecallRestoreType(Integer recallRestoreType) {
        this.recallRestoreType = recallRestoreType;
        return this;
    }
    public Integer getRecallRestoreType() {
        return this.recallRestoreType;
    }

}
