// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateTableRequest extends TeaModel {
    // AllowPartitionKeyChange
    @NameInMap("AllowPartitionKeyChange")
    public Boolean allowPartitionKeyChange;

    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // IsAsync
    @NameInMap("IsAsync")
    public Boolean isAsync;

    // SkipArchive
    @NameInMap("SkipArchive")
    public Boolean skipArchive;

    @NameInMap("TableInput")
    public TableInput tableInput;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    public static UpdateTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableRequest self = new UpdateTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTableRequest setAllowPartitionKeyChange(Boolean allowPartitionKeyChange) {
        this.allowPartitionKeyChange = allowPartitionKeyChange;
        return this;
    }
    public Boolean getAllowPartitionKeyChange() {
        return this.allowPartitionKeyChange;
    }

    public UpdateTableRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public UpdateTableRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public UpdateTableRequest setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public UpdateTableRequest setSkipArchive(Boolean skipArchive) {
        this.skipArchive = skipArchive;
        return this;
    }
    public Boolean getSkipArchive() {
        return this.skipArchive;
    }

    public UpdateTableRequest setTableInput(TableInput tableInput) {
        this.tableInput = tableInput;
        return this;
    }
    public TableInput getTableInput() {
        return this.tableInput;
    }

    public UpdateTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
