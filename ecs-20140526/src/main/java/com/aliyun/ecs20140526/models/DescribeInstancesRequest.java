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
    @Validation(required = true)
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

    public static class DescribeInstancesRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeInstancesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestFilter self = new DescribeInstancesRequestFilter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesRequestTag extends TeaModel {
        @NameInMap("value")
        @Validation(required = true)
        public String value;

        @NameInMap("key")
        @Validation(required = true)
        public String key;

        public static DescribeInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestTag self = new DescribeInstancesRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
