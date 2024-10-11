// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowControlTaskResponseBody body;

    public static ListFlowControlTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskResponse self = new ListFlowControlTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowControlTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowControlTaskResponse setBody(ListFlowControlTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowControlTaskResponseBody getBody() {
        return this.body;
    }

}
