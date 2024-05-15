// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteLaunchTemplateVersionRequest extends TeaModel {
    /**
     * <p>The version numbers of the launch template.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteVersion")
    public java.util.List<Long> deleteVersion;

    /**
     * <p>The ID of the launch template. For more information, call the [DescribeLaunchTemplates](https://help.aliyun.com/document_detail/73759.html) operation.</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The name of the launch template.</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the launch template. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteLaunchTemplateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLaunchTemplateVersionRequest self = new DeleteLaunchTemplateVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLaunchTemplateVersionRequest setDeleteVersion(java.util.List<Long> deleteVersion) {
        this.deleteVersion = deleteVersion;
        return this;
    }
    public java.util.List<Long> getDeleteVersion() {
        return this.deleteVersion;
    }

    public DeleteLaunchTemplateVersionRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public DeleteLaunchTemplateVersionRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public DeleteLaunchTemplateVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteLaunchTemplateVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLaunchTemplateVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLaunchTemplateVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteLaunchTemplateVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
