// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RevokeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeResponseBody body;

    public static RevokeResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeResponse self = new RevokeResponse();
        return TeaModel.build(map, self);
    }

    public RevokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeResponse setBody(RevokeResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeResponseBody getBody() {
        return this.body;
    }

}
