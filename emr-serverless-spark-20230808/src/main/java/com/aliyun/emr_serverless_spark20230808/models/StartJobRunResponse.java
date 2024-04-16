// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartJobRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartJobRunResponseBody body;

    public static StartJobRunResponse build(java.util.Map<String, ?> map) throws Exception {
        StartJobRunResponse self = new StartJobRunResponse();
        return TeaModel.build(map, self);
    }

    public StartJobRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartJobRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartJobRunResponse setBody(StartJobRunResponseBody body) {
        this.body = body;
        return this;
    }
    public StartJobRunResponseBody getBody() {
        return this.body;
    }

}
