// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RunImageTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunImageTestResponseBody body;

    public static RunImageTestResponse build(java.util.Map<String, ?> map) throws Exception {
        RunImageTestResponse self = new RunImageTestResponse();
        return TeaModel.build(map, self);
    }

    public RunImageTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunImageTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunImageTestResponse setBody(RunImageTestResponseBody body) {
        this.body = body;
        return this;
    }
    public RunImageTestResponseBody getBody() {
        return this.body;
    }

}
