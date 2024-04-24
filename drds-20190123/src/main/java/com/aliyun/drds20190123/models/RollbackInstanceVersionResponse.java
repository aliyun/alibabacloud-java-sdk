// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RollbackInstanceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackInstanceVersionResponseBody body;

    public static RollbackInstanceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackInstanceVersionResponse self = new RollbackInstanceVersionResponse();
        return TeaModel.build(map, self);
    }

    public RollbackInstanceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackInstanceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackInstanceVersionResponse setBody(RollbackInstanceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackInstanceVersionResponseBody getBody() {
        return this.body;
    }

}
