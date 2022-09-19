// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExportSqlResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExportSqlResultsResponseBody body;

    public static ExportSqlResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportSqlResultsResponse self = new ExportSqlResultsResponse();
        return TeaModel.build(map, self);
    }

    public ExportSqlResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportSqlResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportSqlResultsResponse setBody(ExportSqlResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportSqlResultsResponseBody getBody() {
        return this.body;
    }

}
