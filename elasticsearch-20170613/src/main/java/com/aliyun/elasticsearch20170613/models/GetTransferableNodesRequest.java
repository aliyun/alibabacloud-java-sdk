// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetTransferableNodesRequest extends TeaModel {
    /**
     * <p>The number of nodes to be migrated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The type of nodes.<strong>WORKER</strong>represents a hot node,<strong>WORKER_WARM</strong> represents a warm node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WORKER</p>
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
