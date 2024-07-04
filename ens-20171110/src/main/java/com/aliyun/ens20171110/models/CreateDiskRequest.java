// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateDiskRequest extends TeaModel {
    /**
     * <p>The category of the disk. Valid values:</p>
     * <ul>
     * <li>cloud_efficiency: ultra disk.</li>
     * <li>cloud_ssd: all-flash disk.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The name of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>yourDiskName</p>
     */
    @NameInMap("DiskName")
    public String diskName;

    /**
     * <p>Specifies whether to encrypt the new system disk. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default): no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the edge node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The billing method of the instance. Set the value to <strong>PostPaid</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The ID of the Key Management Service (KMS) key that is used by the cloud disk.</p>
     * <blockquote>
     * <p> If you set the <strong>Encrypted</strong> parameter to <strong>true</strong>, the default service key is used when the <strong>KMSKeyId</strong> parameter is empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0e478b7a-4262-4802-b8cb-00d3fxxxxx</p>
     */
    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    /**
     * <p>The size of the disk. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public String size;

    /**
     * <p>The ID of the snapshot that you want to use to create the disk.</p>
     * <p>The following limits apply to the <strong>SnapshotId</strong> and <strong>Size</strong> parameters:</p>
     * <ul>
     * <li>If the size of the snapshot specified by <strong>SnapshotId</strong> is greater than the specified <strong>Size</strong> value, the size of the created disk is equal to the specified snapshot size.</li>
     * <li>If the size of the snapshot specified by <strong>SnapshotId</strong> is smaller than the specified <strong>Size</strong> value, the size of the created disk is equal to the specified <strong>Size</strong> value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>s-897654321****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static CreateDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskRequest self = new CreateDiskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiskRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDiskRequest setDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }
    public String getDiskName() {
        return this.diskName;
    }

    public CreateDiskRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CreateDiskRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateDiskRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateDiskRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public CreateDiskRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public CreateDiskRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
