// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class EvaluateResourceRequest extends TeaModel {
    // The instance type.
    // 
    // >  This parameter is required when you check whether resources are sufficient for creating or upgrading a replica set instance. For more information about instance types, see [Instance types](~~57141~~).
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    // The ID of the instance. This parameter is required when you check whether resources are sufficient for upgrading an instance.
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    // The database engine of the instance. Set the value to **MongoDB**.
    @NameInMap("Engine")
    public String engine;

    // The database engine version of the instance. Valid values:
    // 
    // *   **5.0**
    // *   **4.4**
    // *   **4.2**
    // *   **4.0**
    // *   **3.4**
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of read-only nodes. Valid values: **1** to **5**.
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    // The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the region ID of the instance.
    @NameInMap("RegionId")
    public String regionId;

    // The number of nodes in the instance.
    // 
    // *   Valid values for standalone instances: **1**
    // *   Valid values for replica set instances: **3**, **5**, and **7**
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The node information. This parameter is required when you check whether resources are sufficient for creating or upgrading a sharded cluster instance.
    // 
    // *   To check whether resources are sufficient for creating a sharded cluster instance, specify the specifications of each node in the instance. The value must be a JSON string. Example:
    // 
    //         {
    //              "ConfigSvrs":
    //                  [{"Storage":20,"DBInstanceClass":"dds.cs.mid"}],
    //              "Mongos":
    //                  [{"DBInstanceClass":"dds.mongos.standard"},{"DBInstanceClass":"dds.mongos.standard"}],
    //              "Shards":
    //                  [{"Storage":50,"DBInstanceClass":"dds.shard.standard"},{"Storage":50,"DBInstanceClass":"dds.shard.standard"},   {"Storage":50,"DBInstanceClass":"dds.shard.standard"}]
    //          }
    // 
    //     Parameters in the example:
    // 
    //     *   ConfigSvrs: the Configserver node.
    //     *   Mongos: the mongos node.
    //     *   Shards: the shard node.
    //     *   Storage: the storage space of the node.
    //     *   DBInstanceClass: the instance type of the node. For more information, see [Instance types](~~57141~~).
    // 
    // *   To check whether resources are sufficient for upgrading a node of a sharded cluster instance, specify only the information of the node to be upgraded. The value must be a JSON string. Example:
    // 
    //         {
    //              "NodeId": "d-bp147c4d9ca7****", "NodeClass": "dds.shard.standard"
    //         } 
    // 
    //     Parameters in the example:
    // 
    //     *   NodeId: the ID of the node. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to query the node ID.
    //     *   NodeClass: the instance type of the node. For more information, see [Instance types](~~57141~~).
    @NameInMap("ShardsInfo")
    public String shardsInfo;

    // The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent zone list.
    @NameInMap("ZoneId")
    public String zoneId;

    public static EvaluateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateResourceRequest self = new EvaluateResourceRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateResourceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public EvaluateResourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public EvaluateResourceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public EvaluateResourceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public EvaluateResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EvaluateResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EvaluateResourceRequest setReadonlyReplicas(String readonlyReplicas) {
        this.readonlyReplicas = readonlyReplicas;
        return this;
    }
    public String getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    public EvaluateResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EvaluateResourceRequest setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }
    public String getReplicationFactor() {
        return this.replicationFactor;
    }

    public EvaluateResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EvaluateResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EvaluateResourceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public EvaluateResourceRequest setShardsInfo(String shardsInfo) {
        this.shardsInfo = shardsInfo;
        return this;
    }
    public String getShardsInfo() {
        return this.shardsInfo;
    }

    public EvaluateResourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
