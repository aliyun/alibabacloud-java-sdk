// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class RunInstancesRequest extends TeaModel {
    @NameInMap("HibernationOptions")
    public HibernationOptions hibernationOptions;

    @NameInMap("PrivatePoolOptions")
    public PrivatePoolOptions privatePoolOptions;

    @NameInMap("SchedulerOptions")
    public SchedulerOptions schedulerOptions;

    @NameInMap("SecurityOptions")
    public SecurityOptions securityOptions;

    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    @NameInMap("Affinity")
    public String affinity;

    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    @NameInMap("BusinessInfo")
    public String businessInfo;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("DataDisk")
    public java.util.List<DataDisk> dataDisk;

    @NameInMap("DedicatedHostClusterId")
    public String dedicatedHostClusterId;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("DefaultVpc")
    public String defaultVpc;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("DeploymentSetGroupNo")
    public String deploymentSetGroupNo;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("HostNames")
    public java.util.List<String> hostNames;

    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    @NameInMap("HttpTokens")
    public String httpTokens;

    @NameInMap("ImageFamily")
    public String imageFamily;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOptions")
    public ImageOptions imageOptions;

    @NameInMap("Instance")
    public java.util.List<Instance> instance;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    @NameInMap("Isp")
    public String isp;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("MaxAmount")
    public Integer maxAmount;

    @NameInMap("MinAmount")
    public Integer minAmount;

    @NameInMap("NetworkInterface")
    public java.util.List<NetworkInterface> networkInterface;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("NodeControllerId")
    public String nodeControllerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RecycleBinResourceId")
    public String recycleBinResourceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RelationOrderId")
    public String relationOrderId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("SecurityGroupRule")
    public java.util.List<SecurityGroupRule> securityGroupRule;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("StorageSetId")
    public String storageSetId;

    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    @NameInMap("Tenancy")
    public String tenancy;

    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static RunInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesRequest self = new RunInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RunInstancesRequest setHibernationOptions(HibernationOptions hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }
    public HibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    public RunInstancesRequest setPrivatePoolOptions(PrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public RunInstancesRequest setSchedulerOptions(SchedulerOptions schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public SchedulerOptions getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public RunInstancesRequest setSecurityOptions(SecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }
    public SecurityOptions getSecurityOptions() {
        return this.securityOptions;
    }

    public RunInstancesRequest setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public RunInstancesRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public RunInstancesRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public RunInstancesRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public RunInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RunInstancesRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public RunInstancesRequest setDataDisk(java.util.List<DataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public RunInstancesRequest setDedicatedHostClusterId(String dedicatedHostClusterId) {
        this.dedicatedHostClusterId = dedicatedHostClusterId;
        return this;
    }
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    public RunInstancesRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public RunInstancesRequest setDefaultVpc(String defaultVpc) {
        this.defaultVpc = defaultVpc;
        return this;
    }
    public String getDefaultVpc() {
        return this.defaultVpc;
    }

    public RunInstancesRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public RunInstancesRequest setDeploymentSetGroupNo(String deploymentSetGroupNo) {
        this.deploymentSetGroupNo = deploymentSetGroupNo;
        return this;
    }
    public String getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public RunInstancesRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public RunInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RunInstancesRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public RunInstancesRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public RunInstancesRequest setHostNames(java.util.List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }
    public java.util.List<String> getHostNames() {
        return this.hostNames;
    }

    public RunInstancesRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public RunInstancesRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public RunInstancesRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public RunInstancesRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public RunInstancesRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public RunInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RunInstancesRequest setImageOptions(ImageOptions imageOptions) {
        this.imageOptions = imageOptions;
        return this;
    }
    public ImageOptions getImageOptions() {
        return this.imageOptions;
    }

    public RunInstancesRequest setInstance(java.util.List<Instance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<Instance> getInstance() {
        return this.instance;
    }

    public RunInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RunInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RunInstancesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public RunInstancesRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public RunInstancesRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public RunInstancesRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public RunInstancesRequest setIpv6Address(java.util.List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

    public RunInstancesRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public RunInstancesRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public RunInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public RunInstancesRequest setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }
    public Integer getMaxAmount() {
        return this.maxAmount;
    }

    public RunInstancesRequest setMinAmount(Integer minAmount) {
        this.minAmount = minAmount;
        return this;
    }
    public Integer getMinAmount() {
        return this.minAmount;
    }

    public RunInstancesRequest setNetworkInterface(java.util.List<NetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }
    public java.util.List<NetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    public RunInstancesRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public RunInstancesRequest setNodeControllerId(String nodeControllerId) {
        this.nodeControllerId = nodeControllerId;
        return this;
    }
    public String getNodeControllerId() {
        return this.nodeControllerId;
    }

    public RunInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RunInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RunInstancesRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RunInstancesRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public RunInstancesRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public RunInstancesRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public RunInstancesRequest setRecycleBinResourceId(String recycleBinResourceId) {
        this.recycleBinResourceId = recycleBinResourceId;
        return this;
    }
    public String getRecycleBinResourceId() {
        return this.recycleBinResourceId;
    }

    public RunInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunInstancesRequest setRelationOrderId(String relationOrderId) {
        this.relationOrderId = relationOrderId;
        return this;
    }
    public String getRelationOrderId() {
        return this.relationOrderId;
    }

    public RunInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RunInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunInstancesRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public RunInstancesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RunInstancesRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public RunInstancesRequest setSecurityGroupRule(java.util.List<SecurityGroupRule> securityGroupRule) {
        this.securityGroupRule = securityGroupRule;
        return this;
    }
    public java.util.List<SecurityGroupRule> getSecurityGroupRule() {
        return this.securityGroupRule;
    }

    public RunInstancesRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public RunInstancesRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public RunInstancesRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public RunInstancesRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public RunInstancesRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public RunInstancesRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public RunInstancesRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public RunInstancesRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public RunInstancesRequest setUniqueSuffix(Boolean uniqueSuffix) {
        this.uniqueSuffix = uniqueSuffix;
        return this;
    }
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    public RunInstancesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RunInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public RunInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class HibernationOptions extends TeaModel {
        @NameInMap("Configured")
        public Boolean configured;

        public static HibernationOptions build(java.util.Map<String, ?> map) throws Exception {
            HibernationOptions self = new HibernationOptions();
            return TeaModel.build(map, self);
        }

        public HibernationOptions setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

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
        @NameInMap("ManagedPrivateSpaceId")
        public String managedPrivateSpaceId;

        public static SchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            SchedulerOptions self = new SchedulerOptions();
            return TeaModel.build(map, self);
        }

        public SchedulerOptions setManagedPrivateSpaceId(String managedPrivateSpaceId) {
            this.managedPrivateSpaceId = managedPrivateSpaceId;
            return this;
        }
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

    }

    public static class SecurityOptions extends TeaModel {
        @NameInMap("ConfidentialComputingMode")
        public String confidentialComputingMode;

        @NameInMap("TrustedSystemMode")
        public String trustedSystemMode;

        public static SecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            SecurityOptions self = new SecurityOptions();
            return TeaModel.build(map, self);
        }

        public SecurityOptions setConfidentialComputingMode(String confidentialComputingMode) {
            this.confidentialComputingMode = confidentialComputingMode;
            return this;
        }
        public String getConfidentialComputingMode() {
            return this.confidentialComputingMode;
        }

        public SecurityOptions setTrustedSystemMode(String trustedSystemMode) {
            this.trustedSystemMode = trustedSystemMode;
            return this;
        }
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

    }

    public static class SystemDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("Category")
        public String category;

        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Size")
        public String size;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static SystemDisk build(java.util.Map<String, ?> map) throws Exception {
            SystemDisk self = new SystemDisk();
            return TeaModel.build(map, self);
        }

        public SystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public SystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SystemDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public SystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public SystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public SystemDisk setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public SystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public SystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public SystemDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public SystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public SystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public SystemDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class DataDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

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

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static DataDisk build(java.util.Map<String, ?> map) throws Exception {
            DataDisk self = new DataDisk();
            return TeaModel.build(map, self);
        }

        public DataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public DataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public DataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DataDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public DataDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public DataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public DataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DataDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class ImageOptions extends TeaModel {
        @NameInMap("LoginAsNonRoot")
        public Boolean loginAsNonRoot;

        public static ImageOptions build(java.util.Map<String, ?> map) throws Exception {
            ImageOptions self = new ImageOptions();
            return TeaModel.build(map, self);
        }

        public ImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class Instance extends TeaModel {
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        public static Instance build(java.util.Map<String, ?> map) throws Exception {
            Instance self = new Instance();
            return TeaModel.build(map, self);
        }

        public Instance setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

    }

    public static class NetworkInterface extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Ipv6Address")
        public java.util.List<String> ipv6Address;

        @NameInMap("Ipv6AddressCount")
        public Long ipv6AddressCount;

        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        @NameInMap("QueuePairNumber")
        public Long queuePairNumber;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static NetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            NetworkInterface self = new NetworkInterface();
            return TeaModel.build(map, self);
        }

        public NetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public NetworkInterface setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public NetworkInterface setIpv6Address(java.util.List<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public java.util.List<String> getIpv6Address() {
            return this.ipv6Address;
        }

        public NetworkInterface setIpv6AddressCount(Long ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Long getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public NetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public NetworkInterface setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public NetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public NetworkInterface setQueuePairNumber(Long queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }
        public Long getQueuePairNumber() {
            return this.queuePairNumber;
        }

        public NetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public NetworkInterface setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public NetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class SecurityGroupRule extends TeaModel {
        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("NicType")
        public String nicType;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public String priority;

        public static SecurityGroupRule build(java.util.Map<String, ?> map) throws Exception {
            SecurityGroupRule self = new SecurityGroupRule();
            return TeaModel.build(map, self);
        }

        public SecurityGroupRule setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public SecurityGroupRule setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public SecurityGroupRule setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public SecurityGroupRule setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public SecurityGroupRule setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

    }

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
