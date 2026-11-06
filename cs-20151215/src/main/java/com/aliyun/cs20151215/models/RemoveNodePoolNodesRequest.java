// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove nodes concurrently. Valid values:</p>
     * <ul>
     * <li>true: Nodes are removed from the scaling group concurrently.</li>
     * <li>false: Nodes are removed from the scaling group sequentially.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("concurrency")
    public Boolean concurrency;

    /**
     * <p>Specifies whether to drain the nodes. Valid values:</p>
     * <ul>
     * <li>true: Drain the nodes.</li>
     * <li>false: Do not drain the nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>The drain timeout period in seconds. Valid values: (0, 1800]. Default value: 1800. This parameter takes effect only when drain_node is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("drain_timeout_seconds")
    public Long drainTimeoutSeconds;

    /**
     * <p>The list of instances to be removed.</p>
     */
    @NameInMap("instance_ids")
    public java.util.List<String> instanceIds;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>The list of nodes to be removed.</p>
     * <blockquote>
     * <p>Danger: This parameter is deprecated. Use <code>instance_ids</code> instead.</danger></p>
     * </blockquote>
     */
    @NameInMap("nodes")
    @Deprecated
    public java.util.List<String> nodes;

    /**
     * <p>Specifies whether automatic release the nodes. Valid values:</p>
     * <ul>
     * <li>true: Release the nodes.</li>
     * <li>false: Do not release the nodes.</li>
     * </ul>
     * <p>Removing nodes does not automatically release subscription nodes. Automatic release subscription nodes, <a href="https://www.alibabacloud.com/help/en/ecs/change-the-billing-method-of-an-instance-from-subscription-to-pay-as-you-go-1">change the billing method of the nodes from subscription to pay-as-you-go</a>, and then log on to the ECS console automatic release them.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("release_node")
    public Boolean releaseNode;

    public static RemoveNodePoolNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveNodePoolNodesRequest self = new RemoveNodePoolNodesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveNodePoolNodesRequest setConcurrency(Boolean concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Boolean getConcurrency() {
        return this.concurrency;
    }

    public RemoveNodePoolNodesRequest setDrainNode(Boolean drainNode) {
        this.drainNode = drainNode;
        return this;
    }
    public Boolean getDrainNode() {
        return this.drainNode;
    }

    public RemoveNodePoolNodesRequest setDrainTimeoutSeconds(Long drainTimeoutSeconds) {
        this.drainTimeoutSeconds = drainTimeoutSeconds;
        return this;
    }
    public Long getDrainTimeoutSeconds() {
        return this.drainTimeoutSeconds;
    }

    public RemoveNodePoolNodesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    @Deprecated
    public RemoveNodePoolNodesRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public RemoveNodePoolNodesRequest setReleaseNode(Boolean releaseNode) {
        this.releaseNode = releaseNode;
        return this;
    }
    public Boolean getReleaseNode() {
        return this.releaseNode;
    }

}
