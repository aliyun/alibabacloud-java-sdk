// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetTransferableNodesRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("count")
    public Integer count;

    @NameInMap("nodeType")
    public String nodeType;

    public static GetTransferableNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransferableNodesRequest self = new GetTransferableNodesRequest();
        return TeaModel.build(map, self);
    }

    public GetTransferableNodesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
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
