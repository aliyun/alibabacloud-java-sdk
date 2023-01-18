// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartWorkflowResponseBody body;

    public static StartWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        StartWorkflowResponse self = new StartWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public StartWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartWorkflowResponse setBody(StartWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public StartWorkflowResponseBody getBody() {
        return this.body;
    }

}
