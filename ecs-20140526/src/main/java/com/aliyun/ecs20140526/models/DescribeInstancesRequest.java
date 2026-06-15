// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeInstancesRequestFilter> filter;

    /**
     * <p>The list of additional instance attributes.</p>
     * 
     * <strong>example:</strong>
     * <p>META_OPTIONS</p>
     */
    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeviceAvailable")
    public Boolean deviceAvailable;

    /**
     * <p>Specifies whether to perform only a dry run for the request. Valid values:</p>
     * <ul>
     * <li><p>true: Only checks the request without querying resources. Checks include AccessKey validity, RAM user permissions, and required parameters. If the check fails, an error is returned. If the check passes, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p>false: Sends a normal request. After passing the checks, a 2XX HTTP status code is returned and resources are queried.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The Elastic IP addresses of instances. This parameter takes effect only when InstanceNetworkType=vpc. Specify multiple IP addresses as a JSON array. You can specify up to 100 IP addresses. Separate IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;42.1.1.<strong>&quot;, &quot;42.1.2.</strong>&quot;, … &quot;42.1.10.**&quot;]</p>
     */
    @NameInMap("EipAddresses")
    public String eipAddresses;

    /**
     * <p>The ID of the HPC cluster to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>hpc-bp67acfmxazb4p****</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>Specifies whether to enable access to instance metadata. Valid values:</p>
     * <ul>
     * <li><p>enabled: enabled.</p>
     * </li>
     * <li><p>disabled: disabled.</p>
     * </li>
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
     * <p>Specifies whether to enforce the use of IMDSv2 when accessing instance metadata. Valid values:</p>
     * <ul>
     * <li><p>optional: does not enforce IMDSv2.</p>
     * </li>
     * <li><p>required: enforces IMDSv2. After this value is set, instance metadata cannot be accessed in standard mode.</p>
     * </li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about instance metadata access modes, see <a href="https://help.aliyun.com/document_detail/150575.html">Instance metadata access modes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>optional</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp67acfmxazb4p****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The private IP addresses of instances in the classic network. This parameter takes effect only when InstanceNetworkType=classic. Specify multiple IP addresses as a JSON array. You can specify up to 100 IP addresses. Separate IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;10.1.1.1&quot;, &quot;10.1.2.1&quot;, … &quot;10.1.10.1&quot;]</p>
     */
    @NameInMap("InnerIpAddresses")
    public String innerIpAddresses;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><p>PostPaid: pay-as-you-go.</p>
     * </li>
     * <li><p>PrePaid: subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The IDs of instances. Specify multiple instance IDs as a JSON array. You can specify up to 100 IDs. Separate IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp67acfmxazb4p****&quot;, &quot;i-bp67acfmxazb4p****&quot;, … &quot;i-bp67acfmxazb4p****&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The name of the instance. You can use the wildcard character \* for fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><p>classic: classic network.</p>
     * </li>
     * <li><p>vpc: Virtual Private Cloud (VPC).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance family.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g5</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The billing method for public bandwidth. Valid values:</p>
     * <ul>
     * <li><p>PayByBandwidth: pay-by-bandwidth.</p>
     * </li>
     * <li><p>PayByTraffic: pay-by-data-transfer.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>In <strong>pay-by-data-transfer</strong> mode, both inbound and outbound peak bandwidth represent upper limits and are not guaranteed service levels. During resource contention, peak bandwidth may be limited. If your business requires guaranteed bandwidth, use <strong>pay-by-bandwidth</strong> mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>Indicates whether the instance is I/O optimized. Valid values:</p>
     * <ul>
     * <li><p>true: yes.</p>
     * </li>
     * <li><p>false: no.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IoOptimized")
    public Boolean ioOptimized;

    /**
     * <p>The IPv6 addresses assigned to the ENI.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The name of the SSH key pair used by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>KeyPairNameTest</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The reason why the resource is locked. Valid values:</p>
     * <ul>
     * <li><p>financial: The instance is locked due to overdue payment.</p>
     * </li>
     * <li><p>security: The instance is locked for security reasons.</p>
     * </li>
     * <li><p>Recycling: The spot instance is locked and pending release.</p>
     * </li>
     * <li><p>dedicatedhostfinancial: The ECS instance is locked because the dedicated host has an overdue payment.</p>
     * </li>
     * <li><p>refunded: The instance is locked due to a refund.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>security</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li><p>If you do not specify this parameter or specify a value less than 10, the default value is 10.</p>
     * </li>
     * <li><p>If you specify a value greater than 100, the default value is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedSaleCycle")
    public Boolean needSaleCycle;

    /**
     * <p>The pagination token. Set this parameter to the <code>NextToken</code> value returned in the last API call.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <blockquote>
     * <p>This parameter will be deprecated. We recommend that you use NextToken and MaxResults to perform paged queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter will be deprecated. We recommend that you use NextToken and MaxResults to perform paged queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The private IP addresses of instances in a VPC. This parameter takes effect only when InstanceNetworkType=vpc. Specify multiple IP addresses as a JSON array. You can specify up to 100 IP addresses. Separate IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;172.16.1.1&quot;, &quot;172.16.2.1&quot;, … &quot;172.16.10.1&quot;]</p>
     */
    @NameInMap("PrivateIpAddresses")
    public String privateIpAddresses;

    /**
     * <p>The public IP addresses of instances. Specify multiple IP addresses as a JSON array. You can specify up to 100 IP addresses. Separate IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;42.1.1.<strong>&quot;, &quot;42.1.2.</strong>&quot;, … &quot;42.1.10.**&quot;]</p>
     */
    @NameInMap("PublicIpAddresses")
    public String publicIpAddresses;

    /**
     * <p>The RDMA IP address of the HPC instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.102</p>
     */
    @NameInMap("RdmaIpAddresses")
    public String rdmaIpAddresses;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.</p>
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
     * <p>The security group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li><p>Pending: The instance is being created.</p>
     * </li>
     * <li><p>Running: The instance is running.</p>
     * </li>
     * <li><p>Starting: The instance is starting.</p>
     * </li>
     * <li><p>Stopping: The instance is stopping.</p>
     * </li>
     * <li><p>Stopped: The instance is stopped.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInstancesRequestTag> tag;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp67acfmxazb4p****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the Virtual Private Cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>v-bp67acfmxazb4p****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setFilter(java.util.List<DescribeInstancesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeInstancesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeInstancesRequest setAdditionalAttributes(java.util.List<String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }
    public java.util.List<String> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public DescribeInstancesRequest setDeviceAvailable(Boolean deviceAvailable) {
        this.deviceAvailable = deviceAvailable;
        return this;
    }
    public Boolean getDeviceAvailable() {
        return this.deviceAvailable;
    }

    public DescribeInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeInstancesRequest setEipAddresses(String eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public String getEipAddresses() {
        return this.eipAddresses;
    }

    public DescribeInstancesRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public DescribeInstancesRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public DescribeInstancesRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public DescribeInstancesRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public DescribeInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeInstancesRequest setInnerIpAddresses(String innerIpAddresses) {
        this.innerIpAddresses = innerIpAddresses;
        return this;
    }
    public String getInnerIpAddresses() {
        return this.innerIpAddresses;
    }

    public DescribeInstancesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstancesRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstancesRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeInstancesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeInstancesRequest setIoOptimized(Boolean ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public Boolean getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeInstancesRequest setIpv6Address(java.util.List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }
    public java.util.List<String> getIpv6Address() {
        return this.ipv6Address;
    }

    public DescribeInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DescribeInstancesRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstancesRequest setNeedSaleCycle(Boolean needSaleCycle) {
        this.needSaleCycle = needSaleCycle;
        return this;
    }
    public Boolean getNeedSaleCycle() {
        return this.needSaleCycle;
    }

    public DescribeInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setPrivateIpAddresses(String privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }
    public String getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    public DescribeInstancesRequest setPublicIpAddresses(String publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }
    public String getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public DescribeInstancesRequest setRdmaIpAddresses(String rdmaIpAddresses) {
        this.rdmaIpAddresses = rdmaIpAddresses;
        return this;
    }
    public String getRdmaIpAddresses() {
        return this.rdmaIpAddresses;
    }

    public DescribeInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInstancesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstancesRequest setTag(java.util.List<DescribeInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeInstancesRequestFilter extends TeaModel {
        /**
         * <p>The filter key used to query resources. Set this parameter to <code>CreationStartTime</code>. When you set both <code>Filter.1.Key</code> and <code>Filter.1.Value</code>, you can query resources created after the specified point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value used to query resources. You must also specify the <code>Filter.1.Key</code> parameter when you specify this parameter. The value must be in the format <code>yyyy-MM-ddTHH:mmZ</code> (UTC+0).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-05T22:40Z</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestFilter self = new DescribeInstancesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <blockquote>
         * <p>To improve compatibility, we recommend that you use the <code>Tag.N.Key</code> parameter instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestTag self = new DescribeInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
