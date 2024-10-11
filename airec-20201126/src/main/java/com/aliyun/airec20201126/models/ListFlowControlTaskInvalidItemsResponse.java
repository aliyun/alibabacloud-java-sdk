// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskInvalidItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowControlTaskInvalidItemsResponseBody body;

    public static ListFlowControlTaskInvalidItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskInvalidItemsResponse self = new ListFlowControlTaskInvalidItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskInvalidItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowControlTaskInvalidItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowControlTaskInvalidItemsResponse setBody(ListFlowControlTaskInvalidItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowControlTaskInvalidItemsResponseBody getBody() {
        return this.body;
    }

}
