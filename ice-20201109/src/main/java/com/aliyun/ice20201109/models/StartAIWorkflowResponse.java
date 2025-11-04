// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAIWorkflowResponseBody body;

    public static StartAIWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAIWorkflowResponse self = new StartAIWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public StartAIWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAIWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAIWorkflowResponse setBody(StartAIWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAIWorkflowResponseBody getBody() {
        return this.body;
    }

}
