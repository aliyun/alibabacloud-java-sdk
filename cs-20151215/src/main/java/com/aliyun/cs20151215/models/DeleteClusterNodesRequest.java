// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesRequest extends TeaModel {
    /**
     * <p>Whether to automatically drain Pods on the node. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Automatically drain Pods on the node.</li>
     * <li><code>false</code>: Do not automatically drain Pods on the node.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>List of nodes to remove. The node names must be the names of the nodes in the cluster, for example: <code>cn-hangzhou.192.168.xx.xx</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>Whether to simultaneously remove ECS instances. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Simultaneously remove ECS instances.</li>
     * <li><code>false</code>: Retain ECS instances.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <blockquote>
     * <p>Simultaneous removal of ECS instances is not supported when the nodes are subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("release_node")
    public Boolean releaseNode;

    public static DeleteClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodesRequest self = new DeleteClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodesRequest setDrainNode(Boolean drainNode) {
        this.drainNode = drainNode;
        return this;
    }
    public Boolean getDrainNode() {
        return this.drainNode;
    }

    public DeleteClusterNodesRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public DeleteClusterNodesRequest setReleaseNode(Boolean releaseNode) {
        this.releaseNode = releaseNode;
        return this;
    }
    public Boolean getReleaseNode() {
        return this.releaseNode;
    }

}
