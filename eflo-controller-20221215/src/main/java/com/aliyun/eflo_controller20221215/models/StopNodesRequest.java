// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class StopNodesRequest extends TeaModel {
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
    public java.util.List<String> nodes;

    public static StopNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopNodesRequest self = new StopNodesRequest();
        return TeaModel.build(map, self);
    }

    public StopNodesRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public StopNodesRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

}
