// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SimpleListReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SimpleListReportResponseBody body;

    public static SimpleListReportResponse build(java.util.Map<String, ?> map) throws Exception {
        SimpleListReportResponse self = new SimpleListReportResponse();
        return TeaModel.build(map, self);
    }

    public SimpleListReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SimpleListReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SimpleListReportResponse setBody(SimpleListReportResponseBody body) {
        this.body = body;
        return this;
    }
    public SimpleListReportResponseBody getBody() {
        return this.body;
    }

}
