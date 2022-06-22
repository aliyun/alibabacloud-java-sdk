// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class StopExperimentTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopExperimentTaskResponseBody body;

    public static StopExperimentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        StopExperimentTaskResponse self = new StopExperimentTaskResponse();
        return TeaModel.build(map, self);
    }

    public StopExperimentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopExperimentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopExperimentTaskResponse setBody(StopExperimentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public StopExperimentTaskResponseBody getBody() {
        return this.body;
    }

}
