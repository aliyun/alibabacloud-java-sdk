// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTablesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>pj</p>
     */
    @NameInMap("dstProjectName")
    public String dstProjectName;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("dstSchemaName")
    public String dstSchemaName;

    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("status")
    public String status;

    @NameInMap("tableNames")
    public java.util.List<String> tableNames;

    /**
     * <p>Deprecated</p>
     */
    @NameInMap("tables")
    public java.util.List<Long> tables;

    public static UpdateMmsTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTablesRequest self = new UpdateMmsTablesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTablesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public UpdateMmsTablesRequest setDstProjectName(String dstProjectName) {
        this.dstProjectName = dstProjectName;
        return this;
    }
    public String getDstProjectName() {
        return this.dstProjectName;
    }

    public UpdateMmsTablesRequest setDstSchemaName(String dstSchemaName) {
        this.dstSchemaName = dstSchemaName;
        return this;
    }
    public String getDstSchemaName() {
        return this.dstSchemaName;
    }

    public UpdateMmsTablesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateMmsTablesRequest setTableNames(java.util.List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

    public UpdateMmsTablesRequest setTables(java.util.List<Long> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<Long> getTables() {
        return this.tables;
    }

}
