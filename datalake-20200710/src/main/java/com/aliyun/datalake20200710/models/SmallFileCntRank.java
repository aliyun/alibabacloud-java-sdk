// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SmallFileCntRank extends TeaModel {
    // 库名
    @NameInMap("DbName")
    public String dbName;

    // 存储位置
    @NameInMap("Location")
    public String location;

    // 数量
    @NameInMap("Quantity")
    public Long quantity;

    // 表名
    @NameInMap("TableName")
    public String tableName;

    public static SmallFileCntRank build(java.util.Map<String, ?> map) throws Exception {
        SmallFileCntRank self = new SmallFileCntRank();
        return TeaModel.build(map, self);
    }

    public SmallFileCntRank setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SmallFileCntRank setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public SmallFileCntRank setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public SmallFileCntRank setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
