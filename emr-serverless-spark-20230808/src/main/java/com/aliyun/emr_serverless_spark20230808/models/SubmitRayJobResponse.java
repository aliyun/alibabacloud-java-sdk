// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class SubmitRayJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitRayJobResponseBody body;

    public static SubmitRayJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitRayJobResponse self = new SubmitRayJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitRayJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitRayJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitRayJobResponse setBody(SubmitRayJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitRayJobResponseBody getBody() {
        return this.body;
    }

}
