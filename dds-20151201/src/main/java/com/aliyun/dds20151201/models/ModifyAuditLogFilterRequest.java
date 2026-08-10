// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAuditLogFilterRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp12c5b040dc****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The collection types of audit logs. Separate multiple collection types with commas (,).</p>
     * <ul>
     * <li><strong>admin</strong>: O&amp;M and management operations.</li>
     * <li><strong>slow</strong>: Slow queries.</li>
     * <li><strong>query</strong>: Query operations.</li>
     * <li><strong>insert</strong>: Insert operations.  </li>
     * <li><strong>update</strong>: Update operations.  </li>
     * <li><strong>delete</strong>: Delete operations. </li>
     * <li><strong>command</strong>: Protocol commands, such as the aggregate method.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>insert,query,update,delete</p>
     */
    @NameInMap("Filter")
    public String filter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The role of the node in the instance. Valid values:</p>
     * <ul>
     * <li><strong>db</strong>: shard node</li>
     * <li><strong>mongos</strong>: mongos node</li>
     * </ul>
     * <blockquote>
     * <p>Metric description</p>
     * <ul>
     * <li>This parameter applies only to sharded cluster instances. If this parameter is left empty, the default value db is used. You do not need to specify this parameter for replica set instances.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static ModifyAuditLogFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAuditLogFilterRequest self = new ModifyAuditLogFilterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAuditLogFilterRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyAuditLogFilterRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ModifyAuditLogFilterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyAuditLogFilterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAuditLogFilterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAuditLogFilterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAuditLogFilterRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
