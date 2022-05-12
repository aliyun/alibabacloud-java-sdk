// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSubscriptionResponseBody body;

    public static UpdateSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscriptionResponse self = new UpdateSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSubscriptionResponse setBody(UpdateSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSubscriptionResponseBody getBody() {
        return this.body;
    }

}
