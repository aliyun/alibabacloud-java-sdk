// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartDtsJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDtsJobsResponseBody body;

    public static StartDtsJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDtsJobsResponse self = new StartDtsJobsResponse();
        return TeaModel.build(map, self);
    }

    public StartDtsJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDtsJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDtsJobsResponse setBody(StartDtsJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDtsJobsResponseBody getBody() {
        return this.body;
    }

}
