// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class UninstallClientResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UninstallClientResponseBody body;

    public static UninstallClientResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallClientResponse self = new UninstallClientResponse();
        return TeaModel.build(map, self);
    }

    public UninstallClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallClientResponse setBody(UninstallClientResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallClientResponseBody getBody() {
        return this.body;
    }

}
