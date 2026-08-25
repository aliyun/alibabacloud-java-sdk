// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelConnectionResponseBody body;

    public static UpdateModelConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelConnectionResponse self = new UpdateModelConnectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelConnectionResponse setBody(UpdateModelConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelConnectionResponseBody getBody() {
        return this.body;
    }

}
