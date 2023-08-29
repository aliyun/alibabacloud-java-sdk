// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StatisticsListByTypeReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StatisticsListByTypeReportResponseBody body;

    public static StatisticsListByTypeReportResponse build(java.util.Map<String, ?> map) throws Exception {
        StatisticsListByTypeReportResponse self = new StatisticsListByTypeReportResponse();
        return TeaModel.build(map, self);
    }

    public StatisticsListByTypeReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StatisticsListByTypeReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StatisticsListByTypeReportResponse setBody(StatisticsListByTypeReportResponseBody body) {
        this.body = body;
        return this;
    }
    public StatisticsListByTypeReportResponseBody getBody() {
        return this.body;
    }

}
