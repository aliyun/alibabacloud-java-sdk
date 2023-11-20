// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveClusterNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to evict all pods from the nodes that you want to remove.</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>The list of nodes to be removed.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>Specifies whether to release the Elastic Compute Service (ECS) instances when they are removed from the cluster.</p>
     */
    @NameInMap("release_node")
    public Boolean releaseNode;

    public static RemoveClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterNodesRequest self = new RemoveClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveClusterNodesRequest setDrainNode(Boolean drainNode) {
        this.drainNode = drainNode;
        return this;
    }
    public Boolean getDrainNode() {
        return this.drainNode;
    }

    public RemoveClusterNodesRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public RemoveClusterNodesRequest setReleaseNode(Boolean releaseNode) {
        this.releaseNode = releaseNode;
        return this;
    }
    public Boolean getReleaseNode() {
        return this.releaseNode;
    }

}
