// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetSubscriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSubscriptionResponseBody body;

    public static GetSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionResponse self = new GetSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscriptionResponse setBody(GetSubscriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionResponseBody getBody() {
        return this.body;
    }

}
