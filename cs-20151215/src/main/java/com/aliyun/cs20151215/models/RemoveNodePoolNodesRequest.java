// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesRequest extends TeaModel {
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
    public java.util.List<String> instanceIds;

    /**
     * <p>This parameter is deprecated.</p>
     * <p>A list of nodes that you want to remove.</p>
     * <blockquote>
     * <p> This parameter is deprecated. Use instance_ids instead.</p>
     * </blockquote>
     */
    @NameInMap("nodes")
    @Deprecated
    public java.util.List<String> nodes;

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
