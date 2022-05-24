// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitTraceExtractResponseBody body;

    public static SubmitTraceExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceExtractResponse self = new SubmitTraceExtractResponse();
        return TeaModel.build(map, self);
    }

    public SubmitTraceExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitTraceExtractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitTraceExtractResponse setBody(SubmitTraceExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitTraceExtractResponseBody getBody() {
        return this.body;
    }

}
