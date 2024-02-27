// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class LicenseAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LicenseAuthResponseBody body;

    public static LicenseAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        LicenseAuthResponse self = new LicenseAuthResponse();
        return TeaModel.build(map, self);
    }

    public LicenseAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LicenseAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LicenseAuthResponse setBody(LicenseAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public LicenseAuthResponseBody getBody() {
        return this.body;
    }

}
