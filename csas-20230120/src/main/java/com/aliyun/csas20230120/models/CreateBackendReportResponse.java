// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateBackendReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBackendReportResponseBody body;

    public static CreateBackendReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendReportResponse self = new CreateBackendReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackendReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackendReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBackendReportResponse setBody(CreateBackendReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackendReportResponseBody getBody() {
        return this.body;
    }

}
