// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchCreateTablesRequest extends TeaModel {
    /**
     * <p>The ID of the data directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>The name of a database.</p>
     * 
     * <strong>example:</strong>
     * <p>database_test</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>Specifies whether to ignore the exception if a table with the same name already exists.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IfNotExists")
    public Boolean ifNotExists;

    /**
     * <p>The list of data tables.</p>
     */
    @NameInMap("TableInputs")
    public java.util.List<TableInput> tableInputs;

    public static BatchCreateTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateTablesRequest self = new BatchCreateTablesRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateTablesRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchCreateTablesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public BatchCreateTablesRequest setIfNotExists(Boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
        return this;
    }
    public Boolean getIfNotExists() {
        return this.ifNotExists;
    }

    public BatchCreateTablesRequest setTableInputs(java.util.List<TableInput> tableInputs) {
        this.tableInputs = tableInputs;
        return this;
    }
    public java.util.List<TableInput> getTableInputs() {
        return this.tableInputs;
    }

}
