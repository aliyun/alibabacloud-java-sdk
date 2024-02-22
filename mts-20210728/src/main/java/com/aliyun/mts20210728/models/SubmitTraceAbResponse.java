// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTraceAbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTraceAbResponseBody body;

    public static SubmitTraceAbResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceAbResponse self = new SubmitTraceAbResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTraceAbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTraceAbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTraceAbResponse setBody(SubmitTraceAbResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTraceAbResponseBody getBody() {
        return this.body;
    }

}
