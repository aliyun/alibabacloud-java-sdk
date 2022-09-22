// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesResponseBody extends TeaModel {
    @NameInMap("DedicatedHostTypes")
    public DedicatedHostTypes dedicatedHostTypes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDedicatedHostTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesResponseBody self = new DescribeDedicatedHostTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostTypesResponseBody setDedicatedHostTypes(DedicatedHostTypes dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
        return this;
    }
    public DedicatedHostTypes getDedicatedHostTypes() {
        return this.dedicatedHostTypes;
    }

    public DescribeDedicatedHostTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SupportInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportInstanceTypeFamily")
        public java.util.List<String> supportInstanceTypeFamily;

        public static SupportInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            SupportInstanceTypeFamilies self = new SupportInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public SupportInstanceTypeFamilies setSupportInstanceTypeFamily(java.util.List<String> supportInstanceTypeFamily) {
            this.supportInstanceTypeFamily = supportInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportInstanceTypeFamily() {
            return this.supportInstanceTypeFamily;
        }

    }

    public static class SupportInstanceTypesList extends TeaModel {
        @NameInMap("SupportInstanceTypesList")
        public java.util.List<String> supportInstanceTypesList;

        public static SupportInstanceTypesList build(java.util.Map<String, ?> map) throws Exception {
            SupportInstanceTypesList self = new SupportInstanceTypesList();
            return TeaModel.build(map, self);
        }

        public SupportInstanceTypesList setSupportInstanceTypesList(java.util.List<String> supportInstanceTypesList) {
            this.supportInstanceTypesList = supportInstanceTypesList;
            return this;
        }
        public java.util.List<String> getSupportInstanceTypesList() {
            return this.supportInstanceTypesList;
        }

    }

    public static class DedicatedHostType extends TeaModel {
        @NameInMap("CpuOverCommitRatioRange")
        public String cpuOverCommitRatioRange;

        @NameInMap("DedicatedHostType")
        public String dedicatedHostType;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("Generation")
        public String generation;

        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        @NameInMap("MemorySize")
        public Float memorySize;

        @NameInMap("PhysicalGpus")
        public Integer physicalGpus;

        @NameInMap("SupportCpuOverCommitRatio")
        public Boolean supportCpuOverCommitRatio;

        @NameInMap("SupportInstanceTypeFamilies")
        public SupportInstanceTypeFamilies supportInstanceTypeFamilies;

        @NameInMap("SupportInstanceTypesList")
        public SupportInstanceTypesList supportInstanceTypesList;

        @NameInMap("TotalPhysicalCores")
        public Integer totalPhysicalCores;

        @NameInMap("TotalSockets")
        public Integer totalSockets;

        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        @NameInMap("TotalVgpus")
        public Integer totalVgpus;

        public static DedicatedHostType build(java.util.Map<String, ?> map) throws Exception {
            DedicatedHostType self = new DedicatedHostType();
            return TeaModel.build(map, self);
        }

        public DedicatedHostType setCpuOverCommitRatioRange(String cpuOverCommitRatioRange) {
            this.cpuOverCommitRatioRange = cpuOverCommitRatioRange;
            return this;
        }
        public String getCpuOverCommitRatioRange() {
            return this.cpuOverCommitRatioRange;
        }

        public DedicatedHostType setDedicatedHostType(String dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public DedicatedHostType setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DedicatedHostType setGeneration(String generation) {
            this.generation = generation;
            return this;
        }
        public String getGeneration() {
            return this.generation;
        }

        public DedicatedHostType setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DedicatedHostType setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DedicatedHostType setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DedicatedHostType setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

        public DedicatedHostType setPhysicalGpus(Integer physicalGpus) {
            this.physicalGpus = physicalGpus;
            return this;
        }
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        public DedicatedHostType setSupportCpuOverCommitRatio(Boolean supportCpuOverCommitRatio) {
            this.supportCpuOverCommitRatio = supportCpuOverCommitRatio;
            return this;
        }
        public Boolean getSupportCpuOverCommitRatio() {
            return this.supportCpuOverCommitRatio;
        }

        public DedicatedHostType setSupportInstanceTypeFamilies(SupportInstanceTypeFamilies supportInstanceTypeFamilies) {
            this.supportInstanceTypeFamilies = supportInstanceTypeFamilies;
            return this;
        }
        public SupportInstanceTypeFamilies getSupportInstanceTypeFamilies() {
            return this.supportInstanceTypeFamilies;
        }

        public DedicatedHostType setSupportInstanceTypesList(SupportInstanceTypesList supportInstanceTypesList) {
            this.supportInstanceTypesList = supportInstanceTypesList;
            return this;
        }
        public SupportInstanceTypesList getSupportInstanceTypesList() {
            return this.supportInstanceTypesList;
        }

        public DedicatedHostType setTotalPhysicalCores(Integer totalPhysicalCores) {
            this.totalPhysicalCores = totalPhysicalCores;
            return this;
        }
        public Integer getTotalPhysicalCores() {
            return this.totalPhysicalCores;
        }

        public DedicatedHostType setTotalSockets(Integer totalSockets) {
            this.totalSockets = totalSockets;
            return this;
        }
        public Integer getTotalSockets() {
            return this.totalSockets;
        }

        public DedicatedHostType setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public DedicatedHostType setTotalVgpus(Integer totalVgpus) {
            this.totalVgpus = totalVgpus;
            return this;
        }
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

    }

    public static class DedicatedHostTypes extends TeaModel {
        @NameInMap("DedicatedHostType")
        public java.util.List<DedicatedHostType> dedicatedHostType;

        public static DedicatedHostTypes build(java.util.Map<String, ?> map) throws Exception {
            DedicatedHostTypes self = new DedicatedHostTypes();
            return TeaModel.build(map, self);
        }

        public DedicatedHostTypes setDedicatedHostType(java.util.List<DedicatedHostType> dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public java.util.List<DedicatedHostType> getDedicatedHostType() {
            return this.dedicatedHostType;
        }

    }

}
