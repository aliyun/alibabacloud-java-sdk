// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateOsVersionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOsVersionStatusResponseBody body;

    public static UpdateOsVersionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionStatusResponse self = new UpdateOsVersionStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOsVersionStatusResponse setBody(UpdateOsVersionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOsVersionStatusResponseBody getBody() {
        return this.body;
    }

}
