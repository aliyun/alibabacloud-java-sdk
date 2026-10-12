// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHiMarketConsumerCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHiMarketConsumerCredentialResponseBody body;

    public static GetHiMarketConsumerCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHiMarketConsumerCredentialResponse self = new GetHiMarketConsumerCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetHiMarketConsumerCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHiMarketConsumerCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHiMarketConsumerCredentialResponse setBody(GetHiMarketConsumerCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHiMarketConsumerCredentialResponseBody getBody() {
        return this.body;
    }

}
