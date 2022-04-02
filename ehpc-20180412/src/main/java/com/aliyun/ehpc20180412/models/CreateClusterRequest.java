// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("EcsOrder")
    public CreateClusterRequestEcsOrder ecsOrder;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AdditionalVolumes")
    public java.util.List<CreateClusterRequestAdditionalVolumes> additionalVolumes;

    @NameInMap("Application")
    public java.util.List<CreateClusterRequestApplication> application;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("ClusterVersion")
    public String clusterVersion;

    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    @NameInMap("ComputeSpotPriceLimit")
    public String computeSpotPriceLimit;

    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    @NameInMap("DeployMode")
    public String deployMode;

    @NameInMap("Description")
    public String description;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EcsChargeType")
    public String ecsChargeType;

    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    @NameInMap("HaEnable")
    public Boolean haEnable;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("InputFileUrl")
    public String inputFileUrl;

    @NameInMap("IsComputeEss")
    public Boolean isComputeEss;

    @NameInMap("JobQueue")
    public String jobQueue;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("Name")
    public String name;

    @NameInMap("OsTag")
    public String osTag;

    @NameInMap("Password")
    public String password;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("Plugin")
    public String plugin;

    @NameInMap("PostInstallScript")
    public java.util.List<CreateClusterRequestPostInstallScript> postInstallScript;

    @NameInMap("RamNodeTypes")
    public java.util.List<String> ramNodeTypes;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RemoteDirectory")
    public String remoteDirectory;

    @NameInMap("RemoteVisEnable")
    public String remoteVisEnable;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SccClusterId")
    public String sccClusterId;

    @NameInMap("SchedulerType")
    public String schedulerType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("SystemDiskType")
    public String systemDiskType;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VolumeId")
    public String volumeId;

    @NameInMap("VolumeMountOption")
    public String volumeMountOption;

    @NameInMap("VolumeMountpoint")
    public String volumeMountpoint;

    @NameInMap("VolumeProtocol")
    public String volumeProtocol;

    @NameInMap("VolumeType")
    public String volumeType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("WithoutAgent")
    public Boolean withoutAgent;

    @NameInMap("WithoutElasticIp")
    public Boolean withoutElasticIp;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setEcsOrder(CreateClusterRequestEcsOrder ecsOrder) {
        this.ecsOrder = ecsOrder;
        return this;
    }
    public CreateClusterRequestEcsOrder getEcsOrder() {
        return this.ecsOrder;
    }

    public CreateClusterRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateClusterRequest setAdditionalVolumes(java.util.List<CreateClusterRequestAdditionalVolumes> additionalVolumes) {
        this.additionalVolumes = additionalVolumes;
        return this;
    }
    public java.util.List<CreateClusterRequestAdditionalVolumes> getAdditionalVolumes() {
        return this.additionalVolumes;
    }

    public CreateClusterRequest setApplication(java.util.List<CreateClusterRequestApplication> application) {
        this.application = application;
        return this;
    }
    public java.util.List<CreateClusterRequestApplication> getApplication() {
        return this.application;
    }

    public CreateClusterRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateClusterRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateClusterRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public CreateClusterRequest setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    public CreateClusterRequest setComputeEnableHt(Boolean computeEnableHt) {
        this.computeEnableHt = computeEnableHt;
        return this;
    }
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
    }

    public CreateClusterRequest setComputeSpotPriceLimit(String computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public CreateClusterRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public CreateClusterRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public CreateClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClusterRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateClusterRequest setEcsChargeType(String ecsChargeType) {
        this.ecsChargeType = ecsChargeType;
        return this;
    }
    public String getEcsChargeType() {
        return this.ecsChargeType;
    }

    public CreateClusterRequest setEhpcVersion(String ehpcVersion) {
        this.ehpcVersion = ehpcVersion;
        return this;
    }
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    public CreateClusterRequest setHaEnable(Boolean haEnable) {
        this.haEnable = haEnable;
        return this;
    }
    public Boolean getHaEnable() {
        return this.haEnable;
    }

    public CreateClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateClusterRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public CreateClusterRequest setInputFileUrl(String inputFileUrl) {
        this.inputFileUrl = inputFileUrl;
        return this;
    }
    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    public CreateClusterRequest setIsComputeEss(Boolean isComputeEss) {
        this.isComputeEss = isComputeEss;
        return this;
    }
    public Boolean getIsComputeEss() {
        return this.isComputeEss;
    }

    public CreateClusterRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public CreateClusterRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterRequest setOsTag(String osTag) {
        this.osTag = osTag;
        return this;
    }
    public String getOsTag() {
        return this.osTag;
    }

    public CreateClusterRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateClusterRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateClusterRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateClusterRequest setPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }
    public String getPlugin() {
        return this.plugin;
    }

    public CreateClusterRequest setPostInstallScript(java.util.List<CreateClusterRequestPostInstallScript> postInstallScript) {
        this.postInstallScript = postInstallScript;
        return this;
    }
    public java.util.List<CreateClusterRequestPostInstallScript> getPostInstallScript() {
        return this.postInstallScript;
    }

    public CreateClusterRequest setRamNodeTypes(java.util.List<String> ramNodeTypes) {
        this.ramNodeTypes = ramNodeTypes;
        return this;
    }
    public java.util.List<String> getRamNodeTypes() {
        return this.ramNodeTypes;
    }

    public CreateClusterRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateClusterRequest setRemoteDirectory(String remoteDirectory) {
        this.remoteDirectory = remoteDirectory;
        return this;
    }
    public String getRemoteDirectory() {
        return this.remoteDirectory;
    }

    public CreateClusterRequest setRemoteVisEnable(String remoteVisEnable) {
        this.remoteVisEnable = remoteVisEnable;
        return this;
    }
    public String getRemoteVisEnable() {
        return this.remoteVisEnable;
    }

    public CreateClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterRequest setSccClusterId(String sccClusterId) {
        this.sccClusterId = sccClusterId;
        return this;
    }
    public String getSccClusterId() {
        return this.sccClusterId;
    }

    public CreateClusterRequest setSchedulerType(String schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public String getSchedulerType() {
        return this.schedulerType;
    }

    public CreateClusterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateClusterRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public CreateClusterRequest setSystemDiskLevel(String systemDiskLevel) {
        this.systemDiskLevel = systemDiskLevel;
        return this;
    }
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    public CreateClusterRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateClusterRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public CreateClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateClusterRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    public String getVolumeId() {
        return this.volumeId;
    }

    public CreateClusterRequest setVolumeMountOption(String volumeMountOption) {
        this.volumeMountOption = volumeMountOption;
        return this;
    }
    public String getVolumeMountOption() {
        return this.volumeMountOption;
    }

    public CreateClusterRequest setVolumeMountpoint(String volumeMountpoint) {
        this.volumeMountpoint = volumeMountpoint;
        return this;
    }
    public String getVolumeMountpoint() {
        return this.volumeMountpoint;
    }

    public CreateClusterRequest setVolumeProtocol(String volumeProtocol) {
        this.volumeProtocol = volumeProtocol;
        return this;
    }
    public String getVolumeProtocol() {
        return this.volumeProtocol;
    }

    public CreateClusterRequest setVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }
    public String getVolumeType() {
        return this.volumeType;
    }

    public CreateClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterRequest setWithoutAgent(Boolean withoutAgent) {
        this.withoutAgent = withoutAgent;
        return this;
    }
    public Boolean getWithoutAgent() {
        return this.withoutAgent;
    }

    public CreateClusterRequest setWithoutElasticIp(Boolean withoutElasticIp) {
        this.withoutElasticIp = withoutElasticIp;
        return this;
    }
    public Boolean getWithoutElasticIp() {
        return this.withoutElasticIp;
    }

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateClusterRequestEcsOrderCompute extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateClusterRequestEcsOrderCompute build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestEcsOrderCompute self = new CreateClusterRequestEcsOrderCompute();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestEcsOrderCompute setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public CreateClusterRequestEcsOrderCompute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateClusterRequestEcsOrderLogin extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateClusterRequestEcsOrderLogin build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestEcsOrderLogin self = new CreateClusterRequestEcsOrderLogin();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestEcsOrderLogin setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public CreateClusterRequestEcsOrderLogin setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateClusterRequestEcsOrderManager extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateClusterRequestEcsOrderManager build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestEcsOrderManager self = new CreateClusterRequestEcsOrderManager();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestEcsOrderManager setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public CreateClusterRequestEcsOrderManager setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateClusterRequestEcsOrder extends TeaModel {
        @NameInMap("Compute")
        @Validation(required = true)
        public CreateClusterRequestEcsOrderCompute compute;

        @NameInMap("Login")
        @Validation(required = true)
        public CreateClusterRequestEcsOrderLogin login;

        @NameInMap("Manager")
        @Validation(required = true)
        public CreateClusterRequestEcsOrderManager manager;

        public static CreateClusterRequestEcsOrder build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestEcsOrder self = new CreateClusterRequestEcsOrder();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestEcsOrder setCompute(CreateClusterRequestEcsOrderCompute compute) {
            this.compute = compute;
            return this;
        }
        public CreateClusterRequestEcsOrderCompute getCompute() {
            return this.compute;
        }

        public CreateClusterRequestEcsOrder setLogin(CreateClusterRequestEcsOrderLogin login) {
            this.login = login;
            return this;
        }
        public CreateClusterRequestEcsOrderLogin getLogin() {
            return this.login;
        }

        public CreateClusterRequestEcsOrder setManager(CreateClusterRequestEcsOrderManager manager) {
            this.manager = manager;
            return this;
        }
        public CreateClusterRequestEcsOrderManager getManager() {
            return this.manager;
        }

    }

    public static class CreateClusterRequestAdditionalVolumesRoles extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static CreateClusterRequestAdditionalVolumesRoles build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestAdditionalVolumesRoles self = new CreateClusterRequestAdditionalVolumesRoles();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestAdditionalVolumesRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateClusterRequestAdditionalVolumes extends TeaModel {
        @NameInMap("JobQueue")
        public String jobQueue;

        @NameInMap("LocalDirectory")
        public String localDirectory;

        @NameInMap("Location")
        public String location;

        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("Roles")
        public java.util.List<CreateClusterRequestAdditionalVolumesRoles> roles;

        @NameInMap("VolumeId")
        public String volumeId;

        @NameInMap("VolumeMountOption")
        public String volumeMountOption;

        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        @NameInMap("VolumeType")
        public String volumeType;

        public static CreateClusterRequestAdditionalVolumes build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestAdditionalVolumes self = new CreateClusterRequestAdditionalVolumes();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestAdditionalVolumes setJobQueue(String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public String getJobQueue() {
            return this.jobQueue;
        }

        public CreateClusterRequestAdditionalVolumes setLocalDirectory(String localDirectory) {
            this.localDirectory = localDirectory;
            return this;
        }
        public String getLocalDirectory() {
            return this.localDirectory;
        }

        public CreateClusterRequestAdditionalVolumes setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateClusterRequestAdditionalVolumes setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public CreateClusterRequestAdditionalVolumes setRoles(java.util.List<CreateClusterRequestAdditionalVolumesRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<CreateClusterRequestAdditionalVolumesRoles> getRoles() {
            return this.roles;
        }

        public CreateClusterRequestAdditionalVolumes setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public CreateClusterRequestAdditionalVolumes setVolumeMountOption(String volumeMountOption) {
            this.volumeMountOption = volumeMountOption;
            return this;
        }
        public String getVolumeMountOption() {
            return this.volumeMountOption;
        }

        public CreateClusterRequestAdditionalVolumes setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public CreateClusterRequestAdditionalVolumes setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        public CreateClusterRequestAdditionalVolumes setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

    }

    public static class CreateClusterRequestApplication extends TeaModel {
        @NameInMap("Tag")
        public String tag;

        public static CreateClusterRequestApplication build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestApplication self = new CreateClusterRequestApplication();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestApplication setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class CreateClusterRequestPostInstallScript extends TeaModel {
        @NameInMap("Args")
        public String args;

        @NameInMap("Url")
        public String url;

        public static CreateClusterRequestPostInstallScript build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestPostInstallScript self = new CreateClusterRequestPostInstallScript();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestPostInstallScript setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public CreateClusterRequestPostInstallScript setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
