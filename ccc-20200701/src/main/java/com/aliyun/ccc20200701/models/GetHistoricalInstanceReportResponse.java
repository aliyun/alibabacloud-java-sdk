// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalInstanceReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHistoricalInstanceReportResponseBody body;

    public static GetHistoricalInstanceReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalInstanceReportResponse self = new GetHistoricalInstanceReportResponse();
        return TeaModel.build(map, self);
    }

    public GetHistoricalInstanceReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHistoricalInstanceReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHistoricalInstanceReportResponse setBody(GetHistoricalInstanceReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHistoricalInstanceReportResponseBody getBody() {
        return this.body;
    }

}
