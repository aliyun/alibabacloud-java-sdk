// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetExperimentRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentRunResponseBody body;

    public static GetExperimentRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentRunResponse self = new GetExperimentRunResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentRunResponse setBody(GetExperimentRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentRunResponseBody getBody() {
        return this.body;
    }

}
