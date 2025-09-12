// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyLindormV2InstanceSecurityGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityGroups")
    public String securityGroups;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyLindormV2InstanceSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLindormV2InstanceSecurityGroupsRequest self = new ModifyLindormV2InstanceSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLindormV2InstanceSecurityGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyLindormV2InstanceSecurityGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLindormV2InstanceSecurityGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLindormV2InstanceSecurityGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLindormV2InstanceSecurityGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyLindormV2InstanceSecurityGroupsRequest setSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public String getSecurityGroups() {
        return this.securityGroups;
    }

    public ModifyLindormV2InstanceSecurityGroupsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
