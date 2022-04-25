// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StorageRankDTO extends TeaModel {
    // 库存储排名
    @NameInMap("dbStorageRank")
    public java.util.List<DbStorageRank> dbStorageRank;

    // 小文件数量排名
    @NameInMap("smallFileCntRank")
    public java.util.List<SmallFileCntRank> smallFileCntRank;

    // 表存储排名
    @NameInMap("tableStorageRank")
    public java.util.List<TableStorageRank> tableStorageRank;

    public static StorageRankDTO build(java.util.Map<String, ?> map) throws Exception {
        StorageRankDTO self = new StorageRankDTO();
        return TeaModel.build(map, self);
    }

    public StorageRankDTO setDbStorageRank(java.util.List<DbStorageRank> dbStorageRank) {
        this.dbStorageRank = dbStorageRank;
        return this;
    }
    public java.util.List<DbStorageRank> getDbStorageRank() {
        return this.dbStorageRank;
    }

    public StorageRankDTO setSmallFileCntRank(java.util.List<SmallFileCntRank> smallFileCntRank) {
        this.smallFileCntRank = smallFileCntRank;
        return this;
    }
    public java.util.List<SmallFileCntRank> getSmallFileCntRank() {
        return this.smallFileCntRank;
    }

    public StorageRankDTO setTableStorageRank(java.util.List<TableStorageRank> tableStorageRank) {
        this.tableStorageRank = tableStorageRank;
        return this;
    }
    public java.util.List<TableStorageRank> getTableStorageRank() {
        return this.tableStorageRank;
    }

}
