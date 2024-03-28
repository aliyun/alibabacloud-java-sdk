// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class RejectSolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectSolutionResponseBody body;

    public static RejectSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectSolutionResponse self = new RejectSolutionResponse();
        return TeaModel.build(map, self);
    }

    public RejectSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectSolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectSolutionResponse setBody(RejectSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectSolutionResponseBody getBody() {
        return this.body;
    }

}
