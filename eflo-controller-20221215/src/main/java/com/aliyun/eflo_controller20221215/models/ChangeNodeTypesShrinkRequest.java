// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ChangeNodeTypesShrinkRequest extends TeaModel {
    @NameInMap("NodeIds")
    public String nodeIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>standard</p>
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
