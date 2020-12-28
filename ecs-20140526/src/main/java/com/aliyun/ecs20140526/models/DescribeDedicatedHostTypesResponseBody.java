// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DedicatedHostTypes")
    public java.util.List<DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes> dedicatedHostTypes;

    public static DescribeDedicatedHostTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesResponseBody self = new DescribeDedicatedHostTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostTypesResponseBody setDedicatedHostTypes(java.util.List<DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes> dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
        return this;
    }
    public java.util.List<DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes> getDedicatedHostTypes() {
        return this.dedicatedHostTypes;
    }

    public static class DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes extends TeaModel {
        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("GPUSpec")
        public String GPUSpec;

        @NameInMap("LocalStorageCategory")
        public String localStorageCategory;

        @NameInMap("TotalVcpus")
        public Integer totalVcpus;

        @NameInMap("CpuOverCommitRatioRange")
        public String cpuOverCommitRatioRange;

        @NameInMap("SupportedInstanceTypesList")
        public java.util.List<String> supportedInstanceTypesList;

        @NameInMap("PhysicalGpus")
        public Integer physicalGpus;

        @NameInMap("MemorySize")
        public Float memorySize;

        @NameInMap("SupportCpuOverCommitRatio")
        public Boolean supportCpuOverCommitRatio;

        @NameInMap("LocalStorageCapacity")
        public Long localStorageCapacity;

        @NameInMap("LocalStorageAmount")
        public Integer localStorageAmount;

        @NameInMap("DedicatedHostType")
        public String dedicatedHostType;

        @NameInMap("TotalVgpus")
        public Integer totalVgpus;

        @NameInMap("Sockets")
        public Integer sockets;

        @NameInMap("SupportedInstanceTypeFamilies")
        public java.util.List<String> supportedInstanceTypeFamilies;

        public static DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes self = new DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setCpuOverCommitRatioRange(String cpuOverCommitRatioRange) {
            this.cpuOverCommitRatioRange = cpuOverCommitRatioRange;
            return this;
        }
        public String getCpuOverCommitRatioRange() {
            return this.cpuOverCommitRatioRange;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setSupportedInstanceTypesList(java.util.List<String> supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setPhysicalGpus(Integer physicalGpus) {
            this.physicalGpus = physicalGpus;
            return this;
        }
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setSupportCpuOverCommitRatio(Boolean supportCpuOverCommitRatio) {
            this.supportCpuOverCommitRatio = supportCpuOverCommitRatio;
            return this;
        }
        public Boolean getSupportCpuOverCommitRatio() {
            return this.supportCpuOverCommitRatio;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setDedicatedHostType(String dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setTotalVgpus(Integer totalVgpus) {
            this.totalVgpus = totalVgpus;
            return this;
        }
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setSockets(Integer sockets) {
            this.sockets = sockets;
            return this;
        }
        public Integer getSockets() {
            return this.sockets;
        }

        public DescribeDedicatedHostTypesResponseBodyDedicatedHostTypes setSupportedInstanceTypeFamilies(java.util.List<String> supportedInstanceTypeFamilies) {
            this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

    }

}
