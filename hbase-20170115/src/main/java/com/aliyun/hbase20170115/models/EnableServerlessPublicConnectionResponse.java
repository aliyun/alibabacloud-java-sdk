// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class EnableServerlessPublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableServerlessPublicConnectionResponseBody body;

    public static EnableServerlessPublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableServerlessPublicConnectionResponse self = new EnableServerlessPublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public EnableServerlessPublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableServerlessPublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableServerlessPublicConnectionResponse setBody(EnableServerlessPublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableServerlessPublicConnectionResponseBody getBody() {
        return this.body;
    }

}
