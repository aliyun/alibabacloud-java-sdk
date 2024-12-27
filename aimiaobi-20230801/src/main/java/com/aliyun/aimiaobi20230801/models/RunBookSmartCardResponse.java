// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunBookSmartCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunBookSmartCardResponseBody body;

    public static RunBookSmartCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RunBookSmartCardResponse self = new RunBookSmartCardResponse();
        return TeaModel.build(map, self);
    }

    public RunBookSmartCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunBookSmartCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunBookSmartCardResponse setBody(RunBookSmartCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RunBookSmartCardResponseBody getBody() {
        return this.body;
    }

}
