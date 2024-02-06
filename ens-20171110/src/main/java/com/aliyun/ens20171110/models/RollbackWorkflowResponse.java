// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RollbackWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackWorkflowResponseBody body;

    public static RollbackWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackWorkflowResponse self = new RollbackWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public RollbackWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackWorkflowResponse setBody(RollbackWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackWorkflowResponseBody getBody() {
        return this.body;
    }

}
