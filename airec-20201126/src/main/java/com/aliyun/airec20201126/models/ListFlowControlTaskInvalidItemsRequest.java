// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskInvalidItemsRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<String> body;

    public static ListFlowControlTaskInvalidItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskInvalidItemsRequest self = new ListFlowControlTaskInvalidItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskInvalidItemsRequest setBody(java.util.List<String> body) {
        this.body = body;
        return this;
    }
    public java.util.List<String> getBody() {
        return this.body;
    }

}
