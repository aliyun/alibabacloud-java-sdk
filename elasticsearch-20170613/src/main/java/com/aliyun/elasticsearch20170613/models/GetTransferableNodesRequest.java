// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetTransferableNodesRequest extends TeaModel {
    /**
     * <p>The number of nodes to be migrated.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The type of nodes.**WORKER**represents a hot node,**WORKER_WARM** represents a warm node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    public static GetTransferableNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransferableNodesRequest self = new GetTransferableNodesRequest();
        return TeaModel.build(map, self);
    }

    public GetTransferableNodesRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetTransferableNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
