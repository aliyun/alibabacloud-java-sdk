// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateWaitingOrderRequest extends TeaModel {
    @NameInMap("CpuOptions")
    public CpuOptions cpuOptions;

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

    @NameInMap("Arn")
    public java.util.List<Arn> arn;

    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("DataDisk")
    public java.util.List<DataDisk> dataDisk;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ExpiredTime")
    public String expiredTime;

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

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

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

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("LaunchTemplateVersion")
    public Long launchTemplateVersion;

    @NameInMap("MaxAmount")
    public Integer maxAmount;

    @NameInMap("MinAmount")
    public Integer minAmount;

    @NameInMap("NetworkInterface")
    public java.util.List<NetworkInterface> networkInterface;

    @NameInMap("NetworkInterfaceQueueNumber")
    public Integer networkInterfaceQueueNumber;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RegionId")
    public String regionId;

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

    public static CreateWaitingOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingOrderRequest self = new CreateWaitingOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateWaitingOrderRequest setCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }
    public CpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    public CreateWaitingOrderRequest setHibernationOptions(HibernationOptions hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }
    public HibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    public CreateWaitingOrderRequest setPrivatePoolOptions(PrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateWaitingOrderRequest setSchedulerOptions(SchedulerOptions schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public SchedulerOptions getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public CreateWaitingOrderRequest setSecurityOptions(SecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }
    public SecurityOptions getSecurityOptions() {
        return this.securityOptions;
    }

    public CreateWaitingOrderRequest setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateWaitingOrderRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public CreateWaitingOrderRequest setArn(java.util.List<Arn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<Arn> getArn() {
        return this.arn;
    }

    public CreateWaitingOrderRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public CreateWaitingOrderRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateWaitingOrderRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateWaitingOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWaitingOrderRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public CreateWaitingOrderRequest setDataDisk(java.util.List<DataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateWaitingOrderRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public CreateWaitingOrderRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateWaitingOrderRequest setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
        this.deploymentSetGroupNo = deploymentSetGroupNo;
        return this;
    }
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public CreateWaitingOrderRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateWaitingOrderRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWaitingOrderRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateWaitingOrderRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public CreateWaitingOrderRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateWaitingOrderRequest setHostNames(java.util.List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }
    public java.util.List<String> getHostNames() {
        return this.hostNames;
    }

    public CreateWaitingOrderRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public CreateWaitingOrderRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public CreateWaitingOrderRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public CreateWaitingOrderRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public CreateWaitingOrderRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public CreateWaitingOrderRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateWaitingOrderRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateWaitingOrderRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateWaitingOrderRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateWaitingOrderRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateWaitingOrderRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateWaitingOrderRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateWaitingOrderRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateWaitingOrderRequest setIpv6Address(java.util.List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

    public CreateWaitingOrderRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateWaitingOrderRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public CreateWaitingOrderRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateWaitingOrderRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateWaitingOrderRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public CreateWaitingOrderRequest setLaunchTemplateVersion(Long launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public Long getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public CreateWaitingOrderRequest setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }
    public Integer getMaxAmount() {
        return this.maxAmount;
    }

    public CreateWaitingOrderRequest setMinAmount(Integer minAmount) {
        this.minAmount = minAmount;
        return this;
    }
    public Integer getMinAmount() {
        return this.minAmount;
    }

    public CreateWaitingOrderRequest setNetworkInterface(java.util.List<NetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }
    public java.util.List<NetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    public CreateWaitingOrderRequest setNetworkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
        this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
        return this;
    }
    public Integer getNetworkInterfaceQueueNumber() {
        return this.networkInterfaceQueueNumber;
    }

    public CreateWaitingOrderRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateWaitingOrderRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateWaitingOrderRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateWaitingOrderRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateWaitingOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateWaitingOrderRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateWaitingOrderRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateWaitingOrderRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateWaitingOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWaitingOrderRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateWaitingOrderRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateWaitingOrderRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateWaitingOrderRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateWaitingOrderRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateWaitingOrderRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateWaitingOrderRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateWaitingOrderRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public CreateWaitingOrderRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateWaitingOrderRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateWaitingOrderRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public CreateWaitingOrderRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public CreateWaitingOrderRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public CreateWaitingOrderRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public CreateWaitingOrderRequest setUniqueSuffix(Boolean uniqueSuffix) {
        this.uniqueSuffix = uniqueSuffix;
        return this;
    }
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    public CreateWaitingOrderRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateWaitingOrderRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateWaitingOrderRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CpuOptions extends TeaModel {
        @NameInMap("Core")
        public Integer core;

        @NameInMap("Numa")
        public String numa;

        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        public static CpuOptions build(java.util.Map<String, ?> map) throws Exception {
            CpuOptions self = new CpuOptions();
            return TeaModel.build(map, self);
        }

        public CpuOptions setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public CpuOptions setNuma(String numa) {
            this.numa = numa;
            return this;
        }
        public String getNuma() {
            return this.numa;
        }

        public CpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

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

        @NameInMap("Description")
        public String description;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("Size")
        public String size;

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

        public SystemDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class Arn extends TeaModel {
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        @NameInMap("RoleType")
        public String roleType;

        @NameInMap("Rolearn")
        public String rolearn;

        public static Arn build(java.util.Map<String, ?> map) throws Exception {
            Arn self = new Arn();
            return TeaModel.build(map, self);
        }

        public Arn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public Arn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public Arn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class DataDisk extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

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
        public String encrypted;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

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

        public DataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
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

    public static class NetworkInterface extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        @NameInMap("QueueNumber")
        public Integer queueNumber;

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

        public NetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public NetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public NetworkInterface setQueueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }
        public Integer getQueueNumber() {
            return this.queueNumber;
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
