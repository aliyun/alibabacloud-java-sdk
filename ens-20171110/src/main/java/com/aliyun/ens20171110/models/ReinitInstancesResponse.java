// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReinitInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReinitInstancesResponseBody body;

    public static ReinitInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinitInstancesResponse self = new ReinitInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ReinitInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinitInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReinitInstancesResponse setBody(ReinitInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinitInstancesResponseBody getBody() {
        return this.body;
    }

}
