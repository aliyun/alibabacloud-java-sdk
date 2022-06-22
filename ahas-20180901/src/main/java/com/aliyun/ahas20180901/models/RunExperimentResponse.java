// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class RunExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RunExperimentResponseBody body;

    public static RunExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        RunExperimentResponse self = new RunExperimentResponse();
        return TeaModel.build(map, self);
    }

    public RunExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunExperimentResponse setBody(RunExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public RunExperimentResponseBody getBody() {
        return this.body;
    }

}
