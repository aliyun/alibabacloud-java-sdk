// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    /**
     * <p>The ID of the cluster where the resource group is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The total number of CPU cores in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The number of used CPU cores in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("CpuUsed")
    public Integer cpuUsed;

    /**
     * <p>The time the resource group was created, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-26T17:52:49Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtraData")
    public java.util.Map<String, ?> extraData;

    /**
     * <p>The features supported by the resource group.</p>
     */
    @NameInMap("Features")
    public java.util.List<String> features;

    /**
     * <p>The total number of GPUs in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GpuCount")
    public Integer gpuCount;

    /**
     * <p>The number of used GPUs in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GpuUsed")
    public Float gpuUsed;

    /**
     * <p>The total number of instances (prepaid and postpaid) in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The maximum number of allocatable CPU cores per node.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("InstanceMaxAllocatableCPU")
    public Integer instanceMaxAllocatableCPU;

    /**
     * <p>The maximum number of allocatable GPUs per node.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("InstanceMaxAllocatableGPU")
    public Float instanceMaxAllocatableGPU;

    /**
     * <p>The maximum allocatable memory per node in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("InstanceMaxAllocatableMemory")
    public Integer instanceMaxAllocatableMemory;

    /**
     * <p>The total memory of the resource group, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>8192</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The amount of used memory in the resource group, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("MemoryUsed")
    public Integer memoryUsed;

    /**
     * <p>The latest status message for the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource is ready</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of postpaid instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PostPaidInstanceCount")
    public Integer postPaidInstanceCount;

    /**
     * <p>The number of prepaid instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PrePaidInstanceCount")
    public Integer prePaidInstanceCount;

    /**
     * <p>The unique identifier of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-asdasdasd</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>iot</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource group. Valid values:</p>
     * <ul>
     * <li><p><code>Dedicated</code>: A dedicated resource group.</p>
     * </li>
     * <li><p><code>SelfManaged</code>: A self-managed resource group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The number of services deployed in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceCount")
    public Integer serviceCount;

    /**
     * <p>The status of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceReady</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time the resource group was last updated, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-02-26T19:52:49Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The usage mode of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>inference</p>
     */
    @NameInMap("UsageMode")
    public String usageMode;

    /**
     * <p>The provider of the compute instances in the resource group, such as ECS.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
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

    public Resource setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }
    public Integer getServiceCount() {
        return this.serviceCount;
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

    public Resource setUsageMode(String usageMode) {
        this.usageMode = usageMode;
        return this;
    }
    public String getUsageMode() {
        return this.usageMode;
    }

    public Resource setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
