// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class PoolConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PoolConfigResponseBody body;

    public static PoolConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PoolConfigResponse self = new PoolConfigResponse();
        return TeaModel.build(map, self);
    }

    public PoolConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PoolConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PoolConfigResponse setBody(PoolConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PoolConfigResponseBody getBody() {
        return this.body;
    }

}
