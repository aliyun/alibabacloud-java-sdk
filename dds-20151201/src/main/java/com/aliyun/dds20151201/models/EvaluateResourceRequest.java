// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class EvaluateResourceRequest extends TeaModel {
    /**
     * <p>The instance type.</p>
     * <br>
     * <p>>  This parameter is required when you check whether resources are sufficient for creating or upgrading a replica set instance. For more information about instance types, see [Instance types](~~57141~~).</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the instance. This parameter is required when you check whether resources are sufficient for upgrading an instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database engine of the instance. Set the value to **MongoDB**.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. Valid values:</p>
     * <br>
     * <p>*   **5.0**</p>
     * <p>*   **4.4**</p>
     * <p>*   **4.2**</p>
     * <p>*   **4.0**</p>
     * <p>*   **3.4**</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of read-only nodes. Valid values: **1** to **5**.</p>
     */
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of nodes in the instance.</p>
     * <br>
     * <p>*   Valid values for standalone instances: **1**</p>
     * <p>*   Valid values for replica set instances: **3**, **5**, and **7**</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The node information. This parameter is required when you check whether resources are sufficient for creating or upgrading a sharded cluster instance.</p>
     * <br>
     * <p>*   To check whether resources are sufficient for creating a sharded cluster instance, specify the specifications of each node in the instance. The value must be a JSON string. Example:</p>
     * <br>
     * <p>        {</p>
     * <p>             "ConfigSvrs":</p>
     * <p>                 [{"Storage":20,"DBInstanceClass":"dds.cs.mid"}],</p>
     * <p>             "Mongos":</p>
     * <p>                 [{"DBInstanceClass":"dds.mongos.standard"},{"DBInstanceClass":"dds.mongos.standard"}],</p>
     * <p>             "Shards":</p>
     * <p>                 [{"Storage":50,"DBInstanceClass":"dds.shard.standard"},{"Storage":50,"DBInstanceClass":"dds.shard.standard"},   {"Storage":50,"DBInstanceClass":"dds.shard.standard"}]</p>
     * <p>         }</p>
     * <br>
     * <p>    Parameters in the example:</p>
     * <br>
     * <p>    *   ConfigSvrs: the Configserver node.</p>
     * <p>    *   Mongos: the mongos node.</p>
     * <p>    *   Shards: the shard node.</p>
     * <p>    *   Storage: the storage space of the node.</p>
     * <p>    *   DBInstanceClass: the instance type of the node. For more information, see [Instance types](~~57141~~).</p>
     * <br>
     * <p>*   To check whether resources are sufficient for upgrading a node of a sharded cluster instance, specify only the information of the node to be upgraded. The value must be a JSON string. Example:</p>
     * <br>
     * <p>        {</p>
     * <p>             "NodeId": "d-bp147c4d9ca7****", "NodeClass": "dds.shard.standard"</p>
     * <p>        } </p>
     * <br>
     * <p>    Parameters in the example:</p>
     * <br>
     * <p>    *   NodeId: the ID of the node. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to query the node ID.</p>
     * <p>    *   NodeClass: the instance type of the node. For more information, see [Instance types](~~57141~~).</p>
     */
    @NameInMap("ShardsInfo")
    public String shardsInfo;

    @NameInMap("Storage")
    public String storage;

    /**
     * <p>The zone ID of the instance. You can call the [DescribeRegions](~~61933~~) operation to query the most recent zone list.</p>
     */
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

    public EvaluateResourceRequest setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    public String getStorage() {
        return this.storage;
    }

    public EvaluateResourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
