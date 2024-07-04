// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class ActivateMediaWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateMediaWorkflowResponseBody body;

    public static ActivateMediaWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateMediaWorkflowResponse self = new ActivateMediaWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public ActivateMediaWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateMediaWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateMediaWorkflowResponse setBody(ActivateMediaWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateMediaWorkflowResponseBody getBody() {
        return this.body;
    }

}
