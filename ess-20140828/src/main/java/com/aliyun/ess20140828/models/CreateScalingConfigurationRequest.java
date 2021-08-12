// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateScalingConfigurationRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public CreateScalingConfigurationRequestSystemDisk systemDisk;

    @NameInMap("PrivatePoolOptions")
    public CreateScalingConfigurationRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("ScalingConfigurationName")
    public String scalingConfigurationName;

    @NameInMap("LoadBalancerWeight")
    public Integer loadBalancerWeight;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("Password")
    public String password;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    @NameInMap("ClientToken")
    public String clientToken;

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
    public java.util.Map<String, ?> schedulerOptions;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("InstanceTypeOverride")
    public java.util.List<CreateScalingConfigurationRequestInstanceTypeOverride> instanceTypeOverride;

    @NameInMap("DataDisk")
    public java.util.List<CreateScalingConfigurationRequestDataDisk> dataDisk;

    @NameInMap("SpotPriceLimit")
    public java.util.List<CreateScalingConfigurationRequestSpotPriceLimit> spotPriceLimit;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("InstancePatternInfo")
    public java.util.List<CreateScalingConfigurationRequestInstancePatternInfo> instancePatternInfo;

    @NameInMap("SystemDiskCategory")
    public java.util.List<String> systemDiskCategory;

    public static CreateScalingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingConfigurationRequest self = new CreateScalingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateScalingConfigurationRequest setSystemDisk(CreateScalingConfigurationRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateScalingConfigurationRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateScalingConfigurationRequest setPrivatePoolOptions(CreateScalingConfigurationRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public CreateScalingConfigurationRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateScalingConfigurationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateScalingConfigurationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateScalingConfigurationRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public CreateScalingConfigurationRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateScalingConfigurationRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateScalingConfigurationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateScalingConfigurationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateScalingConfigurationRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateScalingConfigurationRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateScalingConfigurationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateScalingConfigurationRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateScalingConfigurationRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateScalingConfigurationRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateScalingConfigurationRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateScalingConfigurationRequest setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
        return this;
    }
    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public CreateScalingConfigurationRequest setLoadBalancerWeight(Integer loadBalancerWeight) {
        this.loadBalancerWeight = loadBalancerWeight;
        return this;
    }
    public Integer getLoadBalancerWeight() {
        return this.loadBalancerWeight;
    }

    public CreateScalingConfigurationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateScalingConfigurationRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateScalingConfigurationRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateScalingConfigurationRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateScalingConfigurationRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateScalingConfigurationRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateScalingConfigurationRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateScalingConfigurationRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateScalingConfigurationRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateScalingConfigurationRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateScalingConfigurationRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateScalingConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateScalingConfigurationRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public CreateScalingConfigurationRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    public CreateScalingConfigurationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateScalingConfigurationRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateScalingConfigurationRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public CreateScalingConfigurationRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public CreateScalingConfigurationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateScalingConfigurationRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public CreateScalingConfigurationRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public CreateScalingConfigurationRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public CreateScalingConfigurationRequest setSchedulerOptions(java.util.Map<String, ?> schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public java.util.Map<String, ?> getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public CreateScalingConfigurationRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateScalingConfigurationRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public CreateScalingConfigurationRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public CreateScalingConfigurationRequest setInstanceTypeOverride(java.util.List<CreateScalingConfigurationRequestInstanceTypeOverride> instanceTypeOverride) {
        this.instanceTypeOverride = instanceTypeOverride;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestInstanceTypeOverride> getInstanceTypeOverride() {
        return this.instanceTypeOverride;
    }

    public CreateScalingConfigurationRequest setDataDisk(java.util.List<CreateScalingConfigurationRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateScalingConfigurationRequest setSpotPriceLimit(java.util.List<CreateScalingConfigurationRequestSpotPriceLimit> spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestSpotPriceLimit> getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateScalingConfigurationRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateScalingConfigurationRequest setInstancePatternInfo(java.util.List<CreateScalingConfigurationRequestInstancePatternInfo> instancePatternInfo) {
        this.instancePatternInfo = instancePatternInfo;
        return this;
    }
    public java.util.List<CreateScalingConfigurationRequestInstancePatternInfo> getInstancePatternInfo() {
        return this.instancePatternInfo;
    }

    public CreateScalingConfigurationRequest setSystemDiskCategory(java.util.List<String> systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public java.util.List<String> getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public static class CreateScalingConfigurationRequestSystemDisk extends TeaModel {
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

        public static CreateScalingConfigurationRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestSystemDisk self = new CreateScalingConfigurationRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateScalingConfigurationRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateScalingConfigurationRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateScalingConfigurationRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateScalingConfigurationRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateScalingConfigurationRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class CreateScalingConfigurationRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        @NameInMap("Id")
        public String id;

        public static CreateScalingConfigurationRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestPrivatePoolOptions self = new CreateScalingConfigurationRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public CreateScalingConfigurationRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateScalingConfigurationRequestInstanceTypeOverride extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("WeightedCapacity")
        public Integer weightedCapacity;

        public static CreateScalingConfigurationRequestInstanceTypeOverride build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestInstanceTypeOverride self = new CreateScalingConfigurationRequestInstanceTypeOverride();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestInstanceTypeOverride setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateScalingConfigurationRequestInstanceTypeOverride setWeightedCapacity(Integer weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class CreateScalingConfigurationRequestDataDisk extends TeaModel {
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

        public static CreateScalingConfigurationRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestDataDisk self = new CreateScalingConfigurationRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestDataDisk setCategorys(java.util.List<String> categorys) {
            this.categorys = categorys;
            return this;
        }
        public java.util.List<String> getCategorys() {
            return this.categorys;
        }

        public CreateScalingConfigurationRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateScalingConfigurationRequestDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateScalingConfigurationRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateScalingConfigurationRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateScalingConfigurationRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public CreateScalingConfigurationRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateScalingConfigurationRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateScalingConfigurationRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateScalingConfigurationRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateScalingConfigurationRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateScalingConfigurationRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

    }

    public static class CreateScalingConfigurationRequestSpotPriceLimit extends TeaModel {
        @NameInMap("PriceLimit")
        public Float priceLimit;

        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateScalingConfigurationRequestSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestSpotPriceLimit self = new CreateScalingConfigurationRequestSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestSpotPriceLimit setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

        public CreateScalingConfigurationRequestSpotPriceLimit setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateScalingConfigurationRequestInstancePatternInfo extends TeaModel {
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("InstanceFamilyLevel")
        public String instanceFamilyLevel;

        @NameInMap("MaxPrice")
        public Float maxPrice;

        @NameInMap("Memory")
        public Float memory;

        public static CreateScalingConfigurationRequestInstancePatternInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateScalingConfigurationRequestInstancePatternInfo self = new CreateScalingConfigurationRequestInstancePatternInfo();
            return TeaModel.build(map, self);
        }

        public CreateScalingConfigurationRequestInstancePatternInfo setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public CreateScalingConfigurationRequestInstancePatternInfo setInstanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }
        public String getInstanceFamilyLevel() {
            return this.instanceFamilyLevel;
        }

        public CreateScalingConfigurationRequestInstancePatternInfo setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public CreateScalingConfigurationRequestInstancePatternInfo setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

}
