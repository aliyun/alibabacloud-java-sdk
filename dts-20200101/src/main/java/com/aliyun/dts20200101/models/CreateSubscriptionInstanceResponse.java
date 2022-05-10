// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateSubscriptionInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubscriptionInstanceResponseBody body;

    public static CreateSubscriptionInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionInstanceResponse self = new CreateSubscriptionInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubscriptionInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubscriptionInstanceResponse setBody(CreateSubscriptionInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubscriptionInstanceResponseBody getBody() {
        return this.body;
    }

}
