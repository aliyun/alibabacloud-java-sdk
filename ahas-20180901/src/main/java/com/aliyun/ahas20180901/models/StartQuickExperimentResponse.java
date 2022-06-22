// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class StartQuickExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartQuickExperimentResponseBody body;

    public static StartQuickExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        StartQuickExperimentResponse self = new StartQuickExperimentResponse();
        return TeaModel.build(map, self);
    }

    public StartQuickExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartQuickExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartQuickExperimentResponse setBody(StartQuickExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public StartQuickExperimentResponseBody getBody() {
        return this.body;
    }

}
