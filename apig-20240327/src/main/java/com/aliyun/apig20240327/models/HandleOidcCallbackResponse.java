// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HandleOidcCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandleOidcCallbackResponseBody body;

    public static HandleOidcCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleOidcCallbackResponse self = new HandleOidcCallbackResponse();
        return TeaModel.build(map, self);
    }

    public HandleOidcCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleOidcCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleOidcCallbackResponse setBody(HandleOidcCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleOidcCallbackResponseBody getBody() {
        return this.body;
    }

}
