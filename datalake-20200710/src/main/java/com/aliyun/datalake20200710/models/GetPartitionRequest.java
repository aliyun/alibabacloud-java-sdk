// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetPartitionRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("PartitionValues")
    public java.util.List<String> partitionValues;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    public static GetPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionRequest self = new GetPartitionRequest();
        return TeaModel.build(map, self);
    }

    public GetPartitionRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public GetPartitionRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetPartitionRequest setPartitionValues(java.util.List<String> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }
    public java.util.List<String> getPartitionValues() {
        return this.partitionValues;
    }

    public GetPartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
