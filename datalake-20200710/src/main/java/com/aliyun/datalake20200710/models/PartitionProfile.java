// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PartitionProfile extends TeaModel {
    // oss存储类型
    @NameInMap("ArchiveStatus")
    public String archiveStatus;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 库名称
    @NameInMap("DatabaseName")
    public String databaseName;

    // dml时间
    @NameInMap("DmlTime")
    public String dmlTime;

    // 存储位置
    @NameInMap("Location")
    public String location;

    // 分区名称
    @NameInMap("PartitionName")
    public String partitionName;

    // 表名称
    @NameInMap("TableName")
    public String tableName;

    public static PartitionProfile build(java.util.Map<String, ?> map) throws Exception {
        PartitionProfile self = new PartitionProfile();
        return TeaModel.build(map, self);
    }

    public PartitionProfile setArchiveStatus(String archiveStatus) {
        this.archiveStatus = archiveStatus;
        return this;
    }
    public String getArchiveStatus() {
        return this.archiveStatus;
    }

    public PartitionProfile setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public PartitionProfile setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public PartitionProfile setDmlTime(String dmlTime) {
        this.dmlTime = dmlTime;
        return this;
    }
    public String getDmlTime() {
        return this.dmlTime;
    }

    public PartitionProfile setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public PartitionProfile setPartitionName(String partitionName) {
        this.partitionName = partitionName;
        return this;
    }
    public String getPartitionName() {
        return this.partitionName;
    }

    public PartitionProfile setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
