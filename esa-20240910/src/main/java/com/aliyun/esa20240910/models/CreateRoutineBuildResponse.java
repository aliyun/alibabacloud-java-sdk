// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineBuildResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoutineBuildResponseBody body;

    public static CreateRoutineBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineBuildResponse self = new CreateRoutineBuildResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoutineBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoutineBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoutineBuildResponse setBody(CreateRoutineBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoutineBuildResponseBody getBody() {
        return this.body;
    }

}
