// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEventSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventSubscriptionResponseBody body;

    public static GetEventSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventSubscriptionResponse self = new GetEventSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public GetEventSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventSubscriptionResponse setBody(GetEventSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventSubscriptionResponseBody getBody() {
        return this.body;
    }

}
