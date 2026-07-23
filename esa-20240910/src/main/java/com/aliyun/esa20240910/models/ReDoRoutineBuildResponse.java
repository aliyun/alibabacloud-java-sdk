// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ReDoRoutineBuildResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReDoRoutineBuildResponseBody body;

    public static ReDoRoutineBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        ReDoRoutineBuildResponse self = new ReDoRoutineBuildResponse();
        return TeaModel.build(map, self);
    }

    public ReDoRoutineBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReDoRoutineBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReDoRoutineBuildResponse setBody(ReDoRoutineBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public ReDoRoutineBuildResponseBody getBody() {
        return this.body;
    }

}
