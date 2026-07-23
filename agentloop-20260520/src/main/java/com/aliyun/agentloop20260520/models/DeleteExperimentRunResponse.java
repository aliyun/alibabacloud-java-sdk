// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class DeleteExperimentRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExperimentRunResponseBody body;

    public static DeleteExperimentRunResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentRunResponse self = new DeleteExperimentRunResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExperimentRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExperimentRunResponse setBody(DeleteExperimentRunResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperimentRunResponseBody getBody() {
        return this.body;
    }

}
