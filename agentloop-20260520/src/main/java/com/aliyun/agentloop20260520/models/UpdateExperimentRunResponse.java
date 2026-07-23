// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateExperimentRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentRunResponseBody body;

    public static UpdateExperimentRunResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentRunResponse self = new UpdateExperimentRunResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentRunResponse setBody(UpdateExperimentRunResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentRunResponseBody getBody() {
        return this.body;
    }

}
