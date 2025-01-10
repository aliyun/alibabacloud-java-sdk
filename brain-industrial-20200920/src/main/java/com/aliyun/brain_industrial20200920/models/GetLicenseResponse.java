// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLicenseResponseBody body;

    public static GetLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseResponse self = new GetLicenseResponse();
        return TeaModel.build(map, self);
    }

    public GetLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLicenseResponse setBody(GetLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLicenseResponseBody getBody() {
        return this.body;
    }

}
