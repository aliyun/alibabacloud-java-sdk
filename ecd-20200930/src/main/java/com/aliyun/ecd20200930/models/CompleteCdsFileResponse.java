// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CompleteCdsFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteCdsFileResponseBody body;

    public static CompleteCdsFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteCdsFileResponse self = new CompleteCdsFileResponse();
        return TeaModel.build(map, self);
    }

    public CompleteCdsFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteCdsFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteCdsFileResponse setBody(CompleteCdsFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteCdsFileResponseBody getBody() {
        return this.body;
    }

}
