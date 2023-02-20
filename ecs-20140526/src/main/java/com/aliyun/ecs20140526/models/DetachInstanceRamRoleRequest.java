// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachInstanceRamRoleRequest extends TeaModel {
    /**
     * <p>The IDs of instances from which you want to detach an instance RAM role. It can be a JSON array that consists of up to 100 instance IDs. Separate multiple instance IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the instance RAM role to be detached. You can call the [ListRoles](~~28713~~) operation provided by RAM to query the instance RAM roles that you have created.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the instances. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DetachInstanceRamRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceRamRoleRequest self = new DetachInstanceRamRoleRequest();
        return TeaModel.build(map, self);
    }

    public DetachInstanceRamRoleRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DetachInstanceRamRoleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachInstanceRamRoleRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public DetachInstanceRamRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachInstanceRamRoleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachInstanceRamRoleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
