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
     * <p>Specifies whether to associate the instance on a dedicated host with the dedicated host. Valid values:</p>
     * <ul>
     * <li>default: Does not associate the instance with the dedicated host. If an instance for which the economical mode is enabled is stopped and then started, and the available resources of the original dedicated host are insufficient, the instance is deployed on another dedicated host in the automatic deployment resource pool.</li>
     * <li>host: Associates the instance with the dedicated host. If an instance for which the economical mode is enabled is stopped and then started, the instance is still deployed on the original dedicated host. If the available resources of the original dedicated host are insufficient, the instance fails to be restarted.
     * Default value: default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The number of ECS instances to create. Valid values: 1 to 100.</p>
     * <p>The number of successfully created ECS instances depends on the specified Amount and minAmount:</p>
     * <ul>
     * <li><p>When minAmount is not specified: Instances are created based on the Amount value. If the inventory is insufficient, the API returns a creation failure, and no instances are created.</p>
     * </li>
     * <li><p>When minAmount is specified:</p>
     * <ul>
     * <li>If the ECS inventory &lt; minAmount: No ECS instances are created, and the API returns a creation failure.</li>
     * <li>If minAmount ≤ ECS inventory &lt; Amount: Instances are created based on the inventory, and the API returns a creation success.</li>
     * <li>If the ECS inventory ≥ Amount: Instances are created based on the specified Amount, and the API returns a creation success.</li>
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
     * <li><p>true: Automatically pays for the instance.</p>
     * <blockquote>
     * <p>If you enable automatic payment, make sure that your payment method has sufficient balance. Otherwise, an abnormal order is generated and can only be canceled. If your payment method has insufficient balance, you can set AutoPay to false. In this case, an unpaid order is generated, and you can log on to the ECS console to complete the payment.</p>
     * </blockquote>
     * </li>
     * <li><p>false: Generates an order without deducting fees.</p>
     * <blockquote>
     * <p>If InstanceChargeType is set to PostPaid, you cannot set AutoPay to false.</p>
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
     * <p>The automatic release time of the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <ul>
     * <li><p>If the seconds (<code>ss</code>) value is not <code>00</code>, it is automatically set to the start of the current minute (<code>mm</code>).</p>
     * </li>
     * <li><p>The shortest release time is half an hour after the current time.</p>
     * </li>
     * <li><p>The longest release time cannot exceed three years from the current time.</p>
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
     * <p>The auto-renewal period. Valid values: </p>
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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The clock attribute configurations of the instance.</p>
     */
    @NameInMap("ClockOptions")
    public RunInstancesRequestClockOptions clockOptions;

    /**
     * <p>The running mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li>Standard: standard mode. For more information about the instance performance, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">What are burstable instances?</a>.</li>
     * <li>Unlimited: unlimited mode. For more information about the instance performance, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">What are burstable instances?</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The data disk configurations.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

    /**
     * <p>The dedicated host ID.
     * &lt;props=&quot;china&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the dedicated host ID list.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the dedicated host ID list.</p>
     * <blockquote>
     * <p>Notice: Dedicated hosts do not support the creation of spot instances. After you specify the <code>DedicatedHostId</code> parameter, the <code>SpotStrategy</code> and <code>SpotPriceLimit</code> settings in the request are automatically ignored.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The release protection attribute of the instance. Specifies whether the instance can be released by using the console or by calling the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation. Valid values:</p>
     * <ul>
     * <li>true: Enables release protection for the instance.</li>
     * <li>false: Disables release protection for the instance.
     * Default value: false.<blockquote>
     * <p>This attribute applies only to pay-as-you-go instances and restricts only manual release operations. It does not take effect on system release operations.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The group number of the instance in the deployment set. If the policy of the deployment set is AvailabilityGroup, you can use this parameter to specify the group number. Valid values: 1 to 7.</p>
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
     * <p>The instance description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance_Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to pre-check this request. Valid values:</p>
     * <ul>
     * <li>true: Sends a check request. No instances are created. Check items include whether required parameters are filled in, request format, business limits, and ECS inventory. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li>false (default): Sends a regular request. Instances are created directly after the check succeeds.</li>
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
     * <li>Periods (.) and hyphens (-) cannot be used as the first or last character and cannot be used consecutively.</li>
     * <li>Windows instances: The hostname must be 2 to 15 characters in length. It cannot contain periods (.) or contain only digits. It can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
     * <li>Other instances (such as Linux instances):<ul>
     * <li>The hostname must be 2 to 64 characters in length. It can contain multiple periods (.). The string between two consecutive periods is a segment, which can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
     * <li>You can use the <code>${instance_id}</code> placeholder to write the instance ID into the <code>HostName</code> parameter. For example, if <code>HostName=k8s-${instance_id}</code> and the created ECS instance ID is <code>i-123abc****</code>, the hostname of the instance is <code>k8s-i-123abc****</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>When you create multiple ECS instances, you can:</p>
     * <ul>
     * <li>Batch configure sequential hostnames. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for instances</a>.</li>
     * <li>Use the <code>HostNames.N</code> parameter to set hostnames for multiple instances separately. Note that you cannot set both <code>HostName</code> and <code>HostNames.N</code>.</li>
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
     * <p>This parameter is required when you create an SCC instance. You can refer to <a href="https://help.aliyun.com/document_detail/109138.html">CreateHpcCluster</a> to create an HPC cluster.</p>
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
     * <p>Specifies whether to forcibly use the hardened mode (IMDSv2) when you access instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: Does not forcibly use the hardened mode.</li>
     * <li>required: Forcibly uses the hardened mode. After you set this value, you cannot access instance metadata in normal mode.</li>
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
     * <p>The image family name. Set this parameter to use the latest available image in the specified image family to create the instance.</p>
     * <p>The name must be 2 to 128 characters in length. It cannot start with a special character, digit, http://, or https://. It can contain periods (.), underscores (_), hyphens (-), and colons (:).</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>If <code>ImageId</code> is specified, you cannot set this parameter.</li>
     * <li>If <code>ImageId</code> is not specified but <code>ImageId</code> is set in the launch template specified by <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code>, you cannot set this parameter.</li>
     * <li>If <code>ImageId</code> is not specified and <code>ImageId</code> is not set in the launch template specified by <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code>, you can set this parameter.</li>
     * <li>If neither <code>ImageId</code> nor <code>LaunchTemplateId</code> and <code>LaunchTemplateName</code> are specified, you can set this parameter.<blockquote>
     * <p>For information about the image families associated with Alibaba Cloud public images, see <a href="https://help.aliyun.com/document_detail/108393.html">Public image overview</a>.</p>
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
     * <p>The image ID. The image used to start the instance. You can call <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> to query available images. If you do not specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to determine a launch template, and do not specify <code>ImageFamily</code> to use the latest available image in an image family, <code>ImageId</code> is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_2_1903_x64_20G_alibase_20200324.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image attribute configurations.</p>
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
     * <p>&lt;props=&quot;china&quot;&gt;When you select subscription, you must ensure that your account supports balance payment or credit payment. Otherwise, an <code>InvalidPayMethod</code> error is returned.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;When you select subscription, you must ensure that your account supports credit payment. Otherwise, an <code>InvalidPayMethod</code> error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance name. The name must be 2 to 128 characters in length. It can contain letters (including English and Chinese letters) and digits in the Unicode letter category. It can also contain colons (:), underscores (_), periods (.), and hyphens (-). Default value: the <code>InstanceId</code> of the instance.</p>
     * <p>When you create multiple ECS instances, you can batch configure sequential instance names, which can include brackets ([]) and commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-alibabacloud</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. If you do not specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to determine a launch template, <code>InstanceType</code> is a required parameter.  </p>
     * <ul>
     * <li>Instance type selection: See <a href="https://help.aliyun.com/document_detail/25378.html">instance family</a> or invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to view the performance data of the target instance type. You can also see <a href="https://help.aliyun.com/document_detail/58291.html">Best practices for instance type selection</a> to learn how to select an instance type.</li>
     * <li>Inventory query: invoke <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> to check the resource availability in a specific region or zone.</li>
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
     * <p>In the <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are upper limits and are not guaranteed service level indicators. When resource contention occurs, the peak bandwidths may be limited. If your business requires guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
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
     * <li>When the purchased outbound public bandwidth is greater than 10 Mbit/s: 1 to the value of <code>InternetMaxBandwidthOut</code>. Default value: the value of <code>InternetMaxBandwidthOut</code>.</li>
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
     * <p>Specifies whether the instance is an I/O optimized instance. For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, the default value is none. For other instance types, the default value is optimized. Valid values:</p>
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
     * <p>Example: Ipv6Address.1=2001:db8:1234:1a00::***.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>If you specify Ipv6Address.N, Amount can only be set to 1, and you cannot specify Ipv6AddressCount.</p>
     * </li>
     * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you cannot specify Ipv6Addresses.N or Ipv6AddressCount. Instead, you must specify NetworkInterface.N.Ipv6Addresses.N or NetworkInterface.N.Ipv6AddressCount.</p>
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
     * <li><p>You cannot set both <code>Ipv6Address.N</code> and <code>Ipv6AddressCount</code>.</p>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>Ipv6Address.N</code> or <code>Ipv6AddressCount</code>. You can only set <code>NetworkInterface.N.Ipv6Address.N</code> or <code>NetworkInterface.N.Ipv6AddressCount</code>.</p>
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
     * <p>This parameter is in invitational preview and is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The key pair name.</p>
     * <blockquote>
     * <p>For Windows instances, this parameter is ignored. The default value is empty. Even if this parameter is specified, only the <code>Password</code> parameter takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>KeyPair_Name</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The launch template ID. For more information, call <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a>.</p>
     * <p>When you use a launch template to create an instance, you must specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to determine the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-bp1apo0bbbkuy0rj****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The launch template name.</p>
     * <p>When you use a launch template to create an instance, you must specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to determine the launch template.</p>
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
     * <p>The unique identifier of the managed host, such as mh-f2d3647ca21****.</p>
     * 
     * <strong>example:</strong>
     * <p>mh-f2d3647ca21****</p>
     */
    @NameInMap("ManagedHostId")
    public String managedHostId;

    /**
     * <p>The minimum quantity of ECS instances to purchase. Valid values: 1 to 100.</p>
     * <p>The number of successfully created ECS instances depends on the specified Amount and minAmount:</p>
     * <ul>
     * <li><p>When minAmount is not specified: Instances are created based on the Amount value. If the inventory is insufficient, the API returns a creation failure, and no instances are created.</p>
     * </li>
     * <li><p>When minAmount is specified:</p>
     * <ul>
     * <li>If the ECS inventory &lt; minAmount: No ECS instances are created, and the API returns a creation failure.</li>
     * <li>If minAmount ≤ ECS inventory &lt; Amount: Instances are created based on the inventory, and the API returns a creation success.</li>
     * <li>If the ECS inventory ≥ Amount: Instances are created based on the specified Amount, and the API returns a creation success.</li>
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
     * <p>The ENI information.</p>
     */
    @NameInMap("NetworkInterface")
    public java.util.List<RunInstancesRequestNetworkInterface> networkInterface;

    /**
     * <p>The number of queues for the primary ENI. Note the following:</p>
     * <ul>
     * <li><p>The value cannot exceed the maximum number of queues per ENI allowed by the instance type.</p>
     * </li>
     * <li><p>The total number of queues for all ENIs attached to the instance cannot exceed the total queue quota allowed by the instance type. To obtain the maximum number of queues per ENI and the total queue quota for the instance type, query the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> fields by calling the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation.</p>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot specify <code>NetworkInterfaceQueueNumber</code>. You can specify only <code>NetworkInterface.N.QueueNumber</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("NetworkInterfaceQueueNumber")
    public Integer networkInterfaceQueueNumber;

    /**
     * <p>The network attribute configurations.</p>
     */
    @NameInMap("NetworkOptions")
    public RunInstancesRequestNetworkOptions networkOptions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The instance password. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
     * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>If you pass in the <code>Password</code> parameter, we recommend that you use HTTPS to send the request to prevent password leaks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EcsV587!</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password preset in the image. Valid values:</p>
     * <ul>
     * <li>true: Uses the preset password.</li>
     * <li>false: Does not use the preset password.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>When you use this parameter, the Password parameter must be left empty. Make sure that the image you use has a password configured.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription period of the resource. The unit is specified by <code>PeriodUnit</code>. This parameter takes effect and is required only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>. If <code>DedicatedHostId</code> is specified, the subscription period cannot exceed the subscription period of the dedicated host. Valid values:</p>
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
     * <p>The time unit of the subscription billing method. Valid values: </p>
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
     * <p>The private domain name configurations of the instance.</p>
     * <p>For more information about private private domain resolution, see <a href="https://help.aliyun.com/document_detail/2844797.html">Private private domain resolution for ECS</a>.</p>
     */
    @NameInMap("PrivateDnsNameOptions")
    public RunInstancesRequestPrivateDnsNameOptions privateDnsNameOptions;

    /**
     * <p>The private IP address of the instance. When you specify a private IP address for an ECS instance in a VPC, the IP address must be an available IP address within the CIDR block of the vSwitch specified by <code>VSwitchId</code>.</p>
     * <p>Note:</p>
     * <ul>
     * <li><p>After you specify <code>PrivateIpAddress</code>:</p>
     * <ul>
     * <li>If <code>Amount</code> is set to 1, the specified private IP address is assigned to the created ECS instance.</li>
     * <li>If <code>Amount</code> is set to a value greater than 1, the specified private IP address is used as the starting IP address to assign consecutive private IP addresses to the ECS instances that you create in a batch. In this case, you cannot bind secondary ENIs to the instances. That is, you cannot specify parameters such as <code>NetworkInterface.N.*</code>.</li>
     * </ul>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot specify <code>PrivateIpAddress</code>. You can only specify <code>NetworkInterface.N.PrimaryIpAddress</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The first and last three IP addresses of each vSwitch are reserved by the system and cannot be specified.
     * For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the following four IP addresses are reserved by the system: 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><code>10.1.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The instance RAM role name. You can use the RAM API <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query the instance RAM roles you have created.</p>
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
     * <p>The ID of the security group to which the new instance belongs. Instances in the same security group can access each other. The maximum number of instances that a security group can contain depends on the security group type. For more information, see the &quot;Security group limits&quot; section in <a href="~~25412#SecurityGroupQuota~~">Limits</a>.</p>
     * <blockquote>
     * <p><code>SecurityGroupId</code> determines the network type of the instance. For example, if the network type of the security group is VPC, the instance is of the VPC type, and you must also specify <code>VSwitchId</code>.</p>
     * </blockquote>
     * <p>If you do not specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to determine a launch template, the security group ID is required. Take note of the following items:</p>
     * <ul>
     * <li><p>You can set <code>SecurityGroupId</code> to specify one security group, or set <code>SecurityGroupIds.N</code> to specify one or more security groups. However, you cannot set both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code>.</p>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code>. You can only set <code>NetworkInterface.N.SecurityGroupId</code> or <code>NetworkInterface.N.SecurityGroupIds.N</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Adds the instance to multiple security groups. The valid values of N depend on the quota of security groups to which the instance can be added. For more information, see <a href="https://help.aliyun.com/document_detail/101348.html">Security group limits</a>.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You cannot specify both SecurityGroupId and SecurityGroupIds.N.</li>
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
     * <li>1: After the spot instance is created, Alibaba Cloud guarantees that the spot instance will not be automatically released within 1 hour. After 1 hour, the system compares the bid price with the marketplace price and checks the resource inventory in real time to determine whether to retain or reclaim the spot instance.</li>
     * <li>0: After the spot instance is created, Alibaba Cloud does not guarantee the runtime duration of the spot instance. The system compares the bid price with the marketplace price and checks the resource inventory in real time to determine whether to retain or reclaim the spot instance.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * <blockquote>
     * <ul>
     * <li>Currently, this parameter can only be set to 0 or 1.</li>
     * <li>Spot instances are billed by the second. We recommend that you select an appropriate protection period based on the execution duration of your specific task.</li>
     * <li>Alibaba Cloud sends a notification through an ECS system event 5 minutes before the spot instance is reclaimed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The break mode for the spot instance. Valid values:</p>
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
     * <p>The maximum hourly price of the instance. It supports up to three decimal places. This parameter takes effect when <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0.97</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the pay-as-you-go instance. This parameter takes effect when <code>InstanceChargeType</code> is set to <code>PostPaid</code>. Valid values:</p>
     * <ul>
     * <li>NoSpot: regular pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: spot instance with a maximum price.</li>
     * <li>SpotAsPriceGo: spot instance for which the system automatically places bids based on the market price.</li>
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
     * <li>default: Creates a non-dedicated host instance.</li>
     * <li>host: Creates an instance on a dedicated host. If you do not specify DedicatedHostId, Alibaba Cloud automatically selects a dedicated host to deploy the instance.
     * Default value: default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>Specifies whether to automatically append sequential suffixes to <code>HostName</code> and <code>InstanceName</code> when you create multiple instances. The sequential suffix starts from 001 and increments up to 999. Valid values:</p>
     * <ul>
     * <li>true: Appends sequential suffixes.</li>
     * <li>false: Does not append sequential suffixes.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>If <code>HostName</code> or <code>InstanceName</code> is set in a specified sorting format without the <code>name_suffix</code> naming suffix, meaning the naming format is <code>name_prefix[begin_number,bits]</code>, <code>UniqueSuffix</code> does not take effect, and the names are sorted only in the specified order.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    /**
     * <p>The user data of the instance. The data must be Base64-encoded. The size of the user data cannot exceed 32 KB before Base64 encoding.</p>
     * <p>For more information about the limits, format, and execution frequency of user data, see <a href="https://help.aliyun.com/document_detail/49121.html">Instance user data</a>.</p>
     * <blockquote>
     * <p>To ensure the security of UserData during transmission, avoid transmitting sensitive data such as passwords and private keys in plaintext. If you need to transmit such information, encrypt it first, encode it in Base64, and then decrypt it inside the instance to ensure information security.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The vSwitch ID. If you create a VPC-type ECS instance, you must specify a vSwitch ID. The security group and the vSwitch must belong to the same VPC. You can call <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> to query created vSwitches.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>If you set <code>VSwitchId</code>, the <code>ZoneId</code> parameter must be set to the zone where the vSwitch resides. You can also leave <code>ZoneId</code> unspecified, and the system automatically selects the zone where the specified vSwitch resides.</p>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>VSwitchId</code>. You can only set <code>NetworkInterface.N.VSwitchId</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> to obtain the zone list.</p>
     * <blockquote>
     * <p>If you specify the <code>VSwitchId</code> parameter, the <code>ZoneId</code> parameter must be set to the zone where the vSwitch resides. You can also leave the <code>ZoneId</code> parameter unspecified, and the system automatically selects the zone where the specified vSwitch resides.</p>
     * </blockquote>
     * <p>Default value: automatically selected by the system.</p>
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
         * <p><strong>[Deprecated]</strong> This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Numa")
        public String numa;

        /**
         * <p>The number of CPU threads. The number of vCPUs of the ECS instance is calculated by using the following formula: Number of vCPUs = Value of CpuOptions.Core × Value of CpuOptions.ThreadsPerCore.</p>
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
         * <li>ContinuousCoreToHTMapping: When ContinuousCoreToHTMapping is selected, the hyper-threads (HTs) of the same core in the CPU topology of the instance are continuous.</li>
         * <li>DiscreteCoreToHTMapping: When DiscreteCoreToHTMapping is selected, the HTs of the same core in the instance are discrete.</li>
         * </ul>
         * <p>Default value: None.</p>
         * <blockquote>
         * <p>Only specific instance types support this parameter. For more information about the supported instance types, see <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify the CPU topology</a>.</p>
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
         * <p>This parameter is in invitational preview and is not available.</p>
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
         * <p>The ID of the private pool, which is the ID of the elasticity assurance or capacity reservation service.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The private pool options for instance startup. After the elasticity assurance or capacity reservation service takes effect, private pool capacity is generated for you to select when you start the instance. Valid values:</p>
         * <ul>
         * <li>Open: Open mode. The system automatically matches open private pool capacity. If no eligible private pool capacity is available, the instance is started by using public pool resources. In this mode, you do not need to specify the PrivatePoolOptions.Id parameter.</li>
         * <li>Target: Specified mode. The instance is started by using the specified private pool capacity. If the specified private pool capacity is unavailable, the instance fails to be started. In this mode, you must specify the private pool ID, which means the PrivatePoolOptions.Id parameter is required.</li>
         * <li>None: Unused mode. The instance is started without using private pool capacity.</li>
         * </ul>
         * <p>Default value: None.</p>
         * <p>In any of the following scenarios, the private pool options for instance startup can only be set to None or left unspecified:</p>
         * <ul>
         * <li>Creating a spot instance.</li>
         * <li>Creating an ECS instance on a dedicated host (DDH).</li>
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
         * <p>If you specify both a dedicated host (DedicatedHostId) and a dedicated host cluster (SchedulerOptions.DedicatedHostClusterId):</p>
         * <ul>
         * <li>If the dedicated host belongs to the dedicated host cluster, the ECS instance is preferentially deployed on the specified dedicated host.</li>
         * <li>If the dedicated host does not belong to the dedicated host cluster, the ECS instance fails to be created.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;You can call the <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a> operation to query the list of dedicated host cluster IDs.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;You can call the <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a> operation to query the list of dedicated host cluster IDs.</p>
         * <p>&lt;props=&quot;partner&quot;&gt;You can call the <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a> operation to query the list of dedicated host cluster IDs.</p>
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
         * <p>When this parameter is set to Enclave, the ECS instance uses Enclave to build a confidential computing environment. Currently, only the c7, g7, and r7 instance types support specifying this parameter to use Enclave confidential computing when you call RunInstances. Details:</p>
         * <ul>
         * <li><p>The confidential computing feature is in invitational preview.</p>
         * </li>
         * <li><p>To create an ECS instance with Enclave confidential computing by calling an API operation, you can only call RunInstances. CreateInstance does not support the SecurityOptions.ConfidentialComputingMode parameter.</p>
         * </li>
         * <li><p>Enclave confidential computing relies on the trusted system (vTPM). When you specify that an ECS instance uses Enclave to build a confidential computing environment, the trusted system is also enabled for the instance. Therefore, when you call this operation, if you set SecurityOptions.ConfidentialComputingMode=Enclave, the created ECS instance will have both the Enclave confidential computing mode and the trusted system enabled, regardless of whether you set SecurityOptions.TrustedSystemMode=vTPM.</p>
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
         * <p>Currently, the trusted system mode supports the following instance types:</p>
         * <ul>
         * <li>g7, c7, and r7.</li>
         * <li>security-enhanced instance families (g7t, c7t, and r7t).</li>
         * </ul>
         * <p>When you create an ECS instance of one of the preceding instance types, you must configure this parameter. Details:</p>
         * <ul>
         * <li>If you use the Alibaba Cloud trusted system, set this parameter to vTPM. This allows the Alibaba Cloud trusted system to perform trusted verification when the instance starts.</li>
         * <li>If you do not use the Alibaba Cloud trusted system, you can leave this parameter unspecified. However, note that if the ECS instance you create uses the Enclave confidential computing mode (SecurityOptions.ConfidentialComputingMode=Enclave), the trusted system is also enabled for the instance.</li>
         * <li>To create a trusted ECS instance by calling an API operation, you can only call RunInstances. CreateInstance does not support the SecurityOptions.TrustedSystemMode parameter.<blockquote>
         * <p>If you specify an instance as a trusted instance when you create it, you can only use images that support the trusted system when you replace the system disk.</p>
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
         * <p>The ID of the automatic snapshot policy applied to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>The system disk category. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud: basic disk.</li>
         * <li>cloud_auto: ESSD AutoPL disk.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.</li>
         * </ul>
         * <p>Default value descriptions:</p>
         * <ul>
         * <li>If InstanceType is a retired and non-I/O optimized instance type, the default value is <code>cloud</code>.</li>
         * <li>In other cases, the default value is <code>cloud_efficiency</code>.&lt;props=&quot;china&quot;&gt;After January 30, 2026, for instance families that only support ESSD, the default value will be changed from cloud_efficiency to cloud_essd PL0. For more information, see <a href="https://www.aliyun.com/notice/117844">Announcement</a>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter can be set to <code>cloud_essd_entry</code> only when <code>InstanceType</code> is set to <a href="https://help.aliyun.com/document_detail/457079.html">u1, universal instance family</a> (<code>ecs.u1</code>) or <a href="https://help.aliyun.com/document_detail/108489.html">e, economy instance family</a> (<code>ecs.e</code>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The system disk description. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The system disk name. The name must be 2 to 128 characters in length. It can contain letters (including English and Chinese letters) and digits in the Unicode letter category. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>When creating an ESSD as the system disk, set the performance level of the disk. Valid values:</p>
         * <ul>
         * <li>PL0: A single disk can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1 (default): A single disk can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single disk can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single disk can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For details on how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The system disk size. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>Basic disk: 20 to 500.</li>
         * <li>ESSD:<ul>
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
         * <p>Specifies whether to enable the performance burst feature. Valid values:</p>
         * <ul>
         * <li>true: Enables the feature.</li>
         * <li>false: Disables the feature.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when SystemDisk.Category is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <li><p>true: Encrypts the system disk.</p>
         * </li>
         * <li><p>false: Does not encrypt the system disk.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>You cannot encrypt the system disk when you create an instance in active Zone D of the China (Hong Kong) region or active Zone A of the Singapore region.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: When you use a shared encrypted image to create a cloud disk based on an encrypted snapshot, you must set the Encrypted request parameter of the cloud disk to true. This ensures that the created cloud disk uses the key of the shared image recipient.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key used to encrypt the system disk.</p>
         * <blockquote>
         * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption, and the KMSKeyId value is returned after the instance is created.</p>
         * <ul>
         * <li><ul>
         * <li>If the cloud disk is created from a non-shared encrypted snapshot, the encryption key used by the snapshot is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the cloud disk is created from a shared encrypted snapshot, the service key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the cloud disk is created in a region where account-level default encryption for Block Storage is enabled, the specified account-level key is used by default.</li>
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
         * <p>This parameter is supported only when SystemDisk.Category is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The ID of the dedicated block storage cluster. If you want to use cloud disk resources in a dedicated block storage cluster as the system disk when you create an ECS instance, specify this parameter.</p>
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
         * <li><p>enabled: Enables PTP.</p>
         * </li>
         * <li><p>disabled: Disables PTP.</p>
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
         * <li>true: Enables the feature.</li>
         * <li>false: Disables the feature.</li>
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
         * <p>This parameter supports cloud_essd_entry only when InstanceType is set to an instance type in the ecs.u1 or ecs.e instance family.</p>
         * </blockquote>
         * </li>
         * <li>elastic_ephemeral_disk_standard: standard elastic ephemeral disk.</li>
         * <li>elastic_ephemeral_disk_premium: elastic ephemeral disk - Premium Edition.</li>
         * </ul>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.
         * Default value description:</p>
         * <ul>
         * <li>If InstanceType is set to a retired and non-I/O optimized instance type, the default value is cloud.</li>
         * <li>In other cases, the default value is cloud_efficiency. &lt;props=&quot;china&quot;&gt;After January 30, 2026, if the I/O optimized instance type does not support cloud_auto, the default value is cloud_efficiency. Otherwise, the default value is cloud_auto, and the performance burst feature is enabled by default (which incurs additional fees. For more information, see <a href="~~368372#p_75k_2hp_7gp~~">Billing examples</a>). For more details, see <a href="https://www.aliyun.com/notice/117844">Announcement</a>.</li>
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
         * <li>true: Releases the data disk when the instance is released.</li>
         * <li>false: Retains the data disk when the instance is released.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of the data disk. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>DataDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk. The naming convention for mount points varies based on the number of attached data disks:</p>
         * <ul>
         * <li><p>1 to 25 data disks: /dev/xvd[b-z]</p>
         * </li>
         * <li><p>More than 25 data disks: /dev/xvd[aa-zz]. For example, the 26th data disk is named /dev/xvdaa, the 27th data disk is named /dev/xvdab, and so on.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is applicable only to full images (instance images). You can set this parameter to the mount point of the data disk in the full image, and modify the DataDisk.N.Size and DataDisk.N.Category parameters to change the category and size of the data disk in the full image.</li>
         * <li>When you use a full image to create an instance, the data disks in the full image are created as the first n data disks of the ECS instance.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length. It can contain letters and digits in the Unicode letter category. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
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
         * <li>true: Encrypts the data disk.</li>
         * <li>false: Does not encrypt the data disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>Notice: When you use a shared encrypted image to create a cloud disk based on an encrypted snapshot, you must set the Encrypted request parameter of the cloud disk to true. This ensures that the created cloud disk uses the key of the shared image recipient.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key used to encrypt the data disk.</p>
         * <blockquote>
         * <p>If Encrypted is set to true and KMSKeyId is not specified, the default key is used for encryption, and the KMSKeyId value is returned after the instance is created.</p>
         * <ul>
         * <li><ul>
         * <li>If the cloud disk is created from a non-shared encrypted snapshot, the encryption key used by the snapshot is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the cloud disk is created from a shared encrypted snapshot, the service key is used by default.</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li>If the cloud disk is created in a region where account-level default encryption for Block Storage is enabled, the specified account-level key is used by default.</li>
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
         * <p>Specifies the performance level of the ESSD used as a data disk. The value of N must be the same as the value of N in DataDisk.N.Category=cloud_essd. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1 (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
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
         * <p>The size of data disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: 20 to 32768.</li>
         * <li>cloud_ssd: 20 to 32768.</li>
         * <li>cloud_essd: The valid values depend on the value of DataDisk.N.PerformanceLevel. <ul>
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
         * <p>The ID of the snapshot used to create data disk N. Valid values of N: 1 to 16.</p>
         * <p>After you specify the DataDisk.N.SnapshotId parameter, the DataDisk.N.Size parameter is ignored. The actual size of the created cloud disk is the same as the size of the specified snapshot. You cannot use snapshots created on or before July 15, 2013. Otherwise, the request is rejected and an error is reported.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The ID of the dedicated block storage cluster. If you want to use cloud disk resources in a dedicated block storage cluster as data disks when you create an ECS instance, specify this parameter.</p>
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
         * <li><p>true: Supports logon as the ecs-user user.</p>
         * </li>
         * <li><p>false: Does not support logon as the ecs-user user.</p>
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
         * <li><p>true: Does not retain the ENI.</p>
         * </li>
         * <li><p>false: Retains the ENI.</p>
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
         * <p>The description of the ENI.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The valid values of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum number of network interface controllers (NICs) supported by the instance type.</li>
         * <li>The description must be 2 to 256 characters in length and cannot start with http:// or https://.</li>
         * <li>If NetworkInterface.N.InstanceType is set to Primary, you do not need to specify this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Network_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the ENI. The valid values of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum number of network interface controllers (NICs) supported by the instance type.</p>
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
         * <p>Specifies one or more IPv6 addresses for the primary ENI. You can specify up to 10 IPv6 addresses. Valid values of the second N: 1 to 10.</p>
         * <p>Example: Ipv6Address.1=2001:db8:1234:1a00::***.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>This parameter takes effect only when NetworkInterface.N.InstanceType is set to Primary. If NetworkInterface.N.InstanceType is set to Secondary or left empty, you cannot specify this parameter.</p>
         * </li>
         * <li><p>After you specify this parameter, Amount can only be set to 1, and you cannot specify Ipv6AddressCount, Ipv6Address.N, or NetworkInterface.N.Ipv6AddressCount.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Ipv6Address")
        public java.util.List<String> ipv6Address;

        /**
         * <p>The number of IPv6 addresses to be randomly generated for the primary ENI. Valid values: 1 to 10.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>This parameter takes effect only when NetworkInterface.N.InstanceType is set to Primary. If NetworkInterface.N.InstanceType is set to Secondary or left empty, you cannot specify this parameter.</p>
         * </li>
         * <li><p>After you specify this parameter, you cannot specify Ipv6AddressCount, Ipv6Address.N, or NetworkInterface.N.Ipv6Address.N.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Long ipv6AddressCount;

        /**
         * <p>The index of the network card specified for the ENI.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>Only specific instance types support specifying the network card index.</li>
         * <li>When NetworkInterface.N.InstanceType is set to Primary, if the instance type supports network cards and you specify this parameter, you can only set it to 0.</li>
         * <li>When NetworkInterface.N.InstanceType is set to Secondary or left empty, if the instance type supports network cards, you can specify this parameter based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetworkCardIndex")
        public Integer networkCardIndex;

        /**
         * <p>The ID of the ENI attached to the instance.</p>
         * <p>After you specify this parameter, Amount can only be set to 1.</p>
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
         * <p>The name of the ENI. The name must be 2 to 128 characters in length. It can contain letters and digits in the Unicode letter category. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The valid values of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum number of network interface controllers (NICs) supported by the instance type.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you do not need to specify this parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Network_Name</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The communication mode of the network interface controller (NIC). Valid values of the parameter:</p>
         * <ul>
         * <li>Standard: Uses the TCP communication mode.</li>
         * <li>HighPerformance: Enables the Elastic RDMA Interface (ERI) and uses the RDMA communication mode.</li>
         * </ul>
         * <p>Default value: Standard.</p>
         * <blockquote>
         * <p>The number of Elastic Network Interfaces (ENIs) in RDMA mode cannot exceed the limit of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>Adds an ENI and specifies a primary IP address.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The valid values of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum number of network interface controllers (NICs) supported by the instance type.</p>
         * <ul>
         * <li>When you configure one ENI, you can configure one primary ENI or one secondary ENI. If the Amount parameter is set to a value greater than 1, and you configure a primary ENI and specify this parameter, consecutive primary IP addresses are allocated to multiple ECS instances starting from the specified primary IP address when you create instances in batches. Note that you cannot attach secondary ENIs to instances in this case.</li>
         * <li>Note that if the Amount parameter is set to a value greater than 1 and you specify this parameter for the primary ENI, you cannot configure secondary ENIs. This means you cannot set NetworkInterface.2.InstanceType to Secondary.</li>
         * </ul>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, this parameter serves the same purpose as PrivateIpAddress, but you cannot specify both PrivateIpAddress and this parameter.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Secondary or left empty, this parameter specifies the primary IP address for the secondary ENI. By default, an IP address is randomly selected from the vSwitch CIDR block of the vSwitch to which the ENI belongs.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The first and last three IP addresses of each vSwitch are system reserved IP addresses and cannot be specified.
         * For example, if the vSwitch CIDR block is 192.168.1.0/24, the following four IP addresses are system reserved IP addresses: 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>172.16.**.**</code></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The number of ENI queues.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The valid values of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum number of network interface controllers (NICs) supported by the instance type.</p>
         * </li>
         * <li><p>The value cannot exceed the maximum number of queues per ENI allowed by the instance type.</p>
         * </li>
         * <li><p>The total number of queues for all ENIs of the instance cannot exceed the total queue quota allowed by the instance type. You can invoke the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and query the MaximumQueueNumberPerEni and TotalEniQueueQuantity fields to obtain the maximum number of queues per ENI and the total queue quota for the instance type.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary and you specify this parameter, you cannot specify the NetworkInterfaceQueueNumber parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of RDMA ENI queues.</p>
         * <p>If you want to attach multiple RDMA ENIs to the instance, we recommend that you manually specify QueuePairNumber for each ENI based on the maximum QueuePairNumber supported by the instance type and the planned number of ENIs. Make sure that the total QueuePairNumber of all ENIs does not exceed the maximum value allowed by the instance type. You can call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum value for the instance type.</p>
         * <blockquote>
         * <p>Notice: If QueuePairNumber is not specified for an RDMA ENI, the maximum QueuePairNumber supported by all RDMA ENIs for the instance type is used by default. Therefore, after you attach an RDMA ENI for which QueuePairNumber is not specified, you cannot attach more RDMA ENIs. Regular ENIs are not subject to this limit.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueuePairNumber")
        public Long queuePairNumber;

        /**
         * <p>The inbound queue depth of the ENI.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available. If you want to use this parameter, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a> to apply for the whitelist.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available. If you want to use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a> to apply for the whitelist.</p>
         * </blockquote>
         * <p>Take note of the following items when you use this parameter:</p>
         * <ul>
         * <li><p>This parameter is applicable only to seventh-generation and later ECS instance types.</p>
         * </li>
         * <li><p>This parameter is applicable only to Linux images.</p>
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
         * <p>The number of secondary private IPv4 addresses to be allocated to the ENI. Valid values: 1 to 49.</p>
         * <ul>
         * <li>The value cannot exceed the limit on the number of IP addresses for the instance type. For more information, see <a href="~~~25378~~">Instance families</a>.</li>
         * <li>NetworkInterface.N.SecondaryPrivateIpAddressCount specifies the number of secondary private IPv4 addresses to be allocated to the ENI, excluding the primary private IP address of the ENI. The system randomly allocates the addresses from the active CIDR block of the vSwitch (NetworkInterface.N.VSwitchId) to which the ENI belongs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The ID of the security group to which the ENI belongs.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The valid values of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum number of network interface controllers (NICs) supported by the instance type.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you must specify this parameter. In this case, this parameter serves the same purpose as SecurityGroupId, but you cannot specify SecurityGroupId, SecurityGroupIds.N, or NetworkInterface.N.SecurityGroupIds.N.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Secondary or left empty, this parameter is optional. The default value is the security group to which the ECS instance belongs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of one or more security groups to which the ENI belongs.</p>
         * <ul>
         * <li>The valid values of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum number of network interface controllers (NICs) supported by the instance type.</li>
         * <li>The second N indicates that you can specify one or more security group IDs. The valid values of N depend on the quota of security groups to which the instance can be added. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you must specify this parameter or NetworkInterface.N.SecurityGroupId. In this case, this parameter serves the same purpose as SecurityGroupIds.N, but you cannot specify SecurityGroupId, SecurityGroupIds.N, or NetworkInterface.N.SecurityGroupId.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Secondary or left empty, this parameter is optional. The default value is the security group to which the ECS instance belongs.</p>
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
         * <li><p>true: Enables the feature.</p>
         * </li>
         * <li><p>false: Disables the feature.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>This feature is supported only in specific regions. Before you use this feature, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source/destination checking</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SourceDestCheck")
        public Boolean sourceDestCheck;

        /**
         * <p>The outbound queue depth of the ENI.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available. If you want to use this parameter, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a> to apply for the whitelist.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not available. If you want to use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a> to apply for the whitelist.</p>
         * </blockquote>
         * <p>Take note of the following items when you use this parameter:</p>
         * <ul>
         * <li><p>This parameter is applicable only to seventh-generation and later ECS instance types.</p>
         * </li>
         * <li><p>This parameter is applicable only to Linux images.</p>
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
         * <p>The ID of the vSwitch to which the ENI belongs.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The valid values of N cannot exceed the maximum number of network interface controllers (NICs) supported by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum number of network interface controllers (NICs) supported by the instance type.  </p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Primary, you must specify this parameter. In this case, this parameter serves the same purpose as VSwitchId, but you cannot specify both VSwitchId and this parameter.</p>
         * </li>
         * <li><p>If NetworkInterface.N.InstanceType is set to Secondary or left empty, this parameter is optional. The default value is the vSwitch to which the ECS instance belongs.</p>
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
         * <p>The bandwidth weight of the instance. The valid values vary based on the instance type. You can call the DescribeInstanceTypes operation to query the valid values for a specific instance type. The BandwidthWeighting field in the response indicates the bandwidth weight levels supported by the instance type. You can use the name field in the response as the dictionary value, such as Vpc-L1 and Ebs-L1.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("BandwidthWeighting")
        public String bandwidthWeighting;

        /**
         * <p>Specifies whether to enable the Jumbo Frame feature for the instance. Valid values:</p>
         * <ul>
         * <li><p>false: Disables the Jumbo Frame feature. The maximum transmission unit (MTU) of all ENIs (including the primary ENI and secondary ENIs) of the instance is set to 1500.</p>
         * </li>
         * <li><p>true: Enables the Jumbo Frame feature. The MTU of all ENIs (including the primary ENI and secondary ENIs) of the instance is set to 8500.</p>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p>Only specific eighth-generation and later instance types support the Jumbo Frame feature. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">MTU of ECS instances</a>.</p>
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
         * <li><p>true: Enables the resolution.</p>
         * </li>
         * <li><p>false: Disables the resolution.</p>
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
         * <li><p>true: Enables the resolution.</p>
         * </li>
         * <li><p>false: Disables the resolution.</p>
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
         * <li>true: Enables the resolution.</li>
         * <li>false: Disables the resolution.</li>
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
         * <li>true: Enables the resolution.</li>
         * <li>false: Disables the resolution.</li>
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
         * <li>Custom: Custom hostname.</li>
         * <li>IpBased: IP-based hostname.</li>
         * <li>InstanceIdBased: Instance ID-based hostname.</li>
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
         * <p>The tag key of the instance, cloud disks, and primary ENI. Valid values of N: 1 to 20. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance, cloud disks, and primary ENI. Valid values of N: 1 to 20. If you specify this parameter, it can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
