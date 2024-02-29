// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListTicketsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTicketsResponseBody body;

    public static ListTicketsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsResponse self = new ListTicketsResponse();
        return TeaModel.build(map, self);
    }

    public ListTicketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTicketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTicketsResponse setBody(ListTicketsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTicketsResponseBody getBody() {
        return this.body;
    }

}
