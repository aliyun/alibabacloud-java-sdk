// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class DatabaseSummary extends TeaModel {
    /**
     * <p>Creation timestamp in milliseconds</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>库名 - Database name</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <p>Last profile update date in format yyyyMMdd</p>
     */
    @NameInMap("generatedDate")
    public String generatedDate;

    /**
     * <p>Storage location URI</p>
     */
    @NameInMap("location")
    public String location;

    @NameInMap("partitionCount")
    public Long partitionCount;

    /**
     * <p>Total storage in bytes</p>
     */
    @NameInMap("tableCount")
    public Long tableCount;

    @NameInMap("totalFileCount")
    public Long totalFileCount;

    /**
     * <p>Total file count</p>
     */
    @NameInMap("totalFileSizeInBytes")
    public Long totalFileSizeInBytes;

    public static DatabaseSummary build(java.util.Map<String, ?> map) throws Exception {
        DatabaseSummary self = new DatabaseSummary();
        return TeaModel.build(map, self);
    }

    public DatabaseSummary setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public DatabaseSummary setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DatabaseSummary setGeneratedDate(String generatedDate) {
        this.generatedDate = generatedDate;
        return this;
    }
    public String getGeneratedDate() {
        return this.generatedDate;
    }

    public DatabaseSummary setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DatabaseSummary setPartitionCount(Long partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }
    public Long getPartitionCount() {
        return this.partitionCount;
    }

    public DatabaseSummary setTableCount(Long tableCount) {
        this.tableCount = tableCount;
        return this;
    }
    public Long getTableCount() {
        return this.tableCount;
    }

    public DatabaseSummary setTotalFileCount(Long totalFileCount) {
        this.totalFileCount = totalFileCount;
        return this;
    }
    public Long getTotalFileCount() {
        return this.totalFileCount;
    }

    public DatabaseSummary setTotalFileSizeInBytes(Long totalFileSizeInBytes) {
        this.totalFileSizeInBytes = totalFileSizeInBytes;
        return this;
    }
    public Long getTotalFileSizeInBytes() {
        return this.totalFileSizeInBytes;
    }

}
