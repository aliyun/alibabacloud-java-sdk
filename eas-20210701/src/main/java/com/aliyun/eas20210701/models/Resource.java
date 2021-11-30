// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    // 资源组所在的集群
    @NameInMap("ClusterId")
    public String clusterId;

    // 资源组CPU数量
    @NameInMap("CpuCount")
    public Integer cpuCount;

    // 资源组创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 资源组自定义数据
    @NameInMap("ExtraData")
    public java.util.Map<String, ?> extraData;

    // 资源组GPU个数
    @NameInMap("GpuCount")
    public Integer gpuCount;

    // 资源组实例个数
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    // 资源组摘要信息
    @NameInMap("Message")
    public String message;

    // 资源组按量付费实例个数
    @NameInMap("PostPaidInstanceCount")
    public Integer postPaidInstanceCount;

    // 资源组预付费实例个数
    @NameInMap("PrePaidInstanceCount")
    public Integer prePaidInstanceCount;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 资源组ID
    @NameInMap("ResourceId")
    public String resourceId;

    // 资源组名字
    @NameInMap("ResourceName")
    public String resourceName;

    // 资源组的状态
    @NameInMap("Status")
    public String status;

    // 资源组更新时间
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

    public Resource setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
