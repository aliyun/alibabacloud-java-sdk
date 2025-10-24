// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ChangeNodeGroupShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    @NameInMap("Nodes")
    public String nodesShrink;

    /**
     * <strong>example:</strong>
     * <p>i234242342342</p>
     */
    @NameInMap("TargetNodeGroupId")
    public String targetNodeGroupId;

    public static ChangeNodeGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeNodeGroupShrinkRequest self = new ChangeNodeGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeNodeGroupShrinkRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public ChangeNodeGroupShrinkRequest setNodesShrink(String nodesShrink) {
        this.nodesShrink = nodesShrink;
        return this;
    }
    public String getNodesShrink() {
        return this.nodesShrink;
    }

    public ChangeNodeGroupShrinkRequest setTargetNodeGroupId(String targetNodeGroupId) {
        this.targetNodeGroupId = targetNodeGroupId;
        return this;
    }
    public String getTargetNodeGroupId() {
        return this.targetNodeGroupId;
    }

}
