// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ReportTranslateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReportTranslateResponseBody body;

    public static ReportTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportTranslateResponse self = new ReportTranslateResponse();
        return TeaModel.build(map, self);
    }

    public ReportTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportTranslateResponse setBody(ReportTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportTranslateResponseBody getBody() {
        return this.body;
    }

}
