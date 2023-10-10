// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolRequest extends TeaModel {
    /**
     * <p>The number of worker nodes that you want to add. You can add at most 500 nodes in one API call. The maximum number of nodes that can be added is limited by the quota of nodes in the cluster.</p>
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
