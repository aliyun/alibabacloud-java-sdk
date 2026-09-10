// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckSqlPreviewRequest extends TeaModel {
    /**
     * <p>The columns to check.</p>
     * 
     * <strong>example:</strong>
     * <p>id,name</p>
     */
    @NameInMap("checkColumn")
    public String checkColumn;

    /**
     * <p>The ID of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>230</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <p>The ID of the check engine. Used in Spark scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>230</p>
     */
    @NameInMap("engineId")
    public String engineId;

    /**
     * <p>The name of the table to check, in the format <code>schema.table</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db.test_table</p>
     */
    @NameInMap("fullTableName")
    public String fullTableName;

    /**
     * <p>The partition condition.</p>
     * 
     * <strong>example:</strong>
     * <p>date_part=20240719</p>
     */
    @NameInMap("partitionCondition")
    public String partitionCondition;

    /**
     * <p>The ID of the check task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    /**
     * <p>The WHERE condition.</p>
     * 
     * <strong>example:</strong>
     * <p>id &gt; 100</p>
     */
    @NameInMap("whereClause")
    public String whereClause;

    public static ExecDataCheckSqlPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckSqlPreviewRequest self = new ExecDataCheckSqlPreviewRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckSqlPreviewRequest setCheckColumn(String checkColumn) {
        this.checkColumn = checkColumn;
        return this;
    }
    public String getCheckColumn() {
        return this.checkColumn;
    }

    public ExecDataCheckSqlPreviewRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ExecDataCheckSqlPreviewRequest setEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }
    public String getEngineId() {
        return this.engineId;
    }

    public ExecDataCheckSqlPreviewRequest setFullTableName(String fullTableName) {
        this.fullTableName = fullTableName;
        return this;
    }
    public String getFullTableName() {
        return this.fullTableName;
    }

    public ExecDataCheckSqlPreviewRequest setPartitionCondition(String partitionCondition) {
        this.partitionCondition = partitionCondition;
        return this;
    }
    public String getPartitionCondition() {
        return this.partitionCondition;
    }

    public ExecDataCheckSqlPreviewRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ExecDataCheckSqlPreviewRequest setWhereClause(String whereClause) {
        this.whereClause = whereClause;
        return this;
    }
    public String getWhereClause() {
        return this.whereClause;
    }

}
