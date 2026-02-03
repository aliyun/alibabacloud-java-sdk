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

    @NameInMap("objTypeArchiveSize")
    public Long objTypeArchiveSize;

    @NameInMap("objTypeColdArchiveSize")
    public Long objTypeColdArchiveSize;

    @NameInMap("objTypeIaSize")
    public Long objTypeIaSize;

    @NameInMap("objTypeStandardSize")
    public Long objTypeStandardSize;

    /**
     * <p>Creation timestamp in milliseconds</p>
     */
    @NameInMap("partitionCount")
    public Long partitionCount;

    @NameInMap("path")
    public String path;

    @NameInMap("storageActionParams")
    public java.util.Map<String, String> storageActionParams;

    @NameInMap("storageActionTimestamp")
    public Long storageActionTimestamp;

    @NameInMap("storageClass")
    public String storageClass;

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

    @NameInMap("totalMetaFileCount")
    public Long totalMetaFileCount;

    @NameInMap("totalMetaSizeInBytes")
    public Long totalMetaSizeInBytes;

    /**
     * <p>Creation timestamp in milliseconds</p>
     */
    @NameInMap("unaccessedStdIaPartitionCount180d")
    public Long unaccessedStdIaPartitionCount180d;

    /**
     * <p>Creation timestamp in milliseconds</p>
     */
    @NameInMap("unaccessedStdPartitionCount30d")
    public Long unaccessedStdPartitionCount30d;

    @NameInMap("updatedAt")
    public Long updatedAt;

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

    public TableSummary setObjTypeArchiveSize(Long objTypeArchiveSize) {
        this.objTypeArchiveSize = objTypeArchiveSize;
        return this;
    }
    public Long getObjTypeArchiveSize() {
        return this.objTypeArchiveSize;
    }

    public TableSummary setObjTypeColdArchiveSize(Long objTypeColdArchiveSize) {
        this.objTypeColdArchiveSize = objTypeColdArchiveSize;
        return this;
    }
    public Long getObjTypeColdArchiveSize() {
        return this.objTypeColdArchiveSize;
    }

    public TableSummary setObjTypeIaSize(Long objTypeIaSize) {
        this.objTypeIaSize = objTypeIaSize;
        return this;
    }
    public Long getObjTypeIaSize() {
        return this.objTypeIaSize;
    }

    public TableSummary setObjTypeStandardSize(Long objTypeStandardSize) {
        this.objTypeStandardSize = objTypeStandardSize;
        return this;
    }
    public Long getObjTypeStandardSize() {
        return this.objTypeStandardSize;
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

    public TableSummary setStorageActionParams(java.util.Map<String, String> storageActionParams) {
        this.storageActionParams = storageActionParams;
        return this;
    }
    public java.util.Map<String, String> getStorageActionParams() {
        return this.storageActionParams;
    }

    public TableSummary setStorageActionTimestamp(Long storageActionTimestamp) {
        this.storageActionTimestamp = storageActionTimestamp;
        return this;
    }
    public Long getStorageActionTimestamp() {
        return this.storageActionTimestamp;
    }

    public TableSummary setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
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

    public TableSummary setTotalMetaFileCount(Long totalMetaFileCount) {
        this.totalMetaFileCount = totalMetaFileCount;
        return this;
    }
    public Long getTotalMetaFileCount() {
        return this.totalMetaFileCount;
    }

    public TableSummary setTotalMetaSizeInBytes(Long totalMetaSizeInBytes) {
        this.totalMetaSizeInBytes = totalMetaSizeInBytes;
        return this;
    }
    public Long getTotalMetaSizeInBytes() {
        return this.totalMetaSizeInBytes;
    }

    public TableSummary setUnaccessedStdIaPartitionCount180d(Long unaccessedStdIaPartitionCount180d) {
        this.unaccessedStdIaPartitionCount180d = unaccessedStdIaPartitionCount180d;
        return this;
    }
    public Long getUnaccessedStdIaPartitionCount180d() {
        return this.unaccessedStdIaPartitionCount180d;
    }

    public TableSummary setUnaccessedStdPartitionCount30d(Long unaccessedStdPartitionCount30d) {
        this.unaccessedStdPartitionCount30d = unaccessedStdPartitionCount30d;
        return this;
    }
    public Long getUnaccessedStdPartitionCount30d() {
        return this.unaccessedStdPartitionCount30d;
    }

    public TableSummary setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
