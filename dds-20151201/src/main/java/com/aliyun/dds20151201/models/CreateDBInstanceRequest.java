// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    // The password of the root account. The password must meet the following requirements:
    // 
    // *   The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
    // *   These special characters include ! # $ % ^ & \* ( ) \_ + - =
    // *   The password must be 8 to 32 characters in length.
    @NameInMap("AccountPassword")
    public String accountPassword;

    // Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:
    // 
    // *   **true**
    // *   **false**
    // 
    // >  If you set the **ChargeType** parameter to **PrePaid**, you must configure this optional parameter.
    @NameInMap("AutoRenew")
    public String autoRenew;

    // The ID of the backup set. You can call the [DescribeBackups](~~62172~~) operation to query the backup set ID.
    // 
    // >  This parameter is required only when you call this operation to clone an instance. If you specify this parameter, you must also specify the **SrcDBInstanceId** parameter.
    @NameInMap("BackupId")
    public String backupId;

    // The business information. This is an additional parameter.
    @NameInMap("BusinessInfo")
    public String businessInfo;

    // The billing method of the instance. Valid values:
    // 
    // *   **PostPaid**: pay-as-you-go
    // *   **PrePaid**: subscription
    // 
    // >  If you specify this parameter to **PrePaid**, you must also specify the **Period** parameter.
    @NameInMap("ChargeType")
    public String chargeType;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClusterId")
    public String clusterId;

    // The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.
    @NameInMap("CouponNo")
    public String couponNo;

    // The instance type. You can also call the [DescribeAvailableResource](~~149719~~) operation to view instance types.
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    // The name of the instance. Valid values:
    // 
    // *   The name must start with a letter.
    // *   The name can contain digits, letters, underscores (\_), and hyphens (-).
    // *   The name must be 2 to 256 characters in length.
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    // The storage capacity of the instance. Unit: GB.
    // 
    // The values that can be specified for this parameter are subject to the instance types. For more information, see [Replica set instance types](~~311410~~).
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    // The name of the database.
    // 
    // >  When you call this operation to clone an instance, you can set the databases that are specified by this parameter for cloning. Otherwise, all databases of the instance are cloned.
    @NameInMap("DatabaseNames")
    public String databaseNames;

    // The engine of the instance. The value is set to **MongoDB**.
    @NameInMap("Engine")
    public String engine;

    // The engine version of the instance. Valid values:
    // 
    // * **5.0**
    // * **4.4**
    // * **4.2**
    // * **4.0**
    // * **3.4**
    // 
    // > If you call this operation to clone an instance, set the value to the engine of the source instance.
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("HiddenZoneId")
    public String hiddenZoneId;

    // The network type of the instance. Valid values:
    // 
    // **VPC**
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The subscription period of the instance. Unit: months.
    // 
    // Valid values: **1** to **9**, **12**, **24**, **36**, and **60**.
    // 
    // >  If you set the ChargeType property to PrePaid, you must configure this property.
    @NameInMap("Period")
    public Integer period;

    // The number of **read-only nodes** in the replica set instance. Default value: **0**. Valid values: **0** to **5**.
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    // The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The number of **nodes** in the replica set instance. Default value: 3. Valid values:
    // 
    // *   **3**
    // *   **5**
    // *   **7**
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    // The ID of the resource group.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The point in time to clone the instance, which must be within seven days. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    // 
    // >  This parameter is required only when you call this operation to clone an instance. If you specify this parameter, you must also specify the **SrcDBInstanceId** parameter.
    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    // The IP addresses in an IP address whitelist. Separate multiple IP addresses with commas (,). Each IP address in the IP address whitelist must be unique. The following types of IP addresses are supported:
    // 
    // * 0.0.0.0/0
    // * IP addresses, such as 10.23.12.24.
    // * Classless Inter-Domain Routing (CIDR) blocks, such as 10.23.12.0/24. In this case, /24 indicates that the prefix of each IP address is 24-bit long. You can replace 24 with a value within the range of 1 to 32.
    // 
    // > * A maximum of 1,000 IP addresses and CIDR blocks can be configured for each instance.
    // > * If you enter 0.0.0.0/0, all IP addresses can access the instance. This may introduce security risks to the instance.
    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The ID of the source instance.
    // 
    // >  This parameter can only be specified when this operation is called to clone instances. You must also specify the **BackupId** parameter or **RestoreTime** parameter.
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    // The storage engine of the instance. Default value: WiredTiger. Valid values:
    // 
    // * **WiredTiger**
    // * **RocksDB**
    // * **TerarkDB**
    // 
    // > * If you call this operation to clone an instance, set the value to the engine of the source instance.
    // > * For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).
    @NameInMap("StorageEngine")
    public String storageEngine;

    // The storage type of the instance. Valid values:
    // 
    // *   **cloud_essd**: enhanced SSD (ESSD)
    // *   **local_ssd**: local SSD
    @NameInMap("StorageType")
    public String storageType;

    // The vSwitch ID of the instance.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The VPC ID of the instance.
    @NameInMap("VpcId")
    public String vpcId;

    // The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent zone list.
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateDBInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateDBInstanceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateDBInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateDBInstanceRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateDBInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateDBInstanceRequest setDatabaseNames(String databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }
    public String getDatabaseNames() {
        return this.databaseNames;
    }

    public CreateDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceRequest setHiddenZoneId(String hiddenZoneId) {
        this.hiddenZoneId = hiddenZoneId;
        return this;
    }
    public String getHiddenZoneId() {
        return this.hiddenZoneId;
    }

    public CreateDBInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateDBInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDBInstanceRequest setReadonlyReplicas(String readonlyReplicas) {
        this.readonlyReplicas = readonlyReplicas;
        return this;
    }
    public String getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    public CreateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceRequest setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public String getReplicationFactor() {
        return this.replicationFactor;
    }

    public CreateDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateDBInstanceRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    public CreateDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateDBInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateDBInstanceRequest setSrcDBInstanceId(String srcDBInstanceId) {
        this.srcDBInstanceId = srcDBInstanceId;
        return this;
    }
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    public CreateDBInstanceRequest setStorageEngine(String storageEngine) {
        this.storageEngine = storageEngine;
        return this;
    }
    public String getStorageEngine() {
        return this.storageEngine;
    }

    public CreateDBInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
