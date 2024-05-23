// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class JoinResourceGroupRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resource. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which you want to add the instance.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the resource. For example, if you set ResourceType to instance, set this parameter to the ID of the instance.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the ECS resource. Valid values:</p>
     * <br>
     * <p>*   instance: instance</p>
     * <p>*   disk: Elastic Block Storage (EBS) device</p>
     * <p>*   snapshot: snapshot</p>
     * <p>*   image: image</p>
     * <p>*   securitygroup: security group</p>
     * <p>*   ddh: dedicated host</p>
     * <p>*   ddhcluster: dedicated host cluster</p>
     * <p>*   eni: ENI</p>
     * <p>*   keypair: SSH key pair</p>
     * <p>*   launchtemplate: launch template</p>
     * <p>*   command: Cloud Assistant command</p>
     * <p>*   activation: activation code for a Cloud Assistant managed instance</p>
     * <p>*   managedinstance: Cloud Assistant managed instance</p>
     * <br>
     * <p>The values are case-sensitive.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static JoinResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupRequest self = new JoinResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public JoinResourceGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public JoinResourceGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public JoinResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public JoinResourceGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public JoinResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public JoinResourceGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public JoinResourceGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public JoinResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
