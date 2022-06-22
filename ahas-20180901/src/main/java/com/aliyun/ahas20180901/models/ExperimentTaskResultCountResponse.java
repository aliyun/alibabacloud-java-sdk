// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ExperimentTaskResultCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExperimentTaskResultCountResponseBody body;

    public static ExperimentTaskResultCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ExperimentTaskResultCountResponse self = new ExperimentTaskResultCountResponse();
        return TeaModel.build(map, self);
    }

    public ExperimentTaskResultCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExperimentTaskResultCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExperimentTaskResultCountResponse setBody(ExperimentTaskResultCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ExperimentTaskResultCountResponseBody getBody() {
        return this.body;
    }

}
