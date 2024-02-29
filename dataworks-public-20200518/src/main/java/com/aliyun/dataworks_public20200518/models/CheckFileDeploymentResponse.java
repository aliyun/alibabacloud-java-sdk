// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckFileDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckFileDeploymentResponseBody body;

    public static CheckFileDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFileDeploymentResponse self = new CheckFileDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public CheckFileDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFileDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckFileDeploymentResponse setBody(CheckFileDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFileDeploymentResponseBody getBody() {
        return this.body;
    }

}
