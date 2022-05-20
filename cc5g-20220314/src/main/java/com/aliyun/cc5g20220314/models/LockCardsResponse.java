// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class LockCardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LockCardsResponseBody body;

    public static LockCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        LockCardsResponse self = new LockCardsResponse();
        return TeaModel.build(map, self);
    }

    public LockCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LockCardsResponse setBody(LockCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public LockCardsResponseBody getBody() {
        return this.body;
    }

}
