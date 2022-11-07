// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableProfile extends TeaModel {
    @NameInMap("AccessNum")
    public Long accessNum;

    @NameInMap("AccessNumMonthly")
    public Long accessNumMonthly;

    @NameInMap("AccessNumWeekly")
    public Long accessNumWeekly;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("FileCnt")
    public Long fileCnt;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("IsPartitioned")
    public Boolean isPartitioned;

    @NameInMap("LastModifyTime")
    public String lastModifyTime;

    @NameInMap("Location")
    public String location;

    @NameInMap("PartitionCnt")
    public Long partitionCnt;

    @NameInMap("RecordCnt")
    public Long recordCnt;

    @NameInMap("TableName")
    public String tableName;

    public static TableProfile build(java.util.Map<String, ?> map) throws Exception {
        TableProfile self = new TableProfile();
        return TeaModel.build(map, self);
    }

    public TableProfile setAccessNum(Long accessNum) {
        this.accessNum = accessNum;
        return this;
    }
    public Long getAccessNum() {
        return this.accessNum;
    }

    public TableProfile setAccessNumMonthly(Long accessNumMonthly) {
        this.accessNumMonthly = accessNumMonthly;
        return this;
    }
    public Long getAccessNumMonthly() {
        return this.accessNumMonthly;
    }

    public TableProfile setAccessNumWeekly(Long accessNumWeekly) {
        this.accessNumWeekly = accessNumWeekly;
        return this;
    }
    public Long getAccessNumWeekly() {
        return this.accessNumWeekly;
    }

    public TableProfile setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TableProfile setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public TableProfile setFileCnt(Long fileCnt) {
        this.fileCnt = fileCnt;
        return this;
    }
    public Long getFileCnt() {
        return this.fileCnt;
    }

    public TableProfile setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public TableProfile setIsPartitioned(Boolean isPartitioned) {
        this.isPartitioned = isPartitioned;
        return this;
    }
    public Boolean getIsPartitioned() {
        return this.isPartitioned;
    }

    public TableProfile setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    public TableProfile setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public TableProfile setPartitionCnt(Long partitionCnt) {
        this.partitionCnt = partitionCnt;
        return this;
    }
    public Long getPartitionCnt() {
        return this.partitionCnt;
    }

    public TableProfile setRecordCnt(Long recordCnt) {
        this.recordCnt = recordCnt;
        return this;
    }
    public Long getRecordCnt() {
        return this.recordCnt;
    }

    public TableProfile setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
