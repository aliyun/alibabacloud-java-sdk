// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RerunFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RerunFlowResponseBody body;

    public static RerunFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        RerunFlowResponse self = new RerunFlowResponse();
        return TeaModel.build(map, self);
    }

    public RerunFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RerunFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RerunFlowResponse setBody(RerunFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public RerunFlowResponseBody getBody() {
        return this.body;
    }

}
