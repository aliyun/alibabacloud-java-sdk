// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>> This parameter is no longer used.</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionTrackingConfiguration")
    public CreateNetworkInterfaceRequestConnectionTrackingConfiguration connectionTrackingConfiguration;

    /**
     * <p>Specifies whether to release the ENI when the associated instance is released. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("DeleteOnRelease")
    public Boolean deleteOnRelease;

    /**
     * <p>The description of the ENI. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of the ENI. Valid values:</p>
     * <br>
     * <p>*   Secondary: secondary ENI.</p>
     * <p>*   Trunk: trunk ENI. This value is in invitational preview.</p>
     * <br>
     * <p>Default value: Secondary.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>IPv4 prefixes to assign to the ENI. Valid values of N: 1 to 10.</p>
     * <br>
     * <p>>  To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
     */
    @NameInMap("Ipv4Prefix")
    public java.util.List<String> ipv4Prefix;

    /**
     * <p>The number of IPv4 prefixes to assign to the ENI. Valid values: 1 to 10.</p>
     * <br>
     * <p>>  To assign IPv4 prefixes to the ENI, you must specify the Ipv4Prefix.N or Ipv4PrefixCount parameter, but not both.</p>
     */
    @NameInMap("Ipv4PrefixCount")
    public Integer ipv4PrefixCount;

    /**
     * <p>IPv6 addresses to assign to the ENI. Valid values of N: 1 to 10.</p>
     * <br>
     * <p>Example: Ipv6Address.1=2001:db8:1234:1a00::\\*\\*\\*\\*</p>
     * <br>
     * <p>>  To assign IPv6 addresses to the ENI, you must specify the `Ipv6Addresses.N` or `Ipv6AddressCount` parameter, but not both.</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The number of IPv6 addresses to randomly generate for the ENI. Valid values: 1 to 10.</p>
     * <br>
     * <p>>  To assign IPv6 addresses to the ENI, you must specify the `Ipv6Addresses.N` or `Ipv6AddressCount` parameter, but not both.</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>IPv6 prefixes to assign to the ENI. Valid values of N: 1 to 10.</p>
     * <br>
     * <p>>  To assign IPv6 prefixes to the ENI, you must specify the Ipv6Prefix.N or Ipv6PrefixCount parameter, but not both.</p>
     */
    @NameInMap("Ipv6Prefix")
    public java.util.List<String> ipv6Prefix;

    /**
     * <p>The number of IPv6 prefixes to assign to the ENI. Valid values: 1 to 10.</p>
     * <br>
     * <p>>  To assign IPv6 prefixes to the ENI, you must specify the Ipv6Prefix.N or Ipv6PrefixCount parameter, but not both.</p>
     */
    @NameInMap("Ipv6PrefixCount")
    public Integer ipv6PrefixCount;

    /**
     * <p>The name of the ENI. The name must be 2 to 128 characters in length, and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    @NameInMap("NetworkInterfaceTrafficConfig")
    public CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig networkInterfaceTrafficConfig;

    /**
     * <p>The communication mode of the ENI. Valid values:</p>
     * <br>
     * <p>*   Standard: uses the TCP communication mode.</p>
     * <p>*   HighPerformance: uses the remote direct memory access (RDMA) communication mode with Elastic RDMA Interface (ERI) enabled.</p>
     * <br>
     * <p>>  ENIs in RDMA mode can be attached only to instances of the instance types that support ERIs. The number of ENIs in RDMA mode that are attached to an instance cannot exceed the maximum number of ENIs that the instance type supports. For more information, see [Overview of ECS instance families](https://help.aliyun.com/document_detail/25378.html) and [Configure eRDMA on an enterprise-level instance](https://help.aliyun.com/document_detail/336853.html).</p>
     * <br>
     * <p>Default value: Standard.</p>
     */
    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The primary private IP address of the ENI.</p>
     * <br>
     * <p>The specified IP address must be an idle IP address within the CIDR block of the vSwitch with which to associate the ENI. If this parameter is not specified, an idle IP address is assigned from within the vSwitch CIDR block at random.</p>
     */
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    /**
     * <p>Secondary private IP addresses to assign to the ENI. The IP addresses must be idle IP addresses in the CIDR block of the vSwitch with which to associate the ENI. Valid values of N: 0 to 10.</p>
     * <br>
     * <p>>  To assign secondary private IP addresses to the ENI, you can specify the `PrivateIpAddress.N` or `SecondaryPrivateIpAddressCount` parameter, but not both.</p>
     */
    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    /**
     * <p>The number of queues supported by the ENI. Valid values: 1 to 2048.</p>
     * <br>
     * <p>When you attach the ENI to an instance, make sure that the value of this parameter is less than the maximum number of queues per ENI that is allowed for the instance type. To view the maximum number of queues per ENI allowed for an instance type, you can call the [DescribeInstanceTypes](https://help.aliyun.com/document_detail/25620.html) operation and then check the return value of `MaximumQueueNumberPerEni`.</p>
     * <br>
     * <p>This parameter is left empty by default. If you do not specify this parameter, the default number of queues per ENI for the instance type of an instance is used when you attach the ENI to the instance. To view the default number of queues per ENI for an instance type, you can call the [DescribeInstanceTypes](https://help.aliyun.com/document_detail/25620.html) operation and then check the return value of `SecondaryEniQueueNumber`.</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>> This parameter is in invitational preview and is not publicly available.</p>
     */
    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which you want to assign the ENI. You can call the [ListResourceGroups](https://help.aliyun.com/document_detail/158855.html) operation to query the most recent resource group list.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The receive (Rx) queue depth of the ENI.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   The Rx queue depth of an ENI must be the same as the Tx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</p>
     * <p>*   A larger Rx queue depth yields higher inbound throughput but consumes more memory.</p>
     */
    @NameInMap("RxQueueSize")
    public Integer rxQueueSize;

    /**
     * <p>The number of private IP addresses to be assigned by ECS. Valid values: 1 to 49.</p>
     */
    @NameInMap("SecondaryPrivateIpAddressCount")
    public Integer secondaryPrivateIpAddressCount;

    /**
     * <p>The ID of the security group to which to assign the ENI. The security group and the ENI must belong to the same VPC.</p>
     * <br>
     * <p>> You must specify `SecurityGroupId` or `SecurityGroupIds.N` but not both.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of security group N to which to assign the ENI. The security group and the ENI must belong to the same VPC. The valid values of N are determined based on the maximum number of security groups to which an ENI can be assigned. For more information, see [Limits](https://help.aliyun.com/document_detail/25412.html).</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>You must specify **SecurityGroupId** or SecurityGroupIds.N but not both.````</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The tags to add to the ENI.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNetworkInterfaceRequestTag> tag;

    /**
     * <p>The transmit (Tx) queue depth of the ENI.</p>
     * <br>
     * <p>Take note of the following items:</p>
     * <br>
     * <p>*   The Tx queue depth of an ENI must be the same as the Rx queue depth of the ENI. Valid values: powers of 2 in the range of 8192 to 16384.</p>
     * <p>*   A larger Tx queue depth yields higher outbound throughput but consumes more memory.</p>
     */
    @NameInMap("TxQueueSize")
    public Integer txQueueSize;

    /**
     * <p>The ID of the vSwitch with which to associate the ENI. Private IP addresses are assigned to the ENI from within the CIDR block of the vSwitch.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>> This parameter is no longer used.</p>
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
        @NameInMap("TcpClosedAndTimeWaitTimeout")
        public Integer tcpClosedAndTimeWaitTimeout;

        @NameInMap("TcpEstablishedTimeout")
        public Integer tcpEstablishedTimeout;

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

    public static class CreateNetworkInterfaceRequestNetworkInterfaceTrafficConfig extends TeaModel {
        @NameInMap("NetworkInterfaceTrafficMode")
        public String networkInterfaceTrafficMode;

        @NameInMap("QueueNumber")
        public Integer queueNumber;

        @NameInMap("QueuePairNumber")
        public Integer queuePairNumber;

        @NameInMap("RxQueueSize")
        public Integer rxQueueSize;

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
         * <p>The key of tag N to add to the ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the ENI. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with acs: or contain `http://` or `https://`.</p>
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
