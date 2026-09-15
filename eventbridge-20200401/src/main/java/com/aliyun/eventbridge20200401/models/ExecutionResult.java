// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ExecutionResult extends TeaModel {
    /**
     * <p>Indicates whether the result is truncated because of the maxRows limit.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The number of rows returned in this response.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RowCount")
    public Integer rowCount;

    /**
     * <p>A two-dimensional array where each row is an array.</p>
     * 
     * <strong>example:</strong>
     * <p>[[&quot;Beijing&quot;,120],[&quot;Shanghai&quot;,98]]</p>
     */
    @NameInMap("Rows")
    public String rows;

    /**
     * <p>The schema information.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Name&quot;:&quot;event_date&quot;,&quot;Type&quot;:&quot;varchar&quot;}]</p>
     */
    @NameInMap("Schema")
    public java.util.List<SchemaColumn> schema;

    /**
     * <p>The total number of rows that match the condition. This value differs from RowCount when IsTruncated is set to true.</p>
     * 
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
