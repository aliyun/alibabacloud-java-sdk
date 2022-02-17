// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEnvironmentLicenseResponseBody body;

    public static GetEnvironmentLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentLicenseResponse self = new GetEnvironmentLicenseResponse();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnvironmentLicenseResponse setBody(GetEnvironmentLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnvironmentLicenseResponseBody getBody() {
        return this.body;
    }

}
