// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class UnbindResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindResponseBody body;

    public static UnbindResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindResponse self = new UnbindResponse();
        return TeaModel.build(map, self);
    }

    public UnbindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindResponse setBody(UnbindResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindResponseBody getBody() {
        return this.body;
    }

}
