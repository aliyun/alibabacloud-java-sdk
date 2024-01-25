// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateEnvironmentLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEnvironmentLicenseResponseBody body;

    public static CreateEnvironmentLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentLicenseResponse self = new CreateEnvironmentLicenseResponse();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEnvironmentLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEnvironmentLicenseResponse setBody(CreateEnvironmentLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEnvironmentLicenseResponseBody getBody() {
        return this.body;
    }

}
