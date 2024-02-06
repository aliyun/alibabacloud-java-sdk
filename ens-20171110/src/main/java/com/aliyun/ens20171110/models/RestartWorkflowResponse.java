// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RestartWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartWorkflowResponseBody body;

    public static RestartWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartWorkflowResponse self = new RestartWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public RestartWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartWorkflowResponse setBody(RestartWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartWorkflowResponseBody getBody() {
        return this.body;
    }

}
