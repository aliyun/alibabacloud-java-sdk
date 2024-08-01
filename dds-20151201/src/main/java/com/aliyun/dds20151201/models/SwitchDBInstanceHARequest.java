// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHARequest extends TeaModel {
    /**
     * <p>The ID of the instance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the shard node in the sharded cluster instance.</p>
     * <blockquote>
     * <p>You must specify this parameter if you set the <strong>DBInstanceId</strong> parameter to the ID of a sharded cluster instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bpxxxxxxxx</p>
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
     * <p>The IDs of the roles who switch the primary and secondary nodes for the instance. You can call the <a href="https://help.aliyun.com/document_detail/123802.html">DescribeRoleZoneInfo</a> operation to view the IDs and information of roles of nodes.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Separate role IDs with commas (,). If this parameter is not specified, the primary and secondary nodes are switched.</p>
     * </li>
     * <li><p>If you set the <strong>DBInstanceId</strong> parameter to the ID of a sharded cluster instance, the roles who switch the primary and secondary nodes for the instance must belong to one shard node.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>972xxxx,972xxxx</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>The time when the primary and secondary nodes are switched. Valid values:</p>
     * <ul>
     * <li>0: The primary and secondary nodes are immediately switched.</li>
     * <li>1: The primary and secondary nodes are switched during the O\&amp;M time period.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public Integer switchMode;

    public static SwitchDBInstanceHARequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceHARequest self = new SwitchDBInstanceHARequest();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceHARequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public SwitchDBInstanceHARequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public SwitchDBInstanceHARequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SwitchDBInstanceHARequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SwitchDBInstanceHARequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SwitchDBInstanceHARequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SwitchDBInstanceHARequest setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public String getRoleIds() {
        return this.roleIds;
    }

    public SwitchDBInstanceHARequest setSwitchMode(Integer switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public Integer getSwitchMode() {
        return this.switchMode;
    }

}
