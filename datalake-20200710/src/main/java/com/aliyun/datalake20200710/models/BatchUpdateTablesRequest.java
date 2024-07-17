// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchUpdateTablesRequest extends TeaModel {
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
