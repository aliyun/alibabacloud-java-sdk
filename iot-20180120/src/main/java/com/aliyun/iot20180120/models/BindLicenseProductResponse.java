// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindLicenseProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindLicenseProductResponseBody body;

    public static BindLicenseProductResponse build(java.util.Map<String, ?> map) throws Exception {
        BindLicenseProductResponse self = new BindLicenseProductResponse();
        return TeaModel.build(map, self);
    }

    public BindLicenseProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindLicenseProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindLicenseProductResponse setBody(BindLicenseProductResponseBody body) {
        this.body = body;
        return this;
    }
    public BindLicenseProductResponseBody getBody() {
        return this.body;
    }

}
