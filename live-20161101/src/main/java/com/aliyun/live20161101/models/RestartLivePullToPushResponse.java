// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RestartLivePullToPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartLivePullToPushResponseBody body;

    public static RestartLivePullToPushResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartLivePullToPushResponse self = new RestartLivePullToPushResponse();
        return TeaModel.build(map, self);
    }

    public RestartLivePullToPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartLivePullToPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartLivePullToPushResponse setBody(RestartLivePullToPushResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartLivePullToPushResponseBody getBody() {
        return this.body;
    }

}
