// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceHARequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The ID of the shard in the sharded cluster instance.</p>
     * <br>
     * <p>>  You must specify this parameter if the value of **DBInstanceId** is the ID of a sharded cluster instance.</p>
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
     * <p>The IDs of the roles that you want to switch. You can call the [DescribeRoleZoneInfo](~~123802~~) operation to query IDs of roles and roles of nodes.</p>
     * <br>
     * <p>> * Separate role IDs with commas (,). If this parameter is not specified, roles of the primary and secondary nodes are switched.</p>
     * <p>> * If the value of **DBInstanceId** is the ID of a sharded cluster instance, the roles to be switched must belong to one shard.</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The time when roles of the primary and secondary nodes are switched. Valid values:</p>
     * <br>
     * <p>*   0: The roles are switched immediately.</p>
     * <p>*   1: The roles are switched during the maintenance period.</p>
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

    public SwitchDBInstanceHARequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SwitchDBInstanceHARequest setSwitchMode(Integer switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public Integer getSwitchMode() {
        return this.switchMode;
    }

}
