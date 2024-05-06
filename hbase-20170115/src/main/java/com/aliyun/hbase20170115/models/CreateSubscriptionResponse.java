// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CreateSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSubscriptionResponseBody body;

    public static CreateSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionResponse self = new CreateSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubscriptionResponse setBody(CreateSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubscriptionResponseBody getBody() {
        return this.body;
    }

}
