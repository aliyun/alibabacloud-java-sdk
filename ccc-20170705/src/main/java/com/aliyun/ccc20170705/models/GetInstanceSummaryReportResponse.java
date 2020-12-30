// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceSummaryReportResponseBody body;

    public static GetInstanceSummaryReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryReportResponse self = new GetInstanceSummaryReportResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceSummaryReportResponse setBody(GetInstanceSummaryReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceSummaryReportResponseBody getBody() {
        return this.body;
    }

}
