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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique across requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the ENI. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>> This parameter is no longer used.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
     */
    @NameInMap("Ipv4Prefix")
    public java.util.List<String> ipv4Prefix;

    /**
     * <p>> This parameter is in invitational preview and is unavailable to general users.</p>
     */
    @NameInMap("Ipv4PrefixCount")
    public Integer ipv4PrefixCount;

    /**
     * <p>The IPv6 addresses to assign to the ENI. You can specify up to 10 IPv6 addresses. Valid values of N: 1 to 10.</p>
     * <br>
     * <p>Example: Ipv6Address.1=2001:db8:1234:1a00::\*\*\*\*</p>
     * <br>
     * <p>> To assign IPv6 addresses to the ENI, you must specify `Ipv6Addresses.N` or `Ipv6AddressCount` but not both.</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The number of IPv6 addresses to generate at random for the ENI. Valid values: 1 to 10.</p>
     * <br>
     * <p>> To assign IPv6 addresses to the ENI, you must specify `Ipv6Addresses.N` or `Ipv6AddressCount` but not both.</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>> This parameter is in invitational preview and is unavailable for general users.</p>
     */
    @NameInMap("Ipv6Prefix")
    public java.util.List<String> ipv6Prefix;

    /**
     * <p>> This parameter is in invitational preview and is unavailable to general users.</p>
     */
    @NameInMap("Ipv6PrefixCount")
    public Integer ipv6PrefixCount;

    /**
     * <p>The name of the ENI. The name must be 2 to 128 characters in length, It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (.), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The communication mode of the ENI. Valid values:</p>
     * <br>
     * <p>*   Standard: The TCP communication mode is used.</p>
     * <p>*   HighPerformance: Elastic RDMA Interface (ERI) is enabled and the remote direct memory access (RDMA) communication mode is used.</p>
     * <br>
     * <p>> HighPerformance supports only the c7re RDMA-enhanced instance family. The maximum number of ENIs in the RDMA mode that can be attached to a c7re instance is determined by the instance type. The c7re instance family is in invitational preview in Beijing Zone K. For more information, see [Instance families](~~25378~~).</p>
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
     * <p>The primary private IP address to assign to the ENI.</p>
     * <br>
     * <p>The specified IP address must be an idle IP address within the CIDR block of the vSwitch with which to associate the ENI. If this parameter is not specified, an idle IP address is randomly assigned from within the CIDR block of the vSwitch.</p>
     */
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    /**
     * <p>Secondary private IP address N to assign to the ENI. The IP address must be an idle IP address within the CIDR block of the vSwitch with which to associate the ENI. Valid values of N: 0 to 10.</p>
     * <br>
     * <p>> To assign secondary private IP addresses to the ENI, you cannot specify both the `PrivateIpAddress.N` and `SecondaryPrivateIpAddressCount` parameters.</p>
     */
    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    /**
     * <p>The number of queues supported by the ENI. Valid values: 1 to 2048.</p>
     * <br>
     * <p>When you attach the ENI to an instance, make sure that the value of this parameter is smaller than the maximum number of queues per ENI allowed for the instance type. To view the maximum number of queues per ENI allowed for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation and then check the `MaximumQueueNumberPerEni` response parameter.</p>
     * <br>
     * <p>This parameter is empty by default. If this parameter is not specified when you attach the ENI to an instance, the default number of queues per ENI for the instance type of this instance is used. To view the default number of queues per ENI for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation and then check the `SecondaryEniQueueNumber` response parameter.</p>
     */
    @NameInMap("QueueNumber")
    public Integer queueNumber;

    /**
     * <p>> This parameter is in invitational preview and is unavailable to general users.</p>
     */
    @NameInMap("QueuePairNumber")
    public Integer queuePairNumber;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the ENI. You can call the [ListResourceGroups](~~158855~~) operation to query the most recent resource group list.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of private IP addresses to be automatically created by ECS.</p>
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
     * <p>The IDs of security groups to which to assign the ENI. The security group and the ENI must belong to the same VPC. The valid values of N are determined by the maximum number of security groups to which an ENI can be assigned. For more information, see [Limits](~~25412~~).</p>
     * <br>
     * <p>> You must specify `SecurityGroupId` or `SecurityGroupIds.N` but not both.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>The tags to add to the ENI.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNetworkInterfaceRequestTag> tag;

    /**
     * <p>The ID of the vSwitch with which to associate the ENI. Private IP addresses are assigned to the ENI from within the CIDR block of the vSwitch.</p>
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
        /**
         * <p>The key of tag N to add to the ENI. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the ENI. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain `http://` or `https://`.</p>
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
