// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRoutersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransitRoutersResponseBody body;

    public static ListTransitRoutersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRoutersResponse self = new ListTransitRoutersResponse();
        return TeaModel.build(map, self);
    }

    public ListTransitRoutersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransitRoutersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransitRoutersResponse setBody(ListTransitRoutersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransitRoutersResponseBody getBody() {
        return this.body;
    }

}
