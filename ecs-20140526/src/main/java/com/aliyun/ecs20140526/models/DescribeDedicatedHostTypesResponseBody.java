// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesResponseBody extends TeaModel {
    /**
     * <p>Details about the dedicated host types.</p>
     */
    @NameInMap("DedicatedHostTypes")
    public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes dedicatedHostTypes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FE5FF06-3A33-4658-8495-6445FC54E327</p>
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
         * <p>The number of cores per physical CPU.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The supported CPU overcommit ratio range.</p>
         * 
         * <strong>example:</strong>
         * <p>1-5</p>
         */
        @NameInMap("CpuOverCommitRatioRange")
        public String cpuOverCommitRatioRange;

        /**
         * <p>The dedicated host type.</p>
         * 
         * <strong>example:</strong>
         * <p>ddh.sn1ne</p>
         */
        @NameInMap("DedicatedHostType")
        public String dedicatedHostType;

        /**
         * <p>The GPU model.</p>
         * 
         * <strong>example:</strong>
         * <p>gpu</p>
         */
        @NameInMap("GPUSpec")
        public String GPUSpec;

        /**
         * <p>The number of local disks on a dedicated host.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        /**
         * <p>The capacity of a local disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        /**
         * <p>The category of local disks.</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        /**
         * <p>The memory size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>112.0</p>
         */
        @NameInMap("MemorySize")
        public Float memorySize;

        /**
         * <p>The number of physical GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PhysicalGpus")
        public Integer physicalGpus;

        /**
         * <p>The number of physical CPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Sockets")
        public Integer sockets;

        /**
         * <p>Indicates whether the CPU overcommit ratio settings are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportCpuOverCommitRatio")
        public Boolean supportCpuOverCommitRatio;

        /**
         * <p>The ECS instance families supported by the dedicated host type.</p>
         */
        @NameInMap("SupportedInstanceTypeFamilies")
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        /**
         * <p>The ECS instance types supported by the dedicated host type.</p>
         */
        @NameInMap("SupportedInstanceTypesList")
        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList supportedInstanceTypesList;

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
