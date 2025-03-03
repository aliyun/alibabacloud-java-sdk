// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class StopNodesShrinkRequest extends TeaModel {
    /**
     * <p>Whether to allow skipping failed node tasks, default value is False.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    /**
     * <p>List of nodes.</p>
     */
    @NameInMap("Nodes")
    public String nodesShrink;

    public static StopNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopNodesShrinkRequest self = new StopNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopNodesShrinkRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public StopNodesShrinkRequest setNodesShrink(String nodesShrink) {
        this.nodesShrink = nodesShrink;
        return this;
    }
    public String getNodesShrink() {
        return this.nodesShrink;
    }

}
