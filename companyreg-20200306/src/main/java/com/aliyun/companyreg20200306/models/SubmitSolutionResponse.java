// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class SubmitSolutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSolutionResponseBody body;

    public static SubmitSolutionResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSolutionResponse self = new SubmitSolutionResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSolutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSolutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSolutionResponse setBody(SubmitSolutionResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSolutionResponseBody getBody() {
        return this.body;
    }

}
