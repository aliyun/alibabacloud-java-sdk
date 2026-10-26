// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("HibernationOptions")
    public CreateInstanceRequestHibernationOptions hibernationOptions;

    @NameInMap("PrivatePoolOptions")
    public CreateInstanceRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("SystemDisk")
    public CreateInstanceRequestSystemDisk systemDisk;

    /**
     * <p>Specifies whether to associate the instance on a dedicated host with the dedicated host. Valid values:</p>
     * <ul>
     * <li><p>default: The instance is not associated with the dedicated host. If an instance in the economical mode is stopped and then started, and the original dedicated host has insufficient resources, the instance is deployed on another dedicated host in the automatic deployment resource pool.</p>
     * </li>
     * <li><p>host: The instance is associated with the dedicated host. If an instance in the economical mode is stopped and then started, it is still deployed on the original dedicated host. If the original dedicated host has insufficient resources, the instance fails to start.</p>
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
     * <blockquote>
     * <p>This parameter is in invitational preview and is not supported.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CreateInstanceRequestArn> arn;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when InstanceChargeType is set to PrePaid. Valid values:</p>
     * <ul>
     * <li>true: enables auto-renewal.</li>
     * <li>false: disables auto-renewal. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. This parameter is required when AutoRenew is set to true.</p>
     * <p>&lt;props=&quot;china&quot;&gt;When PeriodUnit is set to Week, valid values of AutoRenewPeriod are 1, 2, and 3.</p>
     * <p>When PeriodUnit is set to Month, valid values of AutoRenewPeriod are 1, 2, 3, 6, and 12.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cluster to which the instance belongs.</p>
     * <blockquote>
     * <p>This parameter is about to be deprecated. To improve compatibility, use other parameters instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c-bp67acfmxazb4p****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The performance mode of the burstable instance. Valid values:</p>
     * <ul>
     * <li>Standard: standard mode. For more information about instance performance, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * <li>Unlimited: unlimited mode. For more information about instance performance, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("CreditSpecification")
    public String creditSpecification;

    /**
     * <p>The data cloud disks.</p>
     */
    @NameInMap("DataDisk")
    public java.util.List<CreateInstanceRequestDataDisk> dataDisk;

    /**
     * <p>The ID of the dedicated host.
     * &lt;props=&quot;china&quot;&gt;You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the list of dedicated host IDs.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the list of dedicated host IDs.</p>
     * <blockquote>
     * <p>Notice: Dedicated hosts do not support spot instance. If you specify the DedicatedHostId parameter, the SpotStrategy and SpotPriceLimit Settings in the request are automatically ignored.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>The release protection attribute of the instance. It specifies whether the instance can be released through the console or by calling the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation.</p>
     * <ul>
     * <li>true: enables release protection for the instance.</li>
     * <li>false: disables release protection for the instance. This is the default value.</li>
     * </ul>
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
     * <p>The group number of the instance in the deployment set. This parameter is valid when the deployment set uses the high availability group strategy (AvailabilityGroup). Valid values: 1 to 7.</p>
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
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceTest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li>true: performs a dry run and does not create the instance. The system checks whether required parameters are specified, the request format, service limits, and ECS inventory. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</li>
     * <li>false: performs a dry run and creates the instance if the check succeeds. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The hostname of the instance.</p>
     * <ul>
     * <li>The hostname cannot start or end with a period (.) or a hyphen (-), and cannot contain consecutive periods (.) or hyphens (-).</li>
     * <li>For Windows instances: The hostname must be 2 to 15 characters in length and cannot contain periods (.). It cannot contain only digits. It can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
     * <li>For other instances such as Linux instances: The hostname must be 2 to 64 characters in length and can contain multiple periods (.). The string between two consecutive periods is a segment, which can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LocalHostName</p>
     */
    @NameInMap("HostName")
    public String hostName;

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
     * <ul>
     * <li>enabled: enables the access channel.</li>
     * <li>disabled: disables the access channel.</li>
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
     * <p>Specifies whether to forcibly use the security hardening mode (IMDSv2) to access instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: does not forcibly use IMDSv2.</li>
     * <li>required: forcibly uses IMDSv2. After you set this value, you cannot access instance metadata in normal mode.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes for accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/150575.html">Access modes of instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. You can set this parameter to use the latest available image in the image family to create the instance.</p>
     * <ul>
     * <li>If ImageId is specified, you cannot specify this parameter.</li>
     * <li>If ImageId is not specified, you can specify this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image used to start the instance. To use an Alibaba Cloud Marketplace image, you can view the ImageId on the image details page in Alibaba Cloud Marketplace. This parameter is required unless you specify ImageFamily to use the latest available image in the image family.</p>
     * 
     * <strong>example:</strong>
     * <p>ubuntu_18_04_64_20G_alibase_20190624.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The internal IP address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p><code>192.168.**.**</code></p>
     */
    @NameInMap("InnerIpAddress")
    public String innerIpAddress;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription. If you select this billing method, make sure that your account supports balance payment or credit payment. Otherwise, an InvalidPayMethod error is returned.</li>
     * <li>PostPaid: pay-as-you-go. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters in length and can contain letters and digits. It can also contain colons (:), underscores (_), periods (.), and hyphens (-). If this parameter is not specified, the default value is the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-alibabacloud</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type.</p>
     * <ul>
     * <li>Instance type selection: See <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to view the performance data of the target instance type. Alternatively, see <a href="https://help.aliyun.com/document_detail/58291.html">Instance type selection</a> to learn how to select an instance type.</li>
     * <li>Inventory query: Call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to check the resource availability in a specified region or zone.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <li>PayByTraffic: pay-by-traffic. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are upper limits and are not guaranteed. When resource contention occurs, the peak bandwidths may be limited. If your business requires guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> mode.</p>
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
     * <li>When the purchased outbound bandwidth is less than or equal to 10 Mbit/s: 1 to 10. Default value: 10.</li>
     * <li>When the purchased outbound bandwidth is greater than 10 Mbit/s: 1 to the value of InternetMaxBandwidthOut. Default value: the value of InternetMaxBandwidthOut.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("InternetMaxBandwidthIn")
    public Integer internetMaxBandwidthIn;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 0 to 100.</p>
     * <p>Default value: 0.</p>
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
     * <li>optimized: The instance is I/O optimized.</li>
     * </ul>
     * <p>For <a href="https://help.aliyun.com/document_detail/55263.html">phased-out instance types</a>, the default value is none.</p>
     * <p>For other instance types, the default value is optimized.</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The name of the key pair.</p>
     * <blockquote>
     * <p>For Windows instances, this parameter is ignored. Default value: empty. Even if you specify this parameter, only the Password parameter takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>KeyPairTestName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The unique identifier of the platform-managed host, such as mh-f2d3647ca21****.</p>
     * 
     * <strong>example:</strong>
     * <p>mh-f2d3647ca21****</p>
     */
    @NameInMap("ManagedHostId")
    public String managedHostId;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("NodeControllerId")
    public String nodeControllerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
     * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>Note:</p>
     * <ul>
     * <li>If you specify the Password parameter, send requests over HTTPS to prevent password leaks.</li>
     * <li>For Windows instances, the password cannot start with a forward slash (/).</li>
     * <li>Instances running certain operating systems do not support password configuration and only support key pair configuration, such as Others Linux and Fedora CoreOS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TestEcs123!</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the preset password of the image. When you use this parameter, leave the Password parameter empty and make sure that the selected image has a preset password.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription period of the resource. The unit is specified by PeriodUnit. This parameter is required and takes effect only when InstanceChargeType is set to PrePaid. If DedicatedHostId is specified, the subscription period cannot exceed the subscription period of the dedicated host. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>When PeriodUnit is set to Week, valid values of Period are 1, 2, 3, and 4.</li>
     * <li>When PeriodUnit is set to Month, valid values of Period are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;When PeriodUnit is set to Month, valid values of Period are 1, 2, 3, 6, and 12.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;When PeriodUnit is set to Month, valid values of Period are 1, 2, 3, 6, and 12.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Week</li>
     * <li>Month</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;Month.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;Month.</p>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The private IP address of the instance. The IP address must be an available IP address within the CIDR block of the vSwitch specified by VSwitchId.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.236.*</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the instance RAM role. You can use the RAM API operation <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query the instance RAM roles that you have created.</p>
     * 
     * <strong>example:</strong>
     * <p>RAMTestName</p>
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
     * <li>Active: enables security hardening. This value is applicable only to public images.</li>
     * <li>Deactive: disables security hardening. This value is applicable to all image types.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to which the new instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:</p>
     * <ul>
     * <li>1: Alibaba Cloud guarantees that spot instance will not undergo automatic release within 1 hour after it is created. After 1 hour, the system automatically compares the bid price with the marketplace price and checks resource inventory to determine whether to retain or revoke spot instance.</li>
     * <li>0: Alibaba Cloud does not guarantee that spot instance runs for 1 hour after it is created. The system automatically compares the bid price with the marketplace price and checks resource inventory to determine whether to retain or revoke spot instance.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The Settings of this parameter can only be 0 or 1.</li>
     * <li>Spot instances are billed by the second. Select an appropriate protection period based on the execution duration of your node.</li>
     * <li>Alibaba Cloud sends you a notification through ECS system events 5 minutes before spot instance is revoked.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption behavior of the preemptible instance. Valid values:</p>
     * <ul>
     * <li><p>Terminate: releases the instance.</p>
     * </li>
     * <li><p>Stop: puts the instance into the break mode.</p>
     * <p>For more information about the break mode, see <a href="https://help.aliyun.com/document_detail/63353.html">Break mode for pay-as-you-go instances</a>.</p>
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
     * <p>The maximum hourly price of the instance. The value can be accurate to three decimal places. This parameter takes effect when SpotStrategy is set to SpotWithPriceLimit.</p>
     * 
     * <strong>example:</strong>
     * <p>0.98</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The preemption policy for spot instance. This parameter takes effect when InstanceChargeType is set to PostPaid. Valid values:</p>
     * <ul>
     * <li>NoSpot: Spot instance is a regular pay-as-you-go instance. This is the default value.</li>
     * <li>SpotWithPriceLimit: Spot instance is a preemptible instance with a maximum hourly price.</li>
     * <li>SpotAsPriceGo: Spot instance is a preemptible instance for which the market price is automatically used as the bid price.</li>
     * </ul>
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
     * <p>ss-bp1j4i2jdf3owlhe****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The maximum number of partitions in the storage set. Valid values: greater than or equal to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    /**
     * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
     * <ul>
     * <li><p>default: The instance is created on a non-dedicated host.</p>
     * </li>
     * <li><p>host: The instance is created on a dedicated host. If you do not specify DedicatedHostId, Alibaba Cloud automatically selects a dedicated host to deploy the instance.</p>
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
     * <p>Specifies whether to use the virtual machine system configurations provided by Alibaba Cloud (Windows: NTP and KMS; Linux: NTP and YUM).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAdditionalService")
    public Boolean useAdditionalService;

    /**
     * <p>Instance user data of the instance. Instance user data must be encoded in Base64. The maximum size of the raw data is 32 KB.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The ID of the vSwitch. This parameter is required when you create a VPC-type instance. You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query the information of created vSwitches.</p>
     * <blockquote>
     * <p>If you specify the VSwitchId parameter, the ZoneId parameter must match the zone of the vSwitch. You can also leave the ZoneId parameter empty, and the system automatically selects the zone of the specified vSwitch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual local area network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VlanId")
    public String vlanId;

    /**
     * <p>The zone ID of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> to obtain the zone list.</p>
     * <blockquote>
     * <p>If you specify the VSwitchId parameter, the ZoneId parameter must match the zone of the vSwitch. You can also leave the ZoneId parameter empty, and the system automatically selects the zone of the specified vSwitch.</p>
     * </blockquote>
     * <p>Default value: empty. The system automatically selects a zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setHibernationOptions(CreateInstanceRequestHibernationOptions hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }
    public CreateInstanceRequestHibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    public CreateInstanceRequest setPrivatePoolOptions(CreateInstanceRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public CreateInstanceRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateInstanceRequest setSystemDisk(CreateInstanceRequestSystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public CreateInstanceRequestSystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public CreateInstanceRequest setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }
    public String getAffinity() {
        return this.affinity;
    }

    public CreateInstanceRequest setArn(java.util.List<CreateInstanceRequestArn> arn) {
        this.arn = arn;
        return this;
    }
    public java.util.List<CreateInstanceRequestArn> getArn() {
        return this.arn;
    }

    public CreateInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateInstanceRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateInstanceRequest setCreditSpecification(String creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    public CreateInstanceRequest setDataDisk(java.util.List<CreateInstanceRequestDataDisk> dataDisk) {
        this.dataDisk = dataDisk;
        return this;
    }
    public java.util.List<CreateInstanceRequestDataDisk> getDataDisk() {
        return this.dataDisk;
    }

    public CreateInstanceRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public CreateInstanceRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateInstanceRequest setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
        this.deploymentSetGroupNo = deploymentSetGroupNo;
        return this;
    }
    public Integer getDeploymentSetGroupNo() {
        return this.deploymentSetGroupNo;
    }

    public CreateInstanceRequest setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public CreateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateInstanceRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateInstanceRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public CreateInstanceRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public CreateInstanceRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public CreateInstanceRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public CreateInstanceRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public CreateInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateInstanceRequest setInnerIpAddress(String innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
        return this;
    }
    public String getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public CreateInstanceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateInstanceRequest setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
        return this;
    }
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public CreateInstanceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateInstanceRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public CreateInstanceRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateInstanceRequest setManagedHostId(String managedHostId) {
        this.managedHostId = managedHostId;
        return this;
    }
    public String getManagedHostId() {
        return this.managedHostId;
    }

    public CreateInstanceRequest setNodeControllerId(String nodeControllerId) {
        this.nodeControllerId = nodeControllerId;
        return this;
    }
    public String getNodeControllerId() {
        return this.nodeControllerId;
    }

    public CreateInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateInstanceRequest setPasswordInherit(Boolean passwordInherit) {
        this.passwordInherit = passwordInherit;
        return this;
    }
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    public CreateInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateInstanceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateInstanceRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateInstanceRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    public CreateInstanceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateInstanceRequest setSpotDuration(Integer spotDuration) {
        this.spotDuration = spotDuration;
        return this;
    }
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    public CreateInstanceRequest setSpotInterruptionBehavior(String spotInterruptionBehavior) {
        this.spotInterruptionBehavior = spotInterruptionBehavior;
        return this;
    }
    public String getSpotInterruptionBehavior() {
        return this.spotInterruptionBehavior;
    }

    public CreateInstanceRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public CreateInstanceRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateInstanceRequest setStorageSetId(String storageSetId) {
        this.storageSetId = storageSetId;
        return this;
    }
    public String getStorageSetId() {
        return this.storageSetId;
    }

    public CreateInstanceRequest setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
        this.storageSetPartitionNumber = storageSetPartitionNumber;
        return this;
    }
    public Integer getStorageSetPartitionNumber() {
        return this.storageSetPartitionNumber;
    }

    public CreateInstanceRequest setTag(java.util.List<CreateInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateInstanceRequest setTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }
    public String getTenancy() {
        return this.tenancy;
    }

    public CreateInstanceRequest setUseAdditionalService(Boolean useAdditionalService) {
        this.useAdditionalService = useAdditionalService;
        return this;
    }
    public Boolean getUseAdditionalService() {
        return this.useAdditionalService;
    }

    public CreateInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public CreateInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateInstanceRequest setVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public String getVlanId() {
        return this.vlanId;
    }

    public CreateInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateInstanceRequestHibernationOptions extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Configured")
        public Boolean configured;

        public static CreateInstanceRequestHibernationOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestHibernationOptions self = new CreateInstanceRequestHibernationOptions();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestHibernationOptions setConfigured(Boolean configured) {
            this.configured = configured;
            return this;
        }
        public Boolean getConfigured() {
            return this.configured;
        }

    }

    public static class CreateInstanceRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The ID of the private pool. It is the ID of the elasticity assurance or capacity reservation.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The private pool options for starting spot instance. After an elasticity assurance or a capacity reservation takes effect, a private pool is generated for you to select when you start spot instance. Valid values:</p>
         * <ul>
         * <li>Open: open mode. The system automatically matches an open private pool. If no matching private pool is available, the system uses resources from the public pool to start spot instance. In this mode, you do not need to specify the PrivatePoolOptions.Id parameter.</li>
         * <li>Target: specified mode. The system uses the specified private pool to start spot instance. If the specified private pool is unavailable, spot instance fails to start. In this mode, you must specify the private pool ID, which means the PrivatePoolOptions.Id parameter is required.</li>
         * <li>None: no private pool. Spot instance is started without using private pool capacity.</li>
         * </ul>
         * <p>Default value: None.</p>
         * <p>In any of the following scenarios, the private pool option for starting spot instance can only be set to None or left empty:</p>
         * <ul>
         * <li>Create a preemptible instance.</li>
         * <li>Create an ECS instance on a dedicated host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static CreateInstanceRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestPrivatePoolOptions self = new CreateInstanceRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateInstanceRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

    public static class CreateInstanceRequestSystemDisk extends TeaModel {
        /**
         * <p>The category of the system cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_auto: ESSD AutoPL.</li>
         * <li>cloud_essd_entry: ESSD Entry disk.<blockquote>
         * <p>This parameter supports the cloud_essd_entry value only when the InstanceType Settings are <a href="https://help.aliyun.com/document_detail/457079.html">general computing power instance family u1</a> (ecs.u1) or <a href="https://help.aliyun.com/document_detail/108489.html">Economy instance family e</a> (ecs.e).</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>For phased-out instance types that are not I/O optimized instances, the default value is cloud. For other instance types, the default value is cloud_efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system cloud disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system cloud disk. The name must be 2 to 128 characters in length and can contain letters and digits. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDiskName</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>Settings of the performance level of the ESSD used as the system cloud disk. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS. This is the default value.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For more information about how to select the performance level of an ESSD, see <a href="https://help.aliyun.com/document_detail/122389.html">standard SSD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system cloud disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>Basic cloud disk: 20 to 500.</p>
         * </li>
         * <li><p>Other cloud disk types: 20 to 2048.</p>
         * </li>
         * </ul>
         * <p>The value of this parameter must be greater than or equal to max{20, ImageSize}.</p>
         * <p>Default value: max{40, ImageSize}.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The dedicated block storage cluster ID. If you need to use a cloud disk in a dedicated block storage cluster as the system cloud disk when creating an ECS instance, specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-j5e1sf2vaf5he8m2****</p>
         */
        @NameInMap("StorageClusterId")
        public String storageClusterId;

        public static CreateInstanceRequestSystemDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestSystemDisk self = new CreateInstanceRequestSystemDisk();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestSystemDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateInstanceRequestSystemDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateInstanceRequestSystemDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateInstanceRequestSystemDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateInstanceRequestSystemDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateInstanceRequestSystemDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class CreateInstanceRequestArn extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static CreateInstanceRequestArn build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestArn self = new CreateInstanceRequestArn();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CreateInstanceRequestArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateInstanceRequestArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CreateInstanceRequestDataDisk extends TeaModel {
        /**
         * <p>The category of data cloud disk N. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra cloud disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud: basic cloud disk.</li>
         * <li>cloud_auto: ESSD AutoPL.</li>
         * <li>cloud_essd_entry: ESSD Entry.<blockquote>
         * <p>The cloud_essd_entry value is supported only when InstanceType is set to the ecs.u1 or ecs.e instance family.</p>
         * </blockquote>
         * </li>
         * <li>elastic_ephemeral_disk_standard: standard ESSD Entry disk.</li>
         * <li>elastic_ephemeral_disk_premium: premium ESSD Entry disk.</li>
         * </ul>
         * <p>For I/O optimized instances, the default value is cloud_efficiency. For non-I/O optimized instances, the default value is cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release data cloud disk N when the instance is released.</p>
         * <ul>
         * <li>true: releases the data cloud disk.</li>
         * <li>false: does not release the data cloud disk.</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteWithInstance")
        public Boolean deleteWithInstance;

        /**
         * <p>The description of data cloud disk N. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of data cloud disk N.</p>
         * <blockquote>
         * <p>This parameter is applicable only to full images. You can set this parameter to the mount point of the data cloud disk in the full image, and modify the DataDisk.N.Size and DataDisk.N.Category parameters to change the category and size of the data cloud disk in the full image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of data cloud disk N. The name must be 2 to 128 characters in length and can contain letters and digits. It can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>DataDiskName</p>
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
         * <p>Specifies whether to encrypt data cloud disk N.</p>
         * <ul>
         * <li><p>true: encrypts the data cloud disk.</p>
         * </li>
         * <li><p>false: does not encrypt the data cloud disk.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key used by the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>Settings of the performance level of the ESSD used as data cloud disk N. The value of N must be the same as the value of N in DataDisk.N.Category=cloud_essd. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS. This is the default value.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * <p>For more information about how to select the performance level of an ESSD, see <a href="https://help.aliyun.com/document_detail/122389.html">standard SSD</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL2</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of data cloud disk N. Valid values of N: 1 to 16. Unit: GiB. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: 20 to 32768.</li>
         * <li>cloud_ssd: 20 to 32768.</li>
         * <li>cloud_essd: The valid values depend on the value of DataDisk.N.PerformanceLevel.<ul>
         * <li>PL0: 1 to 65,536.</li>
         * <li>PL1: 20 to 65,536.</li>
         * <li>PL2: 461 to 65,536.</li>
         * <li>PL3: 1261 to 65,536.</li>
         * </ul>
         * </li>
         * <li>cloud: 5 to 2000.</li>
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
         * <ul>
         * <li><p>If you specify the DataDisk.N.SnapshotId parameter, the DataDisk.N.Size parameter is ignored, and the actual size of the created cloud disk is the size of the specified snapshot.</p>
         * </li>
         * <li><p>You cannot use snapshots created on or before July 15, 2013. Otherwise, the request is rejected with an error.</p>
         * </li>
         * </ul>
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

        public static CreateInstanceRequestDataDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestDataDisk self = new CreateInstanceRequestDataDisk();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateInstanceRequestDataDisk setDeleteWithInstance(Boolean deleteWithInstance) {
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        public CreateInstanceRequestDataDisk setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateInstanceRequestDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public CreateInstanceRequestDataDisk setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public CreateInstanceRequestDataDisk setEncryptAlgorithm(String encryptAlgorithm) {
            this.encryptAlgorithm = encryptAlgorithm;
            return this;
        }
        public String getEncryptAlgorithm() {
            return this.encryptAlgorithm;
        }

        public CreateInstanceRequestDataDisk setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public CreateInstanceRequestDataDisk setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public CreateInstanceRequestDataDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public CreateInstanceRequestDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateInstanceRequestDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public CreateInstanceRequestDataDisk setStorageClusterId(String storageClusterId) {
            this.storageClusterId = storageClusterId;
            return this;
        }
        public String getStorageClusterId() {
            return this.storageClusterId;
        }

    }

    public static class CreateInstanceRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instance, cloud disk, and primary ENI. Valid values of N: 1 to 20. If this parameter is specified, it cannot be an empty string. The tag key can be up to 128 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance, cloud disk, and primary ENI. Valid values of N: 1 to 20. If this parameter is specified, it can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTag self = new CreateInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
