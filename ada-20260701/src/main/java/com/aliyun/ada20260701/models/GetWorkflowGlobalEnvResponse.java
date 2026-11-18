// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetWorkflowGlobalEnvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkflowGlobalEnvResponseBody body;

    public static GetWorkflowGlobalEnvResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowGlobalEnvResponse self = new GetWorkflowGlobalEnvResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkflowGlobalEnvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkflowGlobalEnvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkflowGlobalEnvResponse setBody(GetWorkflowGlobalEnvResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkflowGlobalEnvResponseBody getBody() {
        return this.body;
    }

}
