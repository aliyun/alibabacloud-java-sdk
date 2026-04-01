// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class PartitionSummary extends TeaModel {
    /**
     * <p>Partition creation timestamp in milliseconds</p>
     * 
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>Database name</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <p>Total files in partition</p>
     * 
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("lastAccessTime")
    public Long lastAccessTime;

    @NameInMap("lastRequester")
    public String lastRequester;

    /**
     * <p>Partition identifier</p>
     * 
     * <strong>example:</strong>
     * <p>hh=18</p>
     */
    @NameInMap("partitionName")
    public String partitionName;

    @NameInMap("storageActionParams")
    public java.util.Map<String, String> storageActionParams;

    @NameInMap("storageActionTimestamp")
    public Long storageActionTimestamp;

    @NameInMap("storageClass")
    public String storageClass;

    /**
     * <p>Table name</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("tableName")
    public String tableName;

    @NameInMap("topRequester")
    public String topRequester;

    @NameInMap("totalFileAccessNum")
    public Long totalFileAccessNum;

    @NameInMap("totalFileAccessNum30d")
    public Long totalFileAccessNum30d;

    @NameInMap("totalFileAccessNum7d")
    public Long totalFileAccessNum7d;

    /**
     * <p>24h access count</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("totalFileCount")
    public Long totalFileCount;

    /**
     * <p>Last data access timestamp in milliseconds</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("totalFileSizeInBytes")
    public Long totalFileSizeInBytes;

    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
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

    public PartitionSummary setLastRequester(String lastRequester) {
        this.lastRequester = lastRequester;
        return this;
    }
    public String getLastRequester() {
        return this.lastRequester;
    }

    public PartitionSummary setPartitionName(String partitionName) {
        this.partitionName = partitionName;
        return this;
    }
    public String getPartitionName() {
        return this.partitionName;
    }

    public PartitionSummary setStorageActionParams(java.util.Map<String, String> storageActionParams) {
        this.storageActionParams = storageActionParams;
        return this;
    }
    public java.util.Map<String, String> getStorageActionParams() {
        return this.storageActionParams;
    }

    public PartitionSummary setStorageActionTimestamp(Long storageActionTimestamp) {
        this.storageActionTimestamp = storageActionTimestamp;
        return this;
    }
    public Long getStorageActionTimestamp() {
        return this.storageActionTimestamp;
    }

    public PartitionSummary setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public PartitionSummary setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public PartitionSummary setTopRequester(String topRequester) {
        this.topRequester = topRequester;
        return this;
    }
    public String getTopRequester() {
        return this.topRequester;
    }

    public PartitionSummary setTotalFileAccessNum(Long totalFileAccessNum) {
        this.totalFileAccessNum = totalFileAccessNum;
        return this;
    }
    public Long getTotalFileAccessNum() {
        return this.totalFileAccessNum;
    }

    public PartitionSummary setTotalFileAccessNum30d(Long totalFileAccessNum30d) {
        this.totalFileAccessNum30d = totalFileAccessNum30d;
        return this;
    }
    public Long getTotalFileAccessNum30d() {
        return this.totalFileAccessNum30d;
    }

    public PartitionSummary setTotalFileAccessNum7d(Long totalFileAccessNum7d) {
        this.totalFileAccessNum7d = totalFileAccessNum7d;
        return this;
    }
    public Long getTotalFileAccessNum7d() {
        return this.totalFileAccessNum7d;
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
