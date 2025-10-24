// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ChangeNodeGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    @NameInMap("Nodes")
    public java.util.List<String> nodes;

    /**
     * <strong>example:</strong>
     * <p>i234242342342</p>
     */
    @NameInMap("TargetNodeGroupId")
    public String targetNodeGroupId;

    public static ChangeNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeNodeGroupRequest self = new ChangeNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeNodeGroupRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public ChangeNodeGroupRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public ChangeNodeGroupRequest setTargetNodeGroupId(String targetNodeGroupId) {
        this.targetNodeGroupId = targetNodeGroupId;
        return this;
    }
    public String getTargetNodeGroupId() {
        return this.targetNodeGroupId;
    }

}
