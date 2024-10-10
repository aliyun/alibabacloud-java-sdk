// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CancelInstanceRefreshResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelInstanceRefreshResponseBody body;

    public static CancelInstanceRefreshResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelInstanceRefreshResponse self = new CancelInstanceRefreshResponse();
        return TeaModel.build(map, self);
    }

    public CancelInstanceRefreshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelInstanceRefreshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelInstanceRefreshResponse setBody(CancelInstanceRefreshResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelInstanceRefreshResponseBody getBody() {
        return this.body;
    }

}
