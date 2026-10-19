// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class RestartNodeRequest extends TeaModel {
    /**
     * <p>The instance ID. </p>
     * <blockquote>
     * <p>If the instance is a sharded cluster instance, you must also specify <code>NodeId</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Instance ID of the Mongos node, Shard node, or ConfigServer node in the sharded cluster instance. You can call the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> operation to query instance IDs of Mongos nodes, Shard nodes, or ConfigServer nodes.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DBInstanceId</strong> is set to instance ID of a sharded cluster instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp128a003436****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The role ID of the node.</p>
     * <ol>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/468469.html">DescribeReplicaSetRole</a> operation to query the node IDs of a replica set instance.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/468472.html">DescribeRoleZoneInfo</a> operation to query the node IDs of a sharded cluster instance.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6025****</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>The execution time. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: immediately. This is the default value.</li>
     * <li><strong>1</strong>: during the maintenance window.</li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/473775.html">ModifyInstanceMaintainTime</a> operation to modify the maintenance window of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    public static RestartNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartNodeRequest self = new RestartNodeRequest();
        return TeaModel.build(map, self);
    }

    public RestartNodeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RestartNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public RestartNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestartNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestartNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestartNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RestartNodeRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public RestartNodeRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

}
