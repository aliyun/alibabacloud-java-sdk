// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowControlTaskItemsResponseBody body;

    public static ListFlowControlTaskItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskItemsResponse self = new ListFlowControlTaskItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowControlTaskItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowControlTaskItemsResponse setBody(ListFlowControlTaskItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowControlTaskItemsResponseBody getBody() {
        return this.body;
    }

}
