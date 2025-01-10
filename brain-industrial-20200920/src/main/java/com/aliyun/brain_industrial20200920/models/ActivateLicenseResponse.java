// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ActivateLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateLicenseResponseBody body;

    public static ActivateLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseResponse self = new ActivateLicenseResponse();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateLicenseResponse setBody(ActivateLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateLicenseResponseBody getBody() {
        return this.body;
    }

}
