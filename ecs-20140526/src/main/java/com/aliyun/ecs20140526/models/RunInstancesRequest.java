// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunInstancesRequest extends TeaModel {
    @NameInMap("CpuOptions")
    public RunInstancesRequestCpuOptions cpuOptions;

    @NameInMap("HibernationOptions")
    public RunInstancesRequestHibernationOptions hibernationOptions;

    @NameInMap("PrivatePoolOptions")
    public RunInstancesRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("SchedulerOptions")
    public RunInstancesRequestSchedulerOptions schedulerOptions;

    @NameInMap("SecurityOptions")
    public RunInstancesRequestSecurityOptions securityOptions;

    @NameInMap("SystemDisk")
    public RunInstancesRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether the instance on a dedicated host is associated with the dedicated host. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The number of ECS instances to create. Valid values: 1 to 100.</p>
     * <p>The number of ECS instances that are created depends on the values of Amount and MinAmount:</p>
     * <ul>
     * <li><p>If MinAmount is not specified: instances are created based on the Amount value. If the inventory is insufficient, the API returns a failure and no instances are created.</p>
     * </li>
     * <li><p>If MinAmount is specified:</p>
     * <ul>
     * <li>If the available inventory &lt; MinAmount: no ECS instances are created, and the API returns a failure.</li>
     * <li>If MinAmount ≤ available inventory &lt; Amount: instances are created based on the available inventory, and the API returns a success.</li>
     * <li>If the available inventory ≥ Amount: instances are created based on the specified Amount value, and the API returns a success.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<RunInstancesRequestArn> arn;

    /**
     * <p>Specifies whether to automatically complete the payment when you create the instance. Valid values:</p>
     * <ul>
     * <li><p>true: The payment is automatically completed.</p>
     * <blockquote>
     * <p>If the balance of your payment method is insufficient, an abnormal order is generated and can only be canceled. If the balance of your payment method is insufficient, set AutoPay to <code>false</code>. In this case, an unpaid order is generated. You can then log on to the ECS console to complete the payment.</p>
     * </blockquote>
     * </li>
     * <li><p>false: An order is generated but the payment is not completed.</p>
     * <blockquote>
     * <p>When <code>InstanceChargeType</code> is set to <code>PostPaid</code>, <code>AutoPay</code> cannot be set to <code>false</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The automatic release time of the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the UTC+0 time zone. The format is <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * <ul>
     * <li><p>If the value of seconds (<code>ss</code>) is not <code>00</code>, the start time of the current minute (<code>mm</code>) is used.</p>
     * </li>
     * <li><p>The earliest release time is half an hour after the current time.</p>
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
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when InstanceChargeType is set to PrePaid. Valid values:</p>
     * <ul>
     * <li>true: Auto-renewal is enabled.</li>
     * <li>false: Auto-renewal is not enabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>PeriodUnit=Week: 1, 2, and 3.</li>
     * <li>PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;PeriodUnit=Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The clock-related property parameters of the instance.</p>
     */
    @NameInMap("ClockOptions")
    public RunInstancesRequestClockOptions clockOptions;

    /**
     * <p>The running mode of the burstable instance. Valid values:</p>
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
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

    /**
     * <p>The ID of the dedicated host.
     * &lt;props=&quot;china&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the list of dedicated host IDs.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the list of dedicated host IDs.</p>
     * <blockquote>
     * <p>Notice: Dedicated hosts do not support spot instances. If you specify the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit settings in the request are automatically ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The release protection property of the instance. Specifies whether the instance can be released from the console or by calling the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation. Valid values:</p>
     * <ul>
     * <li>true: Enables release protection for the instance.</li>
     * <li>false: Disables release protection for the instance.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This property applies only to pay-as-you-go instances and only restricts manual release operations. It does not take effect on system-initiated release operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The group number of the instance in the deployment set. If the deployment set uses the high availability group strategy (AvailabilityGroup), you can use this parameter to specify the group number. Valid values: 1 to 7.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

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
     * <p>Instance_Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The hostname of the instance. The following limits apply:</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-ecshost</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>Specifies a different hostname for each instance when you create multiple instances.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-host-01</p>
     */
    @NameInMap("HostNames")
    public java.util.List<String> hostNames;

    /**
     * <p>The ID of the HPC cluster to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>hpc-bp67acfmxazb4p****</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
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
     * <p>0</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether to forcefully use the China Reinforced Mode (IMDSv2) for accessing instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: does not forcefully use the China Reinforced Mode.</li>
     * <li>required: forcefully uses the China Reinforced Mode. After this value is set, the normal mode cannot be used to access instance metadata.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes for accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/150575.html">Instance metadata access mode</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. You can set this parameter to obtain the latest available image from the specified image family to create the instance.</p>
     * <p>The name must be 2 to 128 characters in length. The name cannot start with a special character, a digit, http://, or https://. The name can contain only the following special characters: periods (.), underscores (_), hyphens (-), and colons (:).</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>If you set the ImageId parameter, you cannot set this parameter.</li>
     * <li>If you do not set the ImageId parameter but the launch template specified by LaunchTemplateId or LaunchTemplateName has ImageId configured, you cannot set this parameter.</li>
     * <li>If you do not set ImageId and the launch template specified by LaunchTemplateId or LaunchTemplateName does not have ImageId configured, you can set this parameter.</li>
     * <li>If you do not set ImageId and do not set LaunchTemplateId or LaunchTemplateName, you can set this parameter.<blockquote>
     * <p>For information about image families associated with Alibaba Cloud public images, see <a href="https://help.aliyun.com/document_detail/108393.html">Public image overview</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The image ID. Specifies the image resource used to start the instance. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available image resources. If you do not specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to determine a launch template, and do not specify <code>ImageFamily</code> to use the latest available image from an image family, <code>ImageId</code> is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_2_1903_x64_20G_alibase_20200324.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image-related property information.</p>
     */
    @NameInMap("ImageOptions")
    public RunInstancesRequestImageOptions imageOptions;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription.</li>
     * <li>PostPaid: pay-as-you-go.</li>
     * </ul>
     * <p>Default value: PostPaid.</p>
     * <p>&lt;props=&quot;china&quot;&gt;If you set this parameter to PrePaid, make sure that your account supports balance payment or credit payment. Otherwise, the <code>InvalidPayMethod</code> error is returned.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;If you set this parameter to PrePaid, make sure that your account supports credit payment. Otherwise, the <code>InvalidPayMethod</code> error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance name. The name must be 2 to 128 characters in length and can contain characters from the Unicode letter category (including English and Chinese characters) and digits. The name can contain colons (:), underscores (_), periods (.), or hyphens (-). Default value: the <code>InstanceId</code> of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-alibabacloud</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type of the instance. If you do not specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to determine the launch template, <code>InstanceType</code> is required.</p>
     * <ul>
     * <li>Instance type selection: See <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the performance data of the target instance type, or see <a href="https://help.aliyun.com/document_detail/58291.html">Best practices for instance type selection</a> to learn how to select an instance type.</li>
     * <li>Inventory query: Call <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> to query the resource availability in a specific region or zone.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth.</li>
     * <li>PayByTraffic: pay-by-traffic.</li>
     * </ul>
     * <p>Default value: PayByTraffic.</p>
     * <blockquote>
     * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are both upper limits and are not guaranteed. When resource contention occurs, the peak bandwidth may be throttled. If your business requires guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum inbound public bandwidth, in Mbit/s. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth, in Mbit/s. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether the instance is I/O optimization enabled. The default value for <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a> is none. The default value for other instance types is optimized. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>Specifies one or more IPv6 addresses for the primary ENI. You can specify up to 10 IPv6 addresses. Valid values of N: 1 to 10.</p>
     * <p>Example: <code>Ipv6Address.1=2001:db8:1234:1a00::***</code>.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>If you set <code>Ipv6Address.N</code>, you must set <code>Amount</code> to 1 and cannot set <code>Ipv6AddressCount</code>.</p>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>Ipv6Addresses.N</code> or <code>Ipv6AddressCount</code>. Instead, set <code>NetworkInterface.N.Ipv6Addresses.N</code> or <code>NetworkInterface.N.Ipv6AddressCount</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ipv6Address.1=2001:db8:1234:1a00::***</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The number of randomly generated IPv6 addresses for the primary ENI. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>KeyPair_Name</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The launch template ID. For more information, call <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-bp1apo0bbbkuy0rj****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The launch template name.</p>
     * 
     * <strong>example:</strong>
     * <p>LaunchTemplate_Name</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    /**
     * <p>The launch template version. If you specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> but do not specify the launch template version, the default version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public Long launchTemplateVersion;

    /**
     * <p>The minimum Quantity of ECS instances to purchase. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinAmount")
    public Integer minAmount;

    /**
     * <p>The network interface controller (NIC) information.</p>
     */
    @NameInMap("NetworkInterface")
    public java.util.List<RunInstancesRequestNetworkInterface> networkInterface;

    /**
     * <p>The number of queues supported by the primary ENI. Take note of the following items:</p>
     * <ul>
     * <li><p>The value cannot exceed the maximum number of queues per ENI allowed by the instance type.</p>
     * </li>
     * <li><p>The total number of queues for all ENIs on the instance cannot exceed the queue quota allowed by the instance type. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the MaximumQueueNumberPerEni and TotalEniQueueQuantity fields to obtain the maximum number of queues per ENI and the total queue quota for an instance type.</p>
     * </li>
     * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you cannot set NetworkInterfaceQueueNumber. Set NetworkInterface.N.QueueNumber instead.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("NetworkInterfaceQueueNumber")
    public Integer networkInterfaceQueueNumber;

    /**
     * <p>The network-related property parameters.</p>
     */
    @NameInMap("NetworkOptions")
    public RunInstancesRequestNetworkOptions networkOptions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * 
     * <strong>example:</strong>
     * <p>EcsV587!</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password preset in the image. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The duration of the subscription. Unit: specified by <code>PeriodUnit</code>. This parameter is required and takes effect only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>. If <code>DedicatedHostId</code> is specified, the value of this parameter cannot exceed the subscription duration of the dedicated host. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>PeriodUnit=Week: 1, 2, 3, and 4.</li>
     * <li>PeriodUnit=Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;PeriodUnit=Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription billable methods duration. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The private DNS name configuration of the instance.</p>
     */
    @NameInMap("PrivateDnsNameOptions")
    public RunInstancesRequestPrivateDnsNameOptions privateDnsNameOptions;

    /**
     * <p>The private IP address of the instance. When you specify a private IP address for a VPC-connected ECS instance, the IP address must be an available address within the CIDR block of the vSwitch specified by <code>VSwitchId</code>.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>After you set <code>PrivateIpAddress</code>:</p>
     * <ul>
     * <li>If <code>Amount</code> is set to 1, the specified private IP address is assigned to the created ECS instance.</li>
     * <li>If <code>Amount</code> is set to a value greater than 1, the specified private IP address is used as the start address to sequentially assign consecutive private IP addresses to multiple ECS instances during batch creation. In this case, you cannot attach secondary ENIs to the instances (that is, you cannot set <code>NetworkInterface.N.*</code> parameters).</li>
     * </ul>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>PrivateIpAddress</code>. Set <code>NetworkInterface.N.PrimaryIpAddress</code> instead.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The first and last three IP addresses of each vSwitch CIDR block are reserved by the system and cannot be specified.
     * For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved by the system.</p>
     * </blockquote>
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
     * <p>RAM_Name</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the enterprise resource group to which the instance belongs.</p>
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
     * <p>Specifies whether to enable security hardening. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which the new instance belongs. Instances within the same security group can communicate with each other. The maximum number of instances that a security group can contain varies based on the security group type. For more information, see the security group section in <a href="~~25412#SecurityGroupQuota~~">Limits</a>.</p>
     * <blockquote>
     * <p><code>SecurityGroupId</code> determines the network type of the instance. For example, if the specified security group is of the Virtual Private Cloud (VPC) type, the instance is a VPC-type instance, and you must also specify the <code>VSwitchId</code> parameter.</p>
     * </blockquote>
     * <p>If you do not set <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template, the security group ID is required. Note the following items:</p>
     * <ul>
     * <li><p>You can set one security group by using <code>SecurityGroupId</code>, or set one or more security groups by using <code>SecurityGroupIds.N</code>. However, you cannot specify both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code> at the same time.</p>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code>. In this case, you can only set <code>NetworkInterface.N.SecurityGroupId</code> or <code>NetworkInterface.N.SecurityGroupIds.N</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Adds the instance to multiple security groups. The valid values of N depend on the maximum number of security groups to which an instance can belong. For more information, see <a href="https://help.aliyun.com/document_detail/101348.html">Security group limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7****</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Valid values:</p>
     * <ul>
     * <li>1: After the instance is created, Alibaba Cloud guarantees that the instance runs for 1 hour without being automatically released. After 1 hour, the system compares the bid price with the market price and checks resource inventory to determine whether to retain or reclaim the instance.</li>
     * <li>0: After the instance is created, Alibaba Cloud does not guarantee the instance running duration. The system compares the bid price with the market price and checks resource inventory to determine whether to retain or reclaim the instance.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter supports only the value 0 or 1.</li>
     * <li>Spot instances are billed by second. Set an appropriate protection period based on the expected task execution duration.</li>
     * <li>Alibaba Cloud sends a notification to you through an ECS system event 5 minutes before the instance is reclaimed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption pattern of the spot instance. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>Terminate</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>The maximum hourly price of the instance. A maximum of three decimal places is supported. This parameter takes effect when the <code>SpotStrategy</code> parameter is set to <code>SpotWithPriceLimit</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0.97</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the pay-as-you-go instance. This parameter takes effect when the <code>InstanceChargeType</code> parameter is set to <code>PostPaid</code>. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The storage set ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-bp67acfmxazb4p****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The maximum number of partitions in the storage set. Valid values: greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The tag information for the instance, disks, and primary ENI.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunInstancesRequestTag> tag;

    /**
     * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>Specifies whether to automatically append sequential suffixes to <code>HostName</code> and <code>InstanceName</code> when you create multiple instances. Sequential suffixes start from 001 and can be up to 999. Valid values:</p>
     * <ul>
     * <li>true: Appends sequential suffixes.</li>
     * <li>false: Does not append sequential suffixes.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>If <code>HostName</code> or <code>InstanceName</code> is configured in a specified sorting format without the naming suffix <code>name_suffix</code>, that is, the naming format is <code>name_prefix[begin_number,bits]</code>, <code>UniqueSuffix</code> does not take effect, and names are sorted only in the specified order.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential instance names or hostnames</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    /**
     * <p>The instance user data. The data must be Base64-encoded. The maximum size of the raw data before Base64 encoding is 32 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The vSwitch ID. If you are creating a VPC-type ECS instance, you must specify a vSwitch ID. The security group and the vSwitch must belong to the same VPC. You can call <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> to query created vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> to query the zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static RunInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesRequest self = new RunInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RunInstancesRequest setCpuOptions(RunInstancesRequestCpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }
    public RunInstancesRequestCpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    public RunInstancesRequest setHibernationOptions(RunInstancesRequestHibernationOptions hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }
    public RunInstancesRequestHibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    public RunInstancesRequest setPrivatePoolOptions(RunInstancesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public RunInstancesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public RunInstancesRequest setSchedulerOptions(RunInstancesRequestSchedulerOptions schedulerOptions) {
        this.schedulerOptions = schedulerOptions;
        return this;
    }
    public RunInstancesRequestSchedulerOptions getSchedulerOptions() {
        return this.schedulerOptions;
    }

    public RunInstancesRequest setSecurityOptions(RunInstancesRequestSecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }
    public RunInstancesRequestSecurityOptions getSecurityOptions() {
        return this.securityOptions;
    }

    public RunInstancesRequest setSystemDisk(RunInstancesRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public RunInstancesRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public RunInstancesRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public RunInstancesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public RunInstancesRequest setArn(java.util.List<RunInstancesRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<RunInstancesRequestArn> getArn() {
        return this.arn;
    }

    public RunInstancesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RunInstancesRequest setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    public RunInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RunInstancesRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public RunInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunInstancesRequest setClockOptions(RunInstancesRequestClockOptions clockOptions) {
        this.clockOptions = clockOptions;
        return this;
    }
    public RunInstancesRequestClockOptions getClockOptions() {
        return this.clockOptions;
    }

    public RunInstancesRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public RunInstancesRequest setDataDisk(java.util.List<RunInstancesRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<RunInstancesRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public RunInstancesRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public RunInstancesRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public RunInstancesRequest setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
        this.deploymentSetGroupNo = deploymentSetGroupNo;
        return this;
    }
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public RunInstancesRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public RunInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RunInstancesRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public RunInstancesRequest setHostNames(java.util.List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }
    public java.util.List<String> getHostNames() {
        return this.hostNames;
    }

    public RunInstancesRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public RunInstancesRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public RunInstancesRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public RunInstancesRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public RunInstancesRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public RunInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RunInstancesRequest setImageOptions(RunInstancesRequestImageOptions imageOptions) {
        this.imageOptions = imageOptions;
        return this;
    }
    public RunInstancesRequestImageOptions getImageOptions() {
        return this.imageOptions;
    }

    public RunInstancesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public RunInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public RunInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public RunInstancesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public RunInstancesRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public RunInstancesRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public RunInstancesRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public RunInstancesRequest setIpv6Address(java.util.List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

    public RunInstancesRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public RunInstancesRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public RunInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public RunInstancesRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public RunInstancesRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public RunInstancesRequest setLaunchTemplateVersion(Long launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public Long getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public RunInstancesRequest setMinAmount(Integer minAmount) {
        this.minAmount = minAmount;
        return this;
    }
    public Integer getMinAmount() {
        return this.minAmount;
    }

    public RunInstancesRequest setNetworkInterface(java.util.List<RunInstancesRequestNetworkInterface> networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }
    public java.util.List<RunInstancesRequestNetworkInterface> getNetworkInterface() {
        return this.networkInterface;
    }

    public RunInstancesRequest setNetworkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
        this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
        return this;
    }
    public Integer getNetworkInterfaceQueueNumber() {
        return this.networkInterfaceQueueNumber;
    }

    public RunInstancesRequest setNetworkOptions(RunInstancesRequestNetworkOptions networkOptions) {
        this.networkOptions = networkOptions;
        return this;
    }
    public RunInstancesRequestNetworkOptions getNetworkOptions() {
        return this.networkOptions;
    }

    public RunInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RunInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RunInstancesRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RunInstancesRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public RunInstancesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RunInstancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RunInstancesRequest setPrivateDnsNameOptions(RunInstancesRequestPrivateDnsNameOptions privateDnsNameOptions) {
        this.privateDnsNameOptions = privateDnsNameOptions;
        return this;
    }
    public RunInstancesRequestPrivateDnsNameOptions getPrivateDnsNameOptions() {
        return this.privateDnsNameOptions;
    }

    public RunInstancesRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public RunInstancesRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public RunInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RunInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunInstancesRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public RunInstancesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RunInstancesRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public RunInstancesRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public RunInstancesRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public RunInstancesRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public RunInstancesRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public RunInstancesRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public RunInstancesRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public RunInstancesRequest setTag(java.util.List<RunInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunInstancesRequestTag> getTag() {
        return this.tag;
    }

    public RunInstancesRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public RunInstancesRequest setUniqueSuffix(Boolean uniqueSuffix) {
        this.uniqueSuffix = uniqueSuffix;
        return this;
    }
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    public RunInstancesRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RunInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public RunInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class RunInstancesRequestCpuOptions extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * <p>&lt;props=&quot;china&quot;&gt;Default value: For more information, see <a href="https://help.aliyun.com/document_detail/145895.html">Customize CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Numa")
        public String numa;

        /**
         * <p>The number of threads per CPU core. The number of vCPUs of an ECS instance = <code>CpuOptions.Core</code> value × <code>CpuOptions.ThreadsPerCore</code> value.</p>
         * <ul>
         * <li><p><code>CpuOptions.ThreadsPerCore=1</code> indicates that hyper-threading is disabled.</p>
         * </li>
         * <li><p>Only specific instance types support custom CPU thread counts.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;For the valid values and default value, see <a href="https://help.aliyun.com/document_detail/145895.html">Custom CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        /**
         * <p>The CPU topology type of the instance. Valid values:</p>
         * <ul>
         * <li>ContinuousCoreToHTMapping: The hyper-threads (HTs) within the same core in the CPU topology of the instance are continuous.</li>
         * <li>DiscreteCoreToHTMapping: The HTs within the same core in the CPU topology of the instance are discrete.</li>
         * </ul>
         * <p>Default value: null.</p>
         * <blockquote>
         * <p>Only specific instance families support this parameter. For more information about the supported instance families, see <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify CPU topology</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DiscreteCoreToHTMapping</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("NestedVirtualization")
        public String nestedVirtualization;

        public static RunInstancesRequestCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestCpuOptions self = new RunInstancesRequestCpuOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestCpuOptions setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public RunInstancesRequestCpuOptions setNuma(String numa) {
            this.numa = numa;
            return this;
        }
        public String getNuma() {
            return this.numa;
        }

        public RunInstancesRequestCpuOptions setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        public RunInstancesRequestCpuOptions setTopologyType(String topologyType) {
            this.topologyType = topologyType;
            return this;
        }
        public String getTopologyType() {
            return this.topologyType;
        }

        public RunInstancesRequestCpuOptions setNestedVirtualization(String nestedVirtualization) {
            this.nestedVirtualization = nestedVirtualization;
            return this;
        }
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

    }

    public static class RunInstancesRequestHibernationOptions extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Configured")
        public Boolean configured;

        public static RunInstancesRequestHibernationOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestHibernationOptions self = new RunInstancesRequestHibernationOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestHibernationOptions setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

    }

    public static class RunInstancesRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The private pool ID, which is the ID of the elasticity assurance or capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The private pool options for instance startup. A private pool is generated after an elasticity assurance or capacity reservation takes effect. You can select a private pool when you start an instance. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static RunInstancesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestPrivatePoolOptions self = new RunInstancesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RunInstancesRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class RunInstancesRequestSchedulerOptions extends TeaModel {
        /**
         * <p>The ID of the dedicated host cluster to which the ECS instance belongs. The system automatically selects a dedicated host in the cluster to deploy the ECS instance.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <code>Tenancy</code> is set to <code>host</code>.</p>
         * </blockquote>
         * <p>If you specify both a dedicated host (<code>DedicatedHostId</code>) and a dedicated host cluster (<code>SchedulerOptions.DedicatedHostClusterId</code>):</p>
         * <ul>
         * <li>If the dedicated host belongs to the dedicated host cluster, the ECS instance is preferentially deployed on the specified dedicated host.</li>
         * <li>If the dedicated host does not belong to the dedicated host cluster, the ECS instance fails to be created.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a> to query the list of dedicated host cluster IDs.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a> to query the list of dedicated host cluster IDs.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a> to query the list of dedicated host cluster IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-bp12wlf6am0vz9v2****</p>
         */
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        public static RunInstancesRequestSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestSchedulerOptions self = new RunInstancesRequestSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestSchedulerOptions setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

    }

    public static class RunInstancesRequestSecurityOptions extends TeaModel {
        /**
         * <p>The confidential computing mode. Valid value: Enclave.</p>
         * 
         * <strong>example:</strong>
         * <p>Enclave</p>
         */
        @NameInMap("ConfidentialComputingMode")
        public String confidentialComputingMode;

        /**
         * <p>The trusted system mode. Valid value: vTPM.</p>
         * 
         * <strong>example:</strong>
         * <p>vTPM</p>
         */
        @NameInMap("TrustedSystemMode")
        public String trustedSystemMode;

        @NameInMap("EnableSecureBoot")
        public Boolean enableSecureBoot;

        public static RunInstancesRequestSecurityOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestSecurityOptions self = new RunInstancesRequestSecurityOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestSecurityOptions setConfidentialComputingMode(String confidentialComputingMode) {
            this.confidentialComputingMode = confidentialComputingMode;
            return this;
        }
        public String getConfidentialComputingMode() {
            return this.confidentialComputingMode;
        }

        public RunInstancesRequestSecurityOptions setTrustedSystemMode(String trustedSystemMode) {
            this.trustedSystemMode = trustedSystemMode;
            return this;
        }
        public String getTrustedSystemMode() {
            return this.trustedSystemMode;
        }

        public RunInstancesRequestSecurityOptions setEnableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        public Boolean getEnableSecureBoot() {
            return this.enableSecureBoot;
        }

    }

    public static class RunInstancesRequestSystemDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy applied to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: enterprise SSD.</li>
         * <li>cloud: basic disk.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * </ul>
         * <p>Default value description:</p>
         * <ul>
         * <li>If InstanceType is set to a retired instance type that is not I/O optimized, the default value is <code>cloud</code>.</li>
         * <li>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, for instance types that support only cloud_essd, the default value is changed from cloud_efficiency to cloud_essd PL0. For more information, see <a href="https://www.aliyun.com/notice/117844">Change announcement</a>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter supports the <code>cloud_essd_entry</code> value only when <code>InstanceType</code> is set to the <a href="https://help.aliyun.com/document_detail/457079.html">u1, universal instance family</a> (<code>ecs.u1</code>) or the <a href="https://help.aliyun.com/document_detail/108489.html">e, economy instance family</a> (<code>ecs.e</code>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length and can contain characters from the Unicode letter category (including English and Chinese characters and digits). The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The performance level of the enterprise SSD (ESSD) used as the system disk. When you create an ESSD as the system disk, you can set the performance level of the disk. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>Basic disk: 20 to 500.</li>
         * <li>Enterprise SSD (ESSD):<ul>
         * <li>PL0: 1 to 2048.</li>
         * <li>PL1: 20 to 2048.</li>
         * <li>PL2: 461 to 2048.</li>
         * <li>PL3: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li>ESSD AutoPL disk: 1 to 2048.</li>
         * <li>Other disk types: 20 to 2048.</li>
         * </ul>
         * <p>The value of this parameter must be greater than or equal to max{1, ImageSize}.</p>
         * <p>Default value: max{40, size of the image specified by ImageId}.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

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
         * <p>China (Hong Kong) Zone D and Singapore Zone A do not support encrypting the system disk when you create an instance.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: When you use a shared encrypted image to create a disk based on an encrypted snapshot, you must set the Encrypted parameter to true for the disk to ensure that the created disk uses the key of the account with which the image is shared.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key for the system disk.</p>
         * <blockquote>
         * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption, and the KMSKeyId value is returned after the instance is created.</p>
         * <ul>
         * <li><ul>
         * <li>The disk is created from a non-shared encrypted snapshot: The encryption key used by the snapshot is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>The disk is created from a shared encrypted snapshot: The service key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>The disk is created in a region where block storage account-level default encryption is enabled: The specified account-level key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>Other cases: The service key is used by default.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × Capacity - baseline performance}.</p>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The ID of the dedicated block storage cluster. If you want to use a disk in a dedicated block storage cluster as the system disk when you create an ECS instance, specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-j5e1sf2vaf5he8m2****</p>
         */
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static RunInstancesRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestSystemDisk self = new RunInstancesRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestSystemDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public RunInstancesRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RunInstancesRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RunInstancesRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public RunInstancesRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public RunInstancesRequestSystemDisk setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public RunInstancesRequestSystemDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public RunInstancesRequestSystemDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public RunInstancesRequestSystemDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public RunInstancesRequestSystemDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public RunInstancesRequestSystemDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public RunInstancesRequestSystemDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class RunInstancesRequestArn extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static RunInstancesRequestArn build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestArn self = new RunInstancesRequestArn();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public RunInstancesRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public RunInstancesRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class RunInstancesRequestClockOptions extends TeaModel {
        /**
         * <p>The Precision Time Protocol (PTP) status. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PtpStatus")
        public String ptpStatus;

        public static RunInstancesRequestClockOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestClockOptions self = new RunInstancesRequestClockOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestClockOptions setPtpStatus(String ptpStatus) {
            this.ptpStatus = ptpStatus;
            return this;
        }
        public String getPtpStatus() {
            return this.ptpStatus;
        }

    }

    public static class RunInstancesRequestDataDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy to apply to the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <li>cloud_regional_disk_auto: regional Enterprise SSD (ESSD).</li>
         * <li>cloud_essd_entry: ESSD Entry disk.<blockquote>
         * <p>cloud_essd_entry is supported only when <code>InstanceType</code> is set to an instance type in the <code>ecs.u1</code> or <code>ecs.e</code> instance family.</p>
         * </blockquote>
         * </li>
         * <li>elastic_ephemeral_disk_standard: elastic ephemeral disk - Standard Edition.</li>
         * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - Premium Edition.</li>
         * </ul>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
         * Notes on default values:</p>
         * <ul>
         * <li>If InstanceType is set to a retired instance type that is not I/O optimized, the default value is <code>cloud</code>.</li>
         * <li>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, if the I/O optimized instance type does not support cloud_auto, the default value is cloud_efficiency. Otherwise, the default value is cloud_auto, and performance burst is enabled by default (which incurs additional fees. For more information, see <a href="~~368372#p_75k_2hp_7gp~~">Billing examples</a>). For more information, see <a href="https://www.aliyun.com/notice/117844">Change notice</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data disk when the instance is released. Valid values:</p>
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
         * <p>DataDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk. The naming conventions for mount points vary based on the number of data disks attached:</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length and can contain letters, digits, and characters that are supported by Unicode in the letter category. The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt data disk N. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key for the data disk.</p>
         * <blockquote>
         * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption, and the KMSKeyId value is returned after the instance is created.</p>
         * <ul>
         * <li><ul>
         * <li>The disk is created from a non-shared encrypted snapshot: The encryption key used by the snapshot is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>The disk is created from a shared encrypted snapshot: The service key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>The disk is created in a region where block storage account-level default encryption is enabled: The specified account-level key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>Other cases: The service key is used by default.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the data disk when you create an enterprise SSD as a data disk. The value of N must be the same as the N in <code>DataDisk.N.Category=cloud_essd</code>. Valid values:</p>
         * <ul>
         * <li>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1 (default): A single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For more information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × Capacity - baseline performance}.</p>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: 20 to 32768.</li>
         * <li>cloud_ssd: 20 to 32768.</li>
         * <li>cloud_essd: The valid values depend on the value of <code>DataDisk.N.PerformanceLevel</code>. <ul>
         * <li>PL0: 1 to 65,536.</li>
         * <li>PL1: 20 to 65,536.</li>
         * <li>PL2: 461 to 65,536.</li>
         * <li>PL3: 1261 to 65,536.</li>
         * </ul>
         * </li>
         * <li>cloud: 5 to 2000.</li>
         * <li>cloud_auto: 1 to 65,536.</li>
         * <li>cloud_essd_entry: 10 to 32768.</li>
         * </ul>
         * <blockquote>
         * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by <code>SnapshotId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The ID of the dedicated block storage cluster. If you want to use a disk in a dedicated block storage cluster as the data disk when you create an ECS instance, specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-j5e1sf2vaf5he8m2****</p>
         */
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static RunInstancesRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestDataDisk self = new RunInstancesRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestDataDisk setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public RunInstancesRequestDataDisk setBurstingEnabled(Boolean burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        public RunInstancesRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public RunInstancesRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public RunInstancesRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RunInstancesRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public RunInstancesRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public RunInstancesRequestDataDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public RunInstancesRequestDataDisk setEncrypted(String encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public String getEncrypted() {
            return this.encrypted;
        }

        public RunInstancesRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public RunInstancesRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public RunInstancesRequestDataDisk setProvisionedIops(Long provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }
        public Long getProvisionedIops() {
            return this.provisionedIops;
        }

        public RunInstancesRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public RunInstancesRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public RunInstancesRequestDataDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class RunInstancesRequestImageOptions extends TeaModel {
        /**
         * <p>Indicates whether instances that use this image support logon as the ecs-user user. Valid values:</p>
         * <ul>
         * <li><p>true: supported.</p>
         * </li>
         * <li><p>false: not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LoginAsNonRoot")
        public Boolean loginAsNonRoot;

        public static RunInstancesRequestImageOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestImageOptions self = new RunInstancesRequestImageOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestImageOptions setLoginAsNonRoot(Boolean loginAsNonRoot) {
            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public Boolean getLoginAsNonRoot() {
            return this.loginAsNonRoot;
        }

    }

    public static class RunInstancesRequestNetworkInterface extends TeaModel {
        /**
         * <p>Specifies whether to retain the network interface when the instance is released. Valid values:</p>
         * <ul>
         * <li><p>true: The network interface is not retained.</p>
         * </li>
         * <li><p>false: The network interface is retained.</p>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p>This parameter takes effect only on secondary ENIs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteOnRelease")
        public Boolean deleteOnRelease;

        /**
         * <p>The description of the network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>Network_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the network interface controller (NIC). The valid values of N cannot exceed the number of network interface controllers (NICs) supported by the instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the number of network interface controllers (NICs) supported by the target instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>Secondary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Specifies one or more IPv6 addresses for the primary ENI. You can specify up to 10 IPv6 addresses. Valid values of the second N: 1 to 10.</p>
         * <p>Example: <code>Ipv6Address.1=2001:db8:1234:1a00::***</code></p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>This parameter takes effect only when <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>. If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter cannot be specified.</p>
         * </li>
         * <li><p>If you specify this parameter, <code>Amount</code> can only be set to 1, and you cannot specify <code>Ipv6AddressCount</code>, <code>Ipv6Address.N</code>, or <code>NetworkInterface.N.Ipv6AddressCount</code>.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Ipv6Address")
        public java.util.List<String> ipv6Address;

        /**
         * <p>The number of randomly generated IPv6 addresses for the primary ENI. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Long ipv6AddressCount;

        /**
         * <p>The index of the physical network card specified for the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetworkCardIndex")
        public Integer networkCardIndex;

        /**
         * <p>The ID of the Elastic Network Interface (ENI) to attach to the instance.</p>
         * <p>If you set this parameter, the value of <code>Amount</code> can only be 1.</p>
         * <blockquote>
         * <p>This parameter takes effect only for secondary ENIs. After you specify an existing secondary ENI, you cannot configure other ENI creation parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1gn106np8jhxhj****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The name of the network interface controller (NIC). The name must be 2 to 128 characters in length and can contain letters, digits, and characters that are supported by Unicode in the letter categorization. The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>Network_Name</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The communication mode of the ENI. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>Adds a network interface controller (NIC) and sets the primary IP address.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.16.**.**</code></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The number of queues supported by the ENI.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The value of N cannot exceed the maximum number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the maximum number of ENIs supported by the target instance type.</p>
         * </li>
         * <li><p>The value cannot exceed the maximum number of queues per ENI allowed by the instance type.</p>
         * </li>
         * <li><p>The total number of queues across all ENIs on the instance cannot exceed the total queue quota allowed by the instance type. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the MaximumQueueNumberPerEni and TotalEniQueueQuantity fields for the maximum number of queues per ENI and the total queue quota of the instance type.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary and this parameter is specified, you cannot specify the NetworkInterfaceQueueNumber parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of queue pairs for the RDMA network interface.</p>
         * <p>If you want to attach multiple RDMA network interfaces to the instance being created, we recommend that you manually specify QueuePairNumber for each network interface based on the upper limit of <code>QueuePairNumber</code> supported by the instance type and the number of network interfaces you plan to use. Ensure that the total QueuePairNumber across all network interfaces does not exceed the maximum value allowed by the instance type. Call <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the upper limits of the instance type.</p>
         * <blockquote>
         * <p>Notice: If QueuePairNumber is not specified for an RDMA network interface, the upper limit of QueuePairNumber for all RDMA network interfaces supported by the instance type is used by default. Therefore, once an RDMA network interface without QueuePairNumber specified is attached, no more RDMA network interfaces can be added (regular network interfaces are not affected by this restriction).</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueuePairNumber")
        public Long queuePairNumber;

        /**
         * <p>The inbound queue depth of the network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

        /**
         * <p>The number of secondary private IPv4 addresses to assign to the network interface. Valid values: 1 to 49.</p>
         * <ul>
         * <li>The value cannot exceed the maximum number of IP addresses allowed for the instance type. For more information, see <a href="~~~25378~~">Instance families</a>.</li>
         * <li>NetworkInterface.N.SecondaryPrivateIpAddressCount specifies the number of secondary private IPv4 addresses to assign to the network interface (excluding the primary private IP address of the network interface). The system randomly assigns IP addresses from the available CIDR block of the vSwitch (NetworkInterface.N.VSwitchId) to which the network interface belongs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The ID of the security group to which the network interface controller (NIC) belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>One or more security group IDs to which the ENI belongs.</p>
         * <ul>
         * <li>The valid values of N for the first dimension do not exceed the number of ENIs supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the number of ENIs supported by the target instance type.</li>
         * <li>The second N indicates that you can specify one or more security group IDs. The valid values of N are related to the quota for the number of security groups to which an instance can belong. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must specify this parameter or <code>NetworkInterface.N.SecurityGroupId</code>. In this case, this parameter has the same effect as <code>SecurityGroupIds.N</code>, but you cannot specify <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupId</code> at the same time.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. Default value: the security group to which the ECS instance belongs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg7****</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>Specifies whether to enable source/destination checking. We recommend that you enable this feature to improve network security. Valid values:</p>
         * <ul>
         * <li><p>true: enabled.</p>
         * </li>
         * <li><p>false: disabled.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>Only some regions support this feature. Before you use this feature, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source/destination checking</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SourceDestCheck")
        public Boolean sourceDestCheck;

        /**
         * <p>The outbound queue depth of the network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("TxQueueSize")
        public Integer txQueueSize;

        /**
         * <p>The ID of the vSwitch to which the network interface controller (NIC) belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp67acfmxazb4p****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static RunInstancesRequestNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestNetworkInterface self = new RunInstancesRequestNetworkInterface();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestNetworkInterface setDeleteOnRelease(Boolean deleteOnRelease) {
            this.deleteOnRelease = deleteOnRelease;
            return this;
        }
        public Boolean getDeleteOnRelease() {
            return this.deleteOnRelease;
        }

        public RunInstancesRequestNetworkInterface setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RunInstancesRequestNetworkInterface setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public RunInstancesRequestNetworkInterface setIpv6Address(java.util.List<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public java.util.List<String> getIpv6Address() {
            return this.ipv6Address;
        }

        public RunInstancesRequestNetworkInterface setIpv6AddressCount(Long ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }
        public Long getIpv6AddressCount() {
            return this.ipv6AddressCount;
        }

        public RunInstancesRequestNetworkInterface setNetworkCardIndex(Integer networkCardIndex) {
            this.networkCardIndex = networkCardIndex;
            return this;
        }
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

        public RunInstancesRequestNetworkInterface setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public RunInstancesRequestNetworkInterface setNetworkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = networkInterfaceName;
            return this;
        }
        public String getNetworkInterfaceName() {
            return this.networkInterfaceName;
        }

        public RunInstancesRequestNetworkInterface setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public RunInstancesRequestNetworkInterface setPrimaryIpAddress(String primaryIpAddress) {
            this.primaryIpAddress = primaryIpAddress;
            return this;
        }
        public String getPrimaryIpAddress() {
            return this.primaryIpAddress;
        }

        public RunInstancesRequestNetworkInterface setQueueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        public RunInstancesRequestNetworkInterface setQueuePairNumber(Long queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }
        public Long getQueuePairNumber() {
            return this.queuePairNumber;
        }

        public RunInstancesRequestNetworkInterface setRxQueueSize(Integer rxQueueSize) {
            this.rxQueueSize = rxQueueSize;
            return this;
        }
        public Integer getRxQueueSize() {
            return this.rxQueueSize;
        }

        public RunInstancesRequestNetworkInterface setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
            this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
            return this;
        }
        public Integer getSecondaryPrivateIpAddressCount() {
            return this.secondaryPrivateIpAddressCount;
        }

        public RunInstancesRequestNetworkInterface setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public RunInstancesRequestNetworkInterface setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public RunInstancesRequestNetworkInterface setSourceDestCheck(Boolean sourceDestCheck) {
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }
        public Boolean getSourceDestCheck() {
            return this.sourceDestCheck;
        }

        public RunInstancesRequestNetworkInterface setTxQueueSize(Integer txQueueSize) {
            this.txQueueSize = txQueueSize;
            return this;
        }
        public Integer getTxQueueSize() {
            return this.txQueueSize;
        }

        public RunInstancesRequestNetworkInterface setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class RunInstancesRequestNetworkOptions extends TeaModel {
        /**
         * <p>The bandwidth weight value of the instance. The valid values vary by instance type. To query the supported bandwidth weight levels for a specific instance type, call DescribeInstanceTypes. The BandwidthWeighting field in the response indicates the supported bandwidth weight levels. You can use the name field in the returned values as the dictionary value, such as Vpc-L1 or Ebs-L1.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("BandwidthWeighting")
        public String bandwidthWeighting;

        /**
         * <p>Specifies whether to enable the Jumbo Frame feature for the instance. Valid values:</p>
         * <ul>
         * <li><p>false: does not enable Jumbo Frame. The MTU of all NICs (including the primary ENI and secondary ENIs) on the instance is set to 1500.</p>
         * </li>
         * <li><p>true: enables Jumbo Frame. The MTU of all NICs (including the primary ENI and secondary ENIs) on the instance is set to 8500.</p>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p>Only some instance types of the eighth generation or later support the Jumbo Frame feature. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">ECS instance MTU</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableJumboFrame")
        public Boolean enableJumboFrame;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         */
        @NameInMap("EnableNetworkEncryption")
        public Boolean enableNetworkEncryption;

        public static RunInstancesRequestNetworkOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestNetworkOptions self = new RunInstancesRequestNetworkOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestNetworkOptions setBandwidthWeighting(String bandwidthWeighting) {
            this.bandwidthWeighting = bandwidthWeighting;
            return this;
        }
        public String getBandwidthWeighting() {
            return this.bandwidthWeighting;
        }

        public RunInstancesRequestNetworkOptions setEnableJumboFrame(Boolean enableJumboFrame) {
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }
        public Boolean getEnableJumboFrame() {
            return this.enableJumboFrame;
        }

        public RunInstancesRequestNetworkOptions setEnableNetworkEncryption(Boolean enableNetworkEncryption) {
            this.enableNetworkEncryption = enableNetworkEncryption;
            return this;
        }
        public Boolean getEnableNetworkEncryption() {
            return this.enableNetworkEncryption;
        }

    }

    public static class RunInstancesRequestPrivateDnsNameOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable DNS AAAA record resolution from the instance ID-based domain name to IPv6. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableInstanceIdDnsAAAARecord")
        public Boolean enableInstanceIdDnsAAAARecord;

        /**
         * <p>Specifies whether to enable DNS resolution from the instance ID-based domain name to the IPv4 address. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsARecord")
        public Boolean enableInstanceIdDnsARecord;

        /**
         * <p>Specifies whether to enable DNS resolution from IP-based domain names to IPv4 addresses. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIpDnsARecord")
        public Boolean enableIpDnsARecord;

        /**
         * <p>Specifies whether to enable reverse DNS resolution from IPv4 addresses to IP-type domain names. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIpDnsPtrRecord")
        public Boolean enableIpDnsPtrRecord;

        /**
         * <p>The hostname type. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("HostnameType")
        public String hostnameType;

        public static RunInstancesRequestPrivateDnsNameOptions build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestPrivateDnsNameOptions self = new RunInstancesRequestPrivateDnsNameOptions();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestPrivateDnsNameOptions setEnableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
            this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
            return this;
        }
        public Boolean getEnableInstanceIdDnsAAAARecord() {
            return this.enableInstanceIdDnsAAAARecord;
        }

        public RunInstancesRequestPrivateDnsNameOptions setEnableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
            this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
            return this;
        }
        public Boolean getEnableInstanceIdDnsARecord() {
            return this.enableInstanceIdDnsARecord;
        }

        public RunInstancesRequestPrivateDnsNameOptions setEnableIpDnsARecord(Boolean enableIpDnsARecord) {
            this.enableIpDnsARecord = enableIpDnsARecord;
            return this;
        }
        public Boolean getEnableIpDnsARecord() {
            return this.enableIpDnsARecord;
        }

        public RunInstancesRequestPrivateDnsNameOptions setEnableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
            this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
            return this;
        }
        public Boolean getEnableIpDnsPtrRecord() {
            return this.enableIpDnsPtrRecord;
        }

        public RunInstancesRequestPrivateDnsNameOptions setHostnameType(String hostnameType) {
            this.hostnameType = hostnameType;
            return this;
        }
        public String getHostnameType() {
            return this.hostnameType;
        }

    }

    public static class RunInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key for the instance, disks, and primary ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. The tag key cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value for the instance, disks, and primary ENI. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static RunInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunInstancesRequestTag self = new RunInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public RunInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
