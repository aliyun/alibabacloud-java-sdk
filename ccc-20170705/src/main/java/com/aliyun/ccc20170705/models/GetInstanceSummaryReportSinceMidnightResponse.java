// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryReportSinceMidnightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceSummaryReportSinceMidnightResponseBody body;

    public static GetInstanceSummaryReportSinceMidnightResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryReportSinceMidnightResponse self = new GetInstanceSummaryReportSinceMidnightResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryReportSinceMidnightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceSummaryReportSinceMidnightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceSummaryReportSinceMidnightResponse setBody(GetInstanceSummaryReportSinceMidnightResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceSummaryReportSinceMidnightResponseBody getBody() {
        return this.body;
    }

}
