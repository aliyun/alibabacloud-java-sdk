// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RedirectTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RedirectTaskResponseBody body;

    public static RedirectTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RedirectTaskResponse self = new RedirectTaskResponse();
        return TeaModel.build(map, self);
    }

    public RedirectTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RedirectTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RedirectTaskResponse setBody(RedirectTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RedirectTaskResponseBody getBody() {
        return this.body;
    }

}
