// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Partition extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1747120676378</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("done")
    public Boolean done;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("fileCount")
    public Long fileCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("fileSizeInBytes")
    public Long fileSizeInBytes;

    /**
     * <strong>example:</strong>
     * <p>1741701564261</p>
     */
    @NameInMap("lastFileCreationTime")
    public Long lastFileCreationTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("recordCount")
    public Long recordCount;

    /**
     * <strong>example:</strong>
     * <p>{&quot;year&quot;:&quot;2025&quot;}</p>
     */
    @NameInMap("spec")
    public java.util.Map<String, ?> spec;

    /**
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("storageAction")
    public String storageAction;

    /**
     * <strong>example:</strong>
     * <p>1758189669915</p>
     */
    @NameInMap("storageActionTimestamp")
    public Long storageActionTimestamp;

    /**
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("storageClass")
    public String storageClass;

    @NameInMap("totalBuckets")
    public Integer totalBuckets;

    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
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
