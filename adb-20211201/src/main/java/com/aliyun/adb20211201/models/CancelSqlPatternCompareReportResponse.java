// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelSqlPatternCompareReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSqlPatternCompareReportResponseBody body;

    public static CancelSqlPatternCompareReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSqlPatternCompareReportResponse self = new CancelSqlPatternCompareReportResponse();
        return TeaModel.build(map, self);
    }

    public CancelSqlPatternCompareReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSqlPatternCompareReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSqlPatternCompareReportResponse setBody(CancelSqlPatternCompareReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSqlPatternCompareReportResponseBody getBody() {
        return this.body;
    }

}
