// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateShardingDBInstanceRequest extends TeaModel {
    // The password of the root account. The password must meet the following requirements:
    // 
    // * The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
    // * These special characters include ! # $ % ^ & \* ( ) \_ + - =
    // * The password must be 8 to 32 characters in length.
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

    // The billing method of the instance. Valid values:
    // 
    // *   **PostPaid: pay-as-you-go.**
    // *   **PrePaid**: subscription
    // 
    // >  If you specify this parameter to **PrePaid**, you must also specify the **Period** parameter.
    @NameInMap("ChargeType")
    public String chargeType;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // The details of the Configserver nodes.
    @NameInMap("ConfigServer")
    public java.util.List<CreateShardingDBInstanceRequestConfigServer> configServer;

    // The name of the instance. Valid values:
    // 
    // * The name must start with a letter.
    // * The name can contain digits, letters, underscores (\_), and hyphens (-).
    // * The name must be 2 to 256 characters in length.
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    // The engine of the instance. Set the value to **MongoDB**.
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
    // > * For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).
    // > * If you call this operation to clone an instance, set the value to the engine of the source instance.
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("HiddenZoneId")
    public String hiddenZoneId;

    // The details of mongos nodes.
    @NameInMap("Mongos")
    public java.util.List<CreateShardingDBInstanceRequestMongos> mongos;

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

    // The access protocol type of the instance. Valid values:
    // 
    // *   **mongodb**: the MongoDB protocol
    // *   **dynamodb**: the DynamoDB protocol
    @NameInMap("ProtocolType")
    public String protocolType;

    // The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The details of shard nodes.
    @NameInMap("ReplicaSet")
    public java.util.List<CreateShardingDBInstanceRequestReplicaSet> replicaSet;

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

    // The IP addresses in an IP address whitelist. Separate multiple IP addresses with commas (,). Each IP address in the IP address whitelist must be unique. The following types of predicted values are supported:
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
    // >  The ID of the source instance. This parameter is required only when you call this operation to clone an instance. If you specify this parameter, you must also specify the **RestoreTime** parameter.
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

    // The type of storage. Valid values:
    // 
    // - **cloud_essd1**: ESSD PL1 cloud disk.
    // - **cloud_essd2**: ESSD PL2 cloud disk.
    // - **cloud_essd3**: ESSD PL3 cloud disk.
    // - **local_ssd**: SSD local disk.
    // 
    // > - Instances of version 4.4 and above only support cloud disk. Default type is **cloud_essd1**.
    // > - Instances of version 4.2 and below only support local disk. Default type is **local_ssd**.
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
        // The instance type of the Configserver node. Valid value:
        // 
        // *   **mdb.shard.2x.xlarge.d**: 4 cores, 8 GB (dedicated). Only instances that run MongoDB 4.4 and 5.0 support this instance type.
        // *   **dds.cs.mid** :1 core, 2 GB (general-purpose). Only instances that run MongoDB 3.4, 4.0, and 4.2 support this instance type.
        @NameInMap("Class")
        public String _class;

        // The storage capacity of the Configserver node. Unit: GB.
        // 
        // Set the value to **20**.
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
        // The instance type of the mongos node. For more information, see [Instance types](~~311414~~).
        // 
        // > * **N** specifies the serial number of the mongos node for which the instance type is specified. For example, **Mongos.2.Class** specifies the instance type of the second mongos node.
        // > * Valid values for **N**: **2** to **32**.
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
        // The instance type of the shard node. For more information, see [Instance types](~~311414~~).
        // 
        // > * **N** specifies the serial number of the shard node for which the instance type is specified. For example, **ReplicaSet.2.Class** specifies the instance type of the second shard node.
        // > * Valid values for **N**: **2** to **32**.
        @NameInMap("Class")
        public String _class;

        // The number of read-only nodes in shard node N.
        // 
        // Valid values: **0** to **5**. The value must be an integer. Default value: **0**.
        // 
        // >  **N** specifies the serial number of the shard node for which you want to set the number of read-only nodes. **ReplicaSet.2.ReadonlyReplicas** specifies the number of read-only nodes in the second shard node.
        @NameInMap("ReadonlyReplicas")
        public Integer readonlyReplicas;

        // The storage capacity of the shard node. Unit: GB.
        // 
        // Valid values: **10** to **2000**.
        // 
        // > * The value must be a multiple of 10.
        // > * The values that can be specified for this parameter are subject to the instance types. For more information, see [Instance types](~~311414~~).
        // > * **N** specifies the serial number of the shard node for which the storage capacity is specified. For example, **ReplicaSet.2.Storage** specifies the storage capacity of the second shard node.
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

}
