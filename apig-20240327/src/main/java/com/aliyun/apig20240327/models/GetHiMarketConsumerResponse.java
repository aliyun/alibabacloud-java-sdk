// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHiMarketConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHiMarketConsumerResponseBody body;

    public static GetHiMarketConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHiMarketConsumerResponse self = new GetHiMarketConsumerResponse();
        return TeaModel.build(map, self);
    }

    public GetHiMarketConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHiMarketConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHiMarketConsumerResponse setBody(GetHiMarketConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHiMarketConsumerResponseBody getBody() {
        return this.body;
    }

}
