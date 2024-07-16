// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class RebindCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebindCardsResponseBody body;

    public static RebindCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        RebindCardsResponse self = new RebindCardsResponse();
        return TeaModel.build(map, self);
    }

    public RebindCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebindCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebindCardsResponse setBody(RebindCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public RebindCardsResponseBody getBody() {
        return this.body;
    }

}
