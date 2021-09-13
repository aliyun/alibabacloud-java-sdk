// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListHistoricalAgentReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHistoricalAgentReportResponseBody body;

    public static ListHistoricalAgentReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalAgentReportResponse self = new ListHistoricalAgentReportResponse();
        return TeaModel.build(map, self);
    }

    public ListHistoricalAgentReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHistoricalAgentReportResponse setBody(ListHistoricalAgentReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHistoricalAgentReportResponseBody getBody() {
        return this.body;
    }

}
