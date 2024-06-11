// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallAppResponseBody body;

    public static UninstallAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallAppResponse self = new UninstallAppResponse();
        return TeaModel.build(map, self);
    }

    public UninstallAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallAppResponse setBody(UninstallAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallAppResponseBody getBody() {
        return this.body;
    }

}
