// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateRequest extends TeaModel {
    @NameInMap("SystemDisk")
    public CreateLaunchTemplateRequestSystemDisk systemDisk;

    /**
     * <p>The automatic release time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <ul>
     * <li>If the ss value is not 00, the time is automatically rounded down to the current minute (mm).</li>
     * <li>The earliest release time is half an hour after the current time.</li>
     * <li>The latest release time cannot be more than three years after the current time.
     * <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a></li>
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
     * <li>false: disables auto-renewal.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This parameter takes effect only when the InstanceChargeType parameter is set to PrePaid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Valid values: </p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Valid values when PeriodUnit is set to Week: 1, 2, and 3.</li>
     * <li>Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li>Standard: standard mode. For more information about the performance of the instance, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * <li>Unlimited: unlimited mode. For more information about the performance of the instance, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
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
    public java.util.List<CreateLaunchTemplateRequestDataDisk> dataDisk;

    /**
     * <p>The release protection property of the instance. It specifies whether the instance can be released by using the console or by calling the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation. Valid values:</p>
     * <ul>
     * <li><p>true: enables release protection for the instance.</p>
     * </li>
     * <li><p>false: disables release protection for the instance.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This property applies only to pay-as-you-go instances. It can prevent only manual release operations, but not system release operations.</p>
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
     * <p>The instance description. The description must be 2 to 256 characters in length and can contain letters and Chinese characters. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testECSDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the operating system configuration of the instance.</p>
     * <blockquote>
     * <p>This parameter will be deprecated. To improve compatibility, we recommend that you use other parameters.</p>
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
     * <li>For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.). It cannot contain only digits. It can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
     * <li>For instances of other operating systems such as Linux, the hostname must be 2 to 64 characters in length. It can contain multiple segments separated by periods (.). Each segment can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
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
     * <p>For more information about instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Overview of instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether to forcibly use the security hardening mode (IMDSv2) to access instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: does not forcibly use the security hardening mode.</li>
     * <li>required: forcibly uses the security hardening mode. After you set this parameter to required, you cannot access instance metadata in normal mode.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes of accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/108460.html">Overview of instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The image ID. This is the image resource selected when the instance is started. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query the available image resources.</p>
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
     * <li>system: public images provided by Alibaba Cloud.</li>
     * <li>self: custom images that you created.</li>
     * <li>others: shared images from other Alibaba Cloud accounts.</li>
     * <li>marketplace: images provided by &lt;props=&quot;china&quot;&gt;<ph><a href="https://market.aliyun.com/">Alibaba Cloud Marketplace</a></ph>&lt;props=&quot;intl&quot;&gt;<ph><a href="https://marketplace.alibabacloud.com/">Alibaba Cloud Marketplace</a></ph>. You can use the Alibaba Cloud Marketplace images that you queried without subscribing to them in advance. You must pay attention to the billing details of the Alibaba Cloud Marketplace images.</li>
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
     * <li>PrePaid: subscription. If you select this billing method, &lt;props=&quot;china&quot;&gt;<ph>you must confirm that your account supports balance payment and credit payment</ph>&lt;props=&quot;intl&quot;&gt;<ph>you must confirm that your account supports credit payment</ph>. Otherwise, an InvalidPayMethod fault is returned.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance name. The name must be 2 to 128 characters in length and can contain characters in the Letter category of Unicode, including letters and digits. It can contain colons (:), underscores (_), periods (.), and hyphens (-). Default value: the InstanceId of the instance.</p>
     * <p>When you create multiple ECS instances, you can batch specify sequential instance names, which can contain square brackets ([]) and commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch specify sequential instance names or hostnames</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-alibabacloud</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The resource specifications of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a>. You can also invoke the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to obtain the most recent instance type list.</p>
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
     * <p>In the pay-by-traffic pattern, the peak inbound and outbound bandwidths are used as upper limits of bandwidths instead of guaranteed performance specifications. In the event of resource contention, the peak bandwidths cannot be guaranteed. If your business requires guaranteed bandwidths, use the pay-by-bandwidth billing method.</p>
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
     * <li>When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</li>
     * <li>When the purchased outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of InternetMaxBandwidthOut. Default value: the value of InternetMaxBandwidthOut.</li>
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
     * <p>Specifies whether the instance is an I/O optimized instance. Valid values:</p>
     * <ul>
     * <li>none: The instance is not I/O optimized.</li>
     * <li>optimized: The instance is I/O optimized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The number of IPv6 addresses to be randomly generated for the primary ENI. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>The name of the key pair.</p>
     * <ul>
     * <li>For Windows instances, this parameter is ignored. Even if you specify this parameter, only the Password parameter takes effect.</li>
     * <li>For Linux instances, the password logon method is disabled by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The name of the instance launch template. The name must be 2 to 128 characters in length and can contain letters and Chinese characters. It must start with a letter or a Chinese character and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testLaunchTemplateName</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    /**
     * <p>The Elastic Network Interface (ENI) information.</p>
     */
    @NameInMap("NetworkInterface")
    public java.util.List<CreateLaunchTemplateRequestNetworkInterface> networkInterface;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li>classic: classic network. This network type is phased out. For more information, see <a href="https://help.aliyun.com/document_detail/2833134.html">Phasing-out notice</a>.</li>
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
     * <p>Specifies whether to use the preset password of the image.</p>
     * <blockquote>
     * <p>When you specify this parameter, leave Password empty and make sure that the selected image has a preset password.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription period of the instance. Unit: months. This parameter is valid and required only when InstanceChargeType is set to PrePaid. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The time unit for the subscription Billable methods. Valid values: </p>
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
     * <p>When you specify the private IP address for an ECS instance in a VPC, the IP address must be selected from the idle CIDR block of the vSwitch specified by VSwitchId.</p>
     * 
     * <strong>example:</strong>
     * <p><code>10.1.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the instance RAM role. You can call the <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> operation provided by RAM to query the instance RAM roles that you have created.</p>
     * 
     * <strong>example:</strong>
     * <p>testRamRoleName</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the enterprise resource group to which the instance, block storage, and elastic network interface (ENI) belong.</p>
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
     * <li>Deactive: disables security hardening. This value is applicable to all image types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Deactive</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which the new instance belongs. Instances in the same security group can access each other. A security group can manage up to 1,000 instances.</p>
     * <blockquote>
     * <p>You cannot specify both SecurityGroupId and SecurityGroupIds.N at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of one or more security groups to which the instance is added. The valid values of N depend on the quota of security groups to which an instance can be added. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * <blockquote>
     * <p>You cannot specify both SecurityGroupId and SecurityGroupIds.N.</p>
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
     * <li>1: Alibaba Cloud guarantees that the instance is not subject to automatic release within 1 hour after it is created. After 1 hour, the system automatically compares the bid price with the marketplace price and checks resource inventory to determine whether to retain or revoke the instance.</li>
     * <li>0: Alibaba Cloud does not guarantee that the instance is retained for 1 hour after it is created. The system automatically compares the bid price with the marketplace price and checks resource inventory to determine whether to retain or revoke the instance.</li>
     * </ul>
     * <p>Alibaba Cloud sends you a notification by using an ECS system event 5 minutes before the instance is revoked. Spot instances use the billing method by second. We recommend that you select an appropriate protection period based on the execution duration of your tasks.</p>
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
     * <p>The maximum hourly price of the instance. The value can be accurate to three decimal places. This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.97</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The preemption policy for the pay-as-you-go instance. This parameter takes effect only when InstanceChargeType is set to PostPaid. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is a regular pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is a spot instance with a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is a spot instance for which the market price is automatically used as the bid price.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The tag information of the instances, cloud disks, and primary ENIs that are created by using this version of the launch template.</p>
     * <details>
     * <summary>Scenarios</summary>
     * After you call the CreateLaunchTemplate operation to create a launch template and use the automatically generated default version to create instances, this tag is used to tag the instances, cloud disks, and primary ENIs.
     * </details>
     */
    @NameInMap("Tag")
    public java.util.List<CreateLaunchTemplateRequestTag> tag;

    /**
     * <p>The ID of the enterprise resource group to which the launch template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("TemplateResourceGroupId")
    public String templateResourceGroupId;

    /**
     * <p>The tags of the launch template.</p>
     * <blockquote>
     * <p>You can only create and query the tags of launch templates by calling API operations. You cannot create or view the tags in the console.</p>
     * </blockquote>
     */
    @NameInMap("TemplateTag")
    public java.util.List<CreateLaunchTemplateRequestTemplateTag> templateTag;

    /**
     * <p>Instance user data of the instance. Instance user data must be encoded in Base64. The maximum size of the raw data is 32 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the vSwitch. This parameter is required when you create a VPC instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The description of the instance launch template version. The description must be 2 to 256 characters in length and can contain letters and Chinese characters. It cannot start with http:// or https://.</p>
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
         * <li>true: enables the feature.</li>
         * <li>false: disables the feature.</li>
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
         * <li>cloud_essd: ESSD. You can use the SystemDisk.PerformanceLevel parameter to set the performance level of the disk.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * </ul>
         * <p>Default value: cloud for retired instance types that are not I/O optimized instances, and cloud_efficiency for other instance types.</p>
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
         * <p>The description of the system disk. The description must be 2 to 256 characters in length and can contain letters and Chinese characters. It cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testSystemDiskDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length and can contain letters and Chinese characters. It must start with a letter or a Chinese character and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
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
         * <p>You cannot encrypt the system disk when you create an instance in Zone D of the Hong Kong (China) region or Zone A of the Singapore region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available.</p>
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
         * <li>PL0 (default): A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For more details about how to select the performance level of an ESSD, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}.</p>
         * <p>Baseline performance = min{1800 + 50 × Capacity, 50000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned information of an ESSD AutoPL disk</a>.</p>
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
         * <li>true: enables the feature.</li>
         * <li>false: disables the feature.</li>
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
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud: basic disk.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_regional_disk_auto: regional ESSD.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.<blockquote>
         * <p>This parameter can be set to cloud_essd_entry only when InstanceType is set to an instance type in the ecs.u1 or ecs.e instance family.</p>
         * </blockquote>
         * </li>
         * <li>elastic_ephemeral_disk_standard: standard elastic ephemeral disk.</li>
         * <li>elastic_ephemeral_disk_premium: Premium Edition elastic ephemeral disk.</li>
         * </ul>
         * <p>Default values: cloud_efficiency for I/O optimized instances, and cloud for non-I/O optimized instances.
         * Default value description:</p>
         * <ul>
         * <li>If the instance type is a retired and non-I/O optimized instance type, the default value is cloud.</li>
         * <li>In other cases, the default value is cloud_efficiency. &lt;props=&quot;china&quot;&gt;After January 30, 2026, if the I/O optimized instance type does not support cloud_auto, the default value is cloud_efficiency. Otherwise, the default value is cloud_auto, and the performance burst feature is enabled by default (which incurs additional fees. For more details, see <a href="~~368372#p_75k_2hp_7gp~~">Billing examples</a>). For more details, see <a href="https://www.aliyun.com/notice/117844">Announcement</a>.</li>
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
         * <p>The description of the data disk. The description must be 2 to 256 characters in length and can contain letters and Chinese characters. It cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testDataDiskDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk. The naming convention for mount points varies based on the number of attached data disks:</p>
         * <ul>
         * <li><p>1 to 25 data disks: /dev/xvd[b-z].</p>
         * </li>
         * <li><p>More than 25 data disks: /dev/xvd[aa-zz]. For example, the 26th data disk is named /dev/xvdaa, and the 27th data disk is named /dev/xvdab.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is applicable only to full images. You can set this parameter to the mount point of the data disk in the full image and modify the DataDisk.N.Size and DataDisk.N.Category parameters to change the category and size of the data disk in the full image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length and can contain letters and Chinese characters. It must start with a letter or a Chinese character and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
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
         * <p>The ID of the Key Management Service (KMS) key used to encrypt the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD used as the data disk. The value of N must be the same as the value of N in DataDisk.N.Category=cloud_essd. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1 (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For more details about how to select the performance level of an ESSD, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}.</p>
         * <p>Baseline performance = min{1800 + 50 × Capacity, 50000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a> and <a href="https://help.aliyun.com/document_detail/413275.html">Modify the provisioned information of an ESSD AutoPL disk</a>.</p>
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
         * <li>cloud_essd: The valid values are subject to the value of DataDisk.N.PerformanceLevel.<ul>
         * <li>PL0: 1 to 32768.</li>
         * <li>PL1: 20 to 32768.</li>
         * <li>PL2: 461 to 32768.</li>
         * <li>PL3: 1261 to 32768.</li>
         * </ul>
         * </li>
         * <li>cloud_auto: 1 to 32768.</li>
         * <li>cloud_essd_entry: 10 to 32768.</li>
         * </ul>
         * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by the SnapshotId parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot used to create data disk N. Valid values of N: 1 to 16. If you specify the DataDisk.N.SnapshotId parameter, the DataDisk.N.Size parameter is ignored. The actual size of the created disk is the size of the specified snapshot.</p>
         * <blockquote>
         * <p>You cannot use snapshots created on or before July 15, 2013. Otherwise, the request is rejected.</p>
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
         * <p>Specifies whether the instance that uses this image supports logon as the ecs-user user. Valid values:</p>
         * <ul>
         * <li>true: yes.</li>
         * <li>false: no.</li>
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
         * <p>The description of the secondary ENI. The description must be 2 to 256 characters in length and cannot start with http:// or https://. The value of N in NetworkInterface.N cannot be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>testEniDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the ENI. Valid values of N: 1 to 2. When you configure one ENI, you can configure one primary ENI or one secondary ENI. When you configure two ENIs, you can configure only one primary ENI and one secondary ENI at the same time.</p>
         * <p>Valid values of the parameter:</p>
         * <ul>
         * <li>Primary: primary ENI.</li>
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
         * <p>The name of the ENI.</p>
         * <p>Note:</p>
         * <ul>
         * <li><p>Valid values of N: 1 to 2. When you configure one ENI, you can configure one primary ENI or one secondary ENI. When you configure two ENIs, you can configure only one primary ENI and one secondary ENI at the same time.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you do not need to specify this parameter.</p>
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
         * <p>Adds an ENI and configures the primary IP address.</p>
         * <p>Note:</p>
         * <ul>
         * <li><p>Valid values of N: 1 to 2:</p>
         * <ul>
         * <li>When you configure one ENI, you can configure one primary ENI or one secondary ENI. If the Amount parameter is set to a value greater than 1, and you configure a primary ENI and specify this parameter, consecutive primary IP addresses starting from the specified primary IP address are allocated to multiple ECS instances that are created in a batch. Note that you cannot bind secondary ENIs to the instances in this case.</li>
         * <li>When you configure two ENIs, you can configure only one primary ENI and one secondary ENI at the same time. Note that if the Amount parameter is set to a value greater than 1 and you specify this parameter for the primary ENI, you cannot configure a secondary ENI (that is, you cannot set NetworkInterface.2.InstanceType=Secondary).</li>
         * </ul>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, this parameter serves the same purpose as PrivateIpAddress, but you cannot specify both PrivateIpAddress and this parameter at the same time.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Secondary or left empty, this parameter specifies the primary IP address for the secondary ENI. By default, an IP address is randomly selected from the vSwitch CIDR block to which the ENI belongs.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When you create an ECS instance, you can add only one secondary ENI. After the instance is created, you can call the <a href="https://help.aliyun.com/document_detail/58504.html">CreateNetworkInterface</a> and <a href="https://help.aliyun.com/document_detail/58515.html">AttachNetworkInterface</a> operations to add more secondary ENIs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>192.168.**.**</code></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The ID of the security group to which the ENI belongs.</p>
         * <p>Note:</p>
         * <ul>
         * <li><p>Valid values of N: 1 to 2. When you configure one ENI, you can configure one primary ENI or one secondary ENI. When you configure two ENIs, you can configure only one primary ENI and one secondary ENI at the same time.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you must specify this parameter. In this case, this parameter serves the same purpose as SecurityGroupId, but you cannot specify SecurityGroupId, SecurityGroupIds.N, or NetworkInterface.N.SecurityGroupIds.N at the same time.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Secondary or left empty, this parameter is optional. The default value is the security group to which the ECS instance belongs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of one or more security groups to which the ENI belongs.</p>
         * <ul>
         * <li>The valid values of the first N are 1 to 2. When you configure one ENI, you can configure one primary ENI or one secondary ENI. When you configure two ENIs, you can configure only one primary ENI and one secondary ENI at the same time.</li>
         * <li>The second N specifies one or more security group IDs. The valid values of N depend on the quota of security groups to which an instance can be added. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
         * </ul>
         * <p>Note:</p>
         * <ul>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you must specify this parameter or NetworkInterface.N.SecurityGroupId. In this case, this parameter serves the same purpose as SecurityGroupIds.N, but you cannot specify SecurityGroupId, SecurityGroupIds.N, or NetworkInterface.N.SecurityGroupId at the same time.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Secondary or left empty, this parameter is optional. The default value is the security group to which the ECS instance belongs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The ID of the vSwitch to which the ENI belongs.</p>
         * <p>Note:</p>
         * <ul>
         * <li><p>Valid values of N: 1 to 2. When you configure one ENI, you can configure one primary ENI or one secondary ENI. When you configure two ENIs, you can configure only one primary ENI and one secondary ENI at the same time.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you must specify this parameter. In this case, this parameter serves the same purpose as VSwitchId, but you cannot specify both VSwitchId and this parameter at the same time.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Secondary or left empty, this parameter is optional. The default value is the vSwitch to which the ECS instance belongs.</p>
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
         * <p>Specifies whether to enable secure boot.</p>
         */
        @NameInMap("EnableSecureBoot")
        public Boolean enableSecureBoot;

        /**
         * <p>The trusted system pattern. Valid value: vTPM.</p>
         * <p>Currently, the trusted system pattern supports the following instance families:</p>
         * <ul>
         * <li>g7, c7, and r7.</li>
         * <li>security-enhanced instance families (g7t, c7t, and r7t).</li>
         * </ul>
         * <p>When you create an ECS instance of the preceding instance families, you must configure this parameter. Details:</p>
         * <ul>
         * <li>If you use the Alibaba Cloud trusted system, configure this parameter to vTPM. This way, the Alibaba Cloud trusted system performs trusted verification when the instance starts.</li>
         * <li>If you do not use the Alibaba Cloud trusted system, you can leave this parameter empty. However, if the ECS instance that you create uses the Enclave confidential computing pattern (SecurityOptions.ConfidentialComputingMode=Enclave), the trusted system is also enabled for the ECS instance.</li>
         * <li>When you create an ECS instance with the trusted system enabled by calling an API operation, you can only call the RunInstances operation. The CreateInstance operation does not support configuring the SecurityOptions.TrustedSystemMode parameter.<blockquote>
         * <p>If you specify an instance as a trusted instance when you create it, you can only use an image that supports the trusted system when you replace the system disk.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>For more information about the trusted system, see <a href="https://help.aliyun.com/document_detail/201394.html">Overview of the trusted feature for security-enhanced instance families</a>.</p>
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

        public CreateLaunchTemplateRequestSecurityOptions setEnableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        public Boolean getEnableSecureBoot() {
            return this.enableSecureBoot;
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
         * <p>The tag key of the instances, cloud disks, and primary ENIs that are created by using this version of the launch template. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instances, cloud disks, and primary ENIs that are created by using this version of the launch template. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
         * <p>The tag key of the launch template. Valid values of N: 1 to 20. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the launch template. Valid values of N: 1 to 20. If you specify this parameter, it can be an empty string. The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
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
