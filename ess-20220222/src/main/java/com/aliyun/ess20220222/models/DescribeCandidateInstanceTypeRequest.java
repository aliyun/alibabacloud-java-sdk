// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeCandidateInstanceTypeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowCrossAz")
    public Boolean allowCrossAz;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowDifferentGeneration")
    public Boolean allowDifferentGeneration;

    @NameInMap("DataDiskCategories")
    public java.util.List<String> dataDiskCategories;

    /**
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis_20140703.vhd</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxPrice")
    public Float maxPrice;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
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
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

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
