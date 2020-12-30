// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallMeasureSummaryReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListCallMeasureSummaryReportsResponse setBody(ListCallMeasureSummaryReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallMeasureSummaryReportsResponseBody getBody() {
        return this.body;
    }

}
