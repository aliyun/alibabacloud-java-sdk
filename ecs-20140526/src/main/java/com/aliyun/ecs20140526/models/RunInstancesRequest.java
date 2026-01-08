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
     * <p>Specifies whether to associate an instance on a dedicated host with the dedicated host. Valid values:</p>
     * <ul>
     * <li>default: does not associate the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance is automatically deployed to another dedicated host in the automatic deployment resource pool if the available resources of the original dedicated host are insufficient.</li>
     * <li>host: associates the instance with the dedicated host. When you start an instance that was stopped in economical mode, the instance remains on the original dedicated host. If the available resources of the original dedicated host are insufficient, the instance cannot be started.</li>
     * </ul>
     * <p>Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <p>The desired number of ECS instances that you want to create. Valid values: 1 to 100.</p>
     * <p>The number of ECS instances that can be created varies based on the Amount and MinAmount values.</p>
     * <ul>
     * <li><p>If you do not specify MinAmount, the RunInstances operation creates ECS instances based on the Amount value. If the available resources are insufficient to create the desired number of ECS instances, the RunInstances operation returns an error response and no ECS instances are created.</p>
     * </li>
     * <li><p>If you specify MinAmount, take note of the following items:</p>
     * <ul>
     * <li>If the available resources are insufficient to create the minimum number of ECS instances, no ECS instances are created and the RunInstances operation returns an error response.</li>
     * <li>If the available resources are insufficient to create the desired number of ECS instances but are sufficient to create the minimum number of ECS instances, the RunInstances operation uses the available resources to create ECS instances and returns a success response. In this case, the number of ECS instances that can be created is less than the desired number of ECS instances.</li>
     * <li>If the available resources are sufficient to create the desired number of ECS instances, the RunInstances operation uses the available resources to create the desired number of ECS instances and returns a success response.</li>
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
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<RunInstancesRequestArn> arn;

    /**
     * <p>Specifies whether to automatically complete the payment for instance creation. Valid values:</p>
     * <ul>
     * <li><p>true: The payment is automatically completed.</p>
     * <p>**</p>
     * <p><strong>Note</strong> Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and is canceled. If your account balance is insufficient, you can set <code>AutoPay</code> to <code>false</code> to generate an unpaid order. Then, you can log on to the ECS console to pay for the order.</p>
     * </li>
     * <li><p>false: An order is generated but no payment is made.</p>
     * <p>**</p>
     * <p><strong>Note</strong> When <code>InstanceChargeType</code> is set to <code>PostPaid</code>, <code>AutoPay</code> cannot be set to <code>false</code>.</p>
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
     * <p>The time when to automatically release the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601 standard</a> in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <ul>
     * <li>If the value of seconds (<code>ss</code>) is not <code>00</code>, the start time is automatically rounded to the nearest minute based on the value of minutes (<code>mm</code>).</li>
     * <li>The specified time must be at least 30 minutes later than the current time.</li>
     * <li>The specified time can be at most three years later than the current time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2018-01-01T12:05:00Z</p>
     */
    @NameInMap("AutoReleaseTime")
    public String autoReleaseTime;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. This parameter is valid only when the <code>InstanceChargeType</code> parameter is set to <code>PrePaid</code>. Valid values:</p>
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
     * <p>The auto-renewal period of the instance. Valid values:</p>
     * <ul>
     * <li>Valid values when PeriodUnit is set to Week: 1, 2, and 3.</li>
     * <li>Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.**** For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClockOptions")
    public RunInstancesRequestClockOptions clockOptions;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li>Standard: the standard mode. For more information, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * <li>Unlimited: the unlimited mode. For more information, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Burstable instances</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The data disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<RunInstancesRequestDataDisk> dataDisk;

    /**
     * <p>The ID of the dedicated host.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the list of dedicated host IDs.</p>
     * <blockquote>
     * <p>Spot instances cannot be created on dedicated hosts. If you specify DedicatedHostId, SpotStrategy and SpotPriceLimit are automatically ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>Specifies whether to enable release protection for the instance. This parameter determines whether you can use the ECS console or call the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation to release the instance. Valid values:</p>
     * <ul>
     * <li>true: enables release protection for the instance.</li>
     * <li>false: disables release protection for the instance.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This parameter is applicable to only pay-as-you-go instances. It can protect instances against manual releases, but not against automatic releases.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The number of the deployment set group to which to deploy the instance. If the deployment set specified by the DeploymentSetId parameter uses the high availability group strategy (AvailabilityGroup), you can use the DeploymentSetGroupNo parameter to specify a deployment set group in the deployment set. Valid values: 1 to 7.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DeploymentSetGroupNo")
    public Integer deploymentSetGroupNo;

    /**
     * <p>The ID of the deployment set to which to deploy the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-bp1brhwhoqinyjd6****</p>
     */
    @NameInMap("DeploymentSetId")
    public String deploymentSetId;

    /**
     * <p>The description of the instance. The description must be 2 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance_Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Default value: false. Valid values:</p>
     * <ul>
     * <li>true: The validity of the request is checked but the request is not made. Check items include whether required parameters are specified, the request format, service limits, and available ECS resources. If the check fails, the corresponding error code is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li>false: The validity of the request is checked, and the request is made if the check succeeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The hostname of the instance. Take note of the following items:</p>
     * <ul>
     * <li><p>The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</p>
     * </li>
     * <li><p>For Windows instances, the hostname must be 2 to 15 characters in length and cannot contain periods (.) or contain only digits. It can contain letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>For instances that run other operating systems such as Linux, take note of the following items:</p>
     * <ul>
     * <li>The hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</li>
     * <li>You can use the <code>${instance_id}</code> placeholder to pass instance IDs into the hostname specified by <code>HostName</code>. For example, if you set <code>HostName</code> to k8s-${instance_id} and the instance is assigned an ID of <code>i-123abc****</code>, the hostname of the instance is <code>k8s-i-123abc****</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>When you create multiple instances, you can perform the following operations:</p>
     * <ul>
     * <li>Batch configure sequential hostnames for the instances. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</li>
     * <li>Use the <code>HostNames.N</code> parameter to configure different hostnames for instances. You cannot specify both the <code>HostName</code> and <code>HostNames.N</code> parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-ecshost</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The hostname of instance N. You can use this parameter to specify different hostnames for multiple instances.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-host-01</p>
     */
    @NameInMap("HostNames")
    public java.util.List<String> hostNames;

    /**
     * <p>The ID of the high performance computing (HPC) cluster to which the instance belongs.</p>
     * <p>This parameter is required when you create instances of a Supper Computing Cluster (SCC) instance type. For information about how to create an HPC cluster, see <a href="https://help.aliyun.com/document_detail/109138.html">CreateHpcCluster</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>hpc-bp67acfmxazb4p****</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
     * <ul>
     * <li>enabled</li>
     * <li>disabled</li>
     * </ul>
     * <p>Default value: enabled.</p>
     * <blockquote>
     * <p>For more information about instance metadata, see <a href="https://help.aliyun.com/document_detail/49122.html">Overview of ECS instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether to forcefully use the security-enhanced mode (IMDSv2) to access instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: does not forcefully use the security-enhanced mode (IMDSv2).</li>
     * <li>required: forcefully uses the security-enhanced mode (IMDSv2). After you set this parameter to required, you cannot access instance metadata in normal mode.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes of accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/150575.html">Access mode of instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. You can set this parameter to obtain the latest available custom image from the specified image family to create instances.</p>
     * <p>The name must be 2 to 128 characters in length. The name cannot start with a digit, a special character, http://, or https://. The name can contain letters, digits, periods (.), underscores (_), hyphens (-), and colons (:).</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>If you specify <code>ImageId</code>, you cannot specify ImageFamily.</li>
     * <li>If you do not specify <code>ImageId</code> but use <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template that has <code>ImageId</code> specified, you cannot specify ImageFamily.</li>
     * <li>If you do not specify <code>ImageId</code> but use <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template that does not have <code>ImageId</code> specified, you can specify ImageFamily.</li>
     * <li>If you do not specify <code>ImageId</code>, <code>LaunchTemplateId</code>, or <code>LaunchTemplateName</code>, you can specify ImageFamily.</li>
     * </ul>
     * <blockquote>
     * <p> For information about image families that are associated with Alibaba Cloud official images, see <a href="https://help.aliyun.com/document_detail/108393.html">Overview of public images</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image. You can call the <a href="https://help.aliyun.com/document_detail/25534.html">DescribeImages</a> operation to query available images. If you do not use <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template and do not set <code>ImageFamily</code> to obtain the latest available custom image from a specified image family, you must specify <code>ImageId</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_2_1903_x64_20G_alibase_20200324.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>Details about the image options.</p>
     */
    @NameInMap("ImageOptions")
    public RunInstancesRequestImageOptions imageOptions;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription</li>
     * <li>PostPaid: pay-as-you-go</li>
     * </ul>
     * <p>Default value: PostPaid.</p>
     * <p>If you set this parameter to PrePaid, make sure that your account has sufficient balance or credit. Otherwise, an <code>InvalidPayMethod</code> error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the ECS instance. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). The default value of this parameter is the <code>InstanceId</code> value.</p>
     * <p>When you batch create instances, you can batch configure sequential names for the instances. The sequential names can contain brackets ([ ]) and commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-alibabacloud</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type. If you do not use <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template, you must set the <code>InstanceType</code> parameter.</p>
     * <ul>
     * <li>Select an instance type. See <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the performance data of an instance type, or see <a href="https://help.aliyun.com/document_detail/58291.html">Best practices for instance type selection</a> to learn about how to select instance types.</li>
     * <li>Query available resources. Call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to query available resources in a specific region or zone.</li>
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
     * <li>PayByBandwidth: pay-by-bandwidth</li>
     * <li>PayByTraffic: pay-by-traffic</li>
     * </ul>
     * <p>Default value: PayByTraffic.</p>
     * <blockquote>
     * <p>When the <strong>pay-by-traffic</strong> billing method for network usage is used, the maximum inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instance, use the <strong>pay-by-bandwidth</strong> billing method for network usage.</p>
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
     * <li>When the purchased outbound public bandwidth is less than or equal to 10 Mbit/s, the valid values of InternetMaxBandwidthIn are 1 to 10, and the default value is 10.</li>
     * <li>When the purchased outbound public bandwidth is greater than 10 Mbit/s, the valid values of this parameter are 1 to the <code>InternetMaxBandwidthOut</code> value and the default value is the <code>InternetMaxBandwidthOut</code> value.</li>
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
     * <p>Specifies whether the instance is I/O optimized. For instances of <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, the default value is none. For instances of other instance types, the default value is optimized. Valid values:</p>
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
     * <p>IPv6 address N to be assigned to the primary ENI. Valid values of N: 1 to 10.</p>
     * <p>Example: <code>Ipv6Address.1=2001:db8:1234:1a00::***</code>.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>If the <code>Ipv6Address.N</code> parameter is specified, you must set the <code>Amount</code> parameter to 1 and leave the <code>Ipv6AddressCount</code> parameter empty.</li>
     * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot set <code>Ipv6Addresses.N</code> or <code>Ipv6AddressCount</code> and must set <code>NetworkInterface.N.Ipv6Addresses.N</code> or <code>NetworkInterface.N.Ipv6AddressCount</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ipv6Address.1=2001:db8:1234:1a00::***</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The number of IPv6 addresses to randomly generate for the primary ENI. Valid values: 1 to 10.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You cannot specify both the <code>Ipv6Addresses.N</code> and <code>Ipv6AddressCount</code> parameters.</li>
     * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot specify <code>Ipv6Address.N</code> or <code>Ipv6AddressCount</code> but can specify <code>NetworkInterface.N.Ipv6Address.N</code> or <code>NetworkInterface.N.Ipv6AddressCount</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is unavailable.</p>
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
     * <p>For Windows instances, this parameter is ignored. This parameter is empty by default. The <code>Password</code> parameter takes effect even if the KeyPairName parameter is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>KeyPair_Name</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The ID of the launch template. For more information, call the <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a> operation.</p>
     * <p>To use a launch template to create an instance, you must use the <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> parameter to specify the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>lt-bp1apo0bbbkuy0rj****</p>
     */
    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    /**
     * <p>The name of the launch template.</p>
     * <p>To use a launch template to create an instance, you must use the <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> parameter to specify the launch template.</p>
     * 
     * <strong>example:</strong>
     * <p>LaunchTemplate_Name</p>
     */
    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    /**
     * <p>The version of the launch template. If you set the <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> parameter but do not set the version number of the launch template, the default template version is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LaunchTemplateVersion")
    public Long launchTemplateVersion;

    /**
     * <p>The minimum number of ECS instances that you want to create. Valid values: 1 to 100.</p>
     * <p>The number of ECS instances that can be created varies based on the Amount and MinAmount values.</p>
     * <ul>
     * <li><p>If you do not specify MinAmount, the RunInstances operation creates ECS instances based on the Amount value. If the available resources are insufficient to create the desired number of ECS instances, the RunInstances operation returns an error response and no ECS instances are created.</p>
     * </li>
     * <li><p>If you specify MinAmount, take note of the following items:</p>
     * <ul>
     * <li>If the available resources are insufficient to create the minimum number of ECS instances, no ECS instances are created and the RunInstances operation returns an error response.</li>
     * <li>If the available resources are insufficient to create the desired number of ECS instances but are sufficient to create the minimum number of ECS instances, the RunInstances operation uses the available resources to create ECS instances and returns a success response. In this case, the number of ECS instances that can be created is less than the desired number of ECS instances.</li>
     * <li>If the available resources are sufficient to create the desired number of ECS instances, the RunInstances operation uses the available resources to create the desired number of ECS instances and returns a success response.</li>
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
     * <p>The information of the elastic network interfaces (ENIs).</p>
     */
    @NameInMap("NetworkInterface")
    public java.util.List<RunInstancesRequestNetworkInterface> networkInterface;

    /**
     * <p>The number of queues supported by the primary ENI. Take note of the following items:</p>
     * <ul>
     * <li>The value of this parameter cannot exceed the maximum number of queues per ENI allowed for the instance type.</li>
     * <li>The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> values.</li>
     * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot specify <code>NetworkInterfaceQueueNumber</code> but can specify <code>NetworkInterface.N.QueueNumber</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("NetworkInterfaceQueueNumber")
    public Integer networkInterfaceQueueNumber;

    /**
     * <p>Details about network options.</p>
     */
    @NameInMap("NetworkOptions")
    public RunInstancesRequestNetworkOptions networkOptions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include:</p>
     * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * <blockquote>
     * <p>If the <code>Password</code> parameter is specified, we recommend that you send requests over HTTPS to prevent password leaks.</p>
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
     * <li>true: uses the preset password.</li>
     * <li>false: does not use the preset password.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If you set this parameter to true, make sure that you leave the Password parameter empty and the selected image has a preset password.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription period of the instance. The unit is specified by the <code>PeriodUnit</code> parameter. This parameter is valid and required only when <code>InstanceChargeType</code> is set to <code>PrePaid</code>. If the <code>DedicatedHostId</code> parameter is specified, the value of Period must not exceed the subscription period of the specified dedicated host. Valid values:</p>
     * <ul>
     * <li>Valid values when PeriodUnit is set to Week: 1, 2, 3, and 4.</li>
     * <li>Valid values when PeriodUnit is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period. Default value: Month. Valid values:</p>
     * <ul>
     * <li>Week</li>
     * <li>Month</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The private domain name options of the instance.</p>
     * <p>For information about the resolution of ECS private domain names, see <a href="https://help.aliyun.com/document_detail/2844797.html">ECS private DNS resolution</a>.</p>
     */
    @NameInMap("PrivateDnsNameOptions")
    public RunInstancesRequestPrivateDnsNameOptions privateDnsNameOptions;

    /**
     * <p>The private IP address to assign to the instance. To assign a private IP address to an instance that resides in a VPC, make sure that the IP address is an idle IP address within the CIDR block of the vSwitch specified by <code>VSwitchId</code>.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>If <code>PrivateIpAddress</code> is specified, take note of the following items:</p>
     * <ul>
     * <li>If <code>Amount</code> is set to 1, a single instance is created and the specified private IP address is assigned to the instance.</li>
     * <li>If <code>Amount</code> is set to a numeric value greater than 1, the specified number of instances are created and consecutive private IP addresses starting from the specified one are assigned to the instances. In this case, you cannot specify parameters that start with <code>NetworkInterface.N</code> to attach secondary ENIs to the instances.</li>
     * </ul>
     * </li>
     * <li><p>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot specify <code>PrivateIpAddress</code> but can specify <code>NetworkInterface.N.PrimaryIpAddress</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> The first IP address and last three IP addresses of each vSwitch CIDR block are reserved. You cannot specify the IP addresses. For example, if a vSwitch CIDR block is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><code>10.1.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the Resource Access Management (RAM) role. You can call the <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> operation provided by RAM to query the instance RAM roles that you created.</p>
     * 
     * <strong>example:</strong>
     * <p>RAM_Name</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the region in which to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the instance.</p>
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
     * <li>Active: enables security hardening. This value is applicable only to public images.</li>
     * <li>Deactive: does not enable security hardening. This value is applicable to all images.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which you want to assign the instance. Instances in the same security group can communicate with each other. The maximum number of instances allowed in a security group varies based on the type of the security group. For more information, see the &quot;Security group limits&quot; section in <a href="~~25412#SecurityGroupQuota~~">Limits and quotas</a>.</p>
     * <blockquote>
     * <p> The network type of the new instance is the same as the network type of the security group specified by <code>SecurityGroupId</code>. For example, if the specified security group is of the VPC type, the new instance is also of the VPC type and you must specify <code>VSwitchId</code>.</p>
     * </blockquote>
     * <p>If you do not use <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template, you must specify a security group ID. When you specify this parameter, take note of the following items:</p>
     * <ul>
     * <li>You can set <code>SecurityGroupId</code> to specify a single security group or set <code>SecurityGroupIds.N</code> to specify one or more security groups. However, you cannot specify both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code> in the same request.</li>
     * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot specify <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code> but can specify <code>NetworkInterface.N.SecurityGroupId</code> or <code>NetworkInterface.N.SecurityGroupIds.N</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg7****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of security groups to which to assign the instance. The valid values of N vary based on the maximum number of security groups to which an instance can belong. For more information, see the <a href="https://help.aliyun.com/document_detail/101348.html">Security group limits</a> section of the &quot;Limits&quot; topic.</p>
     * <p>When you specify this parameter, take note of the following items:</p>
     * <ul>
     * <li>You cannot specify both <code>SecurityGroupId</code> and <code>SecurityGroupIds.N</code> in the same request.</li>
     * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot specify <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code> but can specify <code>NetworkInterface.N.SecurityGroupId</code> or <code>NetworkInterface.N.SecurityGroupIds.N</code>.</li>
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
     * <li>1: After a spot instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
     * <li>0: After a spot instance is created, Alibaba Cloud does not ensure that the instance can run for one hour. The system compares the biding price with the market prices and checks the resource inventory to determine whether to retain or release the instance.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can set this parameter only to 0 or 1.</p>
     * </li>
     * <li><p>The spot instance is billed by second. Specify an appropriate protection period.</p>
     * </li>
     * <li><p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode of the spot instance. Valid values:</p>
     * <ul>
     * <li><p>Terminate: The instance is released.</p>
     * </li>
     * <li><p>Stop: The instance is stopped in economical mode.</p>
     * <p>For information about the economical mode, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
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
     * <p>The maximum hourly price of the instance. The value is accurate to three decimal places. This parameter is valid only when the <code>SpotStrategy</code> parameter is set to <code>SpotWithPriceLimit</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0.97</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the pay-as-you-go instance. This parameter is valid only when the <code>InstanceChargeType</code> parameter is set to <code>PostPaid</code>. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is created as a spot instance with a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is created as a spot instance for which the market price at the time of purchase is automatically used as the bid price.</li>
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
     * <p>The tags to add to the instance, disks, and primary ENI.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RunInstancesRequestTag> tag;

    /**
     * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
     * <ul>
     * <li>default: creates the instance on a non-dedicated host.</li>
     * <li>host: creates the instance on a dedicated host. If you do not set the <code>DedicatedHostId</code> parameter, Alibaba Cloud selects a dedicated host for the instance.</li>
     * </ul>
     * <p>Default value: default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>Specifies whether to automatically append incremental suffixes to the hostname specified by the <code>HostName</code> parameter and to the instance name specified by the <code>InstanceName</code> parameter when you batch create instances. The incremental suffixes can range from 001 to 999. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * <p>When the <code>HostName</code> or <code>InstanceName</code> value is set in the <code>name_prefix[begin_number,bits]</code> format without <code>name_suffix</code>, the <code>UniqueSuffix</code> parameter does not take effect. The names are sorted in the specified sequence.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UniqueSuffix")
    public Boolean uniqueSuffix;

    /**
     * <p>The user data of the instance. You must specify Base64-encoded data. The instance user data cannot exceed 32 KB in size before Base64 encoding.</p>
     * <p>For information about the limits, formats, and running frequencies of instance user data, see <a href="https://help.aliyun.com/document_detail/49121.html">Instance user data</a>.</p>
     * <blockquote>
     * <p> To ensure security, we recommend that you do not use plaintext to pass in confidential information, such as passwords or private keys, as user data. If you need to pass in confidential information, we recommend that you encrypt and encode the information in Base64 and then decode and decrypt the information in the same manner in the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the vSwitch to which to connect to the instance. You must set this parameter when you create an instance of the VPC type. The specified vSwitch and security group must belong to the same VPC. You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query available vSwitches.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>If you specify the <code>VSwitchId</code> parameter, the zone specified by the <code>ZoneId</code> parameter must be the zone where the specified vSwitch is located. You can also leave the <code>ZoneId</code> parameter empty. Then, the system selects the zone where the specified vSwitch resides.</li>
     * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you cannot specify <code>VSwitchId</code> but can specify <code>NetworkInterface.N.VSwitchId</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the zone in which to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
     * <blockquote>
     * <p>If you specify the <code>VSwitchId</code> parameter, the zone specified by the <code>ZoneId</code> parameter must be the zone where the vSwitch is located. You can also leave the <code>ZoneId</code> parameter empty. Then, the system selects the zone where the specified vSwitch is located.</p>
     * </blockquote>
     * <p>This parameter is empty by default.</p>
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
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <p>This parameter is no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Numa")
        public String numa;

        /**
         * <p>The number of threads per CPU core. The following formula is used to calculate the number of vCPUs of the instance: <code>CpuOptions.Core</code> value × <code>CpuOptions.ThreadsPerCore</code> value.</p>
         * <ul>
         * <li>If <code>CpuOptionsThreadPerCore</code> is set to 1, Hyper-Threading (HT) is disabled.</li>
         * <li>This parameter is applicable only to specific instance types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ThreadsPerCore")
        public Integer threadsPerCore;

        /**
         * <p>The CPU topology type of the instance. Valid values:</p>
         * <ul>
         * <li>ContinuousCoreToHTMapping: The HT technology allows continuous threads to run on the same core in the CPU topology of the instance.``</li>
         * <li>DiscreteCoreToHTMapping: The HT technology allows discrete threads to run on the same core in the CPU topology of the instance.``</li>
         * </ul>
         * <p>This parameter is empty by default.</p>
         * <blockquote>
         * <p> This parameter is supported only for specific instance families. For more information about the supported instance families, see <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify the CPU topology</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DiscreteCoreToHTMapping</p>
         */
        @NameInMap("TopologyType")
        public String topologyType;

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

    }

    public static class RunInstancesRequestHibernationOptions extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is unavailable.</p>
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
         * <p>The ID of the private pool. The ID of a private pool is the same as that of the elasticity assurance or capacity reservation for which the private pool is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the private pool to use to create the instance. A private pool is generated after an elasticity assurance or a capacity reservation takes effect. You can select the private pool when you start an instance. Valid values:</p>
         * <ul>
         * <li>Open: open private pool. The system selects a matching open private pool to create the instance. If no matching open private pools are found, resources in the public pool are used. When you set this parameter to Open, you can leave the <code>PrivatePoolOptions.Id</code> parameter empty.</li>
         * <li>Target: specified private pool. The system uses the capacity in a specified private pool to create the instance. If the specified private pool is unavailable, the instance cannot be created. If you set this parameter to Target, you must specify the <code>PrivatePoolOptions.Id</code> parameter.</li>
         * <li>None: no private pool. The capacity in private pools is not used.</li>
         * </ul>
         * <p>Default value: None.</p>
         * <p>In the following scenarios, the PrivatePoolOptions.MatchCriteria parameter can be set only to <code>None</code> or left empty:</p>
         * <ul>
         * <li>A spot instance is created.</li>
         * <li>The instance is created in the classic network.</li>
         * <li>The instance is created on a dedicated host.</li>
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
         * <p>The ID of the dedicated host cluster in which to create the instance. After this parameter is specified, the system selects one dedicated host from the specified cluster to create the instance.</p>
         * <blockquote>
         * <p>This parameter is valid only when the <code>Tenancy</code> parameter is set to <code>host</code>.</p>
         * </blockquote>
         * <p>When you specify both the <code>DedicatedHostId</code> and <code>SchedulerOptions.DedicatedHostClusterId</code> parameters, take note of the following items:</p>
         * <ul>
         * <li>If the specified dedicated host belongs to the specified dedicated host cluster, the instance is preferentially deployed on the specified dedicated host.</li>
         * <li>If the specified dedicated host does not belong to the specified dedicated host cluster, the instance cannot be created.</li>
         * </ul>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/184145.html">DescribeDedicatedHostClusters</a> operation to query the list of dedicated host cluster IDs.</p>
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
         * <p>The confidential computing mode. Set the value to Enclave.</p>
         * <p>A value of Enclave indicates that an enclave-based confidential computing environment is built on the instance. When you call the <code>RunInstances</code> operation, you can set this parameter only for c7, g7, or r7 instances to use enclave-based confidential computing. Take note of the following items:</p>
         * <ul>
         * <li>The confidential computing feature is in invitational preview.</li>
         * <li>When you use the ECS API to create instances that support enclave-based confidential computing, you can call only the <code>RunInstances</code> operation. The <code>CreateInstance</code> operation does not support the <code>SecurityOptions.ConfidentialComputingMode</code> parameter.</li>
         * <li>Enclave-based confidential computing is implemented based on Alibaba Cloud Trusted System (vTPM). When you build a confidential computing environment on an instance by using Enclave, Alibaba Cloud Trusted System is enabled for the instance. If you set <code>SecurityOptions.ConfidentialComputingMode</code> to Enclave when you call this operation, the created instances use enclave-based confidential computing and Alibaba Cloud Trusted System regardless of whether <code>SecurityOptions.TrustedSystemMode</code> is set to vTPM.</li>
         * </ul>
         * <p>For more information about confidential computing, see <a href="https://help.aliyun.com/document_detail/203433.html">Build a confidential computing environment by using Enclave</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Enclave</p>
         */
        @NameInMap("ConfidentialComputingMode")
        public String confidentialComputingMode;

        /**
         * <p>The trusted system mode. Set the value to vTPM.</p>
         * <p>The trusted system mode supports the following instance families:</p>
         * <ul>
         * <li>g7, c7, and r7</li>
         * <li>Security-enhanced instance families: g7t, c7t, and r7t</li>
         * </ul>
         * <p>When you create instances of the preceding instance families, you must set this parameter. Take note of the following items:</p>
         * <ul>
         * <li>To use the Alibaba Cloud trusted system, set this parameter to vTPM. Then, the Alibaba Cloud trusted system performs trust verifications when the instances start.</li>
         * <li>If you do not want to use the Alibaba Cloud trusted system, leave this parameter empty. Note that if your created instances use an enclave-based confidential computing environment (with <code>SecurityOptions.ConfidentialComputingMode</code> set to Enclave), the Alibaba Cloud trusted system is enabled for the instances.</li>
         * <li>When you use the ECS API to create instances that use the trusted system, you can call only the <code>RunInstances</code> operation. The <code>CreateInstance</code> operation does not support the <code>SecurityOptions.TrustedSystemMode</code> parameter.</li>
         * </ul>
         * <blockquote>
         * <p>If you have configured an instance as a trusted one when you created the instance, you can use only an image that support the trusted system to replace the system disk of the instance.</p>
         * </blockquote>
         * <p>For more information about the trusted system, see <a href="https://help.aliyun.com/document_detail/201394.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>vTPM</p>
         */
        @NameInMap("TrustedSystemMode")
        public String trustedSystemMode;

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

    }

    public static class RunInstancesRequestSystemDisk extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy to apply to the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: utra disk</li>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_essd: enhanced SSD (ESSD)</li>
         * <li>cloud: basic disk</li>
         * <li>cloud_auto: ESSD AutoPL disk</li>
         * <li>cloud_essd_entry: ESSD Entry disk</li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter can be <code>cloud_essd_entry</code> only when <code>InstanceType</code> is set to <code>ecs.u1</code> or <code>ecs.e</code>. ecs.u1 indicates the u1 universal instance family and ecs.e indicates the e economy instance family. For information about the u1 and e instance families, see the <a href="https://help.aliyun.com/document_detail/457079.html">u1, universal instance family</a> section in the &quot;Universal instance families&quot; topic and the <a href="https://help.aliyun.com/document_detail/108489.html">e, economy instance family</a> section in the &quot;Shared instance families&quot; topic.</p>
         * </blockquote>
         * <p>For non-I/O optimized instances of retired instance types, the default value is cloud. For other types of instances, the default value is cloud_efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length. The description can contain letters but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length and support Unicode characters under the Decimal Number category and the categories whose names contain Letter. The name can contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdSystem</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The performance level of the ESSD to use as the system disk. Default value: PL1. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For more information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>Basic disk: 20 to 500.</p>
         * </li>
         * <li><p>ESSD: Valid values vary based on the performance level of the ESSD.</p>
         * <ul>
         * <li>PL0 ESSD: 1 to 2048.</li>
         * <li>PL1 ESSD: 20 to 2048.</li>
         * <li>PL2 ESSD: 461 to 2048.</li>
         * <li>PL3 ESSD: 1261 to 2048.</li>
         * </ul>
         * </li>
         * <li><p>ESSD AutoPL disk: 1 to 2048.</p>
         * </li>
         * <li><p>Other disk categories: 20 to 2048.</p>
         * </li>
         * </ul>
         * <p>The value of this parameter must be at least 1 and greater than or equal to the image size.</p>
         * <p>Default value: 40 or the image size, whichever is greater.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>Specifies whether to enable the performance burst feature for the system disk. Valid values:</p>
         * <ul>
         * <li>true: enables the performance burst feature for the system disk.</li>
         * <li>false: disables the performance burst feature for the system disk.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only if you set <code>SystemDisk.Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BurstingEnabled")
        public Boolean burstingEnabled;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ase-256</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt the system disk. Valid values:</p>
         * <ul>
         * <li>true: encrypts the system disk.</li>
         * <li>false: does not encrypt the system disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> The system disks of instances cannot be encrypted during instance creation in Hong Kong Zone D or Singapore Zone A.</p>
         * </blockquote>
         * <blockquote>
         * <p> When you use a shared encrypted image to create the disk based on an encrypted snapshot, you must set Encrypted to true to ensure that the disk uses an encryption key of your own.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key to use for the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as the system disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p> This parameter is available only if you set <code>SystemDisk.Category</code> to <code>cloud_auto</code>. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("ProvisionedIops")
        public Long provisionedIops;

        /**
         * <p>The ID of the dedicated block storage cluster to which the system disk belongs. If you want to use disks in a dedicated block storage cluster as system disks when you create instances, specify this parameter.</p>
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
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
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
         * <p>The ID of the automatic snapshot policy to apply to data disk N.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4p****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>Specifies whether to enable the performance burst feature for data disk N. Valid values:</p>
         * <ul>
         * <li>true: enables the performance burst feature for the system disk.</li>
         * <li>false: disables the performance burst feature for the data disk.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only if you set DataDisk.N.Category to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <li><p>cloud_efficiency: utra disk.</p>
         * </li>
         * <li><p>cloud_ssd: standard SSD.</p>
         * </li>
         * <li><p>cloud_essd: ESSD.</p>
         * </li>
         * <li><p>cloud: basic disk.</p>
         * </li>
         * <li><p>cloud_auto: ESSD AutoPL disk.</p>
         * </li>
         * <li><p>cloud_regional_disk_auto: Regional ESSD.</p>
         * </li>
         * <li><p>cloud_essd_entry: ESSD Entry disk.</p>
         * <p>**</p>
         * <p><strong>Note</strong> This parameter can be set to <code>cloud_essd_entry</code> only when <code>InstanceType</code> is set to <code>ecs.u1</code> or <code>ecs.e</code>.</p>
         * </li>
         * <li><p>elastic_ephemeral_disk_standard: standard elastic ephemeral disk.</p>
         * </li>
         * <li><p>elastic_ephemeral_disk_premium: premium elastic ephemeral disk</p>
         * </li>
         * </ul>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release data disk N when the associated instance is released. Valid values:</p>
         * <ul>
         * <li>true: releases the data disk when the associated instance is released.</li>
         * <li>false: does not release the data disk when the associated instance is released.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of data disk N. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>DataDisk_Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of data disk N. The mount points are named based on the number of data disks:</p>
         * <ul>
         * <li>1st to 25th data disks: /dev/xvd<code>[b-z]</code>.</li>
         * <li>From the 26th data disk on: /dev/xvd<code>[aa-zz]</code>. For example, the 26th data disk is named /dev/xvdaa, the 27th data disk is named /dev/xvdab, and so on.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is applicable to scenarios in which a full image is used to create instances. A full image is an image that contains an operating system, application software, and business data. For these scenarios, you can set this parameter to the mount point of data disk N in the full image and modify <code>DataDisk.N.Size</code> and <code>DataDisk.N.Category</code> to change the category and size of data disk N created based on the image.</p>
         * </li>
         * <li><p>When you use a full image to create an ECS instance, the data disks in the image are created as the first N data disks of the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of data disk N. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssdData</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aes-256</p>
         */
        @NameInMap("EncryptAlgorithm")
        public String encryptAlgorithm;

        /**
         * <p>Specifies whether to encrypt data disk N. Valid values:</p>
         * <ul>
         * <li>true: encrypts the data disk.</li>
         * <li>false: does not encrypt the data disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> When you use a shared encrypted image to create the disk based on an encrypted snapshot, you must set Encrypted to true to ensure that the disk uses an encryption key of your own.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public String encrypted;

        /**
         * <p>The ID of the KMS key used for the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD to use as data disk N. The value of N must be the same as that in <code>DataDisk.N.Category</code> when DataDisk.N.Category is set to cloud_essd. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10000 random read/write IOPS.</li>
         * <li>PL1 (default): A single ESSD can deliver up to 50000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1000000 random read/write IOPS.</li>
         * </ul>
         * <p>For information about ESSD performance levels, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The provisioned read/write IOPS of the ESSD AutoPL disk to use as data disk N. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <blockquote>
         * <p> This parameter is available only if you set DataDisk.N.Category to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</p>
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
         * <li><p>Valid values when DataDisk.N.Category is set to cloud_efficiency: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values when DataDisk.N.Category is set to cloud_ssd: 20 to 32768.</p>
         * </li>
         * <li><p>Valid values when DataDisk.N.Category is set to cloud_essd: vary based on the value of <code>DataDisk.N.PerformanceLevel</code>.</p>
         * <ul>
         * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL0: 1 to 65536.</li>
         * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL1: 20 to 65536.</li>
         * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL2: 461 to 65536.</li>
         * <li>Valid values when DataDisk.N.PerformanceLevel is set to PL3: 1261 to 65536.</li>
         * </ul>
         * </li>
         * <li><p>Valid values when DataDisk.N.Category is set to cloud: 5 to 2000.</p>
         * </li>
         * <li><p>Valid values when DataDisk.N.Category is set to cloud_auto: 1 to 65536.</p>
         * </li>
         * <li><p>Valid values when DataDisk.N.Category is set to cloud_essd_entry: 10 to 32768.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter must be greater than or equal to the size of the snapshot specified by <code>DataDisk.N.SnapshotId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The ID of the snapshot to use to create data disk N. Valid values of N: 1 to 16.</p>
         * <p>When <code>DataDisk.N.SnapshotId</code> is specified, <code>DataDisk.N.Size</code> is ignored. The data disk is created with the size of the specified snapshot. Use snapshots created on or after July 15, 2013. Otherwise, an error is returned and your request is rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The ID of the dedicated block storage cluster to which data disk N belongs. If you want to use a disk in a dedicated block storage cluster as data disk N when you create the instance, you must specify this parameter.</p>
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
         * <p>Specifies whether the instance that uses the image supports logons of the ecs-user user. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Specifies whether to release ENI N when the associated instance is released. Valid values:</p>
         * <ul>
         * <li>true: releases the ENI when the associated instance is released.</li>
         * <li>false: retains the ENI when the associated instance is released.</li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p> This parameter takes effect only for secondary ENIs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteOnRelease")
        public Boolean deleteOnRelease;

        /**
         * <p>The description of ENI N.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The value of N cannot exceed the maximum number of ENIs per instance that the instance type supports. For the maximum number of ENIs per instance that an instance type supports, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation.</li>
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
         * <p>The type of ENI N. The value of the first N in this parameter cannot exceed the maximum number of ENIs per instance that the instance type supports. For the maximum number of ENIs per instance that an instance type supports, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Primary: the primary ENI</li>
         * <li>Secondary</li>
         * </ul>
         * <p>Default value: Secondary.</p>
         * 
         * <strong>example:</strong>
         * <p>Secondary</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The IPv6 addresses to assign to the primary ENI. You can assign up to 10 IPv6 addresses to the primary ENI. Valid values of the second N: 1 to 10.</p>
         * <p>Example: <code>Ipv6Address.1=2001:db8:1234:1a00::***</code>.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>. If you set <code>NetworkInterface.N.InstanceType</code> to <code>Secondary</code> or leave NetworkInterface.N.InstanceType empty, you cannot specify this parameter.</li>
         * <li>If you specify this parameter, you must set <code>Amount</code> to 1 and cannot specify <code>Ipv6AddressCount</code>, <code>Ipv6Address.N</code>, or <code>NetworkInterface.N.Ipv6AddressCount</code>.</li>
         * </ul>
         */
        @NameInMap("Ipv6Address")
        public java.util.List<String> ipv6Address;

        /**
         * <p>The number of IPv6 addresses to randomly generate for the primary ENI. Valid values: 1 to 10.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter takes effect only when <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>. If you set <code>NetworkInterface.N.InstanceType</code> to <code>Secondary</code> or leave NetworkInterface.N.InstanceType empty, you cannot specify this parameter.</li>
         * <li>If you specify this parameter, you cannot specify <code>Ipv6AddressCount</code>, <code>Ipv6Address.N</code>, or <code>NetworkInterface.N.Ipv6Address.N</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ipv6AddressCount")
        public Long ipv6AddressCount;

        /**
         * <p>The index of the network card for ENI N.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>You can specify NIC indexes only for instances of specific instance types.</li>
         * <li>If you set NetworkInterface.N.InstanceType to Primary, you can set NetworkInterface.N.NetworkCardIndex only to 0 for instance types that support network cards.</li>
         * <li>If you set NetworkInterface.N.InstanceType to Secondary or leave NetworkInterface.N.InstanceType empty, you can specify NetworkInterface.N.NetworkCardIndex based on instance types if the instance types support network cards. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetworkCardIndex")
        public Integer networkCardIndex;

        /**
         * <p>The ID of the ENI to attach to the instance.</p>
         * <p>If you specify this parameter, you must set <code>Amount</code> to 1.</p>
         * <blockquote>
         * <p> This parameter takes effect only for secondary ENIs. After you specify an existing secondary ENI, you cannot specify other ENI creation parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1gn106np8jhxhj****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The name of ENI N. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The value of N cannot exceed the maximum number of ENIs per instance that the instance type supports. For the maximum number of ENIs per instance that an instance type supports, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation.</li>
         * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you do not need to specify this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Network_Name</p>
         */
        @NameInMap("NetworkInterfaceName")
        public String networkInterfaceName;

        /**
         * <p>The communication mode of ENI N. Valid values:</p>
         * <ul>
         * <li>Standard: uses the TCP communication mode.</li>
         * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</li>
         * </ul>
         * <p>Default value: Standard.</p>
         * <blockquote>
         * <p> The number of ERIs on an instance cannot exceed the maximum number of ERIs that the instance type supports. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The primary IP address to assign to ENI N.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>The value of N cannot exceed the maximum number of ENIs per instance that the instance type supports. For the maximum number of ENIs per instance that an instance type supports, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation.</p>
         * <ul>
         * <li>If the value of N is 1, you can configure a primary or secondary ENI. If you specify this parameter, set <code>Amount</code> to a numeric value greater than 1, and set NetworkInterface.N.InstanceType to Primary, the specified number of instances are created and consecutive primary IP addresses starting from the specified IP address are assigned to the instances. In this case, you cannot attach secondary ENIs to the instances.</li>
         * <li>If you specify this parameter, set <code>Amount</code> to a numeric value greater than 1, and set NetworkInterface.N.InstanceType to Primary, you cannot set <code>NetworkInterface.2.InstanceType</code> to Secondary to attach a secondary ENI.</li>
         * </ul>
         * </li>
         * <li><p>If you set <code>NetworkInterface.N.InstanceType</code> to <code>Primary</code>, this parameter is equivalent to <code>PrivateIpAddress</code>. You cannot specify both this parameter and <code>PrivateIpAddress</code> in the same request.</p>
         * </li>
         * <li><p>If you set <code>NetworkInterface.N.InstanceType</code> to <code>Secondary</code> or leave NetworkInterface.N.InstanceType empty, the specified primary IP address is assigned to the secondary ENI. The default value is an IP address that is randomly selected from within the CIDR block of the vSwitch to which to connect the secondary ENI.</p>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>The first IP address and last three IP addresses of each vSwitch CIDR block are reserved. You cannot specify the IP addresses. For example, if a vSwitch CIDR block is 192.168.1.0/24, the following IP addresses are reserved: 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><code>172.16.**.**</code></p>
         */
        @NameInMap("PrimaryIpAddress")
        public String primaryIpAddress;

        /**
         * <p>The number of queues supported by ENI N.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The value of N cannot exceed the maximum number of ENIs per instance that the instance type supports. For the maximum number of ENIs per instance that an instance type supports, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation.</li>
         * <li>The value of this parameter cannot exceed the maximum number of queues allowed per ENI.</li>
         * <li>The total number of queues for all ENIs of an instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and check the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> values in the response.</li>
         * <li>If you specify this parameter and set <code>NetworkInterface.N.InstanceType</code> to <code>Primary</code>, you cannot specify <code>NetworkInterfaceQueueNumber</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of queue pairs (QPs) supported by the ERI.</p>
         * <p>If you want to attach multiple ERIs to a created instance, we recommend that you specify QueuePairNumber for each ERI based on the value of <code>QueuePairNumber</code> supported by the instance type and the number of ERIs that you want to use. Make sure that the total number of QPs of all ERIs does not exceed the maximum number of QPs supported by the instance type. For information about the maximum number of QPs supported by an instance type, see <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a>.</p>
         * <blockquote>
         * <p> If you do not specify QueuePairNumber for an ERI, the maximum number of QPs supported by the instance type is used as the number of QPs supported by the ERI. In this case, you cannot attach an additional ERI to the instance. However, you can attach other types of ENIs to the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueuePairNumber")
        public Long queuePairNumber;

        /**
         * <p>The receive (Rx) queue depth of ENI N.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available. To use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
         * </blockquote>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter is applicable only to 7th-generation or later ECS instance types.</li>
         * <li>This parameter is applicable to Linux images.</li>
         * <li>A larger Rx queue depth yields higher inbound throughput and reduces packet loss rates but consumes more memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

        @NameInMap("SecondaryPrivateIpAddressCount")
        public Integer secondaryPrivateIpAddressCount;

        /**
         * <p>The ID of the security group to which to assign ENI N.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The value of N cannot exceed the maximum number of ENIs per instance that the instance type supports. For the maximum number of ENIs per instance that an instance type supports, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation.</li>
         * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must specify this parameter. In this case, this parameter is equivalent to <code>SecurityGroupId</code> and you cannot specify <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupIds.N</code>.</li>
         * <li>If you set <code>NetworkInterface.N.InstanceType</code> to <code>Secondary</code> or leave NetworkInterface.N.InstanceType empty, you do not need to specify this parameter. The default value is the ID of the security group to which to assign the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The IDs of security groups to which to assign ENI N.</p>
         * <ul>
         * <li>The value of the first N in this parameter cannot exceed the maximum number of ENIs per instance that the instance type supports. For the maximum number of ENIs per instance that an instance type supports, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation.</li>
         * <li>The second N in this parameter indicates that one or more security group IDs can be specified. The valid values of the second N vary based on the maximum number of security groups to which an instance can belong. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>If you set <code>NetworkInterface.N.InstanceType</code> to <code>Primary</code>, you must specify this parameter or <code>NetworkInterface.N.SecurityGroupId</code>. In this case, this parameter is equivalent to <code>SecurityGroupIds.N</code>, and you cannot specify <code>SecurityGroupId</code>, <code>SecurityGroupIds.N</code>, or <code>NetworkInterface.N.SecurityGroupId</code>.</li>
         * <li>If you set <code>NetworkInterface.N.InstanceType</code> to <code>Secondary</code> or leave NetworkInterface.N.InstanceType empty, you do not need to specify this parameter. The default value is the ID of the security group to which to assign the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg7****</p>
         */
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>Specifies whether to enable the source and destination IP address check feature. We recommend that you enable the feature to improve network security. Valid value:</p>
         * <ul>
         * <li>true: enables the performance burst feature for the system disk.</li>
         * <li>false: disables the performance burst feature for the data disk.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p> This feature is available only in some regions. Before you use this method, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source and destination IP address check</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SourceDestCheck")
        public Boolean sourceDestCheck;

        /**
         * <p>The Tx queue depth of ENI N.</p>
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available. To use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
         * </blockquote>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>This parameter is applicable only to 7th-generation or later ECS instance types.</li>
         * <li>This parameter is applicable to Linux images.</li>
         * <li>A larger Tx queue depth yields higher outbound throughput and reduces packet loss rates but consumes more memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("TxQueueSize")
        public Integer txQueueSize;

        /**
         * <p>The ID of the vSwitch to which to connect ENI N.</p>
         * <p>When you specify this parameter, take note of the following items:</p>
         * <ul>
         * <li>The value of N cannot exceed the maximum number of ENIs per instance that the instance type supports. For the maximum number of ENIs per instance that an instance type supports, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation.</li>
         * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, you must specify this parameter. In this case, this parameter is equivalent to <code>VSwitchId</code>. You cannot specify both NetworkInterface.N.VSwitchId and <code>VSwitchId</code> in the same request.</li>
         * <li>If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, you do not need to specify this parameter. The default value is the VSwitchId value.</li>
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
        @NameInMap("BandwidthWeighting")
        public String bandwidthWeighting;

        /**
         * <p>Specifies whether to enable the Jumbo Frames feature for the instance. Valid values:</p>
         * <ul>
         * <li>false: does not enable the Jumbo Frames feature for the instance. The maximum transmission unit (MTU) value of all ENIs on the instance is set to 1500.</li>
         * <li>true: enables the Jumbo Frames feature for the instance. The MTU value of all ENIs on the instance is set to 8500.</li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <p> The Jumbo Frames feature is supported by only 8th-generation or later instance types. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">Jumbo Frames</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableJumboFrame")
        public Boolean enableJumboFrame;

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
         * <p>Specifies whether DNS Resolution from the Instance ID-based Hostname to the Instance Primary Private IPv6 Address (AAAA Record) is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableInstanceIdDnsAAAARecord")
        public Boolean enableInstanceIdDnsAAAARecord;

        /**
         * <p>Specifies whether DNS Resolution from the Instance ID-based Hostname to the Instance Primary Private IPv4 Address (A Record) is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInstanceIdDnsARecord")
        public Boolean enableInstanceIdDnsARecord;

        /**
         * <p>Specifies whether DNS Resolution from the IP Address-based Hostname to the Instance Primary Private IPv4 Address (A Record) is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIpDnsARecord")
        public Boolean enableIpDnsARecord;

        /**
         * <p>Specifies whether Reverse DNS Resolution from the Instance Primary Private IPv4 Address to the IP Address-based Hostname (PTR Record) is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIpDnsPtrRecord")
        public Boolean enableIpDnsPtrRecord;

        /**
         * <p>The type of hostname. Valid values:</p>
         * <ul>
         * <li>Custom: custom hostname</li>
         * <li>IpBased: IP address-based hostname</li>
         * <li>InstanceIdBased: instance ID-based hostname</li>
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
         * <p>The key of tag N to add to the instance, disks, and primary ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the instance, disks, and primary ENI. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
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
