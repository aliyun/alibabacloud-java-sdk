// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class ActivateLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivateLicenseResponseBody body;

    public static ActivateLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseResponse self = new ActivateLicenseResponse();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateLicenseResponse setBody(ActivateLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateLicenseResponseBody getBody() {
        return this.body;
    }

}
