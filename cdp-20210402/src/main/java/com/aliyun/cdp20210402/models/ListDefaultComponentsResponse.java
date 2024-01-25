// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListDefaultComponentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDefaultComponentsResponseBody body;

    public static ListDefaultComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultComponentsResponse self = new ListDefaultComponentsResponse();
        return TeaModel.build(map, self);
    }

    public ListDefaultComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDefaultComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDefaultComponentsResponse setBody(ListDefaultComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDefaultComponentsResponseBody getBody() {
        return this.body;
    }

}
