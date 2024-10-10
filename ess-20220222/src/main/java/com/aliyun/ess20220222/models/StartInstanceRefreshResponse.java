// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class StartInstanceRefreshResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartInstanceRefreshResponseBody body;

    public static StartInstanceRefreshResponse build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRefreshResponse self = new StartInstanceRefreshResponse();
        return TeaModel.build(map, self);
    }

    public StartInstanceRefreshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartInstanceRefreshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartInstanceRefreshResponse setBody(StartInstanceRefreshResponseBody body) {
        this.body = body;
        return this;
    }
    public StartInstanceRefreshResponseBody getBody() {
        return this.body;
    }

}
