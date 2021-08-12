// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigurationShrinkRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public ModifyScalingConfigurationShrinkRequestSystemDisk systemDisk;

    @NameInMap("PrivatePoolOptions")
    public ModifyScalingConfigurationShrinkRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Override")
    public Boolean override;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("ImageFamily")
    public String imageFamily;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("Affinity")
    public String affinity;

    @NameInMap("Tenancy")
    public String tenancy;

    @NameInMap("SchedulerOptions")
    public String schedulerOptionsShrink;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    @NameInMap("DataDisk")
    public java.util.List<ModifyScalingConfigurationShrinkRequestDataDisk> dataDisk;

    @NameInMap("SpotPriceLimit")
    public java.util.List<ModifyScalingConfigurationShrinkRequestSpotPriceLimit> spotPriceLimit;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("InstanceTypeOverride")
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstanceTypeOverride> instanceTypeOverride;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("InstancePatternInfo")
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstancePatternInfo> instancePatternInfo;

    @NameInMap("SystemDiskCategory")
    public java.util.List<String> systemDiskCategory;

    public static ModifyScalingConfigurationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigurationShrinkRequest self = new ModifyScalingConfigurationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigurationShrinkRequest setSystemDisk(ModifyScalingConfigurationShrinkRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public ModifyScalingConfigurationShrinkRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public ModifyScalingConfigurationShrinkRequest setPrivatePoolOptions(ModifyScalingConfigurationShrinkRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyScalingConfigurationShrinkRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyScalingConfigurationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScalingConfigurationShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScalingConfigurationShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyScalingConfigurationShrinkRequest setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public ModifyScalingConfigurationShrinkRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public ModifyScalingConfigurationShrinkRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public ModifyScalingConfigurationShrinkRequest setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public ModifyScalingConfigurationShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyScalingConfigurationShrinkRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyScalingConfigurationShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyScalingConfigurationShrinkRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ModifyScalingConfigurationShrinkRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public ModifyScalingConfigurationShrinkRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ModifyScalingConfigurationShrinkRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public ModifyScalingConfigurationShrinkRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyScalingConfigurationShrinkRequest setLoadBalancerWeight(Integer loadBalancerWeight) {
        this.loadBalancerWeight = loadBalancerWeight;
        return this;
    }
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    public ModifyScalingConfigurationShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public ModifyScalingConfigurationShrinkRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ModifyScalingConfigurationShrinkRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public ModifyScalingConfigurationShrinkRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public ModifyScalingConfigurationShrinkRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ModifyScalingConfigurationShrinkRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public ModifyScalingConfigurationShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyScalingConfigurationShrinkRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public ModifyScalingConfigurationShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyScalingConfigurationShrinkRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public ModifyScalingConfigurationShrinkRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public ModifyScalingConfigurationShrinkRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public ModifyScalingConfigurationShrinkRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public ModifyScalingConfigurationShrinkRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public ModifyScalingConfigurationShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public ModifyScalingConfigurationShrinkRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ModifyScalingConfigurationShrinkRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public ModifyScalingConfigurationShrinkRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public ModifyScalingConfigurationShrinkRequest setSchedulerOptionsShrink(String schedulerOptionsShrink) {
        this.schedulerOptionsShrink = schedulerOptionsShrink;
        return this;
    }
    public String getSchedulerOptionsShrink() {
        return this.schedulerOptionsShrink;
    }

    public ModifyScalingConfigurationShrinkRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public ModifyScalingConfigurationShrinkRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public ModifyScalingConfigurationShrinkRequest setDataDisk(java.util.List<ModifyScalingConfigurationShrinkRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public ModifyScalingConfigurationShrinkRequest setSpotPriceLimit(java.util.List<ModifyScalingConfigurationShrinkRequestSpotPriceLimit> spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestSpotPriceLimit> getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public ModifyScalingConfigurationShrinkRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ModifyScalingConfigurationShrinkRequest setInstanceTypeOverride(java.util.List<ModifyScalingConfigurationShrinkRequestInstanceTypeOverride> instanceTypeOverride) {
        this.instanceTypeOverride = instanceTypeOverride;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstanceTypeOverride> getInstanceTypeOverride() {
        return this.instanceTypeOverride;
    }

    public ModifyScalingConfigurationShrinkRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public ModifyScalingConfigurationShrinkRequest setInstancePatternInfo(java.util.List<ModifyScalingConfigurationShrinkRequestInstancePatternInfo> instancePatternInfo) {
        this.instancePatternInfo = instancePatternInfo;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationShrinkRequestInstancePatternInfo> getInstancePatternInfo() {
        return this.instancePatternInfo;
    }

    public ModifyScalingConfigurationShrinkRequest setSystemDiskCategory(java.util.List<String> systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public java.util.List<String> getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public static class ModifyScalingConfigurationShrinkRequestSystemDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Description")
        public String description;

        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static ModifyScalingConfigurationShrinkRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestSystemDisk self = new ModifyScalingConfigurationShrinkRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ModifyScalingConfigurationShrinkRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        @NameInMap("Id")
        public String id;

        public static ModifyScalingConfigurationShrinkRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestPrivatePoolOptions self = new ModifyScalingConfigurationShrinkRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public ModifyScalingConfigurationShrinkRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestDataDisk extends TeaModel {
        @NameInMap("Categorys")
        public java.util.List<String> categorys;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("Description")
        public String description;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        public static ModifyScalingConfigurationShrinkRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestDataDisk self = new ModifyScalingConfigurationShrinkRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setCategorys(java.util.List<String> categorys) {
            this.categorys = categorys;
            return this;
        }
        public java.util.List<String> getCategorys() {
            return this.categorys;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public ModifyScalingConfigurationShrinkRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestSpotPriceLimit extends TeaModel {
        @NameInMap("PriceLimit")
        public Float priceLimit;

        @NameInMap("InstanceType")
        public String instanceType;

        public static ModifyScalingConfigurationShrinkRequestSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestSpotPriceLimit self = new ModifyScalingConfigurationShrinkRequestSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestSpotPriceLimit setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

        public ModifyScalingConfigurationShrinkRequestSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestInstanceTypeOverride extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static ModifyScalingConfigurationShrinkRequestInstanceTypeOverride build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestInstanceTypeOverride self = new ModifyScalingConfigurationShrinkRequestInstanceTypeOverride();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestInstanceTypeOverride setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationShrinkRequestInstanceTypeOverride setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class ModifyScalingConfigurationShrinkRequestInstancePatternInfo extends TeaModel {
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        @NameInMap("MaxPrice")
        public Float maxPrice;

        @NameInMap("Memory")
        public Float memory;

        public static ModifyScalingConfigurationShrinkRequestInstancePatternInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationShrinkRequestInstancePatternInfo self = new ModifyScalingConfigurationShrinkRequestInstancePatternInfo();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfo setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfo setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfo setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public ModifyScalingConfigurationShrinkRequestInstancePatternInfo setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

}
