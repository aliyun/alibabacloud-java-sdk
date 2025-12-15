// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class AttachNodesShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-xxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The list of compute nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ComputeNode")
    public String computeNodeShrink;

    /**
     * <p>The name of the queue to which the instance is to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>comp</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    public static AttachNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachNodesShrinkRequest self = new AttachNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AttachNodesShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AttachNodesShrinkRequest setComputeNodeShrink(String computeNodeShrink) {
        this.computeNodeShrink = computeNodeShrink;
        return this;
    }
    public String getComputeNodeShrink() {
        return this.computeNodeShrink;
    }

    public AttachNodesShrinkRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
