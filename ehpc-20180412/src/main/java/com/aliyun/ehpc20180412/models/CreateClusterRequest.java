// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    @NameInMap("EcsOrder")
    public CreateClusterRequestEcsOrder ecsOrder;

    /**
     * <p>The type of the domain account service. Valid values:</p>
     * <ul>
     * <li>nis</li>
     * <li>ldap</li>
     * </ul>
     * <p>Default value: nis.</p>
     * 
     * <strong>example:</strong>
     * <p>nis</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The custom component service.</p>
     */
    @NameInMap("AddOns")
    public java.util.List<CreateClusterRequestAddOns> addOns;

    /**
     * <p>The information of the NAS file system.</p>
     */
    @NameInMap("AdditionalVolumes")
    public java.util.List<CreateClusterRequestAdditionalVolumes> additionalVolumes;

    /**
     * <p>The application information.</p>
     */
    @NameInMap("Application")
    public java.util.List<CreateClusterRequestApplication> application;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal period of the subscription compute nodes. The parameter takes effect when AutoRenew is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but make sure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The version of the E-HPC client. By default, the parameter is set to the latest version number.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87223.html">ListCurrentClientVersion</a> operation to query the latest version of the E-HPC client.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.64</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    /**
     * <p>The version of the E-HPC cluster.</p>
     * <p>Default value: 1.0.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("ClusterVersion")
    public String clusterVersion;

    /**
     * <p>Specifies whether to enable hyper-threading for the compute node. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ComputeEnableHt")
    public Boolean computeEnableHt;

    /**
     * <p>The maximum hourly price of the compute nodes. A maximum of three decimal places can be used in the value of the parameter. The parameter is valid only when the ComputeSpotStrategy parameter is set to SpotWithPriceLimit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.034</p>
     */
    @NameInMap("ComputeSpotPriceLimit")
    public String computeSpotPriceLimit;

    /**
     * <p>The bidding method of the compute nodes. Valid values:</p>
     * <ul>
     * <li>NoSpot: The compute nodes are pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The compute nodes are preemptible instances that have a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The compute nodes are preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    /**
     * <p>The mode in which the E-HPC cluster is deployed. Valid values:</p>
     * <ul>
     * <li>Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</li>
     * <li>Simple: A management node, which consists of an account node and a scheduling node, is deployed, while a logon node and multiple compute nodes are separately deployed.</li>
     * <li>Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</li>
     * </ul>
     * <p>Default value: Standard.</p>
     * 
     * <strong>example:</strong>
     * <p>Simple</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>The ID of the deployment set in which to deploy the instance. You can obtain the deployment set ID by calling the <a href="https://help.aliyun.com/document_detail/91313.html">DescribeDeploymentSets</a> operation. Only the deployment sets that use low latency policy are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-bp1frxuzdg87zh4pzq****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The description of the E-HPC cluster. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TestDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The domain name of the on-premises E-HPC cluster.</p>
     * <p>This parameter takes effect only when the AccountType parameter is set to Idap.</p>
     * 
     * <strong>example:</strong>
     * <p>ldap</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The billing method of the nodes. Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go.</li>
     * <li>PrePaid: subscription.</li>
     * </ul>
     * <p>If you set the parameter to PrePaid, auto-renewal is enabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("EcsChargeType")
    public String ecsChargeType;

    /**
     * <p>The version of E-HPC. By default, the parameter is set to the latest version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    /**
     * <p>Specifies whether to enable the high availability feature. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If high availability is enabled, a primary management node and a secondary management node are used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HaEnable")
    public Boolean haEnable;

    /**
     * <p>The image IDs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> and <a href="https://help.aliyun.com/document_detail/87215.html">ListCustomImages</a> operations to query the images that are supported by E-HPC.</p>
     * 
     * <strong>example:</strong>
     * <p>centos_7_02_64_20G_alibase_20170818****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the image. Valid values:</p>
     * <ul>
     * <li>system: public image</li>
     * <li>self: custom image</li>
     * <li>others: shared image</li>
     * </ul>
     * <p>Default value: system.</p>
     * 
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The URL of the job file that is uploaded to an Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("InputFileUrl")
    public String inputFileUrl;

    /**
     * <p>Specifies whether to enable auto scaling. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsComputeEss")
    public Boolean isComputeEss;

    /**
     * <p>The queue to which the compute nodes are added.</p>
     * 
     * <strong>example:</strong>
     * <p>workq</p>
     */
    @NameInMap("JobQueue")
    public String jobQueue;

    /**
     * <p>The name of the key pair.</p>
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/51793.html">Create an SSH key pair</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The name of the E-HPC cluster. The name must be 2 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The communication model of the ENI. Valid values:</p>
     * <ul>
     * <li>Standard: The TCP communication mode is used.</li>
     * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with the Elastic RDMA Interface (ERI) enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    /**
     * <p>The operating system tag of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS_7.2_64</p>
     */
    @NameInMap("OsTag")
    public String osTag;

    /**
     * <p>The root password of the logon node. The password must be 8 to 30 characters in length and contain at least three of the following items: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
     * <p><code>( ) ~ ! @ # $ % ^ &amp; * - + = | { } [ ] : ; ‘ &lt; &gt; , . ? /</code></p>
     * <p>You must specify either Password or KeyPairName. If both are specified, the Password parameter prevails.</p>
     * <blockquote>
     * <p>We recommend that you use HTTPS to call the API operation to prevent password leakage.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The duration of the subscription. The unit of the duration is specified by the <code>PeriodUnit</code> parameter.</p>
     * <ul>
     * <li>Valid values if PriceUnit is set to Year: 1, 2, and 3.</li>
     * <li>Valid values if PriceUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
     * <li>Valid value if PriceUnit is set to Hour: 1.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li>Year</li>
     * <li>Month</li>
     * <li>Hour</li>
     * </ul>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The mode configurations of the plug-in. This parameter takes effect only when the SchedulerType parameter is set to custom.</p>
     * <p>The value must be a JSON string. The parameter contains the following parameters: pluginMod, pluginLocalPath, and pluginOssPath.</p>
     * <ul>
     * <li><p>pluginMod: the plug-in mode. The following modes are supported:</p>
     * <ul>
     * <li>oss: The plug-in is downloaded and decompressed from OSS to a local path that is specified by the pluginLocalPath parameter.</li>
     * <li>image: By default, the plug-in is stored in a pre-defined local path that is specified by the pluginLocalPath parameter.</li>
     * </ul>
     * </li>
     * <li><p>pluginLocalPath: the local path where the plug-in is stored. We recommend that you select a shared directory in oss mode and a non-shared directory in image mode.</p>
     * </li>
     * <li><p>pluginOssPath: the remote path where the plug-in is stored in OSS. This parameter takes effect only when the pluginMod parameter is set to oss.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;pluginMod&quot;: &quot;oss&quot;,&quot;pluginLocalPath&quot;: &quot;/opt/plugin&quot;,&quot;pluginOssPath&quot;: &quot;<a href="https://bucket.oss-cn-hangzhou.aliyuncs.com/plugin/plugin.tgz%22%7D">https://bucket.oss-cn-hangzhou.aliyuncs.com/plugin/plugin.tgz&quot;}</a></p>
     */
    @NameInMap("Plugin")
    public String plugin;

    /**
     * <p>The information of the post-installation script.</p>
     */
    @NameInMap("PostInstallScript")
    public java.util.List<CreateClusterRequestPostInstallScript> postInstallScript;

    /**
     * <p>The node of the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("RamNodeTypes")
    public java.util.List<String> ramNodeTypes;

    /**
     * <p>The name of the Resource Access Management (RAM) role.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> operation provided by RAM to query the instance RAM roles that you created.</p>
     * 
     * <strong>example:</strong>
     * <p>testRamRoleName</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The remote directory to which the NAS file system is mounted.</p>
     * 
     * <strong>example:</strong>
     * <p>NasMountpoint:/RemoteDirectory</p>
     */
    @NameInMap("RemoteDirectory")
    public String remoteDirectory;

    /**
     * <p>Specifies whether to enable Virtual Network Computing (VNC). Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RemoteVisEnable")
    public String remoteVisEnable;

    /**
     * <p>The resource group ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to obtain the ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Super Computing Cluster (SCC) instance ID.</p>
     * <p>If you specify the parameter, the SCC instance is moved to a new SCC cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>00b648b****</p>
     */
    @NameInMap("SccClusterId")
    public String sccClusterId;

    /**
     * <p>The type of the scheduler. Valid values:</p>
     * <ul>
     * <li>pbs</li>
     * <li>slurm</li>
     * <li>opengridscheduler</li>
     * <li>deadline</li>
     * </ul>
     * <p>Default value: pbs.</p>
     * 
     * <strong>example:</strong>
     * <p>pbs</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <p>The ID of the security group to which the E-HPC cluster belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/25556.html">DescribeSecurityGroups</a> operation to query available security groups in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp13n61xsydodfyg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>If you do not use an existing security group, set the parameter to the name of a new security group. A default policy is applied to the new security group.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-SecurityGroup</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    /**
     * <p>The performance level of the ESSD to be used as the system disk. Default value: PL1. Valid values:</p>
     * <ul>
     * <li>PL0: An ESSD can deliver up to 10,000 random read/write IOPS.</li>
     * <li>PL1: An ESSD can deliver up to 50,000 random read/write IOPS.</li>
     * <li>PL2: An ESSD can deliver up to 100,000 random read/write IOPS.</li>
     * <li>PL3: An ESSD delivers up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * <p>Default value: PL1.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("SystemDiskLevel")
    public String systemDiskLevel;

    /**
     * <p>The system disk size. Unit: GB.</p>
     * <p>Valid values: 40 to 500.</p>
     * <p>Default value: 40.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The type of the system disk. Valid values:</p>
     * <ul>
     * <li>cloud_efficiency: ultra disk</li>
     * <li>cloud_ssd: standard SSD</li>
     * <li>cloud_essd: enhanced SSD (ESSD)</li>
     * <li>cloud: basic disk. Disks of this type are retired.</li>
     * </ul>
     * <p>Default value: cloud_ssd.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("SystemDiskType")
    public String systemDiskType;

    /**
     * <p>The array of the tags.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateClusterRequestTag> tag;

    /**
     * <p>The vSwitch ID. E-HPC supports only VPC networks.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query available vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1lfcjbfb099rrjn****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the NAS file system. If you leave the parameter empty, a Performance NAS file system is created by default.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204364.html">ListFileSystemWithMountTargets</a> operation to query available mount targets.</p>
     * 
     * <strong>example:</strong>
     * <p>008b64****</p>
     */
    @NameInMap("VolumeId")
    public String volumeId;

    /**
     * <p>The mount options of the NFS file system that you want to mount by running the mount command.</p>
     * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/nas/latest/mount-an-nfs-file-system-on-a-linux-ecs-instance#section-jyi-hyd-hbr">Mount an NFS file system on a Linux ECS instance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>-t nfs -o vers=4</p>
     */
    @NameInMap("VolumeMountOption")
    public String volumeMountOption;

    /**
     * <p>The mount target of the NAS file system. The mount target is of the VPC type. Take note of the following information:</p>
     * <ul>
     * <li>If the VolumeId parameter is not specified, you can leave the VolumeMountpoint parameter empty. In this case, a mount target is created by default.</li>
     * <li>When the VolumeId parameter is specified, the VolumeMountpoint parameter is required. You can call the <a href="https://help.aliyun.com/document_detail/204364.html">ListFileSystemWithMountTargets</a> operation to query available mount targets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>008b648bcb-s****.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("VolumeMountpoint")
    public String volumeMountpoint;

    /**
     * <p>The type of the protocol that is used by the NAS file system. Valid values:</p>
     * <ul>
     * <li>NFS</li>
     * <li>SMB</li>
     * </ul>
     * <p>Default value: NFS.</p>
     * 
     * <strong>example:</strong>
     * <p>NFS</p>
     */
    @NameInMap("VolumeProtocol")
    public String volumeProtocol;

    /**
     * <p>The type of the shared storage. Set the value to <code>nas</code>, which indicates NAS file system.</p>
     * 
     * <strong>example:</strong>
     * <p>nas</p>
     */
    @NameInMap("VolumeType")
    public String volumeType;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the E-HPC cluster belongs.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query available VPCs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-b3f3edefefeep0760yju****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Specifies whether not to install the agent.</p>
     * <ul>
     * <li>true: does not install the agent.</li>
     * <li>false: installs the agent.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithoutAgent")
    public Boolean withoutAgent;

    /**
     * <p>Specifies whether the logon node uses an elastic IP address (EIP). Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithoutElasticIp")
    public Boolean withoutElasticIp;

    /**
     * <p>Indicates whether to use NAS as a shared storage. Valid values:</p>
     * <ul>
     * <li>true: does not use NAS.</li>
     * <li>false: use NAS.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithoutNas")
    public Boolean withoutNas;

    /**
     * <p>The ID of the zone in which the resource resides.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/188593.html">ListRegions</a> and <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operations to query the IDs of the zones where E-HPC is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
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
         * <p>The number of compute nodes in the cluster. Valid values: 0 to 99.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the compute nodes.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188592.html">ListPreferredEcsTypes</a> operation to query the recommended instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
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
         * <p>The number of the logon nodes. Valid value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the logon nodes.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188592.html">ListPreferredEcsTypes</a> operation to query the recommended instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
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
         * <p>The number of the management nodes. Valid values: 1 and 2.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The instance type of the management nodes.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/188592.html">ListPreferredEcsTypes</a> operation to query the recommended instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.n1.tiny</p>
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
        /**
         * <p>The path to the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/addon/cromwell/cromwell.conf</p>
         */
        @NameInMap("ConfigFile")
        public String configFile;

        /**
         * <p>The type of the database engine. Valid values: Mysql, and null.</p>
         * 
         * <strong>example:</strong>
         * <p>Mysql</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>Indicates whether to auto-start the custom component. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultStart")
        public Boolean defaultStart;

        /**
         * <p>The deployment mode. Valid values: local and ecs.</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("DeployMode")
        public String deployMode;

        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>cromwell</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The access port of the custom component.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Port")
        public Float port;

        /**
         * <p>The version number of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
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
         * <p>The type of the nodes to which the NAS file system is attached.</p>
         * <p>Valid values of N in AdditionalVolumes.N.Roles: 1 to 10</p>
         * <p>Valid values of N in Roles.N.Name: 0 to 8.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Compute&quot;]</p>
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
         * <p>The queue of the nodes to which the NAS file system is attached.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("JobQueue")
        public String jobQueue;

        /**
         * <p>The local directory on which the NAS file system is mounted.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>/ff</p>
         */
        @NameInMap("LocalDirectory")
        public String localDirectory;

        /**
         * <p>The type of the E-HPC cluster. Set the value to PublicCloud.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>PublicCloud</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The remote directory to which the NAS file system is mounted.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("RemoteDirectory")
        public String remoteDirectory;

        /**
         * <p>The node information to which the NAS file system is attached.</p>
         */
        @NameInMap("Roles")
        public java.util.List<CreateClusterRequestAdditionalVolumesRoles> roles;

        /**
         * <p>The ID of the NAS file system.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>extreme-00b88****</p>
         */
        @NameInMap("VolumeId")
        public String volumeId;

        /**
         * <p>The mount options of the NAS file system.</p>
         * <p>You can specify 1 to 10 vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>-t nfs -o vers=4.0</p>
         */
        @NameInMap("VolumeMountOption")
        public String volumeMountOption;

        /**
         * <p>The mount target of the NAS file system.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>0088****-sihc.cn-hangzhou.extreme.nas.aliyuncs.com</p>
         */
        @NameInMap("VolumeMountpoint")
        public String volumeMountpoint;

        /**
         * <p>The type of the protocol that is used by the NAS file system. Valid value:</p>
         * <ul>
         * <li>NFS</li>
         * <li>SMB</li>
         * </ul>
         * <p>Valid values of N: 1 to 10.</p>
         * <p>Default value: NFS.</p>
         * 
         * <strong>example:</strong>
         * <p>NFS</p>
         */
        @NameInMap("VolumeProtocol")
        public String volumeProtocol;

        /**
         * <p>The type of the additional shared storage. Only NAS file systems are supported.</p>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>nas</p>
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
         * <p>The tag of the software.</p>
         * <p>Valid values of N: 0 to 100.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87216.html">ListSoftwares</a> operation to query the tag of the software.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenMPI_11.1</p>
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
         * <p>The parameter that is used to run the script after the cluster is created.</p>
         * <p>Valid values of N: 0 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>bashfile.sh</p>
         */
        @NameInMap("Args")
        public String args;

        /**
         * <p>The URL that is used to download the script after the E-HPC cluster is created.</p>
         * <p>Valid values of N: 0 to 16</p>
         * 
         * <strong>example:</strong>
         * <p>/opt/job.sh</p>
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
