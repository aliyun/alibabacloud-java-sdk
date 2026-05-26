// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserPoolsResponseBody body;

    public static ListUserPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserPoolsResponse self = new ListUserPoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserPoolsResponse setBody(ListUserPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserPoolsResponseBody getBody() {
        return this.body;
    }

}
