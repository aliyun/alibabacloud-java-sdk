// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("InnerIpAddresses")
    public String innerIpAddresses;

    @NameInMap("PrivateIpAddresses")
    public String privateIpAddresses;

    @NameInMap("PublicIpAddresses")
    public String publicIpAddresses;

    @NameInMap("EipAddresses")
    public String eipAddresses;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("Status")
    public String status;

    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("Filter")
    public java.util.List<DescribeInstancesRequestFilter> filter;

    @NameInMap("DeviceAvailable")
    public Boolean deviceAvailable;

    @NameInMap("IoOptimized")
    public Boolean ioOptimized;

    @NameInMap("NeedSaleCycle")
    public Boolean needSaleCycle;

    @NameInMap("Tag")
    public java.util.List<DescribeInstancesRequestTag> tag;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("HpcClusterId")
    public String hpcClusterId;

    @NameInMap("RdmaIpAddresses")
    public String rdmaIpAddresses;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("AdditionalAttributes")
    public java.util.List<String> additionalAttributes;

    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    @NameInMap("HttpTokens")
    public String httpTokens;

    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeInstancesRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeInstancesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
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

    public DescribeInstancesRequest setInnerIpAddresses(String innerIpAddresses) {
        this.innerIpAddresses = innerIpAddresses;
        return this;
    }
    public String getInnerIpAddresses() {
        return this.innerIpAddresses;
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

    public DescribeInstancesRequest setEipAddresses(String eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public String getEipAddresses() {
        return this.eipAddresses;
    }

    public DescribeInstancesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeInstancesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribeInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstancesRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeInstancesRequest setFilter(java.util.List<DescribeInstancesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeInstancesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeInstancesRequest setDeviceAvailable(Boolean deviceAvailable) {
        this.deviceAvailable = deviceAvailable;
        return this;
    }
    public Boolean getDeviceAvailable() {
        return this.deviceAvailable;
    }

    public DescribeInstancesRequest setIoOptimized(Boolean ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public Boolean getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeInstancesRequest setNeedSaleCycle(Boolean needSaleCycle) {
        this.needSaleCycle = needSaleCycle;
        return this;
    }
    public Boolean getNeedSaleCycle() {
        return this.needSaleCycle;
    }

    public DescribeInstancesRequest setTag(java.util.List<DescribeInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstancesRequestTag> getTag() {
        return this.tag;
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

    public DescribeInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public DescribeInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesRequest setHpcClusterId(String hpcClusterId) {
        this.hpcClusterId = hpcClusterId;
        return this;
    }
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    public DescribeInstancesRequest setRdmaIpAddresses(String rdmaIpAddresses) {
        this.rdmaIpAddresses = rdmaIpAddresses;
        return this;
    }
    public String getRdmaIpAddresses() {
        return this.rdmaIpAddresses;
    }

    public DescribeInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeInstancesRequest setAdditionalAttributes(java.util.List<String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }
    public java.util.List<String> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public DescribeInstancesRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public DescribeInstancesRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public DescribeInstancesRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public static class DescribeInstancesRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        @NameInMap("value")
        public String value;

        @NameInMap("key")
        public String key;

        public static DescribeInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestTag self = new DescribeInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
