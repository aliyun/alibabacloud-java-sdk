// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionRequest extends TeaModel {
    // The ID of the backup.
    // 
    // > * You can call the [DescribeBackups](~~62172~~) operation to query the ID of the backup.
    // > * You must specify one of the **RestoreTime** and BackupId parameters.
    // > * This parameter is not applicable to sharded cluster instances.
    @NameInMap("BackupId")
    public String backupId;

    // The name of the source database. The value is a JSON array.
    // 
    // >  If you do not specify this parameter, all databases are restored.
    @NameInMap("DatabaseNames")
    public String databaseNames;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The point in time to which the instance is restored. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // > * The value can be any time within the past seven days. The time must be earlier than the current time, but later than the time when the instance was created.
    // > * You must specify one of the RestoreTime and **BackupId** parameters.
    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The ID of the source instance.
    @NameInMap("SourceDBInstance")
    public String sourceDBInstance;

    public static CheckRecoveryConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRecoveryConditionRequest self = new CheckRecoveryConditionRequest();
        return TeaModel.build(map, self);
    }

    public CheckRecoveryConditionRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CheckRecoveryConditionRequest setDatabaseNames(String databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }
    public String getDatabaseNames() {
        return this.databaseNames;
    }

    public CheckRecoveryConditionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CheckRecoveryConditionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckRecoveryConditionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CheckRecoveryConditionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckRecoveryConditionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckRecoveryConditionRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CheckRecoveryConditionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CheckRecoveryConditionRequest setSourceDBInstance(String sourceDBInstance) {
        this.sourceDBInstance = sourceDBInstance;
        return this;
    }
    public String getSourceDBInstance() {
        return this.sourceDBInstance;
    }

}
