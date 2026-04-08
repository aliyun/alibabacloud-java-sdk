// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class InvokeActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeActionResponseBody body;

    public static InvokeActionResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeActionResponse self = new InvokeActionResponse();
        return TeaModel.build(map, self);
    }

    public InvokeActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeActionResponse setBody(InvokeActionResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeActionResponseBody getBody() {
        return this.body;
    }

}
