// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The number of worker nodes that you want to add. For example, the current node pool contains two nodes. After the node pool is scaled out, the node pool contains four nodes. Due to the limit of the node quota, you can add at most 500 nodes in each request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
