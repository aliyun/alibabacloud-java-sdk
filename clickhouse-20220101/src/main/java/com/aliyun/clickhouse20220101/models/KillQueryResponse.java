// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class KillQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KillQueryResponseBody body;

    public static KillQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        KillQueryResponse self = new KillQueryResponse();
        return TeaModel.build(map, self);
    }

    public KillQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillQueryResponse setBody(KillQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public KillQueryResponseBody getBody() {
        return this.body;
    }

}
