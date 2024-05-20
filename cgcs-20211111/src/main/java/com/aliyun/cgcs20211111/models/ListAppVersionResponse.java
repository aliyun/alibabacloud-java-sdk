// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppVersionResponseBody body;

    public static ListAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionResponse self = new ListAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppVersionResponse setBody(ListAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppVersionResponseBody getBody() {
        return this.body;
    }

}
