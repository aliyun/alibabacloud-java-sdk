// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionRequest extends TeaModel {
    /**
     * <p>The ID of the backup set.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/62172.html">DescribeBackups</a> operation to query the backup ID.</li>
     * <li>You must specify either this parameter or the <strong>RestoreTime</strong> parameter.</li>
     * <li>This parameter is not supported for sharded cluster instances.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5664****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The names of the databases to be restored. The value is a JSON array.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, all databases are restored by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;db1&quot;,&quot;db2&quot;]</p>
     */
    @NameInMap("DatabaseNames")
    public String databaseNames;

    /**
     * <p>The area where the backup set resides during geo-redundancy recover.</p>
     * <blockquote>
     * <p>This parameter is required when the backup recover type is geo-redundancy cloning.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DestRegion")
    public String destRegion;

    /**
     * <p>The database version. Valid values:</p>
     * <ul>
     * <li><strong>8.0</strong></li>
     * <li><strong>7.0</strong></li>
     * <li><strong>6.0</strong></li>
     * <li><strong>5.0</strong></li>
     * <li><strong>4.4</strong></li>
     * <li><strong>4.2</strong></li>
     * <li><strong>4.0</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4.2</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li>replicate </li>
     * <li>sharding</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when the backup recover type is rebuilding a deleted instance.</li>
     * <li>This parameter is required when the backup recover type is geo-redundancy cloning.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>replicate</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp179****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore the instance. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The value can be any point in time within the last seven days. The value must be earlier than the current time and later than the creation time of the instance.</li>
     * <li>You must specify either this parameter or the <strong>BackupId</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-08-22T08:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The backup recover type. Valid values:</p>
     * <blockquote>
     * <ul>
     * <li>0: local backup recover</li>
     * <li>1: local point-in-time recover</li>
     * <li>2: backup recover of a deleted instance using a backup set</li>
     * <li>3: geo-redundancy backup recover using a backup set</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The instance ID of the source instance to recover.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1378****</p>
     */
    @NameInMap("SourceDBInstance")
    public String sourceDBInstance;

    /**
     * <p>The area where the source instance resides.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is required when the backup recover type is rebuilding a deleted instance.</li>
     * <li>This parameter is required when the backup recover type is geo-redundancy cloning.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SrcRegion")
    public String srcRegion;

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

    public CheckRecoveryConditionRequest setDestRegion(String destRegion) {
        this.destRegion = destRegion;
        return this;
    }
    public String getDestRegion() {
        return this.destRegion;
    }

    public CheckRecoveryConditionRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CheckRecoveryConditionRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
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

    public CheckRecoveryConditionRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CheckRecoveryConditionRequest setSourceDBInstance(String sourceDBInstance) {
        this.sourceDBInstance = sourceDBInstance;
        return this;
    }
    public String getSourceDBInstance() {
        return this.sourceDBInstance;
    }

    public CheckRecoveryConditionRequest setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }
    public String getSrcRegion() {
        return this.srcRegion;
    }

}
