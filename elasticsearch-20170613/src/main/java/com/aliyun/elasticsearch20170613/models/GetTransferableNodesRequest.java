// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetTransferableNodesRequest extends TeaModel {
    @NameInMap("nodeType")
    public String nodeType;

    @NameInMap("count")
    public Integer count;

    public static GetTransferableNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransferableNodesRequest self = new GetTransferableNodesRequest();
        return TeaModel.build(map, self);
    }

    public GetTransferableNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public GetTransferableNodesRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

}
