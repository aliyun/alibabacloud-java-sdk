// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetLicenseResponse setBody(GetLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLicenseResponseBody getBody() {
        return this.body;
    }

}
