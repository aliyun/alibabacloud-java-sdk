// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesShrinkRequest extends TeaModel {
    /**
     * <p>Whether to remove concurrently.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("concurrency")
    public Boolean concurrency;

    /**
     * <p>Specifies whether to drain the nodes that you want to remove. Valid values:</p>
     * <ul>
     * <li>true: drain the nodes that you want to remove.</li>
     * <li>false: do not drain the nodes that you want to remove.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>A list of instances that you want to remove.</p>
     */
    @NameInMap("instance_ids")
    public String instanceIdsShrink;

    /**
     * <p>This parameter is deprecated.</p>
     * <p>A list of nodes that you want to remove.</p>
     * <blockquote>
     * <p> This parameter is deprecated. Use instance_ids instead.</p>
     * </blockquote>
     */
    @NameInMap("nodes")
    @Deprecated
    public String nodesShrink;

    /**
     * <p>Specifies whether to release the nodes after they are removed. Valid values:</p>
     * <ul>
     * <li>true: release the nodes after they are removed.</li>
     * <li>false: do not release the nodes after they are removed.</li>
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
