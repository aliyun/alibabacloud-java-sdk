// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEventSubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventSubResponseBody body;

    public static ListEventSubResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventSubResponse self = new ListEventSubResponse();
        return TeaModel.build(map, self);
    }

    public ListEventSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventSubResponse setBody(ListEventSubResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventSubResponseBody getBody() {
        return this.body;
    }

}
