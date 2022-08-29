// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ReportInstanceProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReportInstanceProgressResponseBody body;

    public static ReportInstanceProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportInstanceProgressResponse self = new ReportInstanceProgressResponse();
        return TeaModel.build(map, self);
    }

    public ReportInstanceProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportInstanceProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportInstanceProgressResponse setBody(ReportInstanceProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportInstanceProgressResponseBody getBody() {
        return this.body;
    }

}
