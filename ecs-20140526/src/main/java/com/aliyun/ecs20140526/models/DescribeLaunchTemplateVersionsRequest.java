// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsRequest extends TeaModel {
    // Specifies whether to query the default version.
    @NameInMap("DefaultVersion")
    public Boolean defaultVersion;

    // Specifies whether to query the configurations of the launch template. Valid values:
    // 
    // *   true: queries the basic information and other details of the launch template. The details include the image ID and system disk size.
    // *   false: queries only the basic information of the launch template. The basic information includes the template ID, template name, and default version.
    // 
    // Default value: true.
    @NameInMap("DetailFlag")
    public Boolean detailFlag;

    // The ID of the launch template.
    // 
    // You must specify LaunchTemplateId or LaunchTemplateName to determine a launch template.
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    // The name of the launch template.
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("LaunchTemplateVersion")
    public java.util.List<Long> launchTemplateVersion;

    // The maximum version number in the version range to query.
    @NameInMap("MaxVersion")
    public Long maxVersion;

    // The minimum version number in the version range to query.
    @NameInMap("MinVersion")
    public Long minVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the launch template.
    // 
    // You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeLaunchTemplateVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplateVersionsRequest self = new DescribeLaunchTemplateVersionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplateVersionsRequest setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }
    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    public DescribeLaunchTemplateVersionsRequest setDetailFlag(Boolean detailFlag) {
        this.detailFlag = detailFlag;
        return this;
    }
    public Boolean getDetailFlag() {
        return this.detailFlag;
    }

    public DescribeLaunchTemplateVersionsRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public DescribeLaunchTemplateVersionsRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public DescribeLaunchTemplateVersionsRequest setLaunchTemplateVersion(java.util.List<Long> launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public java.util.List<Long> getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public DescribeLaunchTemplateVersionsRequest setMaxVersion(Long maxVersion) {
        this.maxVersion = maxVersion;
        return this;
    }
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    public DescribeLaunchTemplateVersionsRequest setMinVersion(Long minVersion) {
        this.minVersion = minVersion;
        return this;
    }
    public Long getMinVersion() {
        return this.minVersion;
    }

    public DescribeLaunchTemplateVersionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeLaunchTemplateVersionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLaunchTemplateVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLaunchTemplateVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLaunchTemplateVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLaunchTemplateVersionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeLaunchTemplateVersionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
