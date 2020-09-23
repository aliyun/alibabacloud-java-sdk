// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveClusterNodesRequest extends TeaModel {
    // 是否同时释放ECS。
    @NameInMap("release_node")
    public Boolean releaseNode;

    // 是否排空节点上的Pod。
    @NameInMap("drain_node")
    public Boolean drainNode;

    // 要移除的Node列表。
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    public static RemoveClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterNodesRequest self = new RemoveClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveClusterNodesRequest setReleaseNode(Boolean releaseNode) {
        this.releaseNode = releaseNode;
        return this;
    }
    public Boolean getReleaseNode() {
        return this.releaseNode;
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

}
