// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterNodePoolRequest extends TeaModel {
    // 扩容节点数量
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
