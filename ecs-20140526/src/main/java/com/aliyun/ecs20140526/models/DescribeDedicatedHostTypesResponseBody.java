// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesResponseBody extends TeaModel {
    /**
     * <p>The information about the dedicated host type.</p>
     */
    @NameInMap("DedicatedHostTypes")
    public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes dedicatedHostTypes;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDedicatedHostTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesResponseBody self = new DescribeDedicatedHostTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostTypesResponseBody setDedicatedHostTypes(DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
        return this;
    }
    public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes getDedicatedHostTypes() {
        return this.dedicatedHostTypes;
    }

    public DescribeDedicatedHostTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedInstanceTypeFamily")
        public java.util.List<String> supportedInstanceTypeFamily;

        public static DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies self = new DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies setSupportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
            this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

    }

    public static class DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList extends TeaModel {
        @NameInMap("SupportedInstanceTypesList")
        public java.util.List<String> supportedInstanceTypesList;

        public static DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList self = new DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList setSupportedInstanceTypesList(java.util.List<String> supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

    }

    public static class DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType extends TeaModel {
        /**
         * <p>The number of cores in a single physical CPU.</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The supported CPU overcommit ratio range.</p>
         */
        @NameInMap("CpuOverCommitRatioRange")
        public String cpuOverCommitRatioRange;

        /**
         * <p>The type of the dedicated host. You can submit a ticket to request more dedicated host types.</p>
         */
        @NameInMap("DedicatedHostType")
        public String dedicatedHostType;

        /**
         * <p>The GPU model.</p>
         */
        @NameInMap("GPUSpec")
        public String GPUSpec;

        /**
         * <p>The number of local disks on a dedicated host.</p>
         */
        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        /**
         * <p>The capacity of a local disk. Unit: GiB.</p>
         */
        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        /**
         * <p>The category of the local disks.</p>
         */
        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        /**
         * <p>The size of the memory. Unit: GiB.</p>
         */
        @NameInMap("MemorySize")
        public Float memorySize;

        /**
         * <p>The number of physical GPUs.</p>
         */
        @NameInMap("PhysicalGpus")
        public Integer physicalGpus;

        /**
         * <p>The number of physical CPUs.</p>
         */
        @NameInMap("Sockets")
        public Integer sockets;

        /**
         * <p>Indicates whether the CPU overcommit ratio setting is supported.</p>
         */
        @NameInMap("SupportCpuOverCommitRatio")
        public Boolean supportCpuOverCommitRatio;

        /**
         * <p>The ECS instance families supported by the dedicated host.</p>
         */
        @NameInMap("SupportedInstanceTypeFamilies")
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        /**
         * <p>The ECS instance types supported by the dedicated host.</p>
         */
        @NameInMap("SupportedInstanceTypesList")
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList supportedInstanceTypesList;

        /**
         * <p>The total number of vCPUs.</p>
         */
        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        /**
         * <p>The total number of vGPUs.</p>
         */
        @NameInMap("TotalVgpus")
        public Integer totalVgpus;

        public static DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType self = new DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setCpuOverCommitRatioRange(String cpuOverCommitRatioRange) {
            this.cpuOverCommitRatioRange = cpuOverCommitRatioRange;
            return this;
        }
        public String getCpuOverCommitRatioRange() {
            return this.cpuOverCommitRatioRange;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setDedicatedHostType(String dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setPhysicalGpus(Integer physicalGpus) {
            this.physicalGpus = physicalGpus;
            return this;
        }
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setSockets(Integer sockets) {
            this.sockets = sockets;
            return this;
        }
        public Integer getSockets() {
            return this.sockets;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setSupportCpuOverCommitRatio(Boolean supportCpuOverCommitRatio) {
            this.supportCpuOverCommitRatio = supportCpuOverCommitRatio;
            return this;
        }
        public Boolean getSupportCpuOverCommitRatio() {
            return this.supportCpuOverCommitRatio;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setSupportedInstanceTypeFamilies(DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
            this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
            return this;
        }
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setSupportedInstanceTypesList(DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType setTotalVgpus(Integer totalVgpus) {
            this.totalVgpus = totalVgpus;
            return this;
        }
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

    }

    public static class DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes extends TeaModel {
        @NameInMap("DedicatedHostType")
        public java.util.List<DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType> dedicatedHostType;

        public static DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes self = new DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setDedicatedHostType(java.util.List<DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType> dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public java.util.List<DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostType> getDedicatedHostType() {
            return this.dedicatedHostType;
        }

    }

}
