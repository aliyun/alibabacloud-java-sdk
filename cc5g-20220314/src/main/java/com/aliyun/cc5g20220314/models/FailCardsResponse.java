// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class FailCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FailCardsResponseBody body;

    public static FailCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        FailCardsResponse self = new FailCardsResponse();
        return TeaModel.build(map, self);
    }

    public FailCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FailCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FailCardsResponse setBody(FailCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public FailCardsResponseBody getBody() {
        return this.body;
    }

}
