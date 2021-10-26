// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateHybridClusterRequest extends TeaModel {
    @NameInMap("EcsOrder")
    public CreateHybridClusterRequestEcsOrder ecsOrder;

    @NameInMap("Application")
    public java.util.List<CreateHybridClusterRequestApplication> application;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("ComputeSpotPriceLimit")
    public Float computeSpotPriceLimit;

    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    @NameInMap("Description")
    public String description;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    @NameInMap("JobQueue")
    public String jobQueue;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("Location")
    public String location;

    @NameInMap("MultiOs")
    public Boolean multiOs;

    @NameInMap("Name")
    public String name;

    @NameInMap("Nodes")
    public java.util.List<CreateHybridClusterRequestNodes> nodes;

    @NameInMap("OnPremiseVolumeLocalPath")
    public String onPremiseVolumeLocalPath;

    @NameInMap("OnPremiseVolumeMountPoint")
    public String onPremiseVolumeMountPoint;

    @NameInMap("OnPremiseVolumeProtocol")
    public String onPremiseVolumeProtocol;

    @NameInMap("OnPremiseVolumeRemotePath")
    public String onPremiseVolumeRemotePath;

    @NameInMap("OsTag")
    public String osTag;

    @NameInMap("Password")
    public String password;

    @NameInMap("PostInstallScript")
    public java.util.List<CreateHybridClusterRequestPostInstallScript> postInstallScript;

    @NameInMap("RemoteDirectory")
    public String remoteDirectory;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SchedulerPreInstall")
    public Boolean schedulerPreInstall;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VolumeId")
    public String volumeId;

    @NameInMap("VolumeMountpoint")
    public String volumeMountpoint;

    @NameInMap("VolumeProtocol")
    public String volumeProtocol;

    @NameInMap("VolumeType")
    public String volumeType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateHybridClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridClusterRequest self = new CreateHybridClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateHybridClusterRequest setEcsOrder(CreateHybridClusterRequestEcsOrder ecsOrder) {
        this.ecsOrder = ecsOrder;
        return this;
    }
    public CreateHybridClusterRequestEcsOrder getEcsOrder() {
        return this.ecsOrder;
    }

    public CreateHybridClusterRequest setApplication(java.util.List<CreateHybridClusterRequestApplication> application) {
        this.application = application;
        return this;
    }
    public java.util.List<CreateHybridClusterRequestApplication> getApplication() {
        return this.application;
    }

    public CreateHybridClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateHybridClusterRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public CreateHybridClusterRequest setComputeSpotPriceLimit(Float computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public Float getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public CreateHybridClusterRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public CreateHybridClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateHybridClusterRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateHybridClusterRequest setEhpcVersion(String ehpcVersion) {
        this.ehpcVersion = ehpcVersion;
        return this;
    }
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    public CreateHybridClusterRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateHybridClusterRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public CreateHybridClusterRequest setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
        return this;
    }
    public String getJobQueue() {
        return this.jobQueue;
    }

    public CreateHybridClusterRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateHybridClusterRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateHybridClusterRequest setMultiOs(Boolean multiOs) {
        this.multiOs = multiOs;
        return this;
    }
    public Boolean getMultiOs() {
        return this.multiOs;
    }

    public CreateHybridClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateHybridClusterRequest setNodes(java.util.List<CreateHybridClusterRequestNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<CreateHybridClusterRequestNodes> getNodes() {
        return this.nodes;
    }

    public CreateHybridClusterRequest setOnPremiseVolumeLocalPath(String onPremiseVolumeLocalPath) {
        this.onPremiseVolumeLocalPath = onPremiseVolumeLocalPath;
        return this;
    }
    public String getOnPremiseVolumeLocalPath() {
        return this.onPremiseVolumeLocalPath;
    }

    public CreateHybridClusterRequest setOnPremiseVolumeMountPoint(String onPremiseVolumeMountPoint) {
        this.onPremiseVolumeMountPoint = onPremiseVolumeMountPoint;
        return this;
    }
    public String getOnPremiseVolumeMountPoint() {
        return this.onPremiseVolumeMountPoint;
    }

    public CreateHybridClusterRequest setOnPremiseVolumeProtocol(String onPremiseVolumeProtocol) {
        this.onPremiseVolumeProtocol = onPremiseVolumeProtocol;
        return this;
    }
    public String getOnPremiseVolumeProtocol() {
        return this.onPremiseVolumeProtocol;
    }

    public CreateHybridClusterRequest setOnPremiseVolumeRemotePath(String onPremiseVolumeRemotePath) {
        this.onPremiseVolumeRemotePath = onPremiseVolumeRemotePath;
        return this;
    }
    public String getOnPremiseVolumeRemotePath() {
        return this.onPremiseVolumeRemotePath;
    }

    public CreateHybridClusterRequest setOsTag(String osTag) {
        this.osTag = osTag;
        return this;
    }
    public String getOsTag() {
        return this.osTag;
    }

    public CreateHybridClusterRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateHybridClusterRequest setPostInstallScript(java.util.List<CreateHybridClusterRequestPostInstallScript> postInstallScript) {
        this.postInstallScript = postInstallScript;
        return this;
    }
    public java.util.List<CreateHybridClusterRequestPostInstallScript> getPostInstallScript() {
        return this.postInstallScript;
    }

    public CreateHybridClusterRequest setRemoteDirectory(String remoteDirectory) {
        this.remoteDirectory = remoteDirectory;
        return this;
    }
    public String getRemoteDirectory() {
        return this.remoteDirectory;
    }

    public CreateHybridClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateHybridClusterRequest setSchedulerPreInstall(Boolean schedulerPreInstall) {
        this.schedulerPreInstall = schedulerPreInstall;
        return this;
    }
    public Boolean getSchedulerPreInstall() {
        return this.schedulerPreInstall;
    }

    public CreateHybridClusterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateHybridClusterRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public CreateHybridClusterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateHybridClusterRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    public String getVolumeId() {
        return this.volumeId;
    }

    public CreateHybridClusterRequest setVolumeMountpoint(String volumeMountpoint) {
        this.volumeMountpoint = volumeMountpoint;
        return this;
    }
    public String getVolumeMountpoint() {
        return this.volumeMountpoint;
    }

    public CreateHybridClusterRequest setVolumeProtocol(String volumeProtocol) {
        this.volumeProtocol = volumeProtocol;
        return this;
    }
    public String getVolumeProtocol() {
        return this.volumeProtocol;
    }

    public CreateHybridClusterRequest setVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }
    public String getVolumeType() {
        return this.volumeType;
    }

    public CreateHybridClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateHybridClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateHybridClusterRequestEcsOrderCompute extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateHybridClusterRequestEcsOrderCompute build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridClusterRequestEcsOrderCompute self = new CreateHybridClusterRequestEcsOrderCompute();
            return TeaModel.build(map, self);
        }

        public CreateHybridClusterRequestEcsOrderCompute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateHybridClusterRequestEcsOrder extends TeaModel {
        @NameInMap("Compute")
        @Validation(required = true)
        public CreateHybridClusterRequestEcsOrderCompute compute;

        public static CreateHybridClusterRequestEcsOrder build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridClusterRequestEcsOrder self = new CreateHybridClusterRequestEcsOrder();
            return TeaModel.build(map, self);
        }

        public CreateHybridClusterRequestEcsOrder setCompute(CreateHybridClusterRequestEcsOrderCompute compute) {
            this.compute = compute;
            return this;
        }
        public CreateHybridClusterRequestEcsOrderCompute getCompute() {
            return this.compute;
        }

    }

    public static class CreateHybridClusterRequestApplication extends TeaModel {
        @NameInMap("Tag")
        public String tag;

        public static CreateHybridClusterRequestApplication build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridClusterRequestApplication self = new CreateHybridClusterRequestApplication();
            return TeaModel.build(map, self);
        }

        public CreateHybridClusterRequestApplication setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class CreateHybridClusterRequestNodes extends TeaModel {
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Role")
        public String role;

        @NameInMap("SchedulerType")
        public String schedulerType;

        public static CreateHybridClusterRequestNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridClusterRequestNodes self = new CreateHybridClusterRequestNodes();
            return TeaModel.build(map, self);
        }

        public CreateHybridClusterRequestNodes setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public CreateHybridClusterRequestNodes setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public CreateHybridClusterRequestNodes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public CreateHybridClusterRequestNodes setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateHybridClusterRequestNodes setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

    }

    public static class CreateHybridClusterRequestPostInstallScript extends TeaModel {
        @NameInMap("Args")
        public String args;

        @NameInMap("Url")
        public String url;

        public static CreateHybridClusterRequestPostInstallScript build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridClusterRequestPostInstallScript self = new CreateHybridClusterRequestPostInstallScript();
            return TeaModel.build(map, self);
        }

        public CreateHybridClusterRequestPostInstallScript setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public CreateHybridClusterRequestPostInstallScript setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
