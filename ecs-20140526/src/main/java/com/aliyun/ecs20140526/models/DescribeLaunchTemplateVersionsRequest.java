// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the default version.</p>
     */
    @NameInMap("DefaultVersion")
    public Boolean defaultVersion;

    /**
     * <p>Specifies whether to query the configurations of the launch template. Valid values:</p>
     * <br>
     * <p>*   true: queries the basic information and other details of the launch template. The details include the image ID and system disk size.</p>
     * <p>*   false: queries only the basic information of the launch template. The basic information includes the template ID, template name, and default version.</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("DetailFlag")
    public Boolean detailFlag;

    /**
     * <p>The ID of the launch template.</p>
     * <br>
     * <p>You must set LaunchTemplateId or LaunchTemplateName to specify a launch template.</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The name of the launch template.</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    /**
     * <p>Version N of the launch template.</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public java.util.List<Long> launchTemplateVersion;

    /**
     * <p>The maximum version number in the version range to query.</p>
     */
    @NameInMap("MaxVersion")
    public Long maxVersion;

    /**
     * <p>The minimum version number in the version range to query.</p>
     */
    @NameInMap("MinVersion")
    public Long minVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the launch template.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
