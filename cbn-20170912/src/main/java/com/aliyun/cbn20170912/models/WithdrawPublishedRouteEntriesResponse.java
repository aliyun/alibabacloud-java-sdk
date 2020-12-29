// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class WithdrawPublishedRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public WithdrawPublishedRouteEntriesResponseBody body;

    public static WithdrawPublishedRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        WithdrawPublishedRouteEntriesResponse self = new WithdrawPublishedRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public WithdrawPublishedRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WithdrawPublishedRouteEntriesResponse setBody(WithdrawPublishedRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public WithdrawPublishedRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
