// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class RollbackInstanceRefreshResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackInstanceRefreshResponseBody body;

    public static RollbackInstanceRefreshResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackInstanceRefreshResponse self = new RollbackInstanceRefreshResponse();
        return TeaModel.build(map, self);
    }

    public RollbackInstanceRefreshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackInstanceRefreshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackInstanceRefreshResponse setBody(RollbackInstanceRefreshResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackInstanceRefreshResponseBody getBody() {
        return this.body;
    }

}
