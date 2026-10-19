// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateBackupRequest extends TeaModel {
    /**
     * <p>The backup method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Snapshot</strong>: snapshot backup</li>
     * <li><strong>Logical</strong>: logical backup</li>
     * <li><strong>Physical</strong>: physical backup (default)</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Cloud disk instances support only snapshot backup.</li>
     * <li>Only replica set and sharded cluster instances support selecting the backup method. You do not need to specify this parameter for standalone instances. The backup method is fixed to snapshot backup.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Logical</p>
     */
    @NameInMap("BackupMethod")
    public String backupMethod;

    /**
     * <p>The retention period of the backup. This parameter is applicable only to replica set and sharded cluster instances with cloud disks.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the default backup policy applies. Valid values: </p>
     * <ul>
     * <li>7 to 730: 7 to 730 days</li>
     * <li>-1: long-term retention</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
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
