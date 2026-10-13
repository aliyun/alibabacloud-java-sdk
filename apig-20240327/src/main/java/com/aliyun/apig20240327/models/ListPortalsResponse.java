// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPortalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPortalsResponseBody body;

    public static ListPortalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPortalsResponse self = new ListPortalsResponse();
        return TeaModel.build(map, self);
    }

    public ListPortalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPortalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPortalsResponse setBody(ListPortalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPortalsResponseBody getBody() {
        return this.body;
    }

}
