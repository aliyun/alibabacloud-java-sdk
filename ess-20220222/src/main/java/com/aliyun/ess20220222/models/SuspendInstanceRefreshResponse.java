// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class SuspendInstanceRefreshResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendInstanceRefreshResponseBody body;

    public static SuspendInstanceRefreshResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendInstanceRefreshResponse self = new SuspendInstanceRefreshResponse();
        return TeaModel.build(map, self);
    }

    public SuspendInstanceRefreshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendInstanceRefreshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendInstanceRefreshResponse setBody(SuspendInstanceRefreshResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendInstanceRefreshResponseBody getBody() {
        return this.body;
    }

}
