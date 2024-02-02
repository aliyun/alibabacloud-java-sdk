// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindLicenseProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindLicenseProductResponseBody body;

    public static UnbindLicenseProductResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindLicenseProductResponse self = new UnbindLicenseProductResponse();
        return TeaModel.build(map, self);
    }

    public UnbindLicenseProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindLicenseProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindLicenseProductResponse setBody(UnbindLicenseProductResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindLicenseProductResponseBody getBody() {
        return this.body;
    }

}
