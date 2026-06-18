// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetSubscriptionSeatDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubscriptionSeatDetailsResponseBody body;

    public static GetSubscriptionSeatDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionSeatDetailsResponse self = new GetSubscriptionSeatDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionSeatDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscriptionSeatDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubscriptionSeatDetailsResponse setBody(GetSubscriptionSeatDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionSeatDetailsResponseBody getBody() {
        return this.body;
    }

}
