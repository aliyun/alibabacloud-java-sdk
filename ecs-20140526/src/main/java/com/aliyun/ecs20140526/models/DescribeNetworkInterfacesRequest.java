// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesRequest extends TeaModel {
    // The ID of the Elastic Compute Service (ECS) instance to which the ENI is bound.
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    // The maximum number of entries to return on each page. Valid values: 10 to 500.
    // 
    // Default value:
    // 
    // *   If this parameter is not specified or if this parameter is set to a value less than 10, the default value is 10.
    // *   If this parameter is set to a value greater than 500, the default value is 500.
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NetworkInterfaceId")
    public java.util.List<String> networkInterfaceId;

    // The name of the ENI.
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    // The query token. Set the value to the `NextToken` value returned in the last call to the DescribeNetworkInterfaces operation.
    // 
    // For more information about how to check the responses returned by this operation, see the preceding "Description" section.
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // Page start from page 1.
    // 
    // Default value: 1.
    // 
    // >  This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    // 
    // Maximum value: 1,000.
    // 
    // Default value: 10.
    // 
    // >  This parameter will be removed in the future. We recommend that you use the NextToken and MaxResults parameters for a paged query.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The primary private IPv4 address of the ENI.
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    // The region ID of the ENI. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group to which the ENI belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.
    // 
    // >  Resources in the default resource group are displayed in the response regardless of how this parameter is set.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The ID of the security group to which the secondary ENI belongs.
    // 
    // *   To query the details of secondary ENIs based on the ID of a security group, specify this parameter.
    // *   To query the details of primary ENIs based on the ID of a security group, call the [DescribeInstances](~~25506~~) operation and specify the `SecurityGroupId` parameter.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // Specifies whether the user is an Alibaba Cloud service or a distributor.
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    // The state of the ENI. Valid values:
    // 
    // *   Available: The ENI is not bound to an instance.
    // *   Attaching: The ENI is being bound to an instance.
    // *   InUse: The ENI is bound to an instance.
    // *   Detaching: The ENI is being unbound from an instance.
    // *   Deleting: The ENI is being deleted.
    // 
    // This parameter is empty by default, which indicates that ENIs in all states are queried.
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<DescribeNetworkInterfacesRequestTag> tag;

    // The type of the ENI. Valid values:
    // 
    // *   Primary
    // *   Secondary
    // 
    // This parameter is empty by default, which indicates that both primary and secondary ENIs are queried.
    @NameInMap("Type")
    public String type;

    // The ID of the vSwitch to which the ENI is connected.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The ID of the virtual private cloud (VPC) to which the ENI belongs.
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeNetworkInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacesRequest self = new DescribeNetworkInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeNetworkInterfacesRequest setIpv6Address(java.util.List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

    public DescribeNetworkInterfacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNetworkInterfacesRequest setNetworkInterfaceId(java.util.List<String> networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public DescribeNetworkInterfacesRequest setNetworkInterfaceName(String networkInterfaceName) {
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }
    public String getNetworkInterfaceName() {
        return this.networkInterfaceName;
    }

    public DescribeNetworkInterfacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNetworkInterfacesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeNetworkInterfacesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeNetworkInterfacesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkInterfacesRequest setPrimaryIpAddress(String primaryIpAddress) {
        this.primaryIpAddress = primaryIpAddress;
        return this;
    }
    public String getPrimaryIpAddress() {
        return this.primaryIpAddress;
    }

    public DescribeNetworkInterfacesRequest setPrivateIpAddress(java.util.List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public java.util.List<String> getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeNetworkInterfacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeNetworkInterfacesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeNetworkInterfacesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeNetworkInterfacesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeNetworkInterfacesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeNetworkInterfacesRequest setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeNetworkInterfacesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNetworkInterfacesRequest setTag(java.util.List<DescribeNetworkInterfacesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeNetworkInterfacesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeNetworkInterfacesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeNetworkInterfacesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeNetworkInterfacesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeNetworkInterfacesRequestTag extends TeaModel {
        // The key of tag N of the ENI. Valid values of N: 1 to 20.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the ENI. Valid values of N: 1 to 20.
        // 
        // If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.
        @NameInMap("Value")
        public String value;

        public static DescribeNetworkInterfacesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesRequestTag self = new DescribeNetworkInterfacesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNetworkInterfacesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
