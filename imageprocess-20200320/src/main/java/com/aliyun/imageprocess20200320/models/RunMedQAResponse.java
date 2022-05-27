// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunMedQAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RunMedQAResponseBody body;

    public static RunMedQAResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMedQAResponse self = new RunMedQAResponse();
        return TeaModel.build(map, self);
    }

    public RunMedQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunMedQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunMedQAResponse setBody(RunMedQAResponseBody body) {
        this.body = body;
        return this;
    }
    public RunMedQAResponseBody getBody() {
        return this.body;
    }

}
