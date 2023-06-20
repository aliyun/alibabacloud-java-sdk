// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesShrinkRequest extends TeaModel {
    /**
     * <p>true</p>
     */
    @NameInMap("drain_node")
    public Boolean drainNode;

    /**
     * <p>i-bp1c70fqbv1nlu9xxxxx</p>
     */
    @NameInMap("instance_ids")
    public String instanceIdsShrink;

    /**
     * <p>cn-hangzhou.172.16.xxx.xxx</p>
     */
    @NameInMap("nodes")
    public String nodesShrink;

    /**
     * <p>true</p>
     */
    @NameInMap("release_node")
    public Boolean releaseNode;

    public static RemoveNodePoolNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveNodePoolNodesShrinkRequest self = new RemoveNodePoolNodesShrinkRequest();
        return TeaModel.build(map, self);
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
