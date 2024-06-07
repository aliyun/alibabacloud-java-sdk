// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAxnResponseBody body;

    public static BindAxnResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxnResponse self = new BindAxnResponse();
        return TeaModel.build(map, self);
    }

    public BindAxnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAxnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAxnResponse setBody(BindAxnResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxnResponseBody getBody() {
        return this.body;
    }

}
