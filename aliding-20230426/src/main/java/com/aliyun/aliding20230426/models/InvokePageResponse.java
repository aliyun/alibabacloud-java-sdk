// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokePageResponseBody body;

    public static InvokePageResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokePageResponse self = new InvokePageResponse();
        return TeaModel.build(map, self);
    }

    public InvokePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokePageResponse setBody(InvokePageResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokePageResponseBody getBody() {
        return this.body;
    }

}
