// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove the nodes concurrently. Valid values:</p>
     * <ul>
     * <li>true: removes the nodes from the scaling group concurrently.</li>
     * <li>false: removes the nodes from the scaling group sequentially.</li>
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
     * <li>true: drains the nodes.</li>
     * <li>false: does not drain the nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>The list of instances to remove.</p>
     */
    @NameInMap("instance_ids")
    public java.util.List<String> instanceIds;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>The list of nodes to remove.</p>
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
     * <li>true: releases the nodes.</li>
     * <li>false: does not release the nodes.</li>
     * </ul>
     * <p>Subscription nodes are not automatically released when you remove them. Automatic release subscription nodes, <a href="https://www.alibabacloud.com/help/en/ecs/change-the-billing-method-of-an-instance-from-subscription-to-pay-as-you-go-1">change the billing method of the nodes from subscription to pay-as-you-go</a> and then release them in the ECS console.</p>
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
