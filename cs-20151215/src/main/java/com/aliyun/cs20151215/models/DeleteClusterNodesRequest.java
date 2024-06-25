// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all pods from the nodes that you want to remove. Valid values:</p>
     * <ul>
     * <li><code>true</code>: removes all pods from the nodes that you want to remove.</li>
     * <li><code>false</code>: does not remove pods from the nodes that you want to remove.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>The list of nodes to be removed. You need to specify the name of the nodes used in the cluster, for example, <code>cn-hangzhou.192.168.0.70</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>Specifies whether to release the Elastic Compute Service (ECS) instances. Valid values:</p>
     * <ul>
     * <li><code>true</code>: releases the ECS instances.</li>
     * <li><code>false</code>: does not release the ECS instances.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <blockquote>
     * <p> You cannot release subscription ECS instances.</p>
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
