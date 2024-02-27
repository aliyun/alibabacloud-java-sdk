// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CancelSubscriptionBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSubscriptionBillResponseBody body;

    public static CancelSubscriptionBillResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSubscriptionBillResponse self = new CancelSubscriptionBillResponse();
        return TeaModel.build(map, self);
    }

    public CancelSubscriptionBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSubscriptionBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSubscriptionBillResponse setBody(CancelSubscriptionBillResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSubscriptionBillResponseBody getBody() {
        return this.body;
    }

}
