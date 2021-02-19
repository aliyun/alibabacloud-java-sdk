// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigurationsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ScalingConfigurations")
    public DescribeScalingConfigurationsResponseBodyScalingConfigurations scalingConfigurations;

    public static DescribeScalingConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigurationsResponseBody self = new DescribeScalingConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigurationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeScalingConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingConfigurationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingConfigurationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingConfigurationsResponseBody setScalingConfigurations(DescribeScalingConfigurationsResponseBodyScalingConfigurations scalingConfigurations) {
        this.scalingConfigurations = scalingConfigurations;
        return this;
    }
    public DescribeScalingConfigurationsResponseBodyScalingConfigurations getScalingConfigurations() {
        return this.scalingConfigurations;
    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationPrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationPrivatePoolOptions self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTagsTag self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTagsTag> tag;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTags self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTags();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTags setTag(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Description")
        public String description;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("Device")
        public String device;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("Category")
        public String category;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Encrypted")
        public String encrypted;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk> dataDisk;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks setDataDisk(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimitSpotPriceModel extends TeaModel {
        @NameInMap("PriceLimit")
        public Float priceLimit;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimitSpotPriceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimitSpotPriceModel self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimitSpotPriceModel();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimitSpotPriceModel setPriceLimit(Float priceLimit) {
            this.priceLimit = priceLimit;
            return this;
        }
        public Float getPriceLimit() {
            return this.priceLimit;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimitSpotPriceModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimit extends TeaModel {
        @NameInMap("SpotPriceModel")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimitSpotPriceModel> spotPriceModel;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimit self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimit();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimit setSpotPriceModel(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimitSpotPriceModel> spotPriceModel) {
            this.spotPriceModel = spotPriceModel;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimitSpotPriceModel> getSpotPriceModel() {
            return this.spotPriceModel;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationWeightedCapacities extends TeaModel {
        @NameInMap("WeightedCapacity")
        public java.util.List<String> weightedCapacity;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationWeightedCapacities build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationWeightedCapacities self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationWeightedCapacities();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationWeightedCapacities setWeightedCapacity(java.util.List<String> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }
        public java.util.List<String> getWeightedCapacity() {
            return this.weightedCapacity;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        public java.util.List<String> securityGroupId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSecurityGroupIds self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSecurityGroupIds();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSecurityGroupIds setSecurityGroupId(java.util.List<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public java.util.List<String> getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSchedulerOptions extends TeaModel {
        @NameInMap("ManagedPrivateSpaceId")
        public String managedPrivateSpaceId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSchedulerOptions self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSchedulerOptions setManagedPrivateSpaceId(String managedPrivateSpaceId) {
            this.managedPrivateSpaceId = managedPrivateSpaceId;
            return this;
        }
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationInstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        public java.util.List<String> instanceType;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationInstanceTypes self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationInstanceTypes setInstanceType(java.util.List<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<String> getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration extends TeaModel {
        @NameInMap("PrivatePoolOptions")
        @Validation(required = true)
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationPrivatePoolOptions privatePoolOptions;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ScalingConfigurationName")
        public String scalingConfigurationName;

        @NameInMap("Tags")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTags tags;

        @NameInMap("DataDisks")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks dataDisks;

        @NameInMap("SystemDiskAutoSnapshotPolicyId")
        public String systemDiskAutoSnapshotPolicyId;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("Affinity")
        public String affinity;

        @NameInMap("SpotDuration")
        public Integer spotDuration;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("SpotPriceLimit")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimit spotPriceLimit;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("LoadBalancerWeight")
        public Integer loadBalancerWeight;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("SystemDiskName")
        public String systemDiskName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        @NameInMap("CreditSpecification")
        public String creditSpecification;

        @NameInMap("SpotInterruptionBehavior")
        public String spotInterruptionBehavior;

        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        @NameInMap("SystemDiskDescription")
        public String systemDiskDescription;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("Tenancy")
        public String tenancy;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("Ipv6AddressCount")
        public Integer ipv6AddressCount;

        @NameInMap("LifecycleState")
        public String lifecycleState;

        @NameInMap("SecurityEnhancementStrategy")
        public String securityEnhancementStrategy;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        @NameInMap("HpcClusterId")
        public String hpcClusterId;

        @NameInMap("PasswordInherit")
        public Boolean passwordInherit;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("ImageFamily")
        public String imageFamily;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("WeightedCapacities")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationWeightedCapacities weightedCapacities;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("SecurityGroupIds")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSecurityGroupIds securityGroupIds;

        @NameInMap("IoOptimized")
        public String ioOptimized;

        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SchedulerOptions")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSchedulerOptions schedulerOptions;

        @NameInMap("InstanceTypes")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationInstanceTypes instanceTypes;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setPrivatePoolOptions(DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationPrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationPrivatePoolOptions getPrivatePoolOptions() {
            return this.privatePoolOptions;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setScalingConfigurationName(String scalingConfigurationName) {
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }
        public String getScalingConfigurationName() {
            return this.scalingConfigurationName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setTags(DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationTags getTags() {
            return this.tags;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setDataDisks(DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks getDataDisks() {
            return this.dataDisks;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSystemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
            this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
            return this;
        }
        public String getSystemDiskAutoSnapshotPolicyId() {
            return this.systemDiskAutoSnapshotPolicyId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }
        public String getAffinity() {
            return this.affinity;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSpotDuration(Integer spotDuration) {
            this.spotDuration = spotDuration;
            return this;
        }
        public Integer getSpotDuration() {
            return this.spotDuration;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSpotPriceLimit(DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimit spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSpotPriceLimit getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setLoadBalancerWeight(Integer loadBalancerWeight) {
            this.loadBalancerWeight = loadBalancerWeight;
            return this;
        }
        public Integer getLoadBalancerWeight() {
            return this.loadBalancerWeight;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSystemDiskName(String systemDiskName) {
            this.systemDiskName = systemDiskName;
            return this;
        }
        public String getSystemDiskName() {
            return this.systemDiskName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setCreditSpecification(String creditSpecification) {
            this.creditSpecification = creditSpecification;
            return this;
        }
        public String getCreditSpecification() {
            return this.creditSpecification;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSpotInterruptionBehavior(String spotInterruptionBehavior) {
            this.spotInterruptionBehavior = spotInterruptionBehavior;
            return this;
        }
        public String getSpotInterruptionBehavior() {
            return this.spotInterruptionBehavior;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSystemDiskDescription(String systemDiskDescription) {
            this.systemDiskDescription = systemDiskDescription;
            return this;
        }
        public String getSystemDiskDescription() {
            return this.systemDiskDescription;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setTenancy(String tenancy) {
            this.tenancy = tenancy;
            return this;
        }
        public String getTenancy() {
            return this.tenancy;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setIpv6AddressCount(Integer ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Integer getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInstanceGeneration(String instanceGeneration) {
            this.instanceGeneration = instanceGeneration;
            return this;
        }
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setHpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setPasswordInherit(Boolean passwordInherit) {
            this.passwordInherit = passwordInherit;
            return this;
        }
        public Boolean getPasswordInherit() {
            return this.passwordInherit;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setImageFamily(String imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public String getImageFamily() {
            return this.imageFamily;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setWeightedCapacities(DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationWeightedCapacities weightedCapacities) {
            this.weightedCapacities = weightedCapacities;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationWeightedCapacities getWeightedCapacities() {
            return this.weightedCapacities;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSecurityGroupIds(DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSecurityGroupIds securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSecurityGroupIds getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSchedulerOptions(DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationSchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInstanceTypes(DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationInstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationInstanceTypes getInstanceTypes() {
            return this.instanceTypes;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurations extends TeaModel {
        @NameInMap("ScalingConfiguration")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration> scalingConfiguration;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurations self = new DescribeScalingConfigurationsResponseBodyScalingConfigurations();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setScalingConfiguration(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration> scalingConfiguration) {
            this.scalingConfiguration = scalingConfiguration;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration> getScalingConfiguration() {
            return this.scalingConfiguration;
        }

    }

}
