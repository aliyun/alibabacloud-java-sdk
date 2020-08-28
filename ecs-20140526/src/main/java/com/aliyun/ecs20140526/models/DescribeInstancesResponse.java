// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Instances")
    @Validation(required = true)
    public DescribeInstancesResponseInstances instances;

    public static DescribeInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponse self = new DescribeInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        @Validation(required = true)
        public String networkInterfaceId;

        @NameInMap("MacAddress")
        @Validation(required = true)
        public String macAddress;

        @NameInMap("PrimaryIpAddress")
        @Validation(required = true)
        public String primaryIpAddress;

        public static DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface self = new DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceNetworkInterfaces extends TeaModel {
        @NameInMap("NetworkInterface")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstanceNetworkInterfacesNetworkInterface> networkInterface;

        public static DescribeInstancesResponseInstancesInstanceNetworkInterfaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceNetworkInterfaces self = new DescribeInstancesResponseInstancesInstanceNetworkInterfaces();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceOperationLocksLockReason extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        @NameInMap("LockMsg")
        @Validation(required = true)
        public String lockMsg;

        public static DescribeInstancesResponseInstancesInstanceOperationLocksLockReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceOperationLocksLockReason self = new DescribeInstancesResponseInstancesInstanceOperationLocksLockReason();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceOperationLocks extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstanceOperationLocksLockReason> lockReason;

        public static DescribeInstancesResponseInstancesInstanceOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceOperationLocks self = new DescribeInstancesResponseInstancesInstanceOperationLocks();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeInstancesResponseInstancesInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceTagsTag self = new DescribeInstancesResponseInstancesInstanceTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstanceTagsTag> tag;

        public static DescribeInstancesResponseInstancesInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceTags self = new DescribeInstancesResponseInstancesInstanceTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress self = new DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceVpcAttributes extends TeaModel {
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
        public DescribeInstancesResponseInstancesInstanceVpcAttributesPrivateIpAddress privateIpAddress;

        public static DescribeInstancesResponseInstancesInstanceVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceVpcAttributes self = new DescribeInstancesResponseInstancesInstanceVpcAttributes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceEipAddress extends TeaModel {
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

        @NameInMap("IsSupportUnassociate")
        @Validation(required = true)
        public Boolean isSupportUnassociate;

        public static DescribeInstancesResponseInstancesInstanceEipAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceEipAddress self = new DescribeInstancesResponseInstancesInstanceEipAddress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute extends TeaModel {
        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public String dedicatedHostId;

        @NameInMap("DedicatedHostName")
        @Validation(required = true)
        public String dedicatedHostName;

        public static DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute self = new DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr extends TeaModel {
        @NameInMap("CapacityReservationId")
        @Validation(required = true)
        public String capacityReservationId;

        @NameInMap("CapacityReservationPreference")
        @Validation(required = true)
        public String capacityReservationPreference;

        public static DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr self = new DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute extends TeaModel {
        @NameInMap("Tenancy")
        @Validation(required = true)
        public String tenancy;

        @NameInMap("Affinity")
        @Validation(required = true)
        public String affinity;

        public static DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute self = new DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceCpuOptions extends TeaModel {
        @NameInMap("CoreCount")
        @Validation(required = true)
        public Integer coreCount;

        @NameInMap("ThreadsPerCore")
        @Validation(required = true)
        public Integer threadsPerCore;

        @NameInMap("Numa")
        @Validation(required = true)
        public String numa;

        public static DescribeInstancesResponseInstancesInstanceCpuOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceCpuOptions self = new DescribeInstancesResponseInstancesInstanceCpuOptions();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceMetadataOptions extends TeaModel {
        @NameInMap("HttpEndpoint")
        @Validation(required = true)
        public String httpEndpoint;

        @NameInMap("HttpTokens")
        @Validation(required = true)
        public String httpTokens;

        @NameInMap("HttpPutResponseHopLimit")
        @Validation(required = true)
        public Integer httpPutResponseHopLimit;

        public static DescribeInstancesResponseInstancesInstanceMetadataOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceMetadataOptions self = new DescribeInstancesResponseInstancesInstanceMetadataOptions();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceSecurityGroupIds extends TeaModel {
        // SecurityGroupId
        @NameInMap("SecurityGroupId")
        @Validation(required = true)
        public java.util.List<String> securityGroupId;

        public static DescribeInstancesResponseInstancesInstanceSecurityGroupIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceSecurityGroupIds self = new DescribeInstancesResponseInstancesInstanceSecurityGroupIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstancePublicIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstancePublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstancePublicIpAddress self = new DescribeInstancesResponseInstancesInstancePublicIpAddress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceInnerIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstanceInnerIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceInnerIpAddress self = new DescribeInstancesResponseInstancesInstanceInnerIpAddress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstanceRdmaIpAddress extends TeaModel {
        // IpAddress
        @NameInMap("IpAddress")
        @Validation(required = true)
        public java.util.List<String> ipAddress;

        public static DescribeInstancesResponseInstancesInstanceRdmaIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstanceRdmaIpAddress self = new DescribeInstancesResponseInstancesInstanceRdmaIpAddress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("OSName")
        @Validation(required = true)
        public String OSName;

        @NameInMap("OSNameEn")
        @Validation(required = true)
        public String OSNameEn;

        @NameInMap("OSType")
        @Validation(required = true)
        public String OSType;

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

        @NameInMap("DeploymentSetId")
        @Validation(required = true)
        public String deploymentSetId;

        @NameInMap("DeploymentSetGroupNo")
        @Validation(required = true)
        public Integer deploymentSetGroupNo;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

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

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("InstanceNetworkType")
        @Validation(required = true)
        public String instanceNetworkType;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("SaleCycle")
        @Validation(required = true)
        public String saleCycle;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("AutoReleaseTime")
        @Validation(required = true)
        public String autoReleaseTime;

        @NameInMap("IoOptimized")
        @Validation(required = true)
        public Boolean ioOptimized;

        @NameInMap("DeviceAvailable")
        @Validation(required = true)
        public Boolean deviceAvailable;

        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public String instanceTypeFamily;

        @NameInMap("LocalStorageCapacity")
        @Validation(required = true)
        public Long localStorageCapacity;

        @NameInMap("LocalStorageAmount")
        @Validation(required = true)
        public Integer localStorageAmount;

        @NameInMap("GPUAmount")
        @Validation(required = true)
        public Integer GPUAmount;

        @NameInMap("GPUSpec")
        @Validation(required = true)
        public String GPUSpec;

        @NameInMap("SpotStrategy")
        @Validation(required = true)
        public String spotStrategy;

        @NameInMap("SpotPriceLimit")
        @Validation(required = true)
        public Double spotPriceLimit;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("KeyPairName")
        @Validation(required = true)
        public String keyPairName;

        @NameInMap("Recyclable")
        @Validation(required = true)
        public Boolean recyclable;

        @NameInMap("HpcClusterId")
        @Validation(required = true)
        public String hpcClusterId;

        @NameInMap("StoppedMode")
        @Validation(required = true)
        public String stoppedMode;

        @NameInMap("CreditSpecification")
        @Validation(required = true)
        public String creditSpecification;

        @NameInMap("DeletionProtection")
        @Validation(required = true)
        public Boolean deletionProtection;

        @NameInMap("NetworkInterfaces")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceNetworkInterfaces networkInterfaces;

        @NameInMap("OperationLocks")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceOperationLocks operationLocks;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceTags tags;

        @NameInMap("VpcAttributes")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceVpcAttributes vpcAttributes;

        @NameInMap("EipAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceEipAddress eipAddress;

        @NameInMap("DedicatedHostAttribute")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceDedicatedHostAttribute dedicatedHostAttribute;

        @NameInMap("EcsCapacityReservationAttr")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceEcsCapacityReservationAttr ecsCapacityReservationAttr;

        @NameInMap("DedicatedInstanceAttribute")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceDedicatedInstanceAttribute dedicatedInstanceAttribute;

        @NameInMap("CpuOptions")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceCpuOptions cpuOptions;

        @NameInMap("MetadataOptions")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceMetadataOptions metadataOptions;

        @NameInMap("SecurityGroupIds")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceSecurityGroupIds securityGroupIds;

        @NameInMap("PublicIpAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstancePublicIpAddress publicIpAddress;

        @NameInMap("InnerIpAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceInnerIpAddress innerIpAddress;

        @NameInMap("RdmaIpAddress")
        @Validation(required = true)
        public DescribeInstancesResponseInstancesInstanceRdmaIpAddress rdmaIpAddress;

        public static DescribeInstancesResponseInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesInstance self = new DescribeInstancesResponseInstancesInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeInstancesResponseInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesInstance> instance;

        public static DescribeInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstances self = new DescribeInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

    }

}
