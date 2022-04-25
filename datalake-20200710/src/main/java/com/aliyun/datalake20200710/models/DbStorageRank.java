// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DbStorageRank extends TeaModel {
    // 库名
    @NameInMap("DbName")
    public String dbName;

    // 存储量
    @NameInMap("Quantity")
    public Long quantity;

    public static DbStorageRank build(java.util.Map<String, ?> map) throws Exception {
        DbStorageRank self = new DbStorageRank();
        return TeaModel.build(map, self);
    }

    public DbStorageRank setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DbStorageRank setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

}
