// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLivePullToPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopLivePullToPushResponseBody body;

    public static StopLivePullToPushResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLivePullToPushResponse self = new StopLivePullToPushResponse();
        return TeaModel.build(map, self);
    }

    public StopLivePullToPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLivePullToPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopLivePullToPushResponse setBody(StopLivePullToPushResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLivePullToPushResponseBody getBody() {
        return this.body;
    }

}
