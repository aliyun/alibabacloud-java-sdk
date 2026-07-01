// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public CreateLaunchTemplateVersionRequestSystemDisk systemDisk;

    /**
     * <p>The automatic release time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <ul>
     * <li><p>If the value of seconds (<code>ss</code>) is not <code>00</code>, the time is automatically rounded to the start of the current minute (<code>mm</code>).</p>
     * </li>
     * <li><p>The earliest release time is 30 minutes after the current time.</p>
     * </li>
     * <li><p>The latest release time cannot be more than three years from the current time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2018-01-01T12:05:00Z</p>
     */
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>. Valid values:</p>
     * <ul>
     * <li>true: enables auto-renewal.</li>
     * <li>false: does not enable auto-renewal.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period. Valid values: </p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>If PeriodUnit is set to Week: 1, 2, and 3.</li>
     * <li>If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;If PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The running mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li>Standard: standard mode. For more information, see the performance constrained mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * <li>Unlimited: unlimited mode. For more information, see the unlimited mode section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The list of data disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateLaunchTemplateVersionRequestDataDisk> dataDisk;

    /**
     * <p>The release protection attribute of the instance. Specifies whether the instance can be released from the console or by calling <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a>. Valid values:</p>
     * <ul>
     * <li><p>true: enables release protection.</p>
     * </li>
     * <li><p>false: disables release protection.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This attribute is applicable only to pay-as-you-go instances. It can only restrict manual release operations and does not take effect on system-initiated release operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The ID of the deployment set.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-bp1brhwhoqinyjd6****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The description of the instance. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the operating system configuration of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableVmOsConfig")
    public Boolean enableVmOsConfig;

    /**
     * <p>The hostname of the Elastic Compute Service (ECS) server.</p>
     * <ul>
     * <li>The hostname cannot start or end with a period (.) or hyphen (-), and cannot contain consecutive periods or hyphens.</li>
     * <li>Windows instances: The hostname must be 2 to 15 characters in length and cannot contain periods (.) or consist entirely of digits. It can contain letters, digits, and hyphens (-).</li>
     * <li>Other instances (such as Linux): The hostname must be 2 to 64 characters in length. It can contain multiple periods (.), with each segment between periods allowing letters, digits, and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testHostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
     * <ul>
     * <li>enabled: enables the access channel.</li>
     * <li>disabled: disables the access channel.</li>
     * </ul>
     * <p>Default value: enabled.</p>
     * <blockquote>
     * <p>For more information about instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Overview of ECS instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether to forcefully use the security-hardened mode (IMDSv2) to access instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: does not forcefully use the security-hardened mode.</li>
     * <li>required: forcefully uses the security-hardened mode. After you set this value, the normal mode cannot be used to access instance metadata.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes for accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Overview of ECS instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The ID of the image used to create the instance. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources.</p>
     * 
     * <strong>example:</strong>
     * <p>win2008r2_64_ent_sp1_en-us_40G_alibase_20170915.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image-related property information.</p>
     */
    @NameInMap("ImageOptions")
    public CreateLaunchTemplateVersionRequestImageOptions imageOptions;

    /**
     * <p>The source of the image.</p>
     * <blockquote>
     * <p>This parameter will be deprecated. To improve compatibility, use other parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>PrePaid: subscription. If you set this parameter to PrePaid, confirm that your account supports balance payment or credit payment. Otherwise, an <code>InvalidPayMethod</code> fault is returned.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>PrePaid: subscription. If you set this parameter to PrePaid, confirm that your account supports credit payment. Otherwise, an <code>InvalidPayMethod</code> fault is returned.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * <p>&lt;props=&quot;partner&quot;&gt;</p>
     * <ul>
     * <li>PrePaid: subscription. If you set this parameter to PrePaid, confirm that your account supports credit payment. Otherwise, an <code>InvalidPayMethod</code> fault is returned.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters in length and can contain letters, digits, and characters from the Unicode letter category (which includes characters from various languages). The name can contain colons (:), underscores (_), periods (.), and hyphens (-). The default value is the <code>InstanceId</code> of the instance.</p>
     * <p>When you create multiple ECS instances at a time, you can batch configure sequential instance names that contain brackets ([]) and commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-alibabacloud</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>. You can also call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The billing method for outbound Internet bandwidth. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth.</li>
     * <li>PayByTraffic: pay-by-traffic.</li>
     * </ul>
     * <blockquote>
     * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are used as upper limits of bandwidths instead of guaranteed performance specifications. When resource contention occurs, the peak bandwidths may be limited. If you want guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth. Unit: Mbit/s. Valid values:</p>
     * <ul>
     * <li>If the purchased outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</li>
     * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>InternetMaxBandwidthOut</code>. Default value: the value of <code>InternetMaxBandwidthOut</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether the instance is an I/O optimized instance. Valid values:</p>
     * <ul>
     * <li>none: The instance is not I/O optimized.</li>
     * <li>optimized: The instance is I/O optimization enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of IPv6 addresses to randomly generate for the primary ENI. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair.</p>
     * <ul>
     * <li>For Windows instances, this parameter is ignored. Even if you specify this parameter, only the <code>Password</code> content is used.</li>
     * <li>For Linux instances, password-based logon is disabled during initialization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The ID of the launch template. For more information, call <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a>. You must specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to determine the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-m5eiaupmvm2op9d****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The name of the launch template. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>testLaunchTemplateName</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    /**
     * <p>The network interface controller (NIC) information.</p>
     */
    @NameInMap("NetworkInterface")
    public java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> networkInterface;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li>vpc: VPC.</li>
     * <li>classic: classic network. The classic network has been retired. For more information, see <a href="https://help.aliyun.com/document_detail/2833134.html">Retirement notice</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to use the preset password of the image. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>When you use this parameter, the Password parameter must be empty. You must also make sure that the image has a preset password.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription duration of the resource. Unit: months. This parameter takes effect and is required only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. Valid values: </p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Week.</li>
     * <li>Month (default).</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;Month (default).</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The private IP address of the instance.</p>
     * <p>When you specify a private IP address for a VPC-connected ECS instance, the IP address must be from the idle CIDR block of the vSwitch (<code>VSwitchId</code>).</p>
     * 
     * <strong>example:</strong>
     * <p><code>10.1.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the instance RAM role. You can call the RAM API <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query the instance RAM roles that you have created.</p>
     * 
     * <strong>example:</strong>
     * <p>testRamRoleName</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable security hardening for the operating system. Valid values:</p>
     * <ul>
     * <li>Active: enables security hardening. This value is applicable only to public images.</li>
     * <li>Deactive: does not enable security hardening. This value is applicable to all image types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which the instance created by using this version belongs. Instances in the same security group can communicate with each other.</p>
     * <blockquote>
     * <p>You cannot specify both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of one or more security groups to which the instance belongs. The valid values of N depend on the maximum number of security groups to which an instance can belong. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * <blockquote>
     * <p>You cannot specify both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7****</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The security options.</p>
     */
    @NameInMap("SecurityOptions")
    public CreateLaunchTemplateVersionRequestSecurityOptions securityOptions;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values:</p>
     * <ul>
     * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain automatic release the instance.</li>
     * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain automatic release the instance.</li>
     * </ul>
     * <p>Alibaba Cloud sends an ECS system event notification 5 minutes before the instance is released. Spot instances are billed by second. We recommend that you select an appropriate protection period based on the expected task execution duration.</p>
     * <blockquote>
     * <p>This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit or SpotAsPriceGo.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The maximum hourly price of the instance. A maximum of three decimal places are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>0.97</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The preemption policy for the pay-as-you-go instance. This parameter takes effect when <code>InstanceChargeType</code> is set to <code>PostPaid</code>. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is a spot instance with a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is a spot instance for which the market price at the time of purchase is automatically used as the bid price.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The tags of the instances, disks, and primary ENIs created by using this version.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLaunchTemplateVersionRequestTag> tag;

    /**
     * <p>Instance user data of the instance. Instance user data must be encoded in Base64. The raw data can be up to 32 KB in size.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBl****</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the vSwitch. You must specify this parameter when you create a VPC-connected instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The description of the launch template version. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testVersionDescription</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp12433upq1y5scen****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateLaunchTemplateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateVersionRequest self = new CreateLaunchTemplateVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateVersionRequest setSystemDisk(CreateLaunchTemplateVersionRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateLaunchTemplateVersionRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateLaunchTemplateVersionRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public CreateLaunchTemplateVersionRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateLaunchTemplateVersionRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateLaunchTemplateVersionRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public CreateLaunchTemplateVersionRequest setDataDisk(java.util.List<CreateLaunchTemplateVersionRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateLaunchTemplateVersionRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateLaunchTemplateVersionRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateLaunchTemplateVersionRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateLaunchTemplateVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLaunchTemplateVersionRequest setEnableVmOsConfig(Boolean enableVmOsConfig) {
        this.enableVmOsConfig = enableVmOsConfig;
        return this;
    }
    public Boolean getEnableVmOsConfig() {
        return this.enableVmOsConfig;
    }

    public CreateLaunchTemplateVersionRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateLaunchTemplateVersionRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public CreateLaunchTemplateVersionRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public CreateLaunchTemplateVersionRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public CreateLaunchTemplateVersionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateLaunchTemplateVersionRequest setImageOptions(CreateLaunchTemplateVersionRequestImageOptions imageOptions) {
        this.imageOptions = imageOptions;
        return this;
    }
    public CreateLaunchTemplateVersionRequestImageOptions getImageOptions() {
        return this.imageOptions;
    }

    public CreateLaunchTemplateVersionRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public CreateLaunchTemplateVersionRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateLaunchTemplateVersionRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateLaunchTemplateVersionRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateLaunchTemplateVersionRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateLaunchTemplateVersionRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateLaunchTemplateVersionRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateLaunchTemplateVersionRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateLaunchTemplateVersionRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateLaunchTemplateVersionRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateLaunchTemplateVersionRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public CreateLaunchTemplateVersionRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public CreateLaunchTemplateVersionRequest setNetworkInterface(java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }
    public java.util.List<CreateLaunchTemplateVersionRequestNetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    public CreateLaunchTemplateVersionRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateLaunchTemplateVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLaunchTemplateVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLaunchTemplateVersionRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateLaunchTemplateVersionRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateLaunchTemplateVersionRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateLaunchTemplateVersionRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateLaunchTemplateVersionRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateLaunchTemplateVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLaunchTemplateVersionRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLaunchTemplateVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLaunchTemplateVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLaunchTemplateVersionRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateLaunchTemplateVersionRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateLaunchTemplateVersionRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateLaunchTemplateVersionRequest setSecurityOptions(CreateLaunchTemplateVersionRequestSecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }
    public CreateLaunchTemplateVersionRequestSecurityOptions getSecurityOptions() {
        return this.securityOptions;
    }

    public CreateLaunchTemplateVersionRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateLaunchTemplateVersionRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateLaunchTemplateVersionRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateLaunchTemplateVersionRequest setTag(java.util.List<CreateLaunchTemplateVersionRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLaunchTemplateVersionRequestTag> getTag() {
        return this.tag;
    }

    public CreateLaunchTemplateVersionRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateLaunchTemplateVersionRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLaunchTemplateVersionRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public CreateLaunchTemplateVersionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateLaunchTemplateVersionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateLaunchTemplateVersionRequestSystemDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy applied to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp1dgzpaxwc4load****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
         * <ul>
         * <li>true: enables the performance burst feature.</li>
         * <li>false: does not enable the performance burst feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud: basic disk.</li>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_essd: enterprise SSD (ESSD). You can use the <code>SystemDisk.PerformanceLevel</code> parameter to configure the performance level of the disk.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * </ul>
         * <p>For retired instance types that are not I/O optimization instances, the default value is cloud. For other instance types, the default value is cloud_efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the system disk when the instance is released. Valid values:</p>
         * <ul>
         * <li>true: releases the system disk when the instance is released.</li>
         * <li>false: does not release the system disk when the instance is released.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testSystemDiskDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li><p>true: encrypts the system disk.</p>
         * </li>
         * <li><p>false: does not encrypt the system disk.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>System disk encryption is not supported in Zone D of the Hong Kong (China) region or Zone A of the Singapore region when you create an instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("Iops")
        public Integer iops;

        /**
         * <p>The KMS key ID of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD used as the system disk. Configure the performance level based on the following valid values:</p>
         * <ul>
         * <li>PL0 (default): A single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk used as the system disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline Performance}.</p>
         * <p>Baseline Performance = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p>This parameter is available only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned performance of an ESSD AutoPL disk</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>cloud: 20 to 500.</li>
         * <li>Other disk categories: 20 to 2048.</li>
         * </ul>
         * <p>The value of this parameter must be greater than or equal to max{20, ImageSize}.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static CreateLaunchTemplateVersionRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestSystemDisk self = new CreateLaunchTemplateVersionRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateLaunchTemplateVersionRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateLaunchTemplateVersionRequestDataDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy applied to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
         * <ul>
         * <li>true: enables the performance burst feature.</li>
         * <li>false: does not enable the performance burst feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <p>The category of data disk N. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: enterprise SSD.</li>
         * <li>cloud: basic disk.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_regional_disk_auto: regional ESSD.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.<blockquote>
         * <p>The cloud_essd_entry value is supported only when <code>InstanceType</code> is configured as an instance type in the <code>ecs.u1</code> or <code>ecs.e</code> family.</p>
         * </blockquote>
         * </li>
         * <li>elastic_ephemeral_disk_standard: elastic ephemeral disk - Standard.</li>
         * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - Premium Edition.</li>
         * </ul>
         * <p>For I/O optimization instances, the default value is cloud_efficiency. For non-I/O optimization instances, the default value is cloud.
         * Default value details:</p>
         * <ul>
         * <li>When InstanceType is set to a retired instance type that is not I/O optimized, the default parameter value is <code>cloud</code>.</li>
         * <li>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, when the I/O optimized instance type does not support cloud_auto, the default value is cloud_efficiency. Otherwise, the default value is cloud_auto, and the performance burst feature is enabled by default (which incurs additional fees. For details, see <a href="~~368372#p_75k_2hp_7gp~~">Billing examples</a>). For more information, see <a href="https://www.aliyun.com/notice/117844">Change notice</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data disk when the instance is released. Valid values:</p>
         * <ul>
         * <li>true: releases the data disk when the instance is released.</li>
         * <li>false: does not release the data disk when the instance is released.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testDataDiskDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk. The naming conventions for mount points vary based on the number of data disks attached:</p>
         * <ul>
         * <li><p>1 to 25 data disks: /dev/xvd<code>[b-z]</code></p>
         * </li>
         * <li><p>More than 25 data disks: /dev/xvd<code>[aa-zz]</code>. For example, the 26th data disk is named /dev/xvdaa, the 27th data disk is named /dev/xvdab, and so on.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is applicable only to full image (system image) scenarios. You can set this parameter to the mount point of the data disk in the full image and modify the corresponding <code>DataDisk.N.Size</code> and <code>DataDisk.N.Category</code> parameters to change the disk category and size of the data disk in the full image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testDataDiskName</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The KMS key ID for the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD used as a data disk. The value of N must be the same as that in <code>DataDisk.N.Category=cloud_essd</code>. Configure the performance level based on the following valid values:</p>
         * <ul>
         * <li>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1 (default): A single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk used as the system disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline Performance}.</p>
         * <p>Baseline Performance = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p>This parameter is available only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned performance of an ESSD AutoPL disk</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>cloud: 5 to 2000.</li>
         * <li>cloud_efficiency: 20 to 32768.</li>
         * <li>cloud_ssd: 20 to 32768.</li>
         * <li>cloud_essd: The valid value range depends on the value of <code>DataDisk.N.PerformanceLevel</code>.   <ul>
         * <li>PL0: 1 to 32768.</li>
         * <li>PL1: 20 to 32768.</li>
         * <li>PL2: 461 to 32768.</li>
         * <li>PL3: 1261 to 32768.</li>
         * </ul>
         * </li>
         * <li>cloud_auto: 1 to 32,768.</li>
         * <li>cloud_essd_entry: 10 to 32,768.</li>
         * </ul>
         * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by <code>SnapshotId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot used to create data disk N. Valid values of N: 1 to 16. When <code>DataDisk.N.SnapshotId</code> is specified, <code>DataDisk.N.Size</code> is ignored. The actual size of the created disk is the size of the specified snapshot.</p>
         * <p>Snapshots created on or before July 15, 2013 cannot be used. Requests that use such snapshots are rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateLaunchTemplateVersionRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestDataDisk self = new CreateLaunchTemplateVersionRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateLaunchTemplateVersionRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class CreateLaunchTemplateVersionRequestImageOptions extends TeaModel {
        /**
         * <p>Specifies whether instances that use this image support logon with the ecs-user user.
         * Valid values:</p>
         * <ul>
         * <li>true: supported.</li>
         * <li>false: not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LoginAsNonRoot")
        public Boolean loginAsNonRoot;

        public static CreateLaunchTemplateVersionRequestImageOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestImageOptions self = new CreateLaunchTemplateVersionRequestImageOptions();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class CreateLaunchTemplateVersionRequestNetworkInterface extends TeaModel {
        /**
         * <p>Specifies whether to retain the ENI when the instance is released. Valid values:</p>
         * <ul>
         * <li><p>true: does not retain the ENI.</p>
         * </li>
         * <li><p>false: retains the ENI.</p>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p>This parameter takes effect only for secondary ENIs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteOnRelease")
        public Boolean deleteOnRelease;

        /**
         * <p>The description of the secondary network interface controller (NIC). The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>testNetworkInterfaceDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the ENI. Valid values of N: 1 to 2. If you configure one ENI, you can configure either a primary network interface controller (NIC) or a secondary ENI. If you configure two ENIs, you must configure one primary NIC and one secondary ENI.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Primary: primary NIC.</li>
         * <li>Secondary: secondary ENI.</li>
         * </ul>
         * <p>Default value: Secondary.</p>
         * 
         * <strong>example:</strong>
         * <p>Secondary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The name of the secondary network interface controller (NIC). The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>testNetworkInterfaceName</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The communication mode of the primary ENI. Valid values:</p>
         * <ul>
         * <li>Standard: uses the TCP communication mode.</li>
         * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The primary private IP address of the secondary network interface controller (NIC). The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p><code>192.168.**.**</code></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The ID of the security group to which the secondary network interface controller (NIC) belongs. The security group of the secondary NIC must belong to the same VPC as the instance. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
         * <blockquote>
         * <p>You cannot specify both <code>NetworkInterface.N.SecurityGroupId</code> and <code>NetworkInterface.N.SecurityGroupIds.N</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of one or more security groups to which the secondary network interface controller (NIC) belongs. The security groups and the secondary NIC must belong to the same VPC. The valid values of N in <code>SecurityGroupIds.N</code> depend on the quota for the maximum number of security groups to which a secondary NIC can belong. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
         * <blockquote>
         * <p>You cannot specify both <code>NetworkInterface.N.SecurityGroupId</code> and <code>NetworkInterface.N.SecurityGroupIds.N</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The ID of the vSwitch to which the secondary network interface controller (NIC) belongs. The instance and the secondary NIC must be in the same VPC and the same active zone but can belong to different vSwitches. The value of N in <code>NetworkInterface.N</code> cannot be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1s5fnvk4gn2tws0****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static CreateLaunchTemplateVersionRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestNetworkInterface self = new CreateLaunchTemplateVersionRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setDeleteOnRelease(Boolean deleteOnRelease) {
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }
        public Boolean getDeleteOnRelease() {
            return this.deleteOnRelease;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateLaunchTemplateVersionRequestNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class CreateLaunchTemplateVersionRequestSecurityOptions extends TeaModel {
        /**
         * <p>The trusted system mode. Set the value to vTPM.</p>
         * <p>The following instance families support trusted system mode:</p>
         * <ul>
         * <li>g7, c7, and r7.</li>
         * <li>Security-enhanced instance family (g7t, c7t, and r7t).</li>
         * </ul>
         * <p>When you create ECS instances of the preceding instance families, you must configure this parameter. Details:</p>
         * <ul>
         * <li>To use the Alibaba Cloud Trusted System, set this parameter to vTPM. The trusted verification is completed by the Alibaba Cloud Trusted System when the instance starts.</li>
         * <li>If you do not use the Alibaba Cloud Trusted System, you can leave this parameter empty. However, if the ECS instance that you create uses the Enclave-based confidential computing mode (<code>SecurityOptions.ConfidentialComputingMode=Enclave</code>), the trusted system is also enabled for the instance.</li>
         * <li>When you create a trusted ECS instance by invoking an API operation, you can only invoke <code>RunInstances</code>. <code>CreateInstance</code> does not support configuring the <code>SecurityOptions.TrustedSystemMode</code> parameter.<blockquote>
         * <p>If you specify an instance as a trusted instance during creation, you can only use images that support the trusted system when you replace the system disk.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>For more information about the trusted system, see <a href="https://help.aliyun.com/document_detail/201394.html">Overview of trusted features for security-enhanced instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>vTPM</p>
         */
        @NameInMap("TrustedSystemMode")
        public String trustedSystemMode;

        public static CreateLaunchTemplateVersionRequestSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestSecurityOptions self = new CreateLaunchTemplateVersionRequestSecurityOptions();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestSecurityOptions setTrustedSystemMode(String trustedSystemMode) {
            this.trustedSystemMode = trustedSystemMode;
            return this;
        }
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

    }

    public static class CreateLaunchTemplateVersionRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instances, disks, and primary ENIs created by using this version. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instances, disks, and primary ENIs created by using this version. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLaunchTemplateVersionRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateVersionRequestTag self = new CreateLaunchTemplateVersionRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateVersionRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLaunchTemplateVersionRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
