// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ChangeNodeTypesShrinkRequest extends TeaModel {
    /**
     * <p>A list of node IDs. You can specify a maximum of 10 nodes in a single request.</p>
     */
    @NameInMap("NodeIds")
    public String nodeIdsShrink;

    /**
     * <p>The node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-enhanced</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    public static ChangeNodeTypesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeNodeTypesShrinkRequest self = new ChangeNodeTypesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeNodeTypesShrinkRequest setNodeIdsShrink(String nodeIdsShrink) {
        this.nodeIdsShrink = nodeIdsShrink;
        return this;
    }
    public String getNodeIdsShrink() {
        return this.nodeIdsShrink;
    }

    public ChangeNodeTypesShrinkRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
