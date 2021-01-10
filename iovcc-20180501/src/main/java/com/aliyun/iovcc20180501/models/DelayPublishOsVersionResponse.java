// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DelayPublishOsVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DelayPublishOsVersionResponseBody body;

    public static DelayPublishOsVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DelayPublishOsVersionResponse self = new DelayPublishOsVersionResponse();
        return TeaModel.build(map, self);
    }

    public DelayPublishOsVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelayPublishOsVersionResponse setBody(DelayPublishOsVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DelayPublishOsVersionResponseBody getBody() {
        return this.body;
    }

}
