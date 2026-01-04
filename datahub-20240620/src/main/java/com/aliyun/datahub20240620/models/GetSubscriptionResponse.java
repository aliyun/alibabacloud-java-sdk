// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubscriptionResponseBody body;

    public static GetSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionResponse self = new GetSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubscriptionResponse setBody(GetSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionResponseBody getBody() {
        return this.body;
    }

}
