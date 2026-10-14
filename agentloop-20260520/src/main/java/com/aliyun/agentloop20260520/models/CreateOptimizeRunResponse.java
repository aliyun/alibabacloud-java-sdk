// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateOptimizeRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOptimizeRunResponseBody body;

    public static CreateOptimizeRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOptimizeRunResponse self = new CreateOptimizeRunResponse();
        return TeaModel.build(map, self);
    }

    public CreateOptimizeRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOptimizeRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOptimizeRunResponse setBody(CreateOptimizeRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOptimizeRunResponseBody getBody() {
        return this.body;
    }

}
