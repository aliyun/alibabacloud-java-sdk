// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StopDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDtsJobResponseBody body;

    public static StopDtsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDtsJobResponse self = new StopDtsJobResponse();
        return TeaModel.build(map, self);
    }

    public StopDtsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDtsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDtsJobResponse setBody(StopDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDtsJobResponseBody getBody() {
        return this.body;
    }

}
