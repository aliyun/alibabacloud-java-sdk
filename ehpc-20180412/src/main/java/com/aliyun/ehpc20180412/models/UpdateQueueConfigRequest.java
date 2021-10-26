// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UpdateQueueConfigRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ComputeInstanceType")
    public String computeInstanceType;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static UpdateQueueConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQueueConfigRequest self = new UpdateQueueConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQueueConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateQueueConfigRequest setComputeInstanceType(String computeInstanceType) {
        this.computeInstanceType = computeInstanceType;
        return this;
    }
    public String getComputeInstanceType() {
        return this.computeInstanceType;
    }

    public UpdateQueueConfigRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public UpdateQueueConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
