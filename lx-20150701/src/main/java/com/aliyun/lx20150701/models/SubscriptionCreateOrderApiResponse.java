// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class SubscriptionCreateOrderApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubscriptionCreateOrderApiResponseBody body;

    public static SubscriptionCreateOrderApiResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionCreateOrderApiResponse self = new SubscriptionCreateOrderApiResponse();
        return TeaModel.build(map, self);
    }

    public SubscriptionCreateOrderApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubscriptionCreateOrderApiResponse setBody(SubscriptionCreateOrderApiResponseBody body) {
        this.body = body;
        return this;
    }
    public SubscriptionCreateOrderApiResponseBody getBody() {
        return this.body;
    }

}
