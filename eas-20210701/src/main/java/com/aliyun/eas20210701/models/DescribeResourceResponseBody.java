// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CpuCount")
    public Integer cpuCount;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExtraData")
    public String extraData;

    @NameInMap("GpuCount")
    public Integer gpuCount;

    @NameInMap("InstanceCount")
    public Integer instanceCount;

    @NameInMap("Message")
    public String message;

    @NameInMap("OwnerUid")
    public String ownerUid;

    @NameInMap("PostPaidInstanceCount")
    public Integer postPaidInstanceCount;

    @NameInMap("PrePaidInstanceCount")
    public Integer prePaidInstanceCount;

    @NameInMap("RequestId")
    public String requestId;

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

    public static DescribeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceResponseBody self = new DescribeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeResourceResponseBody setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public DescribeResourceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeResourceResponseBody setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public DescribeResourceResponseBody setGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }
    public Integer getGpuCount() {
        return this.gpuCount;
    }

    public DescribeResourceResponseBody setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public DescribeResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResourceResponseBody setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }
    public String getOwnerUid() {
        return this.ownerUid;
    }

    public DescribeResourceResponseBody setPostPaidInstanceCount(Integer postPaidInstanceCount) {
        this.postPaidInstanceCount = postPaidInstanceCount;
        return this;
    }
    public Integer getPostPaidInstanceCount() {
        return this.postPaidInstanceCount;
    }

    public DescribeResourceResponseBody setPrePaidInstanceCount(Integer prePaidInstanceCount) {
        this.prePaidInstanceCount = prePaidInstanceCount;
        return this;
    }
    public Integer getPrePaidInstanceCount() {
        return this.prePaidInstanceCount;
    }

    public DescribeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeResourceResponseBody setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DescribeResourceResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeResourceResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
