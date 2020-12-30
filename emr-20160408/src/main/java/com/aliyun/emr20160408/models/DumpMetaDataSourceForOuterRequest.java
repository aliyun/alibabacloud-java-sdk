// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DumpMetaDataSourceForOuterRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DumpAllDatabase")
    public Boolean dumpAllDatabase;

    @NameInMap("DatabaseId")
    public String databaseId;

    @NameInMap("DumpAllTable")
    public Boolean dumpAllTable;

    @NameInMap("TableId")
    public String tableId;

    @NameInMap("DumpAllPartition")
    public Boolean dumpAllPartition;

    @NameInMap("DumpLimit")
    public Integer dumpLimit;

    @NameInMap("PartitionValues")
    public java.util.List<String> partitionValues;

    public static DumpMetaDataSourceForOuterRequest build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaDataSourceForOuterRequest self = new DumpMetaDataSourceForOuterRequest();
        return TeaModel.build(map, self);
    }

    public DumpMetaDataSourceForOuterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DumpMetaDataSourceForOuterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DumpMetaDataSourceForOuterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DumpMetaDataSourceForOuterRequest setDumpAllDatabase(Boolean dumpAllDatabase) {
        this.dumpAllDatabase = dumpAllDatabase;
        return this;
    }
    public Boolean getDumpAllDatabase() {
        return this.dumpAllDatabase;
    }

    public DumpMetaDataSourceForOuterRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public DumpMetaDataSourceForOuterRequest setDumpAllTable(Boolean dumpAllTable) {
        this.dumpAllTable = dumpAllTable;
        return this;
    }
    public Boolean getDumpAllTable() {
        return this.dumpAllTable;
    }

    public DumpMetaDataSourceForOuterRequest setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

    public DumpMetaDataSourceForOuterRequest setDumpAllPartition(Boolean dumpAllPartition) {
        this.dumpAllPartition = dumpAllPartition;
        return this;
    }
    public Boolean getDumpAllPartition() {
        return this.dumpAllPartition;
    }

    public DumpMetaDataSourceForOuterRequest setDumpLimit(Integer dumpLimit) {
        this.dumpLimit = dumpLimit;
        return this;
    }
    public Integer getDumpLimit() {
        return this.dumpLimit;
    }

    public DumpMetaDataSourceForOuterRequest setPartitionValues(java.util.List<String> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }
    public java.util.List<String> getPartitionValues() {
        return this.partitionValues;
    }

}
