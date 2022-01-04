// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeletePartitionColumnStatisticsShrinkRequest extends TeaModel {
    // CatalogId
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("ColumnNames")
    public String columnNamesShrink;

    // DatabaseName
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("PartitionNames")
    public String partitionNamesShrink;

    // TableName
    @NameInMap("TableName")
    public String tableName;

    public static DeletePartitionColumnStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePartitionColumnStatisticsShrinkRequest self = new DeletePartitionColumnStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeletePartitionColumnStatisticsShrinkRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public DeletePartitionColumnStatisticsShrinkRequest setColumnNamesShrink(String columnNamesShrink) {
        this.columnNamesShrink = columnNamesShrink;
        return this;
    }
    public String getColumnNamesShrink() {
        return this.columnNamesShrink;
    }

    public DeletePartitionColumnStatisticsShrinkRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DeletePartitionColumnStatisticsShrinkRequest setPartitionNamesShrink(String partitionNamesShrink) {
        this.partitionNamesShrink = partitionNamesShrink;
        return this;
    }
    public String getPartitionNamesShrink() {
        return this.partitionNamesShrink;
    }

    public DeletePartitionColumnStatisticsShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
