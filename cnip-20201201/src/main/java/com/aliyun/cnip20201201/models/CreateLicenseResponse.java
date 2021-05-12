// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLicenseResponseBody body;

    public static CreateLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLicenseResponse self = new CreateLicenseResponse();
        return TeaModel.build(map, self);
    }

    public CreateLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLicenseResponse setBody(CreateLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLicenseResponseBody getBody() {
        return this.body;
    }

}
