// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class InnerLimitRateCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InnerLimitRateCardsResponseBody body;

    public static InnerLimitRateCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        InnerLimitRateCardsResponse self = new InnerLimitRateCardsResponse();
        return TeaModel.build(map, self);
    }

    public InnerLimitRateCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InnerLimitRateCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InnerLimitRateCardsResponse setBody(InnerLimitRateCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public InnerLimitRateCardsResponseBody getBody() {
        return this.body;
    }

}
