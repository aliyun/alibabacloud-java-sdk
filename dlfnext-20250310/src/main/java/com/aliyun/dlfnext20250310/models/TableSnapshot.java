// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TableSnapshot extends TeaModel {
    /**
     * <p>The total number of files in the snapshot.</p>
     */
    @NameInMap("fileCount")
    public Long fileCount;

    /**
     * <p>The total size of all files in the snapshot, in bytes.</p>
     */
    @NameInMap("fileSizeInBytes")
    public Long fileSizeInBytes;

    /**
     * <p>The creation time of the most recent file in the snapshot, as a Unix timestamp in milliseconds.</p>
     */
    @NameInMap("lastFileCreationTime")
    public Long lastFileCreationTime;

    /**
     * <p>The total number of partitions in the table.</p>
     */
    @NameInMap("partitionCount")
    public Long partitionCount;

    /**
     * <p>The total number of records in the snapshot.</p>
     */
    @NameInMap("recordCount")
    public Long recordCount;

    /**
     * <p>Contains detailed information about the snapshot.</p>
     */
    @NameInMap("snapshot")
    public Snapshot snapshot;

    /**
     * <p>The total number of buckets in the table.</p>
     */
    @NameInMap("totalBuckets")
    public Integer totalBuckets;

    public static TableSnapshot build(java.util.Map<String, ?> map) throws Exception {
        TableSnapshot self = new TableSnapshot();
        return TeaModel.build(map, self);
    }

    public TableSnapshot setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public TableSnapshot setFileSizeInBytes(Long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
        return this;
    }
    public Long getFileSizeInBytes() {
        return this.fileSizeInBytes;
    }

    public TableSnapshot setLastFileCreationTime(Long lastFileCreationTime) {
        this.lastFileCreationTime = lastFileCreationTime;
        return this;
    }
    public Long getLastFileCreationTime() {
        return this.lastFileCreationTime;
    }

    public TableSnapshot setPartitionCount(Long partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }
    public Long getPartitionCount() {
        return this.partitionCount;
    }

    public TableSnapshot setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public Long getRecordCount() {
        return this.recordCount;
    }

    public TableSnapshot setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public Snapshot getSnapshot() {
        return this.snapshot;
    }

    public TableSnapshot setTotalBuckets(Integer totalBuckets) {
        this.totalBuckets = totalBuckets;
        return this;
    }
    public Integer getTotalBuckets() {
        return this.totalBuckets;
    }

}
