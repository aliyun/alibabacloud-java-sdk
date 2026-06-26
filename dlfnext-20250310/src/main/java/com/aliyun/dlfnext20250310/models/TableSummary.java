// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TableSummary extends TeaModel {
    /**
     * <p>The timestamp, in milliseconds, indicating when the table was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("databaseName")
    public String databaseName;

    /**
     * <p>The generation date of the storage summary.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-01</p>
     */
    @NameInMap("generatedDate")
    public String generatedDate;

    /**
     * <p>The timestamp, in milliseconds, indicating when the table data was last accessed.</p>
     * 
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("lastAccessTime")
    public Long lastAccessTime;

    @NameInMap("lastRequester")
    public String lastRequester;

    /**
     * <p>The total size of data files in the Archive storage class, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("objTypeArchiveSize")
    public Long objTypeArchiveSize;

    /**
     * <p>The total size of data files in the Cold Archive storage class, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("objTypeColdArchiveSize")
    public Long objTypeColdArchiveSize;

    /**
     * <p>The total size of data files in the Infrequent Access storage class, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("objTypeIaSize")
    public Long objTypeIaSize;

    /**
     * <p>The total size of data files in the Standard storage class, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("objTypeStandardSize")
    public Long objTypeStandardSize;

    /**
     * <p>The total number of partitions in the table.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("partitionCount")
    public Long partitionCount;

    /**
     * <p>The storage location of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://clg-xxxx/db-xxxx/tbl-xxxx</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The storage action parameters.</p>
     */
    @NameInMap("storageActionParams")
    public java.util.Map<String, String> storageActionParams;

    @NameInMap("storageActionTimestamp")
    public Long storageActionTimestamp;

    /**
     * <p>The storage class.</p>
     */
    @NameInMap("storageClass")
    public String storageClass;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("tableName")
    public String tableName;

    @NameInMap("topRequester")
    public String topRequester;

    /**
     * <p>Total file access count.</p>
     */
    @NameInMap("totalFileAccessNum")
    public Long totalFileAccessNum;

    /**
     * <p>Total file access count over the last 30 days.</p>
     */
    @NameInMap("totalFileAccessNum30d")
    public Long totalFileAccessNum30d;

    /**
     * <p>Total file access count over the last 7 days.</p>
     */
    @NameInMap("totalFileAccessNum7d")
    public Long totalFileAccessNum7d;

    /**
     * <p>The total number of files in the table.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalFileCount")
    public Long totalFileCount;

    /**
     * <p>The total storage capacity of the table, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("totalFileSizeInBytes")
    public Long totalFileSizeInBytes;

    /**
     * <p>The total number of metadata files.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalMetaFileCount")
    public Long totalMetaFileCount;

    /**
     * <p>The total size of metadata files, in bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("totalMetaSizeInBytes")
    public Long totalMetaSizeInBytes;

    /**
     * <p>The number of Standard or Infrequent Access partitions unaccessed in the last 180 days.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("unaccessedStdIaPartitionCount180d")
    public Long unaccessedStdIaPartitionCount180d;

    /**
     * <p>The number of Standard partitions unaccessed in the last 30 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("unaccessedStdPartitionCount30d")
    public Long unaccessedStdPartitionCount30d;

    /**
     * <p>The update time.</p>
     */
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

    public TableSummary setLastRequester(String lastRequester) {
        this.lastRequester = lastRequester;
        return this;
    }
    public String getLastRequester() {
        return this.lastRequester;
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

    public TableSummary setTopRequester(String topRequester) {
        this.topRequester = topRequester;
        return this;
    }
    public String getTopRequester() {
        return this.topRequester;
    }

    public TableSummary setTotalFileAccessNum(Long totalFileAccessNum) {
        this.totalFileAccessNum = totalFileAccessNum;
        return this;
    }
    public Long getTotalFileAccessNum() {
        return this.totalFileAccessNum;
    }

    public TableSummary setTotalFileAccessNum30d(Long totalFileAccessNum30d) {
        this.totalFileAccessNum30d = totalFileAccessNum30d;
        return this;
    }
    public Long getTotalFileAccessNum30d() {
        return this.totalFileAccessNum30d;
    }

    public TableSummary setTotalFileAccessNum7d(Long totalFileAccessNum7d) {
        this.totalFileAccessNum7d = totalFileAccessNum7d;
        return this;
    }
    public Long getTotalFileAccessNum7d() {
        return this.totalFileAccessNum7d;
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
