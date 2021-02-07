// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public CreateSubscriptionResponse setBody(CreateSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubscriptionResponseBody getBody() {
        return this.body;
    }

}
