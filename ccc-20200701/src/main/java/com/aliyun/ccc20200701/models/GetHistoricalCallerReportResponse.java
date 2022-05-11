// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalCallerReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHistoricalCallerReportResponseBody body;

    public static GetHistoricalCallerReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalCallerReportResponse self = new GetHistoricalCallerReportResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoricalCallerReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoricalCallerReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoricalCallerReportResponse setBody(GetHistoricalCallerReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoricalCallerReportResponseBody getBody() {
        return this.body;
    }

}
