// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ExecuteExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteExperimentResponseBody body;

    public static ExecuteExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteExperimentResponse self = new ExecuteExperimentResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteExperimentResponse setBody(ExecuteExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteExperimentResponseBody getBody() {
        return this.body;
    }

}
