// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class KillInstanceAllSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KillInstanceAllSessionResponseBody body;

    public static KillInstanceAllSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        KillInstanceAllSessionResponse self = new KillInstanceAllSessionResponse();
        return TeaModel.build(map, self);
    }

    public KillInstanceAllSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillInstanceAllSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillInstanceAllSessionResponse setBody(KillInstanceAllSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public KillInstanceAllSessionResponseBody getBody() {
        return this.body;
    }

}
