// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StopAIWorkflowTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAIWorkflowTaskResponseBody body;

    public static StopAIWorkflowTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAIWorkflowTaskResponse self = new StopAIWorkflowTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopAIWorkflowTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAIWorkflowTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAIWorkflowTaskResponse setBody(StopAIWorkflowTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAIWorkflowTaskResponseBody getBody() {
        return this.body;
    }

}
