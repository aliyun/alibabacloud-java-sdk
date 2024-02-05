// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StatisticsReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StatisticsReportResponseBody body;

    public static StatisticsReportResponse build(java.util.Map<String, ?> map) throws Exception {
        StatisticsReportResponse self = new StatisticsReportResponse();
        return TeaModel.build(map, self);
    }

    public StatisticsReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StatisticsReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StatisticsReportResponse setBody(StatisticsReportResponseBody body) {
        this.body = body;
        return this;
    }
    public StatisticsReportResponseBody getBody() {
        return this.body;
    }

}
