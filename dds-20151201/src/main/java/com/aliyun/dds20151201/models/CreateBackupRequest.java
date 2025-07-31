// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateBackupRequest extends TeaModel {
    /**
     * <p>The backup method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Logical</strong></li>
     * <li><strong>Physical</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <p>Only replica set instances and sharded cluster instances support this parameter. You do not need to specify this parameter for standalone instances. All standalone instances use snapshot backup.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Logical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    @NameInMap("BackupRetentionPeriod")
    public Long backupRetentionPeriod;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp2235****</p>
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

    public static CreateBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupRequest self = new CreateBackupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupRequest setBackupMethod(String backupMethod) {
        this.backupMethod = backupMethod;
        return this;
    }
    public String getBackupMethod() {
        return this.backupMethod;
    }

    public CreateBackupRequest setBackupRetentionPeriod(Long backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Long getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public CreateBackupRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateBackupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateBackupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateBackupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateBackupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
