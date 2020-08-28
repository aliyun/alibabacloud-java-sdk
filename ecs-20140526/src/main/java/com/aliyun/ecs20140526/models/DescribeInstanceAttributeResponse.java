// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    public String zoneId;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("Cpu")
    @Validation(required = true)
    public Integer cpu;

    @NameInMap("Memory")
    @Validation(required = true)
    public Integer memory;

    @NameInMap("HostName")
    @Validation(required = true)
    public String hostName;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("InternetChargeType")
    @Validation(required = true)
    public String internetChargeType;

    @NameInMap("InternetMaxBandwidthIn")
    @Validation(required = true)
    public Integer internetMaxBandwidthIn;

    @NameInMap("InternetMaxBandwidthOut")
    @Validation(required = true)
    public Integer internetMaxBandwidthOut;

    @NameInMap("VlanId")
    @Validation(required = true)
    public String vlanId;

    @NameInMap("SerialNumber")
    @Validation(required = true)
    public String serialNumber;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("InstanceNetworkType")
    @Validation(required = true)
    public String instanceNetworkType;

    @NameInMap("IoOptimized")
    @Validation(required = true)
    public String ioOptimized;

    @NameInMap("InstanceChargeType")
    @Validation(required = true)
    public String instanceChargeType;

    @NameInMap("ExpiredTime")
    @Validation(required = true)
    public String expiredTime;

    @NameInMap("StoppedMode")
    @Validation(required = true)
    public String stoppedMode;

    @NameInMap("CreditSpecification")
    @Validation(required = true)
    public String creditSpecification;

    @NameInMap("OperationLocks")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseOperationLocks operationLocks;

    @NameInMap("VpcAttributes")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseVpcAttributes vpcAttributes;

    @NameInMap("EipAddress")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseEipAddress eipAddress;

    @NameInMap("DedicatedHostAttribute")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseDedicatedHostAttribute dedicatedHostAttribute;

    @NameInMap("SecurityGroupIds")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseSecurityGroupIds securityGroupIds;

    @NameInMap("PublicIpAddress")
    @Validation(required = true)
    public DescribeInstanceAttributeResponsePublicIpAddress publicIpAddress;

    @NameInMap("InnerIpAddress")
    @Validation(required = true)
    public DescribeInstanceAttributeResponseInnerIpAddress innerIpAddress;

    public static DescribeInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAttributeResponse self = new DescribeInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstanceAttributeResponseOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeInstanceAttributeResponseOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseOperationLocksLockReason self = new DescribeInstanceAttributeResponseOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceAttributeResponseOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public java.util.List<DescribeInstanceAttributeResponseOperationLocksLockReason> lockReason;

        public static DescribeInstanceAttributeResponseOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseOperationLocks self = new DescribeInstanceAttributeResponseOperationLocks();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress self = new DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceAttributeResponseVpcAttributes extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("NatIpAddress")
        @Validation(required = true)
        public String natIpAddress;

        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public DescribeInstanceAttributeResponseVpcAttributesPrivateIpAddress privateIpAddress;

        public static DescribeInstanceAttributeResponseVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseVpcAttributes self = new DescribeInstanceAttributeResponseVpcAttributes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceAttributeResponseEipAddress extends TeaModel {
        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        public static DescribeInstanceAttributeResponseEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseEipAddress self = new DescribeInstanceAttributeResponseEipAddress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceAttributeResponseDedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public String dedicatedHostId;

        @NameInMap("DedicatedHostName")
        @Validation(required = true)
        public String dedicatedHostName;

        public static DescribeInstanceAttributeResponseDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseDedicatedHostAttribute self = new DescribeInstanceAttributeResponseDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceAttributeResponseSecurityGroupIds extends TeaModel {
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static DescribeInstanceAttributeResponseSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseSecurityGroupIds self = new DescribeInstanceAttributeResponseSecurityGroupIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceAttributeResponsePublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponsePublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponsePublicIpAddress self = new DescribeInstanceAttributeResponsePublicIpAddress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstanceAttributeResponseInnerIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstanceAttributeResponseInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAttributeResponseInnerIpAddress self = new DescribeInstanceAttributeResponseInnerIpAddress();
            return TeaModel.build(map, self);
        }

    }

}
