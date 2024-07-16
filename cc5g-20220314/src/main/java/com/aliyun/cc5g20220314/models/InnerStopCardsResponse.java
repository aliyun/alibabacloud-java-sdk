// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class InnerStopCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InnerStopCardsResponseBody body;

    public static InnerStopCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        InnerStopCardsResponse self = new InnerStopCardsResponse();
        return TeaModel.build(map, self);
    }

    public InnerStopCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InnerStopCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InnerStopCardsResponse setBody(InnerStopCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public InnerStopCardsResponseBody getBody() {
        return this.body;
    }

}
