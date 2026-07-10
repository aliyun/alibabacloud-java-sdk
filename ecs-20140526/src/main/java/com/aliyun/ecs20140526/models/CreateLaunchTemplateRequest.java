// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public CreateLaunchTemplateRequestSystemDisk systemDisk;

    /**
     * <p>The automatic release time. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <ul>
     * <li><p>If the value of seconds (<code>ss</code>) is not <code>00</code>, the time is automatically rounded down to the start of the current minute (<code>mm</code>).</p>
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
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>true: enables auto-renewal.</li>
     * <li>false: does not enable auto-renewal.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This parameter takes effect only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>.</p>
     * </blockquote>
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
     * <p>The list of data disk information.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateLaunchTemplateRequestDataDisk> dataDisk;

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
     * <p>This attribute applies only to pay-as-you-go instances. It can only restrict manual release operations and does not affect system-initiated releases.</p>
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
     * <p>testECSDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the operating system configuration of the instance.</p>
     * <blockquote>
     * <p>This parameter will be deprecated. For better compatibility, use other parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableVmOsConfig")
    public Boolean enableVmOsConfig;

    /**
     * <p>The hostname of the Elastic Compute Service server.</p>
     * <ul>
     * <li>The hostname cannot start or end with a period (.) or a hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</li>
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
     * <p>This parameter is not available for use.</p>
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
     * <li>required: forcefully uses the security-hardened mode. After you set this value, instance metadata cannot be accessed in normal mode.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes for
     * <a href="https://help.aliyun.com/document_detail/108460.html">Instance metadata overview</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The image ID. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources.</p>
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
    public CreateLaunchTemplateRequestImageOptions imageOptions;

    /**
     * <p>The source of the image. Valid values:</p>
     * <ul>
     * <li>system: a public image provided by Alibaba Cloud.</li>
     * <li>self: a custom image that you created.</li>
     * <li>others: a shared image from another Alibaba Cloud account.</li>
     * <li>marketplace: an image from &lt;props=&quot;china&quot;&gt;<ph><a href="https://market.aliyun.com/">Alibaba Cloud Marketplace</a></ph>&lt;props=&quot;intl&quot;&gt;<ph><a href="https://marketplace.alibabacloud.com/">Alibaba Cloud Marketplace</a></ph>. You can use Alibaba Cloud Marketplace images directly without subscribing to them first. Check the billing details of the Alibaba Cloud Marketplace image on your own.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription. If you set this parameter to PrePaid, &lt;props=&quot;china&quot;&gt;<ph>confirm that your account supports balance payments and credit payments</ph>&lt;props=&quot;intl&quot;&gt;<ph>confirm that your account supports credit payments</ph>. Otherwise, an <code>InvalidPayMethod</code> error is returned.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters in length and can contain letters, digits, and characters from the Unicode letter category (including Chinese characters). The name can contain colons (:), underscores (_), periods (.), and hyphens (-). The default value is the <code>InstanceId</code> of the instance.</p>
     * <p>When you create multiple ECS instances, you can specify sequential instance names. The names can contain brackets ([]) and commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Specify sequential instance names or hostnames</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-alibabacloud</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>. You can also invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the most recent instance type list.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth.</li>
     * <li>PayByTraffic: pay-by-traffic.</li>
     * </ul>
     * <blockquote>
     * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are used as bandwidth upper limits instead of guaranteed service metrics. When resource contention occurs, the peak bandwidth may be limited. If your workloads require guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
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
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
     * <ul>
     * <li>none: not I/O optimized.</li>
     * <li>optimized: I/O optimized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of randomly generated IPv6 addresses to assign to the primary ENI. Valid values: 1 to 10.</p>
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
     * <p>The name of the launch template. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
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
    public java.util.List<CreateLaunchTemplateRequestNetworkInterface> networkInterface;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li>classic: classic network. This feature has been retired. For more information, see <a href="https://help.aliyun.com/document_detail/2833134.html">Retirement notice</a>.</li>
     * <li>vpc: VPC.</li>
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
     * <p>Specifies whether to use the password preset in the image.</p>
     * <blockquote>
     * <p>When you use this parameter, the Password parameter must be empty. Make sure that the image you use has a password configured.</p>
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
     * <p>The unit of the subscription billable methods duration. Valid values: </p>
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
     * <p>The ID of the resource group to which the instance, block storage, and elastic network interface controller (NIC) belong.</p>
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
     * <p>Deactive</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which the instance belongs. Instances in the same security group can communicate with each other. A security group can contain up to 1,000 instances.</p>
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
     * <p>The IDs of one or more security groups to which the instance belongs. The valid value range of N depends on the maximum number of security groups to which an instance can belong. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
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
    public CreateLaunchTemplateRequestSecurityOptions securityOptions;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values:</p>
     * <ul>
     * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain automatic release the instance.</li>
     * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain automatic release the instance.</li>
     * </ul>
     * <p>Alibaba Cloud sends an ECS system event notification 5 minutes before the instance is released. Spot instances are billed by second. Select an appropriate protection period based on the expected task execution duration.</p>
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
     * <p>The maximum hourly price of the instance. This parameter supports up to three decimal places and takes effect when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
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
     * <p>The tags for instances, disks, and primary ENIs created from this template version.</p>
     * <details>
     * <summary>Scenarios</summary>
     * After you call CreateLaunchTemplate to create a template, the auto-generated default version uses these tags to tag instances, disks, and primary ENIs when you create instances.
     * </details>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLaunchTemplateRequestTag> tag;

    /**
     * <p>The ID of the resource group to which the launch template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("TemplateResourceGroupId")
    public String templateResourceGroupId;

    /**
     * <p>The tag key-value pairs of the launch template itself.</p>
     * <blockquote>
     * <p>Currently, you can create and query tags for launch templates only by using API operations. The console does not support creating or viewing these tags.</p>
     * </blockquote>
     */
    @NameInMap("TemplateTag")
    public java.util.List<CreateLaunchTemplateRequestTemplateTag> templateTag;

    /**
     * <p>The instance user data. The data must be Base64-encoded. The maximum size of the raw data is 32 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The vSwitch ID. This parameter is required when you create a VPC-connected instance.</p>
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
     * <p>The ID of the virtual private cloud (VPC).</p>
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

    public static CreateLaunchTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateRequest self = new CreateLaunchTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateRequest setSystemDisk(CreateLaunchTemplateRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateLaunchTemplateRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateLaunchTemplateRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public CreateLaunchTemplateRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateLaunchTemplateRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateLaunchTemplateRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public CreateLaunchTemplateRequest setDataDisk(java.util.List<CreateLaunchTemplateRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateLaunchTemplateRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateLaunchTemplateRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateLaunchTemplateRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateLaunchTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLaunchTemplateRequest setEnableVmOsConfig(Boolean enableVmOsConfig) {
        this.enableVmOsConfig = enableVmOsConfig;
        return this;
    }
    public Boolean getEnableVmOsConfig() {
        return this.enableVmOsConfig;
    }

    public CreateLaunchTemplateRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateLaunchTemplateRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public CreateLaunchTemplateRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public CreateLaunchTemplateRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public CreateLaunchTemplateRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateLaunchTemplateRequest setImageOptions(CreateLaunchTemplateRequestImageOptions imageOptions) {
        this.imageOptions = imageOptions;
        return this;
    }
    public CreateLaunchTemplateRequestImageOptions getImageOptions() {
        return this.imageOptions;
    }

    public CreateLaunchTemplateRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public CreateLaunchTemplateRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateLaunchTemplateRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateLaunchTemplateRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateLaunchTemplateRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateLaunchTemplateRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateLaunchTemplateRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateLaunchTemplateRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateLaunchTemplateRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateLaunchTemplateRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateLaunchTemplateRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public CreateLaunchTemplateRequest setNetworkInterface(java.util.List<CreateLaunchTemplateRequestNetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }
    public java.util.List<CreateLaunchTemplateRequestNetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    public CreateLaunchTemplateRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateLaunchTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateLaunchTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLaunchTemplateRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateLaunchTemplateRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateLaunchTemplateRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateLaunchTemplateRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateLaunchTemplateRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateLaunchTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLaunchTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLaunchTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateLaunchTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLaunchTemplateRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateLaunchTemplateRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateLaunchTemplateRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateLaunchTemplateRequest setSecurityOptions(CreateLaunchTemplateRequestSecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }
    public CreateLaunchTemplateRequestSecurityOptions getSecurityOptions() {
        return this.securityOptions;
    }

    public CreateLaunchTemplateRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateLaunchTemplateRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateLaunchTemplateRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateLaunchTemplateRequest setTag(java.util.List<CreateLaunchTemplateRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateLaunchTemplateRequestTag> getTag() {
        return this.tag;
    }

    public CreateLaunchTemplateRequest setTemplateResourceGroupId(String templateResourceGroupId) {
        this.templateResourceGroupId = templateResourceGroupId;
        return this;
    }
    public String getTemplateResourceGroupId() {
        return this.templateResourceGroupId;
    }

    public CreateLaunchTemplateRequest setTemplateTag(java.util.List<CreateLaunchTemplateRequestTemplateTag> templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public java.util.List<CreateLaunchTemplateRequestTemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public CreateLaunchTemplateRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateLaunchTemplateRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateLaunchTemplateRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public CreateLaunchTemplateRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateLaunchTemplateRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateLaunchTemplateRequestSystemDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy applied to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-gc7c37d4ylw7mtnk****</p>
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
         * <li>cloud_essd: enterprise SSD (ESSD). You can use the <code>SystemDisk.PerformanceLevel</code> parameter to set the performance level of the disk.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * </ul>
         * <p>For retired instance types that are not I/O optimized, the default value is cloud. Otherwise, the default value is cloud_efficiency.</p>
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
         * <p>The name of the system disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testSystemDiskName</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li>true: encrypts the system disk.</li>
         * <li>false: does not encrypt the system disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>Zone D in Hong Kong (China) and Zone A in Singapore do not support system disk encryption when you create instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
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
         * <p>The performance level of the ESSD used as the system disk. Valid values:</p>
         * <ul>
         * <li>PL0 (default): a single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: a single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: a single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: a single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline Performance}.</p>
         * <p>Baseline Performance = min{1,800 + 50 × Capacity, 50,000}</p>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned performance of an ESSD AutoPL disk</a>.</p>
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

        public static CreateLaunchTemplateRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestSystemDisk self = new CreateLaunchTemplateRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateLaunchTemplateRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateLaunchTemplateRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateRequestSystemDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateLaunchTemplateRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateRequestSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateLaunchTemplateRequestSystemDisk setIops(Integer iops) {
            this.iops = iops;
            return this;
        }
        public Integer getIops() {
            return this.iops;
        }

        public CreateLaunchTemplateRequestSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateLaunchTemplateRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateLaunchTemplateRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateLaunchTemplateRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

    public static class CreateLaunchTemplateRequestDataDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy applied to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-m5e7fa9ute44ssa****</p>
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
         * <p>The cloud_essd_entry value is supported only when <code>InstanceType</code> is set to the <code>ecs.u1</code> or <code>ecs.e</code> instance family.</p>
         * </blockquote>
         * </li>
         * <li>elastic_ephemeral_disk_standard: elastic ephemeral disk - standard.</li>
         * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - Premium Edition.</li>
         * </ul>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
         * Default value description:</p>
         * <ul>
         * <li>If InstanceType is a retired instance type that is not I/O optimized, the default value of this parameter is <code>cloud</code>.</li>
         * <li>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, if the I/O optimized instance type does not support cloud_auto, the default value is cloud_efficiency. Otherwise, the default value is cloud_auto, and the performance burst feature is enabled by default (which incurs additional fees. For details, see <a href="~~368372#p_75k_2hp_7gp~~">Billing examples</a>). For more information, see <a href="https://www.aliyun.com/notice/117844">Change notice</a>.</li>
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
         * <p>The mount point of the data disk. The naming convention varies based on the number of data disks attached:</p>
         * <ul>
         * <li><p>1 to 25 data disks: /dev/xvd<code>[b-z]</code></p>
         * </li>
         * <li><p>More than 25 data disks: /dev/xvd<code>[aa-zz]</code>. For example, the 26th data disk is named /dev/xvdaa, the 27th data disk is named /dev/xvdab, and so on.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is intended only for full image (whole-machine image) scenarios. You can set this parameter to the mount point of a data disk in the full image and modify the corresponding <code>DataDisk.N.Size</code> and <code>DataDisk.N.Category</code> parameters to change the disk category and size of the data disk in the full image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
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
         * <p>The performance level of the ESSD used as a data disk. The value of N must be the same as that in <code>DataDisk.N.Category=cloud_essd</code>. Valid values:</p>
         * <ul>
         * <li>PL0: a single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1 (default): a single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: a single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: a single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline Performance}.</p>
         * <p>Baseline Performance = min{1,800 + 50 × Capacity, 50,000}</p>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned performance of an ESSD AutoPL disk</a>.</p>
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
         * <li>cloud_essd: The valid value range depends on the value of <code>DataDisk.N.PerformanceLevel</code>.<ul>
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
         * <p>The ID of the snapshot used to create data disk N. Valid values of N: 1 to 16. After you specify <code>DataDisk.N.SnapshotId</code>, the <code>DataDisk.N.Size</code> parameter is ignored. The actual size of the created disk is the size of the specified snapshot.</p>
         * <blockquote>
         * <p>You cannot use snapshots created on or before July 15, 2013. Such requests are rejected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        public static CreateLaunchTemplateRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestDataDisk self = new CreateLaunchTemplateRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public CreateLaunchTemplateRequestDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public CreateLaunchTemplateRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLaunchTemplateRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateLaunchTemplateRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateLaunchTemplateRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateLaunchTemplateRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public CreateLaunchTemplateRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateLaunchTemplateRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateLaunchTemplateRequestDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public CreateLaunchTemplateRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateLaunchTemplateRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class CreateLaunchTemplateRequestImageOptions extends TeaModel {
        /**
         * <p>Indicates whether the instance that uses this image supports logon with the ecs-user account.
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

        public static CreateLaunchTemplateRequestImageOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestImageOptions self = new CreateLaunchTemplateRequestImageOptions();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class CreateLaunchTemplateRequestNetworkInterface extends TeaModel {
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
         * <p>testEniDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the network interface controller (NIC). Valid values of N: 1 to 2. If you set N to 1, you can configure a primary or secondary NIC. If you set N to 2, you must configure one primary NIC and one secondary NIC.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Primary: primary NIC.</li>
         * <li>Secondary: secondary NIC.</li>
         * </ul>
         * <p>Default value: Secondary.</p>
         * 
         * <strong>example:</strong>
         * <p>Secondary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The name of the network interface controller (NIC).</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>Valid values of N: 1 to 2. If you set N to 1, you can configure a primary or secondary NIC. If you set N to 2, you must configure one primary NIC and one secondary NIC.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you do not need to set this parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testEniName</p>
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
         * <p>Adds a network interface controller (NIC) and sets the primary IP address.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>Valid values of N: 1 to 2.</p>
         * <ul>
         * <li>If you set N to 1, you can configure a primary or secondary NIC. If the <code>Amount</code> parameter is set to a value greater than 1 and you configure a primary NIC with this parameter specified, consecutive primary IP addresses starting from the specified IP address are allocated to multiple ECS instances in batch. In this case, you cannot attach a secondary NIC to the instances.</li>
         * <li>If you set N to 2, you must configure one primary NIC and one secondary NIC. If the <code>Amount</code> parameter is set to a value greater than 1 and this parameter is specified for the primary NIC, you cannot configure a secondary NIC (that is, you cannot set <code>NetworkInterface.2.InstanceType=Secondary</code>).</li>
         * </ul>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, this parameter has the same effect as <code>PrivateIpAddress</code>, but you cannot specify both this parameter and <code>PrivateIpAddress</code>.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter specifies the primary IP address of the secondary NIC. By default, an IP address is randomly selected from the vSwitch CIDR block to which the NIC belongs.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When you create an ECS instance, you can attach up to one secondary NIC. After the instance is created, you can invoke <a href="https://help.aliyun.com/document_detail/58504.html">CreateNetworkInterface</a> and <a href="https://help.aliyun.com/document_detail/58515.html">AttachNetworkInterface</a> to attach more secondary NICs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>192.168.**.**</code></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The ID of the security group to which the network interface controller (NIC) belongs.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>Valid values of N: 1 to 2. If you set N to 1, you can configure a primary or secondary NIC. If you set N to 2, you must configure one primary NIC and one secondary NIC.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must set this parameter. This parameter has the same effect as <code>SecurityGroupId</code>, but you cannot specify <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupIds.N</code>.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. Default value: the security group of the ECS instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of one or more security groups to which the network interface controller (NIC) belongs.</p>
         * <ul>
         * <li>The first N has a valid value range of 1 to 2. If you set N to 1, you can configure a primary or secondary NIC. If you set N to 2, you must configure one primary NIC and one secondary NIC.</li>
         * <li>The second N specifies one or more security group IDs. The valid value range of N depends on the maximum number of security groups to which an instance can belong. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must set this parameter or <code>NetworkInterface.N.SecurityGroupId</code>. This parameter has the same effect as <code>SecurityGroupIds.N</code>, but you cannot specify <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupId</code>.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. Default value: the security group of the ECS instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The vSwitch ID of the network interface controller (NIC).</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>Valid values of N: 1 to 2. If you set N to 1, you can configure a primary or secondary NIC. If you set N to 2, you must configure one primary NIC and one secondary NIC.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, this parameter is required. This parameter has the same effect as <code>VSwitchId</code>, but you cannot specify both this parameter and <code>VSwitchId</code>.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. Default value: the vSwitch of the ECS instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1s5fnvk4gn2tws0****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static CreateLaunchTemplateRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestNetworkInterface self = new CreateLaunchTemplateRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestNetworkInterface setDeleteOnRelease(Boolean deleteOnRelease) {
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }
        public Boolean getDeleteOnRelease() {
            return this.deleteOnRelease;
        }

        public CreateLaunchTemplateRequestNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLaunchTemplateRequestNetworkInterface setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateLaunchTemplateRequestNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public CreateLaunchTemplateRequestNetworkInterface setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public CreateLaunchTemplateRequestNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public CreateLaunchTemplateRequestNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateLaunchTemplateRequestNetworkInterface setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public CreateLaunchTemplateRequestNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class CreateLaunchTemplateRequestSecurityOptions extends TeaModel {
        /**
         * <p>The trusted system mode. Set the value to vTPM.</p>
         * <p>The following instance families support trusted system mode:</p>
         * <ul>
         * <li>g7, c7, and r7.</li>
         * <li>Enhanced instance families (g7t, c7t, and r7t).</li>
         * </ul>
         * <p>When you create ECS instances of the preceding instance types, you must configure this parameter. Take note of the following items:</p>
         * <ul>
         * <li>To use Alibaba Cloud Trusted System, set this parameter to vTPM. Then, Alibaba Cloud Trusted System performs trusted verification when the instance starts.</li>
         * <li>If you do not use Alibaba Cloud Trusted System, you do not need to configure this parameter. However, if the ECS instance that you create uses the Enclave-based confidential computing pattern (<code>SecurityOptions.ConfidentialComputingMode=Enclave</code>), the trusted system is also enabled for the instance.</li>
         * <li>When you use OpenAPI to create a trusted ECS instance, you can only invoke <code>RunInstances</code>. <code>CreateInstance</code> does not support the <code>SecurityOptions.TrustedSystemMode</code> parameter.<blockquote>
         * <p>If you specify the instance as a trusted instance during creation, you can replace the system disk only with an image that supports the trusted system.</p>
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

        public static CreateLaunchTemplateRequestSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestSecurityOptions self = new CreateLaunchTemplateRequestSecurityOptions();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestSecurityOptions setTrustedSystemMode(String trustedSystemMode) {
            this.trustedSystemMode = trustedSystemMode;
            return this;
        }
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

    }

    public static class CreateLaunchTemplateRequestTag extends TeaModel {
        /**
         * <p>The tag key for instances, disks, and primary ENIs created from this template version. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. The tag key cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value for instances, disks, and primary ENIs created from this template version. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLaunchTemplateRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestTag self = new CreateLaunchTemplateRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLaunchTemplateRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateLaunchTemplateRequestTemplateTag extends TeaModel {
        /**
         * <p>The tag key of the launch template. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the launch template. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateLaunchTemplateRequestTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            CreateLaunchTemplateRequestTemplateTag self = new CreateLaunchTemplateRequestTemplateTag();
            return TeaModel.build(map, self);
        }

        public CreateLaunchTemplateRequestTemplateTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateLaunchTemplateRequestTemplateTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
