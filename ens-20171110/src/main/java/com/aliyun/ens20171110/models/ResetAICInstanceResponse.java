// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResetAICInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAICInstanceResponseBody body;

    public static ResetAICInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAICInstanceResponse self = new ResetAICInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResetAICInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAICInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAICInstanceResponse setBody(ResetAICInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAICInstanceResponseBody getBody() {
        return this.body;
    }

}
