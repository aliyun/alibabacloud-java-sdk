// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateExperimentRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExperimentRunResponseBody body;

    public static CreateExperimentRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentRunResponse self = new CreateExperimentRunResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperimentRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperimentRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperimentRunResponse setBody(CreateExperimentRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentRunResponseBody getBody() {
        return this.body;
    }

}
