// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ExperimentTaskCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExperimentTaskCountResponseBody body;

    public static ExperimentTaskCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ExperimentTaskCountResponse self = new ExperimentTaskCountResponse();
        return TeaModel.build(map, self);
    }

    public ExperimentTaskCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExperimentTaskCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExperimentTaskCountResponse setBody(ExperimentTaskCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ExperimentTaskCountResponseBody getBody() {
        return this.body;
    }

}
