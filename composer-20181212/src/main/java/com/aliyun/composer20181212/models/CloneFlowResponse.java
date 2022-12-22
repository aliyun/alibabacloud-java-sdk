// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class CloneFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloneFlowResponseBody body;

    public static CloneFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowResponse self = new CloneFlowResponse();
        return TeaModel.build(map, self);
    }

    public CloneFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneFlowResponse setBody(CloneFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneFlowResponseBody getBody() {
        return this.body;
    }

}
