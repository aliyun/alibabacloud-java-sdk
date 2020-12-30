// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentSummaryReportsByIntervalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAgentSummaryReportsByIntervalResponseBody body;

    public static ListAgentSummaryReportsByIntervalResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentSummaryReportsByIntervalResponse self = new ListAgentSummaryReportsByIntervalResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentSummaryReportsByIntervalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentSummaryReportsByIntervalResponse setBody(ListAgentSummaryReportsByIntervalResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentSummaryReportsByIntervalResponseBody getBody() {
        return this.body;
    }

}
