// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class CreateVersionPackageLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVersionPackageLicenseResponseBody body;

    public static CreateVersionPackageLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionPackageLicenseResponse self = new CreateVersionPackageLicenseResponse();
        return TeaModel.build(map, self);
    }

    public CreateVersionPackageLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVersionPackageLicenseResponse setBody(CreateVersionPackageLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVersionPackageLicenseResponseBody getBody() {
        return this.body;
    }

}
