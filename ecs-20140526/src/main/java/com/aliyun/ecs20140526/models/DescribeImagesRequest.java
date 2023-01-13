// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagesRequest extends TeaModel {
    /**
     * <p>The scenario in which to use the image. Default value: CreateEcs. Valid values:</p>
     * <br>
     * <p>*   CreateEcs: instance creation</p>
     * <p>*   ChangeOS: replacement of the system disk or operating system</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The image architecture. Valid values:</p>
     * <br>
     * <p>*   i386</p>
     * <p>*   x86\_64</p>
     * <p>*   arm64</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Valid values:</p>
     * <br>
     * <p>*   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</p>
     * <p>*   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned, and the request is made.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The filters that used to query resources.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeImagesRequestFilter> filter;

    /**
     * <p>The name of the image family. You can set this parameter to query images of the specified image family.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The source of the image. Valid values:</p>
     * <br>
     * <p>*   system: public images provided by Alibaba Cloud.</p>
     * <br>
     * <p>*   self: your custom images.</p>
     * <br>
     * <p>*   others: shared images from other Alibaba Cloud accounts or community images published by other Alibaba Cloud accounts. Take note of the following items:</p>
     * <br>
     * <p>    *   To query community images, you must set IsPublic to true.</p>
     * <p>    *   To query shared images, you must set IsPublic to false or leave the IsPublic parameter empty.</p>
     * <br>
     * <p>*   marketplace: Alibaba Cloud Marketplace images. If Alibaba Cloud Marketplace images are returned in the response, you can use the images without subscription. You must pay attention to the billing details of Alibaba Cloud Marketplace images.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that your custom images, public images provided by Alibaba Cloud, shared images from other Alibaba Cloud accounts, and community images published by other Alibaba Cloud accounts are queried.</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only when you query shared images or community images.</p>
     */
    @NameInMap("ImageOwnerId")
    public Long imageOwnerId;

    /**
     * <p>The instance type for which the image can be used.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to query published community images. Valid values:</p>
     * <br>
     * <p>*   true: queries published community images. When you set this parameter to true, you must set ImageOwnerAlias to others.</p>
     * <p>*   false: queries other image types than community images. The specific image types to be queried are determined by the ImageOwnerAlias value.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("IsPublic")
    public Boolean isPublic;

    /**
     * <p>Specifies whether the image supports cloud-init.</p>
     */
    @NameInMap("IsSupportCloudinit")
    public Boolean isSupportCloudinit;

    /**
     * <p>Specifies whether the image can be used on I/O optimized instances.</p>
     */
    @NameInMap("IsSupportIoOptimized")
    public Boolean isSupportIoOptimized;

    /**
     * <p>The operating system type of the image. Valid values:</p>
     * <br>
     * <p>*   windows</p>
     * <p>*   linux</p>
     */
    @NameInMap("OSType")
    public String OSType;

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
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the image. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the custom image belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether the subscription image has expired.</p>
     * <br>
     * <p>>  This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
     */
    @NameInMap("ShowExpired")
    public Boolean showExpired;

    /**
     * <p>The ID of the snapshot used to create the custom image.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The state of the image. Default value: Available. Valid values:</p>
     * <br>
     * <p>* Creating: The image is being created.</p>
     * <p>* Waiting: The image is waiting to be processed.</p>
     * <p>* Available: The image is available.</p>
     * <p>* UnAvailable: The image is unavailable.</p>
     * <p>* CreateFailed: The image cannot be created.</p>
     * <p>* Deprecated: The image is discontinued.</p>
     * <br>
     * <p>You can specify multiple values. Separate the values with commas (,).</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags that used to query resources. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeImagesRequestTag> tag;

    /**
     * <p>Specifies whether the image is running on an Elastic Compute Service (ECS) instance. Valid values:</p>
     * <br>
     * <p>*   instance: The image is already in use and running on an ECS instance.</p>
     * <p>*   none: The image is not in use.</p>
     */
    @NameInMap("Usage")
    public String usage;

    public static DescribeImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagesRequest self = new DescribeImagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImagesRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public DescribeImagesRequest setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public DescribeImagesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeImagesRequest setFilter(java.util.List<DescribeImagesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeImagesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeImagesRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public DescribeImagesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImagesRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeImagesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public DescribeImagesRequest setImageOwnerId(Long imageOwnerId) {
        this.imageOwnerId = imageOwnerId;
        return this;
    }
    public Long getImageOwnerId() {
        return this.imageOwnerId;
    }

    public DescribeImagesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeImagesRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public DescribeImagesRequest setIsSupportCloudinit(Boolean isSupportCloudinit) {
        this.isSupportCloudinit = isSupportCloudinit;
        return this;
    }
    public Boolean getIsSupportCloudinit() {
        return this.isSupportCloudinit;
    }

    public DescribeImagesRequest setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
        this.isSupportIoOptimized = isSupportIoOptimized;
        return this;
    }
    public Boolean getIsSupportIoOptimized() {
        return this.isSupportIoOptimized;
    }

    public DescribeImagesRequest setOSType(String OSType) {
        this.OSType = OSType;
        return this;
    }
    public String getOSType() {
        return this.OSType;
    }

    public DescribeImagesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImagesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImagesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeImagesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImagesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeImagesRequest setShowExpired(Boolean showExpired) {
        this.showExpired = showExpired;
        return this;
    }
    public Boolean getShowExpired() {
        return this.showExpired;
    }

    public DescribeImagesRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DescribeImagesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeImagesRequest setTag(java.util.List<DescribeImagesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImagesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeImagesRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public static class DescribeImagesRequestFilter extends TeaModel {
        /**
         * <p>The key of filter N used to query resources. Valid values:</p>
         * <br>
         * <p>*   If you set this parameter to `CreationStartTime`, you can query the resources that were created after the point in time specified by the `Filter.N.Value` value.</p>
         * <p>*   If you set this parameter to `CreationEndTime`, you can query the resources that were created before the point in time specified by the `Filter.N.Value` value.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of filter N used to query resources. When you specify this parameter, you must also specify the `Filter.N.Key` parameter. Specify the time in the `yyyy-MM-ddTHH:mmZ` format. The time must be in UTC.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeImagesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesRequestFilter self = new DescribeImagesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeImagesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImagesRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeImagesRequestTag extends TeaModel {
        /**
         * <p>The key of tag of the image.</p>
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag of the image.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeImagesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagesRequestTag self = new DescribeImagesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImagesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
