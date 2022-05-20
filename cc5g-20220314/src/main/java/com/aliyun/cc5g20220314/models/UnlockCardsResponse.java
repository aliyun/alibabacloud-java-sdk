// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UnlockCardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnlockCardsResponseBody body;

    public static UnlockCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockCardsResponse self = new UnlockCardsResponse();
        return TeaModel.build(map, self);
    }

    public UnlockCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnlockCardsResponse setBody(UnlockCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockCardsResponseBody getBody() {
        return this.body;
    }

}
