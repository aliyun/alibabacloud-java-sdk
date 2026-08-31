// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesRequest extends TeaModel {
    /**
     * <p>The instance ID of the instance to which the network interface controller (NIC) is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1e2l6djkndyuli****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IPv6 address of the network interface controller (NIC). N indicates that you can specify multiple IPv6 addresses. Valid values of N: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:4321:180:1701:94c7:bc38:3bfa:****</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The maximum number of entries per page for paging. Valid values: 10 to 500.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If you do not set this parameter or set it to a value less than 10, the default value is 10.</li>
     * <li>If you set this parameter to a value greater than 500, the default value is 500.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The network interface controller (NIC) ID. Valid values of N: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-bp125p95hhdhn3ot****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public java.util.List<String> networkInterfaceId;

    /**
     * <p>The name of the network interface controller (NIC). The name must be 2 to 128 characters in length and can contain characters from the Unicode letter categorization (which includes English letters, Chinese characters, and digits). The name can contain colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test-eni-name</p>
     */
    @NameInMap("NetworkInterfaceName")
    public String networkInterfaceName;

    /**
     * <p>The pagination token. Set this parameter to the <code>NextToken</code> value returned in the previous API call.</p>
     * <p>For information about how to view the returned data, refer to the operation description above.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <blockquote>
     * <p>This parameter is deprecated. Use the MaxResults and NextToken parameters for pagination.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    @Deprecated
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter is deprecated. Use the MaxResults and NextToken parameters for pagination.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    @Deprecated
    public Integer pageSize;

    /**
     * <p>The primary private IP address of the network interface controller (NIC).</p>
     * 
     * <strong>example:</strong>
     * <p><code>192.168.**.**</code></p>
     */
    @NameInMap("PrimaryIpAddress")
    public String primaryIpAddress;

    /**
     * <p>The secondary private IP address of the network interface controller (NIC). Valid values of N: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p><code>192.168.**.**</code></p>
     */
    @NameInMap("PrivateIpAddress")
    public java.util.List<String> privateIpAddress;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. If you use this parameter to filter resources, the resource count cannot exceed 1,000.</p>
     * <blockquote>
     * <p>Filtering by the default resource group is not supported.</p>
     * </blockquote>
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
     * <p>The security group ID of the secondary ENI.</p>
     * <ul>
     * <li>To query information about a secondary ENI by security group ID, specify this parameter.</li>
     * <li>To query information about a primary ENI by security group ID, call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> and specify the <code>SecurityGroupId</code> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp144yr32sx6ndw****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>Indicates whether the user of the network interface controller (NIC) is an Alibaba Cloud service or a Virtual Network Operator (VNO).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The status of the network interface controller (NIC). Valid values:</p>
     * <ul>
     * <li>Available: available.</li>
     * <li>Attaching: being attached.</li>
     * <li>InUse: attached.</li>
     * <li>Detaching: being detached.</li>
     * <li>Deleting: being deleted.</li>
     * </ul>
     * <p>Default value: null, which indicates that all statuses are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeNetworkInterfacesRequestTag> tag;

    /**
     * <p>The type of the Elastic Network Interface (ENI). Valid values:</p>
     * <ul>
     * <li>Primary: primary network interface controller (NIC).</li>
     * <li>Secondary: secondary ENI.</li>
     * </ul>
     * <p>Default value: null, which indicates that all types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Secondary</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The vSwitch ID of the network interface controller (NIC).</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp16usj2p27htro3****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual private cloud (VPC) ID of the network interface controller (NIC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1j7w3gc1cexjqd****</p>
     */
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

    @Deprecated
    public DescribeNetworkInterfacesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    @Deprecated
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
        /**
         * <p>The tag key of the network interface controller (NIC). Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the network interface controller (NIC). Valid values of N: 1 to 20.</p>
         * <p>If you use a single tag to filter resources, the resource count with the specified tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources that are attached to all specified tags cannot exceed 1,000. If the resource count exceeds 1,000, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
