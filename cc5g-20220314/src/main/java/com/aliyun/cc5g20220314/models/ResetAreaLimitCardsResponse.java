// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ResetAreaLimitCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAreaLimitCardsResponseBody body;

    public static ResetAreaLimitCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAreaLimitCardsResponse self = new ResetAreaLimitCardsResponse();
        return TeaModel.build(map, self);
    }

    public ResetAreaLimitCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAreaLimitCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAreaLimitCardsResponse setBody(ResetAreaLimitCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAreaLimitCardsResponseBody getBody() {
        return this.body;
    }

}
