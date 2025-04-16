// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagesRequest extends TeaModel {
    /**
     * <p>The scenario in which the image is used. Valid values:</p>
     * <ul>
     * <li>CreateEcs: instance creation</li>
     * <li>ChangeOS: replacement of the system disk or OS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateEcs</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The architecture of the image. Valid values:</p>
     * <ul>
     * <li>i386</li>
     * <li>x86_64</li>
     * <li>arm64</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i386</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Specifies whether to perform only a dry run without performing the actual request.</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
     * <li>false: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The filter conditions used to query resources.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeImagesRequestFilter> filter;

    /**
     * <p>The name of the image family. You can set this parameter to query images of the specified image family.</p>
     * <p>This parameter is empty by default.</p>
     * <blockquote>
     * <p> For information about image families that are associated with Alibaba Cloud official images, see <a href="https://help.aliyun.com/document_detail/108393.html">Overview of public images</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image.</p>
     * <p><strong>Naming rules for image IDs</strong></p>
     * <ul>
     * <li>IDs of public images are named after the operating system version numbers, architectures, languages, and release dates of the images. For example, the ID of a Windows Server 2008 R2 Enterprise 64-bit (English) public image is win2008r2_64_ent_sp1_en-us_40G_alibase_20190318.vhd.</li>
     * <li>IDs of custom images, shared images, Alibaba Cloud Marketplace images, and community images start with m.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>m-bp1g7004ksh0oeuc****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The image source. Valid values:</p>
     * <ul>
     * <li><p>system: images that are provided by Alibaba Cloud and are not released in Alibaba Cloud Marketplace, which are different from public images in the Elastic Compute Service (ECS) console.</p>
     * </li>
     * <li><p>self: your custom images</p>
     * </li>
     * <li><p>others: shared images (images shared by other Alibaba Cloud accounts) and community images (publicly available custom images that are published by other Alibaba Cloud accounts). Take note of the following items:</p>
     * <ul>
     * <li>To query community images, you must set IsPublic to true.</li>
     * <li>To query shared images, you must set IsPublic to false or leave IsPublic empty.</li>
     * </ul>
     * </li>
     * <li><p>marketplace: images released by Alibaba Cloud or independent software vendors (ISVs) in the Alibaba Cloud Marketplace, which must be purchased together with ECS instances. Take note of the billing details of the images.</p>
     * </li>
     * </ul>
     * <p>This parameter is empty by default.</p>
     * <blockquote>
     * <p>By default, this parameter is empty, which indicates that the following images are queried: public images provided by Alibaba Cloud, custom images in your repository, shared images from other Alibaba Cloud accounts, and community images that are published by other Alibaba Cloud accounts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The ID of the Alibaba Cloud account to which the image belongs. This parameter takes effect only if you query shared images or community images.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("ImageOwnerId")
    public Long imageOwnerId;

    /**
     * <p>The instance type for which the image can be used.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to query published community images. Valid values:</p>
     * <ul>
     * <li>true: queries published community images. When you set this parameter to true, you must set ImageOwnerAlias to others.</li>
     * <li>false: queries image types other than the community images type. The specific image types to be queried are determined by the ImageOwnerAlias value.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsPublic")
    public Boolean isPublic;

    /**
     * <p>Specifies whether the image supports cloud-init.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSupportCloudinit")
    public Boolean isSupportCloudinit;

    /**
     * <p>Specifies whether the image can be used on I/O optimized instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSupportIoOptimized")
    public Boolean isSupportIoOptimized;

    /**
     * <p>The operating system type of the image. Valid values:</p>
     * <ul>
     * <li>windows</li>
     * <li>linux</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("OSType")
    public String OSType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number to return.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the image. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the custom image belongs. If you specify this parameter to query resources, up to 1,000 resources that belong to the specified resource group can be returned.</p>
     * <blockquote>
     * <p>Resources in the default resource group are displayed in the response regardless of whether you specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether the subscription image has expired.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowExpired")
    public Boolean showExpired;

    /**
     * <p>The ID of the snapshot used to create the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp17ot2q7x72ggtw****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The status of the image. By default, if you do not specify this parameter, only images in the Available state are returned. Valid values:</p>
     * <ul>
     * <li>Creating: The image is being created.</li>
     * <li>Waiting: The image is waiting to be processed.</li>
     * <li>Available: The image is available.</li>
     * <li>UnAvailable: The image is unavailable.</li>
     * <li>CreateFailed: The image fails to be created.</li>
     * <li>Deprecated: The image is no longer used.</li>
     * </ul>
     * <p>Default value: Available. You can specify multiple values for this parameter. Separate the values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeImagesRequestTag> tag;

    /**
     * <p>Specifies whether the image is running on an Elastic Compute Service (ECS) instance. Valid values:</p>
     * <ul>
     * <li>instance: The image is already in use and running on an ECS instance.</li>
     * <li>none: The image is idle.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
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
         * <ul>
         * <li>If you set this parameter to <code>CreationStartTime</code>, you can query the resources that were created after the point in time specified by <code>Filter.N.Value</code>.</li>
         * <li>If you set this parameter to <code>CreationEndTime</code>, you can query the resources that were created before the point in time specified by <code>Filter.N.Value</code>.</li>
         * <li>If you set this parameter to <code>NetworkType</code>, you can query resources of the specified network type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of filter N used to query resources. Valid values:</p>
         * <ul>
         * <li>When <code>Filter.N.Key</code> is set to <code>CreationStartTime</code> or <code>CreationEndTime</code>, the format is <code>yyyy-MM-ddTHH:mmZ</code> in the UTC+0 time zone.</li>
         * <li>When <code>Filter.N.Key</code> is set to <code>NetworkType</code>, the valid values can be <code>vpc</code> or <code>classic</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2017-12-05T22:40Z</p>
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
         * <p>The tag N key of the image. Valid values of N: 1 to 20.</p>
         * <p>Up to 1,000 resources that match the specified tags can be returned in the response. To query more than 1,000 resources that match the specified tags, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the image. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
