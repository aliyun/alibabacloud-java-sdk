// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SubscriptionBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubscriptionBillResponseBody body;

    public static SubscriptionBillResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionBillResponse self = new SubscriptionBillResponse();
        return TeaModel.build(map, self);
    }

    public SubscriptionBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscriptionBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubscriptionBillResponse setBody(SubscriptionBillResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscriptionBillResponseBody getBody() {
        return this.body;
    }

}
