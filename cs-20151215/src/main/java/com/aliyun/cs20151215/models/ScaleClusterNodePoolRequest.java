// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The number of nodes to add. For example, if the node pool currently has 2 nodes and you add 2 more, the node pool will have 4 nodes. Due to the node quota limit of the current cluster, you can add up to 500 nodes in a single operation.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("count")
    public Long count;

    public static ScaleClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterNodePoolRequest self = new ScaleClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public ScaleClusterNodePoolRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
