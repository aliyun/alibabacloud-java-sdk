// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateVaultRequest extends TeaModel {
    /**
     * <p>The description of the backup vault. The description must be 0 to 255 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The method that is used to encrypt the source data. This parameter is valid only if you set the VaultType parameter to STANDARD or OTS_BACKUP. Valid values:</p>
     * <br>
     * <p>*   **HBR_PRIVATE**: The source data is encrypted by using the built-in encryption method of Hybrid Backup Recovery (HBR).</p>
     * <p>*   **KMS**: The source data is encrypted by using Key Management Service (KMS).</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <p>The customer master key (CMK) created in KMS or the alias of the key. This parameter is required only if you set the EncryptType parameter to KMS.</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The name of the backup vault. The name must be 1 to 64 characters in length.</p>
     */
    @NameInMap("VaultName")
    public String vaultName;

    /**
     * <p>The ID of the region where the backup vault resides.</p>
     */
    @NameInMap("VaultRegionId")
    public String vaultRegionId;

    /**
     * <p>The storage type of the backup vault. Valid value: **STANDARD**, which indicates standard storage.</p>
     */
    @NameInMap("VaultStorageClass")
    public String vaultStorageClass;

    /**
     * <p>The type of the backup vault. Valid value</p>
     * <br>
     * <p>*   **STANDARD**: standard backup vault</p>
     * <p>*   **OTS_BACKUP**: backup vault for Tablestore</p>
     */
    @NameInMap("VaultType")
    public String vaultType;

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

}
