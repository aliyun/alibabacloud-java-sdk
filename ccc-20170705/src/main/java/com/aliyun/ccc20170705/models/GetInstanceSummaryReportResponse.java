// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceSummaryReportResponseBody body;

    public static GetInstanceSummaryReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryReportResponse self = new GetInstanceSummaryReportResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceSummaryReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceSummaryReportResponse setBody(GetInstanceSummaryReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceSummaryReportResponseBody getBody() {
        return this.body;
    }

}
