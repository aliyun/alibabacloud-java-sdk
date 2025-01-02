// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ShrinkClusterShrinkRequest extends TeaModel {
    /**
     * <p>Cluster ID</p>
     * 
     * <strong>example:</strong>
     * <p>i15dfa12e8f27c44f4a006c2c8bb</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Whether to allow skipping failed node tasks, default value is False</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    /**
     * <p>Node group information</p>
     */
    @NameInMap("NodeGroups")
    public String nodeGroupsShrink;

    public static ShrinkClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ShrinkClusterShrinkRequest self = new ShrinkClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ShrinkClusterShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ShrinkClusterShrinkRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public ShrinkClusterShrinkRequest setNodeGroupsShrink(String nodeGroupsShrink) {
        this.nodeGroupsShrink = nodeGroupsShrink;
        return this;
    }
    public String getNodeGroupsShrink() {
        return this.nodeGroupsShrink;
    }

}
