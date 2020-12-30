// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetCallMeasureSummaryReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCallMeasureSummaryReportResponseBody body;

    public static GetCallMeasureSummaryReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCallMeasureSummaryReportResponse self = new GetCallMeasureSummaryReportResponse();
        return TeaModel.build(map, self);
    }

    public GetCallMeasureSummaryReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCallMeasureSummaryReportResponse setBody(GetCallMeasureSummaryReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCallMeasureSummaryReportResponseBody getBody() {
        return this.body;
    }

}
