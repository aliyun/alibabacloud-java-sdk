// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class DeactivateMediaWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeactivateMediaWorkflowResponseBody body;

    public static DeactivateMediaWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactivateMediaWorkflowResponse self = new DeactivateMediaWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public DeactivateMediaWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeactivateMediaWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeactivateMediaWorkflowResponse setBody(DeactivateMediaWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DeactivateMediaWorkflowResponseBody getBody() {
        return this.body;
    }

}
