// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StopRoutineBuildResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRoutineBuildResponseBody body;

    public static StopRoutineBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRoutineBuildResponse self = new StopRoutineBuildResponse();
        return TeaModel.build(map, self);
    }

    public StopRoutineBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRoutineBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRoutineBuildResponse setBody(StopRoutineBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRoutineBuildResponseBody getBody() {
        return this.body;
    }

}
