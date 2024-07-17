// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class TableProfile extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessNum")
    public Long accessNum;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessNumMonthly")
    public Long accessNumMonthly;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessNumWeekly")
    public Long accessNumWeekly;

    /**
     * <strong>example:</strong>
     * <p>2023-08-14 10:44:13</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>OSS_HDFS</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("FileCnt")
    public Long fileCnt;

    /**
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPartitioned")
    public Boolean isPartitioned;

    @NameInMap("LastAccessNumTime")
    public String lastAccessNumTime;

    /**
     * <strong>example:</strong>
     * <p>2023-08-22 12:14:42</p>
     */
    @NameInMap("LastAccessTime")
    public String lastAccessTime;

    /**
     * <strong>example:</strong>
     * <p>2023-08-16 18:02:24</p>
     */
    @NameInMap("LastDdlTime")
    public String lastDdlTime;

    /**
     * <strong>example:</strong>
     * <p>2023-08-16 18:02:25</p>
     */
    @NameInMap("LastModifyTime")
    public String lastModifyTime;

    @NameInMap("LatestAccessNumDate")
    public String latestAccessNumDate;

    /**
     * <strong>example:</strong>
     * <p>2023-08-30 19:16:10</p>
     */
    @NameInMap("LatestDate")
    public String latestDate;

    /**
     * <strong>example:</strong>
     * <p>oss://mybucket.cn-hangzhou.oss-dls.aliyuncs.com/test_db/test_tbl/</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ObjectAccessNum")
    public Long objectAccessNum;

    /**
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("ObjectAccessNumMonthly")
    public Long objectAccessNumMonthly;

    /**
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("ObjectAccessNumWeekly")
    public Long objectAccessNumWeekly;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ObjectCnt")
    public Long objectCnt;

    /**
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("ObjectSize")
    public Long objectSize;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PartitionCnt")
    public Long partitionCnt;

    @NameInMap("RecordCnt")
    public Long recordCnt;

    /**
     * <strong>example:</strong>
     * <p>test_tbl</p>
     */
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

    public TableProfile setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
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

    public TableProfile setLastAccessNumTime(String lastAccessNumTime) {
        this.lastAccessNumTime = lastAccessNumTime;
        return this;
    }
    public String getLastAccessNumTime() {
        return this.lastAccessNumTime;
    }

    public TableProfile setLastAccessTime(String lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public String getLastAccessTime() {
        return this.lastAccessTime;
    }

    public TableProfile setLastDdlTime(String lastDdlTime) {
        this.lastDdlTime = lastDdlTime;
        return this;
    }
    public String getLastDdlTime() {
        return this.lastDdlTime;
    }

    public TableProfile setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    public TableProfile setLatestAccessNumDate(String latestAccessNumDate) {
        this.latestAccessNumDate = latestAccessNumDate;
        return this;
    }
    public String getLatestAccessNumDate() {
        return this.latestAccessNumDate;
    }

    public TableProfile setLatestDate(String latestDate) {
        this.latestDate = latestDate;
        return this;
    }
    public String getLatestDate() {
        return this.latestDate;
    }

    public TableProfile setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public TableProfile setObjectAccessNum(Long objectAccessNum) {
        this.objectAccessNum = objectAccessNum;
        return this;
    }
    public Long getObjectAccessNum() {
        return this.objectAccessNum;
    }

    public TableProfile setObjectAccessNumMonthly(Long objectAccessNumMonthly) {
        this.objectAccessNumMonthly = objectAccessNumMonthly;
        return this;
    }
    public Long getObjectAccessNumMonthly() {
        return this.objectAccessNumMonthly;
    }

    public TableProfile setObjectAccessNumWeekly(Long objectAccessNumWeekly) {
        this.objectAccessNumWeekly = objectAccessNumWeekly;
        return this;
    }
    public Long getObjectAccessNumWeekly() {
        return this.objectAccessNumWeekly;
    }

    public TableProfile setObjectCnt(Long objectCnt) {
        this.objectCnt = objectCnt;
        return this;
    }
    public Long getObjectCnt() {
        return this.objectCnt;
    }

    public TableProfile setObjectSize(Long objectSize) {
        this.objectSize = objectSize;
        return this;
    }
    public Long getObjectSize() {
        return this.objectSize;
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
