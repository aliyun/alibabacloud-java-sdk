// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RetryWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RetryWorkflowResponseBody body;

    public static RetryWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryWorkflowResponse self = new RetryWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public RetryWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryWorkflowResponse setBody(RetryWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryWorkflowResponseBody getBody() {
        return this.body;
    }

}