// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CpuCount")
    public Integer cpuCount;

    @NameInMap("CpuUsed")
    public Integer cpuUsed;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExtraData")
    public java.util.Map<String, ?> extraData;

    @NameInMap("Features")
    public java.util.List<String> features;

    @NameInMap("GpuCount")
    public Integer gpuCount;

    @NameInMap("GpuUsed")
    public Float gpuUsed;

    @NameInMap("InstanceCount")
    public Integer instanceCount;

    @NameInMap("InstanceMaxAllocatableCPU")
    public Integer instanceMaxAllocatableCPU;

    @NameInMap("InstanceMaxAllocatableGPU")
    public Float instanceMaxAllocatableGPU;

    @NameInMap("InstanceMaxAllocatableMemory")
    public Integer instanceMaxAllocatableMemory;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("MemoryUsed")
    public Integer memoryUsed;

    @NameInMap("Message")
    public String message;

    @NameInMap("PostPaidInstanceCount")
    public Integer postPaidInstanceCount;

    @NameInMap("PrePaidInstanceCount")
    public Integer prePaidInstanceCount;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Vendor")
    public String vendor;

    public static Resource build(java.util.Map<String, ?> map) throws Exception {
        Resource self = new Resource();
        return TeaModel.build(map, self);
    }

    public Resource setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public Resource setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public Resource setCpuUsed(Integer cpuUsed) {
        this.cpuUsed = cpuUsed;
        return this;
    }
    public Integer getCpuUsed() {
        return this.cpuUsed;
    }

    public Resource setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Resource setExtraData(java.util.Map<String, ?> extraData) {
        this.extraData = extraData;
        return this;
    }
    public java.util.Map<String, ?> getExtraData() {
        return this.extraData;
    }

    public Resource setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public Resource setGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }
    public Integer getGpuCount() {
        return this.gpuCount;
    }

    public Resource setGpuUsed(Float gpuUsed) {
        this.gpuUsed = gpuUsed;
        return this;
    }
    public Float getGpuUsed() {
        return this.gpuUsed;
    }

    public Resource setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public Resource setInstanceMaxAllocatableCPU(Integer instanceMaxAllocatableCPU) {
        this.instanceMaxAllocatableCPU = instanceMaxAllocatableCPU;
        return this;
    }
    public Integer getInstanceMaxAllocatableCPU() {
        return this.instanceMaxAllocatableCPU;
    }

    public Resource setInstanceMaxAllocatableGPU(Float instanceMaxAllocatableGPU) {
        this.instanceMaxAllocatableGPU = instanceMaxAllocatableGPU;
        return this;
    }
    public Float getInstanceMaxAllocatableGPU() {
        return this.instanceMaxAllocatableGPU;
    }

    public Resource setInstanceMaxAllocatableMemory(Integer instanceMaxAllocatableMemory) {
        this.instanceMaxAllocatableMemory = instanceMaxAllocatableMemory;
        return this;
    }
    public Integer getInstanceMaxAllocatableMemory() {
        return this.instanceMaxAllocatableMemory;
    }

    public Resource setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public Resource setMemoryUsed(Integer memoryUsed) {
        this.memoryUsed = memoryUsed;
        return this;
    }
    public Integer getMemoryUsed() {
        return this.memoryUsed;
    }

    public Resource setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Resource setPostPaidInstanceCount(Integer postPaidInstanceCount) {
        this.postPaidInstanceCount = postPaidInstanceCount;
        return this;
    }
    public Integer getPostPaidInstanceCount() {
        return this.postPaidInstanceCount;
    }

    public Resource setPrePaidInstanceCount(Integer prePaidInstanceCount) {
        this.prePaidInstanceCount = prePaidInstanceCount;
        return this;
    }
    public Integer getPrePaidInstanceCount() {
        return this.prePaidInstanceCount;
    }

    public Resource setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public Resource setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public Resource setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public Resource setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Resource setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public Resource setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
