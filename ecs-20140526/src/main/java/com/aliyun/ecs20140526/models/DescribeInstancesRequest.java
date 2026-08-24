// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeInstancesRequestFilter> filter;

    /**
     * <p>The list of additional attributes of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>META_OPTIONS</p>
     */
    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeviceAvailable")
    public Boolean deviceAvailable;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks the request for potential issues, including invalid AccessKey pairs, unauthorized RAM users, and missing parameter values. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.  </li>
     * <li>false: sends a normal request, passes the dry run, and returns a 2XX HTTP status code to directly query the resource status.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The elastic IP addresses (EIPs) of instances. This parameter takes effect when InstanceNetworkType is set to vpc. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,).</p>
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
     * <p>Specifies whether the access channel for instance metadata is enabled. Valid values:</p>
     * <ul>
     * <li>enabled: enabled.</li>
     * <li>disabled: disabled.</li>
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
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether the enhanced mode (IMDSv2) is forcefully used to access instance metadata. Valid values:</p>
     * <ul>
     * <li>optional: The enhanced mode (IMDSv2) is not forcefully used.</li>
     * <li>required: The enhanced mode (IMDSv2) is forcefully used. After you set this value, the normal mode cannot be used to access instance metadata.</li>
     * </ul>
     * <p>Default value: optional.</p>
     * <blockquote>
     * <p>For more information about the modes of accessing instance metadata, see <a href="https://help.aliyun.com/document_detail/150575.html">Access mode of instance metadata</a>.</p>
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
     * <p>The internal IP addresses of instances of the classic network type. This parameter takes effect when InstanceNetworkType is set to classic. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,). </p>
     * <blockquote>
     * <ul>
     * <li>The classic network feature has been offline. For details, see <a href="https://help.aliyun.com/document_detail/2833134.html">Offline announcement</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;10.1.1.1&quot;, &quot;10.1.2.1&quot;, … &quot;10.1.10.1&quot;]</p>
     */
    @NameInMap("InnerIpAddresses")
    public String innerIpAddresses;

    /**
     * <p>The billing method of the instance. Valid values: </p>
     * <ul>
     * <li>PostPaid: pay-as-you-go. </li>
     * <li>PrePaid: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The IDs of instances. The value can be a JSON array that consists of up to 100 instance IDs. Separate the instance IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp67acfmxazb4p****&quot;, &quot;i-bp67acfmxazb4p****&quot;, … &quot;i-bp67acfmxazb4p****&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The name of the instance. Fuzzy search with the asterisk (*) wildcard is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li>vpc: VPC.</li>
     * <li>classic: classic network. The classic network is no longer available. For more information, see <a href="https://help.aliyun.com/document_detail/2833134.html">Retirement announcement</a>.</li>
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
     * <p>The public bandwidth billing method. Valid values:</p>
     * <ul>
     * <li>PayByBandwidth: pay-by-bandwidth.</li>
     * <li>PayByTraffic: pay-by-traffic.</li>
     * </ul>
     * <blockquote>
     * <p>In <strong>pay-by-traffic</strong> mode, the peak inbound and outbound bandwidths are used as the upper limits of bandwidths instead of guaranteed performance metrics. When resource contention occurs, the peak bandwidths may be limited. If you want guaranteed bandwidths for your business, use the <strong>pay-by-bandwidth</strong> mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>Specifies whether the instance is I/O optimized. Valid values:</p>
     * <ul>
     * <li>true: The instance is I/O optimized.</li>
     * <li>false: The instance is not I/O optimized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IoOptimized")
    public Boolean ioOptimized;

    /**
     * <p>The IPv6 addresses assigned to the Elastic Network Interface (ENI).</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The name of the SSH key pair bound to the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>KeyPairNameTest</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The reason why the resource is locked. Valid values:</p>
     * <ul>
     * <li><p>financial: ECS instance is locked due to overdue payment.</p>
     * </li>
     * <li><p>security: ECS instance is locked due to security reasons.</p>
     * </li>
     * <li><p>Recycling: The spot instance is locked and pending release.</p>
     * </li>
     * <li><p>dedicatedhostfinancial: ECS instance is locked because the dedicated host has an overdue payment.</p>
     * </li>
     * <li><p>refunded: ECS instance is locked because a refund is made.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>security</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The maximum number of entries per page for a paging query. Maximum value: 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li>If the value is not set or is set to a value less than 10, the default value is 10.</li>
     * <li>If the value is set to a value greater than 100, the default value is 100.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedSaleCycle")
    public Boolean needSaleCycle;

    /**
     * <p>The query token. Set the value to the NextToken value returned in the previous call to this operation.</p>
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
     * <p>This parameter will be deprecated. Use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <blockquote>
     * <p>This parameter will be deprecated. Use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The private IP addresses of instances in a VPC. This parameter takes effect when the network type is set to vpc. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;172.16.1.1&quot;, &quot;172.16.2.1&quot;, … &quot;172.16.10.1&quot;]</p>
     */
    @NameInMap("PrivateIpAddresses")
    public String privateIpAddresses;

    /**
     * <p>The public IP addresses of instances. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;42.1.1.<strong>&quot;, &quot;42.1.2.</strong>&quot;, … &quot;42.1.10.**&quot;]</p>
     */
    @NameInMap("PublicIpAddresses")
    public String publicIpAddresses;

    /**
     * <p>The RDMA IP addresses of the HPC instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.102</p>
     */
    @NameInMap("RdmaIpAddresses")
    public String rdmaIpAddresses;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs. When you use this parameter to filter resources, the resource count cannot exceed 1000.</p>
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
     * <p>The ID of the security group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The instance status. Valid values: </p>
     * <ul>
     * <li>Pending: being created.</li>
     * <li>Running: running.</li>
     * <li>Starting: being started.</li>
     * <li>Stopping: being stopped.</li>
     * <li>Stopped: stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
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
     * <p>The ID of the virtual private cloud (VPC).</p>
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
         * <p>The key of filter 1 used to query resources. Set the value to <code>CreationStartTime</code>. You can specify a time point by setting both <code>Filter.1.Key</code> and <code>Filter.1.Value</code> to query resources that were created after the time point.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of filter 1 used to query resources. You must specify <code>Filter.1.Key</code> when you specify this parameter. Specify the time in the <code>yyyy-MM-ddTHH:mmZ</code> format in UTC+0.</p>
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
         * <p>The tag key of the instance. Valid values of N: 1 to 20.</p>
         * <p>If you use a single tag to filter resources, the resource count with the tag cannot exceed 1000. If you use multiple tags to filter resources, the resource count that are attached with all specified tags cannot exceed 1000. If the resource count exceeds 1000, use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
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
