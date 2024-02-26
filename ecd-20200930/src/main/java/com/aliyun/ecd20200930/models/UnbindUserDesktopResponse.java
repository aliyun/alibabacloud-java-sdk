// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UnbindUserDesktopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindUserDesktopResponseBody body;

    public static UnbindUserDesktopResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindUserDesktopResponse self = new UnbindUserDesktopResponse();
        return TeaModel.build(map, self);
    }

    public UnbindUserDesktopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindUserDesktopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindUserDesktopResponse setBody(UnbindUserDesktopResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindUserDesktopResponseBody getBody() {
        return this.body;
    }

}
