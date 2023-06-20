// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterNodePoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the node pool that is created.</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    public static CreateClusterNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterNodePoolResponseBody self = new CreateClusterNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterNodePoolResponseBody setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

}
