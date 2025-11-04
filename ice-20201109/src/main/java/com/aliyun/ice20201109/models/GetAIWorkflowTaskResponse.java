// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAIWorkflowTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIWorkflowTaskResponseBody body;

    public static GetAIWorkflowTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIWorkflowTaskResponse self = new GetAIWorkflowTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetAIWorkflowTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIWorkflowTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIWorkflowTaskResponse setBody(GetAIWorkflowTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIWorkflowTaskResponseBody getBody() {
        return this.body;
    }

}
