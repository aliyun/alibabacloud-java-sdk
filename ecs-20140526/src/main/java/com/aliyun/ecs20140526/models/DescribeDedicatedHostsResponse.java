// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponse extends TeaModel {
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

    @NameInMap("DedicatedHosts")
    @Validation(required = true)
    public DescribeDedicatedHostsResponseDedicatedHosts dedicatedHosts;

    public static DescribeDedicatedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsResponse self = new DescribeDedicatedHostsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstancesInstance self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstancesInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstancesInstance> instance;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstances self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstances();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocksOperationLock extends TeaModel {
        @NameInMap("LockReason")
        @Validation(required = true)
        public String lockReason;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocksOperationLock self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocksOperationLock> operationLock;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocks self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocks();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTagsTag self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTagsTag> tag;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTags self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostCapacity extends TeaModel {
        @NameInMap("TotalVcpus")
        @Validation(required = true)
        public Integer totalVcpus;

        @NameInMap("AvailableVcpus")
        @Validation(required = true)
        public Integer availableVcpus;

        @NameInMap("TotalVgpus")
        @Validation(required = true)
        public Integer totalVgpus;

        @NameInMap("AvailableVgpus")
        @Validation(required = true)
        public Integer availableVgpus;

        @NameInMap("TotalMemory")
        @Validation(required = true)
        public Double totalMemory;

        @NameInMap("AvailableMemory")
        @Validation(required = true)
        public Double availableMemory;

        @NameInMap("TotalLocalStorage")
        @Validation(required = true)
        public Integer totalLocalStorage;

        @NameInMap("AvailableLocalStorage")
        @Validation(required = true)
        public Integer availableLocalStorage;

        @NameInMap("LocalStorageCategory")
        @Validation(required = true)
        public String localStorageCategory;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostCapacity self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostCapacity();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostNetworkAttributes extends TeaModel {
        @NameInMap("SlbUdpTimeout")
        @Validation(required = true)
        public Integer slbUdpTimeout;

        @NameInMap("UdpTimeout")
        @Validation(required = true)
        public Integer udpTimeout;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostNetworkAttributes self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostNetworkAttributes();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies extends TeaModel {
        // SupportedInstanceTypeFamily
        @NameInMap("SupportedInstanceTypeFamily")
        @Validation(required = true)
        public java.util.List<String> supportedInstanceTypeFamily;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies extends TeaModel {
        // SupportedCustomInstanceTypeFamily
        @NameInMap("SupportedCustomInstanceTypeFamily")
        @Validation(required = true)
        public java.util.List<String> supportedCustomInstanceTypeFamily;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypesList extends TeaModel {
        // SupportedInstanceTypesList
        @NameInMap("SupportedInstanceTypesList")
        @Validation(required = true)
        public java.util.List<String> supportedInstanceTypesList;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypesList self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypesList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHostsDedicatedHost extends TeaModel {
        @NameInMap("DedicatedHostId")
        @Validation(required = true)
        public String dedicatedHostId;

        @NameInMap("AutoPlacement")
        @Validation(required = true)
        public String autoPlacement;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("DedicatedHostName")
        @Validation(required = true)
        public String dedicatedHostName;

        @NameInMap("MachineId")
        @Validation(required = true)
        public String machineId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DedicatedHostType")
        @Validation(required = true)
        public String dedicatedHostType;

        @NameInMap("Sockets")
        @Validation(required = true)
        public Integer sockets;

        @NameInMap("Cores")
        @Validation(required = true)
        public Integer cores;

        @NameInMap("PhysicalGpus")
        @Validation(required = true)
        public Integer physicalGpus;

        @NameInMap("GPUSpec")
        @Validation(required = true)
        public String GPUSpec;

        @NameInMap("ActionOnMaintenance")
        @Validation(required = true)
        public String actionOnMaintenance;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("SaleCycle")
        @Validation(required = true)
        public String saleCycle;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("AutoReleaseTime")
        @Validation(required = true)
        public String autoReleaseTime;

        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("Instances")
        @Validation(required = true)
        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostInstances instances;

        @NameInMap("OperationLocks")
        @Validation(required = true)
        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostOperationLocks operationLocks;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostTags tags;

        @NameInMap("Capacity")
        @Validation(required = true)
        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostCapacity capacity;

        @NameInMap("NetworkAttributes")
        @Validation(required = true)
        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostNetworkAttributes networkAttributes;

        @NameInMap("SupportedInstanceTypeFamilies")
        @Validation(required = true)
        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        @NameInMap("SupportedCustomInstanceTypeFamilies")
        @Validation(required = true)
        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies;

        @NameInMap("SupportedInstanceTypesList")
        @Validation(required = true)
        public DescribeDedicatedHostsResponseDedicatedHostsDedicatedHostSupportedInstanceTypesList supportedInstanceTypesList;

        public static DescribeDedicatedHostsResponseDedicatedHostsDedicatedHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHostsDedicatedHost self = new DescribeDedicatedHostsResponseDedicatedHostsDedicatedHost();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDedicatedHostsResponseDedicatedHosts extends TeaModel {
        @NameInMap("DedicatedHost")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostsResponseDedicatedHostsDedicatedHost> dedicatedHost;

        public static DescribeDedicatedHostsResponseDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseDedicatedHosts self = new DescribeDedicatedHostsResponseDedicatedHosts();
            return TeaModel.build(map, self);
        }

    }

}
