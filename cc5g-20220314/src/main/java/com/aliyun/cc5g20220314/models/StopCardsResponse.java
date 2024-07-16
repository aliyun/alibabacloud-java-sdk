// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class StopCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopCardsResponseBody body;

    public static StopCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCardsResponse self = new StopCardsResponse();
        return TeaModel.build(map, self);
    }

    public StopCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCardsResponse setBody(StopCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCardsResponseBody getBody() {
        return this.body;
    }

}
