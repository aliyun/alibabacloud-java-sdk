// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DataDisk extends TeaModel {
    /**
     * <p>Specifies whether to mount the data cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_format")
    @Deprecated
    public Boolean autoFormat;

    /**
     * <p>The ID of the automatic snapshot policy. The cloud disk is automatically backed up based on the snapshot policy.</p>
     * <p>Default value: empty, which indicates that automatic backup is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("auto_snapshot_policy_id")
    public String autoSnapshotPolicyId;

    /**
     * <p>Specifies whether to enable performance burst for the data cloud disk. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.</li>
     * </ul>
     * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("bursting_enabled")
    public Boolean burstingEnabled;

    /**
     * <p>The type of the data cloud disk. Valid values:</p>
     * <ul>
     * <li>cloud: Basic cloud disk.</li>
     * <li>cloud_efficiency: Ultra disk.</li>
     * <li>cloud_ssd: Standard SSD.</li>
     * <li>cloud_essd: ESSD.</li>
     * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
     * <li>cloud_essd_entry: ESSD Entry cloud disk.</li>
     * <li>elastic_ephemeral_disk_premium: Premium elastic ephemeral disk.</li>
     * <li>elastic_ephemeral_disk_standard: Standard elastic ephemeral disk.</li>
     * </ul>
     * <p>Default value: cloud_efficiency.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The mount point of the data cloud disk. If you do not specify this parameter, the system will allocate a mount point by default during the automatic creation of an ECS instance. The mount point starts from /dev/xvdb and ends at /dev/xvdz.</p>
     * 
     * <strong>example:</strong>
     * <p>/dev/xvdb</p>
     */
    @NameInMap("device")
    public String device;

    /**
     * <p>The name of the data cloud disk. The name must be 2 to 128 characters in length and can contain letters and Chinese characters. It must start with a letter or a Chinese character and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>DataDiskName</p>
     */
    @NameInMap("disk_name")
    public String diskName;

    /**
     * <p>Specifies whether to encrypt the data cloud disk. Valid values:</p>
     * <ul>
     * <li>true: Encrypts the data cloud disk.</li>
     * <li>false: Does not encrypt the data cloud disk.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("encrypted")
    public String encrypted;

    /**
     * <p>The type of the file system to be mounted. This parameter takes effect only when auto_format is set to true. Valid values: ext4 and xfs.</p>
     * 
     * <strong>example:</strong>
     * <p>ext4</p>
     */
    @NameInMap("file_system")
    @Deprecated
    public String fileSystem;

    /**
     * <p>The ID of the Key Management Service (KMS) key used to encrypt the data cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("kms_key_id")
    public String kmsKeyId;

    /**
     * <p>The mount path. It must be a valid file path.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/path1</p>
     */
    @NameInMap("mount_target")
    @Deprecated
    public String mountTarget;

    /**
     * <p>The performance level of the node data cloud disk. This parameter takes effect only for ESSDs, not standard SSDs. The performance level is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD cloud disks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("performance_level")
    public String performanceLevel;

    /**
     * <p>The provisioned read and write IOPS of the data cloud disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.
     * Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
     * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("provisioned_iops")
    public Long provisionedIops;

    /**
     * <p>The size of the data cloud disk. Unit: GiB.</p>
     * <p>Valid values: 40 to 32768.</p>
     * <p>Default value: 120.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The ID of the snapshot used to create the data cloud disk. If you specify this parameter, the DataDisks.Size parameter is ignored, and the actual size of the created disk is the same as the size of the specified snapshot. If the snapshot was created on or before July 15, 2013, the call is rejected and the InvalidSnapshot.TooOld error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>s-280s7****</p>
     */
    @NameInMap("snapshot_id")
    public String snapshotId;

    public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
        DataDisk self = new DataDisk();
        return TeaModel.build(map, self);
    }

    @Deprecated
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

    @Deprecated
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

    @Deprecated
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
