// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachInstanceRamRoleRequest extends TeaModel {
    /**
     * <p>The IDs of the instances. The value can be a JSON array that consists of up to 100 instance IDs. Separate the IDs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The policy. The policy document must be 1 to 1,024 characters in length. When you attach an instance RAM role to one or more instances, you can specify an additional policy to further limit the permissions of the role. For more information, see [Policy overview](https://help.aliyun.com/document_detail/93732.html).</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The name of the instance RAM role. You can call the [ListRoles](https://help.aliyun.com/document_detail/28713.html) operation provided by RAM to query the instance RAM roles that you created.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
