// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunExpandContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunExpandContentResponseBody body;

    public static RunExpandContentResponse build(java.util.Map<String, ?> map) throws Exception {
        RunExpandContentResponse self = new RunExpandContentResponse();
        return TeaModel.build(map, self);
    }

    public RunExpandContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunExpandContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunExpandContentResponse setBody(RunExpandContentResponseBody body) {
        this.body = body;
        return this;
    }
    public RunExpandContentResponseBody getBody() {
        return this.body;
    }

}
