// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddMultiDimTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMultiDimTableResponseBody body;

    public static AddMultiDimTableResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMultiDimTableResponse self = new AddMultiDimTableResponse();
        return TeaModel.build(map, self);
    }

    public AddMultiDimTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMultiDimTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMultiDimTableResponse setBody(AddMultiDimTableResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMultiDimTableResponseBody getBody() {
        return this.body;
    }

}
