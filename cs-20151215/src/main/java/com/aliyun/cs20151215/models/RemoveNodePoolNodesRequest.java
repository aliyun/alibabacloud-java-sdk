// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to drain the nodes that you want to remove. Valid values:</p>
     * <br>
     * <p>*   true: drain the nodes that you want to remove.</p>
     * <p>*   false: do not drain the nodes that you want to remove.</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>A list of instances that you want to remove.</p>
     */
    @NameInMap("instance_ids")
    public java.util.List<String> instanceIds;

    /**
     * <p>A list of nodes that you want to remove.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>Specifies whether to release the nodes after they are removed. Valid values:</p>
     * <br>
     * <p>*   true: release the nodes after they are removed.</p>
     * <p>*   false: do not release the nodes after they are removed.</p>
     */
    @NameInMap("release_node")
    public Boolean releaseNode;

    public static RemoveNodePoolNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveNodePoolNodesRequest self = new RemoveNodePoolNodesRequest();
        return TeaModel.build(map, self);
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
