// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DataDisk extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_format")
    public Boolean autoFormat;

    /**
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("auto_snapshot_policy_id")
    public String autoSnapshotPolicyId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("bursting_enabled")
    public Boolean burstingEnabled;

    /**
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>/dev/xvdb</p>
     */
    @NameInMap("device")
    public String device;

    /**
     * <strong>example:</strong>
     * <p>DataDiskName</p>
     */
    @NameInMap("disk_name")
    public String diskName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("encrypted")
    public String encrypted;

    /**
     * <strong>example:</strong>
     * <p>ext4</p>
     */
    @NameInMap("file_system")
    public String fileSystem;

    /**
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("kms_key_id")
    public String kmsKeyId;

    /**
     * <strong>example:</strong>
     * <p>/mnt/path1</p>
     */
    @NameInMap("mount_target")
    public String mountTarget;

    /**
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("performance_level")
    public String performanceLevel;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("provisioned_iops")
    public Long provisionedIops;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <strong>example:</strong>
     * <p>s-280s7****</p>
     */
    @NameInMap("snapshot_id")
    public String snapshotId;

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

    public DataDisk setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

    public DataDisk setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
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

    public DataDisk setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
