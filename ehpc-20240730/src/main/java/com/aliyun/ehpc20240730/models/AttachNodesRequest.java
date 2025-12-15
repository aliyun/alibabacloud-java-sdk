// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class AttachNodesRequest extends TeaModel {
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
    public AttachNodesRequestComputeNode computeNode;

    /**
     * <p>The name of the queue to which the instance is to be added.</p>
     * 
     * <strong>example:</strong>
     * <p>comp</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    public static AttachNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachNodesRequest self = new AttachNodesRequest();
        return TeaModel.build(map, self);
    }

    public AttachNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AttachNodesRequest setComputeNode(AttachNodesRequestComputeNode computeNode) {
        this.computeNode = computeNode;
        return this;
    }
    public AttachNodesRequestComputeNode getComputeNode() {
        return this.computeNode;
    }

    public AttachNodesRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public static class AttachNodesRequestComputeNode extends TeaModel {
        /**
         * <p>The image ID. This image will be used to replace the original system disk image.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1h765oyqyxxxxxxxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The IDs of ECS instances.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        public static AttachNodesRequestComputeNode build(java.util.Map<String, ?> map) throws Exception {
            AttachNodesRequestComputeNode self = new AttachNodesRequestComputeNode();
            return TeaModel.build(map, self);
        }

        public AttachNodesRequestComputeNode setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public AttachNodesRequestComputeNode setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

    }

}
