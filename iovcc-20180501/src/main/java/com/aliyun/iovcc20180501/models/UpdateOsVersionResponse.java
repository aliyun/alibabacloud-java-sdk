// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOsVersionResponseBody body;

    public static UpdateOsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionResponse self = new UpdateOsVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOsVersionResponse setBody(UpdateOsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOsVersionResponseBody getBody() {
        return this.body;
    }

}
