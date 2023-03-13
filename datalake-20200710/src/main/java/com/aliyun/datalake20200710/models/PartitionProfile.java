// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PartitionProfile extends TeaModel {
    @NameInMap("ArchiveStatus")
    public String archiveStatus;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("LastAccessTime")
    public String lastAccessTime;

    @NameInMap("LastModifedTime")
    public String lastModifedTime;

    @NameInMap("LatestDate")
    public String latestDate;

    @NameInMap("Location")
    public String location;

    @NameInMap("PartitionName")
    public String partitionName;

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

    public PartitionProfile setLastAccessTime(String lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public String getLastAccessTime() {
        return this.lastAccessTime;
    }

    public PartitionProfile setLastModifedTime(String lastModifedTime) {
        this.lastModifedTime = lastModifedTime;
        return this;
    }
    public String getLastModifedTime() {
        return this.lastModifedTime;
    }

    public PartitionProfile setLatestDate(String latestDate) {
        this.latestDate = latestDate;
        return this;
    }
    public String getLatestDate() {
        return this.latestDate;
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
