// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UpdateMediaWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaWorkflowResponseBody body;

    public static UpdateMediaWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaWorkflowResponse self = new UpdateMediaWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaWorkflowResponse setBody(UpdateMediaWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaWorkflowResponseBody getBody() {
        return this.body;
    }

}
