// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DataDisk extends TeaModel {
    @NameInMap("auto_format")
    public Boolean autoFormat;

    @NameInMap("auto_snapshot_policy_id")
    public String autoSnapshotPolicyId;

    @NameInMap("bursting_enabled")
    public Boolean burstingEnabled;

    @NameInMap("category")
    public String category;

    @NameInMap("encrypted")
    public String encrypted;

    @NameInMap("file_system")
    public String fileSystem;

    @NameInMap("kms_key_id")
    public String kmsKeyId;

    @NameInMap("mount_target")
    public String mountTarget;

    @NameInMap("performance_level")
    public String performanceLevel;

    @NameInMap("provisioned_iops")
    public Long provisionedIops;

    @NameInMap("size")
    public Long size;

    public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
        DataDisk self = new DataDisk();
        return TeaModel.build(map, self);
    }

    public DataDisk setAutoFormat(Boolean autoFormat) {
        this.autoFormat = autoFormat;
        return this;
    }
    public Boolean getAutoFormat() {
        return this.autoFormat;
    }

    public DataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public DataDisk setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public DataDisk setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DataDisk setEncrypted(String encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public String getEncrypted() {
        return this.encrypted;
    }

    public DataDisk setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }
    public String getFileSystem() {
        return this.fileSystem;
    }

    public DataDisk setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public DataDisk setMountTarget(String mountTarget) {
        this.mountTarget = mountTarget;
        return this;
    }
    public String getMountTarget() {
        return this.mountTarget;
    }

    public DataDisk setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public DataDisk setProvisionedIops(Long provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    public DataDisk setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
