// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagesRequest extends TeaModel {
    /**
     * <p>The scenario in which the image is used. Valid values:</p>
     * <ul>
     * <li>CreateEcs (default): instance creation.</li>
     * <li>ChangeOS: replacement of the system disk or operating system.</li>
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
     * <li>i386.</li>
     * <li>x86_64.</li>
     * <li>arm64.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>i386</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Specifies whether to perform only a dry run.</p>
     * <ul>
     * <li>true: Sends a dry run request without querying resource status. The system checks whether your AccessKey pair is valid, whether Resource Access Management (RAM) user authorization is granted, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.  </li>
     * <li>false: Sends a normal request. After the check succeeds, a 2XX HTTP status code is returned and the resource status is queried.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The list of filter conditions for querying resources.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeImagesRequestFilter> filter;

    /**
     * <p>The name of the image family. You can set this parameter to filter images that belong to the specified image family.</p>
     * <p>Default value: empty.</p>
     * <blockquote>
     * <p>For information about image families associated with Alibaba Cloud official images, see <a href="https://help.aliyun.com/document_detail/108393.html">Overview of public images</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The image ID.</p>
     * <details>
     * <summary>Naming conventions for image IDs</summary>
     * 
     * <ul>
     * <li><p>Public images: Named by operating system version, architecture, language, and release date. For example, the image ID for Windows Server 2008 R2 Enterprise Edition, 64-bit English system is win2008r2_64_ent_sp1_en-us_40G_alibase_20190318.vhd.</p>
     * </li>
     * <li><p>Custom images, shared images, Alibaba Cloud Marketplace images, and community images: Start with m.</p>
     * </li>
     * </ul>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>m-bp1g7004ksh0oeuc****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image name. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>testImageName</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The source of the image. Valid values:</p>
     * <ul>
     * <li>system: Public images provided by Alibaba Cloud that are not published through Alibaba Cloud Marketplace. This is different from the concept of &quot;public images&quot; in the console.</li>
     * <li>self: Custom images that you created.</li>
     * <li>others: Includes shared images (images directly shared by other Alibaba Cloud users) and community images (custom images that are fully shared by any Alibaba Cloud user). Note the following:<ul>
     * <li>To query community images, IsPublic must be set to true.</li>
     * <li>To query shared images, IsPublic must be set to false or left empty.</li>
     * </ul>
     * </li>
     * <li>marketplace: Images published by Alibaba Cloud or third-party independent software vendors (ISVs) in Alibaba Cloud Marketplace. These images must be purchased together with ECS. Check the billing details of Alibaba Cloud Marketplace images.</li>
     * </ul>
     * <p>Default value: empty.</p>
     * <blockquote>
     * <p>An empty value indicates that images with the system, self, and others values are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The Alibaba Cloud account ID of the image owner. This parameter takes effect only when you query shared images or community images.</p>
     * 
     * <strong>example:</strong>
     * <p>20169351435666****</p>
     */
    @NameInMap("ImageOwnerId")
    public Long imageOwnerId;

    /**
     * <p>The instance type for which you want to query available images.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>Specifies whether to query published community images. Valid values:</p>
     * <ul>
     * <li>true: Queries published community images. When you set this parameter to true, ImageOwnerAlias must be set to others.</li>
     * <li>false: Queries image types other than community images. The specific types depend on the ImageOwnerAlias parameter value.</li>
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
     * <p>Specifies whether the image can run on I/O optimized instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSupportIoOptimized")
    public Boolean isSupportIoOptimized;

    /**
     * <p>The operating system type of the image. Valid values:</p>
     * <ul>
     * <li>windows.</li>
     * <li>linux.</li>
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
     * <p>The page number of the resources.</p>
     * <p>Start value: 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the image. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the custom image belongs. When you use this parameter to filter resources, the resource count cannot exceed 1,000.</p>
     * <blockquote>
     * <p>Filtering by the default resource group is not supported.</p>
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
     * <p>The status of the image. If you do not specify this parameter, only images in the Available state are returned by default. Valid values:</p>
     * <ul>
     * <li>Creating: The image is being created.</li>
     * <li>Waiting: The image is waiting in a multi-task queue.</li>
     * <li>Available (default): The image is available for use.</li>
     * <li>UnAvailable: The image is unavailable.</li>
     * <li>CreateFailed: The image failed to be created.</li>
     * <li>Deprecated: The image is deprecated.</li>
     * </ul>
     * <p>Default value: Available. This parameter supports multiple values at the same time, separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeImagesRequestTag> tag;

    /**
     * <p>Specifies whether the image is running on ECS instances. Valid values:</p>
     * <ul>
     * <li>instance: The image is in use. ECS instances are created from this image.</li>
     * <li>none: The image is idle. No ECS instances are created from this image.</li>
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
         * <p>The filter key for querying resources. Valid values:</p>
         * <ul>
         * <li>When this parameter is set to <code>CreationStartTime</code>, you can query resources created after the specified time point (<code>Filter.N.Value</code>).</li>
         * <li>When this parameter is set to <code>CreationEndTime</code>, you can query resources created before the specified time point (<code>Filter.N.Value</code>).</li>
         * <li>When this parameter is set to <code>NetworkType</code>, you can query resources of the specified network type.</li>
         * <li>When this parameter is set to any of <code>CpuOnlineUpgrade</code>, <code>CpuOnlineDowngrade</code>, <code>MemoryOnlineUpgrade</code>, or <code>MemoryOnlineDowngrade</code>, you can query the CPU or memory hot-plugging support of the specified image.</li>
         * </ul>
         * <p>Default value: null.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value for querying resources.</p>
         * <ul>
         * <li><p>When <code>Filter.N.Key</code> is set to <code>CreationStartTime</code> or <code>CreationEndTime</code>, the format is <code>yyyy-MM-ddTHH:mmZ</code>, using the UTC+0 time zone.</p>
         * </li>
         * <li><p>When <code>Filter.N.Key</code> is set to <code>NetworkType</code>, valid network type values include <code>vpc</code> and <code>classic</code>.</p>
         * </li>
         * <li><p>When <code>Filter.N.Key</code> is set to <code>CpuOnlineUpgrade</code>, <code>CpuOnlineDowngrade</code>, <code>MemoryOnlineUpgrade</code>, or <code>MemoryOnlineDowngrade</code>, the value can be <code>supported</code> or <code>unsupported</code>.</p>
         * </li>
         * </ul>
         * <p>Default value: null.</p>
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
         * <p>The tag key of the image. Valid values of N: 1 to 20.</p>
         * <p>When you use a single tag to filter resources, the resource count with this tag cannot exceed 1,000. When you use multiple tags to filter resources, the resource count of resources that are attached to all specified tags cannot exceed 1,000. If the resource count exceeds 1,000, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
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
