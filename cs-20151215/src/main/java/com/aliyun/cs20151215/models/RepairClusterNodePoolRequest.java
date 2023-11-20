// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RepairClusterNodePoolRequest extends TeaModel {
    @NameInMap("auto_restart")
    public Boolean autoRestart;

    /**
     * <p>The list of nodes. If you do not specify nodes, all nodes in the node pool are selected.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    public static RepairClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        RepairClusterNodePoolRequest self = new RepairClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public RepairClusterNodePoolRequest setAutoRestart(Boolean autoRestart) {
        this.autoRestart = autoRestart;
        return this;
    }
    public Boolean getAutoRestart() {
        return this.autoRestart;
    }

    public RepairClusterNodePoolRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

}
