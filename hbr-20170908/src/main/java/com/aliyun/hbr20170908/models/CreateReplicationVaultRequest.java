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
     * <strong>example:</strong>
     * <p>HBR_PRIVATE</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <strong>example:</strong>
     * <p>alias/test</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The data redundancy type of the backup vault. Valid values:</p>
     * <ul>
     * <li>LRS: standard locally redundant storage (LRS). Cloud Backup stores the copies of each object on multiple devices of different facilities in the same zone. This way, Cloud Backup ensures data durability and availability even if hardware failures occur.</li>
     * <li>ZRS: standard zone-redundant storage (ZRS). Cloud Backup uses the multi-zone mechanism to distribute data across three zones within the same region. If a zone fails, the data that is stored in the other two zones is still accessible.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LRS</p>
     */
    @NameInMap("RedundancyType")
    public String redundancyType;

    /**
     * <p>The ID of the region where the source vault resides.</p>
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
     * <p>The ID of the region where the backup vault resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("VaultRegionId")
    public String vaultRegionId;

    /**
     * <p>The storage class of the backup vault. Valid value: <strong>STANDARD</strong>, which indicates standard storage.</p>
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
