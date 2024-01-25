// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListOperationsRequest extends TeaModel {
    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("ParentOperationNodeId")
    public String parentOperationNodeId;

    public static ListOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationsRequest self = new ListOperationsRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationsRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public ListOperationsRequest setParentOperationNodeId(String parentOperationNodeId) {
        this.parentOperationNodeId = parentOperationNodeId;
        return this;
    }
    public String getParentOperationNodeId() {
        return this.parentOperationNodeId;
    }

}
