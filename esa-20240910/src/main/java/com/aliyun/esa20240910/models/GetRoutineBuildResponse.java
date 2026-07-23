// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineBuildResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutineBuildResponseBody body;

    public static GetRoutineBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineBuildResponse self = new GetRoutineBuildResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutineBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutineBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutineBuildResponse setBody(GetRoutineBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutineBuildResponseBody getBody() {
        return this.body;
    }

}
