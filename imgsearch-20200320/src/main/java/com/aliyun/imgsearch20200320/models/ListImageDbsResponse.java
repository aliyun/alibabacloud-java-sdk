// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class ListImageDbsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListImageDbsResponseBody body;

    public static ListImageDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageDbsResponse self = new ListImageDbsResponse();
        return TeaModel.build(map, self);
    }

    public ListImageDbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageDbsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageDbsResponse setBody(ListImageDbsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageDbsResponseBody getBody() {
        return this.body;
    }

}
