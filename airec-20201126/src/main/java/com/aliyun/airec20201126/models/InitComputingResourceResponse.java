// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class InitComputingResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitComputingResourceResponseBody body;

    public static InitComputingResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitComputingResourceResponse self = new InitComputingResourceResponse();
        return TeaModel.build(map, self);
    }

    public InitComputingResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitComputingResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitComputingResourceResponse setBody(InitComputingResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public InitComputingResourceResponseBody getBody() {
        return this.body;
    }

}
