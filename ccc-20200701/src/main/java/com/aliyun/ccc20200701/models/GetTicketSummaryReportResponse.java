// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTicketSummaryReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTicketSummaryReportResponseBody body;

    public static GetTicketSummaryReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTicketSummaryReportResponse self = new GetTicketSummaryReportResponse();
        return TeaModel.build(map, self);
    }

    public GetTicketSummaryReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTicketSummaryReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTicketSummaryReportResponse setBody(GetTicketSummaryReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTicketSummaryReportResponseBody getBody() {
        return this.body;
    }

}
