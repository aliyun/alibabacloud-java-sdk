// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindSubscriptionResponseBody body;

    public static UnbindSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSubscriptionResponse self = new UnbindSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSubscriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindSubscriptionResponse setBody(UnbindSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSubscriptionResponseBody getBody() {
        return this.body;
    }

}
