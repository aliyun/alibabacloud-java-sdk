// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class CreateReadDBInstanceRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("AutoRenewPeriod")
    public String autoRenewPeriod;

    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceCategory")
    public String DBInstanceCategory;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceNetworkType")
    public String DBInstanceNetworkType;

    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    @NameInMap("DBNodeStorage")
    public String DBNodeStorage;

    @NameInMap("DBNodeStorageType")
    public String DBNodeStorageType;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OrderParam")
    public String orderParam;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    public static CreateReadDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReadDBInstanceRequest self = new CreateReadDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateReadDBInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateReadDBInstanceRequest setAutoRenewPeriod(String autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateReadDBInstanceRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateReadDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateReadDBInstanceRequest setDBInstanceCategory(String DBInstanceCategory) {
        this.DBInstanceCategory = DBInstanceCategory;
        return this;
    }
    public String getDBInstanceCategory() {
        return this.DBInstanceCategory;
    }

    public CreateReadDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateReadDBInstanceRequest setDBInstanceNetworkType(String DBInstanceNetworkType) {
        this.DBInstanceNetworkType = DBInstanceNetworkType;
        return this;
    }
    public String getDBInstanceNetworkType() {
        return this.DBInstanceNetworkType;
    }

    public CreateReadDBInstanceRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public CreateReadDBInstanceRequest setDBNodeStorage(String DBNodeStorage) {
        this.DBNodeStorage = DBNodeStorage;
        return this;
    }
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    public CreateReadDBInstanceRequest setDBNodeStorageType(String DBNodeStorageType) {
        this.DBNodeStorageType = DBNodeStorageType;
        return this;
    }
    public String getDBNodeStorageType() {
        return this.DBNodeStorageType;
    }

    public CreateReadDBInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CreateReadDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateReadDBInstanceRequest setOrderParam(String orderParam) {
        this.orderParam = orderParam;
        return this;
    }
    public String getOrderParam() {
        return this.orderParam;
    }

    public CreateReadDBInstanceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateReadDBInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateReadDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateReadDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateReadDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateReadDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateReadDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateReadDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateReadDBInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
