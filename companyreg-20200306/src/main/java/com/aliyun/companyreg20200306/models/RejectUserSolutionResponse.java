// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class RejectUserSolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectUserSolutionResponseBody body;

    public static RejectUserSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectUserSolutionResponse self = new RejectUserSolutionResponse();
        return TeaModel.build(map, self);
    }

    public RejectUserSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectUserSolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectUserSolutionResponse setBody(RejectUserSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectUserSolutionResponseBody getBody() {
        return this.body;
    }

}
