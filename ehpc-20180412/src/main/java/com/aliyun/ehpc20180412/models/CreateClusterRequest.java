// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("EcsOrder")
    public CreateClusterRequestEcsOrder ecsOrder;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("OsTag")
    public String osTag;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("SchedulerType")
    public String schedulerType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VolumeType")
    public String volumeType;

    @NameInMap("VolumeId")
    public String volumeId;

    @NameInMap("VolumeProtocol")
    public String volumeProtocol;

    @NameInMap("VolumeMountpoint")
    public String volumeMountpoint;

    @NameInMap("RemoteDirectory")
    public String remoteDirectory;

    @NameInMap("DeployMode")
    public String deployMode;

    @NameInMap("HaEnable")
    public Boolean haEnable;

    @NameInMap("EcsChargeType")
    public String ecsChargeType;

    @NameInMap("Password")
    public String password;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("SccClusterId")
    public String sccClusterId;

    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    @NameInMap("ComputeSpotPriceLimit")
    public String computeSpotPriceLimit;

    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("InputFileUrl")
    public String inputFileUrl;

    @NameInMap("JobQueue")
    public String jobQueue;

    @NameInMap("SystemDiskType")
    public String systemDiskType;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("RemoteVisEnable")
    public String remoteVisEnable;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("WithoutElasticIp")
    public Boolean withoutElasticIp;

    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    @NameInMap("IsComputeEss")
    public Boolean isComputeEss;

    @NameInMap("ClusterVersion")
    public String clusterVersion;

    @NameInMap("Application")
    public java.util.List<CreateClusterRequestApplication> application;

    @NameInMap("AdditionalVolumes")
    public java.util.List<CreateClusterRequestAdditionalVolumes> additionalVolumes;

    @NameInMap("PostInstallScript")
    public java.util.List<CreateClusterRequestPostInstallScript> postInstallScript;

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

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateClusterRequest setEhpcVersion(String ehpcVersion) {
        this.ehpcVersion = ehpcVersion;
        return this;
    }
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    public CreateClusterRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public CreateClusterRequest setOsTag(String osTag) {
        this.osTag = osTag;
        return this;
    }
    public String getOsTag() {
        return this.osTag;
    }

    public CreateClusterRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
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

    public CreateClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateClusterRequest setVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }
    public String getVolumeType() {
        return this.volumeType;
    }

    public CreateClusterRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    public String getVolumeId() {
        return this.volumeId;
    }

    public CreateClusterRequest setVolumeProtocol(String volumeProtocol) {
        this.volumeProtocol = volumeProtocol;
        return this;
    }
    public String getVolumeProtocol() {
        return this.volumeProtocol;
    }

    public CreateClusterRequest setVolumeMountpoint(String volumeMountpoint) {
        this.volumeMountpoint = volumeMountpoint;
        return this;
    }
    public String getVolumeMountpoint() {
        return this.volumeMountpoint;
    }

    public CreateClusterRequest setRemoteDirectory(String remoteDirectory) {
        this.remoteDirectory = remoteDirectory;
        return this;
    }
    public String getRemoteDirectory() {
        return this.remoteDirectory;
    }

    public CreateClusterRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public CreateClusterRequest setHaEnable(Boolean haEnable) {
        this.haEnable = haEnable;
        return this;
    }
    public Boolean getHaEnable() {
        return this.haEnable;
    }

    public CreateClusterRequest setEcsChargeType(String ecsChargeType) {
        this.ecsChargeType = ecsChargeType;
        return this;
    }
    public String getEcsChargeType() {
        return this.ecsChargeType;
    }

    public CreateClusterRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateClusterRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateClusterRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public CreateClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateClusterRequest setSccClusterId(String sccClusterId) {
        this.sccClusterId = sccClusterId;
        return this;
    }
    public String getSccClusterId() {
        return this.sccClusterId;
    }

    public CreateClusterRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public CreateClusterRequest setComputeSpotPriceLimit(String computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public CreateClusterRequest setComputeEnableHt(Boolean computeEnableHt) {
        this.computeEnableHt = computeEnableHt;
        return this;
    }
    public Boolean getComputeEnableHt() {
        return this.computeEnableHt;
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

    public CreateClusterRequest setInputFileUrl(String inputFileUrl) {
        this.inputFileUrl = inputFileUrl;
        return this;
    }
    public String getInputFileUrl() {
        return this.inputFileUrl;
    }

    public CreateClusterRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public CreateClusterRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public CreateClusterRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
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

    public CreateClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateClusterRequest setWithoutElasticIp(Boolean withoutElasticIp) {
        this.withoutElasticIp = withoutElasticIp;
        return this;
    }
    public Boolean getWithoutElasticIp() {
        return this.withoutElasticIp;
    }

    public CreateClusterRequest setSystemDiskLevel(String systemDiskLevel) {
        this.systemDiskLevel = systemDiskLevel;
        return this;
    }
    public String getSystemDiskLevel() {
        return this.systemDiskLevel;
    }

    public CreateClusterRequest setIsComputeEss(Boolean isComputeEss) {
        this.isComputeEss = isComputeEss;
        return this;
    }
    public Boolean getIsComputeEss() {
        return this.isComputeEss;
    }

    public CreateClusterRequest setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    public CreateClusterRequest setApplication(java.util.List<CreateClusterRequestApplication> application) {
        this.application = application;
        return this;
    }
    public java.util.List<CreateClusterRequestApplication> getApplication() {
        return this.application;
    }

    public CreateClusterRequest setAdditionalVolumes(java.util.List<CreateClusterRequestAdditionalVolumes> additionalVolumes) {
        this.additionalVolumes = additionalVolumes;
        return this;
    }
    public java.util.List<CreateClusterRequestAdditionalVolumes> getAdditionalVolumes() {
        return this.additionalVolumes;
    }

    public CreateClusterRequest setPostInstallScript(java.util.List<CreateClusterRequestPostInstallScript> postInstallScript) {
        this.postInstallScript = postInstallScript;
        return this;
    }
    public java.util.List<CreateClusterRequestPostInstallScript> getPostInstallScript() {
        return this.postInstallScript;
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

    public static class CreateClusterRequestEcsOrder extends TeaModel {
        @NameInMap("Manager")
        @Validation(required = true)
        public CreateClusterRequestEcsOrderManager manager;

        @NameInMap("Compute")
        @Validation(required = true)
        public CreateClusterRequestEcsOrderCompute compute;

        @NameInMap("Login")
        @Validation(required = true)
        public CreateClusterRequestEcsOrderLogin login;

        public static CreateClusterRequestEcsOrder build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestEcsOrder self = new CreateClusterRequestEcsOrder();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestEcsOrder setManager(CreateClusterRequestEcsOrderManager manager) {
            this.manager = manager;
            return this;
        }
        public CreateClusterRequestEcsOrderManager getManager() {
            return this.manager;
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

        @NameInMap("VolumeId")
        public String volumeId;

        @NameInMap("Roles")
        public java.util.List<CreateClusterRequestAdditionalVolumesRoles> roles;

        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        @NameInMap("VolumeType")
        public String volumeType;

        @NameInMap("LocalDirectory")
        public String localDirectory;

        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        @NameInMap("Location")
        public String location;

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

        public CreateClusterRequestAdditionalVolumes setVolumeId(String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public String getVolumeId() {
            return this.volumeId;
        }

        public CreateClusterRequestAdditionalVolumes setRoles(java.util.List<CreateClusterRequestAdditionalVolumesRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<CreateClusterRequestAdditionalVolumesRoles> getRoles() {
            return this.roles;
        }

        public CreateClusterRequestAdditionalVolumes setVolumeMountpoint(String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public String getVolumeMountpoint() {
            return this.volumeMountpoint;
        }

        public CreateClusterRequestAdditionalVolumes setRemoteDirectory(String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public String getRemoteDirectory() {
            return this.remoteDirectory;
        }

        public CreateClusterRequestAdditionalVolumes setVolumeType(String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public String getVolumeType() {
            return this.volumeType;
        }

        public CreateClusterRequestAdditionalVolumes setLocalDirectory(String localDirectory) {
            this.localDirectory = localDirectory;
            return this;
        }
        public String getLocalDirectory() {
            return this.localDirectory;
        }

        public CreateClusterRequestAdditionalVolumes setVolumeProtocol(String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public String getVolumeProtocol() {
            return this.volumeProtocol;
        }

        public CreateClusterRequestAdditionalVolumes setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
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
