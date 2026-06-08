// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ExecutionResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RowCount")
    public Integer rowCount;

    @NameInMap("Rows")
    public String rows;

    @NameInMap("Schema")
    public java.util.List<SchemaColumn> schema;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRows")
    public Integer totalRows;

    public static ExecutionResult build(java.util.Map<String, ?> map) throws Exception {
        ExecutionResult self = new ExecutionResult();
        return TeaModel.build(map, self);
    }

    public ExecutionResult setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ExecutionResult setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Integer getRowCount() {
        return this.rowCount;
    }

    public ExecutionResult setRows(String rows) {
        this.rows = rows;
        return this;
    }
    public String getRows() {
        return this.rows;
    }

    public ExecutionResult setSchema(java.util.List<SchemaColumn> schema) {
        this.schema = schema;
        return this;
    }
    public java.util.List<SchemaColumn> getSchema() {
        return this.schema;
    }

    public ExecutionResult setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }
    public Integer getTotalRows() {
        return this.totalRows;
    }

}
