// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateHybridClusterRequest extends TeaModel {
    @NameInMap("EcsOrder")
    public CreateHybridClusterRequestEcsOrder ecsOrder;

    /**
     * <p>An array that consists of the information about the software.</p>
     */
    @NameInMap("Application")
    public java.util.List<CreateHybridClusterRequestApplication> application;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence of a request?](~~25693~~)</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The version of the client. By default, the latest version is used.</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The maximum hourly price for the ECS instance under the compute node. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.</p>
     */
    @NameInMap("ComputeSpotPriceLimit")
    public Float computeSpotPriceLimit;

    /**
     * <p>The preemption policy of the compute nodes. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The compute nodes are pay-as-you-go instances.</p>
     * <p>*   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    /**
     * <p>The description of the E-HPC cluster. The description must be 2 to 256 characters in length and cannot start with [http:// or https://](http://https://。).</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the domain account service. Valid values:</p>
     * <br>
     * <p>*   nis</p>
     * <p>*   ldap</p>
     * <br>
     * <p>Default value: nis.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The version of E-HPC. By default, the latest version is used.</p>
     */
    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    /**
     * <p>The mode in which the proxy node manages the offline nodes. Valid values:</p>
     * <br>
     * <p>*   SSH: indicates management via SSH logon.</p>
     * <p>*   CA: indicates management through Cloud Assistant.</p>
     */
    @NameInMap("HybridClusterOpMode")
    public String hybridClusterOpMode;

    /**
     * <p>The IDs of the images.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the image. Valid values:</p>
     * <br>
     * <p>*   system: public image</p>
     * <p>*   self: custom image</p>
     * <p>*   others: shared image</p>
     * <p>*   marketplace: Alibaba Cloud Marketplace image</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The default queue of the scale-out nodes.</p>
     */
    @NameInMap("JobQueue")
    public String jobQueue;

    /**
     * <p>The name of the key pair. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with http:// or https://.[](http://https://。、（:）、（\_）（-）。)</p>
     * <br>
     * <p>> To use an SSH key pair, see [Create an SSH key pair](~~51793~~).</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The location where the cluster resides. Set the value to OnPremise.</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>Specifies whether the cluster supports multiple operating systems. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("MultiOs")
    public Boolean multiOs;

    /**
     * <p>The name of the cluster. The name must be 2 to 64 characters in length, and can contain only letters, digits, hyphens (-), and underscores (\_). It must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The information about the nodes in the local cluster.</p>
     */
    @NameInMap("Nodes")
    public java.util.List<CreateHybridClusterRequestNodes> nodes;

    /**
     * <p>The path in which the on-premises file system is mounted on the nodes on the cloud.</p>
     */
    @NameInMap("OnPremiseVolumeLocalPath")
    public String onPremiseVolumeLocalPath;

    /**
     * <p>The mount target of the on-premises file system.</p>
     */
    @NameInMap("OnPremiseVolumeMountPoint")
    public String onPremiseVolumeMountPoint;

    /**
     * <p>The type of the protocol that is used by the on-premises file system. Only NFS is supported.</p>
     */
    @NameInMap("OnPremiseVolumeProtocol")
    public String onPremiseVolumeProtocol;

    /**
     * <p>The mount path of the on-premises file system.</p>
     */
    @NameInMap("OnPremiseVolumeRemotePath")
    public String onPremiseVolumeRemotePath;

    /**
     * <p>The parameter that is used to connect to the OpenLDAP server.</p>
     */
    @NameInMap("OpenldapPar")
    public CreateHybridClusterRequestOpenldapPar openldapPar;

    /**
     * <p>The image tag of the operating system. You can call the [ListImages](~~87213~~) operation to query the image tag.</p>
     */
    @NameInMap("OsTag")
    public String osTag;

    /**
     * <p>The root password of the logon node. The password must be 8 to 30 characters in length and contain at least three of the following items: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: `() ~ ! @ # $ % ^ & * - = + | { } [ ] : ; ‘ < > , . ? /`</p>
     * <br>
     * <p>> We recommend that you use HTTPS to call the API operation to prevent password leakage.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The mode configurations of the plug-in. This parameter takes effect only when the SchedulerType parameter is set to custom.</p>
     * <br>
     * <p>The value must be a JSON string. The parameter contains the following parameters: pluginMod, pluginLocalPath, and pluginOssPath.</p>
     * <br>
     * <p>*   pluginMod: the mode of the plug-in. The following modes are supported:</p>
     * <br>
     * <p>    *   oss: The plug-in is downloaded and decompressed from OSS to a local path. The local path is specified by the pluginLocalPath parameter.</p>
     * <p>    *   image: By default, the plug-in is stored in a pre-defined local path. The local path is specified by the pluginLocalPath parameter.</p>
     * <br>
     * <p>*   pluginLocalPath: the local path where the plug-in is stored. We recommend that you select a shared directory in oss mode and a non-shared directory in image mode.</p>
     * <br>
     * <p>*   pluginOssPath: the remote path where the plug-in is stored in OSS. This parameter takes effect only when the pluginMod parameter is set to oss.</p>
     */
    @NameInMap("Plugin")
    public String plugin;

    /**
     * <p>The list of post-installation script information.</p>
     */
    @NameInMap("PostInstallScript")
    public java.util.List<CreateHybridClusterRequestPostInstallScript> postInstallScript;

    /**
     * <p>The remote directory to which the file system is mounted.</p>
     */
    @NameInMap("RemoteDirectory")
    public String remoteDirectory;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether the scheduler is preinstalled for the image. Valid values:</p>
     * <br>
     * <p>*   true: The scheduler is preinstalled. When you create or add a node, you do not need to install the scheduler.</p>
     * <p>*   false: The scheduler is not preinstalled. When you create or add a cluster, you must install the scheduler.</p>
     */
    @NameInMap("SchedulerPreInstall")
    public Boolean schedulerPreInstall;

    /**
     * <p>You can select an existing security group by its ID.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**If you specify this parameter, you cannot specify the **SecurityGroupName`  parameter. `</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>If you do not use an existing security group, set the parameter to the name of a new security group. A default policy is applied to the new security group.</p>
     * <br>
     * <p>> If you specify this parameter, you cannot specify the `SecurityGroupId` parameter.</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    /**
     * <p>The ID of the vSwitch to which the instance connects to.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the file system. NAS file systems cannot be automatically created.</p>
     */
    @NameInMap("VolumeId")
    public String volumeId;

    /**
     * <p>The mount target of the NAS file system. The mount target is of the VPC type. Mount targets cannot be automatically created for NAS file systems.</p>
     */
    @NameInMap("VolumeMountpoint")
    public String volumeMountpoint;

    /**
     * <p>The type of the protocol that is used by the NAS file system. Only NFS is supported.</p>
     */
    @NameInMap("VolumeProtocol")
    public String volumeProtocol;

    /**
     * <p>The type of the file system. Only NAS file systems are supported.</p>
     */
    @NameInMap("VolumeType")
    public String volumeType;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the E-HPC cluster belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The parameter that is used to connect to the Windows AD server.</p>
     */
    @NameInMap("WinAdPar")
    public CreateHybridClusterRequestWinAdPar winAdPar;

    /**
     * <p>The ID of the zone.</p>
     */
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

    public CreateHybridClusterRequest setHybridClusterOpMode(String hybridClusterOpMode) {
        this.hybridClusterOpMode = hybridClusterOpMode;
        return this;
    }
    public String getHybridClusterOpMode() {
        return this.hybridClusterOpMode;
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

    public CreateHybridClusterRequest setOpenldapPar(CreateHybridClusterRequestOpenldapPar openldapPar) {
        this.openldapPar = openldapPar;
        return this;
    }
    public CreateHybridClusterRequestOpenldapPar getOpenldapPar() {
        return this.openldapPar;
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

    public CreateHybridClusterRequest setPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }
    public String getPlugin() {
        return this.plugin;
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

    public CreateHybridClusterRequest setWinAdPar(CreateHybridClusterRequestWinAdPar winAdPar) {
        this.winAdPar = winAdPar;
        return this;
    }
    public CreateHybridClusterRequestWinAdPar getWinAdPar() {
        return this.winAdPar;
    }

    public CreateHybridClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateHybridClusterRequestEcsOrderCompute extends TeaModel {
        /**
         * <p>The instance type of the compute nodes.</p>
         */
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

    public static class CreateHybridClusterRequestEcsOrderManager extends TeaModel {
        /**
         * <p>The instance type of the management node. Only Proxy Mode is supported.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static CreateHybridClusterRequestEcsOrderManager build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridClusterRequestEcsOrderManager self = new CreateHybridClusterRequestEcsOrderManager();
            return TeaModel.build(map, self);
        }

        public CreateHybridClusterRequestEcsOrderManager setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class CreateHybridClusterRequestEcsOrder extends TeaModel {
        @NameInMap("Compute")
        public CreateHybridClusterRequestEcsOrderCompute compute;

        @NameInMap("Manager")
        public CreateHybridClusterRequestEcsOrderManager manager;

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

        public CreateHybridClusterRequestEcsOrder setManager(CreateHybridClusterRequestEcsOrderManager manager) {
            this.manager = manager;
            return this;
        }
        public CreateHybridClusterRequestEcsOrderManager getManager() {
            return this.manager;
        }

    }

    public static class CreateHybridClusterRequestApplication extends TeaModel {
        /**
         * <p>The tag of the software.</p>
         */
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
        /**
         * <p>The service type of the domain account to which the on-premises node in the cluster belongs. Valid values:</p>
         * <br>
         * <p>*   nis</p>
         * <p>*   ldap</p>
         * <br>
         * <p>Default value: nis.</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The directory of the on-premises node in the cluster.</p>
         */
        @NameInMap("Dir")
        public String dir;

        /**
         * <p>The hostname of the on-premises node in the cluster.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The IP address of the on-premises node in the cluster.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The role of the on-premises node in the cluster. Valid values:</p>
         * <br>
         * <p>*   Manager: management node</p>
         * <p>*   Login: logon node</p>
         * <p>*   Compute: compute node</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The scheduler type of the on-premises node in the cluster. Valid values:</p>
         * <br>
         * <p>*   pbs</p>
         * <p>*   slurm</p>
         * <p>*   opengridscheduler</p>
         * <p>*   deadline</p>
         * <br>
         * <p>Default value: pbs.</p>
         */
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

        public CreateHybridClusterRequestNodes setDir(String dir) {
            this.dir = dir;
            return this;
        }
        public String getDir() {
            return this.dir;
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

    public static class CreateHybridClusterRequestOpenldapPar extends TeaModel {
        /**
         * <p>The BaseDN of the LDAP server.</p>
         */
        @NameInMap("BaseDn")
        public String baseDn;

        /**
         * <p>The home directory of the Linux server.</p>
         */
        @NameInMap("FallbackHomeDir")
        public String fallbackHomeDir;

        /**
         * <p>The IP address of the LDAP server.</p>
         */
        @NameInMap("LdapServerIp")
        public String ldapServerIp;

        public static CreateHybridClusterRequestOpenldapPar build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridClusterRequestOpenldapPar self = new CreateHybridClusterRequestOpenldapPar();
            return TeaModel.build(map, self);
        }

        public CreateHybridClusterRequestOpenldapPar setBaseDn(String baseDn) {
            this.baseDn = baseDn;
            return this;
        }
        public String getBaseDn() {
            return this.baseDn;
        }

        public CreateHybridClusterRequestOpenldapPar setFallbackHomeDir(String fallbackHomeDir) {
            this.fallbackHomeDir = fallbackHomeDir;
            return this;
        }
        public String getFallbackHomeDir() {
            return this.fallbackHomeDir;
        }

        public CreateHybridClusterRequestOpenldapPar setLdapServerIp(String ldapServerIp) {
            this.ldapServerIp = ldapServerIp;
            return this;
        }
        public String getLdapServerIp() {
            return this.ldapServerIp;
        }

    }

    public static class CreateHybridClusterRequestPostInstallScript extends TeaModel {
        /**
         * <p>The parameter that is used to run the script after the cluster is created.</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The full path of the post-installation script.</p>
         */
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

    public static class CreateHybridClusterRequestWinAdPar extends TeaModel {
        /**
         * <p>The name of the AD domain.</p>
         */
        @NameInMap("AdDc")
        public String adDc;

        /**
         * <p>The IP address of the AD domain.</p>
         */
        @NameInMap("AdIp")
        public String adIp;

        /**
         * <p>The AD user.</p>
         */
        @NameInMap("AdUser")
        public String adUser;

        /**
         * <p>The password of the AD user.</p>
         */
        @NameInMap("AdUserPasswd")
        public String adUserPasswd;

        public static CreateHybridClusterRequestWinAdPar build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridClusterRequestWinAdPar self = new CreateHybridClusterRequestWinAdPar();
            return TeaModel.build(map, self);
        }

        public CreateHybridClusterRequestWinAdPar setAdDc(String adDc) {
            this.adDc = adDc;
            return this;
        }
        public String getAdDc() {
            return this.adDc;
        }

        public CreateHybridClusterRequestWinAdPar setAdIp(String adIp) {
            this.adIp = adIp;
            return this;
        }
        public String getAdIp() {
            return this.adIp;
        }

        public CreateHybridClusterRequestWinAdPar setAdUser(String adUser) {
            this.adUser = adUser;
            return this;
        }
        public String getAdUser() {
            return this.adUser;
        }

        public CreateHybridClusterRequestWinAdPar setAdUserPasswd(String adUserPasswd) {
            this.adUserPasswd = adUserPasswd;
            return this;
        }
        public String getAdUserPasswd() {
            return this.adUserPasswd;
        }

    }

}
