// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDeploymentSetAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the deployment set.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The new name of the deployment set. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("DeploymentSetName")
    public String deploymentSetName;

    /**
     * <p>The new description of the deployment set. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the deployment set. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDeploymentSetAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeploymentSetAttributeRequest self = new ModifyDeploymentSetAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDeploymentSetAttributeRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public ModifyDeploymentSetAttributeRequest setDeploymentSetName(String deploymentSetName) {
        this.deploymentSetName = deploymentSetName;
        return this;
    }
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    public ModifyDeploymentSetAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDeploymentSetAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDeploymentSetAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDeploymentSetAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDeploymentSetAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDeploymentSetAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
