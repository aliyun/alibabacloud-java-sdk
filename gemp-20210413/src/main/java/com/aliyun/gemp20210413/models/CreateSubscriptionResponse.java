// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
