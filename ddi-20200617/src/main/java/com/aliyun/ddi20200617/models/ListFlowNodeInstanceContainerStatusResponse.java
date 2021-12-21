// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowNodeInstanceContainerStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowNodeInstanceContainerStatusResponseBody body;

    public static ListFlowNodeInstanceContainerStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeInstanceContainerStatusResponse self = new ListFlowNodeInstanceContainerStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeInstanceContainerStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowNodeInstanceContainerStatusResponse setBody(ListFlowNodeInstanceContainerStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowNodeInstanceContainerStatusResponseBody getBody() {
        return this.body;
    }

}
