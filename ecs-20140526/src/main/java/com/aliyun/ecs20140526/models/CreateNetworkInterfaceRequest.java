// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The network connectivity tracking configuration.</p>
     * <p>Before you use this parameter, read <a href="https://help.aliyun.com/document_detail/2865958.html">Connection timeout management</a>.</p>
     */
    @NameInMap("ConnectionTrackingConfiguration")
    public CreateNetworkInterfaceRequestConnectionTrackingConfiguration connectionTrackingConfiguration;

    /**
     * <p>Specifies whether to retain the ENI when the associated instance is released. Valid values:</p>
     * <ul>
     * <li><p>true: does not retain the ENI.</p>
     * </li>
     * <li><p>false: retains the ENI.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteOnRelease")
    public Boolean deleteOnRelease;

    /**
     * <p>The description of the network interface controller (NIC). The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EnablePrimaryIPv6")
    public Boolean enablePrimaryIPv6;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("EnhancedNetwork")
    public CreateNetworkInterfaceRequestEnhancedNetwork enhancedNetwork;

    /**
     * <p>The type of the Elastic Network Interface (ENI). Valid values:</p>
     * <ul>
     * <li>Secondary: secondary ENI.</li>
     * <li>Trunk: trunk network interface controller (NIC) (in invitational preview).</li>
     * </ul>
     * <p>Default value: Secondary.</p>
     * 
     * <strong>example:</strong>
     * <p>Secondary</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>One or more IPv4 prefixes to assign to the network interface controller (NIC). Valid values of N: 1 to 10.</p>
     * <blockquote>
     * <p>If you want to set IPv4 prefixes for the network interface controller (NIC), you must set either the parameter Ipv4Prefix.N or the parameter Ipv4PrefixCount but not both.</p>
     * </blockquote>
     */
    @NameInMap("Ipv4Prefix")
    public java.util.List<String> ipv4Prefix;

    /**
     * <p>The number of IPv4 prefixes to assign to the network interface controller (NIC). Valid values: 1 to 10.</p>
     * <blockquote>
     * <p>If you want to set IPv4 prefixes for the network interface controller (NIC), you must set either the parameter Ipv4Prefix.N or the parameter Ipv4PrefixCount but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv4PrefixCount")
    public Integer ipv4PrefixCount;

    /**
     * <p>One or more IPv6 addresses to assign to the network interface controller (NIC). You can specify up to 10 IPv6 addresses. Valid values of N: 1 to 10.</p>
     * <p>Example: Ipv6Address.1=2001:db8:1234:1a00::\<em>\</em>\<em>\</em></p>
     * <blockquote>
     * <p>If you want to set IPv6 addresses for the network interface controller (NIC), you must set either the parameter <code>Ipv6Addresses.N</code> or the parameter <code>Ipv6AddressCount</code> but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1234:1a00::****</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The number of IPv6 addresses to randomly generate for the network interface controller (NIC). Valid values: 1 to 10.</p>
     * <blockquote>
     * <p>If you want to set IPv6 addresses for the network interface controller (NIC), you must set either the parameter <code>Ipv6Addresses.N</code> or the parameter <code>Ipv6AddressCount</code> but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>One or more IPv6 prefixes to assign to the network interface controller (NIC). Valid values of N: 1 to 10.</p>
     * <blockquote>
     * <p>If you want to set IPv6 prefixes for the network interface controller (NIC), you must set either the parameter Ipv6Prefix.N or the parameter Ipv6PrefixCount but not both.</p>
     * </blockquote>
     */
    @NameInMap("Ipv6Prefix")
    public java.util.List<String> ipv6Prefix;

    /**
     * <p>The number of IPv6 prefixes to assign to the network interface controller (NIC). Valid values: 1 to 10.</p>
     * <blockquote>
     * <p>If you want to set IPv6 prefixes for the network interface controller (NIC), you must set either the parameter Ipv6Prefix.N or the parameter Ipv6PrefixCount but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6PrefixCount")
    public Integer ipv6PrefixCount;

    /**
     * <p>The name of the network interface controller (NIC). The name must be 2 to 128 characters in length and can contain characters from the Unicode letter categorization (including English and Chinese characters) and ASCII digits (0-9). The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testNetworkInterfaceName</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The traffic configuration parameter set of the network interface controller (NIC).</p>
     */
    @NameInMap("NetworkInterfaceTrafficConfig")
    public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    /**
     * <p>The communication pattern of the network interface controller (NIC). Valid values:</p>
     * <ul>
     * <li>Standard: uses the TCP communication pattern.</li>
     * <li>HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the RDMA communication pattern.</li>
     * </ul>
     * <blockquote>
     * <p>A network interface controller (NIC) in RDMA communication pattern can be attached only to an instance whose instance type supports ERI. The number of ENIs in RDMA pattern cannot exceed the limit of the instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> and <a href="https://help.aliyun.com/document_detail/336853.html">Configure eRDMA on enterprise-level instances</a>&lt;props=&quot;china&quot;&gt; and <a href="https://help.aliyun.com/document_detail/2248432.html">Configure eRDMA on GPU-accelerated instances</a>.</p>
     * </blockquote>
     * <p>Default value: Standard.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The primary private IP address of the network interface controller (NIC).</p>
     * <p>The specified IP address must be an idle address within the CIDR block of the vSwitch. If you do not specify this parameter, an idle private IP address in the vSwitch CIDR block is randomly allocated by default.</p>
     * 
     * <strong>example:</strong>
     * <p><code>172.17.**.**</code></p>
     */
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    /**
     * <p>One or more secondary private IP addresses selected from the idle addresses within the CIDR block of the vSwitch to which the network interface controller (NIC) belongs. Valid values of N: 0 to 10.</p>
     * <blockquote>
     * <p>When you allocate secondary private IP addresses, you cannot specify both the parameter <code>PrivateIpAddress.N</code> and the parameter <code>SecondaryPrivateIpAddressCount</code> at the same time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><code>172.17.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    /**
     * <p>The number of queues for the network interface controller (NIC). Valid values: 1 to 2048.</p>
     * <p>When you attach the ENI to an instance, the value must be less than the maximum number of queues per network interface controller (NIC) supported by the instance type. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the <code>MaximumQueueNumberPerEni</code> field.</p>
     * <p>Default value: empty. When the ENI is attached, the default queue number for the instance type is used. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the <code>SecondaryEniQueueNumber</code> field.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>The number of queues for the RDMA ENI.</p>
     * <p>If you want to attach multiple RDMA ENIs to an instance, we recommend that you manually specify QueuePairNumber for each ENI based on the upper limit of <code>QueuePairNumber</code> supported by the instance type and the number of ENIs you plan to use. Make sure that the total QueuePairNumber of all ENIs does not exceed the maximum value allowed by the instance type. Call <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to query the upper limit for the instance type.</p>
     * <blockquote>
     * <p>Notice: If QueuePairNumber is not specified for an RDMA ENI, the upper limit of QueuePairNumber for all RDMA ENIs supported by the instance type is used by default. Therefore, after an RDMA ENI without a specified QueuePairNumber is attached, no more RDMA ENIs can be added (regular ENIs are not affected by this limit).</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    /**
     * <p>The region ID of the network interface controller (NIC) to create. You can invoke <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. You can call <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> to query resource group information.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The inbound queue depth of the network interface controller (NIC).</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>The inbound queue depth of the network interface controller (NIC) must be equal to the outbound queue depth. Valid values: 8192 to 16384. The value must be a power of 2.</p>
     * </li>
     * <li><p>A larger inbound queue depth increases inbound throughput but consumes more memory.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("RxQueueSize")
    public Integer rxQueueSize;

    /**
     * <p>The number of private IP addresses for automatic creation by ECS. Valid values: 1 to 49.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SecondaryPrivateIpAddressCount")
    public Integer secondaryPrivateIpAddressCount;

    /**
     * <p>The ID of the security group to which the network interface controller (NIC) belongs. The security group and the ENI must be in the same VPC.</p>
     * <blockquote>
     * <p>When you invoke this operation, you must set either <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code> but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1fg655nh68xyz9i****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of one or more security groups to which the network interface controller (NIC) belongs. The security groups and the ENI must be in the same VPC. The valid values of N depend on the quota for the maximum number of security groups to which an ENI can belong. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * <blockquote>
     * <p>When you invoke this operation, you must set either <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code> but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1fg655nh68xyz9i****</p>
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
     * <p>This feature is supported only in specific regions. Before you use this feature, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source/destination checking</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceDestCheck")
    public Boolean sourceDestCheck;

    /**
     * <p>The tags of the network interface controller (NIC).</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNetworkInterfaceRequestTag> tag;

    /**
     * <p>The outbound queue depth of the network interface controller (NIC).</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>The outbound queue depth of the network interface controller (NIC) must be equal to the inbound queue depth. Valid values: 8192 to 16384. The value must be a power of 2.</p>
     * </li>
     * <li><p>A larger outbound queue depth increases outbound throughput but consumes more memory.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("TxQueueSize")
    public Integer txQueueSize;

    /**
     * <p>The vSwitch ID of the network interface controller (NIC). The private IP address of the ENI is allocated from the idle addresses within the CIDR block of the vSwitch.</p>
     * <blockquote>
     * <p>Notice: The network interface controller (NIC) and the instance to which you want to attach the ENI must be in the same zone but can belong to different vSwitches.</notice></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1s5fnvk4gn2tws03****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Visible")
    public Boolean visible;

    public static CreateNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceRequest self = new CreateNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfaceRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateNetworkInterfaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNetworkInterfaceRequest setConnectionTrackingConfiguration(CreateNetworkInterfaceRequestConnectionTrackingConfiguration connectionTrackingConfiguration) {
        this.connectionTrackingConfiguration = connectionTrackingConfiguration;
        return this;
    }
    public CreateNetworkInterfaceRequestConnectionTrackingConfiguration getConnectionTrackingConfiguration() {
        return this.connectionTrackingConfiguration;
    }

    public CreateNetworkInterfaceRequest setDeleteOnRelease(Boolean deleteOnRelease) {
        this.deleteOnRelease = deleteOnRelease;
        return this;
    }
    public Boolean getDeleteOnRelease() {
        return this.deleteOnRelease;
    }

    public CreateNetworkInterfaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkInterfaceRequest setEnablePrimaryIPv6(Boolean enablePrimaryIPv6) {
        this.enablePrimaryIPv6 = enablePrimaryIPv6;
        return this;
    }
    public Boolean getEnablePrimaryIPv6() {
        return this.enablePrimaryIPv6;
    }

    public CreateNetworkInterfaceRequest setEnhancedNetwork(CreateNetworkInterfaceRequestEnhancedNetwork enhancedNetwork) {
        this.enhancedNetwork = enhancedNetwork;
        return this;
    }
    public CreateNetworkInterfaceRequestEnhancedNetwork getEnhancedNetwork() {
        return this.enhancedNetwork;
    }

    public CreateNetworkInterfaceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateNetworkInterfaceRequest setIpv4Prefix(java.util.List<String> ipv4Prefix) {
        this.ipv4Prefix = ipv4Prefix;
        return this;
    }
    public java.util.List<String> getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    public CreateNetworkInterfaceRequest setIpv4PrefixCount(Integer ipv4PrefixCount) {
        this.ipv4PrefixCount = ipv4PrefixCount;
        return this;
    }
    public Integer getIpv4PrefixCount() {
        return this.ipv4PrefixCount;
    }

    public CreateNetworkInterfaceRequest setIpv6Address(java.util.List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

    public CreateNetworkInterfaceRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    public CreateNetworkInterfaceRequest setIpv6Prefix(java.util.List<String> ipv6Prefix) {
        this.ipv6Prefix = ipv6Prefix;
        return this;
    }
    public java.util.List<String> getIpv6Prefix() {
        return this.ipv6Prefix;
    }

    public CreateNetworkInterfaceRequest setIpv6PrefixCount(Integer ipv6PrefixCount) {
        this.ipv6PrefixCount = ipv6PrefixCount;
        return this;
    }
    public Integer getIpv6PrefixCount() {
        return this.ipv6PrefixCount;
    }

    public CreateNetworkInterfaceRequest setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public CreateNetworkInterfaceRequest setNetworkInterfaceTrafficConfig(CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig) {
        this.networkInterfaceTrafficConfig = networkInterfaceTrafficConfig;
        return this;
    }
    public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig getNetworkInterfaceTrafficConfig() {
        return this.networkInterfaceTrafficConfig;
    }

    public CreateNetworkInterfaceRequest setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
        this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
        return this;
    }
    public String getNetworkInterfaceTrafficMode() {
        return this.networkInterfaceTrafficMode;
    }

    public CreateNetworkInterfaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateNetworkInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateNetworkInterfaceRequest setPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
        return this;
    }
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    public CreateNetworkInterfaceRequest setPrivateIpAddress(java.util.List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public java.util.List<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateNetworkInterfaceRequest setQueueNumber(Integer queueNumber) {
        this.queueNumber = queueNumber;
        return this;
    }
    public Integer getQueueNumber() {
        return this.queueNumber;
    }

    public CreateNetworkInterfaceRequest setQueuePairNumber(Integer queuePairNumber) {
        this.queuePairNumber = queuePairNumber;
        return this;
    }
    public Integer getQueuePairNumber() {
        return this.queuePairNumber;
    }

    public CreateNetworkInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNetworkInterfaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateNetworkInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateNetworkInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateNetworkInterfaceRequest setRxQueueSize(Integer rxQueueSize) {
        this.rxQueueSize = rxQueueSize;
        return this;
    }
    public Integer getRxQueueSize() {
        return this.rxQueueSize;
    }

    public CreateNetworkInterfaceRequest setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    public CreateNetworkInterfaceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateNetworkInterfaceRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateNetworkInterfaceRequest setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }
    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    public CreateNetworkInterfaceRequest setTag(java.util.List<CreateNetworkInterfaceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateNetworkInterfaceRequestTag> getTag() {
        return this.tag;
    }

    public CreateNetworkInterfaceRequest setTxQueueSize(Integer txQueueSize) {
        this.txQueueSize = txQueueSize;
        return this;
    }
    public Integer getTxQueueSize() {
        return this.txQueueSize;
    }

    public CreateNetworkInterfaceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateNetworkInterfaceRequest setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

    public static class CreateNetworkInterfaceRequestConnectionTrackingConfiguration extends TeaModel {
        /**
         * <p>The timeout period for TCP connections in the TIME_WAIT and CLOSED states. Unit: seconds. Valid values: integers from 3 to 15.</p>
         * <p>Default value: 3.</p>
         * <blockquote>
         * <p>If your ECS instance is used with NLB/CLB, the default timeout period for connections in the <code>TIME_WAIT</code> state is 15 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TcpClosedAndTimeWaitTimeout")
        public Integer tcpClosedAndTimeWaitTimeout;

        /**
         * <p>The timeout period for established TCP connections. Unit: seconds. Valid values: [30, 60, 80, 100, 200, 300, 500, 700, 910].</p>
         * <p>Default value: 910.</p>
         * 
         * <strong>example:</strong>
         * <p>910</p>
         */
        @NameInMap("TcpEstablishedTimeout")
        public Integer tcpEstablishedTimeout;

        /**
         * <p>The timeout period for UDP flows. Unit: seconds. Valid values: [10, 20, 30, 60, 80, 100].</p>
         * <p>Default value: 30.</p>
         * <blockquote>
         * <p>If your ECS instance is used with NLB/CLB, the default value is 100 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static CreateNetworkInterfaceRequestConnectionTrackingConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceRequestConnectionTrackingConfiguration self = new CreateNetworkInterfaceRequestConnectionTrackingConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceRequestConnectionTrackingConfiguration setTcpClosedAndTimeWaitTimeout(Integer tcpClosedAndTimeWaitTimeout) {
            this.tcpClosedAndTimeWaitTimeout = tcpClosedAndTimeWaitTimeout;
            return this;
        }
        public Integer getTcpClosedAndTimeWaitTimeout() {
            return this.tcpClosedAndTimeWaitTimeout;
        }

        public CreateNetworkInterfaceRequestConnectionTrackingConfiguration setTcpEstablishedTimeout(Integer tcpEstablishedTimeout) {
            this.tcpEstablishedTimeout = tcpEstablishedTimeout;
            return this;
        }
        public Integer getTcpEstablishedTimeout() {
            return this.tcpEstablishedTimeout;
        }

        public CreateNetworkInterfaceRequestConnectionTrackingConfiguration setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

    }

    public static class CreateNetworkInterfaceRequestEnhancedNetwork extends TeaModel {
        @NameInMap("EnableExpress")
        public Boolean enableExpress;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRss")
        public Boolean enableRss;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSriov")
        public Boolean enableSriov;

        @NameInMap("VirtualFunctionQuantity")
        public Integer virtualFunctionQuantity;

        @NameInMap("VirtualFunctionTotalQueueNumber")
        public Integer virtualFunctionTotalQueueNumber;

        public static CreateNetworkInterfaceRequestEnhancedNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceRequestEnhancedNetwork self = new CreateNetworkInterfaceRequestEnhancedNetwork();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceRequestEnhancedNetwork setEnableExpress(Boolean enableExpress) {
            this.enableExpress = enableExpress;
            return this;
        }
        public Boolean getEnableExpress() {
            return this.enableExpress;
        }

        public CreateNetworkInterfaceRequestEnhancedNetwork setEnableRss(Boolean enableRss) {
            this.enableRss = enableRss;
            return this;
        }
        public Boolean getEnableRss() {
            return this.enableRss;
        }

        public CreateNetworkInterfaceRequestEnhancedNetwork setEnableSriov(Boolean enableSriov) {
            this.enableSriov = enableSriov;
            return this;
        }
        public Boolean getEnableSriov() {
            return this.enableSriov;
        }

        public CreateNetworkInterfaceRequestEnhancedNetwork setVirtualFunctionQuantity(Integer virtualFunctionQuantity) {
            this.virtualFunctionQuantity = virtualFunctionQuantity;
            return this;
        }
        public Integer getVirtualFunctionQuantity() {
            return this.virtualFunctionQuantity;
        }

        public CreateNetworkInterfaceRequestEnhancedNetwork setVirtualFunctionTotalQueueNumber(Integer virtualFunctionTotalQueueNumber) {
            this.virtualFunctionTotalQueueNumber = virtualFunctionTotalQueueNumber;
            return this;
        }
        public Integer getVirtualFunctionTotalQueueNumber() {
            return this.virtualFunctionTotalQueueNumber;
        }

    }

    public static class CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig extends TeaModel {
        /**
         * <p>The communication pattern of the network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of queues for the network interface controller (NIC).</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of queues for the RDMA ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        /**
         * <p>The inbound queue depth of the network interface controller (NIC).</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available. If you want to use this parameter, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a> to request access.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available. If you want to use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a> to request access.</p>
         * </blockquote>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>This parameter applies only to seventh-generation and later ECS instance types.</p>
         * </li>
         * <li><p>This parameter currently applies only to Linux images.</p>
         * </li>
         * <li><p>A larger inbound queue depth of the network interface controller (NIC) increases inbound throughput and reduces packet loss probability but consumes more memory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

        /**
         * <p>The outbound queue depth of the network interface controller (NIC).</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available. If you want to use this parameter, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a> to request access.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available. If you want to use this parameter, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a> to request access.</p>
         * </blockquote>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li><p>This parameter applies only to seventh-generation and later ECS instance types.</p>
         * </li>
         * <li><p>This parameter currently applies only to Linux images.</p>
         * </li>
         * <li><p>A larger outbound queue depth of the network interface controller (NIC) increases outbound throughput and reduces packet loss probability but consumes more memory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("TxQueueSize")
        public Integer txQueueSize;

        public static CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig self = new CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
            this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
            return this;
        }
        public String getNetworkInterfaceTrafficMode() {
            return this.networkInterfaceTrafficMode;
        }

        public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig setQueueNumber(Integer queueNumber) {
            this.queueNumber = queueNumber;
            return this;
        }
        public Integer getQueueNumber() {
            return this.queueNumber;
        }

        public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig setQueuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }
        public Integer getQueuePairNumber() {
            return this.queuePairNumber;
        }

        public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig setRxQueueSize(Integer rxQueueSize) {
            this.rxQueueSize = rxQueueSize;
            return this;
        }
        public Integer getRxQueueSize() {
            return this.rxQueueSize;
        }

        public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig setTxQueueSize(Integer txQueueSize) {
            this.txQueueSize = txQueueSize;
            return this;
        }
        public Integer getTxQueueSize() {
            return this.txQueueSize;
        }

    }

    public static class CreateNetworkInterfaceRequestTag extends TeaModel {
        /**
         * <p>The tag key of the network interface controller (NIC). Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the network interface controller (NIC). Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateNetworkInterfaceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNetworkInterfaceRequestTag self = new CreateNetworkInterfaceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateNetworkInterfaceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNetworkInterfaceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
