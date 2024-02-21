// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class UninstallApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallApplicationResponseBody body;

    public static UninstallApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallApplicationResponse self = new UninstallApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UninstallApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallApplicationResponse setBody(UninstallApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallApplicationResponseBody getBody() {
        return this.body;
    }

}
