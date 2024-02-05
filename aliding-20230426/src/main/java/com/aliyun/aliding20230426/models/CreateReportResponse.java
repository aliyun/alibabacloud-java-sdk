// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReportResponseBody body;

    public static CreateReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReportResponse self = new CreateReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReportResponse setBody(CreateReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReportResponseBody getBody() {
        return this.body;
    }

}
