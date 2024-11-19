// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CopyDentryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyDentryResponseBody body;

    public static CopyDentryResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyDentryResponse self = new CopyDentryResponse();
        return TeaModel.build(map, self);
    }

    public CopyDentryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyDentryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyDentryResponse setBody(CopyDentryResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyDentryResponseBody getBody() {
        return this.body;
    }

}
