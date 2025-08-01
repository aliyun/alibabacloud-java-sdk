// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsResponseBody extends TeaModel {
    /**
     * <p>Details about the DDH.</p>
     */
    @NameInMap("DedicatedHosts")
    public DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists. If the return value of this parameter is empty when you specify MaxResults and NextToken for a paged query, no more results are to be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>e71d8a535bd9cc11</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7654525A-9964-4ABB-8BCD-98F8835E809A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of dedicated hosts.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsResponseBody self = new DescribeDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsResponseBody setDedicatedHosts(DescribeDedicatedHostsResponseBodyDedicatedHosts dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }
    public DescribeDedicatedHostsResponseBodyDedicatedHosts getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    public DescribeDedicatedHostsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDedicatedHostsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDedicatedHostsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDedicatedHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions extends TeaModel {
        @NameInMap("ManagedPrivateSpaceId")
        public String managedPrivateSpaceId;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions setManagedPrivateSpaceId(String managedPrivateSpaceId) {
            this.managedPrivateSpaceId = managedPrivateSpaceId;
            return this;
        }
        public String getManagedPrivateSpaceId() {
            return this.managedPrivateSpaceId;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypesAvailableInstanceType extends TeaModel {
        @NameInMap("AvailableInstanceCapacity")
        public Integer availableInstanceCapacity;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypesAvailableInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypesAvailableInstanceType self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypesAvailableInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypesAvailableInstanceType setAvailableInstanceCapacity(Integer availableInstanceCapacity) {
            this.availableInstanceCapacity = availableInstanceCapacity;
            return this;
        }
        public Integer getAvailableInstanceCapacity() {
            return this.availableInstanceCapacity;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypesAvailableInstanceType setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypes extends TeaModel {
        @NameInMap("AvailableInstanceType")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypesAvailableInstanceType> availableInstanceType;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypes self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypes setAvailableInstanceType(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypesAvailableInstanceType> availableInstanceType) {
            this.availableInstanceType = availableInstanceType;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypesAvailableInstanceType> getAvailableInstanceType() {
            return this.availableInstanceType;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity extends TeaModel {
        /**
         * <p>The amount of available memory. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("AvailableMemory")
        public Float availableMemory;

        /**
         * <p>The number of available vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("AvailableVcpu")
        public Integer availableVcpu;

        /**
         * <p>The socket ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SocketId")
        public Integer socketId;

        /**
         * <p>The total amount of memory. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("TotalMemory")
        public Float totalMemory;

        /**
         * <p>The total number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("TotalVcpu")
        public Integer totalVcpu;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity setAvailableMemory(Float availableMemory) {
            this.availableMemory = availableMemory;
            return this;
        }
        public Float getAvailableMemory() {
            return this.availableMemory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity setAvailableVcpu(Integer availableVcpu) {
            this.availableVcpu = availableVcpu;
            return this;
        }
        public Integer getAvailableVcpu() {
            return this.availableVcpu;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity setSocketId(Integer socketId) {
            this.socketId = socketId;
            return this;
        }
        public Integer getSocketId() {
            return this.socketId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity setTotalMemory(Float totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity setTotalVcpu(Integer totalVcpu) {
            this.totalVcpu = totalVcpu;
            return this;
        }
        public Integer getTotalVcpu() {
            return this.totalVcpu;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacities extends TeaModel {
        @NameInMap("SocketCapacity")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity> socketCapacity;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacities build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacities self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacities();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacities setSocketCapacity(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity> socketCapacity) {
            this.socketCapacity = socketCapacity;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacitiesSocketCapacity> getSocketCapacity() {
            return this.socketCapacity;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity extends TeaModel {
        @NameInMap("AvailableInstanceTypes")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypes availableInstanceTypes;

        /**
         * <p>The amount of available space on the local disks. Unit: GiB</p>
         * 
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("AvailableLocalStorage")
        public Integer availableLocalStorage;

        /**
         * <p>The amount of available memory. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("AvailableMemory")
        public Float availableMemory;

        /**
         * <p>The number of available vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AvailableVcpus")
        public Integer availableVcpus;

        /**
         * <p>The number of available vGPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AvailableVgpus")
        public Integer availableVgpus;

        /**
         * <p>The category of local disks.</p>
         * 
         * <strong>example:</strong>
         * <p>i2</p>
         */
        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        /**
         * <p>The socket capacities.</p>
         */
        @NameInMap("SocketCapacities")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacities socketCapacities;

        /**
         * <p>The total capacity of local disks. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("TotalLocalStorage")
        public Integer totalLocalStorage;

        /**
         * <p>The total amount of memory. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("TotalMemory")
        public Float totalMemory;

        /**
         * <p>The total number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        /**
         * <p>The total number of vGPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalVgpus")
        public Integer totalVgpus;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableInstanceTypes(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypes availableInstanceTypes) {
            this.availableInstanceTypes = availableInstanceTypes;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacityAvailableInstanceTypes getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableLocalStorage(Integer availableLocalStorage) {
            this.availableLocalStorage = availableLocalStorage;
            return this;
        }
        public Integer getAvailableLocalStorage() {
            return this.availableLocalStorage;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableMemory(Float availableMemory) {
            this.availableMemory = availableMemory;
            return this;
        }
        public Float getAvailableMemory() {
            return this.availableMemory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableVcpus(Integer availableVcpus) {
            this.availableVcpus = availableVcpus;
            return this;
        }
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setAvailableVgpus(Integer availableVgpus) {
            this.availableVgpus = availableVgpus;
            return this;
        }
        public Integer getAvailableVgpus() {
            return this.availableVgpus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setSocketCapacities(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacities socketCapacities) {
            this.socketCapacities = socketCapacities;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacitySocketCapacities getSocketCapacities() {
            return this.socketCapacities;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalLocalStorage(Integer totalLocalStorage) {
            this.totalLocalStorage = totalLocalStorage;
            return this;
        }
        public Integer getTotalLocalStorage() {
            return this.totalLocalStorage;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalMemory(Float totalMemory) {
            this.totalMemory = totalMemory;
            return this;
        }
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity setTotalVgpus(Integer totalVgpus) {
            this.totalVgpus = totalVgpus;
            return this;
        }
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo extends TeaModel {
        /**
         * <p>This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance extends TeaModel {
        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp14ot0ykf8w13a1****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the ECS instance owner.</p>
         * 
         * <strong>example:</strong>
         * <p>128************0</p>
         */
        @NameInMap("InstanceOwnerId")
        public Long instanceOwnerId;

        /**
         * <p>The instance type of the ECS instance that was created on the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the socket to which the ECS instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>0,1</p>
         */
        @NameInMap("SocketId")
        public String socketId;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance setInstanceOwnerId(Long instanceOwnerId) {
            this.instanceOwnerId = instanceOwnerId;
            return this;
        }
        public Long getInstanceOwnerId() {
            return this.instanceOwnerId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance setSocketId(String socketId) {
            this.socketId = socketId;
            return this;
        }
        public String getSocketId() {
            return this.socketId;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance> instance;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances setInstance(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstancesInstance> getInstance() {
            return this.instance;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes extends TeaModel {
        /**
         * <p>The timeout period of the UDP session that is established between Server Load Balancer (SLB) and the dedicated host. Unit: seconds. Only 60 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("SlbUdpTimeout")
        public Integer slbUdpTimeout;

        /**
         * <p>The timeout period of the UDP session that is established between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Only 60 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("UdpTimeout")
        public Integer udpTimeout;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes setSlbUdpTimeout(Integer slbUdpTimeout) {
            this.slbUdpTimeout = slbUdpTimeout;
            return this;
        }
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes setUdpTimeout(Integer udpTimeout) {
            this.udpTimeout = udpTimeout;
            return this;
        }
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock extends TeaModel {
        /**
         * <p>The reason why the dedicated host was locked. Valid values:</p>
         * <ul>
         * <li>financial: The dedicated host was locked due to overdue payments.</li>
         * <li>security: The dedicated host was locked due to security reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock> operationLock;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks setOperationLock(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock> operationLock) {
            this.operationLock = operationLock;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocksOperationLock> getOperationLock() {
            return this.operationLock;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedCustomInstanceTypeFamily")
        public java.util.List<String> supportedCustomInstanceTypeFamily;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies setSupportedCustomInstanceTypeFamily(java.util.List<String> supportedCustomInstanceTypeFamily) {
            this.supportedCustomInstanceTypeFamily = supportedCustomInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedCustomInstanceTypeFamily() {
            return this.supportedCustomInstanceTypeFamily;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedInstanceTypeFamily")
        public java.util.List<String> supportedInstanceTypeFamily;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies setSupportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
            this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList extends TeaModel {
        @NameInMap("SupportedInstanceTypesList")
        public java.util.List<String> supportedInstanceTypesList;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList setSupportedInstanceTypesList(java.util.List<String> supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag extends TeaModel {
        /**
         * <p>The tag key of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag> tag;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags setTag(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost extends TeaModel {
        @NameInMap("SchedulerOptions")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions schedulerOptions;

        /**
         * <p>The policy used to migrate the ECS instances deployed on the dedicated host when the dedicated host fails. Valid values:</p>
         * <ul>
         * <li>Migrate: The instances are migrated to another physical machine. Instances that are not in the Stopped state when the dedicated host fails are restarted.</li>
         * <li>Stop: The instances are stopped. If the dedicated host cannot be repaired, the instances are migrated to another physical machine and then restarted.</li>
         * </ul>
         * <p>If the dedicated host has cloud disks attached, the default value is Migrate. If the dedicated host has local disks attached, the default value is Stop.</p>
         * 
         * <strong>example:</strong>
         * <p>Migrate</p>
         */
        @NameInMap("ActionOnMaintenance")
        public String actionOnMaintenance;

        /**
         * <p>Indicates whether the dedicated host is added to the resource pool for automatic deployment. Valid values:</p>
         * <ul>
         * <li>on: The dedicated host is added to the resource pool for automatic deployment.</li>
         * <li>off: The dedicated host is not added to the resource pool for automatic deployment.</li>
         * </ul>
         * <p>For information about automatic deployment, see the &quot;Automatic deployment&quot; section in <a href="https://help.aliyun.com/document_detail/118938.html">Functions and features</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AutoPlacement")
        public String autoPlacement;

        /**
         * <p>The automatic release time of the dedicated host. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-01T12:00Z</p>
         */
        @NameInMap("AutoReleaseTime")
        public String autoReleaseTime;

        /**
         * <p>The performance specifications of the dedicated host.</p>
         */
        @NameInMap("Capacity")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity capacity;

        /**
         * <p>The billing method of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of physical cores per CPU.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The CPU overcommit ratio. Valid values: 1 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuOverCommitRatio")
        public Float cpuOverCommitRatio;

        /**
         * <p>The time when the dedicated host was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-01T12:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the dedicated host cluster to which the dedicated host belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-bp12wlf6am0vz9v2****</p>
         */
        @NameInMap("DedicatedHostClusterId")
        public String dedicatedHostClusterId;

        /**
         * <p>The ID of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp165p6xk2tlw61e****</p>
         */
        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        /**
         * <p>The name of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>MyDDHTestName</p>
         */
        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        /**
         * <p>The ID of the dedicated host owner.</p>
         * 
         * <strong>example:</strong>
         * <p>100************7</p>
         */
        @NameInMap("DedicatedHostOwnerId")
        public Long dedicatedHostOwnerId;

        /**
         * <p>The type of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>ddh.g5</p>
         */
        @NameInMap("DedicatedHostType")
        public String dedicatedHostType;

        /**
         * <p>The description of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>this-is-my-DDH</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The expiration time of the subscription dedicated host. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T12:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The GPU model.</p>
         * 
         * <strong>example:</strong>
         * <p>gpu</p>
         */
        @NameInMap("GPUSpec")
        public String GPUSpec;

        /**
         * <p>This parameter will be removed in the future. We recommend that you use other parameters to ensure future compatibility.</p>
         */
        @NameInMap("HostDetailInfo")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo hostDetailInfo;

        /**
         * <p>The ECS instances that were created on the dedicated host.</p>
         */
        @NameInMap("Instances")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances instances;

        /**
         * <p>The machine code of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>12aaa123456ff19dec12345d3026e****</p>
         */
        @NameInMap("MachineId")
        public String machineId;

        /**
         * <p>The network attributes of the dedicated host.</p>
         */
        @NameInMap("NetworkAttributes")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes networkAttributes;

        /**
         * <p>The reasons why the resources of the dedicated host were locked.</p>
         */
        @NameInMap("OperationLocks")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks operationLocks;

        /**
         * <p>The number of physical GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PhysicalGpus")
        public Integer physicalGpus;

        /**
         * <p>The region ID of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the dedicated host belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek3b6jzp66****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("SaleCycle")
        public String saleCycle;

        /**
         * <p>The number of physical CPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Sockets")
        public Integer sockets;

        /**
         * <p>The status of the dedicated host. Valid values:</p>
         * <ul>
         * <li>Available: The dedicated host is running as expected.</li>
         * <li>UnderAssessment: The dedicated host is available but has potential risks that may cause the ECS instances on the dedicated host to fail.</li>
         * <li>PermanentFailure: The dedicated host has permanent failures and is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The custom ECS instance families that are supported by the dedicated host.</p>
         */
        @NameInMap("SupportedCustomInstanceTypeFamilies")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies;

        /**
         * <p>The ECS instance families that are supported by the dedicated host.</p>
         */
        @NameInMap("SupportedInstanceTypeFamilies")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        /**
         * <p>The ECS instance types that are supported by the dedicated host.</p>
         */
        @NameInMap("SupportedInstanceTypesList")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList supportedInstanceTypesList;

        /**
         * <p>The tags of the dedicated host.</p>
         */
        @NameInMap("Tags")
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags tags;

        /**
         * <p>The zone ID of the dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost self = new DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSchedulerOptions(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions schedulerOptions) {
            this.schedulerOptions = schedulerOptions;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSchedulerOptions getSchedulerOptions() {
            return this.schedulerOptions;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setActionOnMaintenance(String actionOnMaintenance) {
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }
        public String getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setAutoPlacement(String autoPlacement) {
            this.autoPlacement = autoPlacement;
            return this;
        }
        public String getAutoPlacement() {
            return this.autoPlacement;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setAutoReleaseTime(String autoReleaseTime) {
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCapacity(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostCapacity getCapacity() {
            return this.capacity;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCpuOverCommitRatio(Float cpuOverCommitRatio) {
            this.cpuOverCommitRatio = cpuOverCommitRatio;
            return this;
        }
        public Float getCpuOverCommitRatio() {
            return this.cpuOverCommitRatio;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostClusterId(String dedicatedHostClusterId) {
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostOwnerId(Long dedicatedHostOwnerId) {
            this.dedicatedHostOwnerId = dedicatedHostOwnerId;
            return this;
        }
        public Long getDedicatedHostOwnerId() {
            return this.dedicatedHostOwnerId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDedicatedHostType(String dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setHostDetailInfo(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo hostDetailInfo) {
            this.hostDetailInfo = hostDetailInfo;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostHostDetailInfo getHostDetailInfo() {
            return this.hostDetailInfo;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setInstances(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances instances) {
            this.instances = instances;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostInstances getInstances() {
            return this.instances;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setMachineId(String machineId) {
            this.machineId = machineId;
            return this;
        }
        public String getMachineId() {
            return this.machineId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setNetworkAttributes(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes networkAttributes) {
            this.networkAttributes = networkAttributes;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostNetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setOperationLocks(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks operationLocks) {
            this.operationLocks = operationLocks;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostOperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setPhysicalGpus(Integer physicalGpus) {
            this.physicalGpus = physicalGpus;
            return this;
        }
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSaleCycle(String saleCycle) {
            this.saleCycle = saleCycle;
            return this;
        }
        public String getSaleCycle() {
            return this.saleCycle;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSockets(Integer sockets) {
            this.sockets = sockets;
            return this;
        }
        public Integer getSockets() {
            return this.sockets;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSupportedCustomInstanceTypeFamilies(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies) {
            this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedCustomInstanceTypeFamilies getSupportedCustomInstanceTypeFamilies() {
            return this.supportedCustomInstanceTypeFamilies;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSupportedInstanceTypeFamilies(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
            this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypeFamilies getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setSupportedInstanceTypesList(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostSupportedInstanceTypesList getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setTags(DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHostTags getTags() {
            return this.tags;
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDedicatedHostsResponseBodyDedicatedHosts extends TeaModel {
        @NameInMap("DedicatedHost")
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost> dedicatedHost;

        public static DescribeDedicatedHostsResponseBodyDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsResponseBodyDedicatedHosts self = new DescribeDedicatedHostsResponseBodyDedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsResponseBodyDedicatedHosts setDedicatedHost(java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost> dedicatedHost) {
            this.dedicatedHost = dedicatedHost;
            return this;
        }
        public java.util.List<DescribeDedicatedHostsResponseBodyDedicatedHostsDedicatedHost> getDedicatedHost() {
            return this.dedicatedHost;
        }

    }

}
