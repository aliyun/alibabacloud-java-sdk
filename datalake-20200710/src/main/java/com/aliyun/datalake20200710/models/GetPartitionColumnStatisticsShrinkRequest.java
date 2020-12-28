// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetPartitionColumnStatisticsShrinkRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    @NameInMap("PartitionNames")
    public String partitionNamesShrink;

    @NameInMap("ColumnNames")
    public String columnNamesShrink;

    public static GetPartitionColumnStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionColumnStatisticsShrinkRequest self = new GetPartitionColumnStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPartitionColumnStatisticsShrinkRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public GetPartitionColumnStatisticsShrinkRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetPartitionColumnStatisticsShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GetPartitionColumnStatisticsShrinkRequest setPartitionNamesShrink(String partitionNamesShrink) {
        this.partitionNamesShrink = partitionNamesShrink;
        return this;
    }
    public String getPartitionNamesShrink() {
        return this.partitionNamesShrink;
    }

    public GetPartitionColumnStatisticsShrinkRequest setColumnNamesShrink(String columnNamesShrink) {
        this.columnNamesShrink = columnNamesShrink;
        return this;
    }
    public String getColumnNamesShrink() {
        return this.columnNamesShrink;
    }

}
