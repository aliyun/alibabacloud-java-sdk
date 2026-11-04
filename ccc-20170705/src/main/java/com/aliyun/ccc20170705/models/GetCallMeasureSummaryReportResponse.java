// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetCallMeasureSummaryReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCallMeasureSummaryReportResponseBody body;

    public static GetCallMeasureSummaryReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallMeasureSummaryReportResponse self = new GetCallMeasureSummaryReportResponse();
        return TeaModel.build(map, self);
    }

    public GetCallMeasureSummaryReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallMeasureSummaryReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCallMeasureSummaryReportResponse setBody(GetCallMeasureSummaryReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallMeasureSummaryReportResponseBody getBody() {
        return this.body;
    }

}
