// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitSqlFlashbackTaskRequest extends TeaModel {
    /**
     * <p>The name of the DRDS database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of a DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The time when the SQL flashback task ends.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The restoration type. Valid values:</p>
     * <br>
     * <p>*   1: Image restoration</p>
     * <p>*   0: reverse recovery</p>
     */
    @NameInMap("RecallRestoreType")
    public Integer recallRestoreType;

    /**
     * <p>Exact match or fuzzy match. Valid values:</p>
     * <br>
     * <p>*   0: the exact match.</p>
     * <p>*   1: the fuzzy match.</p>
     */
    @NameInMap("RecallType")
    public Integer recallType;

    /**
     * <p>The primary key of flashback SQL.</p>
     */
    @NameInMap("SqlPk")
    public String sqlPk;

    /**
     * <p>The type of the SQL statement. Valid values: INSERT, UPDATE, and DELETE. Separate multiple types with commas (,).</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start time of the flashback SQL statement.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the table where the flashback SQL operation was performed.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The Trace ID of the flashback SQL.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static SubmitSqlFlashbackTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSqlFlashbackTaskRequest self = new SubmitSqlFlashbackTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSqlFlashbackTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitSqlFlashbackTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitSqlFlashbackTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public SubmitSqlFlashbackTaskRequest setRecallRestoreType(Integer recallRestoreType) {
        this.recallRestoreType = recallRestoreType;
        return this;
    }
    public Integer getRecallRestoreType() {
        return this.recallRestoreType;
    }

    public SubmitSqlFlashbackTaskRequest setRecallType(Integer recallType) {
        this.recallType = recallType;
        return this;
    }
    public Integer getRecallType() {
        return this.recallType;
    }

    public SubmitSqlFlashbackTaskRequest setSqlPk(String sqlPk) {
        this.sqlPk = sqlPk;
        return this;
    }
    public String getSqlPk() {
        return this.sqlPk;
    }

    public SubmitSqlFlashbackTaskRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public SubmitSqlFlashbackTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitSqlFlashbackTaskRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public SubmitSqlFlashbackTaskRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
