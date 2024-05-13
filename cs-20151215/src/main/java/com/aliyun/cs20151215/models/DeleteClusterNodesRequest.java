// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all pods from the nodes that you want to remove. Valid values:</p>
     * <br>
     * <p>*   `true`: removes all pods from the nodes that you want to remove.</p>
     * <p>*   `false`: does not remove pods from the nodes that you want to remove.</p>
     * <br>
     * <p>Default value: `false`.</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>The list of nodes to be removed. You need to specify the name of the nodes used in the cluster, for example, `cn-hangzhou.192.168.0.70`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>Specifies whether to release the Elastic Compute Service (ECS) instances. Valid values:</p>
     * <br>
     * <p>*   `true`: releases the ECS instances.</p>
     * <p>*   `false`: does not release the ECS instances.</p>
     * <br>
     * <p>Default value: `false`.</p>
     * <br>
     * <p>>  You cannot release subscription ECS instances.</p>
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
