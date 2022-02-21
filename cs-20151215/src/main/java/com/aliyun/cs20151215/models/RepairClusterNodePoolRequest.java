// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RepairClusterNodePoolRequest extends TeaModel {
    // 节点列表，如果不指定则表示当前节点池内所有节点
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    public static RepairClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        RepairClusterNodePoolRequest self = new RepairClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public RepairClusterNodePoolRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

}
