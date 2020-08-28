// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesBody extends TeaModel {
    @NameInMap("release_node")
    public String releaseNode;

    @NameInMap("nodes")
    public java.util.List<String> nodes;

    public static DeleteClusterNodesBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodesBody self = new DeleteClusterNodesBody();
        return TeaModel.build(map, self);
    }

}
