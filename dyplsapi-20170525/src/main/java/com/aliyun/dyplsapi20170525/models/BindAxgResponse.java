// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindAxgResponseBody body;

    public static BindAxgResponse build(java.util.Map<String, ?> map) throws Exception {
        BindAxgResponse self = new BindAxgResponse();
        return TeaModel.build(map, self);
    }

    public BindAxgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindAxgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindAxgResponse setBody(BindAxgResponseBody body) {
        this.body = body;
        return this;
    }
    public BindAxgResponseBody getBody() {
        return this.body;
    }

}
