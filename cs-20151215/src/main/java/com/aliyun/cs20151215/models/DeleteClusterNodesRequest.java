// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically drain pods from the nodes. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Automatically drains pods from the nodes.</li>
     * <li><code>false</code>: Does not automatically drain pods from the nodes.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>The drain timeout period in seconds. Valid values: (0, 1800]. If this parameter is not specified, the default value 1800 is used. This parameter takes effect only when drain_node is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("drain_timeout_seconds")
    public Long drainTimeoutSeconds;

    /**
     * <p>The list of nodes to remove. The node name must be the name of the node in the cluster, such as <code>cn-hangzhou.192.168.xx.xx</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>Specifies whether to release the associated ECS instances. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Releases the associated ECS instances.</li>
     * <li><code>false</code>: Retains the associated ECS instances.</li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * <blockquote>
     * <p>When a node is a subscription instance, you cannot release the associated ECS instance.</p>
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

    public DeleteClusterNodesRequest setDrainTimeoutSeconds(Long drainTimeoutSeconds) {
        this.drainTimeoutSeconds = drainTimeoutSeconds;
        return this;
    }
    public Long getDrainTimeoutSeconds() {
        return this.drainTimeoutSeconds;
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
