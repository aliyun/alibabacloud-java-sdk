// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RenameTableRequest extends TeaModel {
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
     * <p>Whether to synchronize the update. Valid values:</p>
     * <ul>
     * <li>false (default): indicates that the operation is called synchronously. The operation returns results only when the background task is completed. Then the risk of false is that the interface will time out if the background task needs to be done very long.</li>
     * <li>true: The API operation is called asynchronously and does not wait for the background task to be returned. The response contains a taskid. In this way, the client can query the status of the task by using the taskid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsAsync")
    public Boolean isAsync;

    /**
     * <p>The data table object. Note that you only need to enter TableName.</p>
     */
    @NameInMap("TableInput")
    public TableInput tableInput;

    /**
     * <p>The name of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table_20201223</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static RenameTableRequest build(java.util.Map<String, ?> map) throws Exception {
        RenameTableRequest self = new RenameTableRequest();
        return TeaModel.build(map, self);
    }

    public RenameTableRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public RenameTableRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public RenameTableRequest setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public RenameTableRequest setTableInput(TableInput tableInput) {
        this.tableInput = tableInput;
        return this;
    }
    public TableInput getTableInput() {
        return this.tableInput;
    }

    public RenameTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
