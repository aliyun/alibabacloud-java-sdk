// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomizedVoicesResponseBody body;

    public static ListCustomizedVoicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoicesResponse self = new ListCustomizedVoicesResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomizedVoicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomizedVoicesResponse setBody(ListCustomizedVoicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomizedVoicesResponseBody getBody() {
        return this.body;
    }

}
