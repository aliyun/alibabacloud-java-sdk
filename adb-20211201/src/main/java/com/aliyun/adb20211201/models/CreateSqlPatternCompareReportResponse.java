// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSqlPatternCompareReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSqlPatternCompareReportResponseBody body;

    public static CreateSqlPatternCompareReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlPatternCompareReportResponse self = new CreateSqlPatternCompareReportResponse();
        return TeaModel.build(map, self);
    }

    public CreateSqlPatternCompareReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSqlPatternCompareReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSqlPatternCompareReportResponse setBody(CreateSqlPatternCompareReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSqlPatternCompareReportResponseBody getBody() {
        return this.body;
    }

}
