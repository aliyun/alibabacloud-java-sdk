// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchUpdateTablesRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // 是否异步
    @NameInMap("IsAsync")
    public Boolean isAsync;

    // TableInputs
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
