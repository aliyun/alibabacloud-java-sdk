// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportAnswerSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportAnswerSampleResponseBody body;

    public static ExportAnswerSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportAnswerSampleResponse self = new ExportAnswerSampleResponse();
        return TeaModel.build(map, self);
    }

    public ExportAnswerSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportAnswerSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportAnswerSampleResponse setBody(ExportAnswerSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportAnswerSampleResponseBody getBody() {
        return this.body;
    }

}
