// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchUpdateTablesRequest extends TeaModel {
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
     * <p>Whether the table is updated asynchronously. Valid values:</p>
     * <ul>
     * <li>true: The API operation is called asynchronously and does not wait for the background task to be returned. The response contains a taskid. In this way, the client can query the status of the task by using the taskid.</li>
     * <li>false: indicates a synchronous call. The interface returns results only when the background task is completed. Then the risk of false is that the interface will time out if the background task needs to be done very long.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAsync")
    public Boolean isAsync;

    /**
     * <p>The details of the updated data table.</p>
     */
    @NameInMap("TableInputs")
    public java.util.List<TableInput> tableInputs;

    public static BatchUpdateTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTablesRequest self = new BatchUpdateTablesRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTablesRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public BatchUpdateTablesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public BatchUpdateTablesRequest setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public BatchUpdateTablesRequest setTableInputs(java.util.List<TableInput> tableInputs) {
        this.tableInputs = tableInputs;
        return this;
    }
    public java.util.List<TableInput> getTableInputs() {
        return this.tableInputs;
    }

}
