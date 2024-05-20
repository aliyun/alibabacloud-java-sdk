// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class UpdateWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkflowResponseBody body;

    public static UpdateWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkflowResponse self = new UpdateWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkflowResponse setBody(UpdateWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkflowResponseBody getBody() {
        return this.body;
    }

}
