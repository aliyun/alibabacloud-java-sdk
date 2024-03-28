// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ReleaseProduceAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseProduceAuthorizationResponseBody body;

    public static ReleaseProduceAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseProduceAuthorizationResponse self = new ReleaseProduceAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseProduceAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseProduceAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseProduceAuthorizationResponse setBody(ReleaseProduceAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseProduceAuthorizationResponseBody getBody() {
        return this.body;
    }

}
