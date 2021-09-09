// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateTransferableNodesRequest extends TeaModel {
    @NameInMap("nodeType")
    public String nodeType;

    public static ValidateTransferableNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateTransferableNodesRequest self = new ValidateTransferableNodesRequest();
        return TeaModel.build(map, self);
    }

    public ValidateTransferableNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
