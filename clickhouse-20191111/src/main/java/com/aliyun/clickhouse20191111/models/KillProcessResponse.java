// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class KillProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KillProcessResponseBody body;

    public static KillProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        KillProcessResponse self = new KillProcessResponse();
        return TeaModel.build(map, self);
    }

    public KillProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillProcessResponse setBody(KillProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public KillProcessResponseBody getBody() {
        return this.body;
    }

}
