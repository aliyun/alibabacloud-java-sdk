// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster to which the resource group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The total number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    @NameInMap("CpuUsed")
    public Integer cpuUsed;

    /**
     * <p>The time when the resource group was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-19T14:19:42Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The additional information, such as the connection status of a virtual private cloud (VPC) and the log status of Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;vswitch_id&quot;:&quot;vsw-bp17uo6xebcusy****&quot;,&quot;gpu_share&quot;:true,&quot;aux_vswitch_id_list&quot;:[&quot;vsw-bp13b3pvjap3vxn****&quot;,&quot;vsw-bp1nls8o5hk8mt8*****&quot;],&quot;security_group_id&quot;:&quot;sg-bp1j1z7297hcink*****&quot;,&quot;vpc_id&quot;:&quot;vpc-bp1kjr3rfyhx01*****&quot;,&quot;destination_cidr&quot;:&quot;172.16.0.12/28&quot;,&quot;role_arn&quot;:&quot;acs:ram::1157703270*****:role/AliyunServiceRoleForPaiEas&quot;,&quot;sls_project&quot;:&quot;&quot;,&quot;sls_logstore&quot;:&quot;&quot;,&quot;sls_status&quot;:&quot;ResourceReady&quot;,&quot;sls_message&quot;:&quot;&quot;,&quot;update_time&quot;:&quot;&quot;}</p>
     */
    @NameInMap("ExtraData")
    public String extraData;

    /**
     * <p>The total number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GpuCount")
    public Integer gpuCount;

    @NameInMap("GpuUsed")
    public Float gpuUsed;

    /**
     * <p>The total number of instances in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("MemoryUsed")
    public Integer memoryUsed;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource is ready</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the resource group owner.</p>
     * 
     * <strong>example:</strong>
     * <p>14401087478****</p>
     */
    @NameInMap("OwnerUid")
    public String ownerUid;

    /**
     * <p>The total number of pay-as-you-go instances in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PostPaidInstanceCount")
    public Integer postPaidInstanceCount;

    /**
     * <p>The total number of subscription instances in the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PrePaidInstanceCount")
    public Integer prePaidInstanceCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>902976F2-6FAF-5404-8A4D-6CC223***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the Elastic Algorithm Service (EAS) resource.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-glkfpsxuw57x1h*****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the EAS resource.</p>
     * 
     * <strong>example:</strong>
     * <p>my-resouce****</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource group. Valid values:</p>
     * <ul>
     * <li>Dedicated: the dedicated resource group.</li>
     * <li>SelfManaged: the self-managed resource group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The state of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceReady</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the resource group was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-02-24T11:52:17Z</p>
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

    public DescribeResourceResponseBody setCpuUsed(Integer cpuUsed) {
        this.cpuUsed = cpuUsed;
        return this;
    }
    public Integer getCpuUsed() {
        return this.cpuUsed;
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

    public DescribeResourceResponseBody setGpuUsed(Float gpuUsed) {
        this.gpuUsed = gpuUsed;
        return this;
    }
    public Float getGpuUsed() {
        return this.gpuUsed;
    }

    public DescribeResourceResponseBody setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public DescribeResourceResponseBody setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DescribeResourceResponseBody setMemoryUsed(Integer memoryUsed) {
        this.memoryUsed = memoryUsed;
        return this;
    }
    public Integer getMemoryUsed() {
        return this.memoryUsed;
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
