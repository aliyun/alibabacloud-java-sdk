// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CpuCount")
    public Integer cpuCount;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExtraData")
    public java.util.Map<String, ?> extraData;

    @NameInMap("GpuCount")
    public Integer gpuCount;

    @NameInMap("InstanceCount")
    public Integer instanceCount;

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

    public Resource setGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }
    public Integer getGpuCount() {
        return this.gpuCount;
    }

    public Resource setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
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

}
