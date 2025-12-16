// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateVaultRequest extends TeaModel {
    /**
     * <p>The description of the backup vault. The description must be 0 to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The method that is used to encrypt the source data. This parameter is valid only if you set the VaultType parameter to STANDARD or OTS_BACKUP. Valid values:</p>
     * <ul>
     * <li><strong>HBR_PRIVATE</strong>: The source data is encrypted by using the built-in encryption method of Hybrid Backup Recovery (HBR).</li>
     * <li><strong>KMS</strong>: The source data is encrypted by using Key Management Service (KMS).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>KMS</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <p>The customer master key (CMK) created in KMS or the alias of the key. This parameter is required only if you set the EncryptType parameter to KMS.</p>
     * 
     * <strong>example:</strong>
     * <p>alias/yzs-hhht</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    @NameInMap("Replication")
    public Boolean replication;

    /**
     * <p>The name of the backup vault. The name must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>backupvaultname</p>
     */
    @NameInMap("VaultName")
    public String vaultName;

    /**
     * <p>The ID of the region where the backup vault resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("VaultRegionId")
    public String vaultRegionId;

    /**
     * <p>The storage type of the backup vault.</p>
     * <ul>
     * <li><strong>STANDARD</strong>: standard storage.</li>
     * <li><strong>ARCHIVE</strong>: This parameter is deprecated.</li>
     * <li><strong>COLD_ARCHIVE</strong>: This parameter is deprecated.</li>
     * <li><strong>IA</strong>: This parameter is deprecated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("VaultStorageClass")
    public String vaultStorageClass;

    /**
     * <p>The type of the backup vault. Valid values:</p>
     * <ul>
     * <li><strong>STANDARD</strong>: standard backup vault</li>
     * <li><strong>OTS_BACKUP</strong>: backup vault for Tablestore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("VaultType")
    public String vaultType;

    /**
     * <p>Specifies whether to enable the immutable backup feature.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WormEnabled")
    public Boolean wormEnabled;

    public static CreateVaultRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVaultRequest self = new CreateVaultRequest();
        return TeaModel.build(map, self);
    }

    public CreateVaultRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVaultRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public CreateVaultRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public CreateVaultRequest setReplication(Boolean replication) {
        this.replication = replication;
        return this;
    }
    public Boolean getReplication() {
        return this.replication;
    }

    public CreateVaultRequest setVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }
    public String getVaultName() {
        return this.vaultName;
    }

    public CreateVaultRequest setVaultRegionId(String vaultRegionId) {
        this.vaultRegionId = vaultRegionId;
        return this;
    }
    public String getVaultRegionId() {
        return this.vaultRegionId;
    }

    public CreateVaultRequest setVaultStorageClass(String vaultStorageClass) {
        this.vaultStorageClass = vaultStorageClass;
        return this;
    }
    public String getVaultStorageClass() {
        return this.vaultStorageClass;
    }

    public CreateVaultRequest setVaultType(String vaultType) {
        this.vaultType = vaultType;
        return this;
    }
    public String getVaultType() {
        return this.vaultType;
    }

    public CreateVaultRequest setWormEnabled(Boolean wormEnabled) {
        this.wormEnabled = wormEnabled;
        return this;
    }
    public Boolean getWormEnabled() {
        return this.wormEnabled;
    }

}
