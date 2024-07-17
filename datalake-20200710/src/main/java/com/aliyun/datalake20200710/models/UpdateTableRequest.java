// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateTableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowPartitionKeyChange")
    public Boolean allowPartitionKeyChange;

    /**
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <strong>example:</strong>
     * <p>database_test</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAsync")
    public Boolean isAsync;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipArchive")
    public Boolean skipArchive;

    @NameInMap("TableInput")
    public TableInput tableInput;

    /**
     * <strong>example:</strong>
     * <p>test_table_20201223</p>
     */
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
