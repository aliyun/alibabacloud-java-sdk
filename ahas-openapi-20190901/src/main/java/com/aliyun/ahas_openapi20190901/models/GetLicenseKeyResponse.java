// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetLicenseKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLicenseKeyResponseBody body;

    public static GetLicenseKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseKeyResponse self = new GetLicenseKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetLicenseKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLicenseKeyResponse setBody(GetLicenseKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLicenseKeyResponseBody getBody() {
        return this.body;
    }

}
