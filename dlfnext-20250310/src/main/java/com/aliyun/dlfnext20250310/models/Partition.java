// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Partition extends TeaModel {
    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("createdBy")
    public String createdBy;

    @NameInMap("done")
    public Boolean done;

    @NameInMap("fileCount")
    public Long fileCount;

    @NameInMap("fileSizeInBytes")
    public Long fileSizeInBytes;

    @NameInMap("lastFileCreationTime")
    public Long lastFileCreationTime;

    @NameInMap("recordCount")
    public Long recordCount;

    @NameInMap("spec")
    public java.util.Map<String, ?> spec;

    @NameInMap("storageAction")
    public String storageAction;

    @NameInMap("storageActionTimestamp")
    public Long storageActionTimestamp;

    @NameInMap("storageClass")
    public String storageClass;

    @NameInMap("totalBuckets")
    public Integer totalBuckets;

    @NameInMap("updatedAt")
    public Long updatedAt;

    @NameInMap("updatedBy")
    public String updatedBy;

    public static Partition build(java.util.Map<String, ?> map) throws Exception {
        Partition self = new Partition();
        return TeaModel.build(map, self);
    }

    public Partition setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Partition setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Partition setDone(Boolean done) {
        this.done = done;
        return this;
    }
    public Boolean getDone() {
        return this.done;
    }

    public Partition setFileCount(Long fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Long getFileCount() {
        return this.fileCount;
    }

    public Partition setFileSizeInBytes(Long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
        return this;
    }
    public Long getFileSizeInBytes() {
        return this.fileSizeInBytes;
    }

    public Partition setLastFileCreationTime(Long lastFileCreationTime) {
        this.lastFileCreationTime = lastFileCreationTime;
        return this;
    }
    public Long getLastFileCreationTime() {
        return this.lastFileCreationTime;
    }

    public Partition setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public Long getRecordCount() {
        return this.recordCount;
    }

    public Partition setSpec(java.util.Map<String, ?> spec) {
        this.spec = spec;
        return this;
    }
    public java.util.Map<String, ?> getSpec() {
        return this.spec;
    }

    public Partition setStorageAction(String storageAction) {
        this.storageAction = storageAction;
        return this;
    }
    public String getStorageAction() {
        return this.storageAction;
    }

    public Partition setStorageActionTimestamp(Long storageActionTimestamp) {
        this.storageActionTimestamp = storageActionTimestamp;
        return this;
    }
    public Long getStorageActionTimestamp() {
        return this.storageActionTimestamp;
    }

    public Partition setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public Partition setTotalBuckets(Integer totalBuckets) {
        this.totalBuckets = totalBuckets;
        return this;
    }
    public Integer getTotalBuckets() {
        return this.totalBuckets;
    }

    public Partition setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public Partition setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}
