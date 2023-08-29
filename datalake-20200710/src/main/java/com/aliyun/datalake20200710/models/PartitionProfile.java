// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PartitionProfile extends TeaModel {
    @NameInMap("AccessNum")
    public Long accessNum;

    @NameInMap("AccessNumMonthly")
    public Long accessNumMonthly;

    @NameInMap("AccessNumWeekly")
    public Long accessNumWeekly;

    @NameInMap("ArchiveStatus")
    public String archiveStatus;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DataSourceType")
    public String dataSourceType;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("FileCnt")
    public Long fileCnt;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("LastAccessNumTime")
    public String lastAccessNumTime;

    @NameInMap("LastAccessTime")
    public String lastAccessTime;

    @NameInMap("LastModifyTime")
    public String lastModifyTime;

    @NameInMap("Location")
    public String location;

    @NameInMap("ObjectAccessNum")
    public Long objectAccessNum;

    @NameInMap("ObjectAccessNumMonthly")
    public Long objectAccessNumMonthly;

    @NameInMap("ObjectAccessNumWeekly")
    public Long objectAccessNumWeekly;

    @NameInMap("ObjectCnt")
    public Long objectCnt;

    @NameInMap("ObjectSize")
    public Long objectSize;

    @NameInMap("PartitionName")
    public String partitionName;

    @NameInMap("TableName")
    public String tableName;

    public static PartitionProfile build(java.util.Map<String, ?> map) throws Exception {
        PartitionProfile self = new PartitionProfile();
        return TeaModel.build(map, self);
    }

    public PartitionProfile setAccessNum(Long accessNum) {
        this.accessNum = accessNum;
        return this;
    }
    public Long getAccessNum() {
        return this.accessNum;
    }

    public PartitionProfile setAccessNumMonthly(Long accessNumMonthly) {
        this.accessNumMonthly = accessNumMonthly;
        return this;
    }
    public Long getAccessNumMonthly() {
        return this.accessNumMonthly;
    }

    public PartitionProfile setAccessNumWeekly(Long accessNumWeekly) {
        this.accessNumWeekly = accessNumWeekly;
        return this;
    }
    public Long getAccessNumWeekly() {
        return this.accessNumWeekly;
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

    public PartitionProfile setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public PartitionProfile setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public PartitionProfile setFileCnt(Long fileCnt) {
        this.fileCnt = fileCnt;
        return this;
    }
    public Long getFileCnt() {
        return this.fileCnt;
    }

    public PartitionProfile setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public PartitionProfile setLastAccessNumTime(String lastAccessNumTime) {
        this.lastAccessNumTime = lastAccessNumTime;
        return this;
    }
    public String getLastAccessNumTime() {
        return this.lastAccessNumTime;
    }

    public PartitionProfile setLastAccessTime(String lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public String getLastAccessTime() {
        return this.lastAccessTime;
    }

    public PartitionProfile setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    public PartitionProfile setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public PartitionProfile setObjectAccessNum(Long objectAccessNum) {
        this.objectAccessNum = objectAccessNum;
        return this;
    }
    public Long getObjectAccessNum() {
        return this.objectAccessNum;
    }

    public PartitionProfile setObjectAccessNumMonthly(Long objectAccessNumMonthly) {
        this.objectAccessNumMonthly = objectAccessNumMonthly;
        return this;
    }
    public Long getObjectAccessNumMonthly() {
        return this.objectAccessNumMonthly;
    }

    public PartitionProfile setObjectAccessNumWeekly(Long objectAccessNumWeekly) {
        this.objectAccessNumWeekly = objectAccessNumWeekly;
        return this;
    }
    public Long getObjectAccessNumWeekly() {
        return this.objectAccessNumWeekly;
    }

    public PartitionProfile setObjectCnt(Long objectCnt) {
        this.objectCnt = objectCnt;
        return this;
    }
    public Long getObjectCnt() {
        return this.objectCnt;
    }

    public PartitionProfile setObjectSize(Long objectSize) {
        this.objectSize = objectSize;
        return this;
    }
    public Long getObjectSize() {
        return this.objectSize;
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
