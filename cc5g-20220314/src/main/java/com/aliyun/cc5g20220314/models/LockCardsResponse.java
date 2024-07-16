// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class LockCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
