// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StopDtsJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDtsJobsResponseBody body;

    public static StopDtsJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDtsJobsResponse self = new StopDtsJobsResponse();
        return TeaModel.build(map, self);
    }

    public StopDtsJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDtsJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDtsJobsResponse setBody(StopDtsJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDtsJobsResponseBody getBody() {
        return this.body;
    }

}
