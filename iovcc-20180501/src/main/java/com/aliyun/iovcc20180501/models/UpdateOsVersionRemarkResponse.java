// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOsVersionRemarkResponseBody body;

    public static UpdateOsVersionRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionRemarkResponse self = new UpdateOsVersionRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOsVersionRemarkResponse setBody(UpdateOsVersionRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOsVersionRemarkResponseBody getBody() {
        return this.body;
    }

}
