// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mscopensubscription20210713.models;

import com.aliyun.tea.*;

public class CreateSubscriptionItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubscriptionItemResponseBody body;

    public static CreateSubscriptionItemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionItemResponse self = new CreateSubscriptionItemResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubscriptionItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubscriptionItemResponse setBody(CreateSubscriptionItemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubscriptionItemResponseBody getBody() {
        return this.body;
    }

}
