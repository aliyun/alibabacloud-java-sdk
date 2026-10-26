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
     * <ul>
     * <li><p>default: The instance is not associated with the dedicated host. If an instance in economical mode is stopped and then started, and the available resources on the original dedicated host are insufficient, the instance is placed on another dedicated host in the automatic deployment resource pool.</p>
     * </li>
     * <li><p>host: The instance is associated with the dedicated host. If an instance in economical mode is stopped and then started, it is still placed on the original dedicated host. If the available resources on the original dedicated host are insufficient, the instance fails to restart.</p>
     * </li>
     * </ul>
     * <p>Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The number of ECS instances to create. Valid values: 1 to 100.</p>
     * <p>The number of successfully created ECS instances depends on the specified Amount and minAmount values:</p>
     * <ul>
     * <li><p>If minAmount is not specified: The system creates instances based on the Amount value. If the inventory is insufficient, the API returns a creation failure, and no instances are created.</p>
     * </li>
     * <li><p>If minAmount is specified:</p>
     * <ul>
     * <li>If the ECS inventory is less than minAmount: No ECS instances are created, and the API returns a creation failure.</li>
     * <li>If minAmount is less than or equal to the ECS inventory and the ECS inventory is less than Amount: Instances are created based on the inventory, and the API returns a creation success.</li>
     * <li>If the ECS inventory is greater than or equal to Amount: Instances are created based on the specified Amount, and the API returns a creation success.</li>
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
     * <p>This parameter is not available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<RunInstancesRequestArn> arn;

    /**
     * <p>Specifies whether to automatically pay for the instance when you create it. Valid values:</p>
     * <ul>
     * <li><p>true: Automatic payment is enabled.</p>
     * <blockquote>
     * <p>If you enable automatic payment, make sure that your payment method has sufficient balance. Otherwise, an abnormal order is generated and can only be canceled. If your payment method has insufficient balance, you can set the <code>AutoPay</code> parameter to false. In this case, an unpaid order is generated, and you can log on to the ECS console to pay for the order.</p>
     * </blockquote>
     * </li>
     * <li><p>false: Only an order is generated, and no fee is deducted.</p>
     * <blockquote>
     * <p>If <code>InstanceChargeType</code> is set to <code>PostPaid</code>, you cannot set <code>AutoPay</code> to false.</p>
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
     * <p>The automatic release time of the pay-as-you-go instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <ul>
     * <li><p>If the seconds (ss) value is not 00, the release time is automatically rounded down to the current minute (mm).</p>
     * </li>
     * <li><p>The earliest release time is half an hour after the current time.</p>
     * </li>
     * <li><p>The latest release time cannot be more than three years after the current time.
     * <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2018-01-01T12:05:00Z</p>
     */
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the InstanceChargeType parameter is set to PrePaid. Valid values:</p>
     * <ul>
     * <li>true: Enables auto-renewal.</li>
     * <li>false: Disables auto-renewal.</li>
     * </ul>
     * <p>Default value: false.</p>
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
     * <li>When PeriodUnit is set to Week: 1, 2, and 3.</li>
     * <li>When PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;When PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The clock attribute parameters of the instance.</p>
     */
    @NameInMap("ClockOptions")
    public RunInstancesRequestClockOptions clockOptions;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li>Standard: standard mode. For more information about the instance performance, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * <li>Unlimited: unlimited mode. For more information about the instance performance, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The list of data cloud disk information.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

    /**
     * <p>The ID of the dedicated host.
     * &lt;props=&quot;china&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the list of dedicated host IDs.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the list of dedicated host IDs.</p>
     * <blockquote>
     * <p>Notice: Dedicated hosts do not support the creation of spot instances. After you specify the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit settings in the request are automatically ignored.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The release protection attribute of the instance. It specifies whether the instance can be released through the console or API (<a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a>). Valid values: </p>
     * <ul>
     * <li>true: Enables release protection for the instance.</li>
     * <li>false: Disables release protection for the instance.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This attribute applies only to pay-as-you-go instances and restricts only manual release operations. It does not take effect on system release operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The group number of the instance in the deployment set. You can specify this parameter if the deployment set uses the high availability group strategy (AvailabilityGroup). Valid values: 1 to 7.</p>
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
     * <p>The instance description. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance_Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to pre-check the request. Valid values:</p>
     * <ul>
     * <li>true: Sends a check request. No instances are created. The system checks whether required parameters are specified, the request format, service limits, and ECS inventory. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</li>
     * <li>false (default): Sends a normal request. Instances are created directly after the check succeeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The hostname of the instance. Limits:</p>
     * <ul>
     * <li>The hostname cannot start or end with a period (.) or a hyphen (-), and cannot contain consecutive periods (.) or hyphens (-).</li>
     * <li>For Windows instances: The hostname must be 2 to 15 characters in length. It cannot contain periods (.) and cannot contain only digits. It can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
     * <li>For other operating systems such as Linux:<ul>
     * <li>The hostname must be 2 to 64 characters in length. It can contain multiple periods (.). The string between two consecutive periods is a segment, which can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
     * <li>You can use the ${instance_id} placeholder to write the instance ID into the HostName parameter. For example, if HostName is set to k8s-${instance_id} and the created ECS instance ID is i-123abc****, the hostname of the instance is k8s-i-123abc****.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>When you create multiple ECS instances, you can:</p>
     * <ul>
     * <li>Specify sequential hostnames in batches. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Specify sequential instance names or hostnames</a>.</li>
     * <li>Use the HostNames.N parameter to specify hostnames for multiple instances separately. Note that you cannot specify both HostName and HostNames.N at the same time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-ecshost</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>Specifies different hostnames for each instance when you create multiple instances.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-host-01</p>
     */
    @NameInMap("HostNames")
    public java.util.List<String> hostNames;

    /**
     * <p>The ID of the HPC cluster to which the instance belongs. </p>
     * <p>This parameter is required when you create an SCC instance. You can call the <a href="https://help.aliyun.com/document_detail/109138.html">CreateHpcCluster</a> operation to create an HPC cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>hpc-bp67acfmxazb4p****</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
     * <ul>
     * <li>enabled: Enables the access channel.</li>
     * <li>disabled: Disables the access channel.</li>
     * </ul>
     * <p>Default value: enabled.</p>
     * <blockquote>
     * <p>For more information about instance metadata, see <a href="https://help.aliyun.com/document_detail/49122.html">Overview of instance metadata</a>.</p>
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
     * <p>0</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether to forcibly use the security hardening mode (IMDSv2) when accessing instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: Does not forcibly use the security hardening mode.</li>
     * <li>required: Forcibly uses the security hardening mode. After this value is set, instance metadata cannot be accessed in normal mode.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes for accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/150575.html">Instance metadata access modes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. You can set this parameter to use the latest available image in the specified image family to create the instance.</p>
     * <p>The name must be 2 to 128 characters in length. It cannot start with a special character, digit, http://, or https://. It can contain only the following special characters: periods (.), underscores (_), hyphens (-), and colons (:).</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>If ImageId is specified, you cannot specify this parameter.</li>
     * <li>If ImageId is not specified but the launch template specified by LaunchTemplateId or LaunchTemplateName has ImageId configured, you cannot specify this parameter.</li>
     * <li>If ImageId is not specified and the launch template specified by LaunchTemplateId or LaunchTemplateName does not have ImageId configured, you can specify this parameter.</li>
     * <li>If neither ImageId nor LaunchTemplateId and LaunchTemplateName are specified, you can specify this parameter.<blockquote>
     * <p>For information about the image families associated with Alibaba Cloud official images, see <a href="https://help.aliyun.com/document_detail/108393.html">Public images</a>.</p>
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
     * <p>The image ID. This parameter specifies the image resource used to start the instance. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query available image resources. If you do not specify LaunchTemplateId or LaunchTemplateName to determine a launch template, and you do not specify ImageFamily to use the latest available image in an image family, ImageId is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_2_1903_x64_20G_alibase_20200324.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image attribute information.</p>
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
     * <p>&lt;props=&quot;china&quot;&gt;If you select subscription, you must ensure that your account supports balance payment or credit payment. Otherwise, an InvalidPayMethod error is returned.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;If you select subscription, you must ensure that your account supports credit payment. Otherwise, an InvalidPayMethod error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance name. The name must be 2 to 128 characters in length. It can contain letters and digits in Unicode, and can include colons (:), underscores (_), periods (.), and hyphens (-). The default value is the InstanceId of the instance.</p>
     * <p>When you create multiple ECS instances, you can specify sequential instance names in batches. The names can contain square brackets ([]) and commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Specify sequential instance names or hostnames</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-alibabacloud</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. If you do not specify LaunchTemplateId or LaunchTemplateName to determine a launch template, InstanceType is a required parameter.  </p>
     * <ul>
     * <li>Instance type selection: For more information about the performance data of the target instance type, see <a href="https://help.aliyun.com/document_detail/25378.html">instance family</a> or call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a>. For more information about how to select an instance type, see <a href="https://help.aliyun.com/document_detail/58291.html">Best practices for instance type selection</a>.</li>
     * <li>Inventory query: Call <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> to view the active resources in a specified region or zone.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network billing method. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth.</li>
     * <li>PayByTraffic: pay-by-traffic.</li>
     * </ul>
     * <p>Default value: PayByTraffic.</p>
     * <blockquote>
     * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are upper limits and are not guaranteed service level indicators. During resource contention, the peak bandwidths may be limited. If your business requires guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
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
     * <li>If the purchased outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of InternetMaxBandwidthOut. Default value: the value of InternetMaxBandwidthOut.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>Specifies whether the instance is an I/O optimized instance. The default value is none for <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a> and optimized for other instance types. Valid values:</p>
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
     * <p>Specifies one or more IPv6 addresses for the primary ENI. You can specify up to 10 IPv6 addresses. Valid values of N: 1 to 10.</p>
     * <p>Example: <code>Ipv6Address.1=2001:db8:1234:1a00::***</code>.</p>
     * <p>Note:</p>
     * <ul>
     * <li><p>If you specify <code>Ipv6Address.N</code>, the value of the <code>Amount</code> parameter can only be 1, and you cannot specify <code>Ipv6AddressCount</code> at the same time.</p>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot specify <code>Ipv6Addresses.N</code> or <code>Ipv6AddressCount</code>. Instead, you must specify <code>NetworkInterface.N.Ipv6Addresses.N</code> or <code>NetworkInterface.N.Ipv6AddressCount</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ipv6Address.1=2001:db8:1234:1a00::***</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The number of IPv6 addresses to be randomly generated for the primary ENI. Valid values: 1 to 10.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>You cannot specify both Ipv6Address.N and Ipv6AddressCount.</p>
     * </li>
     * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you cannot specify Ipv6Address.N or Ipv6AddressCount. You can only specify NetworkInterface.N.Ipv6Address.N or NetworkInterface.N.Ipv6AddressCount.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not available for public use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The name of the key pair.</p>
     * <blockquote>
     * <p>For Windows instances, this parameter is ignored. The default value is empty. Even if this parameter is specified, only the Password parameter takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>KeyPair_Name</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The ID of the launch template. For more information, call the <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a> operation.</p>
     * <p>When you use a launch template to create an instance, you must specify LaunchTemplateId or LaunchTemplateName to determine the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-bp1apo0bbbkuy0rj****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The name of the launch template.</p>
     * <p>When you use a launch template to create an instance, you must specify LaunchTemplateId or LaunchTemplateName to determine the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>LaunchTemplate_Name</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    /**
     * <p>The version of the launch template. If you specify LaunchTemplateId or LaunchTemplateName but do not specify the launch template version, the default version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public Long launchTemplateVersion;

    /**
     * <p>The unique identifier of the managed host, such as mh-f2d3647ca21****.</p>
     * 
     * <strong>example:</strong>
     * <p>mh-f2d3647ca21****</p>
     */
    @NameInMap("ManagedHostId")
    public String managedHostId;

    /**
     * <p>The minimum quantity of ECS instances to create. Valid values: 1 to 100.</p>
     * <p>The number of created ECS instances depends on the specified Amount and MinAmount values:</p>
     * <ul>
     * <li><p>If MinAmount is not specified: Instances are created based on the Amount value. If the inventory is insufficient, the API returns a creation failure, and no instances are created.</p>
     * </li>
     * <li><p>If MinAmount is specified:</p>
     * <ul>
     * <li>If the ECS inventory is less than MinAmount: No ECS instances are created, and the API returns a creation failure.</li>
     * <li>If MinAmount is less than or equal to the ECS inventory and the ECS inventory is less than Amount: Instances are created based on the inventory, and the API returns a creation success.</li>
     * <li>If the ECS inventory is greater than or equal to Amount: Instances are created based on the specified Amount value, and the API returns a creation success.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinAmount")
    public Integer minAmount;

    /**
     * <p>The elastic network interface (ENI) information.</p>
     */
    @NameInMap("NetworkInterface")
    public java.util.List<RunInstancesRequestNetworkInterface> networkInterface;

    /**
     * <p>The number of queues for the primary ENI. Take note of the following items:</p>
     * <ul>
     * <li><p>The value cannot exceed the maximum number of queues per ENI allowed by the instance type.</p>
     * </li>
     * <li><p>The total number of queues for all ENIs of the instance cannot exceed the total queue quota allowed by the instance type. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the MaximumQueueNumberPerEni and TotalEniQueueQuantity fields for the maximum number of queues per ENI and the total quota of the instance type.</p>
     * </li>
     * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you cannot set NetworkInterfaceQueueNumber. You can only set NetworkInterface.N.QueueNumber.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("NetworkInterfaceQueueNumber")
    public Integer networkInterfaceQueueNumber;

    /**
     * <p>The network attribute parameters.</p>
     */
    @NameInMap("NetworkOptions")
    public RunInstancesRequestNetworkOptions networkOptions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The instance password. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The special characters can be:</p>
     * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>If you specify the Password parameter, send the request over HTTPS to prevent password leaks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EcsV587!</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the preset password of the image. Valid values:</p>
     * <ul>
     * <li>true: Uses the preset password.</li>
     * <li>false: Does not use the preset password.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If you specify this parameter, the Password parameter must be left empty. Make sure that the image you use has a preset password.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription duration of the resource. The unit is specified by PeriodUnit. This parameter takes effect and is required only when the InstanceChargeType parameter is set to PrePaid. If DedicatedHostId is specified, the subscription duration cannot exceed the subscription duration of the dedicated host. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>When PeriodUnit is set to Week, valid values of Period are 1, 2, 3, and 4.</li>
     * <li>When PeriodUnit is set to Month, valid values of Period are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;When PeriodUnit is set to Month, valid values of Period are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The time unit for the subscription billing method. Valid values: </p>
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
     * <p>The private domain name configuration information of the instance.</p>
     * <p>For more information about private private domain resolution, see <a href="https://help.aliyun.com/document_detail/2844797.html">Private private domain resolution for ECS</a>.</p>
     */
    @NameInMap("PrivateDnsNameOptions")
    public RunInstancesRequestPrivateDnsNameOptions privateDnsNameOptions;

    /**
     * <p>The private IP address of the instance. When you specify system reserved IP address for a VPC-type ECS instance, the IP address must be selected from the idle CIDR block of the vSwitch (VSwitchId).</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>After PrivateIpAddress is specified:</p>
     * <ul>
     * <li>If the Amount parameter is set to 1, system reserved IP address is assigned to the single ECS instance created.</li>
     * <li>If the Amount parameter is greater than 1, consecutive private IP addresses starting from the specified private IP address are assigned to the multiple ECS instances created in batches. Note that in this case, you cannot bind secondary ENIs to the instances (that is, you cannot specify parameters such as NetworkInterface.N.*).</li>
     * </ul>
     * </li>
     * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you cannot specify PrivateIpAddress. You can only specify NetworkInterface.N.PrimaryIpAddress.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The first and the last three IP addresses of each vSwitch are reserved by the system and cannot be specified.
     * For example, if the CIDR block of the vSwitch is 192.168.1.0/24, the four IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved by the system.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><code>10.1.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the instance RAM role. You can use the RAM API operation <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query the instance RAM roles that you have created.</p>
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
     * <ul>
     * <li>Active: Enables security hardening. This value takes effect only for public images.</li>
     * <li>Deactive: Disables security hardening. This value takes effect for all image types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which the new instance belongs. Instances in the same security group can communicate with each other. The maximum number of instances that a security group can contain depends on the security group type. For more information, see the &quot;Security group limits&quot; section in <a href="~~25412#SecurityGroupQuota~~">Limits</a>.</p>
     * <blockquote>
     * <p>SecurityGroupId determines the network type of the instance. For example, if the network type of the specified security group is VPC, the instance is a VPC-type instance, and you must also specify the VSwitchId parameter.</p>
     * </blockquote>
     * <p>If you do not specify LaunchTemplateId or LaunchTemplateName to determine a launch template, the security group ID is required. Take note of the following items:</p>
     * <ul>
     * <li><p>You can specify one security group by using SecurityGroupId, or specify one or more security groups by using SecurityGroupIds.N. However, you cannot specify both SecurityGroupId and SecurityGroupIds.N at the same time.</p>
     * </li>
     * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you cannot specify SecurityGroupId or SecurityGroupIds.N. You can only specify NetworkInterface.N.SecurityGroupId or NetworkInterface.N.SecurityGroupIds.N.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Adds the instance to multiple security groups at the same time. The valid values of N depend on the quota of security groups that the instance can join. For more information, see <a href="https://help.aliyun.com/document_detail/101348.html">Security group limits</a>.</p>
     * <p>Note:</p>
     * <ul>
     * <li>You cannot specify both SecurityGroupId and SecurityGroupIds.N at the same time.</li>
     * <li>If NetworkInterface.N.InstanceType is set to Primary, you cannot specify SecurityGroupId or SecurityGroupIds.N. You can only specify NetworkInterface.N.SecurityGroupId or NetworkInterface.N.SecurityGroupIds.N.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7****</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Valid values:</p>
     * <ul>
     * <li>1: Alibaba Cloud guarantees that the instance runs for 1 hour after creation and is not automatically released. After 1 hour, the system compares the bid price with the marketplace price and checks the resource inventory in real time to determine whether to retain or release the instance.</li>
     * <li>0: Alibaba Cloud does not guarantee the runtime of the instance after creation. The system compares the bid price with the marketplace price and checks the resource inventory in real time to determine whether to retain or release the instance.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter can only be set to 0 or 1.</li>
     * <li>Spot instances are billed by the second. We recommend that you select an appropriate protection period based on the execution duration of your specific task.</li>
     * <li>Alibaba Cloud sends you a notification through an ECS system event 5 minutes before the instance is released.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The break mode of the spot instance. Valid values:</p>
     * <ul>
     * <li><p>Terminate: Releases the instance.</p>
     * </li>
     * <li><p>Stop: Puts the instance into economical mode.</p>
     * <p>For more information about economical mode, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode for pay-as-you-go instances</a>.</p>
     * </li>
     * </ul>
     * <p>Default value: Terminate.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminate</p>
     */
    @NameInMap("SpotInterruptionBehavior")
    public String spotInterruptionBehavior;

    /**
     * <p>The maximum hourly price of the instance. The value can have up to three decimal places. This parameter takes effect only when the SpotStrategy parameter is set to SpotWithPriceLimit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.97</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the pay-as-you-go instance. This parameter takes effect only when the InstanceChargeType parameter is set to PostPaid. Valid values:</p>
     * <ul>
     * <li>NoSpot: regular pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: spot instance with a maximum price limit.</li>
     * <li>SpotAsPriceGo: spot instance for which the system automatically places bids based on the current market price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The ID of the storage set.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-bp67acfmxazb4p****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The maximum number of partitions in the storage set. Valid values: integers greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The tag information of the instance, cloud disks, and primary ENI.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunInstancesRequestTag> tag;

    /**
     * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
     * <ul>
     * <li><p>default: Creates the instance on a non-dedicated host.</p>
     * </li>
     * <li><p>host: Creates the instance on a dedicated host. If you do not specify DedicatedHostId, Alibaba Cloud automatically selects a dedicated host for the instance.</p>
     * </li>
     * </ul>
     * <p>Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>Specifies whether to automatically append sequential suffixes to HostName and InstanceName when you create multiple instances. The sequential suffix starts from 001 and increments up to 999. Valid values:</p>
     * <ul>
     * <li>true: Appends sequential suffixes.</li>
     * <li>false: Does not append sequential suffixes.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>If HostName or InstanceName is set in a specified sorting format without the name_suffix naming suffix, meaning the naming format is name_prefix[begin_number,bits], UniqueSuffix does not take effect, and the names are sorted only in the specified order.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Specify sequential instance names or hostnames</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    /**
     * <p>Instance user data of the instance. The data must be Base64-encoded. The size of instance user data cannot exceed 32 KB before Base64 encoding.</p>
     * <p>For more information about the limits, format, and execution frequency of user data, see <a href="https://help.aliyun.com/document_detail/49121.html">User data</a>.</p>
     * <blockquote>
     * <p>To ensure the security of UserData during transmission, avoid sending sensitive data such as passwords and private keys in plaintext. If you need to transmit such information, we recommend that you encrypt the data first, encode it in Base64, and then decrypt it inside the instance to ensure information security.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The vSwitch ID. If you create a VPC-type ECS instance, you must specify a vSwitch ID. The security group and the vSwitch must belong to the same VPC. You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query information about existing vSwitches.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>If you specify the VSwitchId parameter, the ZoneId parameter must be set to the zone where the vSwitch resides. You can also leave ZoneId unspecified, and the system automatically selects the zone where the specified vSwitch resides.</p>
     * </li>
     * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you cannot specify VSwitchId. You can only specify NetworkInterface.N.VSwitchId.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the zone list.</p>
     * <blockquote>
     * <p>If you specify the VSwitchId parameter, the ZoneId parameter must be set to the zone where the vSwitch resides. You can also leave the ZoneId parameter unspecified, and the system automatically selects the zone where the specified vSwitch resides.</p>
     * </blockquote>
     * <p>Default value: The system automatically selects a zone.</p>
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

    public RunInstancesRequest setManagedHostId(String managedHostId) {
        this.managedHostId = managedHostId;
        return this;
    }
    public String getManagedHostId() {
        return this.managedHostId;
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
         * <p>The number of CPU threads. The number of vCPUs of the ECS instance = CpuOptions.Core value × CpuOptions.ThreadsPerCore value.</p>
         * <ul>
         * <li><p>CpuOptions.ThreadsPerCore=1 indicates that CPU hyper-threading is disabled.</p>
         * </li>
         * <li><p>Only specific instance types support the configuration of the number of CPU threads.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;Valid values and default value: For more information, see <a href="https://help.aliyun.com/document_detail/145895.html">Customize CPU options</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        /**
         * <p>The CPU topology type of the instance. Valid values:</p>
         * <ul>
         * <li>ContinuousCoreToHTMapping: The hyper-threads of the same core in the CPU topology are continuous.</li>
         * <li>DiscreteCoreToHTMapping: The hyper-threads of the same core in the CPU topology are discrete.</li>
         * </ul>
         * <p>Default value: none.</p>
         * <blockquote>
         * <p>Only specific instance families support this parameter. For more information about the supported instance families, see <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify the CPU topology</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DiscreteCoreToHTMapping</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available.</p>
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
         * <p>This parameter is in invitational preview and is not available for public use.</p>
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
         * <p>The ID of the private pool. It is the ID of the elasticity assurance or capacity reservation service.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The private pool options for instance startup. After the elasticity assurance or capacity reservation service takes effect, private pool capacity is generated for selection during instance startup. Valid values:</p>
         * <ul>
         * <li>Open: open mode. The system automatically matches open private pool capacity. If no eligible private pool capacity is available, public pool resources are used for startup. In this mode, you do not need to set the PrivatePoolOptions.Id parameter.</li>
         * <li>Target: target mode. The system uses the specified private pool capacity to start the instance. If the specified private pool capacity is unavailable, the instance fails to start. In this mode, you must specify the private pool ID, which means the PrivatePoolOptions.Id parameter is required.</li>
         * <li>None: no private pool mode. The instance startup does not use private pool capacity.</li>
         * </ul>
         * <p>Default value: None.</p>
         * <p>In any of the following scenarios, the private pool option for instance startup can only be set to None or left empty.</p>
         * <ul>
         * <li>Creating spot instances.</li>
         * <li>Creating ECS instances on a dedicated host (DDH).</li>
         * </ul>
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
         * <p>The ID of the dedicated host cluster to which the ECS instance belongs. The system automatically selects a dedicated host from the specified dedicated host cluster to deploy the ECS instance.</p>
         * <blockquote>
         * <p>This parameter takes effect only when Tenancy is set to host.</p>
         * </blockquote>
         * <p>When you specify both a dedicated host (DedicatedHostId) and a dedicated host cluster (SchedulerOptions.DedicatedHostClusterId):</p>
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
         * <p>If this parameter is set to Enclave, the ECS instance uses Enclave to build a confidential computing environment. Only the c7, g7, and r7 instance families support Enclave confidential computing when you call <code>RunInstances</code>. Take note of the following items:</p>
         * <ul>
         * <li><p>The confidential computing feature is in invitational preview.</p>
         * </li>
         * <li><p>To create an ECS instance with Enclave confidential computing by calling API operations, you can only call <code>RunInstances</code>. <code>CreateInstance</code> does not support the <code>SecurityOptions.ConfidentialComputingMode</code> parameter.</p>
         * </li>
         * <li><p>Enclave confidential computing relies on the trusted system (vTPM). When you specify that an ECS instance uses Enclave to build a confidential computing environment, the trusted system is also enabled for the instance. Therefore, if you set <code>SecurityOptions.ConfidentialComputingMode</code> to Enclave when you call this operation, the created ECS instance enables both the Enclave confidential computing mode and the trusted system, regardless of whether you set <code>SecurityOptions.TrustedSystemMode</code> to vTPM.</p>
         * </li>
         * </ul>
         * <p>For more information about confidential computing, see <a href="https://help.aliyun.com/document_detail/203433.html">Use Enclave to build a confidential computing environment</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Enclave</p>
         */
        @NameInMap("ConfidentialComputingMode")
        public String confidentialComputingMode;

        /**
         * <p>The trusted system mode. Valid value: vTPM.</p>
         * <p>Currently, the instance families that support the trusted system mode include:</p>
         * <ul>
         * <li>g7, c7, and r7.</li>
         * <li>Security-enhanced instance families (g7t, c7t, and r7t).</li>
         * </ul>
         * <p>When you create an ECS instance of the preceding instance families, you must configure this parameter. Details:</p>
         * <ul>
         * <li>If you use the Alibaba Cloud trusted system, set this parameter to vTPM. This allows the instance to complete trusted verification through the Alibaba Cloud trusted system during startup.</li>
         * <li>If you do not use the Alibaba Cloud trusted system, you can leave this parameter empty. However, if the ECS instance uses the Enclave confidential computing mode (<code>SecurityOptions.ConfidentialComputingMode=Enclave</code>), the trusted system is also enabled for the instance.</li>
         * <li>To create a trusted ECS instance by calling API operations, you can only call <code>RunInstances</code>. <code>CreateInstance</code> does not support the <code>SecurityOptions.TrustedSystemMode</code> parameter.<blockquote>
         * <p>If you specify an instance as a trusted instance during creation, you can only use images that support the trusted system when you replace the system disk.</p>
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

        /**
         * <p>Specifies whether to enable UEFI Secure Boot.</p>
         */
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
         * <p>The ID of the automatic snapshot policy applied to the system cloud disk.</p>
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
         * <p>Default value:</p>
         * <ul>
         * <li>If the instance type specified by InstanceType is a retired and non-I/O optimized instance type, the default value is cloud.</li>
         * <li>In other cases, the default value is cloud_efficiency. &lt;props=&quot;china&quot;&gt;After January 30, 2026, for instance types that only support cloud_essd, the default value will be changed from cloud_efficiency to cloud_essd PL0. For more details, see <a href="https://www.aliyun.com/notice/117844">Announcement</a>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter can be set to cloud_essd_entry only when InstanceType is set to <a href="https://help.aliyun.com/document_detail/457079.html">u1, universal instance family</a> (ecs.u1) or <a href="https://help.aliyun.com/document_detail/108489.html">e, economy instance family</a> (ecs.e).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system cloud disk. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system cloud disk. The name must be 2 to 128 characters in length. It can contain letters and digits in Unicode, and can include colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The performance level of the enterprise SSD used as the system disk. Valid values:</p>
         * <ul>
         * <li>PL0: A single enterprise SSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1 (default): A single enterprise SSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single enterprise SSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single enterprise SSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For more information about how to select an enterprise SSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</p>
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
         * <li>Enterprise SSD:<ul>
         * <li>PL0: 1 to 2048.</li>
         * <li>PL1: 20 to 2048.</li>
         * <li>PL2: 461 to 2048.</li>
         * <li>PL3: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li>ESSD AutoPL disk: 1 to 2048.</li>
         * <li>Other disk categories: 20 to 2048.</li>
         * </ul>
         * <p>The value of this parameter must be greater than or equal to max{1, ImageSize}.</p>
         * <p>Default value: max{40, the size of the image specified by the ImageId parameter}.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>Specifies whether to enable performance burst. Valid values:</p>
         * <ul>
         * <li>true: yes.</li>
         * <li>false: no.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
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
         * <li><p>true: encrypts the disk.</p>
         * </li>
         * <li><p>false: does not encrypt the disk.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>You cannot encrypt the system disk when you create an instance in Zone D of the China (Hong Kong) region or Zone A of the Singapore region.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: When you use a shared encrypted image to create a disk based on an encrypted snapshot, you must set the Encrypted request parameter of the disk to true to ensure that the created disk uses the key of the user to whom the image is shared.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key used for the system cloud disk.</p>
         * <blockquote>
         * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption, and the KMSKeyId value is returned after the instance is created.</p>
         * <ul>
         * <li><ul>
         * <li>If the cloud disk is created from a non-shared encrypted snapshot, the encryption key used for the snapshot is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the cloud disk is created from a shared encrypted snapshot, the service key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the cloud disk is created in a region where account-level default encryption for EBS is enabled, the specified account-level key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>In other cases, the service key is used by default.</li>
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
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when <code>SystemDisk.Category</code> is set to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The ID of the dedicated block storage cluster. If you want to use cloud disk resources in a dedicated block storage cluster as the system cloud disk when you create an ECS instance, specify this parameter.</p>
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
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
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
         * <ul>
         * <li><p>enabled: PTP is enabled.</p>
         * </li>
         * <li><p>disabled: PTP is disabled.</p>
         * </li>
         * </ul>
         * <p>Default value: disabled.</p>
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
         * <p>The ID of the automatic snapshot policy applied to the data cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable performance burst. Valid values:</p>
         * <ul>
         * <li>true: yes.</li>
         * <li>false: no.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
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
         * <li>cloud_regional_disk_auto: regional enterprise SSD.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.<blockquote>
         * <p>This parameter supports <code>cloud_essd_entry</code> only when the <code>InstanceType</code> is set to an instance type in the <code>ecs.u1</code> or <code>ecs.e</code> instance family.</p>
         * </blockquote>
         * </li>
         * <li>elastic_ephemeral_disk_standard: standard elastic ephemeral disk.</li>
         * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - Premium Edition.</li>
         * </ul>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
         * Default value descriptions:</p>
         * <ul>
         * <li>If InstanceType is set to a retired and non-I/O optimized instance type, the default value is <code>cloud</code>.</li>
         * <li>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, if the I/O optimized instance type does not support cloud_auto, the default value is cloud_efficiency. Otherwise, the default value is cloud_auto, and performance burst is enabled by default (which incurs additional fees. For details, see <a href="~~368372#p_75k_2hp_7gp~~">Billing examples</a>). For more information, see <a href="https://www.aliyun.com/notice/117844">Announcement on changes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data cloud disk when the instance is released. Valid values:</p>
         * <ul>
         * <li>true: The data cloud disk is released when the instance is released.</li>
         * <li>false: The data cloud disk is not released when the instance is released.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data cloud disk. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>DataDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data cloud disk. The naming convention for mount points varies based on the number of mounted data cloud disks:</p>
         * <ul>
         * <li><p>1 to 25 data cloud disks: /dev/xvd<code>[b-z]</code></p>
         * </li>
         * <li><p>More than 25 data cloud disks: /dev/xvd<code>[aa-zz]</code>. For example, the 26th data cloud disk is named /dev/xvdaa, the 27th data cloud disk is named /dev/xvdab, and so on.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is applicable only to full images. You can set this parameter to the mount point of the data cloud disk in the full image and modify the DataDisk.N.Size and DataDisk.N.Category parameters to change the category and size of the data cloud disk in the full image.</li>
         * <li>When you create an instance from a full image, the data cloud disks in the full image are created as the first N data cloud disks of the ECS instance.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data cloud disk. The name must be 2 to 128 characters in length and can contain letters and digits in Unicode. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt data disk N. Valid values:</p>
         * <ul>
         * <li>true: encrypts the disk.</li>
         * <li>false: does not encrypt the disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>Notice: When you use a shared encrypted image to create a disk based on an encrypted snapshot, you must set the Encrypted request parameter of the disk to true to ensure that the created disk uses the key of the user to whom the image is shared.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key used for the data cloud disk.</p>
         * <blockquote>
         * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption, and the KMSKeyId value is returned after the instance is created.</p>
         * <ul>
         * <li><ul>
         * <li>If the cloud disk is created from a non-shared encrypted snapshot, the encryption key used for the snapshot is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the cloud disk is created from a shared encrypted snapshot, the service key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the cloud disk is created in a region where account-level default encryption for Elastic Block Storage (EBS) is enabled, the specified account-level key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>In other cases, the service key is used by default.</li>
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
         * <p>When you create an ESSD as a data disk, specify the performance level of the disk. The value of N must be the same as the value of N in <code>DataDisk.N.Category=cloud_essd</code>. Valid values:</p>
         * <ul>
         * <li>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1 (default): A single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For more information about how to select the performance level of an ESSD, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
         * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The size of data cloud disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: 20 to 32768.</li>
         * <li>cloud_ssd: 20 to 32768.</li>
         * <li>cloud_essd: The valid values vary based on the value of <code>DataDisk.N.PerformanceLevel</code>. <ul>
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
         * <p>The value of this parameter must be greater than or equal to the size of the snapshot specified by the SnapshotId parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot used to create data cloud disk N. Valid values of N: 1 to 16.</p>
         * <p>If the <code>DataDisk.N.SnapshotId</code> parameter is specified, the <code>DataDisk.N.Size</code> parameter is ignored, and the size of the created cloud disk is the same as the size of the specified snapshot. You cannot use snapshots created on or before July 15, 2013. Otherwise, the request is rejected with an error.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The ID of the dedicated block storage cluster. If you want to use cloud disk resources in a dedicated block storage cluster as data cloud disks when you create an ECS instance, specify this parameter.</p>
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
         * <p>Specifies whether the instance that uses the image supports logon as the ecs-user user. Valid values:</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
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
         * <p>Specifies whether to retain the ENI when the instance is released. Valid values:</p>
         * <ul>
         * <li><p>true: The ENI is not retained.</p>
         * </li>
         * <li><p>false: The ENI is retained.</p>
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
         * <p>The description of the Elastic Network Interface (ENI).</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The value of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information about the number of network interface controllers (NICs) supported by an instance type, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the number of network interface controllers (NICs) supported by the target instance type.</li>
         * <li>The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you do not need to specify this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Network_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the Elastic Network Interface (ENI). The value of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information about the number of network interface controllers (NICs) supported by an instance type, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the number of network interface controllers (NICs) supported by the target instance type.</p>
         * <p>Valid values:</p>
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
         * <p>Specifies one or more IPv6 addresses for the primary ENI. You can specify up to 10 IPv6 addresses. Valid values of the second N: 1 to 10.</p>
         * <p>Example: <code>Ipv6Address.1=2001:db8:1234:1a00::***</code></p>
         * <p>Note:</p>
         * <ul>
         * <li><p>This parameter takes effect only when <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>. If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, you cannot specify this parameter.</p>
         * </li>
         * <li><p>After you specify this parameter, the value of <code>Amount</code> can only be 1, and you cannot specify <code>Ipv6AddressCount</code>, <code>Ipv6Address.N</code>, or <code>NetworkInterface.N.Ipv6AddressCount</code>.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Ipv6Address")
        public java.util.List<String> ipv6Address;

        /**
         * <p>Specifies the number of randomly generated IPv6 addresses for the primary ENI. Valid values: 1 to 10.</p>
         * <p>Note:</p>
         * <ul>
         * <li><p>This parameter takes effect only when <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>. If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, you cannot specify this parameter.</p>
         * </li>
         * <li><p>After you specify this parameter, you cannot specify <code>Ipv6AddressCount</code>, <code>Ipv6Address.N</code>, or <code>NetworkInterface.N.Ipv6Address.N</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Long ipv6AddressCount;

        /**
         * <p>The index of the physical network card to which the network interface controller (NIC) is bound.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>Only specific instance types support specifying the physical network card index.</li>
         * <li>When NetworkInterface.N.InstanceType is set to Primary, if the instance type supports physical network cards and you specify this parameter, it can only be set to 0.</li>
         * <li>When NetworkInterface.N.InstanceType is set to Secondary or left empty, if the instance type supports physical network cards, this parameter can be configured based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetworkCardIndex")
        public Integer networkCardIndex;

        /**
         * <p>The ID of the Elastic Network Interface (ENI) to be attached to the instance.</p>
         * <p>After this parameter is specified, <code>Amount</code> can only be set to 1.</p>
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
         * <p>The name of the Elastic Network Interface (ENI). The name must be 2 to 128 characters in length and can contain letters and digits in the Unicode Letter categorization. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The value of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information about the number of network interface controllers (NICs) supported by an instance type, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the number of network interface controllers (NICs) supported by the target instance type.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you do not need to specify this parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Network_Name</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The communication mode of the network interface controller (NIC). Valid values:</p>
         * <ul>
         * <li>Standard: uses the TCP communication mode.</li>
         * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication mode.</li>
         * </ul>
         * <p>Default value: Standard.</p>
         * <blockquote>
         * <p>The number of Elastic Network Interfaces (ENIs) in RDMA mode cannot exceed the limit of the instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>Adds an Elastic Network Interface (ENI) and specifies its primary IP address.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The value of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information about the number of network interface controllers (NICs) supported by an instance type, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the number of network interface controllers (NICs) supported by the target instance type.</p>
         * <ul>
         * <li>When you configure one network interface controller (NIC), you can configure one primary network interface controller (NIC) or one secondary ENI. If the <code>Amount</code> parameter is set to a value greater than 1, and a primary network interface controller (NIC) is configured along with this parameter, it indicates that when multiple ECS instances are created in a batch, consecutive primary IP addresses are allocated to the ECS instances starting from the specified primary IP address. Note that in this case, you cannot attach secondary ENIs to target instances.</li>
         * <li>Note that if the <code>Amount</code> parameter is set to a value greater than 1 and this parameter is configured for the primary network interface controller (NIC), you cannot configure secondary ENIs (that is, you cannot set <code>NetworkInterface.2.InstanceType=Secondary</code>).</li>
         * </ul>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, this parameter functions the same as <code>PrivateIpAddress</code>. Note that you cannot configure both this parameter and the <code>PrivateIpAddress</code> parameter at the same time.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter specifies the primary IP address for the secondary ENI. By default, an IP address is randomly selected from the vSwitch CIDR block of the vSwitch to which the network interface controller (NIC) belongs.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The first and the last three IP addresses of each vSwitch are system reserved IP addresses and cannot be specified.
         * For example, if the vSwitch CIDR block is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are system reserved IP addresses.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>172.16.**.**</code></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The number of queues for the Elastic Network Interface (ENI).</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The value of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information about the number of network interface controllers (NICs) supported by an instance type, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the number of network interface controllers (NICs) supported by the target instance type.</p>
         * </li>
         * <li><p>The value cannot exceed the maximum number of queues per network interface controller (NIC) allowed by the target instance type.</p>
         * </li>
         * <li><p>The total number of queues for all network interface controllers (NICs) of the target instance cannot exceed the total queue quota allowed by the target instance type. You can query the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> fields by calling the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to obtain the maximum number of queues per network interface controller (NIC) and the total queue quota for the target instance type.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code> and this parameter is specified, you cannot specify the <code>NetworkInterfaceQueueNumber</code> parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of queue pairs for the RDMA ENI.</p>
         * <p>If you want to attach multiple RDMA ENIs to the instance, we recommend that you manually specify the <code>QueuePairNumber</code> for each ENI based on the maximum <code>QueuePairNumber</code> supported by the instance type and the number of ENIs you plan to use. Make sure that the total number of queue pairs for all ENIs does not exceed the maximum value allowed by the instance type. You can call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum value for the instance type.</p>
         * <blockquote>
         * <p>Notice: If <code>QueuePairNumber</code> is not specified for an RDMA ENI, the maximum <code>QueuePairNumber</code> supported by the instance type for all RDMA ENIs is used by default. Therefore, after you attach an RDMA ENI for which <code>QueuePairNumber</code> is not specified, you cannot attach more RDMA ENIs (regular ENIs are not subject to this limit).</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueuePairNumber")
        public Long queuePairNumber;

        /**
         * <p>The inbound queue depth of the Elastic Network Interface (ENI).</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not yet available. If you need to use it, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a> to apply for whitelist access.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not yet available. If you need to use it, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a> to apply for whitelist access.</p>
         * </blockquote>
         * <p>When you use this parameter, take note of the following items:</p>
         * <ul>
         * <li><p>It applies only to ECS instance types of Generation 7 and later.</p>
         * </li>
         * <li><p>It currently applies only to Linux images.</p>
         * </li>
         * <li><p>A larger inbound queue depth can improve inbound throughput and reduce the packet loss rate, but it consumes more memory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

        /**
         * <p>The number of secondary private IPv4 addresses to allocate to the network interface controller (NIC). Valid values: 1 to 49.</p>
         * <ul>
         * <li>The value cannot exceed the limit on the number of IP addresses for the instance type. For more information, see <a href="~~~25378~~">Instance families</a>.</li>
         * <li><code>NetworkInterface.N.SecondaryPrivateIpAddressCount</code> specifies the number of secondary private IPv4 addresses to allocate to the network interface controller (NIC) (excluding the primary private IP address of the network interface controller (NIC)). The system randomly allocates these addresses from the active CIDR block of the vSwitch (<code>NetworkInterface.N.VSwitchId</code>) to which the network interface controller (NIC) belongs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The ID of the security group to which the Elastic Network Interface (ENI) belongs.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The value of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information about the number of network interface controllers (NICs) supported by an instance type, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the number of network interface controllers (NICs) supported by the target instance type.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must specify this parameter. In this case, this parameter functions the same as <code>SecurityGroupId</code>. Note that you cannot specify <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupIds.N</code> at the same time.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. The default value is the security group to which the ECS instance belongs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of one or more security groups to which the Elastic Network Interface (ENI) belongs.</p>
         * <ul>
         * <li>The value of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information about the number of network interface controllers (NICs) supported by an instance type, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the number of network interface controllers (NICs) supported by the target instance type.</li>
         * <li>The second N indicates that you can specify one or more security group IDs. The valid values of N depend on the quota of security groups that the instance can join. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must specify this parameter or <code>NetworkInterface.N.SecurityGroupId</code>. In this case, this parameter functions the same as <code>SecurityGroupIds.N</code>. Note that you cannot specify <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupId</code> at the same time.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. The default value is the security group to which the ECS instance belongs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg7****</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>Specifies whether to enable the source/destination checking feature. We recommend that you enable this feature to improve network security. Valid values:</p>
         * <ul>
         * <li><p>true: Yes.</p>
         * </li>
         * <li><p>false: No.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>This feature is supported only in specific regions. Before you use this feature, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source/destination checking</a> carefully.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SourceDestCheck")
        public Boolean sourceDestCheck;

        /**
         * <p>The outbound queue depth of the Elastic Network Interface (ENI).</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not yet available. If you need to use it, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a> to apply for whitelist access.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not yet available. If you need to use it, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a> to apply for whitelist access.</p>
         * </blockquote>
         * <p>When you use this parameter, take note of the following items:</p>
         * <ul>
         * <li><p>It applies only to ECS instance types of Generation 7 and later.</p>
         * </li>
         * <li><p>It currently applies only to Linux images.</p>
         * </li>
         * <li><p>A larger outbound queue depth can improve outbound throughput and reduce the packet loss rate, but it consumes more memory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("TxQueueSize")
        public Integer txQueueSize;

        /**
         * <p>The ID of the vSwitch to which the Elastic Network Interface (ENI) belongs.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The value of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information about the number of network interface controllers (NICs) supported by an instance type, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the number of network interface controllers (NICs) supported by the target instance type.  </p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must specify this parameter. In this case, this parameter functions the same as <code>VSwitchId</code>. Note that you cannot specify both this parameter and the <code>VSwitchId</code> parameter at the same time.</p>
         * </li>
         * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, this parameter is optional. The default value is the vSwitch to which the ECS instance belongs.</p>
         * </li>
         * </ul>
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
         * <p>The bandwidth weight of the instance. The valid values vary based on the instance type. You can call the DescribeInstanceTypes operation to query the valid values for a specific instance type. The BandwidthWeighting field in the response indicates the bandwidth weight levels supported by the instance type. You can use the name field in the response as the dictionary value, such as Vpc-L1 or Ebs-L1.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("BandwidthWeighting")
        public String bandwidthWeighting;

        /**
         * <p>Specifies whether to enable the jumbo frame feature for the instance. Valid values:</p>
         * <ul>
         * <li><p>false: The jumbo frame feature is disabled. The maximum transmission unit (MTU) of all ENIs (including the primary ENI and secondary ENIs) under the instance is set to 1500.</p>
         * </li>
         * <li><p>true: The jumbo frame feature is enabled. The MTU of all ENIs (including the primary ENI and secondary ENIs) under the instance is set to 8500.</p>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p>The jumbo frame feature is supported only by specific eighth-generation and later instance types. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">MTU of ECS instances</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableJumboFrame")
        public Boolean enableJumboFrame;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available.</p>
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
         * <p>Specifies whether to enable or disable the resolution of instance ID-based domain names to IPv6 addresses. Valid values:</p>
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
         * <p>Specifies whether to enable or disable the resolution of instance ID-based domain names to IPv4 addresses. Valid values:</p>
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
         * <p>Specifies whether to enable or disable the resolution of IP-based domain names to IPv4 addresses. Valid values:</p>
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
         * <p>Specifies whether to enable or disable the reverse resolution of IPv4 addresses to IP-based domain names. Valid values:</p>
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
         * <ul>
         * <li>Custom: custom hostname.</li>
         * <li>IpBased: IP-based hostname.</li>
         * <li>InstanceIdBased: instance ID-based hostname.</li>
         * </ul>
         * <p>Default value: Custom.</p>
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
         * <p>The tag key of the instance, cloud disks, and primary ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance, cloud disks, and primary ENI. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
