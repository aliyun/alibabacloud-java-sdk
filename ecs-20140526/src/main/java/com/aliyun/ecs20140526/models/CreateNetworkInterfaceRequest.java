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
     * <p>A client token to ensure request idempotence. Your client generates this token, which must be unique across requests. The token can contain only ASCII characters and must not exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection tracking settings.</p>
     * <p>Before using this parameter, read <a href="https://help.aliyun.com/document_detail/2865958.html">Connection timeout management</a>.</p>
     */
    @NameInMap("ConnectionTrackingConfiguration")
    public CreateNetworkInterfaceRequestConnectionTrackingConfiguration connectionTrackingConfiguration;

    /**
     * <p>Specifies whether to release the elastic network interface when its attached instance is released. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The elastic network interface is released.</p>
     * </li>
     * <li><p><code>false</code>: The elastic network interface is retained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteOnRelease")
    public Boolean deleteOnRelease;

    /**
     * <p>The description of the elastic network interface. The description must be 2 to 256 characters long and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("EnhancedNetwork")
    public CreateNetworkInterfaceRequestEnhancedNetwork enhancedNetwork;

    /**
     * <p>The type of the elastic network interface. Valid values:</p>
     * <ul>
     * <li><p><code>Secondary</code>: a secondary elastic network interface.</p>
     * </li>
     * <li><p><code>Trunk</code>: a trunk network interface. (This feature is available by invitation only.)</p>
     * </li>
     * </ul>
     * <p>Default value: <code>Secondary</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Secondary</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>One or more IPv4 prefixes to assign to the elastic network interface. Valid values of N: 1 to 10.</p>
     * <blockquote>
     * <p>You must specify either <code>Ipv4Prefix.N</code> or <code>Ipv4PrefixCount</code>, but not both, to assign IPv4 prefixes.</p>
     * </blockquote>
     */
    @NameInMap("Ipv4Prefix")
    public java.util.List<String> ipv4Prefix;

    /**
     * <p>The number of IPv4 prefixes to assign to the elastic network interface. Valid values: 1 to 10.</p>
     * <blockquote>
     * <p>You must specify either <code>Ipv4Prefix.N</code> or <code>Ipv4PrefixCount</code>, but not both, to assign IPv4 prefixes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv4PrefixCount")
    public Integer ipv4PrefixCount;

    /**
     * <p>One or more IPv6 addresses to assign to the elastic network interface. You can specify up to 10 IPv6 addresses. Valid values of N: 1 to 10.</p>
     * <p>Example: <code>Ipv6Address.1=2001:db8:1234:1a00::****</code></p>
     * <blockquote>
     * <p>You must specify either <code>Ipv6Address.N</code> or <code>Ipv6AddressCount</code>, but not both, to assign IPv6 addresses.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1234:1a00::****</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The number of random IPv6 addresses to assign to the elastic network interface. Valid values: 1 to 10.</p>
     * <blockquote>
     * <p>You must specify either <code>Ipv6Address.N</code> or <code>Ipv6AddressCount</code>, but not both, to assign IPv6 addresses.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>One or more IPv6 prefixes to assign to the elastic network interface. Valid values of N: 1 to 10.</p>
     * <blockquote>
     * <p>You must specify either <code>Ipv6Prefix.N</code> or <code>Ipv6PrefixCount</code>, but not both, to assign IPv6 prefixes.</p>
     * </blockquote>
     */
    @NameInMap("Ipv6Prefix")
    public java.util.List<String> ipv6Prefix;

    /**
     * <p>The number of IPv6 prefixes to assign to the elastic network interface. Valid values: 1 to 10.</p>
     * <blockquote>
     * <p>You must specify either <code>Ipv6Prefix.N</code> or <code>Ipv6PrefixCount</code>, but not both, to assign IPv6 prefixes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6PrefixCount")
    public Integer ipv6PrefixCount;

    /**
     * <p>The name of the elastic network interface. The name must be 2 to 128 characters long and can contain Unicode letters (such as English and Chinese characters), digits (0-9), colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>testNetworkInterfaceName</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The communication parameters of the elastic network interface.</p>
     */
    @NameInMap("NetworkInterfaceTrafficConfig")
    public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    /**
     * <p>The traffic mode of the elastic network interface. Valid values:</p>
     * <ul>
     * <li><p><code>Standard</code>: uses the TCP traffic mode.</p>
     * </li>
     * <li><p><code>HighPerformance</code>: enables the Elastic RDMA Interface (ERI) and uses the RDMA traffic mode.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>An elastic network interface in RDMA traffic mode can be attached only to an ERI-supported instance type. The number of these elastic network interfaces that can be attached is limited by the instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>, <a href="https://help.aliyun.com/document_detail/336853.html">Configure eRDMA on an enterprise-level instance</a>&lt;props=&quot;china&quot;&gt;, and <a href="https://help.aliyun.com/document_detail/2248432.html">Configure eRDMA on a GPU instance</a>.</p>
     * </blockquote>
     * <p>Default value: <code>Standard</code>.</p>
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
     * <p>The primary private IP address of the elastic network interface.</p>
     * <p>The IP address must be an available IP address within the CIDR block of the VSwitch. If this parameter is not specified, the system randomly assigns an available IP address from the VSwitch\&quot;s CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p><code>172.17.**.**</code></p>
     */
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    /**
     * <p>One or more secondary private IP addresses to assign to the elastic network interface. The IP addresses must be available addresses from the CIDR block of the VSwitch to which the elastic network interface belongs. Valid values of N: 0 to 10.</p>
     * <blockquote>
     * <p>You cannot specify both <code>PrivateIpAddress.N</code> and <code>SecondaryPrivateIpAddressCount</code> to assign secondary private IP addresses.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><code>172.17.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    /**
     * <p>The number of queues for the elastic network interface. Valid values: 1 to 2048.</p>
     * <p>When attached to an instance, this value must be less than the maximum number of queues per elastic network interface that the instance type supports. You can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and check the <code>MaximumQueueNumberPerEni</code> value in the response to query this limit.</p>
     * <p>If you do not specify this parameter, the default queue number for the instance type is used upon attachment.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>The number of queue pairs for the RDMA-enabled elastic network interface.</p>
     * <p>If you want to attach multiple RDMA-enabled elastic network interfaces to an instance, we recommend that you specify a <code>QueuePairNumber</code> value for each elastic network interface. The value should be based on the maximum <code>QueuePairNumber</code> value supported by the instance type and the number of elastic network interfaces that you plan to use. The total number of queue pairs for all elastic network interfaces cannot exceed the maximum value for the instance type. You can call the <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> operation to query the maximum value.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>If you do not specify <code>QueuePairNumber</code> for an RDMA-enabled elastic network interface, the system defaults to the maximum value that the instance type supports. Consequently, you cannot attach any more RDMA-enabled elastic network interfaces to that instance. This does not affect standard elastic network interfaces.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    /**
     * <p>The ID of the region in which to create the elastic network interface. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
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
     * <p>The receive (Rx) queue depth of the elastic network interface.</p>
     * <ul>
     * <li><p>The receive (Rx) and transmit (Tx) queue depths must be equal. The value must be a power of 2 between 8,192 and 16,384.</p>
     * </li>
     * <li><p>A larger Rx queue depth can improve receive throughput but consumes more memory.</p>
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
     * <p>The number of secondary private IP addresses to automatically assign to the elastic network interface. Valid values: 1 to 49.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SecondaryPrivateIpAddressCount")
    public Integer secondaryPrivateIpAddressCount;

    /**
     * <p>The ID of the security group for the elastic network interface. The security group and the elastic network interface must be in the same VPC.</p>
     * <blockquote>
     * <p>You must specify either <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code>, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1fg655nh68xyz9i****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of one or more security groups to which to add the elastic network interface. The security groups and the elastic network interface must be in the same VPC. The valid values of N depend on the maximum number of security groups to which an elastic network interface can be added. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * <blockquote>
     * <p>You must specify either <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code>, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1fg655nh68xyz9i****</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>Specifies whether to enable source/destination check. Enabling this feature enhances network security. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: enabled.</p>
     * </li>
     * <li><p><code>false</code>: disabled.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>This feature is available only in some regions. Before you use this feature, read <a href="https://help.aliyun.com/document_detail/2863210.html">Source/destination check</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceDestCheck")
    public Boolean sourceDestCheck;

    /**
     * <p>The tags to add to the elastic network interface.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNetworkInterfaceRequestTag> tag;

    /**
     * <p>The transmit (Tx) queue depth of the elastic network interface.</p>
     * <ul>
     * <li><p>The transmit (Tx) and receive (Rx) queue depths must be equal. The value must be a power of 2 between 8,192 and 16,384.</p>
     * </li>
     * <li><p>A larger Tx queue depth can improve transmit throughput but consumes more memory.</p>
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
     * <p>The ID of the VSwitch for the elastic network interface. The private IP addresses for the elastic network interface are assigned from the available CIDR block of the VSwitch.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The elastic network interface and the instance to be attached must be in the same availability zone but can belong to different VSwitches.</p>
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
         * <p>The timeout for a TCP connection in the TIME_WAIT or closing state, in seconds. Valid values: integers from 3 to 15.</p>
         * <p>Default value: 3.</p>
         * <blockquote>
         * <p>If your ECS instance works with NLB or CLB, the default timeout period for connections in the <code>TIME_WAIT</code> state is 15 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TcpClosedAndTimeWaitTimeout")
        public Integer tcpClosedAndTimeWaitTimeout;

        /**
         * <p>The timeout for an established TCP connection, in seconds. Valid values: 30, 60, 80, 100, 200, 300, 500, 700, and 910.</p>
         * <p>Default value: 910.</p>
         * 
         * <strong>example:</strong>
         * <p>910</p>
         */
        @NameInMap("TcpEstablishedTimeout")
        public Integer tcpEstablishedTimeout;

        /**
         * <p>The timeout for a UDP stream, in seconds. Valid values: 10, 20, 30, 60, 80, and 100.</p>
         * <p>Default value: 30.</p>
         * <blockquote>
         * <p>If your ECS instance works with NLB or CLB, the default value is 100 seconds.</p>
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
         * <p>The traffic mode of the elastic network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of queues for the elastic network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of queue pairs for the RDMA-enabled elastic network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        /**
         * <p>The receive (Rx) queue depth of the elastic network interface.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is available by invitation only. To request access, submit a ticket.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is available by invitation only. To request access, submit a ticket.</p>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is applicable only to seventh-generation or later ECS instance types.</p>
         * </li>
         * <li><p>This parameter is applicable only to Linux images.</p>
         * </li>
         * <li><p>A larger Rx queue depth can improve receive throughput and reduce the packet loss rate, but consumes more memory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

        /**
         * <p>The transmit (Tx) queue depth of the elastic network interface.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is available by invitation only. To request access, submit a ticket.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is available by invitation only. To request access, submit a ticket.</p>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is applicable only to seventh-generation or later ECS instance types.</p>
         * </li>
         * <li><p>This parameter is applicable only to Linux images.</p>
         * </li>
         * <li><p>A larger Tx queue depth can improve transmit throughput and reduce the packet loss rate, but consumes more memory.</p>
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
         * <p>The key of the tag. Valid values for N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters long and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. Valid values for N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters long and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
