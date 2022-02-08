// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListHiveColumnLineagesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("TableName")
    public String tableName;

    public static ListHiveColumnLineagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHiveColumnLineagesRequest self = new ListHiveColumnLineagesRequest();
        return TeaModel.build(map, self);
    }

    public ListHiveColumnLineagesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListHiveColumnLineagesRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListHiveColumnLineagesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListHiveColumnLineagesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
