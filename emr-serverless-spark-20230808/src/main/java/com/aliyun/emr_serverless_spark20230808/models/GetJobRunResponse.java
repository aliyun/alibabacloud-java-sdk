// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetJobRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobRunResponseBody body;

    public static GetJobRunResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobRunResponse self = new GetJobRunResponse();
        return TeaModel.build(map, self);
    }

    public GetJobRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobRunResponse setBody(GetJobRunResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobRunResponseBody getBody() {
        return this.body;
    }

}
