// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseAICInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseAICInstanceResponseBody body;

    public static ReleaseAICInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseAICInstanceResponse self = new ReleaseAICInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseAICInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseAICInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseAICInstanceResponse setBody(ReleaseAICInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseAICInstanceResponseBody getBody() {
        return this.body;
    }

}
