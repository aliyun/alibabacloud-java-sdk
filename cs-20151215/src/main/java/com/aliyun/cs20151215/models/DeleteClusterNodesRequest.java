// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all pods from the nodes you want to remove. Valid values:</p>
     * <ul>
     * <li><code>true</code>: removes all pods automatically.</li>
     * <li><code>false</code>: skips removing pods.</li>
     * </ul>
     * <p>Default value: <code>false</code></p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>The list of nodes to remove. You must specify the node names used in the cluster, for example, <code>cn-hangzhou.192.168.xx.xx</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>Specifies whether to release the ECS instances. Valid values:</p>
     * <ul>
     * <li><code>true</code>: releases the ECS instances.</li>
     * <li><code>false</code>: retains the ECS instances.</li>
     * </ul>
     * <p>Default value: <code>false</code></p>
     * <p>**</p>
     * <p><strong>Notes</strong> Unsupported for subscription ECS instances.</p>
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
