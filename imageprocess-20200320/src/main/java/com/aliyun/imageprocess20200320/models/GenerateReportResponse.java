// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class GenerateReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateReportResponseBody body;

    public static GenerateReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateReportResponse self = new GenerateReportResponse();
        return TeaModel.build(map, self);
    }

    public GenerateReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateReportResponse setBody(GenerateReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateReportResponseBody getBody() {
        return this.body;
    }

}
