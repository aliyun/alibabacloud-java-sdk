// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RemoveClusterNodesBody extends TeaModel {
    @NameInMap("release_node")
    public Boolean releaseNode;

    @NameInMap("drain_node")
    public Boolean drainNode;

    @NameInMap("nodes")
    public java.util.List<RemoveClusterNodesBodyNodes> nodes;

    public static RemoveClusterNodesBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterNodesBody self = new RemoveClusterNodesBody();
        return TeaModel.build(map, self);
    }

    public static class RemoveClusterNodesBodyNodes extends TeaModel {
        @NameInMap("node_name")
        public String nodeName;

        public static RemoveClusterNodesBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            RemoveClusterNodesBodyNodes self = new RemoveClusterNodesBodyNodes();
            return TeaModel.build(map, self);
        }

    }

}
