// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class RunWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunWorkflowResponseBody body;

    public static RunWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        RunWorkflowResponse self = new RunWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public RunWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunWorkflowResponse setBody(RunWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public RunWorkflowResponseBody getBody() {
        return this.body;
    }

}
