// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveNodePoolNodesShrinkRequest extends TeaModel {
    @NameInMap("drain_node")
    public Boolean drainNode;

    @NameInMap("nodes")
    public String nodesShrink;

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
