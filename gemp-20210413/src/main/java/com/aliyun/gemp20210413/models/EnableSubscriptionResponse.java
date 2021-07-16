// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSubscriptionResponseBody body;

    public static EnableSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSubscriptionResponse self = new EnableSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public EnableSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSubscriptionResponse setBody(EnableSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSubscriptionResponseBody getBody() {
        return this.body;
    }

}
