// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListFlowsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowsResponseBody body;

    public static ListFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsResponse self = new ListFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowsResponse setBody(ListFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowsResponseBody getBody() {
        return this.body;
    }

}
