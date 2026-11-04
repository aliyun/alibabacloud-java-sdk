// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryReportByIntervalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceSummaryReportByIntervalResponseBody body;

    public static GetInstanceSummaryReportByIntervalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryReportByIntervalResponse self = new GetInstanceSummaryReportByIntervalResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryReportByIntervalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceSummaryReportByIntervalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceSummaryReportByIntervalResponse setBody(GetInstanceSummaryReportByIntervalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceSummaryReportByIntervalResponseBody getBody() {
        return this.body;
    }

}
