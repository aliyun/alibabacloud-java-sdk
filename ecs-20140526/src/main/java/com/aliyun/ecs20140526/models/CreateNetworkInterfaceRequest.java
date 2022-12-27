// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceRequest extends TeaModel {
    // >  This parameter is deprecated.
    @NameInMap("BusinessType")
    public String businessType;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The description of the ENI. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
    // 
    // This parameter is empty by default.
    @NameInMap("Description")
    public String description;

    // >  This parameter is deprecated.
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Ipv4Prefix")
    public java.util.List<String> ipv4Prefix;

    @NameInMap("Ipv4PrefixCount")
    public Integer ipv4PrefixCount;

    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    // The number of IPv6 addresses to generate at random for the ENI. Valid values: 1 to 10.
    // 
    // >  To assign IPv6 addresses to the ENI, you must specify `Ipv6Addresses.N` or `Ipv6AddressCount` but not both.
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    @NameInMap("Ipv6Prefix")
    public java.util.List<String> ipv6Prefix;

    @NameInMap("Ipv6PrefixCount")
    public Integer ipv6PrefixCount;

    // The name of the ENI. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (.), underscores (\_), and hyphens (-).
    // 
    // This parameter is empty by default.
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    // The communication mode of the ENI. Valid values:
    // 
    // *   Standard: uses the TCP communication mode.
    // *   HighPerformance: enables the Elastic RDMA Interface (ERI) and uses the remote direct memory access (RDMA) communication mode.
    // 
    // >  A value of HighPerformance supports only the c7re RDMA-enhanced instance family. The maximum number of ENIs in RDMA mode that can be bound to a c7re instance is determined based on the instance type. The c7re instance family is in invitational preview in Beijing Zone K. For more information, see [Instance families](~~25378~~).
    // 
    // Default value: Standard.
    @NameInMap("NetworkInterfaceTrafficMode")
    public String networkInterfaceTrafficMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The primary private IP address to assign to the ENI.
    // 
    // The specified IP address must be an idle IP address within the CIDR block of the vSwitch with which to associate the ENI. If this parameter is not specified, an idle IP address is assigned from within the vSwitch CIDR block at random.
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    // The number of queues supported by the ENI. Valid values: 1 to 2048.
    // 
    // When you bind an ENI to an instance, make sure that the value of this parameter for the ENI is smaller than the maximum number of queues per ENI allowed for the instance type. To view the maximum number of queues per ENI allowed for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation to query the `MaximumQueueNumberPerEni` parameter.
    // 
    // By default, this parameter is empty. If you do not specify this parameter for the ENI, the default number of queues per ENI for the instance type of an instance is used when you bind the ENI to the instance. To view the default number of queues per ENI for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation to query the `SecondaryEniQueueNumber` parameter.
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    // >  This parameter is in invitational preview and unavailable for general users.
    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    // The ID of the region in which to create the ENI. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which to assign the ENI. You can call the [ListResourceGroups](~~158855~~) operation to query the most recent resource group list.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The number of private IP addresses to be automatically created by ECS.
    @NameInMap("SecondaryPrivateIpAddressCount")
    public Integer secondaryPrivateIpAddressCount;

    // The ID of the security group to which to assign the ENI. The security group and the ENI must belong to the same VPC.
    // 
    // >  You must specify `SecurityGroupId` or `SecurityGroupIds.N` but not both.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    @NameInMap("Tag")
    public java.util.List<CreateNetworkInterfaceRequestTag> tag;

    // The ID of the vSwitch with which to associate the ENI. Private IP addresses are assigned to the ENI from within the CIDR block of the vSwitch.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // >  This parameter is deprecated.
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

    public static class CreateNetworkInterfaceRequestTag extends TeaModel {
        // The key of tag N to add to the ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag N to add to the ENI. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain `http://` or `https://`.
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
