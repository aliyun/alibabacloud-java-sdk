// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class PartitionSummary extends TeaModel {
    /**
     * <p>Partition creation timestamp in milliseconds</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>Database name</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <p>Total files in partition</p>
     */
    @NameInMap("lastAccessTime")
    public Long lastAccessTime;

    /**
     * <p>Partition identifier</p>
     */
    @NameInMap("partitionName")
    public String partitionName;

    /**
     * <p>Table name</p>
     */
    @NameInMap("tableName")
    public String tableName;

    /**
     * <p>24h access count</p>
     */
    @NameInMap("totalFileCount")
    public Long totalFileCount;

    /**
     * <p>Last data access timestamp in milliseconds</p>
     */
    @NameInMap("totalFileSizeInBytes")
    public Long totalFileSizeInBytes;

    @NameInMap("updatedAt")
    public Long updatedAt;

    public static PartitionSummary build(java.util.Map<String, ?> map) throws Exception {
        PartitionSummary self = new PartitionSummary();
        return TeaModel.build(map, self);
    }

    public PartitionSummary setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public PartitionSummary setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public PartitionSummary setLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }
    public Long getLastAccessTime() {
        return this.lastAccessTime;
    }

    public PartitionSummary setPartitionName(String partitionName) {
        this.partitionName = partitionName;
        return this;
    }
    public String getPartitionName() {
        return this.partitionName;
    }

    public PartitionSummary setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public PartitionSummary setTotalFileCount(Long totalFileCount) {
        this.totalFileCount = totalFileCount;
        return this;
    }
    public Long getTotalFileCount() {
        return this.totalFileCount;
    }

    public PartitionSummary setTotalFileSizeInBytes(Long totalFileSizeInBytes) {
        this.totalFileSizeInBytes = totalFileSizeInBytes;
        return this;
    }
    public Long getTotalFileSizeInBytes() {
        return this.totalFileSizeInBytes;
    }

    public PartitionSummary setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
