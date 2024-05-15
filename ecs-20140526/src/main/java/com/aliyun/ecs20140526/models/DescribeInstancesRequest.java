// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeInstancesRequestFilter> filter;

    /**
     * <p>The value of attribute N. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    /**
     * <p>>  This parameter is currently in invitational preview and unavailable for general users.</p>
     */
    @NameInMap("DeviceAvailable")
    public Boolean deviceAvailable;

    /**
     * <p>Specifies whether to check the validity of the request without actually making the request. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: The validity of the request is checked but the request is not made. Check items include whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are specified. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</p>
     * <p>*   false: The validity of the request is checked. If the check succeeds, a 2XX HTTP status code is returned and the request is made.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The elastic IP addresses (EIPs) of instances. This parameter is valid when InstanceNetworkType is set to vpc. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,).</p>
     */
    @NameInMap("EipAddresses")
    public String eipAddresses;

    /**
     * <p>The ID of the High Performance Computing (HPC) cluster to which the instance belongs.</p>
     */
    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    /**
     * <p>Specifies whether the access channel is enabled for instance metadata. Valid values:</p>
     * <br>
     * <p>*   enabled</p>
     * <p>*   disabled</p>
     * <br>
     * <p>Default value: enabled.</p>
     * <br>
     * <p>>  For more information about instance metadata, see [Overview of ECS instance metadata](https://help.aliyun.com/document_detail/49122.html).</p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <p>>  This parameter is currently in invitational preview and unavailable for general users.</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether the security hardening mode (IMDSv2) is forcefully used to access instance metadata. Valid values:</p>
     * <br>
     * <p>*   optional: The security hardening mode (IMDSv2) is not forcefully used.</p>
     * <p>*   required: The security hardening mode (IMDSv2) is forcefully used. After you set this parameter to required, you cannot access instance metadata in normal mode.</p>
     * <br>
     * <p>Default value: optional.</p>
     * <br>
     * <p>>  For more information about modes of accessing instance metadata, see [Access mode of instance metadata](https://help.aliyun.com/document_detail/150575.html).</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The internal IP addresses of instances located in the classic network. This parameter is valid when InstanceNetworkType is set to classic. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,).</p>
     */
    @NameInMap("InnerIpAddresses")
    public String innerIpAddresses;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <p>*   PrePaid: subscription</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The IDs of instances. The value can be a JSON array that consists of up to 100 instance IDs. Separate the IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The name of the instance. Fuzzy search with the asterisk (\\*) wildcard characters is supported.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   classic: classic network</p>
     * <p>*   vpc: VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The instance type of the instance.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance family of the instance.</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <br>
     * <p>*   PayByBandwidth: pay-by-bandwidth</p>
     * <p>*   PayByTraffic: pay-by-traffic</p>
     * <br>
     * <p>>  When the **pay-by-traffic** billing method for network usage is used, the maximum inbound and outbound bandwidth values are used as upper limits of bandwidths instead of guaranteed performance specifications. In scenarios where demand outstrips resource supplies, these maximum bandwidth values may not be reached. If you want guaranteed bandwidths for your instances, use the **pay-by-bandwidth** billing method for network usage.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>Specifies whether the instance is I/O optimized.</p>
     */
    @NameInMap("IoOptimized")
    public Boolean ioOptimized;

    /**
     * <p>IPv6 address N of the elastic network interface (ENI). You can specify multiple IPv6 addresses. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("Ipv6Address")
    public java.util.List<String> ipv6Address;

    /**
     * <p>The name of the SSH key pair bound to the instance.</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The reason why the instance is locked. Valid values:</p>
     * <br>
     * <p>*   financial: The instance is locked due to overdue payments.</p>
     * <p>*   security: The instance is locked due to security reasons.</p>
     * <p>*   recycling: The preemptible instance is locked and pending release.</p>
     * <p>*   dedicatedhostfinancial: The instance is locked due to overdue payments for the dedicated host.</p>
     * <p>*   refunded: The instance is locked because a refund is made for the instance.</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <p>Default value:</p>
     * <br>
     * <p>*   If this parameter is not specified or is set to a value smaller than 10, the default value is 10.</p>
     * <p>*   If this parameter is set to a value greater than 100, the default value is 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>>  This parameter is currently in invitational preview and unavailable for general users.</p>
     */
    @NameInMap("NeedSaleCycle")
    public Boolean needSaleCycle;

    /**
     * <p>The query token. Set the value to the `NextToken` value returned in the last call to the DescribeInstances operation.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The private IP addresses of instances located in VPCs. This parameter is valid when InstanceNetworkType is set to vpc. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,).</p>
     */
    @NameInMap("PrivateIpAddresses")
    public String privateIpAddresses;

    /**
     * <p>The public IP addresses of instances. The value can be a JSON array that consists of up to 100 IP addresses. Separate the IP addresses with commas (,).</p>
     */
    @NameInMap("PublicIpAddresses")
    public String publicIpAddresses;

    /**
     * <p>The Remote Direct Memory Access (RDMA) IP address of the HPC instance.</p>
     */
    @NameInMap("RdmaIpAddresses")
    public String rdmaIpAddresses;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     * <br>
     * <p>>  Resources in the default resource group are displayed in the response regardless of how this parameter is set.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group to which the instance belongs.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <br>
     * <p>*   Pending: The instance is being created.</p>
     * <p>*   Running: The instance is running.</p>
     * <p>*   Starting: The instance is being started.</p>
     * <p>*   Stopping: The instance is being stopped.</p>
     * <p>*   Stopped: The instance is stopped.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInstancesRequestTag> tag;

    /**
     * <p>The ID of the vSwitch to which the instance is connected.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the instance belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
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
         * <p>The key of filter 1 used to query resources. Set the value to `CreationStartTime`. You can specify a time by setting both `Filter.1.Key` and `Filter.1.Value` to query resources that were created after the time.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of filter 1 used to query resources. Set the value to a time. If you specify this parameter, you must also specify the `Filter.1.Key` parameter. Specify the time in the `yyyy-MM-ddTHH:mmZ` format. The time must be in UTC.</p>
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
         * <p>The key of tag N of the instance. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](https://help.aliyun.com/document_detail/110425.html) operation.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the instance. Valid values of N: 1 to 20.</p>
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
