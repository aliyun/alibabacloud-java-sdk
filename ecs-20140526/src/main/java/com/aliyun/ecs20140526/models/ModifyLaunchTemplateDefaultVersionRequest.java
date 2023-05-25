// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyLaunchTemplateDefaultVersionRequest extends TeaModel {
    /**
     * <p>The default version number of the launch template.</p>
     */
    @NameInMap("DefaultVersionNumber")
    public Long defaultVersionNumber;

    /**
     * <p>The ID of the launch template. You must configure LaunchTemplateId or LaunchTemplateName to specify a launch template.</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The name of the launch template. You must configure LaunchTemplateId or LaunchTemplateName to specify a launch template.</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the launch template. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyLaunchTemplateDefaultVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLaunchTemplateDefaultVersionRequest self = new ModifyLaunchTemplateDefaultVersionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLaunchTemplateDefaultVersionRequest setDefaultVersionNumber(Long defaultVersionNumber) {
        this.defaultVersionNumber = defaultVersionNumber;
        return this;
    }
    public Long getDefaultVersionNumber() {
        return this.defaultVersionNumber;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLaunchTemplateDefaultVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
