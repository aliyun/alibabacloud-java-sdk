// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TableSnapshot extends TeaModel {
    @NameInMap("fileCount")
    public Long fileCount;

    @NameInMap("fileSizeInBytes")
    public Long fileSizeInBytes;

    @NameInMap("lastFileCreationTime")
    public Long lastFileCreationTime;

    @NameInMap("recordCount")
    public Long recordCount;

    @NameInMap("snapshot")
    public Snapshot snapshot;

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
