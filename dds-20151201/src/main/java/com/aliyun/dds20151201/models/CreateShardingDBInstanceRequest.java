// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateShardingDBInstanceRequest extends TeaModel {
    /**
     * <p>The password of the root account. The password must meet the following requirements:</p>
     * <br>
     * <p>*   The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>*   The special characters include ! # $ % ^ & \* ( ) \_ + - =</p>
     * <p>*   The password of the account must be 8 to 32 characters in length.</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     * <br>
     * <p>> This parameter is available and optional if you set the value of **ChargeType** to **PrePaid**.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **PostPaid** (default): pay-as-you-go</p>
     * <p>*   **PrePaid**: subscription</p>
     * <br>
     * <p>> **Period** is required if you set the value of this parameter to **PrePaid**.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ConfigServer nodes of the instance.</p>
     */
    @NameInMap("ConfigServer")
    public java.util.List<CreateShardingDBInstanceRequestConfigServer> configServer;

    /**
     * <p>The name of the instance. The name of the instance must meet the following requirements:</p>
     * <br>
     * <p>*   The name must start with a letter.</p>
     * <p>*   It can contain digits, letters, underscores (\_), and hyphens (-).</p>
     * <p>*   It must be 2 to 256 characters in length.</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>Specifies whether to encrypt the disk. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The ID of the custom key.</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>The database engine of the instance. Set the value to **MongoDB**.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine. Valid values:</p>
     * <br>
     * <p>*   **6.0**</p>
     * <p>*   **5.0**</p>
     * <p>*   **4.4**</p>
     * <p>*   **4.2**</p>
     * <p>*   **4.0**</p>
     * <p>*   **3.4**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).</p>
     * <br>
     * <p>*   If you call this operation to clone an instance, set the value of this parameter to the engine version of the source instance.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>实例的全局IP白名单模板，多个IP白名单模板请用英文逗号（,）分隔，不可重复。</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The ID of secondary zone 2 for multi-zone deployment. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou-g**: Hangzhou Zone G</p>
     * <p>*   **cn-hangzhou-h**: Hangzhou Zone H</p>
     * <p>*   **cn-hangzhou-i**: Hangzhou Zone I</p>
     * <p>*   **cn-hongkong-b**: Hong Kong Zone B</p>
     * <p>*   **cn-hongkong-c**: Hong Kong Zone C</p>
     * <p>*   **cn-hongkong-d**: Hong Kong Zone D</p>
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
     * <p>*   This parameter is available and required if you set the value of **EngineVersion** to **4.4** or **5.0**.</p>
     * <br>
     * <p>*   The value of this parameter cannot be the same as the value of **ZoneId** or **SecondaryZoneId**.</p>
     * <br>
     * <p>*   For more information about the multi-zone deployment policy of a sharded cluster instance, see [Create a multi-zone sharded cluster instance](~~117865~~).</p>
     */
    @NameInMap("HiddenZoneId")
    public String hiddenZoneId;

    /**
     * <p>The mongos nodes of the instance.</p>
     */
    @NameInMap("Mongos")
    public java.util.List<CreateShardingDBInstanceRequestMongos> mongos;

    /**
     * <p>The network type of the instance. Set the value to VPC.</p>
     * <br>
     * <p>****</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription period of the instance. Unit: month.</p>
     * <br>
     * <p>Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, and 60************************</p>
     * <br>
     * <p>> This parameter is available and required if you set the value of **ChargeType** to **PrePaid**.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The access protocol type of the instance. Valid values:</p>
     * <br>
     * <p>*   **mongodb**: the MongoDB protocol</p>
     * <p>*   **dynamodb**: the DynamoDB protocol</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The shard nodes of the instance.</p>
     */
    @NameInMap("ReplicaSet")
    public java.util.List<CreateShardingDBInstanceRequestReplicaSet> replicaSet;

    /**
     * <p>The resource group ID. For more information, see [View the basic information of a resource group](~~151181~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to restore the instance, which must be within seven days. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in Coordinated Universal Time (UTC).</p>
     * <br>
     * <p>> This parameter is required only if you call this operation to clone an instance. If you specify this parameter, you must also specify **SrcDBInstanceId**.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The ID of secondary zone 1 for multi-zone deployment. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou-g**: Hangzhou Zone G</p>
     * <p>*   **cn-hangzhou-h**: Hangzhou Zone H</p>
     * <p>*   **cn-hangzhou-i**: Hangzhou Zone I</p>
     * <p>*   **cn-hongkong-b**: Hong Kong Zone B</p>
     * <p>*   **cn-hongkong-c**: Hong Kong Zone C</p>
     * <p>*   **cn-hongkong-d**: Hong Kong Zone D</p>
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
     * <p>*   This parameter is available and required if you set the value of **EngineVersion** to **4.4** or **5.0**.</p>
     * <br>
     * <p>*   The value of this parameter cannot be the same as the value of **ZoneId** or **HiddenZoneId**.</p>
     * <p>*   For more information about the multi-zone deployment policy of a sharded cluster instance, see [Create a multi-zone sharded cluster instance](~~117865~~).</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    /**
     * <p>The IP addresses in an IP address whitelist of the instance. Multiple IP addresses are separated by commas (,), and each IP address in the IP address whitelist must be unique. The following types of values are supported:</p>
     * <br>
     * <p>*   0.0.0.0/0</p>
     * <p>*   IP addresses, such as 10.23.12.24.</p>
     * <p>*   CIDR blocks, such as 10.23.12.0/24. In this case, 24 indicates that the prefix of each IP address is 24-bit long. You can replace 24 with a value within the range of 1 to 32.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   A maximum of 1,000 IP addresses and CIDR blocks can be configured for each instance.</p>
     * <br>
     * <p>*   If you enter 0.0.0.0/0, all IP addresses can access the instance. This may introduce security risks to the instance. Proceed with caution.</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The source instance ID.</p>
     * <br>
     * <p>> This parameter is required only if you call this operation to clone an instance. If you specify this parameter, you must also specify **RestoreTime**.</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The storage engine of the instance. Set the value to **WiredTiger**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you call this operation to clone an instance, set the value of this parameter to the storage engine of the source instance.</p>
     * <br>
     * <p>*   For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).</p>
     */
    @NameInMap("StorageEngine")
    public String storageEngine;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **cloud_essd1**: ESSD PL1</p>
     * <p>*   **cloud_essd2**: ESSD PL2</p>
     * <p>*   **cloud_essd3**: ESSD PL3</p>
     * <p>*   **local_ssd**: local SSD</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Instances of MongoDB 4.4 and later support only cloud disks. **cloud_essd1** is selected if you leave this parameter empty.</p>
     * <br>
     * <p>*   Instances of MongoDB 4.2 and earlier support only local disks. **local_ssd** is selected if you leave this parameter empty.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("Tag")
    public java.util.List<CreateShardingDBInstanceRequestTag> tag;

    /**
     * <p>The vSwitch ID.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateShardingDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShardingDBInstanceRequest self = new CreateShardingDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateShardingDBInstanceRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateShardingDBInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateShardingDBInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateShardingDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateShardingDBInstanceRequest setConfigServer(java.util.List<CreateShardingDBInstanceRequestConfigServer> configServer) {
        this.configServer = configServer;
        return this;
    }
    public java.util.List<CreateShardingDBInstanceRequestConfigServer> getConfigServer() {
        return this.configServer;
    }

    public CreateShardingDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateShardingDBInstanceRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public CreateShardingDBInstanceRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public CreateShardingDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateShardingDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateShardingDBInstanceRequest setGlobalSecurityGroupIds(String globalSecurityGroupIds) {
        this.globalSecurityGroupIds = globalSecurityGroupIds;
        return this;
    }
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    public CreateShardingDBInstanceRequest setHiddenZoneId(String hiddenZoneId) {
        this.hiddenZoneId = hiddenZoneId;
        return this;
    }
    public String getHiddenZoneId() {
        return this.hiddenZoneId;
    }

    public CreateShardingDBInstanceRequest setMongos(java.util.List<CreateShardingDBInstanceRequestMongos> mongos) {
        this.mongos = mongos;
        return this;
    }
    public java.util.List<CreateShardingDBInstanceRequestMongos> getMongos() {
        return this.mongos;
    }

    public CreateShardingDBInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateShardingDBInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateShardingDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateShardingDBInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateShardingDBInstanceRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateShardingDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateShardingDBInstanceRequest setReplicaSet(java.util.List<CreateShardingDBInstanceRequestReplicaSet> replicaSet) {
        this.replicaSet = replicaSet;
        return this;
    }
    public java.util.List<CreateShardingDBInstanceRequestReplicaSet> getReplicaSet() {
        return this.replicaSet;
    }

    public CreateShardingDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateShardingDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateShardingDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateShardingDBInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateShardingDBInstanceRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    public CreateShardingDBInstanceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateShardingDBInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateShardingDBInstanceRequest setSrcDBInstanceId(String srcDBInstanceId) {
        this.srcDBInstanceId = srcDBInstanceId;
        return this;
    }
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    public CreateShardingDBInstanceRequest setStorageEngine(String storageEngine) {
        this.storageEngine = storageEngine;
        return this;
    }
    public String getStorageEngine() {
        return this.storageEngine;
    }

    public CreateShardingDBInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateShardingDBInstanceRequest setTag(java.util.List<CreateShardingDBInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateShardingDBInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateShardingDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateShardingDBInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateShardingDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateShardingDBInstanceRequestConfigServer extends TeaModel {
        /**
         * <p>The instance type of the ConfigServer node. Valid values:</p>
         * <br>
         * <p>*   **mdb.shard.2x.xlarge.d**: 4 cores, 8 GB (dedicated). Only instances that run MongoDB 4.4 and later support this instance type.</p>
         * <p>*   **dds.cs.mid** :1 core, 2 GB (general-purpose). Only instances that run MongoDB 4.2 and earlier support this instance type.</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>The storage space of the ConfigServer node. Unit: GB.</p>
         * <br>
         * <p>> The values that can be specified for this parameter vary based on the instance types. For more information, see [Sharded cluster instance types](~~311414~~).</p>
         */
        @NameInMap("Storage")
        public Integer storage;

        public static CreateShardingDBInstanceRequestConfigServer build(java.util.Map<String, ?> map) throws Exception {
            CreateShardingDBInstanceRequestConfigServer self = new CreateShardingDBInstanceRequestConfigServer();
            return TeaModel.build(map, self);
        }

        public CreateShardingDBInstanceRequestConfigServer set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public CreateShardingDBInstanceRequestConfigServer setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

    }

    public static class CreateShardingDBInstanceRequestMongos extends TeaModel {
        /**
         * <p>The instance type of the mongos node. For more information, see [Sharded cluster instance types](~~311414~~).</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   **N** specifies the serial number of the mongos node for which the instance type is specified. For example, **Mongos.2.Class** specifies the instance type of the second mongos node.</p>
         * <br>
         * <p>*   Valid values for **N**: **2** to **32**.</p>
         */
        @NameInMap("Class")
        public String _class;

        public static CreateShardingDBInstanceRequestMongos build(java.util.Map<String, ?> map) throws Exception {
            CreateShardingDBInstanceRequestMongos self = new CreateShardingDBInstanceRequestMongos();
            return TeaModel.build(map, self);
        }

        public CreateShardingDBInstanceRequestMongos set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

    }

    public static class CreateShardingDBInstanceRequestReplicaSet extends TeaModel {
        /**
         * <p>The instance type of the shard node. For more information, see [Sharded cluster instance types](~~311414~~).</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   **N** specifies the serial number of the shard node for which the instance type is specified. For example, **ReplicaSet.2.Class** specifies the instance type of the second shard node.</p>
         * <br>
         * <p>*   Valid values for **N**: **2** to **32**.</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>The number of read-only nodes in shard node N.</p>
         * <br>
         * <p>Valid values: **0** to **5**. Default value: **0**.</p>
         * <br>
         * <p>> **N** specifies the serial number of the shard node for which you want to set the number of read-only nodes. For example, **ReplicaSet.2.ReadonlyReplicas** specifies the number of read-only nodes in the second shard node.</p>
         */
        @NameInMap("ReadonlyReplicas")
        public Integer readonlyReplicas;

        /**
         * <p>The storage space of the shard node. Unit: GB.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   The values that can be specified for this parameter vary based on the instance types. For more information, see [Sharded cluster instance types](~~311414~~).</p>
         * <br>
         * <p>*   **N** specifies the serial number of the shard node for which the storage space is specified. For example, **ReplicaSet.2.Storage** specifies the storage space of the second shard node.</p>
         */
        @NameInMap("Storage")
        public Integer storage;

        public static CreateShardingDBInstanceRequestReplicaSet build(java.util.Map<String, ?> map) throws Exception {
            CreateShardingDBInstanceRequestReplicaSet self = new CreateShardingDBInstanceRequestReplicaSet();
            return TeaModel.build(map, self);
        }

        public CreateShardingDBInstanceRequestReplicaSet set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public CreateShardingDBInstanceRequestReplicaSet setReadonlyReplicas(Integer readonlyReplicas) {
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }
        public Integer getReadonlyReplicas() {
            return this.readonlyReplicas;
        }

        public CreateShardingDBInstanceRequestReplicaSet setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

    }

    public static class CreateShardingDBInstanceRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateShardingDBInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateShardingDBInstanceRequestTag self = new CreateShardingDBInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateShardingDBInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateShardingDBInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
