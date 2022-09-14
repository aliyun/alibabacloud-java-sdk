// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class ListSopFlowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSopFlowsResponseBody body;

    public static ListSopFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSopFlowsResponse self = new ListSopFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListSopFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSopFlowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSopFlowsResponse setBody(ListSopFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSopFlowsResponseBody getBody() {
        return this.body;
    }

}
