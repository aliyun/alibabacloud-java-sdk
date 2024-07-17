// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableColumnStatisticsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1344371</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    @NameInMap("ColumnNames")
    public String columnNamesShrink;

    /**
     * <strong>example:</strong>
     * <p>database_test</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>test_table_20201223</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetTableColumnStatisticsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnStatisticsShrinkRequest self = new GetTableColumnStatisticsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTableColumnStatisticsShrinkRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public GetTableColumnStatisticsShrinkRequest setColumnNamesShrink(String columnNamesShrink) {
        this.columnNamesShrink = columnNamesShrink;
        return this;
    }
    public String getColumnNamesShrink() {
        return this.columnNamesShrink;
    }

    public GetTableColumnStatisticsShrinkRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetTableColumnStatisticsShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
