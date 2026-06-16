// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeCandidateInstanceTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to include vSwitches from other availability zones as candidates.</p>
     * <blockquote>
     * <p>The instance types remain unchanged. Only new availability zones are added as candidates. If a scaling group fails to scale out in all selected availability zones due to issues such as insufficient inventory, Auto Scaling automatically adds a vSwitch in a new availability zone to the scaling group based on this setting.
     * For example, if a scaling group is configured for the cn-hangzhou-h and cn-hangzhou-g availability zones and a scale-out fails in both zones, Auto Scaling may create a vSwitch in the cn-hangzhou-k availability zone and add it to the scaling group based on real-time inventory.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowCrossAz")
    public Boolean allowCrossAz;

    /**
     * <p>Specifies whether to include instance types from other generations as candidates.</p>
     * <ul>
     * <li>For example, if the current instance type is ecs.c7.large, you can set this parameter to true to include instance types such as ecs.c6.large and ecs.c8.large in the list of candidates.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowDifferentGeneration")
    public Boolean allowDifferentGeneration;

    /**
     * <p>The data disk categories, ordered by priority from high to low. If Auto Scaling cannot create a data disk by using a higher-priority category, it tries the next one in the list.</p>
     */
    @NameInMap("DataDiskCategories")
    public java.util.List<String> dataDiskCategories;

    /**
     * <p>The name of the image family. When specified, the latest image in this family is used to create instances. This parameter cannot be used with ImageId.</p>
     * <blockquote>
     * <p>If you do not specify the scaling group ID, you must specify at least one of ImageId, ImageName, and ImageFamily.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image used to create instances.</p>
     * <blockquote>
     * <p>If the specified image contains both a system disk and data disks, any existing data disk information in the scaling configuration is cleared.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. The name must be unique within a region. You cannot use this parameter to specify an image from Alibaba Cloud Marketplace.</p>
     * <blockquote>
     * <p>This parameter is an alternative to the <code>ImageId</code> parameter. If you specify <code>ImageId</code>, <code>ImageName</code> is ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis_20140703.vhd</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The specified ECS instance types.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The number of IPv6 addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The maximum price for a candidate instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the scaling group is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The bidding strategy for pay-as-you-go instances. Valid values:</p>
     * <ul>
     * <li><p>NoSpot: a standard pay-as-you-go instance.</p>
     * </li>
     * <li><p>SpotWithPriceLimit: a spot instance with a user-defined maximum price.</p>
     * </li>
     * <li><p>SpotAsPriceGo: a spot instance where the system automatically bids at the market price.</p>
     * </li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The system disk categories, ordered by priority from high to low. If Auto Scaling cannot create a system disk by using a higher-priority category, it tries the next one in the list.</p>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The specified availability zones.</p>
     */
    @NameInMap("ZoneIds")
    public java.util.List<String> zoneIds;

    public static DescribeCandidateInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCandidateInstanceTypeRequest self = new DescribeCandidateInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCandidateInstanceTypeRequest setAllowCrossAz(Boolean allowCrossAz) {
        this.allowCrossAz = allowCrossAz;
        return this;
    }
    public Boolean getAllowCrossAz() {
        return this.allowCrossAz;
    }

    public DescribeCandidateInstanceTypeRequest setAllowDifferentGeneration(Boolean allowDifferentGeneration) {
        this.allowDifferentGeneration = allowDifferentGeneration;
        return this;
    }
    public Boolean getAllowDifferentGeneration() {
        return this.allowDifferentGeneration;
    }

    public DescribeCandidateInstanceTypeRequest setDataDiskCategories(java.util.List<String> dataDiskCategories) {
        this.dataDiskCategories = dataDiskCategories;
        return this;
    }
    public java.util.List<String> getDataDiskCategories() {
        return this.dataDiskCategories;
    }

    public DescribeCandidateInstanceTypeRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public DescribeCandidateInstanceTypeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeCandidateInstanceTypeRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeCandidateInstanceTypeRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeCandidateInstanceTypeRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public DescribeCandidateInstanceTypeRequest setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    public DescribeCandidateInstanceTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCandidateInstanceTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCandidateInstanceTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCandidateInstanceTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCandidateInstanceTypeRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeCandidateInstanceTypeRequest setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
        this.systemDiskCategories = systemDiskCategories;
        return this;
    }
    public java.util.List<String> getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    public DescribeCandidateInstanceTypeRequest setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

}
