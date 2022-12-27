// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachInstanceRamRoleRequest extends TeaModel {
    // The IDs of instances to which you want to bind the instance RAM role. It can be a JSON array that consists of up to 100 instance IDs. Separate multiple instance IDs with commas (,).
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The permission policy. The policy must be 1 to 1,024 characters in length. When you bind a RAM role to one or more instances, you can specify an additional policy to further restrict the permissions of the RAM role. For more information, see [Policy overview](~~93732~~).
    @NameInMap("Policy")
    public String policy;

    // The name of the instance RAM role. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the RAM roles that you have created.
    @NameInMap("RamRoleName")
    public String ramRoleName;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AttachInstanceRamRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceRamRoleRequest self = new AttachInstanceRamRoleRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstanceRamRoleRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public AttachInstanceRamRoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachInstanceRamRoleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AttachInstanceRamRoleRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public AttachInstanceRamRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachInstanceRamRoleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachInstanceRamRoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
