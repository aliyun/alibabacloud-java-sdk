// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlAnalysisReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSqlAnalysisReportResponseBody body;

    public static GetSqlAnalysisReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlAnalysisReportResponse self = new GetSqlAnalysisReportResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlAnalysisReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlAnalysisReportResponse setBody(GetSqlAnalysisReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlAnalysisReportResponseBody getBody() {
        return this.body;
    }

}
