// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunDocSmartCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDocSmartCardResponseBody body;

    public static RunDocSmartCardResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDocSmartCardResponse self = new RunDocSmartCardResponse();
        return TeaModel.build(map, self);
    }

    public RunDocSmartCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDocSmartCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDocSmartCardResponse setBody(RunDocSmartCardResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDocSmartCardResponseBody getBody() {
        return this.body;
    }

}
