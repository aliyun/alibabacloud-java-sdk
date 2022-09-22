// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeScenePurchaseRecommendRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public PrivatePoolOptions privatePoolOptions;

    @NameInMap("SchedulerOptions")
    public SchedulerOptions schedulerOptions;

    @NameInMap("Amount")
    public Integer amount;

    @NameInMap("DataDisk")
    public java.util.List<DataDisk> dataDisk;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ProductId")
    public Integer productId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SceneId")
    public Integer sceneId;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    @NameInMap("Tenancy")
    public String tenancy;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeScenePurchaseRecommendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScenePurchaseRecommendRequest self = new DescribeScenePurchaseRecommendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScenePurchaseRecommendRequest setPrivatePoolOptions(PrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public DescribeScenePurchaseRecommendRequest setSchedulerOptions(SchedulerOptions schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public SchedulerOptions getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public DescribeScenePurchaseRecommendRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public DescribeScenePurchaseRecommendRequest setDataDisk(java.util.List<DataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public DescribeScenePurchaseRecommendRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public DescribeScenePurchaseRecommendRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeScenePurchaseRecommendRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeScenePurchaseRecommendRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeScenePurchaseRecommendRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeScenePurchaseRecommendRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public DescribeScenePurchaseRecommendRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeScenePurchaseRecommendRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeScenePurchaseRecommendRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeScenePurchaseRecommendRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScenePurchaseRecommendRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeScenePurchaseRecommendRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeScenePurchaseRecommendRequest setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }
    public Integer getProductId() {
        return this.productId;
    }

    public DescribeScenePurchaseRecommendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScenePurchaseRecommendRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScenePurchaseRecommendRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScenePurchaseRecommendRequest setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Integer getSceneId() {
        return this.sceneId;
    }

    public DescribeScenePurchaseRecommendRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeScenePurchaseRecommendRequest setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public DescribeScenePurchaseRecommendRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public DescribeScenePurchaseRecommendRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeScenePurchaseRecommendRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static PrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            PrivatePoolOptions self = new PrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public PrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class SchedulerOptions extends TeaModel {
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        public static SchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            SchedulerOptions self = new SchedulerOptions();
            return TeaModel.build(map, self);
        }

        public SchedulerOptions setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

    }

    public static class DataDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Size")
        public Integer size;

        public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
            DataDisk self = new DataDisk();
            return TeaModel.build(map, self);
        }

        public DataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class SystemDisk extends TeaModel {
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static SystemDisk build(java.util.Map<String, ?> map) throws Exception {
            SystemDisk self = new SystemDisk();
            return TeaModel.build(map, self);
        }

        public SystemDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

}
