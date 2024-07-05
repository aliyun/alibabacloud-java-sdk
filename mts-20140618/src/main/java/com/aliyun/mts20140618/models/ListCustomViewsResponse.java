// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomViewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomViewsResponseBody body;

    public static ListCustomViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomViewsResponse self = new ListCustomViewsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomViewsResponse setBody(ListCustomViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomViewsResponseBody getBody() {
        return this.body;
    }

}
