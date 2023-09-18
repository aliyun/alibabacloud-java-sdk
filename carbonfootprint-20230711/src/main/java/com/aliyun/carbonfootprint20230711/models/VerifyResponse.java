// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class VerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyResponseBody body;

    public static VerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyResponse self = new VerifyResponse();
        return TeaModel.build(map, self);
    }

    public VerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyResponse setBody(VerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyResponseBody getBody() {
        return this.body;
    }

}
