// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateReplicationVaultRequest extends TeaModel {
    /**
     * <p>The description of the backup vault. The description must be 0 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The encryption type of the replication target vault. This parameter is valid only when VaultType is set to STANDARD. The encryption type must be the same as that of the source backup repository. Valid values:</p>
     * <ul>
     * <li><strong>HBR_PRIVATE</strong>: fully managed by Cloud Backup. The built-in secret key encryption method of the backup service is used.</li>
     * <li><strong>KMS</strong>: uses a custom key from Alibaba Cloud Key Management Service (KMS) for encryption.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HBR_PRIVATE</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <p>The custom key or alias from Alibaba Cloud KMS. This parameter is required only when EncryptType is set to KMS.</p>
     * 
     * <strong>example:</strong>
     * <p>alias/test</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The data redundancy storage method of the backup vault. Valid values:</p>
     * <ul>
     * <li>LRS: locally redundant storage (LRS). The data redundancy storage mechanism is used to store redundant copies of each object on multiple devices across multiple facilities within the same zone, ensuring data durability and availability in the event of hardware failure.</li>
     * <li>ZRS: zone-redundant storage (ZRS). The multi-zone mechanism is used to distribute user data across three zones in the same region. If one zone becomes unavailable, the data can still be accessed normally.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LRS</p>
     */
    @NameInMap("RedundancyType")
    public String redundancyType;

    /**
     * <p>The region ID of the source vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ReplicationSourceRegionId")
    public String replicationSourceRegionId;

    /**
     * <p>The ID of the source vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-*********************</p>
     */
    @NameInMap("ReplicationSourceVaultId")
    public String replicationSourceVaultId;

    /**
     * <p>The name of the backup vault. The name must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mirrorvaultname</p>
     */
    @NameInMap("VaultName")
    public String vaultName;

    /**
     * <p>The region ID of the backup vault.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("VaultRegionId")
    public String vaultRegionId;

    /**
     * <p>The storage class of the backup vault. The value can only be <strong>STANDARD</strong>, which indicates standard storage.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("VaultStorageClass")
    public String vaultStorageClass;

    public static CreateReplicationVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReplicationVaultRequest self = new CreateReplicationVaultRequest();
        return TeaModel.build(map, self);
    }

    public CreateReplicationVaultRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateReplicationVaultRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public CreateReplicationVaultRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateReplicationVaultRequest setRedundancyType(String redundancyType) {
        this.redundancyType = redundancyType;
        return this;
    }
    public String getRedundancyType() {
        return this.redundancyType;
    }

    public CreateReplicationVaultRequest setReplicationSourceRegionId(String replicationSourceRegionId) {
        this.replicationSourceRegionId = replicationSourceRegionId;
        return this;
    }
    public String getReplicationSourceRegionId() {
        return this.replicationSourceRegionId;
    }

    public CreateReplicationVaultRequest setReplicationSourceVaultId(String replicationSourceVaultId) {
        this.replicationSourceVaultId = replicationSourceVaultId;
        return this;
    }
    public String getReplicationSourceVaultId() {
        return this.replicationSourceVaultId;
    }

    public CreateReplicationVaultRequest setVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }
    public String getVaultName() {
        return this.vaultName;
    }

    public CreateReplicationVaultRequest setVaultRegionId(String vaultRegionId) {
        this.vaultRegionId = vaultRegionId;
        return this;
    }
    public String getVaultRegionId() {
        return this.vaultRegionId;
    }

    public CreateReplicationVaultRequest setVaultStorageClass(String vaultStorageClass) {
        this.vaultStorageClass = vaultStorageClass;
        return this;
    }
    public String getVaultStorageClass() {
        return this.vaultStorageClass;
    }

}
