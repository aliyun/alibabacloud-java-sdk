// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RetryLogicalModelDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryLogicalModelDeploymentResponseBody body;

    public static RetryLogicalModelDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLogicalModelDeploymentResponse self = new RetryLogicalModelDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public RetryLogicalModelDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLogicalModelDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryLogicalModelDeploymentResponse setBody(RetryLogicalModelDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLogicalModelDeploymentResponseBody getBody() {
        return this.body;
    }

}
