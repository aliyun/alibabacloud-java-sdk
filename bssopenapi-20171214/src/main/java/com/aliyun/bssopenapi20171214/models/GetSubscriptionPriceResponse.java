// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetSubscriptionPriceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubscriptionPriceResponseBody body;

    public static GetSubscriptionPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionPriceResponse self = new GetSubscriptionPriceResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionPriceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscriptionPriceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubscriptionPriceResponse setBody(GetSubscriptionPriceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionPriceResponseBody getBody() {
        return this.body;
    }

}
