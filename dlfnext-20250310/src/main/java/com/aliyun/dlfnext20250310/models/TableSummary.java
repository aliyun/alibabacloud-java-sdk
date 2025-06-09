// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TableSummary extends TeaModel {
    /**
     * <p>Latest snapshot storage size</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>Database name</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    @NameInMap("generatedDate")
    public String generatedDate;

    @NameInMap("lastAccessTime")
    public Long lastAccessTime;

    /**
     * <p>Creation timestamp in milliseconds</p>
     */
    @NameInMap("partitionCount")
    public Long partitionCount;

    @NameInMap("path")
    public String path;

    /**
     * <p>Table name</p>
     */
    @NameInMap("tableName")
    public String tableName;

    /**
     * <p>30-day access count</p>
     */
    @NameInMap("totalFileCount")
    public Long totalFileCount;

    @NameInMap("totalFileSizeInBytes")
    public Long totalFileSizeInBytes;

    public static TableSummary build(java.util.Map<String, ?> map) throws Exception {
        TableSummary self = new TableSummary();
        return TeaModel.build(map, self);
    }

    public TableSummary setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public TableSummary setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public TableSummary setGeneratedDate(String generatedDate) {
        this.generatedDate = generatedDate;
        return this;
    }
    public String getGeneratedDate() {
        return this.generatedDate;
    }

    public TableSummary setLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Long getLastAccessTime() {
        return this.lastAccessTime;
    }

    public TableSummary setPartitionCount(Long partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }
    public Long getPartitionCount() {
        return this.partitionCount;
    }

    public TableSummary setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public TableSummary setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public TableSummary setTotalFileCount(Long totalFileCount) {
        this.totalFileCount = totalFileCount;
        return this;
    }
    public Long getTotalFileCount() {
        return this.totalFileCount;
    }

    public TableSummary setTotalFileSizeInBytes(Long totalFileSizeInBytes) {
        this.totalFileSizeInBytes = totalFileSizeInBytes;
        return this;
    }
    public Long getTotalFileSizeInBytes() {
        return this.totalFileSizeInBytes;
    }

}
