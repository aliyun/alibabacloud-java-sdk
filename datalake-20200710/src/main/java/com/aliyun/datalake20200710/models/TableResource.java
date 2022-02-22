// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableResource extends TeaModel {
    // database name
    @NameInMap("DatabaseName")
    public String databaseName;

    // tablename
    @NameInMap("TableName")
    public String tableName;

    public static TableResource build(java.util.Map<String, ?> map) throws Exception {
        TableResource self = new TableResource();
        return TeaModel.build(map, self);
    }

    public TableResource setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public TableResource setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
