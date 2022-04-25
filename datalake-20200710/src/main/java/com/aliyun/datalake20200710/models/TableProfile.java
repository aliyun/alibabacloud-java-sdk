// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableProfile extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 库名称
    @NameInMap("DatabaseName")
    public String databaseName;

    // 文件数量
    @NameInMap("FileCnt")
    public Long fileCnt;

    // 文件大小
    @NameInMap("FileSize")
    public Long fileSize;

    // 是否分区表
    @NameInMap("IsPartitioned")
    public Boolean isPartitioned;

    // 最后跟新时间
    @NameInMap("LastModifyTime")
    public String lastModifyTime;

    // 存储位置
    @NameInMap("Location")
    public String location;

    // 分区数量
    @NameInMap("PartitionCnt")
    public Long partitionCnt;

    // 记录数
    @NameInMap("RecordCnt")
    public Long recordCnt;

    // 表名称
    @NameInMap("TableName")
    public String tableName;

    public static TableProfile build(java.util.Map<String, ?> map) throws Exception {
        TableProfile self = new TableProfile();
        return TeaModel.build(map, self);
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
