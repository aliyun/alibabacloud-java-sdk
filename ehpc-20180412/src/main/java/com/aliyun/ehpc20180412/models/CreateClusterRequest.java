// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("EcsOrder")
    public CreateClusterRequestEcsOrder ecsOrder;

    /**
     * <p>The domain name of the on-premises E-HPC cluster.</p>
     * <br>
     * <p>This parameter takes effect only when the AccoutType parameter is set to Idap.</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AddOns")
    public java.util.List<CreateClusterRequestAddOns> addOns;

    /**
     * <p>The type of the nodes to which the additional file system is attached.</p>
     * <br>
     * <p>Valid values of N in AdditionalVolumes.N.Roles: 1 to 10</p>
     * <br>
     * <p>Valid values of N in Roles.N.Name: 0 to 8</p>
     */
    @NameInMap("AdditionalVolumes")
    public java.util.List<CreateClusterRequestAdditionalVolumes> additionalVolumes;

    /**
     * <p>The queue of the nodes to which the additional file system is attached.</p>
     * <br>
     * <p>Valid values of N: 1 to 10</p>
     */
    @NameInMap("Application")
    public java.util.List<CreateClusterRequestApplication> application;

    /**
     * <p>The auto-renewal period of the subscription compute nodes. The parameter takes effect when AutoRenew is set to true.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The URL of the job files that are uploaded to an Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>Specifies whether the logon node uses an elastic IP address (EIP). Default value: false</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The operating system tag of the image.</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The tag of the software.</p>
     * <br>
     * <p>Valid values of N: 0 to 100</p>
     * <br>
     * <p>You can call the [ListSoftwares](~~87216~~) operation to query the tag of the software.</p>
     */
    @NameInMap("ClusterVersion")
    public String clusterVersion;

    /**
     * <p>The duration of the subscription. The unit of the duration is specified by the `PeriodUnit` parameter.</p>
     * <br>
     * <p>*   If you set PriceUnit to Year, the valid values of the Period parameter are 1, 2, and 3.</p>
     * <p>*   If you set PriceUnit to Month, the valid values of the Period parameter are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</p>
     * <p>*   If you set PriceUnit to Hour, the valid value of the Period parameter is 1.</p>
     * <br>
     * <p>Default value: 1</p>
     */
    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    /**
     * <p>Specifies whether the compute nodes support hyper-threading. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: true</p>
     */
    @NameInMap("ComputeSpotPriceLimit")
    public String computeSpotPriceLimit;

    /**
     * <p>The maximum hourly price of the compute nodes. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.</p>
     */
    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    /**
     * <p>Specifies whether to enable the high availability feature. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false</p>
     * <br>
     * <p>>  If high availability is enabled, a primary management node and a secondary management node are used.</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The version of E-HPC. By default, the parameter is set to the latest version number.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the scheduler. Valid values:</p>
     * <br>
     * <p>*   pbs</p>
     * <p>*   slurm</p>
     * <p>*   opengridscheduler</p>
     * <p>*   deadline</p>
     * <br>
     * <p>Default value: pbs</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The root password of the logon node. The password must be 8 to 30 characters in length and contain at least three of the following items: uppercase letters, lowercase letters, digits, and special characters. The password can contain the following special characters:</p>
     * <br>
     * <p>`( ) ~ ! @ # $ % ^ & * - + = | { } [ ] : ; ‘ < > , . ? /`</p>
     * <br>
     * <p>You must specify either Password or KeyPairName. If both are specified, the Password parameter prevails.</p>
     * <br>
     * <p>>  We recommend that you use HTTPS to call the API operation to prevent password leakages.</p>
     */
    @NameInMap("EcsChargeType")
    public String ecsChargeType;

    /**
     * <p>The version of the E-HPC client. By default, the parameter is set to the latest version number.</p>
     * <br>
     * <p>You can call the [ListCurrentClientVersion](~~87223~~) operation to query the latest version of the E-HPC client.</p>
     */
    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    /**
     * <p>The billing method of the nodes. Valid values:</p>
     * <br>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <p>*   PrePaid: subscription</p>
     * <br>
     * <p>If you set the parameter to PrePaid, auto-renewal is enabled by default.</p>
     */
    @NameInMap("HaEnable")
    public Boolean haEnable;

    /**
     * <p>The number of the management nodes. Valid values: 1 and 2.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the image.</p>
     * <br>
     * <p>You can call the [ListImages](~~87213~~) and [ListCustomImages](~~87215~~) operations to query the images that are supported by E-HPC.</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The queue to which the compute nodes are added.</p>
     */
    @NameInMap("InputFileUrl")
    public String inputFileUrl;

    /**
     * <p>The version of the E-HPC cluster.</p>
     * <br>
     * <p>Default value: 1.0</p>
     */
    @NameInMap("IsComputeEss")
    public Boolean isComputeEss;

    /**
     * <p>The type of the system disk. Valid values:</p>
     * <br>
     * <p>*   cloud_efficiency: ultra disk.</p>
     * <p>*   cloud_ssd: standard SSD.</p>
     * <p>*   cloud_essd: enhanced SSD (ESSD).</p>
     * <p>*   cloud: basic disk. Disks of this type are retired.</p>
     * <br>
     * <p>Default value: cloud_ssd</p>
     */
    @NameInMap("JobQueue")
    public String jobQueue;

    /**
     * <p>The type of the image. Valid values:</p>
     * <br>
     * <p>*   system: public image</p>
     * <p>*   self: custom image</p>
     * <p>*   others: shared image</p>
     * <br>
     * <p>Default value: system</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The description of the E-HPC cluster. The description must be 2 to 256 characters in length. It cannot start with http:// or https://.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    /**
     * <p>The type of the domain account service. Valid values:</p>
     * <br>
     * <p>*   nis</p>
     * <p>*   ldap</p>
     * <br>
     * <p>Default value: nis</p>
     */
    @NameInMap("OsTag")
    public String osTag;

    /**
     * <p>The name of the AccessKey pair.</p>
     * <br>
     * <p>>  For more information, see [Create an SSH key pair](~~51793~~).</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <br>
     * <p>*   Year</p>
     * <p>*   Month</p>
     * <p>*   Hour</p>
     * <br>
     * <p>Default value: Month</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>Specifies whether to enable auto-renewal for the subscription. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The value of the tag.</p>
     */
    @NameInMap("Plugin")
    public String plugin;

    /**
     * <p>The name of the Resource Access Management (RAM) role.</p>
     * <br>
     * <p>You can call the [ListRoles](~~28713~~) operation provided by RAM to query the created RAM roles.</p>
     */
    @NameInMap("PostInstallScript")
    public java.util.List<CreateClusterRequestPostInstallScript> postInstallScript;

    @NameInMap("RamNodeTypes")
    public java.util.List<String> ramNodeTypes;

    /**
     * <p>The ID of the task.</p>
     * <br>
     * <p>>  CreateCluster is an asynchronous API operation. If a request succeeds, a response is immediately generated before nodes are created. You can call the [ListTasks](~~268225~~) operation to query the result of the task.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The mode in which the E-HPC cluster is deployed. Valid values:</p>
     * <br>
     * <p>*   Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</p>
     * <p>*   Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</p>
     * <p>*   Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</p>
     * <br>
     * <p>Default value: Standard</p>
     */
    @NameInMap("RemoteDirectory")
    public String remoteDirectory;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>You can call the [ListResourceGroups](~~158855~~) operation to obtain the ID of the resource group.</p>
     */
    @NameInMap("RemoteVisEnable")
    public String remoteVisEnable;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence of a request?](~~25693~~)</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The bidding method of the compute nodes. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The compute nodes are pay-as-you-go instances.</p>
     * <p>*   SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</p>
     * <br>
     * <p>Default value: NoSpot</p>
     */
    @NameInMap("SccClusterId")
    public String sccClusterId;

    /**
     * <p>The ID of the security group to which the E-HPC cluster belongs.</p>
     * <br>
     * <p>You can call the [DescribeSecurityGroups](~~25556~~) operation to query available security groups in the current region.</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <p>If you do not use an existing security group, set the parameter to the name of a new security group. A default policy is applied to the new security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the E-HPC cluster belongs.</p>
     * <br>
     * <p>You can call the [DescribeVpcs](~~35739~~) operation to query available VPCs.</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    /**
     * <p>Specifies whether to enable auto scaling. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    /**
     * <p>Specifies whether to enable Virtual Network Computing (VNC). Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The size of the system disk. Unit: GB.</p>
     * <br>
     * <p>Valid values: 40 to 500</p>
     * <br>
     * <p>Default value: 40</p>
     */
    @NameInMap("SystemDiskType")
    public String systemDiskType;

    @NameInMap("Tag")
    public java.util.List<CreateClusterRequestTag> tag;

    /**
     * <p>The type of the shared storage. Set the value to `nas`, which indicates a NAS file system.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The type of the protocol that is used by the file system. Valid values:</p>
     * <br>
     * <p>*   NFS</p>
     * <p>*   SMB</p>
     * <br>
     * <p>Default value: NFS</p>
     */
    @NameInMap("VolumeId")
    public String volumeId;

    /**
     * <p>The remote directory on which the file system is mounted.</p>
     */
    @NameInMap("VolumeMountOption")
    public String volumeMountOption;

    /**
     * <p>The mount options of the NFS file system that you want to mount by running the mount command.</p>
     * <br>
     * <p>For more information, see [Mount an NFS file system on a Linux ECS instance](https://www.alibabacloud.com/help/en/nas/latest/mount-an-nfs-file-system-on-a-linux-ecs-instance#section-jyi-hyd-hbr).</p>
     */
    @NameInMap("VolumeMountpoint")
    public String volumeMountpoint;

    /**
     * <p>The mount target of the file system. Take note of the following information:</p>
     * <br>
     * <p>*   If you do not specify the VolumeId parameter, you can leave the VolumeMountpoint parameter empty. A mount target is created by default.</p>
     * <p>*   If you specify the VolumeId parameter, the VolumeMountpoint parameter is required. You can call the [ListFileSystemWithMountTargets](~~204364~~) operation to query available mount targets.</p>
     */
    @NameInMap("VolumeProtocol")
    public String volumeProtocol;

    /**
     * <p>The ID of the file system. If you leave the parameter empty, a Performance NAS file system is created by default.</p>
     * <br>
     * <p>You can call the [ListFileSystemWithMountTargets](~~204364~~) operation to query available mount targets.</p>
     */
    @NameInMap("VolumeType")
    public String volumeType;

    /**
     * <p>The ID of the vSwitch. E-HPC supports only VPC networks.</p>
     * <br>
     * <p>You can call the [DescribeVSwitches](~~35748~~) operation to query available vSwitches.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("WithoutAgent")
    public Boolean withoutAgent;

    /**
     * <p>The performance level of the ESSD that is used as the system disk. Valid values:</p>
     * <br>
     * <p>*   PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</p>
     * <p>*   PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</p>
     * <p>*   PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</p>
     * <p>*   PL3: An ESSD delivers up to 1,000,000 random read/write IOPS.</p>
     * <br>
     * <p>Default value: PL1</p>
     * <br>
     * <p>For more information, see [ESSDs](~~122389~~).</p>
     */
    @NameInMap("WithoutElasticIp")
    public Boolean withoutElasticIp;

    @NameInMap("WithoutNas")
    public Boolean withoutNas;

    /**
     * <p>The name of the E-HPC cluster. The name must be 2 to 64 characters in length.</p>
     */
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

    public CreateClusterRequest setAddOns(java.util.List<CreateClusterRequestAddOns> addOns) {
        this.addOns = addOns;
        return this;
    }
    public java.util.List<CreateClusterRequestAddOns> getAddOns() {
        return this.addOns;
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

    public CreateClusterRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
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

    public CreateClusterRequest setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
        this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
        return this;
    }
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
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

    public CreateClusterRequest setTag(java.util.List<CreateClusterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateClusterRequestTag> getTag() {
        return this.tag;
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

    public CreateClusterRequest setWithoutNas(Boolean withoutNas) {
        this.withoutNas = withoutNas;
        return this;
    }
    public Boolean getWithoutNas() {
        return this.withoutNas;
    }

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateClusterRequestEcsOrderCompute extends TeaModel {
        /**
         * <p>The instance type of the compute nodes.</p>
         * <br>
         * <p>You can call the [ListPreferredEcsTypes](~~188592~~) operation to query the recommended instance types.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The number of the logon nodes. Valid value: 1.</p>
         */
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
        /**
         * <p>The instance type of the logon nodes.</p>
         * <br>
         * <p>You can call the [ListPreferredEcsTypes](~~188592~~) operation to query the recommended instance types.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ID of the Super Computing Cluster (SCC) instance.</p>
         * <br>
         * <p>If you specify the parameter, the SCC instance is moved to a new SCC cluster.</p>
         */
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
        /**
         * <p>The instance type of the management nodes.</p>
         * <br>
         * <p>You can call the [ListPreferredEcsTypes](~~188592~~) operation to query the recommended instance types.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The number of the compute nodes. Valid values: 1 to 99.</p>
         */
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
        public CreateClusterRequestEcsOrderCompute compute;

        @NameInMap("Login")
        public CreateClusterRequestEcsOrderLogin login;

        @NameInMap("Manager")
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

    public static class CreateClusterRequestAddOns extends TeaModel {
        @NameInMap("ConfigFile")
        public String configFile;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DefaultStart")
        public Boolean defaultStart;

        @NameInMap("DeployMode")
        public String deployMode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Port")
        public Float port;

        @NameInMap("Version")
        public String version;

        public static CreateClusterRequestAddOns build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestAddOns self = new CreateClusterRequestAddOns();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestAddOns setConfigFile(String configFile) {
            this.configFile = configFile;
            return this;
        }
        public String getConfigFile() {
            return this.configFile;
        }

        public CreateClusterRequestAddOns setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public CreateClusterRequestAddOns setDefaultStart(Boolean defaultStart) {
            this.defaultStart = defaultStart;
            return this;
        }
        public Boolean getDefaultStart() {
            return this.defaultStart;
        }

        public CreateClusterRequestAddOns setDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }
        public String getDeployMode() {
            return this.deployMode;
        }

        public CreateClusterRequestAddOns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateClusterRequestAddOns setPort(Float port) {
            this.port = port;
            return this;
        }
        public Float getPort() {
            return this.port;
        }

        public CreateClusterRequestAddOns setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateClusterRequestAdditionalVolumesRoles extends TeaModel {
        /**
         * <p>The type of the additional shared storage. Only NAS file systems are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
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
        /**
         * <p>The mount target of the additional file system.</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("JobQueue")
        public String jobQueue;

        /**
         * <p>The URL that is used to download the script after the E-HPC cluster is created.</p>
         * <br>
         * <p>Valid values of N: 0 to 16</p>
         */
        @NameInMap("LocalDirectory")
        public String localDirectory;

        /**
         * <p>Specifies whether not to install the agent.</p>
         * <br>
         * <p>*   true: The agent is not installed.</p>
         * <p>*   false: The agent is installed.</p>
         * <br>
         * <p>Default value: false</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The type of the E-HPC cluster. Set the value to PublicCloud.</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        /**
         * <p>The remote directory on which the additional file system is mounted.</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("Roles")
        public java.util.List<CreateClusterRequestAdditionalVolumesRoles> roles;

        /**
         * <p>The mount options of the additional file system.</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        /**
         * <p>The type of the protocol that is used by the additional file system. Valid values:</p>
         * <br>
         * <p>*   NFS</p>
         * <p>*   SMB</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         * <br>
         * <p>Default value: NFS</p>
         */
        @NameInMap("VolumeMountOption")
        public String volumeMountOption;

        /**
         * <p>The local directory on which the additional file system is mounted.</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

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
        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        /**
         * <p>The parameter that is used to run the script after the E-HPC cluster is created.</p>
         * <br>
         * <p>Valid values of N: 0 to 16</p>
         */
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
        /**
         * <p>The ID of the additional file system.</p>
         * <br>
         * <p>Valid values of N: 1 to 10</p>
         */
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
        /**
         * <p>The node of the RAM role.</p>
         * <br>
         * <p>Valid values of N: 0 to 4</p>
         * <br>
         * <p>*   If the DeployMode parameter is set to Standard, the following values are valid: scheduler, account, login, and compute. Separate multiple values with commas (,).</p>
         * <p>*   If the DeployMode parameter is set to Simple, the following values are valid: manager, login, and compute. Separate multiple values with commas (,).</p>
         * <p>*   If the DeployMode parameter is set to Tiny, the following values are valid: manager and compute.</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The key of the tag.</p>
         */
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

    public static class CreateClusterRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateClusterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterRequestTag self = new CreateClusterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateClusterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
