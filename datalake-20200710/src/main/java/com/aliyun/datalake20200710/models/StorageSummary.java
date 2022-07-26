// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StorageSummary extends TeaModel {
    @NameInMap("DatabaseNum")
    public Integer databaseNum;

    @NameInMap("PartitionNum")
    public Integer partitionNum;

    @NameInMap("TableNum")
    public Integer tableNum;

    public static StorageSummary build(java.util.Map<String, ?> map) throws Exception {
        StorageSummary self = new StorageSummary();
        return TeaModel.build(map, self);
    }

    public StorageSummary setDatabaseNum(Integer databaseNum) {
        this.databaseNum = databaseNum;
        return this;
    }
    public Integer getDatabaseNum() {
        return this.databaseNum;
    }

    public StorageSummary setPartitionNum(Integer partitionNum) {
        this.partitionNum = partitionNum;
        return this;
    }
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    public StorageSummary setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
        return this;
    }
    public Integer getTableNum() {
        return this.tableNum;
    }

}
