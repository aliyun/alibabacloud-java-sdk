// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class RestartDBInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the shard or mongos node in the sharded cluster instance.</p>
     * <blockquote>
     * <p>If you do not specify this parameter for a sharded cluster instance, the entire sharded cluster instance is restarted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bpxxxxxxxx</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to restart mongos nodes in parallel. This parameter takes effect only when you restart multiple mongos nodes at a time.</p>
     */
    @NameInMap("ParallelRestartMongos")
    public Boolean parallelRestartMongos;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time when the instance is restarted. Valid values:</p>
     * <ul>
     * <li>0: Immediately.</li>
     * <li>1: Within the O&amp;M window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    public static RestartDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDBInstanceRequest self = new RestartDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RestartDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RestartDBInstanceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public RestartDBInstanceRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public RestartDBInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestartDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestartDBInstanceRequest setParallelRestartMongos(Boolean parallelRestartMongos) {
        this.parallelRestartMongos = parallelRestartMongos;
        return this;
    }
    public Boolean getParallelRestartMongos() {
        return this.parallelRestartMongos;
    }

    public RestartDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestartDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestartDBInstanceRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
