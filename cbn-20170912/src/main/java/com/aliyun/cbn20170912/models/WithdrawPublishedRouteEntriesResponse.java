// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class WithdrawPublishedRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public WithdrawPublishedRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WithdrawPublishedRouteEntriesResponse setBody(WithdrawPublishedRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public WithdrawPublishedRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
