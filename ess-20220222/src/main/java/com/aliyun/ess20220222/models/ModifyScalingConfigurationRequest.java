// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigurationRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public ModifyScalingConfigurationRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("SystemDisk")
    public ModifyScalingConfigurationRequestSystemDisk systemDisk;

    @NameInMap("Affinity")
    public String affinity;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("DataDisks")
    public java.util.List<ModifyScalingConfigurationRequestDataDisks> dataDisks;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    @NameInMap("ImageFamily")
    public String imageFamily;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstancePatternInfos")
    public java.util.List<ModifyScalingConfigurationRequestInstancePatternInfos> instancePatternInfos;

    @NameInMap("InstanceTypeOverrides")
    public java.util.List<ModifyScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("Override")
    public Boolean override;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    @NameInMap("SchedulerOptions")
    public java.util.Map<String, ?> schedulerOptions;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    @NameInMap("SpotPriceLimits")
    public java.util.List<ModifyScalingConfigurationRequestSpotPriceLimits> spotPriceLimits;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Tenancy")
    public String tenancy;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("ZoneId")
    public String zoneId;

    public static ModifyScalingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigurationRequest self = new ModifyScalingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigurationRequest setPrivatePoolOptions(ModifyScalingConfigurationRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyScalingConfigurationRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyScalingConfigurationRequest setSystemDisk(ModifyScalingConfigurationRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public ModifyScalingConfigurationRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public ModifyScalingConfigurationRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public ModifyScalingConfigurationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public ModifyScalingConfigurationRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public ModifyScalingConfigurationRequest setDataDisks(java.util.List<ModifyScalingConfigurationRequestDataDisks> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestDataDisks> getDataDisks() {
        return this.dataDisks;
    }

    public ModifyScalingConfigurationRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public ModifyScalingConfigurationRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public ModifyScalingConfigurationRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyScalingConfigurationRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public ModifyScalingConfigurationRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public ModifyScalingConfigurationRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyScalingConfigurationRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ModifyScalingConfigurationRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public ModifyScalingConfigurationRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyScalingConfigurationRequest setInstancePatternInfos(java.util.List<ModifyScalingConfigurationRequestInstancePatternInfos> instancePatternInfos) {
        this.instancePatternInfos = instancePatternInfos;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestInstancePatternInfos> getInstancePatternInfos() {
        return this.instancePatternInfos;
    }

    public ModifyScalingConfigurationRequest setInstanceTypeOverrides(java.util.List<ModifyScalingConfigurationRequestInstanceTypeOverrides> instanceTypeOverrides) {
        this.instanceTypeOverrides = instanceTypeOverrides;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestInstanceTypeOverrides> getInstanceTypeOverrides() {
        return this.instanceTypeOverrides;
    }

    public ModifyScalingConfigurationRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ModifyScalingConfigurationRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public ModifyScalingConfigurationRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyScalingConfigurationRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public ModifyScalingConfigurationRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public ModifyScalingConfigurationRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ModifyScalingConfigurationRequest setLoadBalancerWeight(Integer loadBalancerWeight) {
        this.loadBalancerWeight = loadBalancerWeight;
        return this;
    }
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    public ModifyScalingConfigurationRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public ModifyScalingConfigurationRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public ModifyScalingConfigurationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyScalingConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyScalingConfigurationRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public ModifyScalingConfigurationRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public ModifyScalingConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyScalingConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyScalingConfigurationRequest setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public ModifyScalingConfigurationRequest setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public ModifyScalingConfigurationRequest setSchedulerOptions(java.util.Map<String, ?> schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public java.util.Map<String, ?> getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public ModifyScalingConfigurationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyScalingConfigurationRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public ModifyScalingConfigurationRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public ModifyScalingConfigurationRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public ModifyScalingConfigurationRequest setSpotPriceLimits(java.util.List<ModifyScalingConfigurationRequestSpotPriceLimits> spotPriceLimits) {
        this.spotPriceLimits = spotPriceLimits;
        return this;
    }
    public java.util.List<ModifyScalingConfigurationRequestSpotPriceLimits> getSpotPriceLimits() {
        return this.spotPriceLimits;
    }

    public ModifyScalingConfigurationRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public ModifyScalingConfigurationRequest setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
        this.systemDiskCategories = systemDiskCategories;
        return this;
    }
    public java.util.List<String> getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    public ModifyScalingConfigurationRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ModifyScalingConfigurationRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public ModifyScalingConfigurationRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public ModifyScalingConfigurationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ModifyScalingConfigurationRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static ModifyScalingConfigurationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestPrivatePoolOptions self = new ModifyScalingConfigurationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyScalingConfigurationRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class ModifyScalingConfigurationRequestSystemDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        @NameInMap("Category")
        public String category;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        @NameInMap("Size")
        public Integer size;

        public static ModifyScalingConfigurationRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestSystemDisk self = new ModifyScalingConfigurationRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ModifyScalingConfigurationRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public ModifyScalingConfigurationRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyScalingConfigurationRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyScalingConfigurationRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ModifyScalingConfigurationRequestSystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public ModifyScalingConfigurationRequestSystemDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public ModifyScalingConfigurationRequestSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public ModifyScalingConfigurationRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ModifyScalingConfigurationRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public ModifyScalingConfigurationRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class ModifyScalingConfigurationRequestDataDisks extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Description")
        public String description;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Encrypted")
        public String encrypted;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("SnapshotId")
        public String snapshotId;

        public static ModifyScalingConfigurationRequestDataDisks build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestDataDisks self = new ModifyScalingConfigurationRequestDataDisks();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestDataDisks setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public ModifyScalingConfigurationRequestDataDisks setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public ModifyScalingConfigurationRequestDataDisks setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ModifyScalingConfigurationRequestDataDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyScalingConfigurationRequestDataDisks setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public ModifyScalingConfigurationRequestDataDisks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyScalingConfigurationRequestDataDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ModifyScalingConfigurationRequestDataDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ModifyScalingConfigurationRequestDataDisks setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public ModifyScalingConfigurationRequestDataDisks setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public ModifyScalingConfigurationRequestDataDisks setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ModifyScalingConfigurationRequestDataDisks setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public ModifyScalingConfigurationRequestDataDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ModifyScalingConfigurationRequestDataDisks setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class ModifyScalingConfigurationRequestInstancePatternInfos extends TeaModel {
        @NameInMap("Architectures")
        public java.util.List<String> architectures;

        @NameInMap("BurstablePerformance")
        public String burstablePerformance;

        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("ExcludedInstanceTypes")
        public java.util.List<String> excludedInstanceTypes;

        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        @NameInMap("MaxPrice")
        public Float maxPrice;

        @NameInMap("Memory")
        public Float memory;

        public static ModifyScalingConfigurationRequestInstancePatternInfos build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestInstancePatternInfos self = new ModifyScalingConfigurationRequestInstancePatternInfos();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setArchitectures(java.util.List<String> architectures) {
            this.architectures = architectures;
            return this;
        }
        public java.util.List<String> getArchitectures() {
            return this.architectures;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setBurstablePerformance(String burstablePerformance) {
            this.burstablePerformance = burstablePerformance;
            return this;
        }
        public String getBurstablePerformance() {
            return this.burstablePerformance;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setExcludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }
        public java.util.List<String> getExcludedInstanceTypes() {
            return this.excludedInstanceTypes;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public ModifyScalingConfigurationRequestInstancePatternInfos setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class ModifyScalingConfigurationRequestInstanceTypeOverrides extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static ModifyScalingConfigurationRequestInstanceTypeOverrides build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestInstanceTypeOverrides self = new ModifyScalingConfigurationRequestInstanceTypeOverrides();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestInstanceTypeOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationRequestInstanceTypeOverrides setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class ModifyScalingConfigurationRequestSpotPriceLimits extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("PriceLimit")
        public Float priceLimit;

        public static ModifyScalingConfigurationRequestSpotPriceLimits build(java.util.Map<String, ?> map) throws Exception {
            ModifyScalingConfigurationRequestSpotPriceLimits self = new ModifyScalingConfigurationRequestSpotPriceLimits();
            return TeaModel.build(map, self);
        }

        public ModifyScalingConfigurationRequestSpotPriceLimits setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ModifyScalingConfigurationRequestSpotPriceLimits setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

    }

}
