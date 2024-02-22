// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutContactResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutContactResponseBody body;

    public static PutContactResponse build(java.util.Map<String, ?> map) throws Exception {
        PutContactResponse self = new PutContactResponse();
        return TeaModel.build(map, self);
    }

    public PutContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutContactResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutContactResponse setBody(PutContactResponseBody body) {
        this.body = body;
        return this;
    }
    public PutContactResponseBody getBody() {
        return this.body;
    }

}
