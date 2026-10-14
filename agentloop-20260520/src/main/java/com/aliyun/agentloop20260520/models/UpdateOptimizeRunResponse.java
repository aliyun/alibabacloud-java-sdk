// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateOptimizeRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateOptimizeRunResponseBody body;

    public static UpdateOptimizeRunResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOptimizeRunResponse self = new UpdateOptimizeRunResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOptimizeRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOptimizeRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateOptimizeRunResponse setBody(UpdateOptimizeRunResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOptimizeRunResponseBody getBody() {
        return this.body;
    }

}
