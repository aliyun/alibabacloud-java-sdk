// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DedicatedHostTypes")
    @Validation(required = true)
    public DescribeDedicatedHostTypesResponseDedicatedHostTypes dedicatedHostTypes;

    public static DescribeDedicatedHostTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostTypesResponse self = new DescribeDedicatedHostTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostTypesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostTypesResponse setDedicatedHostTypes(DescribeDedicatedHostTypesResponseDedicatedHostTypes dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
        return this;
    }
    public DescribeDedicatedHostTypesResponseDedicatedHostTypes getDedicatedHostTypes() {
        return this.dedicatedHostTypes;
    }

    public static class DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies extends TeaModel {
        // SupportedInstanceTypeFamily
        @NameInMap("SupportedInstanceTypeFamily")
        @Validation(required = true)
        public java.util.List<String> supportedInstanceTypeFamily;

        public static DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies self = new DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies setSupportedInstanceTypeFamily(java.util.List<String> supportedInstanceTypeFamily) {
            this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

    }

    public static class DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList extends TeaModel {
        // SupportedInstanceTypesList
        @NameInMap("SupportedInstanceTypesList")
        @Validation(required = true)
        public java.util.List<String> supportedInstanceTypesList;

        public static DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList self = new DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList setSupportedInstanceTypesList(java.util.List<String> supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public java.util.List<String> getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

    }

    public static class DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType extends TeaModel {
        @NameInMap("DedicatedHostType")
        @Validation(required = true)
        public String dedicatedHostType;

        @NameInMap("Sockets")
        @Validation(required = true)
        public Integer sockets;

        @NameInMap("TotalVcpus")
        @Validation(required = true)
        public Integer totalVcpus;

        @NameInMap("TotalVgpus")
        @Validation(required = true)
        public Integer totalVgpus;

        @NameInMap("Cores")
        @Validation(required = true)
        public Integer cores;

        @NameInMap("PhysicalGpus")
        @Validation(required = true)
        public Integer physicalGpus;

        @NameInMap("MemorySize")
        @Validation(required = true)
        public Float memorySize;

        @NameInMap("LocalStorageCapacity")
        @Validation(required = true)
        public Long localStorageCapacity;

        @NameInMap("LocalStorageAmount")
        @Validation(required = true)
        public Integer localStorageAmount;

        @NameInMap("LocalStorageCategory")
        @Validation(required = true)
        public String localStorageCategory;

        @NameInMap("GPUSpec")
        @Validation(required = true)
        public String GPUSpec;

        @NameInMap("SupportCpuOverCommitRatio")
        @Validation(required = true)
        public Boolean supportCpuOverCommitRatio;

        @NameInMap("CpuOverCommitRatioRange")
        @Validation(required = true)
        public String cpuOverCommitRatioRange;

        @NameInMap("SupportedInstanceTypeFamilies")
        @Validation(required = true)
        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        @NameInMap("SupportedInstanceTypesList")
        @Validation(required = true)
        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList supportedInstanceTypesList;

        public static DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType self = new DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setDedicatedHostType(String dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setSockets(Integer sockets) {
            this.sockets = sockets;
            return this;
        }
        public Integer getSockets() {
            return this.sockets;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setTotalVcpus(Integer totalVcpus) {
            this.totalVcpus = totalVcpus;
            return this;
        }
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setTotalVgpus(Integer totalVgpus) {
            this.totalVgpus = totalVgpus;
            return this;
        }
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setPhysicalGpus(Integer physicalGpus) {
            this.physicalGpus = physicalGpus;
            return this;
        }
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setMemorySize(Float memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Float getMemorySize() {
            return this.memorySize;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setLocalStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }
        public Long getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setLocalStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }
        public Integer getLocalStorageAmount() {
            return this.localStorageAmount;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setLocalStorageCategory(String localStorageCategory) {
            this.localStorageCategory = localStorageCategory;
            return this;
        }
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setGPUSpec(String GPUSpec) {
            this.GPUSpec = GPUSpec;
            return this;
        }
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setSupportCpuOverCommitRatio(Boolean supportCpuOverCommitRatio) {
            this.supportCpuOverCommitRatio = supportCpuOverCommitRatio;
            return this;
        }
        public Boolean getSupportCpuOverCommitRatio() {
            return this.supportCpuOverCommitRatio;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setCpuOverCommitRatioRange(String cpuOverCommitRatioRange) {
            this.cpuOverCommitRatioRange = cpuOverCommitRatioRange;
            return this;
        }
        public String getCpuOverCommitRatioRange() {
            return this.cpuOverCommitRatioRange;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setSupportedInstanceTypeFamilies(DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
            this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
            return this;
        }
        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypeFamilies getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType setSupportedInstanceTypesList(DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList supportedInstanceTypesList) {
            this.supportedInstanceTypesList = supportedInstanceTypesList;
            return this;
        }
        public DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostTypeSupportedInstanceTypesList getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

    }

    public static class DescribeDedicatedHostTypesResponseDedicatedHostTypes extends TeaModel {
        @NameInMap("DedicatedHostType")
        @Validation(required = true)
        public java.util.List<DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType> dedicatedHostType;

        public static DescribeDedicatedHostTypesResponseDedicatedHostTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostTypesResponseDedicatedHostTypes self = new DescribeDedicatedHostTypesResponseDedicatedHostTypes();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostTypesResponseDedicatedHostTypes setDedicatedHostType(java.util.List<DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType> dedicatedHostType) {
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }
        public java.util.List<DescribeDedicatedHostTypesResponseDedicatedHostTypesDedicatedHostType> getDedicatedHostType() {
            return this.dedicatedHostType;
        }

    }

}
