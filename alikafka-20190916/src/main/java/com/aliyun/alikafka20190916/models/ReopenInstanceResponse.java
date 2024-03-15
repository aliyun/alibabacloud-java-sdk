// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ReopenInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReopenInstanceResponseBody body;

    public static ReopenInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReopenInstanceResponse self = new ReopenInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReopenInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReopenInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReopenInstanceResponse setBody(ReopenInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReopenInstanceResponseBody getBody() {
        return this.body;
    }

}
