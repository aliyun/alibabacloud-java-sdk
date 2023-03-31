// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>The password of the root account. The password must meet the following requirements:</p>
     * <br>
     * <p>*   The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>*   These special characters include ! # $ % ^ & \* ( ) \_ + - =</p>
     * <p>*   The password is 8 to 32 characters in length.</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> If you set the **ChargeType** parameter to **PrePaid**, this parameter is valid and optional.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The ID of the backup set. You can call the [DescribeBackups](~~62172~~) operation to query the backup set ID.</p>
     * <br>
     * <p>> This parameter is required only when you call this operation to clone an instance. If you specify this parameter, you must also specify the **SrcDBInstanceId** parameter.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The business information. This is an additional parameter.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     * <p>*   **PrePaid**: subscription</p>
     * <br>
     * <p>> If you specify this parameter to **PrePaid**, you must also specify the **Period** parameter.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the dedicated cluster to which the instance belongs.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The instance type. You can also call the [DescribeAvailableResource](~~149719~~) operation to view instance types.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The name of the instance. Valid values:</p>
     * <br>
     * <p>*   The name must start with a letter.</p>
     * <p>*   The name can contain digits, letters, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must be 2 to 256 characters in length.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The storage capacity of the instance. Unit: GB.</p>
     * <br>
     * <p>The values that can be specified for this parameter are subject to the instance types. For more information, see [Replica set instance types](~~311410~~).</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The name of the database.</p>
     * <br>
     * <p>> When you call this operation to clone an instance, you can set the databases that are specified by this parameter for cloning. Otherwise, all databases of the instance are cloned.</p>
     */
    @NameInMap("DatabaseNames")
    public String databaseNames;

    /**
     * <p>The database engine of the instance. Set the value to **MongoDB**.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance.</p>
     * <br>
     * <p>*   **6.0**</p>
     * <p>*   **5.0**</p>
     * <p>*   **4.4**</p>
     * <p>*   **4.2**</p>
     * <p>*   **4.0**</p>
     * <br>
     * <p>> If you call this operation to clone an instance or restore an instance from the recycle bin, set the value to the engine of the source instance.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The zone where the hidden node is deployed for multi-zone deployment. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou-g**: Hangzhou Zone G</p>
     * <p>*   **cn-hangzhou-h**: Hangzhou Zone H</p>
     * <p>*   **cn-hangzhou-i**: Hangzhou Zone I</p>
     * <p>*   **cn-hongkong-b**: Hongkong Zone B.</p>
     * <p>*   **cn-hongkong-c**: Hongkong Zone C</p>
     * <p>*   **cn-hongkong-d**: Hongkong Zone D</p>
     * <p>*   **cn-wulanchabu-a**: Ulanqab Zone A</p>
     * <p>*   **cn-wulanchabu-b**: Ulanqab Zone B</p>
     * <p>*   **cn-wulanchabu-c**: Ulanqab Zone C</p>
     * <p>*   **ap-southeast-1a**: Singapore Zone A</p>
     * <p>*   **ap-southeast-1b**: Singapore Zone B</p>
     * <p>*   **ap-southeast-1c**: Singapore Zone C</p>
     * <p>*   **ap-southeast-5a**: Jakarta Zone A</p>
     * <p>*   **ap-southeast-5b**: Jakarta Zone B</p>
     * <p>*   **ap-southeast-5c**: Jakarta Zone C</p>
     * <p>*   **eu-central-1a**: Frankfurt Zone A</p>
     * <p>*   **eu-central-1b**: Frankfurt Zone B</p>
     * <p>*   **eu-central-1c**: Frankfurt Zone C</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is valid and required when the **EngineVersion** parameter is set to **4.4** or **5.0**.</p>
     * <br>
     * <p>*   The value of this parameter cannot be the same as the value of the **ZoneId** or **SecondaryZoneId** parameter.</p>
     */
    @NameInMap("HiddenZoneId")
    public String hiddenZoneId;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>**VPC**</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription period of the instance. Unit: months.</p>
     * <br>
     * <p>Valid values: **1** to **9**, **12**, **24**, **36**, and **60**.</p>
     * <br>
     * <p>> If you specify the **ChargeType** parameter to **PrePaid**, this parameter is valid and required.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The number of **read-only nodes** in the replica set instance. Default value: **0**. Valid values: **0** to **5**.</p>
     */
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.</p>
     * <br>
     * <p>> If you call this operation to clone an instance or restore an instance from the recycle bin, set the value to the engine of the source instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of **nodes** in the replica set instance. Default value: 3. Valid values:</p>
     * <br>
     * <p>*   **3**</p>
     * <p>*   **5**</p>
     * <p>*   **7**</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    /**
     * <p>The ID of the resource group to which the instances you want to query belong.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to clone the instance, which must be within seven days. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> This parameter is required only when you call this operation to clone an instance. If you specify this parameter, you must also specify the **SrcDBInstanceId** parameter.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The zone where the secondary node is deployed for multi-zone deployment. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou-g**: Hangzhou Zone G</p>
     * <p>*   **cn-hangzhou-h**: Hangzhou Zone H</p>
     * <p>*   **cn-hangzhou-i**: Hangzhou Zone I</p>
     * <p>*   **cn-hongkong-b**: Hongkong Zone B.</p>
     * <p>*   **cn-hongkong-c**: Hongkong Zone C</p>
     * <p>*   **cn-hongkong-d**: Hongkong Zone D</p>
     * <p>*   **cn-wulanchabu-a**: Ulanqab Zone A</p>
     * <p>*   **cn-wulanchabu-b**: Ulanqab Zone B</p>
     * <p>*   **cn-wulanchabu-c**: Ulanqab Zone C</p>
     * <p>*   **ap-southeast-1a**: Singapore Zone A</p>
     * <p>*   **ap-southeast-1b**: Singapore Zone B</p>
     * <p>*   **ap-southeast-1c**: Singapore Zone C</p>
     * <p>*   **ap-southeast-5a**: Jakarta Zone A</p>
     * <p>*   **ap-southeast-5b**: Jakarta Zone B</p>
     * <p>*   **ap-southeast-5c**: Jakarta Zone C</p>
     * <p>*   **eu-central-1a**: Frankfurt Zone A</p>
     * <p>*   **eu-central-1b**: Frankfurt Zone B</p>
     * <p>*   **eu-central-1c**: Frankfurt Zone C</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is valid and required when the **EngineVersion** parameter is set to **4.4** or **5.0**.</p>
     * <br>
     * <p>*   The value of this parameter cannot be the same as the value of the **ZoneId** or **HiddenZoneId** parameter.</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The IP addresses in an IP address whitelist. Separate multiple IP addresses with commas (,). Each IP address in the IP address whitelist must be unique. The following types of IP addresses are supported:</p>
     * <br>
     * <p>*   0.0.0.0/0</p>
     * <p>*   IP addresses, such as 10.23.12.24.</p>
     * <p>*   Classless Inter-Domain Routing (CIDR) blocks, such as 10.23.12.0/24. In this case, /24 indicates that the prefix of each IP address is 24-bit long. You can replace 24 with a value within the range of 1 to 32.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   A maximum of 1,000 IP addresses and CIDR blocks can be configured for each instance.</p>
     * <br>
     * <p>*   If you enter 0.0.0.0/0, all IP addresses can access the instance. This may introduce security risks to the instance.</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the source instance.</p>
     * <br>
     * <p>> This parameter can only be specified when this operation is called to clone instances. You must also specify the **BackupId** parameter or **RestoreTime** parameter. If you call this operation to restore an instance from the recycle bin, only this parameter is required. The **BackupId** and **RestoreTime** parameters are not required.</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The storage engine used by the instance. Set the value to **WiredTiger**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you call this operation to clone an instance or restore an instance from the recycle bin, set the value to the engine of the source instance.</p>
     * <br>
     * <p>*   For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).</p>
     */
    @NameInMap("StorageEngine")
    public String storageEngine;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **cloud_essd1** :ESSD PL1.</p>
     * <p>*   **cloud_essd2**: ESSD PL2.</p>
     * <p>*   **cloud_essd3**: ESSD PL3.</p>
     * <p>*   **local_ssd**: local SSD</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The vSwitch ID of the instance.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID of the instance.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent zone list.</p>
     */
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

    public CreateDBInstanceRequest setGlobalSecurityGroupIds(String globalSecurityGroupIds) {
        this.globalSecurityGroupIds = globalSecurityGroupIds;
        return this;
    }
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
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
