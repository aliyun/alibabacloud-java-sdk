// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListListenersResponseBody body;

    public static ListListenersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListListenersResponse self = new ListListenersResponse();
        return TeaModel.build(map, self);
    }

    public ListListenersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListListenersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListListenersResponse setBody(ListListenersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListListenersResponseBody getBody() {
        return this.body;
    }

}
