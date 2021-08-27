// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public CreateInstanceRequestSystemDisk systemDisk;

    @NameInMap("HibernationOptions")
    public CreateInstanceRequestHibernationOptions hibernationOptions;

    @NameInMap("PrivatePoolOptions")
    public CreateInstanceRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageFamily")
    public String imageFamily;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Password")
    public String password;

    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("VlanId")
    public String vlanId;

    @NameInMap("InnerIpAddress")
    public String innerIpAddress;

    @NameInMap("NodeControllerId")
    public String nodeControllerId;

    @NameInMap("Description")
    public String description;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("UseAdditionalService")
    public Boolean useAdditionalService;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("CreditSpecification")
    public String creditSpecification;

    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    @NameInMap("Affinity")
    public String affinity;

    @NameInMap("Tenancy")
    public String tenancy;

    @NameInMap("StorageSetId")
    public String storageSetId;

    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    @NameInMap("HttpTokens")
    public String httpTokens;

    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    @NameInMap("DataDisk")
    public java.util.List<CreateInstanceRequestDataDisk> dataDisk;

    @NameInMap("Arn")
    public java.util.List<CreateInstanceRequestArn> arn;

    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setSystemDisk(CreateInstanceRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateInstanceRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateInstanceRequest setHibernationOptions(CreateInstanceRequestHibernationOptions hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }
    public CreateInstanceRequestHibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    public CreateInstanceRequest setPrivatePoolOptions(CreateInstanceRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public CreateInstanceRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstanceRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstanceRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateInstanceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateInstanceRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateInstanceRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateInstanceRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateInstanceRequest setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
        this.deploymentSetGroupNo = deploymentSetGroupNo;
        return this;
    }
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public CreateInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceRequest setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

    public CreateInstanceRequest setInnerIpAddress(String innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
        return this;
    }
    public String getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public CreateInstanceRequest setNodeControllerId(String nodeControllerId) {
        this.nodeControllerId = nodeControllerId;
        return this;
    }
    public String getNodeControllerId() {
        return this.nodeControllerId;
    }

    public CreateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateInstanceRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateInstanceRequest setUseAdditionalService(Boolean useAdditionalService) {
        this.useAdditionalService = useAdditionalService;
        return this;
    }
    public Boolean getUseAdditionalService() {
        return this.useAdditionalService;
    }

    public CreateInstanceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateInstanceRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateInstanceRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateInstanceRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateInstanceRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateInstanceRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public CreateInstanceRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateInstanceRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public CreateInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateInstanceRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public CreateInstanceRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public CreateInstanceRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateInstanceRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public CreateInstanceRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public CreateInstanceRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public CreateInstanceRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public CreateInstanceRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public CreateInstanceRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public CreateInstanceRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public CreateInstanceRequest setDataDisk(java.util.List<CreateInstanceRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateInstanceRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateInstanceRequest setArn(java.util.List<CreateInstanceRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<CreateInstanceRequestArn> getArn() {
        return this.arn;
    }

    public CreateInstanceRequest setTag(java.util.List<CreateInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateInstanceRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateInstanceRequestSystemDisk extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("Category")
        public String category;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("Description")
        public String description;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static CreateInstanceRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestSystemDisk self = new CreateInstanceRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateInstanceRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateInstanceRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateInstanceRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateInstanceRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class CreateInstanceRequestHibernationOptions extends TeaModel {
        @NameInMap("Configured")
        public Boolean configured;

        public static CreateInstanceRequestHibernationOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestHibernationOptions self = new CreateInstanceRequestHibernationOptions();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestHibernationOptions setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

    }

    public static class CreateInstanceRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        @NameInMap("Id")
        public String id;

        public static CreateInstanceRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestPrivatePoolOptions self = new CreateInstanceRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public CreateInstanceRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateInstanceRequestDataDisk extends TeaModel {
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

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

        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        public static CreateInstanceRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestDataDisk self = new CreateInstanceRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateInstanceRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateInstanceRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public CreateInstanceRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateInstanceRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateInstanceRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateInstanceRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateInstanceRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateInstanceRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateInstanceRequestDataDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public CreateInstanceRequestDataDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

    }

    public static class CreateInstanceRequestArn extends TeaModel {
        @NameInMap("RoleType")
        public String roleType;

        @NameInMap("Rolearn")
        public String rolearn;

        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        public static CreateInstanceRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestArn self = new CreateInstanceRequestArn();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateInstanceRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

        public CreateInstanceRequestArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

    }

    public static class CreateInstanceRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTag self = new CreateInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
