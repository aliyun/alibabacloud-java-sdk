// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitTraceExtractJobResponseBody body;

    public static SubmitTraceExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceExtractJobResponse self = new SubmitTraceExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTraceExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTraceExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTraceExtractJobResponse setBody(SubmitTraceExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTraceExtractJobResponseBody getBody() {
        return this.body;
    }

}
