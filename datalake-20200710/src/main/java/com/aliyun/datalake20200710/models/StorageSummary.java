// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StorageSummary extends TeaModel {
    // database num of this catalog
    @NameInMap("DatabaseNum")
    public Long databaseNum;

    // partition num of this catalog
    @NameInMap("PartitionNum")
    public Long partitionNum;

    // table num of this catalog
    @NameInMap("TableNum")
    public Long tableNum;

    public static StorageSummary build(java.util.Map<String, ?> map) throws Exception {
        StorageSummary self = new StorageSummary();
        return TeaModel.build(map, self);
    }

    public StorageSummary setDatabaseNum(Long databaseNum) {
        this.databaseNum = databaseNum;
        return this;
    }
    public Long getDatabaseNum() {
        return this.databaseNum;
    }

    public StorageSummary setPartitionNum(Long partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Long getPartitionNum() {
        return this.partitionNum;
    }

    public StorageSummary setTableNum(Long tableNum) {
        this.tableNum = tableNum;
        return this;
    }
    public Long getTableNum() {
        return this.tableNum;
    }

}
