// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallMeasureSummaryReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCallMeasureSummaryReportsResponseBody body;

    public static ListCallMeasureSummaryReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallMeasureSummaryReportsResponse self = new ListCallMeasureSummaryReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListCallMeasureSummaryReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallMeasureSummaryReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCallMeasureSummaryReportsResponse setBody(ListCallMeasureSummaryReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallMeasureSummaryReportsResponseBody getBody() {
        return this.body;
    }

}
