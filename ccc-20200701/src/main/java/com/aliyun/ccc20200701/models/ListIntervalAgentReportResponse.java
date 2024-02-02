// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListIntervalAgentReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntervalAgentReportResponseBody body;

    public static ListIntervalAgentReportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntervalAgentReportResponse self = new ListIntervalAgentReportResponse();
        return TeaModel.build(map, self);
    }

    public ListIntervalAgentReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntervalAgentReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntervalAgentReportResponse setBody(ListIntervalAgentReportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntervalAgentReportResponseBody getBody() {
        return this.body;
    }

}
