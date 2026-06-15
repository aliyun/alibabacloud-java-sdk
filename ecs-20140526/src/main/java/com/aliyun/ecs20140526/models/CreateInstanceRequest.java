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
     * <p>专有宿主机实例是否与专有宿主机关联。取值范围：</p>
     * <ul>
     * <li><p>default：实例不与专有宿主机关联。已启用节省停机模式的实例，停机后再次启动时，若原专有宿主机可用资源不足，则实例被放置在自动部署资源池的其它专有宿主机上。</p>
     * </li>
     * <li><p>host：实例与专有宿主机关联。已启用节省停机模式的实例，停机后再次启动时，仍放置在原专有宿主机上。若原专有宿主机可用资源不足，则实例重启失败。</p>
     * </li>
     * </ul>
     * <p>默认值为 default。</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Affinity")
    public String affinity;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("Arn")
    public java.util.List<CreateInstanceRequestArn> arn;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. This parameter is valid only for subscription (<code>InstanceChargeType</code> is <code>PrePaid</code>) instances. Valid values:</p>
     * <ul>
     * <li><p>true: enables auto-renewal.</p>
     * </li>
     * <li><p>false: disables auto-renewal. (Default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. This parameter is required if <code>AutoRenew</code> is <code>true</code>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>If <code>PeriodUnit</code> is set to <code>Week</code>, valid values of <code>AutoRenewPeriod</code> are 1, 2, and 3.</p>
     * <p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values of <code>AutoRenewPeriod</code> are 1, 2, 3, 6, and 12.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>A client-generated token that you can use to ensure the idempotency of the request. Generate a value that is unique among different requests. <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cluster in which to create the instance.</p>
     * <blockquote>
     * <p>This parameter is deprecated. To ensure future compatibility, use other parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c-bp67acfmxazb4p****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The performance mode of the burstable performance instance. Valid values:</p>
     * <ul>
     * <li><p><code>Standard</code>: standard mode. For more information about the performance of burstable performance instances, see the &quot;Standard mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Burstable performance instances</a>.</p>
     * </li>
     * <li><p><code>Unlimited</code>: unlimited mode. For more information about the performance of burstable performance instances, see the &quot;Unlimited mode&quot; section in <a href="https://help.aliyun.com/document_detail/59977.html">Burstable performance instances</a>.</p>
     * </li>
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
    public java.util.List<CreateInstanceRequestDataDisk> dataDisk;

    /**
     * <p>The ID of the dedicated host.
     * &lt;props=&quot;china&quot;&gt;You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the list of dedicated host IDs.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the list of dedicated host IDs.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>You cannot create spot instances on dedicated hosts. If you specify <code>DedicatedHostId</code>, the <code>SpotStrategy</code> and <code>SpotPriceLimit</code> parameters are ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp67acfmxazb4p****</p>
     */
    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    /**
     * <p>Specifies whether to enable deletion protection for the instance. This parameter determines whether you can release the instance by using the console or by calling the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation.</p>
     * <ul>
     * <li><p><code>true</code>: enables deletion protection.</p>
     * </li>
     * <li><p><code>false</code>: disables deletion protection. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is applicable only to pay-as-you-go instances. It can prevent only manual releases but not releases that are performed by the system.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>If the deployment set you specified uses the high availability group strategy (AvailabilityGroup), you can use this parameter to specify the group number of the instance within the deployment set. Valid values: 1 to 7.</p>
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
     * <p>Specifies whether to perform a dry run for this request. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Performs a dry run to check the request for issues like parameter validity and permissions, without creating the instance. If the check succeeds, a <code>DryRunOperation</code> error code is returned. If the check fails, an error message is returned.</p>
     * </li>
     * <li><p><code>false</code>: performs a dry run and creates the instance if the request passes the dry run. This is the default value.</p>
     * </li>
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
     * <li><p>The first and last characters cannot be periods (.) or hyphens (-). These characters also cannot be used consecutively.</p>
     * </li>
     * <li><p>For Windows instances: The hostname must be 2 to 15 characters long, cannot contain periods (.), and cannot consist of only digits. It can contain letters, digits, and hyphens (-).</p>
     * </li>
     * <li><p>For other operating systems, such as Linux: The hostname must be 2 to 64 characters long. You can use periods (.) as separators. The segments between periods can contain letters, digits, and hyphens (-).</p>
     * </li>
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
     * <li><p><code>enabled</code></p>
     * </li>
     * <li><p><code>disabled</code></p>
     * </li>
     * </ul>
     * <p>Default value: <code>enabled</code>.</p>
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
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether to enforce token-based access (IMDSv2) to instance metadata. Valid values:</p>
     * <ul>
     * <li><p><code>optional</code>: does not enforce the use of IMDSv2.</p>
     * </li>
     * <li><p><code>required</code>: enforces the use of IMDSv2. If you set this value, you cannot use IMDSv1 to access instance metadata.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>optional</code>.</p>
     * <blockquote>
     * <p>For more information about the modes of accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/150575.html">Access instance metadata</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The name of the image family. Setting this parameter creates an instance with the latest available image from the specified image family.</p>
     * <ul>
     * <li><p>If <code>ImageId</code> is specified, this parameter cannot be used.</p>
     * </li>
     * <li><p>If <code>ImageId</code> is not specified, you can specify this parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hangzhou-daily-update</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image used to create the instance. For an Alibaba Cloud Marketplace image, find its <code>ImageId</code> on the product details page. This parameter is required if you do not specify <code>ImageFamily</code> to use the latest available image from an image family.</p>
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
     * <li><p><code>PrePaid</code>: subscription. If you select this billing method, make sure that your account supports balance payment or credit payment. Otherwise, an <code>InvalidPayMethod</code> error is returned.</p>
     * </li>
     * <li><p><code>PostPaid</code>: pay-as-you-go. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the instance. The name must be 2 to 128 characters long. It can contain Unicode letters (such as Chinese characters), digits, colons (:), underscores (_), periods (.), and hyphens (-). If you do not specify this parameter, the instance ID is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s-node-[1,4]-alibabacloud</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance type.</p>
     * <ul>
     * <li><p>Select an instance type: For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance type families</a>, call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query performance data, or see <a href="https://help.aliyun.com/document_detail/58291.html">Select instance types</a> for selection guidance.</p>
     * </li>
     * <li><p>Query available resources: Call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to query available resources in a specific region or zone.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network billing method. Valid values:</p>
     * <ul>
     * <li><p><code>PayByBandwidth</code>: pay-by-bandwidth.</p>
     * </li>
     * <li><p><code>PayByTraffic</code>: pay-by-traffic. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>With the <strong>pay-by-traffic</strong> billing method, the specified peak bandwidth is an upper limit, not a guaranteed speed. Actual bandwidth may be limited during resource contention. If your business requires guaranteed bandwidth, use the <strong>pay-by-bandwidth</strong> billing method.</p>
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
     * <li><p>If <code>InternetMaxBandwidthOut</code> is 10 or less, the value of this parameter is an integer from 1 to 10. Default value: 10.</p>
     * </li>
     * <li><p>If <code>InternetMaxBandwidthOut</code> is greater than 10 Mbit/s, the value of this parameter is an integer from 1 to the value of <code>InternetMaxBandwidthOut</code>. Default value: the value of <code>InternetMaxBandwidthOut</code>.</p>
     * </li>
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
     * <p>是否为 I/O 优化实例。取值范围：</p>
     * <ul>
     * <li><p>none：非 I/O 优化。</p>
     * </li>
     * <li><p>optimized：I/O 优化。</p>
     * </li>
     * </ul>
     * <p><a href="https://help.aliyun.com/document_detail/55263.html">已停售的实例规格</a>实例默认值是 none。</p>
     * <p>其他实例规格默认值是 optimized。</p>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("IoOptimized")
    public String ioOptimized;

    /**
     * <p>The name of the key pair.</p>
     * <blockquote>
     * <p>For Windows instances, this parameter is ignored and the <code>Password</code> parameter is used. Default value: empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>KeyPairTestName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
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
     * <p>The password of the instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The supported special characters are:</p>
     * <pre><code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/
     * </code></pre>
     * <p>Note the following:</p>
     * <ul>
     * <li><p>If you specify the <code>Password</code> parameter, send the request over HTTPS to prevent the password from being leaked.</p>
     * </li>
     * <li><p>For Windows instances, the password cannot start with a forward slash (/).</p>
     * </li>
     * <li><p>Some operating systems, such as Others Linux and Fedora CoreOS, do not support password-based logon. For these, you must use a key pair.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TestEcs123!</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to use the password preconfigured in the image. If you set this parameter, you must leave the <code>Password</code> parameter empty and make sure that the image has a password preconfigured.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordInherit")
    public Boolean passwordInherit;

    /**
     * <p>The subscription duration of the resource. The unit is specified by <code>PeriodUnit</code>. This parameter is required and takes effect only if <code>InstanceChargeType</code> is set to <code>PrePaid</code>. If you specify <code>DedicatedHostId</code>, the value of this parameter cannot exceed the subscription duration of the specified dedicated host. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Week</code>: 1, 2, 3, and 4.</p>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, 6, and 12.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;</p>
     * <p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, 6, and 12.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>Week</p>
     * </li>
     * <li><p>Month</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>Month</p>
     * <p>&lt;props=&quot;partner&quot;&gt;</p>
     * <p>Month</p>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The private IP address of the instance. The IP address must be an available address in the CIDR block of the specified VSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.236.*</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The name of the instance RAM role. You can call the RAM API operation <a href="https://help.aliyun.com/document_detail/28713.html">ListRoles</a> to query the instance RAM roles that you created.</p>
     * 
     * <strong>example:</strong>
     * <p>RAMTestName</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The ID of the region in which to create the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
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
     * <li><p><code>Active</code>: enables security hardening. This setting is valid only for system images.</p>
     * </li>
     * <li><p><code>Deactive</code>: disables security hardening. This setting is valid for all image types.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    /**
     * <p>The ID of the security group to assign to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp15ed6xe1yxeycg****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The protection period of the spot instance. Unit: hours. Default value: 1. Valid values:</p>
     * <ul>
     * <li><p>1: Alibaba Cloud ensures that the instance runs for 1 hour without being automatically released. After 1 hour, the system compares your bid with the market price and checks the resource inventory to determine whether to retain or reclaim the instance.</p>
     * </li>
     * <li><p>0: Alibaba Cloud does not guarantee that the instance runs for 1 hour after it is created. The system compares your bid with the market price and checks the resource inventory to determine whether to retain or reclaim the instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter supports only 0 and 1.</p>
     * </li>
     * <li><p>Spot instances are billed per second. We recommend that you select a protection period based on the expected runtime of your tasks.</p>
     * </li>
     * <li><p>Alibaba Cloud sends a notification through ECS system events 5 minutes before the instance is reclaimed.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpotDuration")
    public Integer spotDuration;

    /**
     * <p>The interruption mode for the spot instance. Valid values:</p>
     * <ul>
     * <li><p><code>Terminate</code>: releases the instance.</p>
     * </li>
     * <li><p><code>Stop</code>: stops the instance in economical mode.</p>
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
     * <p>The maximum hourly price of the instance. The value can be accurate to three decimal places. This parameter is valid only if <code>SpotStrategy</code> is set to <code>SpotWithPriceLimit</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0.98</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the instance. This parameter is valid only if <code>InstanceChargeType</code> is set to <code>PostPaid</code>. Valid values:</p>
     * <ul>
     * <li><p><code>NoSpot</code>: The instance is created as a regular pay-as-you-go instance. This is the default value.</p>
     * </li>
     * <li><p><code>SpotWithPriceLimit</code>: The instance is created as a spot instance with a user-defined maximum hourly price.</p>
     * </li>
     * <li><p><code>SpotAsPriceGo</code>: The instance is created as a spot instance for which the system automatically bids based on the current market price.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>Specifies whether to create the instance on a dedicated host. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>ss-bp1j4i2jdf3owlhe****</p>
     */
    @NameInMap("StorageSetId")
    public String storageSetId;

    /**
     * <p>The maximum number of partitions in the storage set. The value must be 2 or greater.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSetPartitionNumber")
    public Integer storageSetPartitionNumber;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateInstanceRequestTag> tag;

    /**
     * <p>Specifies whether to associate the instance on a dedicated host with the dedicated host. Valid values:</p>
     * <ul>
     * <li><p><code>default</code>: does not associate the instance with the dedicated host. When a stopped instance in economical mode is restarted, it may be placed on a different dedicated host in the auto-deployment resource pool if the original dedicated host has insufficient resources.</p>
     * </li>
     * <li><p><code>host</code>: associates the instance with the dedicated host. When a stopped instance in economical mode is restarted, it is still placed on the original dedicated host. If the original dedicated host has insufficient resources, the instance fails to restart.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Tenancy")
    public String tenancy;

    /**
     * <p>是否使用阿里云提供的虚拟机系统配置（Windows：NTP、KMS；Linux：NTP、YUM）。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAdditionalService")
    public Boolean useAdditionalService;

    /**
     * <p>The user data of the instance. The user data must be Base64-encoded. The raw data can be up to 32 KB in size.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWNobyBoZWxsbyBlY3Mh</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>When you create an instance in a VPC, you must specify a VSwitch ID. You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query information about the VSwitches that you created.</p>
     * <blockquote>
     * <p>If <code>VSwitchId</code> is specified, <code>ZoneId</code> must match the VSwitch\&quot;s zone. If <code>ZoneId</code> is left unspecified, the system automatically uses the VSwitch\&quot;s zone.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws0****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual LAN (VLAN).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VlanId")
    public String vlanId;

    /**
     * <p>The ID of the zone to which the instance belongs. For more information, call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the list of zones.</p>
     * <blockquote>
     * <p>If <code>VSwitchId</code> is specified, <code>ZoneId</code> must match the VSwitch\&quot;s zone. If <code>ZoneId</code> is left unspecified, the system automatically uses the VSwitch\&quot;s zone.</p>
     * </blockquote>
     * <p>Default value: empty, which indicates that the system randomly selects a zone.</p>
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
         * <p>This parameter is in invitational preview and is not publicly available.</p>
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
         * <p>The ID of the private pool. This is the ID of the Elastic Assurance service or the Capacity Reservation service.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The matching mode for the private pool. A private pool is a capacity pool generated by the Elastic Assurance service or Capacity Reservation service. Valid values:</p>
         * <ul>
         * <li><p><code>Open</code>: Attempts to use capacity from an open private pool. If unavailable, it uses resources from the public pool. You do not need to specify <code>PrivatePoolOptions.Id</code>.</p>
         * </li>
         * <li><p><code>Target</code>: Uses capacity only from a specific private pool, which you must specify in <code>PrivatePoolOptions.Id</code>. The request fails if the specified capacity is unavailable.</p>
         * </li>
         * <li><p><code>None</code>: The instance is launched without using private pool capacity.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>None</code>.</p>
         * <p>In any of the following scenarios, the capacity option for the private pool can only be set to <code>None</code> or left unspecified.</p>
         * <ul>
         * <li><p>Create a spot instance.</p>
         * </li>
         * <li><p>Create an ECS instance in the classic network.</p>
         * </li>
         * <li><p>Create an ECS instance on a dedicated host.</p>
         * </li>
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
         * <p>The category of the system disk. Valid values:</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code>: Ultra Disk.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: SSD cloud disk.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: ESSD.</p>
         * </li>
         * <li><p><code>cloud</code>: Basic Disk.</p>
         * </li>
         * <li><p><code>cloud_auto</code>: ESSD AutoPL disk.</p>
         * </li>
         * <li><p><code>cloud_essd_entry</code>: ESSD Entry disk.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can set this parameter to <code>cloud_essd_entry</code> only if you set <code>InstanceType</code> to an instance type of the <a href="https://help.aliyun.com/document_detail/457079.html">general-purpose instance type family u1</a> (<code>ecs.u1</code>) or <a href="https://help.aliyun.com/document_detail/108489.html">economy instance type family e</a> (<code>ecs.e</code>).</p>
         * </blockquote>
         * <p>The default value is <code>cloud</code> for retired and non-I/O optimized instance types, and <code>cloud_efficiency</code> for all other types.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The description of the system disk. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * <p>Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the system disk. The name must be 2 to 128 characters in length. It can contain letters in the Unicode letter category (such as English letters, Chinese characters, and digits), colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDiskName</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The performance level of the ESSD to use as the system disk. Valid values:</p>
         * <ul>
         * <li><p>PL0: A single disk delivers up to 10,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL1: A single disk delivers up to 50,000 random read/write IOPS. This is the default value.</p>
         * </li>
         * <li><p>PL2: A single disk delivers up to 100,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL3: A single disk delivers up to 1,000,000 random read/write IOPS.</p>
         * </li>
         * </ul>
         * <p>For more information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p>Basic Disk: 20 to 500.</p>
         * </li>
         * <li><p>Other cloud disk types: 20 to 2048.</p>
         * </li>
         * </ul>
         * <p>The value must be greater than or equal to <code>max(20, ImageSize)</code>.</p>
         * <p>Default value: max(40, ImageSize).</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>专属块存储集群 ID。如果您在创建 ECS 实例时，需要使用专属块存储集群中的云盘资源作为系统盘，请设置该参数。</p>
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
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
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
         * <p>The category of data disk N. Valid values:</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code>: Ultra Disk.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: SSD cloud disk.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: ESSD.</p>
         * </li>
         * <li><p><code>cloud</code>: Basic Disk.</p>
         * </li>
         * <li><p><code>cloud_auto</code>: ESSD AutoPL disk.</p>
         * </li>
         * <li><p><code>cloud_essd_entry</code>: ESSD Entry disk.</p>
         * <blockquote>
         * <p>You can set this parameter to <code>cloud_essd_entry</code> only if you set <code>InstanceType</code> to an <code>ecs.u1</code> or <code>ecs.e</code> instance type family.</p>
         * </blockquote>
         * </li>
         * <li><p><code>elastic_ephemeral_disk_standard</code>: standard elastic ephemeral disk.</p>
         * </li>
         * <li><p><code>elastic_ephemeral_disk_premium</code>: premium elastic ephemeral disk.</p>
         * </li>
         * </ul>
         * <p>Default value for I/O optimized instances: <code>cloud_efficiency</code>. Default value for non-I/O optimized instances: <code>cloud</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Specifies whether to release the data disk when the instance is released.</p>
         * <ul>
         * <li><p><code>true</code>: releases the data disk.</p>
         * </li>
         * <li><p><code>false</code>: does not release the data disk.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>true</code>.</p>
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
         * <p>TestDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The mount point of the data disk.</p>
         * <blockquote>
         * <p>This parameter is valid only for whole machine images. You can set this parameter to the mount point that corresponds to the data disk in the whole machine image and modify the <code>DataDisk.N.Size</code> and <code>DataDisk.N.Category</code> parameters to change the category and size of the data disk in the whole machine image.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvdb</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The name of the data disk. The name must be 2 to 128 characters in length. It can contain letters in the Unicode letter category (such as English letters, Chinese characters, and digits), colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>DataDiskName</p>
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
         * <p>Specifies whether to encrypt data disk N.</p>
         * <ul>
         * <li><p><code>true</code>: encrypts the data disk.</p>
         * </li>
         * <li><p><code>false</code>: does not encrypt the data disk.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key to use for the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <p>The performance level of the ESSD to use as a data disk. The value of N must be the same as in <code>DataDisk.N.Category=cloud_essd</code>. Valid values:</p>
         * <ul>
         * <li><p>PL0: A single disk delivers up to 10,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL1: A single disk delivers up to 50,000 random read/write IOPS. This is the default value.</p>
         * </li>
         * <li><p>PL2: A single disk delivers up to 100,000 random read/write IOPS.</p>
         * </li>
         * <li><p>PL3: A single disk delivers up to 1,000,000 random read/write IOPS.</p>
         * </li>
         * </ul>
         * <p>For more information about how to select an ESSD performance level, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>PL2</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <p>The size of data disk N. The value of N ranges from 1 to 16. Unit: GiB. Valid values:</p>
         * <ul>
         * <li><p><code>cloud_efficiency</code>: 20 to 32768.</p>
         * </li>
         * <li><p><code>cloud_ssd</code>: 20 to 32768.</p>
         * </li>
         * <li><p><code>cloud_essd</code>: The valid values of this parameter are related to the value of <code>DataDisk.N.PerformanceLevel</code>.</p>
         * <ul>
         * <li><p>PL0: 1 to 65,536.</p>
         * </li>
         * <li><p>PL1: 20 to 65,536.</p>
         * </li>
         * <li><p>PL2: 461 to 65,536.</p>
         * </li>
         * <li><p>PL3: 1261 to 65,536.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>cloud</code>: 5 to 2000.</p>
         * </li>
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
         * <p>The ID of the snapshot to use to create data disk N. The value of N ranges from 1 to 16.</p>
         * <ul>
         * <li><p>If <code>DataDisk.N.SnapshotId</code> is specified, <code>DataDisk.N.Size</code> is ignored, and the disk is created with the same size as the snapshot.</p>
         * </li>
         * <li><p>Snapshots created on or before July 15, 2013, are not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>s-bp17441ohwka0yuh****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The ID of the dedicated block storage cluster. If you want to use cloud disk resources in a dedicated block storage cluster as data disks when you create an ECS instance, set this parameter.</p>
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
         * <p>The tag key.</p>
         * <blockquote>
         * <p>For better compatibility</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>实例、云盘和主网卡的标签值。N 的取值范围：1\~20。一旦传入该值，可以为空字符串。最多支持 128 个字符，不能包含<code>http://</code>或者<code>https://</code>。</p>
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
