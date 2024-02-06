// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootAICInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootAICInstanceResponseBody body;

    public static RebootAICInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootAICInstanceResponse self = new RebootAICInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebootAICInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootAICInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootAICInstanceResponse setBody(RebootAICInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootAICInstanceResponseBody getBody() {
        return this.body;
    }

}
