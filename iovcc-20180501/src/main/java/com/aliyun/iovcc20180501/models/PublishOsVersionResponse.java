// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PublishOsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PublishOsVersionResponseBody body;

    public static PublishOsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishOsVersionResponse self = new PublishOsVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishOsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishOsVersionResponse setBody(PublishOsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishOsVersionResponseBody getBody() {
        return this.body;
    }

}
