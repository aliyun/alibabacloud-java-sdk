// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescirbeWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescirbeWorkflowResponseBody body;

    public static DescirbeWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescirbeWorkflowResponse self = new DescirbeWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public DescirbeWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescirbeWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescirbeWorkflowResponse setBody(DescirbeWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescirbeWorkflowResponseBody getBody() {
        return this.body;
    }

}
