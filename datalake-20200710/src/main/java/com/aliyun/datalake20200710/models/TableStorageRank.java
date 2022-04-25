// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableStorageRank extends TeaModel {
    // 库名
    @NameInMap("DbName")
    public String dbName;

    // 存储量
    @NameInMap("Quantity")
    public Long quantity;

    // 表名
    @NameInMap("TableName")
    public String tableName;

    public static TableStorageRank build(java.util.Map<String, ?> map) throws Exception {
        TableStorageRank self = new TableStorageRank();
        return TeaModel.build(map, self);
    }

    public TableStorageRank setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public TableStorageRank setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public TableStorageRank setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
