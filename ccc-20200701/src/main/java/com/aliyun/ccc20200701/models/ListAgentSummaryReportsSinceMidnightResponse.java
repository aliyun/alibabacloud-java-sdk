// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentSummaryReportsSinceMidnightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentSummaryReportsSinceMidnightResponseBody body;

    public static ListAgentSummaryReportsSinceMidnightResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSummaryReportsSinceMidnightResponse self = new ListAgentSummaryReportsSinceMidnightResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentSummaryReportsSinceMidnightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentSummaryReportsSinceMidnightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentSummaryReportsSinceMidnightResponse setBody(ListAgentSummaryReportsSinceMidnightResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentSummaryReportsSinceMidnightResponseBody getBody() {
        return this.body;
    }

}
