// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetOptimizeRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOptimizeRunResponseBody body;

    public static GetOptimizeRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOptimizeRunResponse self = new GetOptimizeRunResponse();
        return TeaModel.build(map, self);
    }

    public GetOptimizeRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOptimizeRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOptimizeRunResponse setBody(GetOptimizeRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOptimizeRunResponseBody getBody() {
        return this.body;
    }

}
