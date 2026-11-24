// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove nodes concurrently. Valid values:</p>
     * <ul>
     * <li>true: Nodes are concurrently removed from the scaling group.</li>
     * <li>false: Nodes are sequentially removed from the scaling group.
     * Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("concurrency")
    public Boolean concurrency;

    /**
     * <p>Specifies whether to drain the nodes. Valid values:</p>
     * <ul>
     * <li>true: Drains the nodes.</li>
     * <li>false: Does not drain the nodes.</li>
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
    public String instanceIdsShrink;

    /**
     * <p><strong>[Deprecated]</strong> The list of removed nodes.</p>
     * <blockquote>
     * <p>Danger: This parameter is deprecated. Use instance_ids instead.</danger></p>
     * </blockquote>
     */
    @NameInMap("nodes")
    @Deprecated
    public String nodesShrink;

    /**
     * <p>Specifies whether automatic release the nodes. Valid values:</p>
     * <ul>
     * <li>true: Releases the nodes.</li>
     * <li>false: Does not release the nodes.</li>
     * </ul>
     * <p>Removing nodes does not automatically release subscription nodes. Automatic release subscription nodes, <a href="https://www.alibabacloud.com/help/en/ecs/change-the-billing-method-of-an-instance-from-subscription-to-pay-as-you-go-1">change the billing method of the nodes from subscription to pay-as-you-go</a> and then log on to the ECS console automatic release them.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("release_node")
    public Boolean releaseNode;

    public static RemoveNodePoolNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveNodePoolNodesShrinkRequest self = new RemoveNodePoolNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveNodePoolNodesShrinkRequest setConcurrency(Boolean concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Boolean getConcurrency() {
        return this.concurrency;
    }

    public RemoveNodePoolNodesShrinkRequest setDrainNode(Boolean drainNode) {
        this.drainNode = drainNode;
        return this;
    }
    public Boolean getDrainNode() {
        return this.drainNode;
    }

    public RemoveNodePoolNodesShrinkRequest setDrainTimeoutSeconds(Long drainTimeoutSeconds) {
        this.drainTimeoutSeconds = drainTimeoutSeconds;
        return this;
    }
    public Long getDrainTimeoutSeconds() {
        return this.drainTimeoutSeconds;
    }

    public RemoveNodePoolNodesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    @Deprecated
    public RemoveNodePoolNodesShrinkRequest setNodesShrink(String nodesShrink) {
        this.nodesShrink = nodesShrink;
        return this;
    }
    public String getNodesShrink() {
        return this.nodesShrink;
    }

    public RemoveNodePoolNodesShrinkRequest setReleaseNode(Boolean releaseNode) {
        this.releaseNode = releaseNode;
        return this;
    }
    public Boolean getReleaseNode() {
        return this.releaseNode;
    }

}
