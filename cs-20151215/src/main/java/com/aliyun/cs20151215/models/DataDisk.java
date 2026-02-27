// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DataDisk extends TeaModel {
    /**
     * <p>Specifies whether to automatically mount the data disk.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_format")
    @Deprecated
    public Boolean autoFormat;

    /**
     * <p>The ID of the automatic snapshot policy. The system performs automatic backup for a cloud disk based on the specified automatic snapshot policy.</p>
     * <p>By default, this parameter is empty, which indicates that automatic backup is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-2zej1nogjvovnz4z****</p>
     */
    @NameInMap("auto_snapshot_policy_id")
    public String autoSnapshotPolicyId;

    /**
     * <p>Specifies whether to enable the burst feature for the data disk. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables the burst feature.</li>
     * <li><code>false</code>: disables the burst feature for the data disk.</li>
     * </ul>
     * <p>This parameter is available only if <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("bursting_enabled")
    public Boolean burstingEnabled;

    /**
     * <p>The category of data disk. Valid values:</p>
     * <ul>
     * <li><code>cloud</code>: basic disk.</li>
     * <li><code>cloud_efficiency</code>: ultra disk</li>
     * <li><code>cloud_ssd</code>: standard SSD.</li>
     * <li><code>cloud_essd</code>: Enterprise ESSD (ESSD).</li>
     * <li><code>cloud_auto</code>: ESSD AutoPL disk.</li>
     * <li><code>cloud_essd_entry</code>: ESSD Entry disk.</li>
     * <li><code>elastic_ephemeral_disk_premium</code>: premium elastic ephemeral disk.</li>
     * <li><code>elastic_ephemeral_disk_standard</code>: standard elastic ephemeral disk.</li>
     * </ul>
     * <p>Default value: <code>cloud_efficiency</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The mount target of the data disk. If you do not specify this parameter, the system automatically assigns a mount target when you create an Elastic Compute Service (ECS) instance. Valid values: /dev/xvdb to /dev/xvdz.</p>
     * 
     * <strong>example:</strong>
     * <p>/dev/xvdb</p>
     */
    @NameInMap("device")
    public String device;

    /**
     * <p>The data disk name. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>DataDiskName</p>
     */
    @NameInMap("disk_name")
    public String diskName;

    /**
     * <p>Specifies whether to encrypt the data disk. Valid values:</p>
     * <ul>
     * <li><code>true</code>: encrypts the data disk.</li>
     * <li><code>false</code>: does not encrypt the data disk.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("encrypted")
    public String encrypted;

    /**
     * <p>The file system that is mounted. This parameter takes effect only if auto_format is set to true. Valid values: ext4 and xfs.</p>
     * 
     * <strong>example:</strong>
     * <p>ext4</p>
     */
    @NameInMap("file_system")
    @Deprecated
    public String fileSystem;

    /**
     * <p>The ID of the Key Management Service (KMS) key that is used to encrypt the data disk.</p>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
     */
    @NameInMap("kms_key_id")
    public String kmsKeyId;

    /**
     * <p>The path to which the data disk is mounted. You must specify a valid path.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/path1</p>
     */
    @NameInMap("mount_target")
    @Deprecated
    public String mountTarget;

    /**
     * <p>The performance level (PL) of the data disk. This parameter takes effect only for an ESSD. This parameter is related to the disk size. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("performance_level")
    public String performanceLevel;

    /**
     * <p>The preset IOPS of the data disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
     * <p>This parameter is available only if <code>DiskCategory</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("provisioned_iops")
    public Long provisionedIops;

    /**
     * <p>The size of the data disk. Unit: GiB.</p>
     * <p>Valid values: 40 to 32768.</p>
     * <p>Default value: <code>120</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The ID of the snapshot that you want to use to create the data disk. If this parameter is specified, the specified size of the data disk is ignored. The size of the disk equals the size of the specified snapshot. If the snapshot was created on or before July 15, 2013, the API request is rejected and the InvalidSnapshot.TooOld message is returned.</p>
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
