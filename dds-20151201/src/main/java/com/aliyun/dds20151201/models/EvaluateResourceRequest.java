// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class EvaluateResourceRequest extends TeaModel {
    /**
     * <p>The instance type.</p>
     * <blockquote>
     * <p>This parameter is required when you evaluate resources for a replica set instance. For more information about instance types, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dds.mongo.mid</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID. This parameter is required when you evaluate resources for changing instance specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp14bf67a76d****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database engine. Set the value to <strong>MongoDB</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4.2</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of read-only nodes in the instance. Valid values: <strong>1</strong> to <strong>5</strong>.</p>
     * <blockquote>
     * <p>This parameter is not required for standalone instances<ph props ="china"> or serverless instances</ph>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReadonlyReplicas")
    public String readonlyReplicas;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of nodes in the instance.</p>
     * <ul>
     * <li><p>For a standalone instance, set the value to <strong>1</strong>.</p>
     * </li>
     * <li><p>For an instance with shared storage, set the value to <strong>2</strong>.</p>
     * </li>
     * <li><p>For a replica set instance, valid values are <strong>3</strong>, <strong>5</strong>, and <strong>7</strong>.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This parameter is not required for serverless instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReplicationFactor")
    public String replicationFactor;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The shard information of the sharded cluster instance. This parameter is required when you evaluate resources for a sharded cluster instance.</p>
     * <p>When you evaluate resources for a new sharded cluster instance, you must specify the specifications of each shard in a JSON-formatted character string. Example:</p>
     * <pre><code>{
     *      &quot;ConfigSvrs&quot;:
     *          [{&quot;Storage&quot;:20,&quot;DBInstanceClass&quot;:&quot;dds.cs.mid&quot;}],
     *      &quot;Mongos&quot;:
     *          [{&quot;DBInstanceClass&quot;:&quot;dds.mongos.standard&quot;},{&quot;DBInstanceClass&quot;:&quot;dds.mongos.standard&quot;}],
     *      &quot;Shards&quot;:
     *          [{&quot;Storage&quot;:50,&quot;DBInstanceClass&quot;:&quot;dds.shard.standard&quot;},{&quot;Storage&quot;:50,&quot;DBInstanceClass&quot;:&quot;dds.shard.standard&quot;},   {&quot;Storage&quot;:50,&quot;DBInstanceClass&quot;:&quot;dds.shard.standard&quot;}]
     *  }
     * </code></pre>
     * <p>The parameter descriptions in the example are as follows:</p>
     * <ul>
     * <li>ConfigSvrs: the Configserver nodes.</li>
     * <li>Mongos: the mongos nodes.</li>
     * <li>Shards: the shard nodes.</li>
     * <li>Storage: the storage capacity of the target shard.</li>
     * <li>DBInstanceClass: the instance type of the target shard. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</li>
     * </ul>
     * <p>When you evaluate resources for upgrading or downgrading a sharded cluster instance, you only need to specify the node information in a JSON-formatted character string. Example:</p>
     * <pre><code>{
     *      &quot;NodeId&quot;: &quot;d-bp147c4d9ca7****&quot;, &quot;NodeClass&quot;: &quot;dds.shard.standard&quot;
     * } 
     * </code></pre>
     * <p>The parameter descriptions in the example are as follows:</p>
     * <ul>
     * <li>NodeId: the ID of the target node.</li>
     * <li>NodeClass: the instance type of the target node. For more information, see <a href="https://help.aliyun.com/document_detail/311414.html">Sharded cluster instance types</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NodeId&quot;: &quot;d-bp147c4d9ca7****&quot;, &quot;NodeClass&quot;: &quot;dds.shard.standard&quot;}</p>
     */
    @NameInMap("ShardsInfo")
    public String shardsInfo;

    /**
     * <p>The storage capacity of the replica set instance. Unit: GB.</p>
     * <blockquote>
     * <p>This parameter is required when the instance uses cloud disks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Storage")
    public String storage;

    /**
     * <p>The zone ID. You can call <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> to query available zones.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
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
