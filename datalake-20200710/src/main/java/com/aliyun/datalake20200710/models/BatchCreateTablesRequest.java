// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchCreateTablesRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // IfNotExists
    @NameInMap("IfNotExists")
    public Boolean ifNotExists;

    // TableInputs
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
