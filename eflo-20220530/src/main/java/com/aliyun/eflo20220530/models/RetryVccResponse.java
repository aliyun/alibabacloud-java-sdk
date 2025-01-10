// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class RetryVccResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryVccResponseBody body;

    public static RetryVccResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryVccResponse self = new RetryVccResponse();
        return TeaModel.build(map, self);
    }

    public RetryVccResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryVccResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryVccResponse setBody(RetryVccResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryVccResponseBody getBody() {
        return this.body;
    }

}
