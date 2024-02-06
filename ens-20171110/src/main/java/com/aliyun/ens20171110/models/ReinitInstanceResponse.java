// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReinitInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReinitInstanceResponseBody body;

    public static ReinitInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinitInstanceResponse self = new ReinitInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReinitInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinitInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReinitInstanceResponse setBody(ReinitInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinitInstanceResponseBody getBody() {
        return this.body;
    }

}
