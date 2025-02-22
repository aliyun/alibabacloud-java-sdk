// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowResponseBody body;

    public static GetWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowResponse self = new GetWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowResponse setBody(GetWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowResponseBody getBody() {
        return this.body;
    }

}
