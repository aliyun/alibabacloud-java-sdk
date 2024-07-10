// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitTraceAbJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTraceAbJobResponseBody body;

    public static SubmitTraceAbJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceAbJobResponse self = new SubmitTraceAbJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTraceAbJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTraceAbJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTraceAbJobResponse setBody(SubmitTraceAbJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTraceAbJobResponseBody getBody() {
        return this.body;
    }

}
