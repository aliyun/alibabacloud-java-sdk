// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSubscriptionResponseBody body;

    public static DisableSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSubscriptionResponse self = new DisableSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public DisableSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSubscriptionResponse setBody(DisableSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSubscriptionResponseBody getBody() {
        return this.body;
    }

}
