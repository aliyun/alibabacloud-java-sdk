// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster to which the resource group belongs.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The total number of CPU cores.</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The time when the resource group was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The additional information, such as the connection status of a virtual private cloud (VPC) and the log status of Log Service.</p>
     */
    @NameInMap("ExtraData")
    public String extraData;

    /**
     * <p>The total number of GPUs.</p>
     */
    @NameInMap("GpuCount")
    public Integer gpuCount;

    /**
     * <p>The total number of instances in the resource group.</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the resource group owner.</p>
     */
    @NameInMap("OwnerUid")
    public String ownerUid;

    /**
     * <p>The total number of pay-as-you-go instances in the resource group.</p>
     */
    @NameInMap("PostPaidInstanceCount")
    public Integer postPaidInstanceCount;

    /**
     * <p>The total number of subscription instances in the resource group.</p>
     */
    @NameInMap("PrePaidInstanceCount")
    public Integer prePaidInstanceCount;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the Elastic Algorithm Service (EAS) resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the EAS resource.</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <br>
     * <p>- Dedicated</p>
     * <p>- SelfManaged</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The state of the resource group.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the resource group was last updated.</p>
     */
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
