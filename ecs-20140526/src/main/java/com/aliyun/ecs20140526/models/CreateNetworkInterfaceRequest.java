// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is no longer used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection tracking configurations of the ENI.</p>
     * <p>Before you use this parameter, learn about how to manage connection timeout periods. For more information, see <a href="https://help.aliyun.com/document_detail/2865958.html">Manage connection timeout periods</a>.</p>
     */
    @NameInMap("ConnectionTrackingConfiguration")
    public CreateNetworkInterfaceRequestConnectionTrackingConfiguration connectionTrackingConfiguration;

    /**
     * <p>Specifies whether to release the ENI when the associated instance is released. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteOnRelease")
    public Boolean deleteOnRelease;

    /**
     * <p>The description of the ENI. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * <p>This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     */
    @NameInMap("EnhancedNetwork")
    public CreateNetworkInterfaceRequestEnhancedNetwork enhancedNetwork;

    /**
     * <p>The type of the ENI. Valid values:</p>
     * <ul>
     * <li>Secondary: secondary ENI.</li>
     * <li>Trunk: trunk ENI. This value is in invitational preview.</li>
     * </ul>
     * <p>Default value: Secondary.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>IPv4 prefixes to assign to the ENI. Valid values of N: 1 to 10.</p>
     * <blockquote>
     * <p> To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
     * </blockquote>
     */
    @NameInMap("Ipv4Prefix")
    public java.util.List<String> ipv4Prefix;

    /**
     * <p>The number of IPv4 prefixes to assign to the ENI. Valid values: 1 to 10.</p>
     * <blockquote>
     * <p> To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("Ipv4PrefixCount")
    public Integer ipv4PrefixCount;

    /**
     * <p>IPv6 addresses to assign to the ENI. Valid values of N: 1 to 10.</p>
     * <p>Example: Ipv6Address.1=2001:db8:1234:1a00::\<em>\</em>\<em>\</em></p>
     * <blockquote>
     * <p> To assign IPv6 addresses to the ENI, you must specify the <code>Ipv6Addresses.N</code> or <code>Ipv6AddressCount</code> parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1234:1a00::****</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The number of IPv6 addresses to randomly generate for the ENI. Valid values: 1 to 10.</p>
     * <blockquote>
     * <p> To assign IPv6 addresses to the ENI, you must specify the <code>Ipv6Addresses.N</code> or <code>Ipv6AddressCount</code> parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>IPv6 prefixes to assign to the ENI. Valid values of N: 1 to 10.</p>
     * <blockquote>
     * <p> To assign IPv6 prefixes to the ENI, you must specify the Ipv6Prefix.N or Ipv6PrefixCount parameter, but not both.</p>
     * </blockquote>
     */
    @NameInMap("Ipv6Prefix")
    public java.util.List<String> ipv6Prefix;

    /**
     * <p>The number of IPv6 prefixes to assign to the ENI. Valid values: 1 to 10.</p>
     * <blockquote>
     * <p> To assign IPv6 prefixes to the ENI, you must specify the Ipv6Prefix.N or Ipv6PrefixCount parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("Ipv6PrefixCount")
    public Integer ipv6PrefixCount;

    /**
     * <p>The name of the ENI. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * <p>This parameter is left empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>testNetworkInterfaceName</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The communication settings of the ENI.</p>
     */
    @NameInMap("NetworkInterfaceTrafficConfig")
    public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    /**
     * <p>The communication mode of the ENI. Valid values:</p>
     * <ul>
     * <li>Standard: uses the TCP communication mode.</li>
     * <li>HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</li>
     * </ul>
     * <blockquote>
     * <p> ENIs in RDMA mode can be attached only to instances of the instance types that support ERIs. The number of ENIs in RDMA mode that are attached to an instance cannot exceed the maximum number of ENIs that the instance type supports. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of ECS instance families</a> and <a href="https://help.aliyun.com/document_detail/336853.html">Configure eRDMA on an enterprise-level instance</a>.</p>
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
     * <p>The primary private IP address of the ENI.</p>
     * <p>The specified IP address must be an idle IP address within the CIDR block of the vSwitch. If you do not specify this parameter, a random idle IP address within the vSwitch CIDR block is assigned to the ENI.</p>
     * 
     * <strong>example:</strong>
     * <p><code>172.17.**.**</code></p>
     */
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    /**
     * <p>Secondary private IP addresses to assign to the ENI. The IP addresses must be idle IP addresses in the CIDR block of the vSwitch with which to associate the ENI. Valid values of N: 0 to 10.</p>
     * <blockquote>
     * <p> To assign secondary private IP addresses to the ENI, you can specify the <code>PrivateIpAddress.N</code> or <code>SecondaryPrivateIpAddressCount</code> parameter, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><code>172.17.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    /**
     * <p>The number of queues supported by the ENI. Valid values: 1 to 2048.</p>
     * <p>When you attach the ENI to an instance, make sure that the value of this parameter is less than the maximum number of queues per ENI that is allowed for the instance type. To view the maximum number of queues per ENI allowed for an instance type, you can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and then check the return value of <code>MaximumQueueNumberPerEni</code>.</p>
     * <p>This parameter is left empty by default. If you do not specify this parameter, the default number of queues per ENI for the instance type of an instance is used when you attach the ENI to the instance. To view the default number of queues per ENI for an instance type, you can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and then check the return value of <code>SecondaryEniQueueNumber</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>The number of queue pair (QP) queues supported by the elastic RDMA interface (ERI).</p>
     * <p>If you want to attach multiple ERIs to an instance, we recommend that you specify QueuePairNumber for each ERI based on the value of <code>QueuePairNumber</code> supported by the instance type and the number of ERIs that you want to use. Make sure that the total number of QP queues of all ERIs does not exceed the maximum number of QP queues supported by the instance type. For information about the maximum number of QP queues supported by an instance type, see <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a>.</p>
     * <blockquote>
     * <p> If you do not specify QueuePairNumber for an ERI, the maximum number of QP queues supported by the instance type may be used as the number of QP queues supported by the ERI. In this case, you cannot attach an additional ERI to the instance. However, you can attach other types of ENIs to the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    /**
     * <p>The region in which to create the ENI. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which you want to assign the ENI. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the most recent resource group list.</p>
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
     * <p>The receive (Rx) queue depth of the ENI.</p>
     * <p>When you specify this parameter, take note of the following items:</p>
     * <ul>
     * <li>The Rx queue depth of an ENI must be the same as the Tx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</li>
     * <li>A larger Rx queue depth yields higher inbound throughput but consumes more memory.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("RxQueueSize")
    public Integer rxQueueSize;

    /**
     * <p>The number of private IP addresses to be assigned by ECS. Valid values: 1 to 49.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SecondaryPrivateIpAddressCount")
    public Integer secondaryPrivateIpAddressCount;

    /**
     * <p>The ID of the security group to which to assign the ENI. The security group and the ENI must belong to the same VPC.</p>
     * <blockquote>
     * <p>You must specify <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code> but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1fg655nh68xyz9i****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of security groups to which to assign the ENI. The security groups and the ENI must belong to the same VPC. The valid values of N are determined based on the maximum number of security groups to which an ENI can be assigned. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * <blockquote>
     * <p> You must specify <code>SecurityGroupId</code> or <code>SecurityGroupIds.N</code> but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1fg655nh68xyz9i****</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <blockquote>
     * <p> This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SourceDestCheck")
    public Boolean sourceDestCheck;

    /**
     * <p>The tags to add to the ENI.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNetworkInterfaceRequestTag> tag;

    /**
     * <p>The transmit (Tx) queue depth of the ENI.</p>
     * <p>When you specify this parameter, take note of the following items:</p>
     * <ul>
     * <li>The Tx queue depth of an ENI must be the same as the Rx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</li>
     * <li>A larger Tx queue depth yields higher outbound throughput but consumes more memory.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("TxQueueSize")
    public Integer txQueueSize;

    /**
     * <p>The ID of the vSwitch to which to connect the ENI. Private IP addresses are assigned to the ENI from within the CIDR block of the vSwitch.</p>
     * <blockquote>
     * <p> A secondary ENI can be attached to only an instance that is in the same zone as the ENI. The instance and the ENI can be connected to different vSwitches.</p>
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
     * <p>This parameter is no longer used.</p>
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
         * <p>The timeout period for TCP connections in the TIME_WAIT or CLOSE_WAIT state. Unit: seconds. Valid values: integers from 3 to 15.</p>
         * <p>Default value: 3.</p>
         * <blockquote>
         * <p> If the associated Elastic Compute Service (ECS) instance is used with a Network Load Balancer (NLB) or Classic Load Balancer (CLB) instance, the default timeout period for TCP connections in the <code>TIME_WAIT</code> state is 15 seconds.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TcpClosedAndTimeWaitTimeout")
        public Integer tcpClosedAndTimeWaitTimeout;

        /**
         * <p>The timeout period for TCP connections in the ESTABLISHED state. Unit: seconds. Valid values: 30, 60, 80, 100, 200, 300, 500, 700, and 910.</p>
         * <p>Default value: 910.</p>
         * 
         * <strong>example:</strong>
         * <p>910</p>
         */
        @NameInMap("TcpEstablishedTimeout")
        public Integer tcpEstablishedTimeout;

        /**
         * <p>The timeout period for UDP flows. Unit: seconds. Valid values: 10, 20, 30, 60, 80, and 100.</p>
         * <p>Default value: 30.</p>
         * <blockquote>
         * <p> If the associated ECS instance is used with an NLB or CLB instance, the default timeout period for UDP flows is 100 seconds.</p>
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
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRss")
        public Boolean enableRss;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSriov")
        public Boolean enableSriov;

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

    }

    public static class CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig extends TeaModel {
        /**
         * <p>The communication mode of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        /**
         * <p>The number of queues supported by the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueueNumber")
        public Integer queueNumber;

        /**
         * <p>The number of queues supported by the ERI.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        /**
         * <p>The Rx queue depth of the ENI.</p>
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

        /**
         * <p>The Tx queue depth of the ENI.</p>
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
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
         * <p>The key of tag N to add to the ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the ENI. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
