// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove nodes concurrently.</p>
     * <ul>
     * <li><p>true: Nodes are concurrently removed from the scaling group.</p>
     * </li>
     * <li><p>false: Nodes are sequentially removed from the scaling group.</p>
     * </li>
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
     * <p>The list of instances to remove.</p>
     */
    @NameInMap("instance_ids")
    public String instanceIdsShrink;

    /**
     * <p>[This parameter is deprecated]</p>
     * <p>The list of nodes to remove.</p>
     * <blockquote>
     * <p>Danger: This parameter is deprecated. Use <code>instance_ids</code> instead.</danger>.</p>
     * </blockquote>
     */
    @NameInMap("nodes")
    @Deprecated
    public String nodesShrink;

    /**
     * <p>Specifies whether to release the nodes. Valid values:</p>
     * <ul>
     * <li>true: Release the nodes.</li>
     * <li>false: Do not release the nodes.</li>
     * </ul>
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
