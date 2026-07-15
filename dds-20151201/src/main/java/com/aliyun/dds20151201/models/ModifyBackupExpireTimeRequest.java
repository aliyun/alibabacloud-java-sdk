// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupExpireTimeRequest extends TeaModel {
    /**
     * <p>The time-to-live (TTL) of the backup. The time must be in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format and in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><p><em>9999-01-01</em>T<em>00:00:00</em>&#x5A;<em>&#x20;indicates that the backup is retained permanently.</em></p>
     * <p><em>- You can only extend the retention period. You cannot shorten it.- If you do not set the time to <em>9999-01-01</em>T</em>00:00:00<em>Z, the new expiration time must be within 730 days after the end time of the backup set.</em></p>
     * </li>
     * </ul>
     * <p>**</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2025-03-29T03:47:12Z</p>
     */
    @NameInMap("BackupExpireTime")
    public String backupExpireTime;

    /**
     * <p>The backup ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>260032xxxx</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp16cb162771****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyBackupExpireTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupExpireTimeRequest self = new ModifyBackupExpireTimeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupExpireTimeRequest setBackupExpireTime(String backupExpireTime) {
        this.backupExpireTime = backupExpireTime;
        return this;
    }
    public String getBackupExpireTime() {
        return this.backupExpireTime;
    }

    public ModifyBackupExpireTimeRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public ModifyBackupExpireTimeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyBackupExpireTimeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyBackupExpireTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyBackupExpireTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyBackupExpireTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
