// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class TerminateWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TerminateWorkflowResponseBody body;

    public static TerminateWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateWorkflowResponse self = new TerminateWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public TerminateWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateWorkflowResponse setBody(TerminateWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateWorkflowResponseBody getBody() {
        return this.body;
    }

}
